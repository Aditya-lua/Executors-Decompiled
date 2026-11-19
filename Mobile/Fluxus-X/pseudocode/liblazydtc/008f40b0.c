/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f40b0
 */

/* cpr::Parameter::Parameter(cpr::Parameter const&) */

void __thiscall cpr::Parameter::Parameter(Parameter *this,Parameter *param_1)

{
  void *pvVar1;
  Parameter *pPVar2;
  Parameter *__dest;
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
      if (uVar3 != 0) goto LAB_008f413c;
    }
    else {
      uVar4 = uVar3 + 0x10 & 0xfffffffffffffff0;
      pPVar2 = operator_new(uVar4);
      *(ulong *)(this + 8) = uVar3;
      *(Parameter **)(this + 0x10) = pPVar2;
      *(ulong *)this = uVar4 | 1;
LAB_008f413c:
      memcpy(pPVar2,pvVar1,uVar3);
    }
    pPVar2[uVar3] = (Parameter)0x0;
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
                    /* try { // try from 008f41f4 to 008f41fb has its CatchHandler @ 008f41fc */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar1 = *(void **)(param_1 + 0x28);
  if (uVar3 < 0x17) {
    __dest = this + 0x19;
    *pPVar2 = SUB41((int)uVar3 << 1,0);
    if (uVar3 == 0) goto LAB_008f41d4;
  }
  else {
    uVar4 = uVar3 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008f41ac to 008f41b3 has its CatchHandler @ 008f41fc */
    __dest = operator_new(uVar4);
    *(ulong *)(this + 0x20) = uVar3;
    *(Parameter **)(this + 0x28) = __dest;
    *(ulong *)(this + 0x18) = uVar4 | 1;
  }
  memcpy(__dest,pvVar1,uVar3);
LAB_008f41d4:
  __dest[uVar3] = (Parameter)0x0;
  return;
}

