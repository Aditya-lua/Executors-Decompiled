
void FUN_000e8e08(long param_1)

{
  int *piVar1;
  int *piVar2;
  long lVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  short sVar7;
  
  lVar5 = lRam0000000000a334c0;
  if (param_1 != 0) {
    if (lRam0000000000a334c0 != 0) {
      piVar2 = (int *)(&UNK_000060d4 + lRam0000000000a334c0);
      piVar1 = (int *)(&UNK_00003f58 + lRam0000000000a334c0);
      lVar6 = (long)*(short *)(&UNK_000060d8 + lRam0000000000a334c0);
      lVar3 = lRam0000000000a334c0 + lVar6 * 8;
      if (*(int *)(&UNK_000060dc + lVar3) == *piVar1) {
        sVar7 = *(short *)(&UNK_000060e2 + lVar3) + 1;
      }
      else {
        iVar4 = (*(short *)(&UNK_000060d8 + lRam0000000000a334c0) + 1) % 6;
        *(short *)(&UNK_000060d8 + lRam0000000000a334c0) = (short)iVar4;
        lVar6 = (long)iVar4;
        lVar3 = lVar5 + (long)iVar4 * 8;
        *(int *)(&UNK_000060dc + lVar3) = *piVar1;
        *(undefined4 *)(&UNK_000060e0 + lVar3) = 0;
        sVar7 = 1;
      }
      *(short *)(&UNK_000060e2 + lVar5 + lVar6 * 8) = sVar7;
      *piVar2 = *piVar2 + 1;
    }
    (*pcRam0000000000a28da8)(param_1,uRam0000000000a33a18);
  }
  return;
}

