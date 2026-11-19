/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b8010
 */

void FUN_008b8010(long param_1,undefined8 *param_2,long *param_3)

{
  long lVar1;
  long *plVar2;
  int iVar3;
  int iVar4;
  char cVar5;
  byte bVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  
  lVar8 = *(long *)(param_1 + 0x60);
  if (param_2 != (undefined8 *)0x0) {
    lVar7 = *param_3;
    plVar2 = (long *)param_3[1];
    if (plVar2 != (long *)0x0) {
      *plVar2 = lVar7;
    }
    if (lVar7 == 0) {
      if ((long *)*param_2 == param_3) {
        *param_2 = plVar2;
      }
    }
    else {
      *(long **)(lVar7 + 8) = plVar2;
    }
  }
  if (DAT_00d1f618 != '\x01') {
                    /* WARNING: Could not recover jumptable at 0x008b8118. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(lVar8 + 0x4b0))(*(undefined8 *)(lVar8 + 0x608),param_3,(long)(int)param_3[4],0,10);
    return;
  }
  iVar3 = *(int *)((long)param_3 + 0x24);
  iVar4 = 0;
  if ((long)iVar3 != 0) {
    iVar4 = (int)(((long)(int)param_3[4] - 0x40U) / (ulong)(long)iVar3);
  }
  (**(code **)(lVar8 + 0x4b0))
            (*(undefined8 *)(lVar8 + 0x608),param_3[8],(long)iVar3 * (long)iVar4,0,10);
  bVar6 = DAT_00d1f720;
  cVar5 = DAT_00d1f618;
  param_3 = param_3 + -1;
  lVar7 = *param_3;
  lVar9 = (long)(char)DAT_00d1f720;
  lVar8 = *(long *)(param_1 + 0x60);
  lVar10 = *(long *)(lVar7 + 0x28);
  if ((lVar10 == 0) && (*(int *)(lVar7 + 0x30) < 0)) {
    lVar1 = lVar8 + 0x70;
    lVar11 = *(long *)(lVar1 + lVar9 * 8);
    *(long *)(lVar7 + 0x18) = lVar11;
    if (lVar11 != 0) {
      *(long *)(lVar11 + 0x10) = lVar7;
    }
    *(long *)(lVar1 + lVar9 * 8) = lVar7;
  }
  iVar3 = *(int *)(lVar7 + 0x34);
  *param_3 = lVar10;
  *(long **)(lVar7 + 0x28) = param_3;
  iVar3 = iVar3 + -1;
  *(int *)(lVar7 + 0x34) = iVar3;
  if (iVar3 != 0) {
    return;
  }
  lVar9 = *(long *)(lVar7 + 0x10);
  lVar10 = *(long *)(lVar7 + 0x18);
  if (lVar10 != 0) {
    *(long *)(lVar10 + 0x10) = lVar9;
  }
  if (lVar9 == 0) {
    lVar8 = lVar8 + 0x70;
    if (*(long *)(lVar8 + (ulong)bVar6 * 8) == lVar7) {
      *(long *)(lVar8 + (ulong)bVar6 * 8) = lVar10;
    }
  }
  else {
    *(long *)(lVar9 + 0x18) = lVar10;
  }
                    /* WARNING: Could not recover jumptable at 0x008b8168. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)(param_1 + 0x60) + 0x48))
            (cVar5,*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x50),lVar7,
             (long)*(int *)(lVar7 + 0x20),0);
  return;
}

