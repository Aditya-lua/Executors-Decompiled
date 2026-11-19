/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ea40c
 */

/* cpr::Cookie::Cookie(cpr::Cookie const&) */

void __thiscall cpr::Cookie::Cookie(Cookie *this,Cookie *param_1)

{
  Cookie CVar1;
  Cookie *pCVar2;
  Cookie *pCVar3;
  ulong uVar4;
  void *pvVar5;
  ulong uVar6;
  undefined8 uVar7;
  
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)this = 0;
  if (((byte)*param_1 & 1) == 0) {
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    uVar7 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 8) = *(undefined8 *)(param_1 + 8);
    *(undefined8 *)this = uVar7;
  }
  else {
    uVar4 = *(ulong *)(param_1 + 8);
    if (0xffffffffffffffef < uVar4) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar5 = *(void **)(param_1 + 0x10);
    if (uVar4 < 0x17) {
      pCVar2 = this + 1;
      *this = SUB41((int)uVar4 << 1,0);
      if (uVar4 != 0) goto LAB_008ea49c;
    }
    else {
      uVar6 = uVar4 + 0x10 & 0xfffffffffffffff0;
      pCVar2 = operator_new(uVar6);
      *(ulong *)(this + 8) = uVar4;
      *(Cookie **)(this + 0x10) = pCVar2;
      *(ulong *)this = uVar6 | 1;
LAB_008ea49c:
      memcpy(pCVar2,pvVar5,uVar4);
    }
    pCVar2[uVar4] = (Cookie)0x0;
  }
  pCVar2 = this + 0x18;
  *(undefined8 *)pCVar2 = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  if (((byte)param_1[0x18] & 1) == 0) {
    *(undefined8 *)(this + 0x28) = *(undefined8 *)(param_1 + 0x28);
    uVar7 = *(undefined8 *)(param_1 + 0x18);
    *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x20);
    *(undefined8 *)pCVar2 = uVar7;
  }
  else {
    uVar4 = *(ulong *)(param_1 + 0x20);
    if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 008ea680 to 008ea687 has its CatchHandler @ 008ea6f0 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar5 = *(void **)(param_1 + 0x28);
    if (uVar4 < 0x17) {
      pCVar3 = this + 0x19;
      *pCVar2 = SUB41((int)uVar4 << 1,0);
      if (uVar4 != 0) goto LAB_008ea528;
    }
    else {
      uVar6 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ea510 to 008ea517 has its CatchHandler @ 008ea6f0 */
      pCVar3 = operator_new(uVar6);
      *(ulong *)(this + 0x20) = uVar4;
      *(Cookie **)(this + 0x28) = pCVar3;
      *(ulong *)(this + 0x18) = uVar6 | 1;
LAB_008ea528:
      memcpy(pCVar3,pvVar5,uVar4);
    }
    pCVar3[uVar4] = (Cookie)0x0;
  }
  pCVar2 = this + 0x30;
  *(undefined8 *)pCVar2 = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x40) = 0;
  if (((byte)param_1[0x30] & 1) == 0) {
    *(undefined8 *)(this + 0x40) = *(undefined8 *)(param_1 + 0x40);
    uVar7 = *(undefined8 *)(param_1 + 0x30);
    *(undefined8 *)(this + 0x38) = *(undefined8 *)(param_1 + 0x38);
    *(undefined8 *)pCVar2 = uVar7;
  }
  else {
    uVar4 = *(ulong *)(param_1 + 0x38);
    if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 008ea688 to 008ea68f has its CatchHandler @ 008ea6d0 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar5 = *(void **)(param_1 + 0x40);
    if (uVar4 < 0x17) {
      pCVar3 = this + 0x31;
      *pCVar2 = SUB41((int)uVar4 << 1,0);
      if (uVar4 != 0) goto LAB_008ea5b4;
    }
    else {
      uVar6 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ea59c to 008ea5a3 has its CatchHandler @ 008ea6d0 */
      pCVar3 = operator_new(uVar6);
      *(ulong *)(this + 0x38) = uVar4;
      *(Cookie **)(this + 0x40) = pCVar3;
      *(ulong *)(this + 0x30) = uVar6 | 1;
LAB_008ea5b4:
      memcpy(pCVar3,pvVar5,uVar4);
    }
    pCVar3[uVar4] = (Cookie)0x0;
  }
  CVar1 = param_1[0x48];
  pCVar2 = this + 0x50;
  *(undefined8 *)pCVar2 = 0;
  *(undefined8 *)(this + 0x58) = 0;
  *(undefined8 *)(this + 0x60) = 0;
  this[0x48] = CVar1;
  if (((byte)param_1[0x50] & 1) == 0) {
    *(undefined8 *)(this + 0x60) = *(undefined8 *)(param_1 + 0x60);
    uVar7 = *(undefined8 *)(param_1 + 0x50);
    *(undefined8 *)(this + 0x58) = *(undefined8 *)(param_1 + 0x58);
    *(undefined8 *)pCVar2 = uVar7;
    goto LAB_008ea658;
  }
  uVar4 = *(ulong *)(param_1 + 0x58);
  if (0xffffffffffffffef < uVar4) {
                    /* try { // try from 008ea690 to 008ea697 has its CatchHandler @ 008ea698 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar5 = *(void **)(param_1 + 0x60);
  if (uVar4 < 0x17) {
    pCVar3 = this + 0x51;
    *pCVar2 = SUB41((int)uVar4 << 1,0);
    if (uVar4 != 0) goto LAB_008ea644;
  }
  else {
    uVar6 = uVar4 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ea62c to 008ea633 has its CatchHandler @ 008ea698 */
    pCVar3 = operator_new(uVar6);
    *(ulong *)(this + 0x58) = uVar4;
    *(Cookie **)(this + 0x60) = pCVar3;
    *(ulong *)(this + 0x50) = uVar6 | 1;
LAB_008ea644:
    memcpy(pCVar3,pvVar5,uVar4);
  }
  pCVar3[uVar4] = (Cookie)0x0;
LAB_008ea658:
  uVar7 = *(undefined8 *)(param_1 + 0x68);
  *(undefined8 *)(this + 0x70) = *(undefined8 *)(param_1 + 0x70);
  *(undefined8 *)(this + 0x68) = uVar7;
  return;
}

