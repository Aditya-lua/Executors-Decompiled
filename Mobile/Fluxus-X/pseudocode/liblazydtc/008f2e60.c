/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2e60
 */

/* cpr::Session::SetOption(cpr::Authentication const&) */

void cpr::Session::SetOption(Authentication *param_1)

{
  Authentication *in_x1;
  
  SetAuth((Session *)param_1,in_x1);
  return;
}

