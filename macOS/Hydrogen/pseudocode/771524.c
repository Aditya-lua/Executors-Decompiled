
void FUN_00771524(void)

{
  long unaff_x19;
  undefined8 *puVar1;
  long unaff_x20;
  
  *(undefined8 *)(unaff_x20 + 0xc0) = 0;
  if ((*(byte *)(unaff_x20 + 0xdb) >> 3 & 1) != 0) {
    func_0x00729820(unaff_x20 + 0x68);
  }
  func_0x00773bfc();
  puVar1 = *(undefined8 **)(unaff_x19 + 0x1b8);
  if (puVar1 != (undefined8 *)0x0) {
    func_0x0073fefc();
    func_0x00779fa4(*puVar1);
    **(undefined8 **)(unaff_x19 + 0x1b8) = 0;
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)(unaff_x19 + 0x1b8) = 0;
  }
  return;
}

