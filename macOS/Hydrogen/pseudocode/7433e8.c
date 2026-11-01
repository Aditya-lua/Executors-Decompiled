
undefined8 FUN_007433e8(void)

{
  long unaff_x19;
  undefined8 *puVar1;
  undefined1 *unaff_x20;
  int unaff_w21;
  undefined8 *unaff_x22;
  undefined8 in_stack_00000018;
  
  *unaff_x22 = in_stack_00000018;
  (*pcRam0000000000a2b5f0)(unaff_x22[1]);
  unaff_x22[1] = in_stack_00000018;
  *(int *)(unaff_x22 + 2) = unaff_w21;
  if ((((byte)(&UNK_00001346)[unaff_x19] >> 3 & 1) != 0) || (unaff_w21 != -1)) {
    *unaff_x20 = 1;
    return 0;
  }
  func_0x0073c9e4();
  puVar1 = *(undefined8 **)(unaff_x19 + 0x1b0);
  if (puVar1 != (undefined8 *)0x0) {
    (*pcRam0000000000a2b5f0)(puVar1[1]);
    *puVar1 = 0;
    puVar1[1] = 0;
    if (*(int *)(puVar1 + 2) != -1) {
      _close();
    }
    *(undefined4 *)(puVar1 + 2) = 0xffffffff;
  }
  return 0x25;
}

