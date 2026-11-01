
void FUN_004e8c7c(long param_1)

{
  long lVar1;
  undefined4 *puVar2;
  long *plVar3;
  long *unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x21;
  undefined4 *unaff_x25;
  undefined8 unaff_x26;
  long unaff_x29;
  long lStack0000000000000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined1 uStack000000000000004c;
  undefined8 uStack0000000000000058;
  long lStack0000000000000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  
  lStack0000000000000000 = 4;
  lStack0000000000000010 = 1;
  lStack0000000000000008 = param_1;
  while( true ) {
    lVar1 = lStack0000000000000010;
    do {
      puVar2 = unaff_x25;
      if (puVar2 == unaff_x20) goto LAB_004e8d3c;
      unaff_x25 = puVar2 + 2;
    } while (*(char *)(puVar2 + 1) != '\x01');
    _uStack000000000000004c = *puVar2;
    *(undefined1 **)(unaff_x29 + -0x60) = &uStack000000000000004c;
    *(undefined8 *)(unaff_x29 + -0x58) = unaff_x26;
    uStack0000000000000058 = 1;
    uStack0000000000000068 = 1;
    uStack0000000000000070 = 0;
    lStack0000000000000060 = unaff_x29 + -0x60;
    func_0x00459f08(&uStack0000000000000030,(long)register0x00000008 + 0x50);
    if (uStack0000000000000030 == -0x8000000000000000) break;
    if (lVar1 == lStack0000000000000000) {
      func_0x007a5594();
      unaff_x21 = lStack0000000000000008;
    }
    plVar3 = (long *)(unaff_x21 + lVar1 * 0x18);
    plVar3[2] = in_stack_00000040;
    plVar3[1] = in_stack_00000038;
    *plVar3 = uStack0000000000000030;
    lStack0000000000000010 = lVar1 + 1;
  }
LAB_004e8d3c:
  unaff_x19[1] = lStack0000000000000008;
  *unaff_x19 = lStack0000000000000000;
  unaff_x19[2] = lStack0000000000000010;
  return;
}

