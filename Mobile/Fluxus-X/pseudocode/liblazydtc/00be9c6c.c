/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be9c6c
 */

/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::__get_month(int&, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >&,
   std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, unsigned int&,
   std::__ndk1::ctype<char> const&) const */

void __thiscall
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
__get_month(undefined8 param_1_00,uint *param_1,undefined8 param_2,undefined8 param_4,uint *param_5,
           undefined8 param_6)

{
  int iVar1;
  
  iVar1 = FUN_00bea2fc(param_2,param_4,param_5,param_6,2);
  if ((iVar1 - 1U < 0xc) && ((*param_5 >> 2 & 1) == 0)) {
    *param_1 = iVar1 - 1U;
  }
  else {
    *param_5 = *param_5 | 4;
  }
  return;
}

