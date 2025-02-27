import React from 'react';

type Media = {
    id: number;
    title: string;
    releaseYear: number;
    genre: string;
    imdbId: string; // Add this
  };
  
  const MediaCard: React.FC<{ media: Media }> = ({ media }) => {
    return (
      <div className="border p-4 rounded-lg shadow-md">
        <h3 className="text-xl font-bold">{media.title}</h3>
        <p>{media.releaseYear} • {media.genre}</p>
        <a 
          href={`https://www.imdb.com/title/${media.imdbId}`} 
          className="text-blue-500 hover:underline"
        >
          IMDb Link
        </a>
      </div>
    );
    
  };