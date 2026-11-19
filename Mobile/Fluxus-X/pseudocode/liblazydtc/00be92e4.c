/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be92e4
 */

/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_get_year(std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, std::__ndk1::ios_base&,
   unsigned int&, tm*) const */

undefined8 __thiscall
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_get_year(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
           byte *param_5,long param_6)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  long local_60;
  undefined8 local_58;
  undefined8 *local_50;
  undefined ***local_48;
  undefined8 **local_28;
  
  local_58 = param_2;
  ios_base::getloc();
  local_50 = &ctype<char>::id;
  if (ctype<char>::id != -1) {
    local_28 = &local_50;
    local_48 = (undefined ***)&local_28;
                    /* try { // try from 00be9348 to 00be935f has its CatchHandler @ 00be93ec */
    __call_once((ulong *)&ctype<char>::id,&local_48,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_60 + 0x18) - *(long *)(local_60 + 0x10) >> 3) <=
       (long)DAT_00d27278 - 1U) ||
     (lVar4 = *(long *)(*(long *)(local_60 + 0x10) + ((long)DAT_00d27278 - 1U) * 8), lVar4 == 0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00be93e8 to 00be93eb has its CatchHandler @ 00be93ec */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_60);
  uVar3 = FUN_00bea2fc(&local_58,param_3,param_5,lVar4,4);
  if ((*param_5 >> 2 & 1) == 0) {
    uVar1 = uVar3 + 0x76c;
    if (99 < uVar3) {
      uVar1 = uVar3;
    }
    uVar2 = uVar3 + 2000;
    if (0x44 < (int)uVar3) {
      uVar2 = uVar1;
    }
    *(uint *)(param_6 + 0x14) = uVar2 - 0x76c;
  }
  return local_58;
}

