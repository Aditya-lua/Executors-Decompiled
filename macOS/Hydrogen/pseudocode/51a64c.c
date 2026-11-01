
bool FUN_0051a64c(void)

{
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  undefined8 uVar1;
  undefined8 *puVar2;
  
  if ((unaff_x21 & 3) == 1) {
    uVar1 = *(undefined8 *)(unaff_x21 - 1);
    puVar2 = *(undefined8 **)(unaff_x21 + 7);
    if ((code *)*puVar2 != (code *)0x0) {
      (*(code *)*puVar2)(uVar1);
    }
    if (puVar2[1] != 0) {
      func_0x00187bd4(uVar1,puVar2[1],puVar2[2]);
    }
    func_0x00187bd4((undefined8 *)(unaff_x21 - 1),0x18,8);
  }
  *(long *)(unaff_x19 + 8) = unaff_x20;
  return unaff_x20 != 0;
}

