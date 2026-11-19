/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3200
 */

/* cpr::Session::SetOption(cpr::SslOptions const&) */

void cpr::Session::SetOption(SslOptions *param_1)

{
  SslOptions *in_x1;
  
  SetSslOptions((Session *)param_1,in_x1);
  return;
}

