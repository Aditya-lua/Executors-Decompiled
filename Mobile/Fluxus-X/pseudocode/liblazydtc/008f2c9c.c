/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2c9c
 */

/* cpr::Session::SetOption(cpr::DebugCallback const&) */

void cpr::Session::SetOption(DebugCallback *param_1)

{
  DebugCallback *in_x1;
  
  SetDebugCallback((Session *)param_1,in_x1);
  return;
}

