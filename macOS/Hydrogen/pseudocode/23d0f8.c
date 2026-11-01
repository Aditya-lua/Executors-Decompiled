
void FUN_0023d0f8(void)

{
  long *unaff_x19;
  undefined8 *unaff_x22;
  undefined2 unaff_w23;
  long unaff_x26;
  long unaff_x27;
  undefined8 uVar1;
  long lVar2;
  undefined8 in_stack_00000000;
  undefined8 uStack0000000000000100;
  long in_stack_00000118;
  undefined2 in_stack_00000120;
  undefined1 in_stack_00000198;
  long in_stack_00000250;
  long in_stack_00000268;
  long in_stack_00000280;
  undefined1 auStack_7ffffffe [2147483646];
  
  (*(code *)unaff_x22[4])(auStack_7ffffffe + 0x8000024e);
  uVar1 = *(undefined8 *)(unaff_x27 + 8);
  *(undefined8 *)(unaff_x26 + 0xe8) = *(undefined8 *)(unaff_x27 + 0x10);
  *(undefined8 *)(unaff_x26 + 0xe0) = uVar1;
  if (in_stack_00000250 == -0x7fffffffffffffd9) {
    *(undefined8 *)(unaff_x26 + 0x10) = *(undefined8 *)(unaff_x26 + 0xe8);
    *(undefined8 *)(unaff_x26 + 8) = *(undefined8 *)(unaff_x26 + 0xe0);
    in_stack_00000198 = 0xc;
    uStack0000000000000100 = 0x800000000000000a;
    in_stack_00000118 = in_stack_00000268;
    in_stack_00000120 = unaff_w23;
    func_0x0024a370(in_stack_00000000,&uStack0000000000000100);
    *unaff_x19 = -0x7fffffffffffffd9;
    if ((code *)*unaff_x22 != (code *)0x0) {
      (*(code *)*unaff_x22)();
    }
  }
  else {
    lVar2 = *(long *)(unaff_x27 + 0x20);
    unaff_x19[5] = *(long *)(unaff_x27 + 0x28);
    unaff_x19[4] = lVar2;
    unaff_x19[6] = in_stack_00000280;
    lVar2 = *(long *)(unaff_x26 + 0xe0);
    unaff_x19[2] = *(long *)(unaff_x26 + 0xe8);
    unaff_x19[1] = lVar2;
    unaff_x19[3] = in_stack_00000268;
    *unaff_x19 = in_stack_00000250;
    if ((code *)*unaff_x22 != (code *)0x0) {
      (*(code *)*unaff_x22)();
    }
  }
  if (unaff_x22[1] != 0) {
    func_0x00187bd4();
  }
  return;
}

