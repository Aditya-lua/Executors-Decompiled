/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bda324
 */

/* std::__ndk1::collate<wchar_t>::do_hash(wchar_t const*, wchar_t const*) const */

ulong __thiscall
std::__ndk1::collate<wchar_t>::do_hash(collate<wchar_t> *this,wchar_t *param_1,wchar_t *param_2)

{
  ulong uVar1;
  wchar_t *pwVar2;
  ulong uVar3;
  
  if (param_1 == param_2) {
    return 0;
  }
  uVar1 = 0;
  do {
    pwVar2 = param_1 + 1;
    uVar1 = (ulong)(uint)*param_1 + uVar1 * 0x10;
    uVar3 = uVar1 & 0xf000000000000000;
    uVar1 = (uVar3 | uVar3 >> 0x38) ^ uVar1;
    param_1 = pwVar2;
  } while (pwVar2 != param_2);
  return uVar1;
}

