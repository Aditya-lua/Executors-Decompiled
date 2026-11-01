
undefined8 FUN_00522db8(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long unaff_x29;
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_000000b0;
  long in_stack_000000c8;
  undefined8 in_stack_000000d0;
  
  iVar2 = func_0x0050f9f0();
  if (iVar2 != 0) {
    func_0x007a2810(&UNK_008a7790,0x37,unaff_x29 + -0x90,&UNK_009ea478,&UNK_009ea448);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x523028);
    (*pcVar1)();
  }
  *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x29 + -0x68);
  *(undefined8 *)(unaff_x29 + -0x90) = *(undefined8 *)(unaff_x29 + -0x70);
  *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0x60);
  *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xd8);
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xe0);
  *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xd0);
  uVar3 = func_0x0051b178();
  if (in_stack_000000c8 != 0) {
    func_0x00187bd4(in_stack_000000d0,in_stack_000000c8 << 4,8);
  }
  if (in_stack_000000b0 != 0) {
    func_0x00187bd4();
  }
  if (in_stack_00000060 != 0) {
    func_0x00187bd4(in_stack_00000068,in_stack_00000060 << 4,8);
  }
  if (in_stack_00000088 != 0) {
    puVar4 = (undefined8 *)(in_stack_00000080 + 8);
    do {
      if (puVar4[-1] != 0) {
        func_0x00187bd4(*puVar4,puVar4[-1] << 4,8);
      }
      puVar4 = puVar4 + 3;
      in_stack_00000088 = in_stack_00000088 + -1;
    } while (in_stack_00000088 != 0);
  }
  if (in_stack_00000078 != 0) {
    func_0x00187bd4(in_stack_00000080,in_stack_00000078 * 0x18,8);
  }
  return uVar3;
}

