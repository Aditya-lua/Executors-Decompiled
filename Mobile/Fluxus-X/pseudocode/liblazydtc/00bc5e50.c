/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5e50
 */

basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *
FUN_00bc5e50(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
             *param_1,wchar_t *param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *__dest;
  uint uVar3;
  ulong uVar4;
  
  uVar4 = *(ulong *)param_1;
  uVar1 = 4;
  if (((byte)*param_1 & 1) != 0) {
    uVar1 = (uVar4 & 0xfffffffffffffffe) - 1;
  }
  uVar3 = (uint)uVar4 & 0xff;
  if (param_3 < uVar1 || param_3 - uVar1 == 0) {
    __dest = param_1 + 4;
    if ((uVar4 & 1) != 0) {
      __dest = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(param_1 + 0x10);
    }
    if (param_3 != 0) {
      memmove(__dest,param_2,param_3 << 2);
      uVar3 = (uint)(byte)*param_1;
    }
    if ((uVar3 & 1) == 0) {
      *param_1 = SUB41((int)param_3 << 1,0);
    }
    else {
      *(ulong *)(param_1 + 8) = param_3;
    }
    *(undefined4 *)(__dest + param_3 * 4) = 0;
  }
  else {
    uVar2 = uVar4 >> 1 & 0x7f;
    if ((uVar4 & 1) != 0) {
      uVar2 = *(ulong *)(param_1 + 8);
    }
    std::__ndk1::
    basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
    __grow_by_and_replace(param_1,uVar1,param_3 - uVar1,uVar2,0,uVar2,param_3,param_2);
  }
  return param_1;
}

