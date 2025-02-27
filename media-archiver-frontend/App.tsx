// import { useEffect, useState } from 'react';
// import MediaCard from './components/MediaCard';
// import axios from 'axios';
// import React from 'react';


// interface Media {
//   id: number;
//   title: string;
//   releaseYear: number;
//   genre: string;
//   mediaType: string;
// }

// function App() {
//   const [mediaList, setMediaList] = useState<Media[]>([]);

//   useEffect(() => {
//     axios.get('http://localhost:8080/api/media')
//       .then(response => setMediaList(response.data))
//       .catch(error => console.error(error));
//   }, []);

//   return (
//     <div className="container mx-auto p-4">
//       <h1 className="text-3xl font-bold mb-6">Media Archive</h1>
//       <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
//         {mediaList.map(media => (
//           <MediaCard key={media.id} media={media} />
//         ))}
//       </div>
//     </div>
//   );
// }

// export default App;