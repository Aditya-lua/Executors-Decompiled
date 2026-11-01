
void FUN_0049822c(undefined1 param_1 [16])

{
  long lVar1;
  undefined8 *unaff_x22;
  ulong unaff_x27;
  undefined8 uStack0000000000000020;
  long *in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000080;
  
  unaff_x22[1] = param_1._8_8_;
  *unaff_x22 = param_1._0_8_;
  unaff_x22[2] = in_stack_00000080;
  if ((unaff_x27 < 3) && (uStack0000000000000020 != 2)) {
    func_0x005ec378(&uStack0000000000000020,&uStack0000000000000038);
    lVar1 = uStack0000000000000020;
    if ((uStack0000000000000020 != 2) &&
       (func_0x005ec3ac(&uStack0000000000000020,uStack0000000000000038), lVar1 != 0)) {
      lVar1 = *in_stack_00000028;
      *in_stack_00000028 = lVar1 + -1;
      LORelease();
      if (lVar1 == 1) {
        DataMemoryBarrier(2,1);
        func_0x005e80f0((ulong)&uStack0000000000000020 | 8);
      }
    }
  }
  return;
}

