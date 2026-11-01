
/* WARNING: Removing unreachable block (ram,0x0019cbf0) */

undefined1  [16] FUN_0019cb90(void)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 *unaff_x20;
  undefined8 uStack0000000000000008;
  
  lVar3 = _CFRetain();
  if (lVar3 == 0) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c58);
  }
  else {
    uStack0000000000000008 = lVar3;
    uVar4 = func_0x0018e1ec();
    func_0x0019fb28();
    func_0x0019fb28(&uStack0000000000000008);
    uVar5 = _SecKeyCreateFromData(uVar4,*unaff_x20);
    if (uVar5 != 0) {
      _CFRelease(uVar4);
      auVar1._8_8_ = 0;
      auVar1._0_8_ = uVar5;
      return auVar1 << 0x40;
    }
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1cd0);
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x19cc68);
  (*pcVar2)();
}

