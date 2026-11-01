
/* WARNING: Removing unreachable block (ram,0x0004db6c) */
/* WARNING: Removing unreachable block (ram,0x0004dab4) */
/* WARNING: Removing unreachable block (ram,0x0004dbac) */

undefined8 FUN_0004d8fc(undefined8 param_1,ulong param_2)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  ulong unaff_x20;
  ulong uVar4;
  long lVar5;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  long unaff_x29;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined1 auVar8 [16];
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000090;
  
  if (unaff_x25 < param_2) {
    func_0x0001748c(unaff_x29 + -0x60);
    goto code_r0x0004dbe8;
  }
  if (unaff_x20 < 0x17) {
    *(char *)(unaff_x29 + -0x49) = (char)unaff_x20;
    lVar5 = unaff_x29 + -0x60;
    if (unaff_x20 != 0) goto LAB_0004d950;
  }
  else {
    uVar4 = (unaff_x20 & 0xfffffffffffffff8) + 8;
    if ((unaff_x20 | 7) != 0x17) {
      uVar4 = unaff_x20 | 7;
    }
    lVar5 = __Znwm(uVar4 + 1);
    *(ulong *)(unaff_x29 + -0x58) = unaff_x20;
    *(ulong *)(unaff_x29 + -0x50) = uVar4 + 1 | 0x8000000000000000;
    *(long *)(unaff_x29 + -0x60) = lVar5;
LAB_0004d950:
    _memmove(lVar5,param_1);
  }
  *(undefined1 *)(lVar5 + unaff_x20) = 0;
  in_stack_00000028 = unaff_x24[1];
  uStack0000000000000020 = *unaff_x24;
  in_stack_00000030 = *(long *)(unaff_x29 + -0x50);
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0x60,&uStack0000000000000020,0);
  uVar4 = *(ulong *)(unaff_x29 + -0x60);
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if ((((uint)uVar4 & 0xff) != 0xff) && ((uVar4 & 0xff) != 0)) goto LAB_0004da58;
  auVar8 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000060);
  uVar4 = auVar8._8_8_;
  if (unaff_x25 < uVar4) {
    func_0x0001748c(unaff_x29 + -0x60);
code_r0x0004dbe8:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4dbec);
    (*pcVar2)();
  }
  if (uVar4 < 0x17) {
    *(char *)(unaff_x29 + -0x49) = auVar8[8];
    lVar5 = unaff_x29 + -0x60;
    if (uVar4 != 0) goto LAB_0004da18;
  }
  else {
    uVar1 = (uVar4 & 0xfffffffffffffff8) + 8;
    if ((uVar4 | 7) != 0x17) {
      uVar1 = uVar4 | 7;
    }
    lVar5 = __Znwm(uVar1 + 1);
    *(ulong *)(unaff_x29 + -0x58) = uVar4;
    *(ulong *)(unaff_x29 + -0x50) = uVar1 + 1 | 0x8000000000000000;
    *(long *)(unaff_x29 + -0x60) = lVar5;
LAB_0004da18:
    _memmove(lVar5,auVar8._0_8_,uVar4);
  }
  *(undefined1 *)(lVar5 + uVar4) = 0;
  in_stack_00000028 = unaff_x24[1];
  uStack0000000000000020 = *unaff_x24;
  in_stack_00000030 = *(long *)(unaff_x29 + -0x50);
  __ZNSt3__14__fs10filesystem20__create_directoriesERKNS1_4pathEPNS_10error_codeE
            (&uStack0000000000000020,0);
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
LAB_0004da58:
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0x60,&uStack0000000000000060,0);
  if ((*(char *)(unaff_x29 + -0x60) != '\0') && (*(char *)(unaff_x29 + -0x60) != -1)) {
    __ZNSt3__14__fs10filesystem8__removeERKNS1_4pathEPNS_10error_codeE(&uStack0000000000000060,0);
  }
  __ZNSt3__14__fs10filesystem6__copyERKNS1_4pathES4_NS1_12copy_optionsEPNS_10error_codeE
            (&uStack0000000000000040,&uStack0000000000000060,8,0);
  in_stack_00000028 = *(undefined8 *)(unaff_x29 + -0x70);
  uStack0000000000000020 = *(undefined8 *)(unaff_x29 + -0x78);
  in_stack_00000030 = *(long *)(unaff_x29 + -0x68);
  puVar3 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKcm
                     (&uStack0000000000000020,0,"rbxasset://",0xb);
  uVar7 = puVar3[1];
  uVar6 = *puVar3;
  *(undefined8 *)(unaff_x29 + -0x50) = puVar3[2];
  unaff_x24[1] = uVar7;
  *unaff_x24 = uVar6;
  puVar3[1] = 0;
  puVar3[2] = 0;
  *puVar3 = 0;
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  func_0x006e38d8();
  if (in_stack_00000050._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000040);
  }
  if (in_stack_00000070._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000060);
  }
  if (in_stack_00000090._7_1_ < '\0') {
    __ZdlPv(in_stack_00000080);
  }
  return 1;
}

