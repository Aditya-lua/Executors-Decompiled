
void FUN_00079c2c(void)

{
  undefined1 in_ZR;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  undefined1 *unaff_x22;
  undefined1 *puVar1;
  
  while (!(bool)in_ZR) {
    puVar1 = unaff_x22 + -0x10;
    func_0x00078220(unaff_x22 + -8,*puVar1);
    unaff_x22 = puVar1;
    in_ZR = puVar1 == unaff_x21;
  }
  *(undefined1 **)(unaff_x20 + 8) = unaff_x21;
  __ZdlPv(*(undefined8 *)*unaff_x19);
  return;
}

