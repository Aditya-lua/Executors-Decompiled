/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2c98
 */

/* cpr::Session::SetOption(cpr::ProgressCallback const&) */

void cpr::Session::SetOption(ProgressCallback *param_1)

{
  ProgressCallback *in_x1;
  
  SetProgressCallback((Session *)param_1,in_x1);
  return;
}

