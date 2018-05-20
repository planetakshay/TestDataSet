package com.test.data.state;

import org.testng.annotations.DataProvider;

public class ValidAddressInEachState {
	@DataProvider(name = "Valid Address In All States")
	public Object[][] validAddressInAllStates() {
		return new Object[][] {
				{"500 Margaret Dr, Tuscaloosa, AL 35401"},
				{"3211 Providence Drive, Anchorage, AK 99508"},
				{"1110 W. Washington Street Suite 155, Phoenix, AZ 85007"},
				{"2301 E Meandering Way, Fayetteville, AR 72701"},
				{"9500 Gilman Dr, La Jolla, CA 92093"},
				{"1386 Tennyson St, Denver, CO 80204"},
				{"755 Main Street, Hartford, CT 06103"},
				{"15 Gemstone Blvd, Dover, DE 19904"},
				{"8000 Napoleon St, Orlando, FL 32825"},
				{"100 Peachtree St, NW Atlanta, GA 30303"},
				{"2223 Hoonee Pl, Honolulu, HI 96819"},
				{"875 Perimeter Dr, Moscow, ID 83844"},
				{"620 E. Adams, Springfield, IL 62701"},
				{"107 S Indiana Ave, Bloomington, IN 47405"},
				{"410 E. Washington Street,  Iowa City, IA  52240"},
				{"1116 Mid-Campus Drive, North Manhattan, KS 66506"},
				{"1303 US 127 South, Frankfort, KY 40601"},
				{"7211 Corporate Blvd, Baton Rouge, LA 70809"},
				{"274 Western Ave, Augusta, ME 04330"},
				{"217 Redwood St,Baltimore, MD 21202"},
				{"430 William F McClellan Hwy, East Boston, MA 02128"},
				{"300 N. Washington Sq,Lansing, MI 48913"},
				{"615 Washington Ave SE, Minneapolis, MN 55414"},
				{"651 Grove Loop, Oxford, MS 38655"},
				{"735 W Stadium Blvd, Jefferson City, MO 65109"},
				{"611 N Montana Ave, Helena, MT 59601"},
				{"1400 R St, Lincoln, NE 68588"},
				{"1664 N Virginia St, Reno, NV 89557"},
				{"105 Main St, Durham, NH 03824"},
				{"100 Nassau St, Princeton, NJ 08542"},
				{"3899 Cerrillos Rd, Santa Fe, NM 87507"},
				{"1 Lomb Memorial Dr, Rochester, NY 14623"},
				{"301 N. Wilmington St,Raleigh, NC 27601"},
				{"600 E Boulevard Ave, Bismarck, ND 58505"},
				{"1782 N High St, Columbus, OH 43201"},
				{"2300 N Lincoln Blvd, Oklahoma City, OK 73105"},
				{"1800 SW 6th Ave #101, Portland, OR 97201"},
				{"3460 William Penn Hwy, Pittsburgh, PA 15235"},
				{"45 Upper College Rd, Kingston, RI 02881"},
				{"650 Lincoln St, Columbia, SC 29201"},
				{"414 E Clark St, Vermillion, SD 57069"},
				{"3500 John A Merritt Blvd, Nashville, TN 37209"},
				{"701 S Nedderman Dr, Arlington, TX 76019"},
				{"0160 Old Main Hill,Logan, UT 84322"},
				{"52 Evergreen Cir, Colchester, VT 05446"},
				{"901 E. Byrd St.,Richmond, VA 23219"},
				{"1 Microsoft Way, Redmond, WA 98052"},
				{"2101 Washington St., E. Charleston, WV 25305"},
				{"1 E Main St, Madison, WI 53703"},
				{"1000 E University Ave, Laramie, WY 82071"}
		};
	}

}
