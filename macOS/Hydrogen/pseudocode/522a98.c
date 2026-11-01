
undefined8 FUN_00522a98(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long unaff_x29;
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack00000000000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  
  func_0x00516174(&uStack00000000000000e0);
  func_0x004e55c0(unaff_x29 + -0x90,&uStack00000000000000e0,&UNK_009ea460);
  *(undefined8 *)(unaff_x29 + -0x68) = *(undefined8 *)(unaff_x29 + -0xa8);
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xb0);
  *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(unaff_x29 + -0xa0);
  uVar1 = *(undefined8 *)(unaff_x29 + -0x88);
  func_0x00525f7c(&uStack00000000000000e0,unaff_x29 + -200,uVar1,*(undefined8 *)(unaff_x29 + -0x80))
  ;
  uVar2 = func_0x0051c5b4();
  if (*(long *)(unaff_x29 + -0x90) != 0) {
    func_0x00187bd4(uVar1,*(long *)(unaff_x29 + -0x90) << 4,8);
  }
  if (in_stack_00000060 != 0) {
    func_0x00187bd4(in_stack_00000068,in_stack_00000060 << 4,8);
  }
  if (in_stack_00000088 != 0) {
    puVar3 = (undefined8 *)(in_stack_00000080 + 8);
    do {
      if (puVar3[-1] != 0) {
        func_0x00187bd4(*puVar3,puVar3[-1] << 4,8);
      }
      puVar3 = puVar3 + 3;
      in_stack_00000088 = in_stack_00000088 + -1;
    } while (in_stack_00000088 != 0);
  }
  if (in_stack_00000078 != 0) {
    func_0x00187bd4(in_stack_00000080,in_stack_00000078 * 0x18,8);
  }
  return uVar2;
}

