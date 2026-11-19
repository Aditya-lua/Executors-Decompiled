/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3048
 */

/* cpr::Session::SetOption(cpr::Cookies const&) */

void cpr::Session::SetOption(Cookies *param_1)

{
  Cookies *in_x1;
  
  SetCookies((Session *)param_1,in_x1);
  return;
}

