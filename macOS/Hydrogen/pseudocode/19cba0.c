
/* WARNING: Removing unreachable block (ram,0x0019cbf0) */

undefined1  [16] FUN_0019cba0(undefined8 param_1)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined8 *unaff_x20;
  long unaff_x22;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = param_1;
  uVar3 = func_0x0018e1ec();
  func_0x0019fb28();
  func_0x0019fb28(unaff_x22 + 8);
  uVar4 = _SecKeyCreateFromData(uVar3,*unaff_x20);
  if (uVar4 == 0) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1cd0);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x19cc68);
    (*pcVar2)();
  }
  _CFRelease(uVar3);
  auVar1._8_8_ = 0;
  auVar1._0_8_ = uVar4;
  return auVar1 << 0x40;
}

