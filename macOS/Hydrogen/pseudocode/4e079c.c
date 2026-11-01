
void FUN_004e079c(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 uVar3;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long *unaff_x27;
  
  while( true ) {
    if (unaff_x22 == 0) {
      lVar2 = 1;
    }
    else {
      lVar2 = func_0x00187bd0(unaff_x22,1);
      if (lVar2 == 0) {
        uVar3 = 1;
        goto LAB_004e0864;
      }
    }
    _memcpy(lVar2,unaff_x24,unaff_x22);
    unaff_x27[-1] = unaff_x22;
    *unaff_x27 = lVar2;
    unaff_x27[1] = unaff_x22;
    if (unaff_x26 == unaff_x25) {
      *(long *)(unaff_x19 + 0x10) = unaff_x20 + unaff_x25 + 1;
      return;
    }
    unaff_x22 = unaff_x21[3];
    unaff_x21 = unaff_x21 + 2;
    unaff_x27 = unaff_x27 + 3;
    unaff_x25 = unaff_x25 + 1;
    if (unaff_x22 < 0) break;
    unaff_x24 = *unaff_x21;
  }
  uVar3 = 0;
  unaff_x22 = lVar2;
LAB_004e0864:
  func_0x007a1f00(uVar3,unaff_x22,&UNK_009ea398);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4e0878);
  (*pcVar1)();
}

