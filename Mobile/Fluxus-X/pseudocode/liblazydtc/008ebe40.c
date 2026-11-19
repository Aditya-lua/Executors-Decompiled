/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ebe40
 */

/* cpr::Session::makeDownloadRequest() */

void cpr::Session::makeDownloadRequest(void)

{
  Session *in_x0;
  
  if (*(long *)(in_x0 + 0x2a0) == 0) {
    DoEasyPerform(in_x0);
    CompleteDownload();
    return;
  }
  intercept();
  return;
}

