/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc6910
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::assign(unsigned long, wchar_t) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::assign(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
         *this,ulong param_1,wchar_t param_2)

{
  ulong uVar1;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar2;
  uint uVar3;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar4;
  ulong uVar5;
  ulong uVar6;
  
  uVar1 = *(ulong *)this;
  uVar5 = 4;
  if (((byte)*this & 1) != 0) {
    uVar5 = (uVar1 & 0xfffffffffffffffe) - 1;
  }
  uVar3 = (uint)uVar1 & 0xff;
  if (param_1 < uVar5 || param_1 - uVar5 == 0) {
    pbVar2 = this + 4;
    if ((uVar1 & 1) != 0) {
      pbVar2 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(this + 0x10);
    }
    if (param_1 == 0) goto LAB_00bc69fc;
  }
  else {
    uVar6 = uVar1 >> 1 & 0x7f;
    if ((uVar1 & 1) != 0) {
      uVar6 = *(ulong *)(this + 8);
    }
    __grow_by(this,uVar5,param_1 - uVar5,uVar6,0,uVar6,0);
    *(undefined8 *)(this + 8) = 0;
    pbVar2 = this + 4;
    if (((byte)*this & 1) != 0) {
      pbVar2 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 **)(this + 0x10);
    }
  }
  pbVar4 = pbVar2;
  uVar5 = param_1;
  if (param_1 < 8) {
LAB_00bc69ec:
    do {
      uVar5 = uVar5 - 1;
      *(wchar_t *)pbVar4 = param_2;
      pbVar4 = pbVar4 + 4;
    } while (uVar5 != 0);
  }
  else {
    uVar6 = param_1 & 0xfffffffffffffff8;
    uVar5 = param_1 & 7;
    pbVar4 = pbVar2 + 0x10;
    uVar1 = uVar6;
    do {
      uVar1 = uVar1 - 8;
      *(ulong *)(pbVar4 + -8) = CONCAT44(param_2,param_2);
      *(ulong *)(pbVar4 + -0x10) = CONCAT44(param_2,param_2);
      *(ulong *)(pbVar4 + 8) = CONCAT44(param_2,param_2);
      *(ulong *)pbVar4 = CONCAT44(param_2,param_2);
      pbVar4 = pbVar4 + 0x20;
    } while (uVar1 != 0);
    pbVar4 = pbVar2 + uVar6 * 4;
    if (param_1 != uVar6) goto LAB_00bc69ec;
  }
  uVar3 = (uint)(byte)*this;
LAB_00bc69fc:
  if ((uVar3 & 1) == 0) {
    *this = SUB41((int)param_1 << 1,0);
  }
  else {
    *(ulong *)(this + 8) = param_1;
  }
  *(undefined4 *)(pbVar2 + param_1 * 4) = 0;
  return;
}

