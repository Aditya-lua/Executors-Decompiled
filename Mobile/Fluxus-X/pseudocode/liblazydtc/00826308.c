/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00826308
 */

void FUN_00826308(long param_1)

{
  undefined8 *puVar1;
  long *plVar2;
  void *pvVar3;
  long lVar4;
  __shared_weak_count *p_Var5;
  byte *pbVar6;
  byte *pbVar7;
  byte *pbVar8;
  
  FUN_008265e4(param_1 + 0x278);
  if ((*(byte *)(param_1 + 0x260) & 1) == 0) {
    if ((*(byte *)(param_1 + 0x248) & 1) != 0) goto LAB_00826358;
LAB_00826334:
    p_Var5 = *(__shared_weak_count **)(param_1 + 0x228);
  }
  else {
    operator_delete(*(void **)(param_1 + 0x270),*(ulong *)(param_1 + 0x260) & 0xfffffffffffffffe);
    if ((*(byte *)(param_1 + 0x248) & 1) == 0) goto LAB_00826334;
LAB_00826358:
    operator_delete(*(void **)(param_1 + 600),*(ulong *)(param_1 + 0x248) & 0xfffffffffffffffe);
    p_Var5 = *(__shared_weak_count **)(param_1 + 0x228);
  }
  if ((p_Var5 != (__shared_weak_count *)0x0) &&
     (lVar4 = FUN_00c2bd10(0xffffffffffffffff,p_Var5 + 8), lVar4 == 0)) {
    (**(code **)(*(long *)p_Var5 + 0x10))(p_Var5);
    std::__ndk1::__shared_weak_count::__release_weak(p_Var5);
  }
  plVar2 = *(long **)(param_1 + 0x210);
  if (plVar2 == (long *)(param_1 + 0x1f0)) {
    lVar4 = 0x20;
LAB_008263b8:
    (**(code **)(*plVar2 + lVar4))();
  }
  else if (plVar2 != (long *)0x0) {
    lVar4 = 0x28;
    goto LAB_008263b8;
  }
  plVar2 = *(long **)(param_1 + 0x1d0);
  if (plVar2 == (long *)(param_1 + 0x1b0)) {
    lVar4 = 0x20;
LAB_008263e4:
    (**(code **)(*plVar2 + lVar4))();
  }
  else if (plVar2 != (long *)0x0) {
    lVar4 = 0x28;
    goto LAB_008263e4;
  }
  plVar2 = *(long **)(param_1 + 400);
  if (plVar2 == (long *)(param_1 + 0x170)) {
    lVar4 = 0x20;
LAB_00826410:
    (**(code **)(*plVar2 + lVar4))();
  }
  else if (plVar2 != (long *)0x0) {
    lVar4 = 0x28;
    goto LAB_00826410;
  }
  plVar2 = *(long **)(param_1 + 0x150);
  if (plVar2 == (long *)(param_1 + 0x130)) {
    lVar4 = 0x20;
LAB_0082643c:
    (**(code **)(*plVar2 + lVar4))();
  }
  else if (plVar2 != (long *)0x0) {
    lVar4 = 0x28;
    goto LAB_0082643c;
  }
  plVar2 = *(long **)(param_1 + 0x110);
  if (plVar2 == (long *)(param_1 + 0xf0)) {
    lVar4 = 0x20;
  }
  else {
    if (plVar2 == (long *)0x0) goto LAB_00826474;
    lVar4 = 0x28;
  }
  (**(code **)(*plVar2 + lVar4))();
LAB_00826474:
  puVar1 = *(void **)(param_1 + 0xc0);
  while (puVar1 != (void *)0x0) {
    pvVar3 = (void *)*puVar1;
    if ((*(byte *)(puVar1 + 2) & 1) != 0) {
      operator_delete((void *)puVar1[4],puVar1[2] & 0xfffffffffffffffe);
    }
    operator_delete(puVar1,0x28);
    puVar1 = pvVar3;
  }
  pvVar3 = *(void **)(param_1 + 0xb0);
  *(undefined8 *)(param_1 + 0xb0) = 0;
  if (pvVar3 != (void *)0x0) {
    operator_delete(pvVar3,*(long *)(param_1 + 0xb8) << 3);
  }
  FUN_00827168(param_1 + 0x98,*(undefined8 *)(param_1 + 0xa0));
  FUN_00826780(param_1 + 0x80,*(undefined8 *)(param_1 + 0x88));
  FUN_008267e4(param_1 + 0x68,*(undefined8 *)(param_1 + 0x70));
  pbVar6 = *(byte **)(param_1 + 0x50);
  if (pbVar6 != (byte *)0x0) {
    pbVar8 = pbVar6;
    pbVar7 = *(byte **)(param_1 + 0x58);
    if (pbVar6 != *(byte **)(param_1 + 0x58)) {
      do {
        if ((pbVar7[-0x18] & 1) != 0) {
          operator_delete(*(void **)(pbVar7 + -8),*(ulong *)(pbVar7 + -0x18) & 0xfffffffffffffffe);
        }
        pbVar8 = pbVar7 + -0x30;
        if ((*pbVar8 & 1) != 0) {
          operator_delete(*(void **)(pbVar7 + -0x20),*(ulong *)(pbVar7 + -0x30) & 0xfffffffffffffffe
                         );
        }
        pbVar7 = pbVar8;
      } while (pbVar8 != pbVar6);
      pbVar8 = *(byte **)(param_1 + 0x50);
    }
    *(byte **)(param_1 + 0x58) = pbVar6;
    operator_delete(pbVar8,*(long *)(param_1 + 0x60) - (long)pbVar8);
  }
  *(undefined ***)(param_1 + 0x28) = &PTR_LAB_00c489d0;
  if ((*(byte *)(param_1 + 0x30) & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x40),*(ulong *)(param_1 + 0x30) & 0xfffffffffffffffe);
  }
  p_Var5 = *(__shared_weak_count **)(param_1 + 0x20);
  if ((p_Var5 == (__shared_weak_count *)0x0) ||
     (lVar4 = FUN_00c2bd10(0xffffffffffffffff,p_Var5 + 8), lVar4 != 0)) {
    p_Var5 = *(__shared_weak_count **)(param_1 + 8);
  }
  else {
    (**(code **)(*(long *)p_Var5 + 0x10))(p_Var5);
    std::__ndk1::__shared_weak_count::__release_weak(p_Var5);
    p_Var5 = *(__shared_weak_count **)(param_1 + 8);
  }
  if (p_Var5 == (__shared_weak_count *)0x0) {
    return;
  }
  std::__ndk1::__shared_weak_count::__release_weak(p_Var5);
  return;
}

