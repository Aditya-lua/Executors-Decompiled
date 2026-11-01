
void FUN_00243c20(void)

{
  long unaff_x19;
  long lVar1;
  long unaff_x20;
  
  while( true ) {
    lVar1 = unaff_x20;
    unaff_x19 = unaff_x19 + -1;
    if (unaff_x19 == 0) break;
    func_0x002417dc(lVar1);
    unaff_x20 = lVar1 + 0x80;
    if (*(long *)(lVar1 + 0x58) != 0) {
      func_0x00187bd4(*(undefined8 *)(lVar1 + 0x60),*(long *)(lVar1 + 0x58),1);
    }
  }
  return;
}

