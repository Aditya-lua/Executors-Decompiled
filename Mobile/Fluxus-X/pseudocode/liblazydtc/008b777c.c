/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b777c
 */

long * FUN_008b777c(long param_1,long param_2,undefined4 param_3)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  long *plVar6;
  code *pcVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  
  lVar10 = *(long *)(param_1 + 0x60);
  if ((0x3ff < param_2 - 1U) || (uVar9 = (ulong)(char)(&DAT_00d1f6d8)[param_2], (long)uVar9 < 0)) {
    plVar6 = (long *)(**(code **)(lVar10 + 0x48))(*(undefined8 *)(lVar10 + 0x50),0,0,param_2);
    if (plVar6 == (long *)0x0) {
      return (long *)0x0;
    }
    goto LAB_008b786c;
  }
  lVar1 = lVar10 + 0x70;
  lVar5 = *(long *)(lVar1 + uVar9 * 8);
  if ((lVar5 == 0) && (lVar5 = FUN_008b8b7c(param_1,lVar1,uVar9 & 0xffffffff), lVar5 == 0)) {
    return (long *)0x0;
  }
  uVar2 = *(uint *)(lVar5 + 0x30);
  if ((int)uVar2 < 0) {
    plVar6 = *(long **)(lVar5 + 0x28);
    *(long *)(lVar5 + 0x28) = *plVar6;
    iVar3 = *(int *)(lVar5 + 0x34);
    *plVar6 = lVar5;
    *(int *)(lVar5 + 0x34) = iVar3 + 1;
    if (*(long *)(lVar5 + 0x28) == 0) goto LAB_008b7854;
  }
  else {
    iVar3 = *(int *)(lVar5 + 0x24);
    iVar4 = *(int *)(lVar5 + 0x34);
    lVar8 = *(long *)(lVar5 + 0x28);
    plVar6 = (long *)(lVar5 + (ulong)uVar2 + 0x40);
    *plVar6 = lVar5;
    iVar3 = uVar2 - iVar3;
    *(int *)(lVar5 + 0x30) = iVar3;
    *(int *)(lVar5 + 0x34) = iVar4 + 1;
    if ((lVar8 == 0) && (iVar3 < 0)) {
LAB_008b7854:
      lVar8 = *(long *)(lVar5 + 0x18);
      *(long *)(lVar1 + uVar9 * 8) = lVar8;
      if (lVar8 != 0) {
        *(undefined8 *)(lVar8 + 0x10) = 0;
      }
      *(undefined8 *)(lVar5 + 0x18) = 0;
    }
  }
  plVar6 = plVar6 + 1;
LAB_008b786c:
  lVar1 = lVar10 + (ulong)(byte)param_3 * 8;
  lVar5 = *(long *)(lVar1 + 0x3848);
  pcVar7 = *(code **)(lVar10 + 0x658);
  *(long *)(lVar10 + 0x10) = *(long *)(lVar10 + 0x10) + param_2;
  *(long *)(lVar1 + 0x3848) = lVar5 + param_2;
  if (pcVar7 != (code *)0x0) {
    (*pcVar7)(param_1,plVar6,0,param_2,param_3,0x10,0);
  }
  return plVar6;
}

