
void FUN_0049a730(void)

{
  undefined8 *puVar1;
  undefined8 *extraout_x8;
  char *unaff_x20;
  char in_wzr;
  undefined8 uVar2;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000060;
  undefined1 uStack0000000000000078;
  
  if (*unaff_x20 == '\x01') {
    *unaff_x20 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  if (in_stack_00000008 < 3) {
    if (uStack0000000000000060 != 2) {
      func_0x005ec378(&uStack0000000000000060,&uStack0000000000000078);
    }
    func_0x00492ef0(&uStack0000000000000060);
  }
  __Unwind_Resume();
  puVar1 = (undefined8 *)func_0x007a2668();
  uVar2 = *puVar1;
  extraout_x8[1] = puVar1[1];
  *extraout_x8 = uVar2;
  extraout_x8[2] = puVar1[2];
  return;
}

