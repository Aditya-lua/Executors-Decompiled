
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0004c170(long param_1)

{
  ulong uVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  ulong unaff_x20;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b8;
  
  uVar1 = param_1 + 8;
  if ((unaff_x20 | 7) != 0x17) {
    uVar1 = unaff_x20 | 7;
  }
  lVar3 = __Znwm(uVar1 + 1);
  uStack0000000000000060 = lVar3;
  _memmove(lVar3);
  *(undefined1 *)(lVar3 + unaff_x20) = 0;
  uStack0000000000000008 = _UNK_007fc000;
  in_stack_00000018 = 0;
  in_stack_00000010 = 0;
  in_stack_00000028 = 0;
  in_stack_00000020 = 0;
  in_stack_00000038 = 0;
  in_stack_00000030 = 0;
  in_stack_00000048 = 0;
  in_stack_00000040 = 0;
  in_stack_00000058 = 0;
  in_stack_00000050 = 0;
  *(undefined2 *)(unaff_x29 + -0xa0) = 0;
  *(undefined1 *)(unaff_x29 + -0x98) = 0;
  *(undefined1 *)(unaff_x29 + -0x50) = 0;
  *(undefined2 *)(unaff_x29 + -0x48) = 0;
  func_0x006bd97c(&uStack0000000000000078,&uStack0000000000000060,&uStack0000000000000008,
                  unaff_x29 + -0xa0,0xa27db8);
  if (*(char *)(unaff_x29 + -0x50) != '\0') {
    if (*(long *)(unaff_x29 + -0x70) != 0) {
      *(long *)(unaff_x29 + -0x68) = *(long *)(unaff_x29 + -0x70);
      __ZdlPv();
    }
    if (*(long *)(unaff_x29 + -0x98) != 0) {
      __ZdlPv();
    }
  }
  if ((long)(uVar1 + 1 | 0x8000000000000000) < 0) {
    __ZdlPv(uStack0000000000000060);
  }
  iVar2 = func_0x00700e1c();
  if (iVar2 == 0) {
    uVar4 = 1;
  }
  else {
    func_0x006e383c();
    func_0x006e1ee0();
    uVar4 = 2;
  }
  if (in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000078);
  }
  if (in_stack_000000a0._7_1_ < '\0') {
    __ZdlPv(in_stack_00000090);
  }
  if (in_stack_000000b8._7_1_ < '\0') {
    __ZdlPv(in_stack_000000a8);
  }
  return uVar4;
}

