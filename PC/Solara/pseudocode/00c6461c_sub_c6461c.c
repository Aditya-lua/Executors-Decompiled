/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void sub_c6461c(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int *unaff_RBP;
  undefined8 *unaff_RSI;
  int unaff_R14D;
  undefined *unaff_R15;
  undefined4 in_stack_00000070;
  
  if (((unaff_R14D == 1) && (_DAT_1810cfab0 != 0)) && (iVar1 = func_0x000180e32570(), iVar1 == 0)) {
    unaff_R15 = &UNK_180f8c230;
  }
  if (((unaff_RBP != (int *)0x0) && (1 < *unaff_RBP)) && (*(longlong *)(unaff_RBP + 2) != 0)) {
    uVar2 = FUN_180c66a10();
    uVar3 = FUN_180c66a10(unaff_R15);
    FUN_180c63110();
    FUN_180c14420(uVar3,&UNK_180f8c6a0,0x5fe);
    FUN_180c14420(uVar2,&UNK_180f8c6a0,0x5ff);
  }
  iVar1 = CryptAcquireContextW(unaff_RSI + 1);
  if (iVar1 == 0) {
    if (_DAT_1810cfa98 == 0) {
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    FUN_180c14970();
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    FUN_180c14bc0(_DAT_1810cfa98,0x68,0);
    FUN_180c14a90(&UNK_180f8c6a0,0x605,0);
    FUN_180c63290();
  }
  else {
    iVar1 = CryptGetUserKey(unaff_RSI[1],in_stack_00000070,unaff_RSI + 2);
    if (iVar1 != 0) {
      *(undefined4 *)(unaff_RSI + 3) = in_stack_00000070;
      *unaff_RSI = 0;
      return;
    }
    if (_DAT_1810cfa98 == 0) {
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    FUN_180c14970();
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    FUN_180c14bc0(_DAT_1810cfa98,0x75,0);
    FUN_180c14a90(&UNK_180f8c6a0,0x60a,0);
    FUN_180c63290();
    CryptReleaseContext(unaff_RSI[1],0);
  }
  FUN_180c14420();
  return;
}


