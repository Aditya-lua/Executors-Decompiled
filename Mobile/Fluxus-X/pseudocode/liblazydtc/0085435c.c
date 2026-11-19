/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085435c
 */

void FUN_0085435c(undefined4 *param_1,long *param_2)

{
  uint uVar1;
  uint uVar2;
  undefined4 uVar3;
  byte bVar4;
  long lVar5;
  undefined4 uVar6;
  ulong uVar7;
  ulong uVar8;
  int iVar9;
  long lVar10;
  undefined8 uVar11;
  ulong uVar12;
  byte bVar13;
  
  uVar2 = *(uint *)(param_2 + 2);
  uVar3 = *(undefined4 *)((long)param_2 + 0x14);
  uVar8 = param_2[1];
  if (uVar2 < uVar8) {
    bVar13 = *(byte *)(*param_2 + (ulong)uVar2);
  }
  else {
    bVar13 = 0;
  }
  uVar12 = (ulong)(uVar2 + 1);
  lVar5 = param_2[3];
  *(uint *)(param_2 + 2) = uVar2 + 1;
  uVar7 = uVar12;
  if (uVar12 < uVar8) {
    do {
      lVar10 = *param_2;
      bVar4 = *(byte *)(lVar10 + uVar7);
      if (bVar4 == bVar13) goto LAB_00854444;
      if (bVar4 == 0x5c) {
        FUN_00854258(param_2);
        uVar1 = *(uint *)(param_2 + 2);
        uVar8 = param_2[1];
      }
      else {
        if ((bVar4 < 0xe) && ((1 << (ulong)(bVar4 & 0x1f) & 0x2401U) != 0)) goto LAB_00854424;
        uVar1 = (int)uVar7 + 1;
        *(uint *)(param_2 + 2) = uVar1;
      }
      uVar7 = (ulong)uVar1;
    } while (uVar7 < uVar8);
  }
  if (bVar13 == 0) {
    lVar10 = *param_2;
LAB_00854444:
    iVar9 = (int)uVar7 + 1;
    *(int *)(param_2 + 2) = iVar9;
    uVar11 = CONCAT44(iVar9 - (int)param_2[3],*(undefined4 *)((long)param_2 + 0x14));
    lVar10 = lVar10 + uVar12;
    iVar9 = (int)uVar7 + ~uVar2;
    uVar6 = 0x117;
  }
  else {
LAB_00854424:
    iVar9 = 0;
    lVar10 = 0;
    uVar11 = CONCAT44((int)uVar7 - (int)param_2[3],*(undefined4 *)((long)param_2 + 0x14));
    uVar6 = 0x11e;
  }
  *param_1 = uVar6;
  *(undefined8 *)(param_1 + 3) = uVar11;
  param_1[5] = iVar9;
  *(ulong *)(param_1 + 1) = CONCAT44(uVar2 - (int)lVar5,uVar3);
  *(long *)(param_1 + 6) = lVar10;
  return;
}

