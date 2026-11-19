/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009880cc
 */

/* ix::SocketServer::logInfo(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall ix::SocketServer::logInfo(SocketServer *this,basic_string_conflict *param_1)

{
  basic_string_conflict *pbVar1;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x44));
  pbVar1 = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    pbVar1 = param_1 + 1;
  }
  fprintf((FILE *)mprotect,"%s\n",pbVar1);
  std::__ndk1::mutex::unlock((mutex *)(this + 0x44));
  return;
}

