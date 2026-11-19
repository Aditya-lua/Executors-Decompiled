/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fc678
 */

/* cpr::Pair::Pair(cpr::Pair const&) */

void __thiscall cpr::Pair::Pair(Pair *this,Pair *param_1)

{
  void *pvVar1;
  Pair *pPVar2;
  Pair *__dest;
  ulong uVar3;
  ulong uVar4;
  undefined8 uVar5;
  
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)this = 0;
  if (((byte)*param_1 & 1) == 0) {
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    uVar5 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 8) = *(undefined8 *)(param_1 + 8);
    *(undefined8 *)this = uVar5;
  }
  else {
    uVar3 = *(ulong *)(param_1 + 8);
    if (0xffffffffffffffef < uVar3) {
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar1 = *(void **)(param_1 + 0x10);
    if (uVar3 < 0x17) {
      pPVar2 = this + 1;
      *this = SUB41((int)uVar3 << 1,0);
      if (uVar3 != 0) goto LAB_008fc704;
    }
    else {
      uVar4 = uVar3 + 0x10 & 0xfffffffffffffff0;
      pPVar2 = operator_new(uVar4);
      *(ulong *)(this + 8) = uVar3;
      *(Pair **)(this + 0x10) = pPVar2;
      *(ulong *)this = uVar4 | 1;
LAB_008fc704:
      memcpy(pPVar2,pvVar1,uVar3);
    }
    pPVar2[uVar3] = (Pair)0x0;
  }
  pPVar2 = this + 0x18;
  *(undefined8 *)pPVar2 = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  if (((byte)param_1[0x18] & 1) == 0) {
    *(undefined8 *)(this + 0x28) = *(undefined8 *)(param_1 + 0x28);
    uVar5 = *(undefined8 *)(param_1 + 0x18);
    *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x20);
    *(undefined8 *)pPVar2 = uVar5;
    return;
  }
  uVar3 = *(ulong *)(param_1 + 0x20);
  if (0xffffffffffffffef < uVar3) {
                    /* try { // try from 008fc7bc to 008fc7c3 has its CatchHandler @ 008fc7c4 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar1 = *(void **)(param_1 + 0x28);
  if (uVar3 < 0x17) {
    __dest = this + 0x19;
    *pPVar2 = SUB41((int)uVar3 << 1,0);
    if (uVar3 == 0) goto LAB_008fc79c;
  }
  else {
    uVar4 = uVar3 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008fc774 to 008fc77b has its CatchHandler @ 008fc7c4 */
    __dest = operator_new(uVar4);
    *(ulong *)(this + 0x20) = uVar3;
    *(Pair **)(this + 0x28) = __dest;
    *(ulong *)(this + 0x18) = uVar4 | 1;
  }
  memcpy(__dest,pvVar1,uVar3);
LAB_008fc79c:
  __dest[uVar3] = (Pair)0x0;
  return;
}

