/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be902c
 */

/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::__get_weekdayname(int&, std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> >&, std::__ndk1::istreambuf_iterator<char,
   std::__ndk1::char_traits<char> >, unsigned int&, std::__ndk1::ctype<char> const&) const */

void __thiscall
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
__get_weekdayname(time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                  *this,int *param_1,undefined8 param_2,undefined8 param_4,undefined8 param_5,
                 undefined8 param_6)

{
  undefined1 auVar1 [16];
  long lVar2;
  long lVar3;
  
  lVar2 = (*(code *)**(undefined8 **)(this + 0x10))();
  lVar3 = FUN_00bda608(param_2,param_4,lVar2,lVar2 + 0x150,param_6,param_5,0);
  if (lVar3 - lVar2 < 0x150) {
    lVar2 = (lVar3 - lVar2 >> 3) * -0x5555555555555555;
    auVar1 = SEXT816(lVar2) * SEXT816(0x4924924924924925);
    *param_1 = (int)lVar2 + ((int)(auVar1._8_8_ >> 1) - (auVar1._12_4_ >> 0x1f)) * -7;
  }
  return;
}

