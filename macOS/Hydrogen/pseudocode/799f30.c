
undefined8 FUN_00799f30(void)

{
  long lVar1;
  int iVar2;
  long in_x9;
  long lVar3;
  short sVar4;
  
  lVar3 = (long)*(short *)(&UNK_000060d8 + in_x9);
  lVar1 = in_x9 + lVar3 * 8;
  if (*(int *)(&UNK_000060dc + lVar1) == *(int *)(&UNK_00003f58 + in_x9)) {
    sVar4 = *(short *)(&UNK_000060e2 + lVar1) + 1;
  }
  else {
    iVar2 = (*(short *)(&UNK_000060d8 + in_x9) + 1) % 6;
    *(short *)(&UNK_000060d8 + in_x9) = (short)iVar2;
    lVar3 = (long)iVar2;
    lVar1 = in_x9 + (long)iVar2 * 8;
    *(int *)(&UNK_000060dc + lVar1) = *(int *)(&UNK_00003f58 + in_x9);
    *(undefined4 *)(&UNK_000060e0 + lVar1) = 0;
    sVar4 = 1;
  }
  *(short *)(&UNK_000060e2 + in_x9 + lVar3 * 8) = sVar4;
  *(int *)(&UNK_000060d4 + in_x9) = *(int *)(&UNK_000060d4 + in_x9) + 1;
  return 0;
}

