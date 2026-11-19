/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2c84
 */

/* cpr::Session::SetOption(cpr::Resolve const&) */

void cpr::Session::SetOption(Resolve *param_1)

{
  Resolve *in_x1;
  
  SetResolve((Session *)param_1,in_x1);
  return;
}

