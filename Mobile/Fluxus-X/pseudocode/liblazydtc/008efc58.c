/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008efc58
 */

/* cpr::Session::Download(std::__ndk1::basic_ofstream<char, std::__ndk1::char_traits<char> >&) */

void cpr::Session::Download(basic_ofstream *param_1)

{
  undefined4 uVar1;
  
  curl_easy_setopt(**(undefined8 **)(param_1 + 0x18),0x2c,0);
  curl_easy_setopt(**(undefined8 **)(param_1 + 0x18),0x50,1);
  curl_easy_setopt(**(undefined8 **)(param_1 + 0x18),0x4e2b,util::writeFileFunction);
  curl_easy_setopt(**(undefined8 **)(param_1 + 0x18),0x2711);
  curl_easy_setopt(**(undefined8 **)(param_1 + 0x18),0x2734,0);
  prepareCommonDownload();
  if (*(long *)(param_1 + 0x2a0) == 0) {
    uVar1 = DoEasyPerform((Session *)param_1);
    CompleteDownload(param_1,uVar1);
    return;
  }
  intercept();
  return;
}

