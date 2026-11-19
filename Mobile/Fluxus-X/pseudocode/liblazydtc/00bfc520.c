/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc520
 */

/* std::__ndk1::ctype<wchar_t>::do_is(unsigned long, wchar_t) const */

bool __thiscall
std::__ndk1::ctype<wchar_t>::do_is(ctype<wchar_t> *this,ulong param_1,wchar_t param_2)

{
  if ((uint)param_2 < 0x80) {
    return (*(ulong *)(&DAT_0078a8e8 + (ulong)(uint)param_2 * 8) & param_1) != 0;
  }
  return false;
}

