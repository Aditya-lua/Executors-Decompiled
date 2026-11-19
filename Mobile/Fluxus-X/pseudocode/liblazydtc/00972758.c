/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00972758
 */

/* ix::HttpClient::setForceBody(bool) */

void __thiscall ix::HttpClient::setForceBody(HttpClient *this,bool param_1)

{
  this[0x158] = (HttpClient)param_1;
  return;
}

