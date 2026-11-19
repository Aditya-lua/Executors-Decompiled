/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f3040
 */

/* cpr::Session::SetOption(cpr::Multipart&&) */

void cpr::Session::SetOption(Multipart *param_1)

{
  Multipart *in_x1;
  
  SetMultipart((Session *)param_1,in_x1);
  return;
}

