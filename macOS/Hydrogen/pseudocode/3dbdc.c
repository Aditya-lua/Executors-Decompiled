
undefined8 FUN_0003dbdc(void)

{
  ulong uVar1;
  long *plVar2;
  code *pcVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  long unaff_x20;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  undefined7 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 uStack0000000000000080;
  undefined *in_stack_00000088;
  long *in_stack_00000098;
  
  lVar4 = func_0x006e671c();
  if (lVar4 != 0) {
    unaff_x20 = lVar4;
  }
  uVar5 = _strlen(unaff_x20);
  if (0x7ffffffffffffff7 < uVar5) goto LAB_0003de50;
  if (uVar5 < 0x17) {
    _uStack0000000000000070 = CONCAT17((char)uVar5,uStack0000000000000070);
    puVar8 = &uStack0000000000000060;
    if (uVar5 != 0) goto LAB_0003dc48;
  }
  else {
    uVar1 = (uVar5 & 0xfffffffffffffff8) + 8;
    if ((uVar5 | 7) != 0x17) {
      uVar1 = uVar5 | 7;
    }
    puVar8 = (undefined8 *)__Znwm(uVar1 + 1);
    _uStack0000000000000070 = uVar1 + 1 | 0x8000000000000000;
    uStack0000000000000060 = puVar8;
    in_stack_00000068 = uVar5;
LAB_0003dc48:
    _memmove(puVar8,unaff_x20,uVar5);
  }
  *(undefined1 *)((long)puVar8 + uVar5) = 0;
  func_0x00047adc(&uStack0000000000000048,&uStack0000000000000060);
  plVar2 = uStack0000000000000048;
  uStack0000000000000048 = (long *)0x0;
  in_stack_00000050 = 0;
  in_stack_00000058 = 0;
  uVar6 = __Znwm(0xa0);
  uVar7 = __Znwm(0x98);
  puVar8 = (undefined8 *)__Znwm(0x20);
  func_0x005edf2c(puVar8,0);
  *puVar8 = &UNK_009f9e90;
  puVar8[1] = &UNK_009fa020;
  puVar8[3] = &uStack0000000000000048;
  in_stack_00000040._7_1_ = '\x01';
  uStack0000000000000030._0_2_ = 0x3a;
  in_stack_00000028._7_1_ = '\0';
  uStack0000000000000018._0_1_ = 0;
  func_0x0004af28(uVar7,puVar8,1,0,&uStack0000000000000030,&uStack0000000000000018);
  func_0x0066e084(uVar6,plVar2,uVar7,0,0xffffffff,&UNK_008ba5c8,&UNK_008ba5c8);
  func_0x0003f450(&uStack0000000000000080);
  uStack0000000000000080 = &UNK_00a0c238;
  in_stack_00000088 = &UNK_00a0c3e0;
  if (in_stack_00000098 != (long *)0x0) {
    (**(code **)(*in_stack_00000098 + 8))();
  }
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(CONCAT71(uStack0000000000000018._1_7_,(undefined1)uStack0000000000000018));
  }
  if (in_stack_00000040._7_1_ < '\0') {
    __ZdlPv(CONCAT62(uStack0000000000000030._2_6_,(undefined2)uStack0000000000000030));
  }
  func_0x006e3964();
  if (in_stack_00000058 < 0) {
    __ZdlPv(uStack0000000000000048);
    (**(code **)(*plVar2 + 8))(plVar2);
    if ((long)_uStack0000000000000070 < 0) goto code_r0x0003de2c;
code_r0x0003ddb4:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
      return 1;
    }
  }
  else {
    (**(code **)(*plVar2 + 8))(plVar2);
    if (-1 < (long)_uStack0000000000000070) goto code_r0x0003ddb4;
code_r0x0003de2c:
    __ZdlPv(uStack0000000000000060);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
      return 1;
    }
  }
  ___stack_chk_fail();
LAB_0003de50:
  func_0x0001748c(&uStack0000000000000060);
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x3df98);
  (*pcVar3)();
}

