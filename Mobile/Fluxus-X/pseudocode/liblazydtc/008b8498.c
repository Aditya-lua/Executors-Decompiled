/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b8498
 */

long * FUN_008b8498(long param_1,void *param_2,ulong param_3,ulong param_4,ulong param_5)

{
  size_t __n;
  uint uVar1;
  int iVar2;
  int iVar3;
  long *plVar4;
  undefined8 uVar5;
  long *plVar6;
  ulong uVar7;
  code *pcVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  uint uVar13;
  long lVar14;
  uint uVar15;
  
  lVar14 = *(long *)(param_1 + 0x60);
  if (param_4 - 1 < 0x400) {
    uVar13 = (uint)(char)(&DAT_00d1f6d8)[param_4];
  }
  else {
    uVar13 = 0xffffffff;
  }
  if (param_3 - 1 < 0x400) {
    uVar15 = (uint)(char)(&DAT_00d1f6d8)[param_3];
  }
  else {
    uVar15 = 0xffffffff;
  }
  if ((*(code **)(lVar14 + 0x650) != (code *)0x0) && (param_2 != (void *)0x0)) {
    (**(code **)(lVar14 + 0x650))(param_1);
  }
  if (((int)uVar13 < 0) && ((int)uVar15 < 0)) {
    plVar4 = (long *)(**(code **)(lVar14 + 0x48))
                               (*(undefined8 *)(lVar14 + 0x50),param_2,param_3,param_4);
    if ((param_4 != 0) && (plVar4 == (long *)0x0)) {
LAB_008b85a8:
                    /* WARNING: Subroutine does not return */
      FUN_008b3f9c(param_1,4);
    }
    goto LAB_008b86f8;
  }
  if ((int)uVar13 < 0) {
    plVar4 = (long *)(**(code **)(lVar14 + 0x48))(*(undefined8 *)(lVar14 + 0x50),0,0,param_4);
    if ((param_4 != 0) && (plVar4 == (long *)0x0)) goto LAB_008b85a8;
  }
  else {
    lVar9 = *(long *)(param_1 + 0x60) + 0x70;
    lVar10 = *(long *)(lVar9 + (ulong)uVar13 * 8);
    if (lVar10 == 0) {
      lVar10 = FUN_008b8a8c(param_1,lVar9,0,uVar13,1);
      uVar1 = *(uint *)(lVar10 + 0x30);
      if (-1 < (int)uVar1) goto LAB_008b8550;
LAB_008b85dc:
      plVar4 = *(long **)(lVar10 + 0x28);
      *(long *)(lVar10 + 0x28) = *plVar4;
      iVar2 = *(int *)(lVar10 + 0x34);
      *plVar4 = lVar10;
      *(int *)(lVar10 + 0x34) = iVar2 + 1;
      if (*(long *)(lVar10 + 0x28) == 0) {
LAB_008b8600:
        lVar11 = *(long *)(lVar10 + 0x18);
        *(long *)(lVar9 + (ulong)uVar13 * 8) = lVar11;
        if (lVar11 != 0) {
          *(undefined8 *)(lVar11 + 0x10) = 0;
        }
        *(undefined8 *)(lVar10 + 0x18) = 0;
      }
    }
    else {
      uVar1 = *(uint *)(lVar10 + 0x30);
      if ((int)uVar1 < 0) goto LAB_008b85dc;
LAB_008b8550:
      iVar2 = *(int *)(lVar10 + 0x24);
      iVar3 = *(int *)(lVar10 + 0x34);
      lVar11 = *(long *)(lVar10 + 0x28);
      plVar4 = (long *)(lVar10 + (ulong)uVar1 + 0x40);
      *plVar4 = lVar10;
      iVar2 = uVar1 - iVar2;
      *(int *)(lVar10 + 0x30) = iVar2;
      *(int *)(lVar10 + 0x34) = iVar3 + 1;
      if ((lVar11 == 0) && (iVar2 < 0)) goto LAB_008b8600;
    }
    plVar4 = plVar4 + 1;
  }
  if ((param_3 != 0) && (param_4 != 0)) {
    __n = param_3;
    if (param_4 <= param_3) {
      __n = param_4;
    }
    memcpy(plVar4,param_2,__n);
  }
  if ((int)uVar15 < 0) {
    pcVar8 = *(code **)(lVar14 + 0x48);
    uVar5 = *(undefined8 *)(lVar14 + 0x50);
    uVar7 = param_3;
  }
  else {
    plVar6 = (long *)((long)param_2 + -8);
    param_2 = (void *)*plVar6;
    lVar9 = *(long *)(param_1 + 0x60);
    lVar10 = *(long *)((long)param_2 + 0x28);
    if ((lVar10 == 0) && (*(int *)((long)param_2 + 0x30) < 0)) {
      lVar11 = lVar9 + 0x70;
      lVar12 = *(long *)(lVar11 + (ulong)uVar15 * 8);
      *(long *)((long)param_2 + 0x18) = lVar12;
      if (lVar12 != 0) {
        *(void **)(lVar12 + 0x10) = param_2;
      }
      *(void **)(lVar11 + (ulong)uVar15 * 8) = param_2;
    }
    iVar2 = *(int *)((long)param_2 + 0x34);
    *plVar6 = lVar10;
    *(long **)((long)param_2 + 0x28) = plVar6;
    iVar2 = iVar2 + -1;
    *(int *)((long)param_2 + 0x34) = iVar2;
    if (iVar2 != 0) goto LAB_008b86f8;
    lVar10 = *(long *)((long)param_2 + 0x10);
    lVar11 = *(long *)((long)param_2 + 0x18);
    if (lVar11 != 0) {
      *(long *)(lVar11 + 0x10) = lVar10;
    }
    if (lVar10 == 0) {
      lVar9 = lVar9 + 0x70;
      if (*(void **)(lVar9 + (ulong)uVar15 * 8) == param_2) {
        *(long *)(lVar9 + (ulong)uVar15 * 8) = lVar11;
      }
    }
    else {
      *(long *)(lVar10 + 0x18) = lVar11;
    }
    pcVar8 = *(code **)(*(long *)(param_1 + 0x60) + 0x48);
    uVar5 = *(undefined8 *)(*(long *)(param_1 + 0x60) + 0x50);
    uVar7 = (long)*(int *)((long)param_2 + 0x20);
  }
  (*pcVar8)(uVar5,param_2,uVar7,0);
LAB_008b86f8:
  lVar9 = lVar14 + (param_5 & 0xff) * 8;
  lVar10 = *(long *)(lVar9 + 0x3848);
  pcVar8 = *(code **)(lVar14 + 0x658);
  *(ulong *)(lVar14 + 0x10) = (param_4 - param_3) + *(long *)(lVar14 + 0x10);
  *(ulong *)(lVar9 + 0x3848) = (param_4 - param_3) + lVar10;
  if (pcVar8 != (code *)0x0) {
    (*pcVar8)(param_1,plVar4,param_3,param_4,param_5 & 0xffffffff,0x10,0);
  }
  return plVar4;
}

