/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3044
 */

/* cpr::Session::SetOption(cpr::Redirect const&) */

void cpr::Session::SetOption(Redirect *param_1)

{
  Redirect *in_x1;
  
  SetRedirect((Session *)param_1,in_x1);
  return;
}

