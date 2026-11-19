/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01fe0
 */

/* std::__ndk1::numpunct<wchar_t>::do_falsename() const */

void __thiscall std::__ndk1::numpunct<wchar_t>::do_falsename(numpunct<wchar_t> *this)

{
  wchar_t *pwVar1;
  undefined8 *in_x8;
  
  pwVar1 = operator_new(0x20);
  in_x8[2] = pwVar1;
  pwVar1[4] = L'e';
  pwVar1[5] = L'\0';
  in_x8[1] = 5;
  *in_x8 = 9;
  builtin_wcsncpy(pwVar1,L"fals",4);
  return;
}

