
undefined8 FUN_0008cadc(void)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  
  uVar2 = _IOServiceMatching("IOPlatformExpertDevice");
  uVar2 = _IOServiceGetMatchingService(*(undefined4 *)PTR__kIOMasterPortDefault_009b0270,uVar2);
  if ((int)uVar2 != 0) {
    lVar3 = _IORegistryEntryCreateCFProperty
                      (uVar2,0xa20650,*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,0);
    if (lVar3 != 0) {
      lVar4 = _CFGetTypeID(lVar3);
      lVar5 = _CFStringGetTypeID();
      if ((lVar4 == lVar5) &&
         (iVar1 = _CFStringGetCString(lVar3,&uStack0000000000000008,0x100,0x8000100), iVar1 != 0)) {
        func_0x0002a730();
      }
      _CFRelease(lVar3);
    }
    uVar2 = _IOObjectRelease(uVar2);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return uVar2;
  }
  uVar2 = ___stack_chk_fail();
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
    __ZdlPv(*unaff_x19);
  }
  __Unwind_Resume(uVar2);
  return 0;
}

