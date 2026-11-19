/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce810
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::in_avail() */

long __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::in_avail
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this)

{
  long lVar1;
  
  if (*(ulong *)(this + 0x18) < *(ulong *)(this + 0x20)) {
    return *(ulong *)(this + 0x20) - *(ulong *)(this + 0x18);
  }
                    /* WARNING: Could not recover jumptable at 0x00bce830. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  lVar1 = (**(code **)(*(long *)this + 0x38))();
  return lVar1;
}

