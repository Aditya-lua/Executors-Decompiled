
void FUN_000ee5cc(long param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  int *in_x9;
  int in_w10;
  long lVar5;
  short sVar6;
  undefined4 in_w11;
  undefined8 in_x12;
  int in_w13;
  undefined4 unaff_w19;
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  iVar2 = in_w10 + ((int)((ulong)in_x12 >> 0x20) + in_w13) * -6;
  *(short *)(in_x9 + 2) = (short)iVar2;
  lVar3 = param_1 + (long)iVar2 * 8;
  *(undefined4 *)(&UNK_000060dc + lVar3) = in_w11;
  *(undefined4 *)(&UNK_000060e0 + lVar3) = 0;
  *(undefined2 *)(&UNK_000060e0 + param_1 + (long)iVar2 * 8) = 1;
  *in_x9 = *in_x9 + 1;
  if (*(long *)(unaff_x20 + 8) != 0) {
    _memcpy();
    lVar3 = *(long *)(unaff_x20 + 8);
    if ((lVar3 != 0) && (lVar4 = *(long *)(unaff_x23 + 0x4c0), lVar4 != 0)) {
      lVar5 = (long)*(short *)(&UNK_000060d8 + lVar4);
      lVar1 = lVar4 + lVar5 * 8;
      if (*(int *)(&UNK_000060dc + lVar1) == *(int *)(&UNK_00003f58 + lVar4)) {
        sVar6 = *(short *)(&UNK_000060e2 + lVar1) + 1;
      }
      else {
        iVar2 = (*(short *)(&UNK_000060d8 + lVar4) + 1) % 6;
        *(short *)(&UNK_000060d8 + lVar4) = (short)iVar2;
        lVar5 = (long)iVar2;
        lVar1 = lVar4 + (long)iVar2 * 8;
        *(int *)(&UNK_000060dc + lVar1) = *(int *)(&UNK_00003f58 + lVar4);
        *(undefined4 *)(&UNK_000060e0 + lVar1) = 0;
        sVar6 = 1;
      }
      *(short *)(&UNK_000060e2 + lVar4 + lVar5 * 8) = sVar6;
      *(int *)(&UNK_000060d4 + lVar4) = *(int *)(&UNK_000060d4 + lVar4) + 1;
    }
    (*pcRam0000000000a28da8)(lVar3,*(undefined8 *)(unaff_x22 + 0xa18));
  }
  *(undefined8 *)(unaff_x20 + 8) = unaff_x21;
  *(undefined4 *)(unaff_x20 + 4) = unaff_w19;
  return;
}

