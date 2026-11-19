/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2c94
 */

/* cpr::Session::SetOption(cpr::WriteCallback const&) */

void cpr::Session::SetOption(WriteCallback *param_1)

{
  WriteCallback *in_x1;
  
  SetWriteCallback((Session *)param_1,in_x1);
  return;
}

