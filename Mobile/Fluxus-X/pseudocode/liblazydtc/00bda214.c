/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bda214
 */

/* std::__ndk1::collate<wchar_t>::do_compare(wchar_t const*, wchar_t const*, wchar_t const*, wchar_t
   const*) const */

ulong __thiscall
std::__ndk1::collate<wchar_t>::do_compare
          (collate<wchar_t> *this,wchar_t *param_1,wchar_t *param_2,wchar_t *param_3,
          wchar_t *param_4)

{
  while( true ) {
    if (param_3 == param_4) {
      return (ulong)(param_1 != param_2);
    }
    if (param_1 == param_2) {
      return 0xffffffff;
    }
    if ((uint)*param_1 < (uint)*param_3) {
      return 0xffffffff;
    }
    if ((uint)*param_3 < (uint)*param_1) break;
    param_3 = param_3 + 1;
    param_1 = param_1 + 1;
  }
  return 1;
}

