/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc5a4
 */

/* std::__ndk1::ctype<wchar_t>::do_scan_is(unsigned long, wchar_t const*, wchar_t const*) const */

void __thiscall
std::__ndk1::ctype<wchar_t>::do_scan_is
          (ctype<wchar_t> *this,ulong param_1,wchar_t *param_2,wchar_t *param_3)

{
  while ((param_2 != param_3 &&
         ((0x7f < (uint)*param_2 ||
          ((*(ulong *)(&DAT_0078a8e8 + (ulong)(uint)*param_2 * 8) & param_1) == 0))))) {
    param_2 = param_2 + 1;
  }
  return;
}

