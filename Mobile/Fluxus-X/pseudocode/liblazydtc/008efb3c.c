/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008efb3c
 */

/* cpr::Session::Download(cpr::WriteCallback const&) */

void cpr::Session::Download(WriteCallback *param_1)

{
  undefined4 uVar1;
  WriteCallback *in_x1;
  
  curl_easy_setopt(**(undefined8 **)(param_1 + 0x18),0x2c,0);
  curl_easy_setopt(**(undefined8 **)(param_1 + 0x18),0x50,1);
  curl_easy_setopt(**(undefined8 **)(param_1 + 0x18),0x2734,0);
  SetWriteCallback((Session *)param_1,in_x1);
  prepareCommonDownload();
  if (*(long *)(param_1 + 0x2a0) == 0) {
    uVar1 = DoEasyPerform((Session *)param_1);
    CompleteDownload(param_1,uVar1);
    return;
  }
  intercept();
  return;
}

