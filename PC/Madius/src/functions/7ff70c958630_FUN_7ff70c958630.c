/* 7ff70c958630 FUN_7ff70c958630 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong * FUN_7ff70c958630(ulonglong *param_1)

{
  undefined1 auVar1 [16];
  undefined4 uVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  float10 in_ST0;
  undefined1 auStack_10 [8];
  
  if (DAT_7ff70cc1ad60 == '\x01') {
    uVar3 = func_0x7ff70d9feeb4(auStack_10);
    *(short *)(uVar3 - 0x75) = (short)in_ST0;
    if ((uVar3 & 0xffffffffffffff28 | _DAT_7ff70cc1ad68) >> 0x20 == 0) {
      uVar4 = (uVar3 & 0xffffff28) / (_DAT_7ff70cc1ad68 & 0xffffffff);
      uVar3 = (uVar3 & 0xffffff28) % (_DAT_7ff70cc1ad68 & 0xffffffff);
    }
    else {
      auVar1._8_8_ = (longlong)uVar3 >> 0x3f;
      auVar1._0_8_ = uVar3 & 0xffffffffffffff28;
      uVar4 = SUB168(auVar1 / SEXT816((longlong)_DAT_7ff70cc1ad68),0);
      uVar3 = SUB168(auVar1 % SEXT816((longlong)_DAT_7ff70cc1ad68),0);
    }
    uVar3 = uVar3 * 1000000;
    if ((uVar3 | _DAT_7ff70cc1ad68) >> 0x20 == 0) {
      uVar2 = (undefined4)((uVar3 & 0xffffffff) / (_DAT_7ff70cc1ad68 & 0xffffffff));
    }
    else {
      uVar2 = (undefined4)((longlong)uVar3 / (longlong)_DAT_7ff70cc1ad68);
    }
    *param_1 = uVar4;
    *(undefined4 *)(param_1 + 1) = uVar2;
    return param_1;
  }
  func_0x7ff70d6fd987();
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


