/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085411c
 */

void FUN_0085411c(undefined4 *param_1,long *param_2,undefined8 *param_3,uint param_4,
                 undefined4 param_5,undefined4 param_6)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  uint uVar7;
  uint uVar8;
  ulong uVar9;
  undefined8 uVar10;
  ulong uVar11;
  uint uVar12;
  char cVar13;
  
  uVar11 = param_2[1];
  uVar1 = (int)param_2[2] + 1;
  uVar3 = (ulong)uVar1;
  *(uint *)(param_2 + 2) = uVar1;
  if (uVar3 < uVar11) {
    lVar6 = *param_2;
    iVar4 = *(int *)((long)param_2 + 0x14);
    uVar9 = uVar3;
    do {
      cVar13 = *(char *)(lVar6 + uVar9);
      uVar7 = (uint)uVar9;
      if (cVar13 == '\n') {
        iVar4 = iVar4 + 1;
        *(int *)((long)param_2 + 0x14) = iVar4;
        *(uint *)(param_2 + 3) = uVar7 + 1;
LAB_00854154:
        uVar9 = (ulong)(uVar7 + 1);
        *(uint *)(param_2 + 2) = uVar7 + 1;
      }
      else {
        if (cVar13 != ']') {
          if (cVar13 != '\0') goto LAB_00854154;
          break;
        }
        uVar8 = uVar7 + 1;
        uVar9 = (ulong)uVar8;
        *(uint *)(param_2 + 2) = uVar8;
        if (uVar9 < uVar11) {
          uVar12 = 0;
          do {
            cVar13 = *(char *)(lVar6 + uVar9);
            if (cVar13 != '=') goto LAB_008541c0;
            iVar2 = uVar7 + uVar12;
            uVar12 = uVar12 + 1;
            uVar8 = iVar2 + 2;
            uVar9 = (ulong)uVar8;
            *(uint *)(param_2 + 2) = uVar8;
          } while (uVar9 < uVar11);
          cVar13 = '\0';
LAB_008541c0:
          uVar8 = uVar7 + uVar12 + 1;
          uVar9 = (ulong)uVar8;
          if (cVar13 != ']') {
            uVar12 = ~uVar12;
          }
          if (uVar12 == param_4) {
LAB_008541ec:
            *(uint *)(param_2 + 2) = uVar8 + 1;
            lVar6 = lVar6 + uVar3;
            uVar5 = CONCAT44((uVar8 + 1) - (int)param_2[3],iVar4);
            iVar2 = uVar8 + ~(uVar1 + param_4);
            goto LAB_0085423c;
          }
        }
        else {
          uVar9 = (ulong)uVar8;
          if (param_4 == 0xffffffff) goto LAB_008541ec;
        }
      }
      uVar7 = (uint)uVar9;
    } while (uVar9 < uVar11);
  }
  else {
    iVar4 = *(int *)((long)param_2 + 0x14);
    uVar7 = uVar1;
  }
  iVar2 = 0;
  uVar5 = CONCAT44(uVar7 - (int)param_2[3],iVar4);
  lVar6 = 0;
  param_5 = param_6;
LAB_0085423c:
  uVar10 = *param_3;
  *param_1 = param_5;
  *(undefined8 *)(param_1 + 3) = uVar5;
  *(undefined8 *)(param_1 + 1) = uVar10;
  param_1[5] = iVar2;
  *(long *)(param_1 + 6) = lVar6;
  return;
}

