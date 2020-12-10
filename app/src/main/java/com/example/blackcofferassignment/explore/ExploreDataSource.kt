package com.example.blackcofferassignment.explore

import com.example.blackcofferassignment.R

class ExploreDataSource {
    companion object{
        fun createExploreData():ArrayList<ExploreData>{
            val list=ArrayList<ExploreData>()
            list.add(
                ExploreData(
                    R.drawable.image,
                    "Bill Gates",
                    "Microsoft,Co founder",
                    "I’m excited to join the @khanacademy " +
                            "Daily Homeroom today to talk about the incredible ways parents, " +
                            "teachers, and students are coming together to keep learning while " +
                            "schools are closed.Quote Tweet",
                    "#billgates #coronavirus #trending"
                )
            )
            list.add(
                ExploreData(
                    R.drawable.image1,
                    "Jim Roberts",
                    "Arc Vive Ltd, CEO",
                    "The Doctor said he needed to cut the finger to remove the ring. " +
                            "The Goldsmith said he needed to cut the ring to remove it. " +
                            "What did the Engineer do? #tech via Perorationer #technology ",
                    "#technology #tech"
                )
            )
            list.add(
                ExploreData(
                    R.drawable.image2,
                    "Ellen Michelle",
                    "Arc Vive Ltd, CEO",
                    "China keeps advancing in designing CPU, the computer brain. While it's " +
                            "still behind Intel and AMD, this is something no other country outside " +
                            "the US has achieved so far. Within 2-3 years, Chinese companies will be" +
                            " leading the world. #technology",
                    "#china #coronavirus #technical"
                )
            )
            list.add(
                ExploreData(
                    R.drawable.image3,
                    "Ellen Michelle",
                    "Arc Vive Ltd, CEO",
                    "The internal working of the famous WWII Enigma machine have finally been " +
                            "revealed. (Seeker) #Technology #Encryption",
                    "#computers #coronavirus #trending"
                )
            )
            return list
        }
    }
}