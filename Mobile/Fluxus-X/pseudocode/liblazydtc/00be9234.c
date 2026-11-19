/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be9234
 */

/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::__get_monthname(int&, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   >&, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, unsigned int&,
   std::__ndk1::ctype<char> const&) const */

void __thiscall
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
__get_monthname(time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                *this,int *param_1,undefined8 param_2,undefined8 param_4,undefined8 param_5,
               undefined8 param_6)

{
  int iVar1;
  long lVar2;
  long lVar3;
  
  lVar2 = (**(code **)(*(long *)(this + 0x10) + 8))();
  lVar3 = FUN_00bda608(param_2,param_4,lVar2,lVar2 + 0x240,param_6,param_5,0);
  if (lVar3 - lVar2 < 0x240) {
    lVar2 = (lVar3 - lVar2 >> 3) * -0x5555555555555555;
    iVar1 = (int)(lVar2 >> 0x3f);
    *param_1 = (int)lVar2 + (((uint)((int)(lVar2 / 6) + iVar1) >> 1) - iVar1) * -0xc;
  }
  return;
}

