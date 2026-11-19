/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2c8c
 */

/* cpr::Session::SetOption(cpr::ReadCallback const&) */

void cpr::Session::SetOption(ReadCallback *param_1)

{
  ReadCallback *in_x1;
  
  SetReadCallback((Session *)param_1,in_x1);
  return;
}

