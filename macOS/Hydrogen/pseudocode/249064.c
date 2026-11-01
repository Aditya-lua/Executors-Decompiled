
void FUN_00249064(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 *unaff_x26;
  
  if ((code *)*unaff_x26 != (code *)0x0) {
    (*(code *)*unaff_x26)();
  }
  if (unaff_x26[1] != 0) {
    func_0x00187bd4();
  }
  *(undefined8 *)(unaff_x19 + 0x10) = unaff_x25;
  *(undefined8 *)(unaff_x19 + 0x18) = unaff_x24;
  if (0xfffffffffffeffff < unaff_x22) {
    unaff_x22 = 0xffffffffffff0000;
  }
  *(ulong *)(unaff_x19 + 0x30) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 0x38) = 0;
  *(undefined1 *)(unaff_x19 + 0x49) = 1;
  uVar1 = *(undefined8 *)(unaff_x19 + 0x20);
  puVar2 = *(undefined8 **)(unaff_x19 + 0x28);
  if ((code *)*puVar2 != (code *)0x0) {
    (*(code *)*puVar2)(uVar1);
  }
  if (puVar2[1] != 0) {
    func_0x00187bd4(uVar1,puVar2[1],puVar2[2]);
  }
  *(undefined8 *)(unaff_x19 + 0x20) = unaff_x21;
  *(undefined8 *)(unaff_x19 + 0x28) = unaff_x20;
  *(undefined8 *)(unaff_x19 + 0x40) = 0;
  *(undefined1 *)(unaff_x19 + 0x4a) = 1;
  return;
}

