/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be9f18
 */

/* std::__ndk1::time_get<char, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::__get_am_pm(int&, std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >&,
   std::__ndk1::istreambuf_iterator<char, std::__ndk1::char_traits<char> >, unsigned int&,
   std::__ndk1::ctype<char> const&) const */

void __thiscall
std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
__get_am_pm(time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
            *this,int *param_1,undefined8 param_2,undefined8 param_4,uint *param_5,
           undefined8 param_6)

{
  ulong uVar1;
  ulong uVar2;
  int iVar3;
  byte *pbVar4;
  byte *pbVar5;
  
  pbVar4 = (byte *)(**(code **)(*(long *)(this + 0x10) + 0x10))();
  uVar1 = (ulong)(*pbVar4 >> 1);
  if ((*pbVar4 & 1) != 0) {
    uVar1 = *(ulong *)(pbVar4 + 8);
  }
  uVar2 = (ulong)(pbVar4[0x18] >> 1);
  if ((pbVar4[0x18] & 1) != 0) {
    uVar2 = *(ulong *)(pbVar4 + 0x20);
  }
  if (uVar1 + uVar2 == 0) {
    *param_5 = *param_5 | 4;
  }
  else {
    pbVar5 = (byte *)FUN_00bda608(param_2,param_4,pbVar4,pbVar4 + 0x30,param_6,param_5,0);
    iVar3 = *param_1;
    if ((pbVar5 == pbVar4) && (iVar3 == 0xc)) {
      *param_1 = 0;
    }
    else if (((long)pbVar5 - (long)pbVar4 == 0x18) && (iVar3 < 0xc)) {
      *param_1 = iVar3 + 0xc;
    }
  }
  return;
}

