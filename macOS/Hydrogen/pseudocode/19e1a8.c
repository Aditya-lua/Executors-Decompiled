
undefined8 FUN_0019e1a8(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  undefined8 uVar2;
  long lVar3;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  
  uVar2 = func_0x004653b0(param_1,param_2,6,&uStack0000000000000018);
  uStack0000000000000020 = _CFErrorGetCode();
  uVar2 = func_0x004653b0(uVar2,&UNK_0081c058,4,&uStack0000000000000020,&UNK_009c20b8);
  lVar3 = _CFErrorCopyDescription();
  if (lVar3 == 0) {
    func_0x007a11c0(&UNK_0081cb73,0x22,&UNK_009c2050);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x19e278);
    (*pcVar1)();
  }
  *(long *)(unaff_x29 + -0x18) = lVar3;
  func_0x004653b0(uVar2,&UNK_0081ccdd,0xb,unaff_x29 + -0x18,&UNK_009c2098);
  uVar2 = func_0x00465628();
  _CFRelease(*(undefined8 *)(unaff_x29 + -0x18));
  _CFRelease(uStack0000000000000018);
  return uVar2;
}

