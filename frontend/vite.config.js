import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  root: 'src',
    build: {
        outDir: '../dist',
        sourcemap: true
    },
    server: {
      proxy: {
        '/api': 'http://localhost:8080'
      }
    },
    define: {
      "__API_URL__": "'http://localhost:8080'"
    },
    plugins: [
        react({
          // Use React plugin in all *.jsx and *.tsx files
          include: '**/*.{jsx,tsx}',
        }),
    ],
})
