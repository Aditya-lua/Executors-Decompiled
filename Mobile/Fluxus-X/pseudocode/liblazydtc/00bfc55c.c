/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfc55c
 */

/* std::__ndk1::ctype<wchar_t>::do_is(wchar_t const*, wchar_t const*, unsigned long*) const */

void __thiscall
std::__ndk1::ctype<wchar_t>::do_is
          (ctype<wchar_t> *this,wchar_t *param_1,wchar_t *param_2,ulong *param_3)

{
  ulong uVar1;
  
  for (; param_1 != param_2; param_1 = param_1 + 1) {
    if ((uint)*param_1 < 0x80) {
      uVar1 = *(ulong *)(&DAT_0078a8e8 + (ulong)(uint)*param_1 * 8);
    }
    else {
      uVar1 = 0;
    }
    *param_3 = uVar1;
    param_3 = param_3 + 1;
  }
  return;
}

