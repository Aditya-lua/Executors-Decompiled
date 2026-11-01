
void FUN_00433a60(long param_1)

{
  long unaff_x20;
  undefined8 uVar1;
  undefined8 *puVar2;
  
  if (param_1 == 1) {
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
  func_0x004653b0();
  func_0x00465628();
  return;
}

