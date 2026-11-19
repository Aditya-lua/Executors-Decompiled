/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be9400
 */

/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::__get_year(int&, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >&,
   std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, unsigned int&,
   std::__ndk1::ctype<char> const&) const */

void __thiscall
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
__get_year(undefined8 param_1_00,int *param_1,undefined8 param_2,undefined8 param_4,byte *param_5,
          undefined8 param_6)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  
  uVar3 = FUN_00bea2fc(param_2,param_4,param_5,param_6,4);
  if ((*param_5 >> 2 & 1) == 0) {
    uVar1 = uVar3 + 0x76c;
    if (99 < uVar3) {
      uVar1 = uVar3;
    }
    uVar2 = uVar3 + 2000;
    if (0x44 < (int)uVar3) {
      uVar2 = uVar1;
    }
    *param_1 = uVar2 - 0x76c;
  }
  return;
}

