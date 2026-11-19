/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc63f4
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::__init(unsigned long, wchar_t) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::__init(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,ulong param_1,wchar_t param_2)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar5;
  
  if (0x3ffffffffffffff7 < param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  if (param_1 < 5) {
    pbVar5 = this + 4;
    *this = SUB41((int)param_1 << 1,0);
    if (param_1 == 0) goto LAB_00bc64ac;
  }
  else {
    uVar2 = 8;
    if ((param_1 | 1) != 5) {
      uVar2 = (param_1 | 1) + 1;
    }
    pbVar5 = operator_new(uVar2 << 2);
    *(ulong *)(this + 8) = param_1;
    *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> **)
     (this + 0x10) = pbVar5;
    *(ulong *)this = uVar2 | 1;
  }
  pbVar1 = pbVar5;
  uVar2 = param_1;
  if (7 < param_1) {
    uVar3 = param_1 & 0x3ffffffffffffff8;
    uVar2 = param_1 & 7;
    pbVar1 = pbVar5 + 0x10;
    uVar4 = uVar3;
    do {
      uVar4 = uVar4 - 8;
      *(ulong *)(pbVar1 + -8) = CONCAT44(param_2,param_2);
      *(ulong *)(pbVar1 + -0x10) = CONCAT44(param_2,param_2);
      *(ulong *)(pbVar1 + 8) = CONCAT44(param_2,param_2);
      *(ulong *)pbVar1 = CONCAT44(param_2,param_2);
      pbVar1 = pbVar1 + 0x20;
    } while (uVar4 != 0);
    pbVar1 = pbVar5 + uVar3 * 4;
    if (param_1 == uVar3) goto LAB_00bc64ac;
  }
  do {
    uVar2 = uVar2 - 1;
    *(wchar_t *)pbVar1 = param_2;
    pbVar1 = pbVar1 + 4;
  } while (uVar2 != 0);
LAB_00bc64ac:
  *(undefined4 *)(pbVar5 + param_1 * 4) = 0;
  return;
}

