
void FUN_0045c87c(long param_1)

{
  ulong in_stack_00000000;
  long *in_stack_00000008;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long lStack0000000000000020;
  
  lStack0000000000000020 = param_1;
  if ((in_stack_00000000 & 1) != 0) {
    if ((ulong)(uStack0000000000000010 - param_1) < 3) {
      func_0x007a1e50(&uStack0000000000000010,param_1,3);
      param_1 = lStack0000000000000020;
    }
    *(undefined2 *)(in_stack_00000018 + param_1) = 0xbfef;
    *(undefined1 *)((undefined2 *)(in_stack_00000018 + param_1) + 1) = 0xbd;
    lStack0000000000000020 = param_1 + 3;
  }
  in_stack_00000008[1] = in_stack_00000018;
  *in_stack_00000008 = uStack0000000000000010;
  in_stack_00000008[2] = lStack0000000000000020;
  return;
}

