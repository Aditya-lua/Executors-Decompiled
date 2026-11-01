
long FUN_001605cc(long param_1)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  undefined8 extraout_x1;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  
  auVar7 = func_0x007b6a80(*(undefined8 *)(param_1 + 0x4e8));
  uVar6 = *(undefined8 *)PTR__NSPasteboardTypeString_009b0018;
  auVar8 = func_0x007b6320(uRam0000000000a27578,auVar7._8_8_,uVar6);
  auVar8 = func_0x007b63a0(auVar7._0_8_,auVar8._8_8_,auVar8._0_8_);
  iVar3 = func_0x007b6c60(auVar8._0_8_,auVar8._8_8_,uVar6);
  if ((iVar3 == 0) || (lVar5 = func_0x007b7d40(auVar7._0_8_,extraout_x1,uVar6), lVar5 == 0)) {
    return 0;
  }
  uVar6 = func_0x007b6100();
  iVar3 = _strlen();
  if (((bRam0000000000a39828 & 1) == 0) && (iVar4 = ___cxa_guard_acquire(0xa39828), iVar4 != 0)) {
    lRam0000000000a39838 = 0;
    lRam0000000000a39830 = 0;
    ___cxa_atexit(&DAT_000e83d4,0xa39830,0);
    ___cxa_guard_release(0xa39828);
  }
  uVar1 = iVar3 + 1;
  if (iVar3 < lRam0000000000a39830._4_4_) {
  }
  else {
    iVar3 = lRam0000000000a39830._4_4_;
    if (lRam0000000000a39830 < 0) {
      iVar3 = lRam0000000000a39830._4_4_ + 1;
    }
    uVar2 = 8;
    if (lRam0000000000a39830._4_4_ != 0) {
      uVar2 = lRam0000000000a39830._4_4_ + (iVar3 >> 1);
    }
    if ((int)uVar2 <= (int)uVar1) {
      uVar2 = uVar1;
    }
    lVar5 = func_0x000b810c((long)(int)uVar2);
    if (lRam0000000000a39838 != 0) {
      _memcpy(lVar5,lRam0000000000a39838,(long)(int)lRam0000000000a39830);
      func_0x000b83d4(lRam0000000000a39838);
    }
    lRam0000000000a39830 = (ulong)uVar2 << 0x20;
    lRam0000000000a39838 = lVar5;
  }
  lRam0000000000a39830 = CONCAT44(lRam0000000000a39830._4_4_,uVar1);
  _strcpy(lRam0000000000a39838,uVar6);
  return lRam0000000000a39838;
}

