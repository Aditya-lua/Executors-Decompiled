/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcec8c
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::swap(std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >&) */

void __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::swap
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,basic_istream *param_1)

{
  ios_base *this_00;
  ios_base *piVar1;
  long lVar2;
  long lVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined8 uVar6;
  
  lVar2 = *(long *)param_1;
  lVar3 = *(long *)this;
  uVar6 = *(undefined8 *)(this + 8);
  *(undefined8 *)(this + 8) = *(undefined8 *)(param_1 + 8);
  *(undefined8 *)(param_1 + 8) = uVar6;
  this_00 = (ios_base *)(this + *(long *)(lVar3 + -0x18));
  piVar1 = (ios_base *)(param_1 + *(long *)(lVar2 + -0x18));
  ios_base::swap(this_00,piVar1);
  uVar6 = *(undefined8 *)(this_00 + 0x88);
  uVar4 = *(undefined4 *)(piVar1 + 0x90);
  *(undefined8 *)(this_00 + 0x88) = *(undefined8 *)(piVar1 + 0x88);
  uVar5 = *(undefined4 *)(this_00 + 0x90);
  *(undefined8 *)(piVar1 + 0x88) = uVar6;
  *(undefined4 *)(this_00 + 0x90) = uVar4;
  *(undefined4 *)(piVar1 + 0x90) = uVar5;
  return;
}

