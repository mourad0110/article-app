📱 Articles Android App

An Android application built with XML for the user interface and Java for the backend logic, that displays a list of articles (posts) with images fetched from public APIs.

🚀 Features

📰 Articles Feed
Fetches and displays posts from a REST API.

🖼️ Dynamic Images
Each article is associated with a random image loaded from an image API.

⚡ Splash Screen
A splash screen is shown at app startup to improve user experience and branding.

🌐 API Integration
The app consumes:

Posts API for articles data

Image API for article pictures

📱 Native Android UI
Built using XML layouts following standard Android UI practices.

🔗 APIs Used

Posts API
https://jsonplaceholder.typicode.com/posts

Images API
https://picsum.photos/seed/{id}/200/200

🛠️ Tech Stack

Language: Java

UI: XML

Networking: (e.g., Retrofit / Volley / HttpURLConnection — add what you used)

Architecture: (optional: MVC / MVVM if applicable)

📌 How It Works

The splash screen appears when the app launches.

The app requests posts from the API.

Each post is displayed with a corresponding image generated using its ID.

Data is shown in a list (RecyclerView/ListView).

▶️ Getting Started

Clone the repository

Open in Android Studio

Build and run on an emulator or device
