
void FUN_0018c97c(long param_1)

{
  long lVar1;
  code *pcVar2;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x24;
  undefined8 *unaff_x25;
  long unaff_x26;
  long unaff_x27;
  undefined1 uStack0000000000000008;
  long lStack0000000000000010;
  long lStack0000000000000018;
  
  _uStack0000000000000008 = 4;
  lStack0000000000000018 = 1;
  lStack0000000000000010 = param_1;
  if (unaff_x27 < unaff_x26) {
    do {
      lVar1 = lStack0000000000000018;
      lVar3 = _CFArrayGetValueAtIndex(*unaff_x25,unaff_x20 + lStack0000000000000018);
      if (lVar3 == 0) {
        func_0x007a11c0(&UNK_0081b0e0,0x22,&UNK_009c1480);
LAB_0018cab0:
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x18cab4);
        (*pcVar2)();
      }
      lVar3 = _CFRetain();
      if (lVar3 == 0) {
        func_0x007a11c0(&UNK_00819c28,0x22,&UNK_009c0680);
        goto LAB_0018cab0;
      }
      if (lVar1 == _uStack0000000000000008) {
        func_0x0079ab9c(&uStack0000000000000008,lVar1,1,8,8);
        unaff_x21 = lStack0000000000000010;
      }
      *(long *)(unaff_x21 + lVar1 * 8) = lVar3;
      lStack0000000000000018 = lVar1 + 1;
    } while (unaff_x24 + lStack0000000000000018 != 0);
  }
  unaff_x19[1] = lStack0000000000000010;
  *unaff_x19 = _uStack0000000000000008;
  unaff_x19[2] = lStack0000000000000018;
  return;
}

