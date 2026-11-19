/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084aeac
 */

void FUN_0084aeac(long *param_1,long param_2,long param_3,long *param_4,uint param_5)

{
  long *plVar1;
  bool bVar2;
  ulong uVar3;
  long *plVar4;
  undefined1 *puVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  
  lVar6 = *param_1;
  lVar8 = param_4[6];
  lVar9 = param_1[1] - lVar6 >> 3;
  uVar3 = (param_4[1] - *param_4 >> 3) * -0x5555555555555555;
  bVar2 = (ulong)(lVar9 * -0x5555555555555555) <= uVar3;
  lVar9 = uVar3 + lVar9 * 0x5555555555555555;
  if (bVar2 && lVar9 != 0) {
    FUN_0084d3b8(param_1,lVar9);
    lVar6 = *param_1;
    lVar9 = param_1[1] - lVar6;
  }
  else if (bVar2) {
    lVar9 = param_1[1] - lVar6;
  }
  else {
    lVar9 = lVar6 + (param_4[1] - *param_4);
    param_1[1] = lVar9;
    lVar9 = lVar9 - lVar6;
  }
  if (lVar9 == 0) {
    param_2 = param_2 - lVar8;
  }
  else {
    plVar4 = (long *)*param_4;
    uVar3 = 0;
    puVar5 = (undefined1 *)(lVar6 + 0x10);
    lVar6 = param_4[1] - (long)plVar4;
    uVar7 = (lVar9 >> 3) * -0x5555555555555555;
    param_2 = param_2 - lVar8;
    if (uVar7 < 2) {
      uVar7 = 1;
    }
    do {
      bVar2 = (ulong)((lVar6 >> 3) * -0x5555555555555555) <= uVar3;
      uVar3 = uVar3 + 1;
      plVar1 = plVar4;
      if (bVar2) {
        plVar1 = param_4 + 3;
      }
      plVar4 = plVar4 + 3;
      *(long *)(puVar5 + -0x10) = param_2 + *plVar1;
      lVar9 = plVar1[2];
      *(long *)(puVar5 + -8) = param_2 + plVar1[1];
      *puVar5 = (char)lVar9;
      puVar5 = puVar5 + 0x18;
    } while (uVar7 != uVar3);
  }
  param_1[3] = param_3;
  param_1[4] = param_3;
  lVar6 = param_4[8];
  lVar9 = param_4[6];
  *(undefined1 *)(param_1 + 5) = 0;
  *(char *)(param_1 + 8) = (char)lVar6;
  param_1[6] = param_2 + lVar9;
  param_1[7] = param_2 + param_4[7];
  param_1[9] = param_2 + param_4[9];
  lVar6 = param_4[0xb];
  param_1[10] = param_2 + param_4[10];
  *(char *)(param_1 + 0xb) = (char)lVar6;
  if ((param_5 & 1) == 0) {
    param_1[0xd] = param_2 + lVar9;
  }
  *(char *)(param_1 + 0xc) = (char)param_4[0xc];
  return;
}

