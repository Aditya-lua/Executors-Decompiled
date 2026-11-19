/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008be474
 */

void FUN_008be474(long param_1,code *param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  char cVar3;
  char cVar4;
  ulong uVar5;
  long lVar6;
  int iVar7;
  long *plVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined8 local_1b0 [2];
  undefined4 local_1a0;
  long local_70;
  
  lVar6 = tpidr_el0;
  local_70 = *(long *)(lVar6 + 0x28);
  plVar8 = *(long **)(param_1 + 0x50);
  cVar3 = *(char *)(param_1 + 3);
  lVar1 = *(long *)(param_1 + 0x68);
  lVar2 = *(long *)(param_1 + 0x70);
  lVar13 = plVar8[3];
  if ((cVar3 == '\x06') || (cVar3 == '\x01')) {
    lVar10 = plVar8[2];
    *(undefined1 *)(param_1 + 3) = 0;
    *(long *)(param_1 + 0x70) = lVar10;
  }
  lVar12 = plVar8[4];
  lVar11 = *(long *)(param_1 + 0x58);
  lVar10 = *(long *)plVar8[1];
  if ((lVar12 == 0) || (lVar12 == *(long *)(*plVar8 + 0x30) + (long)*(int *)(*plVar8 + 0xb8) * 4)) {
    lVar9 = lVar1;
  }
  else {
    plVar8[4] = lVar12 + 4;
    lVar9 = *(long *)(param_1 + 0x68);
  }
  if (*(long *)(param_1 + 0x48) - lVar9 < 0x141) {
    FUN_008b41e4(param_1,0x14);
    lVar9 = *(long *)(param_1 + 0x68);
  }
  plVar8 = *(long **)(param_1 + 0x50);
  cVar4 = *(char *)(lVar10 + 6);
  plVar8[3] = lVar9 + 0x140;
  if (cVar4 == '\0') {
    if ((plVar8[4] == 0) || (uVar5 = plVar8[4] - *(long *)(*plVar8 + 0x30), uVar5 == 0)) {
      iVar7 = 0;
    }
    else {
      iVar7 = (int)(uVar5 >> 2) + -1;
    }
    local_1a0 = FUN_008b3e4c(*plVar8,iVar7);
  }
  else {
    local_1a0 = 0xffffffff;
  }
  local_1b0[0] = param_3;
  (*param_2)(param_1,local_1b0);
  *(long *)(*(long *)(param_1 + 0x50) + 0x20) = lVar12;
  lVar10 = *(long *)(param_1 + 0x58);
  *(long *)(*(long *)(param_1 + 0x50) + 0x18) = lVar10 + (lVar13 - lVar11);
  *(long *)(param_1 + 0x68) = lVar10 + (lVar1 - lVar11);
  if ((cVar3 == '\x06') || ((cVar3 == '\x01' && (*(char *)(param_1 + 3) != '\x01')))) {
    *(char *)(param_1 + 3) = cVar3;
    *(long *)(param_1 + 0x70) = lVar10 + (lVar2 - lVar11);
  }
  if (*(long *)(lVar6 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

