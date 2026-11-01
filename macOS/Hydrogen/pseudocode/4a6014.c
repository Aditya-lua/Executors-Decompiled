
void FUN_004a6014(undefined8 param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 in_x9;
  long unaff_x19;
  undefined8 *puVar5;
  long unaff_x23;
  int unaff_w24;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000080;
  long *in_stack_00000088;
  undefined1 uStack0000000000000098;
  
  *(undefined8 *)(unaff_x19 + 0x10) = param_1;
  *(undefined8 *)(unaff_x19 + 0x18) = in_x9;
  lVar2 = *(long *)(unaff_x23 + 0x38);
  lVar3 = *(long *)(unaff_x23 + 0x40) + 1;
  lVar4 = lVar2;
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x00489ff8(lVar4);
    lVar4 = lVar4 + 0x90;
  }
  if (*(long *)(unaff_x23 + 0x30) != 0) {
    func_0x00187bd4(lVar2,*(long *)(unaff_x23 + 0x30) * 0x90,8);
  }
  if (in_stack_00000020 != 0) {
    puVar5 = (undefined8 *)(in_stack_00000018 + 8);
    do {
      if (puVar5[-1] != 0) {
        func_0x00187bd4(*puVar5,puVar5[-1],1);
      }
      puVar5 = puVar5 + 3;
      in_stack_00000020 = in_stack_00000020 + -1;
    } while (in_stack_00000020 != 0);
  }
  if (in_stack_00000010 != 0) {
    func_0x00187bd4(in_stack_00000018,in_stack_00000010 * 0x18,8);
  }
  iVar1 = 0;
  if (uStack0000000000000080 != 2) {
    iVar1 = unaff_w24;
  }
  if (iVar1 == 1) {
    func_0x005ec378(&uStack0000000000000080,&uStack0000000000000098);
    lVar3 = uStack0000000000000080;
    if ((uStack0000000000000080 != 2) &&
       (func_0x005ec3ac(&uStack0000000000000080,*(undefined8 *)(unaff_x23 + 0x18)), lVar3 != 0)) {
      lVar3 = *in_stack_00000088;
      *in_stack_00000088 = lVar3 + -1;
      LORelease();
      if (lVar3 == 1) {
        DataMemoryBarrier(2,1);
        func_0x005e80f0((ulong)&uStack0000000000000080 | 8);
      }
    }
  }
  return;
}

