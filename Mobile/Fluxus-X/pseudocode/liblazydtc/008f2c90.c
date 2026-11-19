/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2c90
 */

/* cpr::Session::SetOption(cpr::HeaderCallback const&) */

void cpr::Session::SetOption(HeaderCallback *param_1)

{
  HeaderCallback *in_x1;
  
  SetHeaderCallback((Session *)param_1,in_x1);
  return;
}

