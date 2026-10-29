/* 7ff70c942820 FUN_7ff70c942820 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c942820(longlong param_1)

{
  ulonglong uVar1;
  longlong lVar2;
  
  lVar2 = *(longlong *)(param_1 + 0xc70);
  if ((lVar2 != 0) &&
     ((*(longlong *)(param_1 + 0xe8) == 0 ||
      ((*(byte *)(*(longlong *)(param_1 + 0xe8) + 4) & 0x10) == 0)))) {
    if (*(longlong *)(param_1 + 0x6a8) != 0) {
      lVar2 = 0;
      uVar1 = 0;
      do {
        FUN_7ff70c942320(*(longlong *)(param_1 + 0xc70) + lVar2);
        uVar1 = uVar1 + 1;
        lVar2 = lVar2 + 0xa8;
      } while (uVar1 < *(ulonglong *)(param_1 + 0x6a8));
      lVar2 = *(longlong *)(param_1 + 0xc70);
    }
    (*_DAT_7ff70cbebad8)(lVar2);
    *(undefined8 *)(param_1 + 0xc70) = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x7ff70c9428ab. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(_DAT_7ff70cbec7c0 + 0x88))(param_1);
  return;
}


