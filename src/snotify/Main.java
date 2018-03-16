package snotify;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GlobalPosition;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;


public class Main {

	private static ArrayList<PublicTransportation> pt;
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new FileReader("C:\\Users\\John\\Desktop\\vast.txt"));
		String id = scan.nextLine();
		id = id.substring(id.indexOf(" ")+1);
		String secret = scan.nextLine();
		secret = secret.substring(secret.indexOf(" ")+1);
		scan.close();
		Token token = new Token(id, secret);
		DepartureBoard dep = new DepartureBoard(token);
		

		
		/* Kod f�r att f� ut alla linjer fr�n en station, alla veckodagar*/
//		for(int i = 5; i <= 11; i++) {
//			
//			if(day>=10) {
//				date = date.substring(0, date.length()-2)+day;
//				dep.setDate(date);
//			}
//			else {
//				date = date.substring(0, date.length()-1)+day;
//				dep.setDate(date);
//			}
//			
//			JSONObject obj = dep.executeRequest();
//			JSONArray arr = null;
//			if(obj != null) {
//				try {
//					arr = obj.getJSONArray("Departure");
//				}catch(Exception e) {
//					obj = obj.getJSONObject("Departure");
//				}
//			}
//			
//			if(arr != null) {
//				for(int j = 0; j < arr.length(); j ++) {
//					JSONObject tempObj = arr.getJSONObject(j);
//					if(!tempObj.has("booking")) {
//						PublicTransportation temp = new PublicTransportation(tempObj.get("sname").toString(), tempObj.get("name").toString(), tempObj.get("journeyid").toString(), tempObj.get("JourneyDetailRef").toString());
//						addPT(temp,date);
//					}
//				}
//			}
//			else if(obj != null) {
//				if(!obj.has("booking")) {
//					PublicTransportation temp = new PublicTransportation(obj.get("sname").toString(), obj.get("name").toString(), obj.get("journeyid").toString(), obj.get("JourneyDetailRef").toString());
//					addPT(temp,date);
//				}
//			}
//			
//			day++;
//		}
//		
//		PrintWriter writer = new PrintWriter("linjerkba.txt");
//		writer.print("Typ ; "+"Linje ; "+"JourneyID ; "+"Dagar ; "+"JourneyIDRef");
//		for(PublicTransportation a : pt) {
//			writer.println();
//			writer.print(a.getType());
//			writer.print(" ; "+a.getLinje());
//			writer.print(" ; "+a.getJourneyid()+" ; ");
//			ArrayList<String> days = a.getDays();
//			for(int i = 0; i < days.size(); i++) {
//				if(i==0)
//					writer.print(days.get(i));
//				else 
//					writer.print(", "+days.get(i));
//			}
//			writer.print(" ; "+a.getJourneyDetailRef());
//		}
		
		
//		JSONObject obj = dep.executeRequest();
//		JSONArray arr = null;
//		if(obj != null) {
//			try {
//				arr = obj.getJSONArray("Departure");
//			}catch(Exception e) {
//				obj = obj.getJSONObject("Departure");
//			}
//		}
//		else {
//			System.out.println("No objects!");
//		}
//		
//		if(arr != null) {
//			for(int i = 0; i < arr.length(); i ++)
//				System.out.println(arr.getJSONObject(i).toString());
//		}
//		else if(obj != null) {
//			System.out.println(obj.toString());
//		}
		
	
		
		
		
		
		
		//Brunnsparken 9021014001760000
		//GBG C 9021014008000000
		//KBA 9021014019351000
//		DepartureBoard dep = new DepartureBoard(token);
//		dep.setStartId("9021014008000000");
//		dep.setTime("00:00");
//		dep.setUseLongDistanceTrain(false);
//		dep.setUseRegionalTrain(false);
//		dep.setUseBus(false);
//		dep.setDate("2018-03-16");
//		dep.setTimeSpan(1440);
//		dep.executeRequest();
	

		
//		JourneyDetail a = new JourneyDetail(token, "https://api.vasttrafik.se/bin/rest.exe/v2/journeyDetail?ref=240843%2F87851%2F871318%2F355378%2F80%3Fdate%3D2018-03-16%26station_evaId%3D8000016%26station_type%3Ddep%26format%3Djson%26");
//		JourneyDetail b = new JourneyDetail(token, "https://api.vasttrafik.se/bin/rest.exe/v2/journeyDetail?ref=107085%2F43309%2F713784%2F321197%2F80%3Fdate%3D2018-03-16%26station_evaId%3D8000010%26station_type%3Ddep%26format%3Djson%26");
//		JourneyDetail c = new JourneyDetail(token, "https://api.vasttrafik.se/bin/rest.exe/v2/journeyDetail?ref=807459%2F289632%2F45892%2F246207%2F80%3Fdate%3D2018-03-16%26station_evaId%3D8000002%26station_type%3Ddep%26format%3Djson%26");
//		PublicTransportation apt = new PublicTransportation(a);
//		PublicTransportation bpt = new PublicTransportation(b);
//		PublicTransportation cpt = new PublicTransportation(c);
		
		
		System.out.println(token.getAccessToken());
		
//		Timer timerA = new Timer();
//		timerA.schedule(new CheckJourney(apt), getDate(apt),30*1000);
//		Timer timerB = new Timer();
//		timerB.schedule(new CheckJourney(bpt), getDate(bpt),30*1000);
//		Timer timerC = new Timer();
//		timerC.schedule(new CheckJourney(cpt), getDate(cpt),30*1000);
		

		
//		Scanner scan = new Scanner(new FileReader("C:\\Users\\John\\workspace\\snotify\\allstops3.txt"));
//		String trimmedstring = "";
//		while(scan.hasNext())
//			trimmedstring = trimmedstring + scan.next();
//		scan.close();
//		
//		JSONArray arr = new JSONObject(trimmedstring).getJSONArray("StopLocation");
//		JSONArray noDuplicates = new JSONArray();
//		
//		for(int i = 0; i < arr.length(); i++) {
//			JSONObject obj = arr.getJSONObject(i);
//			Boolean exist = false;
//			for(int j = 0; j < noDuplicates.length(); j++) {
//				JSONObject noDobj = noDuplicates.getJSONObject(i);
//				if(obj.get("name").toString().equals(noDobj.get("name").toString())) {
//					exist = true;
//					break;
//				}
//			}
//			if(!exist) {
//				noDuplicates.put(arr.getJSONObject(i));
//			}
//		}
//		NearbyStops nearAdd = new NearbyStops(token);
//		nearAdd.setCoordLat("57.489536");
//		nearAdd.setCoordLong("12.0800506");

		
//		JSONArray arr = dep.executeRequest();
//		
//		PrintWriter writer2 = new PrintWriter("allstops2.txt");
//		for(int i = 0; i < noDuplicates.length(); i++) {
//			writer2.println(arr.get(i).toString());
//		}
//		writer2.close();
		
		
		
		/* S�lla stationer */
//		Scanner scan = new Scanner(new FileReader("C:\\Users\\John\\workspace\\snotify\\allstops3.txt"));
//		StringBuilder builder = new StringBuilder();
//		while(scan.hasNextLine())
//			builder.append(scan.nextLine());
//		scan.close();
//		String trimmedstring = builder.toString();
//		
//		JSONArray arr = new JSONObject(trimmedstring).getJSONArray("StopLocation");
//		JSONArray noDuplicates = new JSONArray();
//		
//		PrintWriter writer2 = new PrintWriter("allstops1.txt");
//		writer2.print("{\"StopLocation\":[");
//		for(int i = 0; i < arr.length(); i++) {
//			JSONObject obj = arr.getJSONObject(i);
//			
//			if(!obj.has("track")) { 
//				if(i != 0)
//					writer2.print("," + arr.get(i).toString());
//				else
//					writer2.print(arr.get(i).toString());
//			}
//		}
//		writer2.print("]}");
//		writer2.close();
		
	}
	
	private static void addPT(PublicTransportation toBeChecked, String date) {
		
		for(PublicTransportation a : pt) {
			if(a.compareTo(toBeChecked)) {
				a.setWeekdayDay(date);
				return;
			}
		}
		toBeChecked.setWeekdayDay(date);
		pt.add(toBeChecked);
	}
	
	public static double calcDistance(JSONArray geometry) {
		GeodeticCalculator geoCalc = new GeodeticCalculator();
		Ellipsoid reference = Ellipsoid.WGS84;  
		double distance = 0;
		for(int i = 0; i < geometry.length()-1; i++) {
			JSONObject temp = geometry.getJSONObject(i);
			JSONObject temp2 = geometry.getJSONObject(i+1);
			GlobalPosition pointA = new GlobalPosition(temp.getDouble("lat"), temp.getDouble("lon"), 0.0); // Point A
			GlobalPosition userPos = new GlobalPosition(temp2.getDouble("lat"), temp2.getDouble("lon"), 0.0); // Point B
			distance += geoCalc.calculateGeodeticCurve(reference, userPos, pointA).getEllipsoidalDistance(); // Distance between Point A and Point B
		}
		return distance;
	}
	
	public static int calcJourneyTime(JSONArray journeystops) {
		String timeStart = journeystops.getJSONObject(0).getString("depTime");
		String timeFinish = journeystops.getJSONObject(journeystops.length()-1).getString("arrTime");
		
		if(journeystops.getJSONObject(0).get("depDate").toString()
				.equals(journeystops.getJSONObject(journeystops.length()-1).get("arrDate").toString())) {
			int hours = Integer.parseInt(timeFinish.substring(0, 2)) - Integer.parseInt(timeStart.substring(0,2));
			int minutes = Integer.parseInt(timeFinish.substring(3, 5)) - Integer.parseInt(timeStart.substring(3,5));
			return (hours*60)+minutes;
		}
		else {
			int beforeMidnight = ((24 - Integer.parseInt(timeStart.substring(0, 2)))*60) - Integer.parseInt(timeStart.substring(3,5));
			int afterMidnight = Integer.parseInt(timeFinish.substring(0, 2))*60 + Integer.parseInt(timeFinish.substring(3,5));
			return beforeMidnight + afterMidnight;
		}
	}
	
	public static Date getDate(PublicTransportation pt) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(Integer.parseInt(pt.getDate().substring(0, 4)), Integer.parseInt(pt.getDate().substring(5,7))-1,
				Integer.parseInt(pt.getDate().substring(8,10)), Integer.parseInt(pt.getStartTime().substring(0,2))
				, Integer.parseInt(pt.getStartTime().substring(3,5)), 00);
		return cal.getTime(); 
	}
	

}
