
void FUN_0026bf18(void)

{
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 *puVar1;
  
  if (unaff_x19 != 0) {
    puVar1 = (undefined8 *)(unaff_x20 + 8);
    do {
      if (puVar1[-1] != 0) {
        func_0x00187bd4(*puVar1,puVar1[-1],1);
      }
      puVar1 = puVar1 + 3;
      unaff_x19 = unaff_x19 + -1;
    } while (unaff_x19 != 0);
  }
  if (unaff_x21 != 0) {
    func_0x00187bd4();
  }
  return;
}

