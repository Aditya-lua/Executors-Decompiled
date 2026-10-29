/* 7ff70c91fb90 FUN_7ff70c91fb90 */

undefined8 FUN_7ff70c91fb90(undefined8 *param_1)

{
  undefined8 *puVar1;
  char *pcVar2;
  char *pcVar3;
  ulonglong uVar4;
  longlong lVar5;
  longlong *plVar6;
  longlong lVar7;
  int7 iVar9;
  undefined8 uVar8;
  byte *pbVar10;
  int iVar11;
  uint uVar12;
  char *pcVar13;
  char *pcVar14;
  uint uStack_18;
  byte bStack_14;
  longlong lStack_10;
  byte bStack_8;
  
  *(longlong *)*param_1 = *(longlong *)*param_1 + 1;
  uStack_18 = 0;
  bStack_14 = 0x20;
  lStack_10 = 0;
  bStack_8 = 100;
  pbVar10 = *(byte **)*param_1;
  if ((*pbVar10 | 2) == 0x3e) {
    *(byte **)*param_1 = pbVar10 + 1;
    uStack_18 = (uint)(*pbVar10 != 0x3c);
  }
  puVar1 = *(undefined8 **)param_1[1];
  pcVar2 = (char *)*puVar1;
  pcVar3 = *(char **)((undefined8 *)param_1[1])[1];
  if (pcVar2 == pcVar3) {
LAB_7ff70c91fc3c:
    pcVar2 = *(char **)*param_1;
    if ((pcVar2 != *(char **)param_1[2]) && (*pcVar2 == '{')) {
      lVar5 = *(longlong *)((undefined8 *)param_1[3])[1];
      if (**(longlong **)param_1[3] - lVar5 < 2) {
        return 0;
      }
      if (*(char *)(lVar5 + 1) != '}') {
        return 0;
      }
      *(char **)*param_1 = pcVar2 + 2;
      uVar4 = *(ulonglong *)param_1[4];
      lVar5 = *(longlong *)param_1[5];
      if ((uVar4 < (ulonglong)((((longlong *)param_1[5])[1] - lVar5 >> 3) * -0x5555555555555555)) &&
         (*(ulonglong *)param_1[4] = uVar4 + 1, *(int *)(lVar5 + 0x10 + uVar4 * 0x18) - 1U < 2)) {
        lStack_10 = (longlong)*(int *)(lVar5 + uVar4 * 0x18);
      }
      else {
        lStack_10 = 0;
      }
    }
  }
  else {
    iVar11 = 0;
    pcVar13 = pcVar2;
    do {
      pcVar14 = pcVar13;
      if (9 < (int)*pcVar13 - 0x30U) break;
      iVar11 = ((int)*pcVar13 - 0x30U) + iVar11 * 10;
      pcVar13 = pcVar13 + 1;
      pcVar14 = pcVar3;
    } while (pcVar13 != pcVar3);
    if ((pcVar14 == pcVar2) || (*puVar1 = pcVar14, iVar11 == -1)) goto LAB_7ff70c91fc3c;
    lStack_10 = (longlong)iVar11;
  }
  pcVar2 = *(char **)*param_1;
  if ((pcVar2 == *(char **)param_1[2]) || (*pcVar2 != ':')) goto LAB_7ff70c91fd9d;
  *(char **)*param_1 = pcVar2 + 1;
  plVar6 = (longlong *)*param_1;
  pbVar10 = (byte *)*plVar6;
  if ((((longlong)*(byte **)param_1[2] - (longlong)pbVar10 < 2) || (*pbVar10 == 0x7d)) ||
     ((lVar5 = *(longlong *)((undefined8 *)param_1[3])[1], 1 < **(longlong **)param_1[3] - lVar5 &&
      (*(char *)(lVar5 + 1) == '}')))) {
    if (pbVar10 == *(byte **)param_1[2]) goto LAB_7ff70c91fd9d;
    uVar12 = *pbVar10 - 0x48;
    if (uVar12 < 0x36) {
      if ((0x8114000001U >> ((ulonglong)uVar12 & 0x3f) & 1) != 0) goto LAB_7ff70c91fd8f;
      if ((ulonglong)uVar12 == 0x35) goto LAB_7ff70c91fd9d;
    }
    *plVar6 = (longlong)(pbVar10 + 1);
    bStack_14 = *pbVar10;
  }
  else {
    *plVar6 = (longlong)(pbVar10 + 1);
    bStack_14 = *pbVar10;
    plVar6 = (longlong *)*param_1;
    pbVar10 = (byte *)*plVar6;
LAB_7ff70c91fd8f:
    *plVar6 = (longlong)(pbVar10 + 1);
    bStack_8 = *pbVar10;
  }
LAB_7ff70c91fd9d:
  if ((*(char **)*param_1 != *(char **)param_1[2]) && (**(char **)*param_1 == '}')) {
    uVar4 = *(ulonglong *)param_1[4];
    lVar5 = *(longlong *)param_1[5];
    lVar7 = ((longlong *)param_1[5])[1] - lVar5;
    iVar9 = (int7)(lVar7 >> 0xb);
    if (uVar4 < (ulonglong)((lVar7 >> 3) * -0x5555555555555555)) {
      *(ulonglong *)param_1[4] = uVar4 + 1;
      uVar8 = FUN_7ff70c91fe20(lVar5 + uVar4 * 0x18,*(undefined8 *)param_1[6],&uStack_18);
      iVar9 = (int7)((ulonglong)uVar8 >> 8);
    }
    return CONCAT71(iVar9,1);
  }
  return 0;
}


