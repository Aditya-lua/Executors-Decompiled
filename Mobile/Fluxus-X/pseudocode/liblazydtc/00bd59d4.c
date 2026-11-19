/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd59d4
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::swap(std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t> >&) */

void __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::swap
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,basic_ostream *param_1)

{
  ios_base *this_00;
  ios_base *piVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  
  this_00 = (ios_base *)(this + *(long *)(*(long *)this + -0x18));
  piVar1 = (ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18));
  ios_base::swap(this_00,piVar1);
  uVar4 = *(undefined8 *)(this_00 + 0x88);
  uVar2 = *(undefined4 *)(piVar1 + 0x90);
  *(undefined8 *)(this_00 + 0x88) = *(undefined8 *)(piVar1 + 0x88);
  uVar3 = *(undefined4 *)(this_00 + 0x90);
  *(undefined8 *)(piVar1 + 0x88) = uVar4;
  *(undefined4 *)(this_00 + 0x90) = uVar2;
  *(undefined4 *)(piVar1 + 0x90) = uVar3;
  return;
}

