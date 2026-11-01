
/* WARNING: Removing unreachable block (ram,0x0004db6c) */
/* WARNING: Removing unreachable block (ram,0x0004dab4) */
/* WARNING: Removing unreachable block (ram,0x0004d830) */
/* WARNING: Removing unreachable block (ram,0x0004d894) */
/* WARNING: Removing unreachable block (ram,0x0004dbac) */

undefined8 FUN_0004d6f8(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 *puVar7;
  ulong unaff_x25;
  long unaff_x29;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  long in_stack_00000070;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000088;
  undefined7 uStack0000000000000090;
  char cStack0000000000000097;
  
  uVar3 = func_0x006e67c8(param_1,param_2,0);
  uVar4 = _strlen();
  if (unaff_x25 < uVar4) {
    func_0x0001748c(unaff_x29 + -0x78);
LAB_0004dbd4:
    func_0x0001748c(unaff_x29 + -0x60);
    goto code_r0x0004dbe8;
  }
  if (uVar4 < 0x17) {
    *(char *)(unaff_x29 + -0x61) = (char)uVar4;
    lVar6 = unaff_x29 + -0x78;
    if (uVar4 != 0) goto LAB_0004d75c;
  }
  else {
    uVar1 = (uVar4 & 0xfffffffffffffff8) + 8;
    if ((uVar4 | 7) != 0x17) {
      uVar1 = uVar4 | 7;
    }
    lVar6 = __Znwm(uVar1 + 1);
    *(ulong *)(unaff_x29 + -0x70) = uVar4;
    *(ulong *)(unaff_x29 + -0x68) = uVar1 + 1 | 0x8000000000000000;
    *(long *)(unaff_x29 + -0x78) = lVar6;
LAB_0004d75c:
    _memmove(lVar6,uVar3,uVar4);
  }
  *(undefined1 *)(lVar6 + uVar4) = 0;
  func_0x0004dd60(&uStack0000000000000080);
  __ZNSt3__14__fs10filesystem14__current_pathEPNS_10error_codeE(&uStack0000000000000040,0);
  uStack0000000000000020 = 0;
  in_stack_00000028 = 0;
  in_stack_00000030 = 0;
  func_0x00017184(&uStack0000000000000020,"content","");
  puVar7 = (undefined8 *)(unaff_x29 + -0x60);
  if (in_stack_00000050 < 0) {
    func_0x00017634(unaff_x29 + -0x60,uStack0000000000000040,in_stack_00000048);
  }
  else {
    *(undefined8 *)(unaff_x29 + -0x58) = in_stack_00000048;
    *puVar7 = uStack0000000000000040;
    *(long *)(unaff_x29 + -0x50) = in_stack_00000050;
  }
  func_0x0001754c(unaff_x29 + -0x60,&uStack0000000000000020);
  uStack0000000000000008 = 0;
  in_stack_00000010 = 0;
  in_stack_00000018 = 0;
  uVar4 = *(ulong *)(unaff_x29 + -0x70);
  lVar6 = *(long *)(unaff_x29 + -0x78);
  if (-1 < (char)*(byte *)(unaff_x29 + -0x61)) {
    uVar4 = (ulong)*(byte *)(unaff_x29 + -0x61);
    lVar6 = unaff_x29 + -0x78;
  }
  func_0x00017184(&uStack0000000000000008,lVar6,lVar6 + uVar4);
  in_stack_00000068 = *(undefined8 *)(unaff_x29 + -0x58);
  uStack0000000000000060 = *puVar7;
  in_stack_00000070 = *(long *)(unaff_x29 + -0x50);
  func_0x0001754c(&uStack0000000000000060,&uStack0000000000000008);
  if (in_stack_00000018 < 0) {
    __ZdlPv(uStack0000000000000008);
  }
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
    if (in_stack_00000050 < 0) goto code_r0x0004d8b4;
code_r0x0004d868:
    if (-1 < cStack0000000000000097) goto code_r0x0004d870;
code_r0x0004d8c4:
    func_0x00017634(&uStack0000000000000040,uStack0000000000000080,in_stack_00000088);
  }
  else {
    if (-1 < in_stack_00000050) goto code_r0x0004d868;
code_r0x0004d8b4:
    __ZdlPv(uStack0000000000000040);
    if (cStack0000000000000097 < '\0') goto code_r0x0004d8c4;
code_r0x0004d870:
    in_stack_00000048 = in_stack_00000088;
    uStack0000000000000040 = uStack0000000000000080;
    in_stack_00000050 = CONCAT17(cStack0000000000000097,uStack0000000000000090);
  }
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0x60,&uStack0000000000000040,0);
  if ((*(char *)(unaff_x29 + -0x60) == -1) || (*(char *)(unaff_x29 + -0x60) == '\0')) {
    func_0x006e644c();
    goto code_r0x0004dbe8;
  }
  auVar9 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000060);
  uVar4 = auVar9._8_8_;
  if (unaff_x25 < uVar4) goto LAB_0004dbd4;
  if (uVar4 < 0x17) {
    *(char *)(unaff_x29 + -0x49) = auVar9[8];
    lVar6 = unaff_x29 + -0x60;
    if (uVar4 != 0) goto LAB_0004d950;
  }
  else {
    uVar1 = (uVar4 & 0xfffffffffffffff8) + 8;
    if ((uVar4 | 7) != 0x17) {
      uVar1 = uVar4 | 7;
    }
    lVar6 = __Znwm(uVar1 + 1);
    *(ulong *)(unaff_x29 + -0x58) = uVar4;
    *(ulong *)(unaff_x29 + -0x50) = uVar1 + 1 | 0x8000000000000000;
    *(long *)(unaff_x29 + -0x60) = lVar6;
LAB_0004d950:
    _memmove(lVar6,auVar9._0_8_,uVar4);
  }
  *(undefined1 *)(lVar6 + uVar4) = 0;
  in_stack_00000028 = *(undefined8 *)(unaff_x29 + -0x58);
  uStack0000000000000020 = *puVar7;
  in_stack_00000030 = *(long *)(unaff_x29 + -0x50);
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0x60,&uStack0000000000000020,0);
  uVar4 = *(ulong *)(unaff_x29 + -0x60);
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if ((((uint)uVar4 & 0xff) != 0xff) && ((uVar4 & 0xff) != 0)) goto LAB_0004da58;
  auVar9 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000060);
  uVar4 = auVar9._8_8_;
  if (unaff_x25 < uVar4) {
    func_0x0001748c(unaff_x29 + -0x60);
code_r0x0004dbe8:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4dbec);
    (*pcVar2)();
  }
  if (uVar4 < 0x17) {
    *(char *)(unaff_x29 + -0x49) = auVar9[8];
    lVar6 = unaff_x29 + -0x60;
    if (uVar4 != 0) goto LAB_0004da18;
  }
  else {
    uVar1 = (uVar4 & 0xfffffffffffffff8) + 8;
    if ((uVar4 | 7) != 0x17) {
      uVar1 = uVar4 | 7;
    }
    lVar6 = __Znwm(uVar1 + 1);
    *(ulong *)(unaff_x29 + -0x58) = uVar4;
    *(ulong *)(unaff_x29 + -0x50) = uVar1 + 1 | 0x8000000000000000;
    *(long *)(unaff_x29 + -0x60) = lVar6;
LAB_0004da18:
    _memmove(lVar6,auVar9._0_8_,uVar4);
  }
  *(undefined1 *)(lVar6 + uVar4) = 0;
  in_stack_00000028 = *(undefined8 *)(unaff_x29 + -0x58);
  uStack0000000000000020 = *puVar7;
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
  puVar5 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKcm
                     (&uStack0000000000000020,0,"rbxasset://",0xb);
  uVar8 = puVar5[1];
  uVar3 = *puVar5;
  *(undefined8 *)(unaff_x29 + -0x50) = puVar5[2];
  *(undefined8 *)(unaff_x29 + -0x58) = uVar8;
  *puVar7 = uVar3;
  puVar5[1] = 0;
  puVar5[2] = 0;
  *puVar5 = 0;
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  func_0x006e38d8();
  if (in_stack_00000050 < 0) {
    __ZdlPv(uStack0000000000000040);
  }
  if (in_stack_00000070 < 0) {
    __ZdlPv(uStack0000000000000060);
  }
  if (cStack0000000000000097 < '\0') {
    __ZdlPv(uStack0000000000000080);
  }
  return 1;
}

