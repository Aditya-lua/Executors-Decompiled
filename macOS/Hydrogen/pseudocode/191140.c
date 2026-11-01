
void FUN_00191140(uint *param_1,byte param_2,undefined8 param_3)

{
  code *pcVar1;
  long lVar2;
  long *plVar3;
  undefined8 uVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [12];
  undefined8 uStack0000000000000008;
  long lStack_78;
  long lStack_70;
  undefined4 uStack_64;
  long lStack_28;
  undefined8 uStack_20;
  uint *puStack_18;
  
  if (param_2 < 3) {
    if (param_2 == 0) {
      plVar3 = (long *)PTR__kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly_009b0298;
    }
    else if (param_2 == 1) {
      plVar3 = (long *)PTR__kSecAttrAccessibleWhenUnlockedThisDeviceOnly_009b02a8;
    }
    else {
      plVar3 = (long *)PTR__kSecAttrAccessibleWhenUnlocked_009b02a0;
    }
  }
  else if (param_2 == 3) {
    plVar3 = (long *)PTR__kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly_009b0290;
  }
  else {
    if (param_2 != 4) {
      lVar2 = _SecAccessControlCreateWithFlags
                        (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,0,param_3,0);
      goto joined_r0x0019121c;
    }
    plVar3 = (long *)PTR__kSecAttrAccessibleAfterFirstUnlock_009b0288;
  }
  if ((*plVar3 == 0) || (lVar2 = _CFRetain(), lVar2 == 0)) {
    auVar5 = func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
    uStack_20 = param_3;
    puStack_18 = param_1;
    if ((*(long *)PTR__kSecGuestAttributeAudit_009b0370 != 0) &&
       (lStack_28 = _CFRetain(), lStack_28 != 0)) {
      _CFDictionaryAddValue(*auVar5._0_8_,lStack_28,auVar5._8_8_);
      func_0x0019fb28(&lStack_28);
      return;
    }
    auVar6 = func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
    if ((*(long *)PTR__kSecGuestAttributePid_009b0378 == 0) || (lVar2 = _CFRetain(), lVar2 == 0)) {
      func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
    }
    else {
      lStack_78 = lVar2;
      uStack_64 = auVar6._8_4_;
      lStack_70 = _CFNumberCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,3,&uStack_64);
      if (lStack_70 != 0) {
        _CFDictionaryAddValue(*auVar6._0_8_,lVar2,lStack_70);
        func_0x0019fb28(&lStack_70);
        func_0x0019fb28(&lStack_78);
        return;
      }
    }
    func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0ea0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x191398);
    (*pcVar1)();
  }
  uVar4 = *(undefined8 *)PTR__kCFAllocatorDefault_009b0238;
  uStack0000000000000008 = lVar2;
  func_0x0019fb28(&uStack0000000000000008);
  lVar2 = _SecAccessControlCreateWithFlags(uVar4,lVar2,param_3,0);
joined_r0x0019121c:
  if (lVar2 == 0) {
    param_1[1] = 0xffffffce;
  }
  else {
    *(long *)(param_1 + 2) = lVar2;
  }
  *param_1 = (uint)(lVar2 == 0);
  return;
}

