/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ff4f4
 */

/* cpr::Cookie::Cookie(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, bool, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, bool,
   std::__ndk1::chrono::time_point<std::__ndk1::chrono::system_clock,
   std::__ndk1::chrono::duration<long long, std::__ndk1::ratio<1l, 1000000l> > >) */

void __thiscall
cpr::Cookie::Cookie(Cookie *this,byte *param_1,byte *param_2,byte *param_3,byte param_4,
                   byte *param_5,byte param_6,undefined8 param_8)

{
  ulong uVar1;
  void *pvVar2;
  Cookie *pCVar3;
  Cookie *pCVar4;
  ulong uVar5;
  undefined8 uVar6;
  
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)this = 0;
  if ((*param_1 & 1) == 0) {
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    uVar6 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 8) = *(undefined8 *)(param_1 + 8);
    *(undefined8 *)this = uVar6;
  }
  else {
    uVar5 = *(ulong *)(param_1 + 8);
    if (0xffffffffffffffef < uVar5) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar2 = *(void **)(param_1 + 0x10);
    if (uVar5 < 0x17) {
      pCVar3 = this + 1;
      *this = SUB41((int)uVar5 << 1,0);
      if (uVar5 != 0) goto LAB_008ff5b8;
    }
    else {
      uVar1 = uVar5 + 0x10 & 0xfffffffffffffff0;
      pCVar3 = operator_new(uVar1);
      *(ulong *)(this + 8) = uVar5;
      *(Cookie **)(this + 0x10) = pCVar3;
      *(ulong *)this = uVar1 | 1;
LAB_008ff5b8:
      memcpy(pCVar3,pvVar2,uVar5);
    }
    pCVar3[uVar5] = (Cookie)0x0;
  }
  pCVar3 = this + 0x18;
  *(undefined8 *)pCVar3 = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  if ((*param_2 & 1) == 0) {
    *(undefined8 *)(this + 0x28) = *(undefined8 *)(param_2 + 0x10);
    uVar6 = *(undefined8 *)param_2;
    *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_2 + 8);
    *(undefined8 *)pCVar3 = uVar6;
  }
  else {
    uVar5 = *(ulong *)(param_2 + 8);
    if (0xffffffffffffffef < uVar5) {
                    /* try { // try from 008ff7dc to 008ff7e3 has its CatchHandler @ 008ff84c */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar2 = *(void **)(param_2 + 0x10);
    if (uVar5 < 0x17) {
      pCVar4 = this + 0x19;
      *pCVar3 = SUB41((int)uVar5 << 1,0);
      if (uVar5 != 0) goto LAB_008ff658;
    }
    else {
      uVar1 = uVar5 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ff634 to 008ff63b has its CatchHandler @ 008ff84c */
      pCVar4 = operator_new(uVar1);
      *(ulong *)(this + 0x20) = uVar5;
      *(Cookie **)(this + 0x28) = pCVar4;
      *(ulong *)(this + 0x18) = uVar1 | 1;
LAB_008ff658:
      memcpy(pCVar4,pvVar2,uVar5);
    }
    pCVar4[uVar5] = (Cookie)0x0;
  }
  pCVar3 = this + 0x30;
  *(undefined8 *)pCVar3 = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x40) = 0;
  if ((*param_3 & 1) == 0) {
    *(undefined8 *)(this + 0x40) = *(undefined8 *)(param_3 + 0x10);
    uVar6 = *(undefined8 *)param_3;
    *(undefined8 *)(this + 0x38) = *(undefined8 *)(param_3 + 8);
    *(undefined8 *)pCVar3 = uVar6;
  }
  else {
    uVar5 = *(ulong *)(param_3 + 8);
    if (0xffffffffffffffef < uVar5) {
                    /* try { // try from 008ff7e4 to 008ff7eb has its CatchHandler @ 008ff82c */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar2 = *(void **)(param_3 + 0x10);
    if (uVar5 < 0x17) {
      pCVar4 = this + 0x31;
      *pCVar3 = SUB41((int)uVar5 << 1,0);
      if (uVar5 != 0) goto LAB_008ff6f8;
    }
    else {
      uVar1 = uVar5 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ff6d4 to 008ff6db has its CatchHandler @ 008ff82c */
      pCVar4 = operator_new(uVar1);
      *(ulong *)(this + 0x38) = uVar5;
      *(Cookie **)(this + 0x40) = pCVar4;
      *(ulong *)(this + 0x30) = uVar1 | 1;
LAB_008ff6f8:
      memcpy(pCVar4,pvVar2,uVar5);
    }
    pCVar4[uVar5] = (Cookie)0x0;
  }
  pCVar3 = this + 0x50;
  *(undefined8 *)pCVar3 = 0;
  this[0x48] = (Cookie)(param_4 & 1);
  *(undefined8 *)(this + 0x58) = 0;
  *(undefined8 *)(this + 0x60) = 0;
  if ((*param_5 & 1) == 0) {
    *(undefined8 *)(this + 0x60) = *(undefined8 *)(param_5 + 0x10);
    uVar6 = *(undefined8 *)param_5;
    *(undefined8 *)(this + 0x58) = *(undefined8 *)(param_5 + 8);
    *(undefined8 *)pCVar3 = uVar6;
    goto LAB_008ff7a8;
  }
  uVar5 = *(ulong *)(param_5 + 8);
  if (0xffffffffffffffef < uVar5) {
                    /* try { // try from 008ff7ec to 008ff7f3 has its CatchHandler @ 008ff7f4 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar2 = *(void **)(param_5 + 0x10);
  if (uVar5 < 0x17) {
    pCVar4 = this + 0x51;
    *pCVar3 = SUB41((int)uVar5 << 1,0);
    if (uVar5 != 0) goto LAB_008ff794;
  }
  else {
    uVar1 = uVar5 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ff774 to 008ff77b has its CatchHandler @ 008ff7f4 */
    pCVar4 = operator_new(uVar1);
    *(ulong *)(this + 0x58) = uVar5;
    *(Cookie **)(this + 0x60) = pCVar4;
    *(ulong *)(this + 0x50) = uVar1 | 1;
LAB_008ff794:
    memcpy(pCVar4,pvVar2,uVar5);
  }
  pCVar4[uVar5] = (Cookie)0x0;
LAB_008ff7a8:
  this[0x68] = (Cookie)(param_6 & 1);
  *(undefined8 *)(this + 0x70) = param_8;
  return;
}

