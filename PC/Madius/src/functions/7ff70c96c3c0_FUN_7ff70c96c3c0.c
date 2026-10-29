/* 7ff70c96c3c0 FUN_7ff70c96c3c0 */

void FUN_7ff70c96c3c0(longlong *param_1,longlong param_2)

{
  char *pcVar1;
  longlong lVar2;
  ulonglong uVar3;
  undefined1 uVar4;
  char *pcVar5;
  char *pcVar6;
  ulonglong uVar7;
  char *pcVar8;
  bool bVar9;
  
  lVar2 = *param_1;
  uVar3 = param_1[1];
  pcVar8 = (char *)param_1[2];
  if ((uVar3 <= (ulonglong)((longlong)pcVar8 - lVar2)) || (*pcVar8 != '{')) {
    *(undefined1 *)(param_1 + 3) = 1;
    uVar4 = 1;
    goto LAB_7ff70c96c48d;
  }
  pcVar1 = (char *)(lVar2 + uVar3);
  uVar4 = 1;
  if (pcVar8 == pcVar1) goto LAB_7ff70c96c48d;
  pcVar6 = pcVar8 + 1;
  param_1[2] = (longlong)pcVar6;
  bVar9 = pcVar6 == pcVar1;
  if ((bVar9) || ((*(byte *)(param_1 + 3) & 1) != 0)) {
LAB_7ff70c96c4a2:
    uVar7 = (longlong)pcVar6 - lVar2;
  }
  else if (((ulonglong)((longlong)pcVar6 - lVar2) < uVar3) && (pcVar5 = pcVar6, *pcVar6 == '}')) {
LAB_7ff70c96c477:
    uVar7 = (longlong)pcVar5 - lVar2;
    pcVar6 = pcVar5;
    bVar9 = false;
  }
  else {
    pcVar5 = pcVar8 + 2;
    param_1[2] = (longlong)pcVar5;
    bVar9 = true;
    if (pcVar5 != pcVar1) {
      uVar7 = ((longlong)pcVar8 - lVar2) + 2;
      pcVar8 = pcVar8 + 3;
      do {
        pcVar6 = pcVar8;
        if ((uVar7 < uVar3) && (pcVar6[-1] == '}')) {
          pcVar5 = pcVar6 + -1;
          pcVar8 = pcVar6 + -2;
          goto LAB_7ff70c96c477;
        }
        param_1[2] = (longlong)pcVar6;
        uVar7 = uVar7 + 1;
        pcVar8 = pcVar6 + 1;
      } while (pcVar6 != pcVar1);
      pcVar8 = pcVar6 + -1;
      goto LAB_7ff70c96c4a2;
    }
    uVar7 = (longlong)pcVar5 - lVar2;
    pcVar8 = pcVar6;
    pcVar6 = pcVar5;
    bVar9 = true;
  }
  if ((uVar7 < uVar3) && (*pcVar6 == '}')) {
    if (!bVar9) {
      param_1[2] = (longlong)(pcVar8 + 2);
      uVar4 = 0;
    }
  }
  else {
    *(undefined1 *)(param_1 + 3) = 1;
  }
LAB_7ff70c96c48d:
  *(undefined1 *)(param_2 + 1) = uVar4;
  return;
}


