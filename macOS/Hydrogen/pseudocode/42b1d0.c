
void FUN_0042b1d0(void)

{
  undefined2 *unaff_x19;
  undefined8 uVar1;
  long unaff_x20;
  long unaff_x21;
  undefined8 *puVar2;
  
  *unaff_x19 = 0;
  if (unaff_x21 == 1) {
    uVar1 = *(undefined8 *)(unaff_x20 + -1);
    puVar2 = *(undefined8 **)(unaff_x20 + 7);
    if ((code *)*puVar2 != (code *)0x0) {
      (*(code *)*puVar2)(uVar1);
    }
    if (puVar2[1] != 0) {
      func_0x00187bd4(uVar1,puVar2[1],puVar2[2]);
    }
    func_0x00187bd4((undefined8 *)(unaff_x20 + -1),0x18,8);
  }
  return;
}

