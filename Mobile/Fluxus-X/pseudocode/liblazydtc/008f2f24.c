/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2f24
 */

/* cpr::Session::SetOption(cpr::Payload const&) */

void cpr::Session::SetOption(Payload *param_1)

{
  Payload *in_x1;
  
  SetPayload((Session *)param_1,in_x1);
  return;
}

