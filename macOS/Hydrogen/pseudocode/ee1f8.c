
void FUN_000ee1f8(int *param_1,ulong param_2)

{
  int *piVar1;
  int *piVar2;
  int iVar3;
  long lVar4;
  char in_NG;
  char in_OV;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  short sVar9;
  
  if (in_NG != in_OV) {
    uVar5 = (*pcRam0000000000a28da0)
                      (-(param_2 >> 0x1f & 1) & 0xffffffe000000000 | (param_2 & 0xffffffff) << 5,
                       uRam0000000000a33a18);
    lVar4 = lRam0000000000a334c0;
    if (lRam0000000000a334c0 != 0) {
      piVar2 = (int *)(&UNK_000060d0 + lRam0000000000a334c0);
      piVar1 = (int *)(&UNK_00003f58 + lRam0000000000a334c0);
      lVar7 = (long)*(short *)(&UNK_000060d8 + lRam0000000000a334c0);
      lVar6 = lRam0000000000a334c0 + lVar7 * 8;
      if (*(int *)(&UNK_000060dc + lVar6) == *piVar1) {
        sVar9 = *(short *)(&UNK_000060e0 + lVar6) + 1;
      }
      else {
        iVar3 = (*(short *)(&UNK_000060d8 + lRam0000000000a334c0) + 1) % 6;
        *(short *)(&UNK_000060d8 + lRam0000000000a334c0) = (short)iVar3;
        lVar7 = (long)iVar3;
        lVar6 = lVar4 + (long)iVar3 * 8;
        *(int *)(&UNK_000060dc + lVar6) = *piVar1;
        *(undefined4 *)(&UNK_000060e0 + lVar6) = 0;
        sVar9 = 1;
      }
      *(short *)(&UNK_000060e0 + lVar4 + lVar7 * 8) = sVar9;
      *piVar2 = *piVar2 + 1;
    }
    if (*(long *)(param_1 + 2) != 0) {
      _memcpy(uVar5,*(long *)(param_1 + 2),(long)*param_1 << 5);
      lVar4 = lRam0000000000a334c0;
      lVar6 = *(long *)(param_1 + 2);
      if ((lVar6 != 0) && (lRam0000000000a334c0 != 0)) {
        piVar2 = (int *)(&UNK_000060d4 + lRam0000000000a334c0);
        piVar1 = (int *)(&UNK_00003f58 + lRam0000000000a334c0);
        lVar8 = (long)*(short *)(&UNK_000060d8 + lRam0000000000a334c0);
        lVar7 = lRam0000000000a334c0 + lVar8 * 8;
        if (*(int *)(&UNK_000060dc + lVar7) == *piVar1) {
          sVar9 = *(short *)(&UNK_000060e2 + lVar7) + 1;
        }
        else {
          iVar3 = (*(short *)(&UNK_000060d8 + lRam0000000000a334c0) + 1) % 6;
          *(short *)(&UNK_000060d8 + lRam0000000000a334c0) = (short)iVar3;
          lVar8 = (long)iVar3;
          lVar7 = lVar4 + (long)iVar3 * 8;
          *(int *)(&UNK_000060dc + lVar7) = *piVar1;
          *(undefined4 *)(&UNK_000060e0 + lVar7) = 0;
          sVar9 = 1;
        }
        *(short *)(&UNK_000060e2 + lVar4 + lVar8 * 8) = sVar9;
        *piVar2 = *piVar2 + 1;
      }
      (*pcRam0000000000a28da8)(lVar6,uRam0000000000a33a18);
    }
    *(undefined8 *)(param_1 + 2) = uVar5;
    param_1[1] = (int)param_2;
  }
  return;
}

