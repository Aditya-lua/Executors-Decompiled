
/* WARNING: Removing unreachable block (ram,0x0004db6c) */
/* WARNING: Removing unreachable block (ram,0x0004dab4) */
/* WARNING: Removing unreachable block (ram,0x0004d830) */
/* WARNING: Removing unreachable block (ram,0x0004d894) */
/* WARNING: Removing unreachable block (ram,0x0004dbac) */

undefined8 FUN_0004d7e8(void)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  ulong uVar4;
  long lVar5;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  long unaff_x29;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined1 auVar8 [16];
  undefined8 uStack0000000000000008;
  long lStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  long in_stack_00000070;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined7 uStack0000000000000090;
  char cStack0000000000000097;
  
  lStack0000000000000018 = 0;
  uVar4 = *(ulong *)(unaff_x29 + -0x70);
  lVar5 = *(long *)(unaff_x29 + -0x78);
  if (-1 < (char)*(byte *)(unaff_x29 + -0x61)) {
    uVar4 = (ulong)*(byte *)(unaff_x29 + -0x61);
    lVar5 = unaff_x29 + -0x78;
  }
  func_0x00017184(&uStack0000000000000008,lVar5,lVar5 + uVar4);
  in_stack_00000068 = unaff_x24[1];
  uStack0000000000000060 = *unaff_x24;
  in_stack_00000070 = *(long *)(unaff_x29 + -0x50);
  func_0x0001754c(&uStack0000000000000060,&uStack0000000000000008);
  if (lStack0000000000000018 < 0) {
    __ZdlPv(uStack0000000000000008);
  }
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
    if (in_stack_00000050 < 0) goto LAB_0004d8b4;
LAB_0004d868:
    if (-1 < cStack0000000000000097) goto LAB_0004d870;
LAB_0004d8c4:
    func_0x00017634(&uStack0000000000000040,in_stack_00000080,in_stack_00000088);
  }
  else {
    if (-1 < in_stack_00000050) goto LAB_0004d868;
LAB_0004d8b4:
    __ZdlPv(uStack0000000000000040);
    if (cStack0000000000000097 < '\0') goto LAB_0004d8c4;
LAB_0004d870:
    in_stack_00000048 = in_stack_00000088;
    uStack0000000000000040 = in_stack_00000080;
    in_stack_00000050 = CONCAT17(cStack0000000000000097,uStack0000000000000090);
  }
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0x60,&uStack0000000000000040,0);
  if ((*(char *)(unaff_x29 + -0x60) == -1) || (*(char *)(unaff_x29 + -0x60) == '\0')) {
    func_0x006e644c();
    goto code_r0x0004dbe8;
  }
  auVar8 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000060);
  uVar4 = auVar8._8_8_;
  if (unaff_x25 < uVar4) {
    func_0x0001748c(unaff_x29 + -0x60);
    goto code_r0x0004dbe8;
  }
  if (uVar4 < 0x17) {
    *(char *)(unaff_x29 + -0x49) = auVar8[8];
    lVar5 = unaff_x29 + -0x60;
    if (uVar4 != 0) goto code_r0x0004d950;
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
code_r0x0004d950:
    _memmove(lVar5,auVar8._0_8_,uVar4);
  }
  *(undefined1 *)(lVar5 + uVar4) = 0;
  in_stack_00000028 = unaff_x24[1];
  uStack0000000000000020 = *unaff_x24;
  in_stack_00000030 = *(long *)(unaff_x29 + -0x50);
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0x60,&uStack0000000000000020,0);
  uVar4 = *(ulong *)(unaff_x29 + -0x60);
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if ((((uint)uVar4 & 0xff) != 0xff) && ((uVar4 & 0xff) != 0)) goto code_r0x0004da58;
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
    if (uVar4 != 0) goto code_r0x0004da18;
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
code_r0x0004da18:
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
code_r0x0004da58:
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
  if (in_stack_00000050 < 0) {
    __ZdlPv(uStack0000000000000040);
  }
  if (in_stack_00000070 < 0) {
    __ZdlPv(uStack0000000000000060);
  }
  if (cStack0000000000000097 < '\0') {
    __ZdlPv(in_stack_00000080);
  }
  return 1;
}

