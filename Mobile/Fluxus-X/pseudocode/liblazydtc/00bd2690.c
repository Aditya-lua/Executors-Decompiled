/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2690
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::in_avail() */

long __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::in_avail
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  long lVar1;
  
  if (*(ulong *)(this + 0x18) < *(ulong *)(this + 0x20)) {
    return (long)(*(ulong *)(this + 0x20) - *(ulong *)(this + 0x18)) >> 2;
  }
                    /* WARNING: Could not recover jumptable at 0x00bd26b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  lVar1 = (**(code **)(*(long *)this + 0x38))();
  return lVar1;
}

