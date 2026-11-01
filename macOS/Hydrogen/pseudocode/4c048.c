
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0004c048(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  ulong unaff_x24;
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
  ulong in_stack_00000068;
  undefined7 uStack0000000000000070;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_000000a0;
  undefined8 uStack00000000000000a8;
  ulong in_stack_000000b0;
  undefined7 uStack00000000000000b8;
  
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv();
  uVar4 = func_0x006e67c8();
  uVar5 = _strlen();
  if (unaff_x24 < uVar5) {
    func_0x0001748c(&uStack00000000000000a8);
    goto code_r0x0004c2f0;
  }
  if (uVar5 < 0x17) {
    _uStack00000000000000b8 = CONCAT17((char)uVar5,uStack00000000000000b8);
    puVar6 = &uStack00000000000000a8;
    if (uVar5 != 0) goto LAB_0004c0c8;
  }
  else {
    uVar1 = (uVar5 & 0xfffffffffffffff8) + 8;
    if ((uVar5 | 7) != 0x17) {
      uVar1 = uVar5 | 7;
    }
    puVar6 = (undefined8 *)__Znwm(uVar1 + 1);
    _uStack00000000000000b8 = uVar1 + 1 | 0x8000000000000000;
    uStack00000000000000a8 = puVar6;
    in_stack_000000b0 = uVar5;
LAB_0004c0c8:
    _memmove(puVar6,uVar4,uVar5);
  }
  *(undefined1 *)((long)puVar6 + uVar5) = 0;
  func_0x0004dd60(&uStack0000000000000090);
  func_0x006e3d18();
  func_0x006e3964();
  func_0x006e4c80();
  uVar4 = func_0x006e2ce4();
  uVar5 = _strlen();
  if (unaff_x24 < uVar5) {
code_r0x0004c2f0:
    func_0x0001748c(&uStack0000000000000060);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4c2fc);
    (*pcVar2)();
  }
  if (uVar5 < 0x17) {
    _uStack0000000000000070 = CONCAT17((char)uVar5,uStack0000000000000070);
    puVar6 = &uStack0000000000000060;
    if (uVar5 == 0) goto code_r0x0004c1ac;
  }
  else {
    uVar1 = (uVar5 & 0xfffffffffffffff8) + 8;
    if ((uVar5 | 7) != 0x17) {
      uVar1 = uVar5 | 7;
    }
    puVar6 = (undefined8 *)__Znwm(uVar1 + 1);
    _uStack0000000000000070 = uVar1 + 1 | 0x8000000000000000;
    uStack0000000000000060 = puVar6;
    in_stack_00000068 = uVar5;
  }
  _memmove(puVar6,uVar4,uVar5);
code_r0x0004c1ac:
  *(undefined1 *)((long)puVar6 + uVar5) = 0;
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
  if ((long)_uStack0000000000000070 < 0) {
    __ZdlPv(uStack0000000000000060);
  }
  iVar3 = func_0x00700e1c();
  if (iVar3 == 0) {
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
    __ZdlPv(uStack0000000000000090);
  }
  if ((long)_uStack00000000000000b8 < 0) {
    __ZdlPv(uStack00000000000000a8);
  }
  return uVar4;
}

