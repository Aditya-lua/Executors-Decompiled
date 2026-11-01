
void FUN_001912e8(undefined8 param_1,undefined4 param_2)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  undefined8 *unaff_x19;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  
  if ((*(long *)PTR__kSecGuestAttributePid_009b0378 == 0) || (lVar2 = _CFRetain(), lVar2 == 0)) {
    func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0e70);
  }
  else {
    uStack0000000000000008 = lVar2;
    uStack0000000000000018._4_4_ = param_2;
    lVar3 = _CFNumberCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,3,
                            (long)&uStack0000000000000018 + 4);
    if (lVar3 != 0) {
      uStack0000000000000010 = lVar3;
      _CFDictionaryAddValue(*unaff_x19,lVar2,lVar3);
      func_0x0019fb28(&uStack0000000000000010);
      func_0x0019fb28(&uStack0000000000000008);
      return;
    }
  }
  func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c0ea0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x191398);
  (*pcVar1)();
}

