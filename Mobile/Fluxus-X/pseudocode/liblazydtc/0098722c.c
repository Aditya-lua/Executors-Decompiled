/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098722c
 */

/* ix::DNSLookup::getErrMsg() */

DNSLookup * __thiscall ix::DNSLookup::getErrMsg(DNSLookup *this)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0x88));
  std::__ndk1::mutex::unlock((mutex *)(this + 0x88));
  return this + 0x70;
}

