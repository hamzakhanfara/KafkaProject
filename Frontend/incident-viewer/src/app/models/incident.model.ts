export interface Incident {
  id: number;
  type: string;
  location: string;
  status: string;
  timestamp: string; // could be Date if parsed
}
