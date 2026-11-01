
void FUN_004e11a8(long param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined1 auStack_48 [16];
  long lStack_38;
  
  lVar1 = *(long *)(param_1 + 8);
  lVar2 = *(long *)(param_1 + 0x10);
  func_0x0046a8c4(auStack_48,param_2);
  if (lVar2 != 0) {
    lVar2 = lVar2 * 0x30;
    do {
      lStack_38 = lVar1;
      func_0x00465960(auStack_48,&lStack_38,&UNK_009e97b8);
      lVar2 = lVar2 + -0x30;
      lVar1 = lVar1 + 0x30;
    } while (lVar2 != 0);
  }
  func_0x00465c80(auStack_48);
  return;
}

