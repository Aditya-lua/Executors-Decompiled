
void FUN_00235fb0(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long unaff_x29;
  undefined1 auVar4 [16];
  undefined1 uStack0000000000000010;
  undefined1 auStack_88 [72];
  
  if (*(long *)(unaff_x29 + -0x78) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x70),*(long *)(unaff_x29 + -0x78),1);
  }
  func_0x00208ff4(&uStack0000000000000010);
  __Unwind_Resume(param_1);
  func_0x00187bd4();
  auVar4 = __Unwind_Resume(param_1);
  puVar3 = auVar4._8_8_;
  func_0x002360f0(auStack_88,auVar4._0_8_,(*(byte *)(puVar3 + 0x66) ^ 0xff) & 1);
  auVar4 = func_0x0023715c(*(undefined8 *)(auVar4._0_8_ + 0x10),auStack_88);
  uVar1 = puVar3[4];
  puVar2 = (undefined8 *)puVar3[5];
  if ((code *)*puVar2 != (code *)0x0) {
    (*(code *)*puVar2)(uVar1);
  }
  if (puVar2[1] != 0) {
    func_0x00187bd4(uVar1,puVar2[1],puVar2[2]);
  }
  *(undefined1 (*) [16])(puVar3 + 4) = auVar4;
  puVar3[8] = 0;
  *(undefined1 *)((long)puVar3 + 0x4a) = 2;
  *puVar3 = 0;
  func_0x00252db4(auStack_88);
  return;
}

