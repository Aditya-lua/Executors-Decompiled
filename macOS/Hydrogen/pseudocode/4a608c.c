
void FUN_004a608c(void)

{
  int iVar1;
  long lVar2;
  long unaff_x23;
  int unaff_w24;
  long in_stack_00000010;
  undefined8 uStack0000000000000080;
  long *in_stack_00000088;
  undefined1 uStack0000000000000098;
  
  if (in_stack_00000010 != 0) {
    func_0x00187bd4();
  }
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

