/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008efd28
 */

/* cpr::Session::PrepareDownload(std::__ndk1::basic_ofstream<char, std::__ndk1::char_traits<char>
   >&) */

void __thiscall cpr::Session::PrepareDownload(Session *this,basic_ofstream *param_1)

{
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2c,0);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x50,1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x4e2b,util::writeFileFunction);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2711,param_1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2734,0);
  prepareCommonDownload();
  return;
}

