/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f31cc
 */

/* cpr::Session::SetOption(cpr::UnixSocket const&) */

void __thiscall cpr::Session::SetOption(Session *this,UnixSocket *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar2 = **(undefined8 **)(this + 0x18);
  uVar1 = UnixSocket::GetUnixSocketString(param_1);
  curl_easy_setopt(uVar2,0x27f7,uVar1);
  return;
}

