/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be8ed4
 */

/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_get_weekday(std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, std::__ndk1::ios_base&,
   unsigned int&, tm*) const */

undefined8 __thiscall
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_get_weekday(time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
               *this,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5,
              long param_6)

{
  undefined1 auVar1 [16];
  long lVar2;
  long lVar3;
  long local_68;
  undefined8 local_60;
  undefined8 *local_58;
  undefined ***local_50;
  undefined8 **local_48;
  
  local_60 = param_2;
  ios_base::getloc();
  local_58 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_48 = &local_58;
    local_50 = (undefined ***)&local_48;
                    /* try { // try from 00be8f38 to 00be8f4f has its CatchHandler @ 00be9018 */
    __call_once((ulong *)&ctype<char>::id,&local_50,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_68 + 0x18) - *(long *)(local_68 + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (lVar3 = *(long *)(*(long *)(local_68 + 0x10) + ((long)DAT_00d27278 - 1U) * 8), lVar3 == 0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be9014 to 00be9017 has its CatchHandler @ 00be9018 */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_68);
  lVar2 = (*(code *)**(undefined8 **)(this + 0x10))(this + 0x10);
  lVar3 = FUN_00bda608(&local_60,param_3,lVar2,lVar2 + 0x150,lVar3,param_5,0);
  if (lVar3 - lVar2 < 0x150) {
    lVar3 = (lVar3 - lVar2 >> 3) * -0x5555555555555555;
    auVar1 = SEXT816(lVar3) * SEXT816(0x4924924924924925);
    *(int *)(param_6 + 0x18) =
         (int)lVar3 + ((int)(auVar1._8_8_ >> 1) - (auVar1._12_4_ >> 0x1f)) * -7;
  }
  return local_60;
}

