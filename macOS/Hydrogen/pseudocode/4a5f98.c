
void FUN_004a5f98(undefined8 param_1,undefined1 param_2 [16])

{
  int iVar1;
  long lVar2;
  undefined8 in_x9;
  undefined8 in_x12;
  undefined8 *unaff_x19;
  long unaff_x23;
  int unaff_w24;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uStack0000000000000080;
  long *in_stack_00000088;
  undefined1 uStack0000000000000098;
  
  *(undefined8 *)(unaff_x23 + 0x88) = *(undefined8 *)(unaff_x23 + 0x40);
  *unaff_x19 = param_1;
  unaff_x19[1] = in_x12;
  uVar4 = *(undefined8 *)(unaff_x23 + 0x78);
  uVar3 = *(undefined8 *)(unaff_x23 + 0x70);
  uVar6 = *(undefined8 *)(unaff_x23 + 0x88);
  uVar5 = *(undefined8 *)(unaff_x23 + 0x80);
  unaff_x19[3] = param_2._8_8_;
  unaff_x19[2] = param_2._0_8_;
  unaff_x19[5] = uVar4;
  unaff_x19[4] = uVar3;
  unaff_x19[7] = uVar6;
  unaff_x19[6] = uVar5;
  unaff_x19[8] = in_x9;
  iVar1 = 0;
  if (uStack0000000000000080 != 2) {
    iVar1 = unaff_w24;
  }
  if (iVar1 == 1) {
    func_0x005ec378(&uStack0000000000000080,&uStack0000000000000098);
    lVar2 = uStack0000000000000080;
    if ((uStack0000000000000080 != 2) &&
       (func_0x005ec3ac(&uStack0000000000000080,*(undefined8 *)(unaff_x23 + 0x18)), lVar2 != 0)) {
      lVar2 = *in_stack_00000088;
      *in_stack_00000088 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        DataMemoryBarrier(2,1);
        func_0x005e80f0((ulong)&uStack0000000000000080 | 8);
      }
    }
  }
  return;
}

