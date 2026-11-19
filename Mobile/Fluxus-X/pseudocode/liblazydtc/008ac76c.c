/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ac76c
 */

void FUN_008ac76c(long param_1,undefined8 param_2,char *param_3,int param_4,undefined8 param_5)

{
  long lVar1;
  long lVar2;
  int iVar3;
  size_t sVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 *puVar7;
  long *plVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  undefined4 local_5c;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
    FUN_008b52c4(param_1,1);
  }
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  lVar6 = *(long *)(param_1 + 0x50);
  lVar9 = *(long *)(param_1 + 0x68);
  uVar11 = *(ulong *)(lVar6 + 0x18);
  if (uVar11 < lVar9 + 0x10U) {
    if (0x1f3f0 < lVar9 - *(long *)(param_1 + 0x70)) {
LAB_008ac938:
      FUN_008b9568(param_1,"stack overflow");
      if (*(long *)(lVar2 + 0x28) == local_58) {
        FUN_008aa5f4(param_1);
      }
      goto LAB_008ac960;
    }
    if (*(long *)(param_1 + 0x48) - lVar9 < 0x11) {
      local_5c = 1;
      iVar3 = FUN_008b3edc(param_1,&LAB_008aa604,&local_5c);
      if (iVar3 != 0) goto LAB_008ac938;
      lVar6 = *(long *)(param_1 + 0x50);
      lVar9 = *(long *)(param_1 + 0x68);
      uVar11 = *(ulong *)(lVar6 + 0x18);
    }
    if (uVar11 < lVar9 + 0x10U) {
      *(ulong *)(lVar6 + 0x18) = lVar9 + 0x10U;
    }
  }
  if (lVar6 == *(long *)(param_1 + 0x20)) {
    puVar7 = (undefined8 *)(param_1 + 0x78);
  }
  else {
    puVar7 = (undefined8 *)(**(long **)(lVar6 + 8) + 0x10);
  }
  lVar6 = FUN_008b4e40(param_1,param_4,*puVar7);
  *(undefined8 *)(lVar6 + 0x20) = param_5;
  *(undefined8 *)(lVar6 + 0x28) = param_2;
  if (param_3 == (char *)0x0) {
    uVar5 = 0;
  }
  else {
    sVar4 = strlen(param_3);
    uVar5 = FUN_008b9ff8(param_1,param_3,sVar4);
  }
  *(undefined8 *)(lVar6 + 0x18) = uVar5;
  plVar8 = (long *)(*(long *)(param_1 + 0x68) + (long)param_4 * -0x10);
  *(long **)(param_1 + 0x68) = plVar8;
  if (param_4 != 0) {
    lVar9 = (long)param_4;
    lVar10 = lVar9 << 4;
    do {
      lVar9 = lVar9 + -1;
      lVar1 = *(long *)(param_1 + 0x68) + lVar10;
      uVar5 = *(undefined8 *)(lVar1 + -0x10);
      puVar7 = (undefined8 *)(lVar6 + 0x20 + lVar10);
      puVar7[1] = *(undefined8 *)(lVar1 + -8);
      *puVar7 = uVar5;
      lVar10 = lVar10 + -0x10;
    } while (lVar9 != 0);
    plVar8 = *(long **)(param_1 + 0x68);
  }
  *plVar8 = lVar6;
  lVar6 = *(long *)(param_1 + 0x68);
  *(undefined4 *)((long)plVar8 + 0xc) = 7;
  *(long *)(param_1 + 0x68) = lVar6 + 0x10;
  if (*(long *)(lVar2 + 0x28) == local_58) {
    return;
  }
LAB_008ac960:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

