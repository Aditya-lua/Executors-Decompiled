/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2814
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::sputc(wchar_t) */

ulong __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::sputc
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t param_1)

{
  wchar_t *pwVar1;
  ulong uVar2;
  
  pwVar1 = *(wchar_t **)(this + 0x30);
  if (pwVar1 == *(wchar_t **)(this + 0x38)) {
                    /* WARNING: Could not recover jumptable at 0x00bd2844. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (**(code **)(*(long *)this + 0x68))(this);
    return uVar2;
  }
  *pwVar1 = param_1;
  *(wchar_t **)(this + 0x30) = pwVar1 + 1;
  return (ulong)(uint)param_1;
}

