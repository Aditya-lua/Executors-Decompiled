/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd26b8
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::snextc() */

ulong __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::snextc
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  int *piVar1;
  int iVar2;
  ulong uVar3;
  
  piVar1 = *(int **)(this + 0x18);
  if (piVar1 == *(int **)(this + 0x20)) {
    iVar2 = (**(code **)(*(long *)this + 0x50))();
  }
  else {
    iVar2 = *piVar1;
    *(int **)(this + 0x18) = piVar1 + 1;
  }
  if (iVar2 == -1) {
    uVar3 = 0xffffffff;
  }
  else {
    if (*(uint **)(this + 0x18) == *(uint **)(this + 0x20)) {
                    /* WARNING: Could not recover jumptable at 0x00bd2740. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar3 = (**(code **)(*(long *)this + 0x48))();
      return uVar3;
    }
    uVar3 = (ulong)**(uint **)(this + 0x18);
  }
  return uVar3;
}

