/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008efbec
 */

/* cpr::Session::PrepareDownload(cpr::WriteCallback const&) */

void __thiscall cpr::Session::PrepareDownload(Session *this,WriteCallback *param_1)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2c,0);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x50,1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2734,0);
  SetWriteCallback(this,param_1);
  prepareCommonDownload();
  return;
}

