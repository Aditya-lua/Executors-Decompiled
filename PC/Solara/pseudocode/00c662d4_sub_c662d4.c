/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void sub_c662d4(void)

{
  undefined1 *puVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  undefined1 *puVar5;
  longlong unaff_RBP;
  int iVar6;
  longlong unaff_RDI;
  longlong unaff_R14;
  ulonglong in_stack_00000048;
  
  lVar3 = FUN_180c14360();
  if (lVar3 != 0) {
    iVar6 = (int)unaff_RDI;
    if (iVar6 != 0) {
      lVar4 = 0;
      puVar5 = (undefined1 *)(lVar3 + unaff_RDI);
      do {
        puVar1 = (undefined1 *)(unaff_R14 + lVar4);
        puVar5 = puVar5 + -1;
        lVar4 = lVar4 + 1;
        *puVar5 = *puVar1;
      } while (lVar4 < unaff_RDI);
    }
    iVar2 = CryptDecrypt(*(undefined8 *)(unaff_RBP + 0x10),0,1,0,lVar3);
    if (iVar2 == 0) {
      if (_DAT_1810cfa98 == 0) {
        _DAT_1810cfa98 = FUN_180c153b0();
      }
      FUN_180c14970();
      FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
      FUN_180c14bc0(_DAT_1810cfa98,0x6a,0);
      FUN_180c14a90(&UNK_180f8c6a0,0x3e3,0);
      FUN_180c63290();
      func_0x000180001240(lVar3,iVar6);
      FUN_180c14420(lVar3,&UNK_180f8c6a0,0x3e6);
    }
    else {
      FUN_180f29110();
      func_0x000180001240(lVar3,(longlong)iVar6);
      FUN_180c14420(lVar3,&UNK_180f8c6a0,0x3ec);
    }
  }
  FUN_180e155e0(in_stack_00000048 ^ (ulonglong)&stack0x00000000);
  return;
}


