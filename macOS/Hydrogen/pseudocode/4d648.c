
/* WARNING: Removing unreachable block (ram,0x0004db6c) */
/* WARNING: Removing unreachable block (ram,0x0004dab4) */
/* WARNING: Removing unreachable block (ram,0x0004d830) */
/* WARNING: Removing unreachable block (ram,0x0004d894) */
/* WARNING: Removing unreachable block (ram,0x0004dbac) */

undefined8 FUN_0004d648(undefined8 param_1)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 uVar3;
  long *plVar4;
  long *plVar5;
  ulong uVar6;
  undefined8 *puVar7;
  long lVar8;
  undefined8 *puVar9;
  long unaff_x29;
  undefined8 uVar10;
  undefined1 auVar11 [16];
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
  
  uVar3 = func_0x00086db4(param_1,"getcustomasset",0xe);
  uVar3 = func_0x00086db4(uVar3," @ ",3);
  uVar3 = func_0x00086db4(uVar3,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar3 = func_0x00086db4(uVar3,":",1);
  plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar3,0x153);
  __ZNKSt3__18ios_base6getlocEv(unaff_x29 + -0x60,(long)plVar4 + *(long *)(*plVar4 + -0x18));
  plVar5 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (unaff_x29 + -0x60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar3 = (**(code **)(*plVar5 + 0x38))(plVar5,10);
  __ZNSt3__16localeD1Ev(unaff_x29 + -0x60);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar3);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
  uVar3 = func_0x006e67c8();
  uVar6 = _strlen();
  if (0x7ffffffffffffff7 < uVar6) {
    func_0x0001748c(unaff_x29 + -0x78);
code_r0x0004dbd4:
    func_0x0001748c(unaff_x29 + -0x60);
    goto code_r0x0004dbe8;
  }
  if (uVar6 < 0x17) {
    *(char *)(unaff_x29 + -0x61) = (char)uVar6;
    lVar8 = unaff_x29 + -0x78;
    if (uVar6 != 0) goto code_r0x0004d75c;
  }
  else {
    uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
    if ((uVar6 | 7) != 0x17) {
      uVar1 = uVar6 | 7;
    }
    lVar8 = __Znwm(uVar1 + 1);
    *(ulong *)(unaff_x29 + -0x70) = uVar6;
    *(ulong *)(unaff_x29 + -0x68) = uVar1 + 1 | 0x8000000000000000;
    *(long *)(unaff_x29 + -0x78) = lVar8;
code_r0x0004d75c:
    _memmove(lVar8,uVar3,uVar6);
  }
  *(undefined1 *)(lVar8 + uVar6) = 0;
  func_0x0004dd60(&uStack0000000000000080);
  __ZNSt3__14__fs10filesystem14__current_pathEPNS_10error_codeE(&uStack0000000000000040,0);
  uStack0000000000000020 = 0;
  in_stack_00000028 = 0;
  in_stack_00000030 = 0;
  func_0x00017184(&uStack0000000000000020,"content","");
  puVar9 = (undefined8 *)(unaff_x29 + -0x60);
  if (in_stack_00000050 < 0) {
    func_0x00017634(unaff_x29 + -0x60,uStack0000000000000040,in_stack_00000048);
  }
  else {
    *(undefined8 *)(unaff_x29 + -0x58) = in_stack_00000048;
    *puVar9 = uStack0000000000000040;
    *(long *)(unaff_x29 + -0x50) = in_stack_00000050;
  }
  func_0x0001754c(unaff_x29 + -0x60,&uStack0000000000000020);
  uStack0000000000000008 = 0;
  in_stack_00000010 = 0;
  in_stack_00000018 = 0;
  uVar6 = *(ulong *)(unaff_x29 + -0x70);
  lVar8 = *(long *)(unaff_x29 + -0x78);
  if (-1 < (char)*(byte *)(unaff_x29 + -0x61)) {
    uVar6 = (ulong)*(byte *)(unaff_x29 + -0x61);
    lVar8 = unaff_x29 + -0x78;
  }
  func_0x00017184(&uStack0000000000000008,lVar8,lVar8 + uVar6);
  in_stack_00000068 = *(undefined8 *)(unaff_x29 + -0x58);
  uStack0000000000000060 = *puVar9;
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
  auVar11 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000060);
  uVar6 = auVar11._8_8_;
  if (0x7ffffffffffffff7 < uVar6) goto code_r0x0004dbd4;
  if (uVar6 < 0x17) {
    *(char *)(unaff_x29 + -0x49) = auVar11[8];
    lVar8 = unaff_x29 + -0x60;
    if (uVar6 != 0) goto code_r0x0004d950;
  }
  else {
    uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
    if ((uVar6 | 7) != 0x17) {
      uVar1 = uVar6 | 7;
    }
    lVar8 = __Znwm(uVar1 + 1);
    *(ulong *)(unaff_x29 + -0x58) = uVar6;
    *(ulong *)(unaff_x29 + -0x50) = uVar1 + 1 | 0x8000000000000000;
    *(long *)(unaff_x29 + -0x60) = lVar8;
code_r0x0004d950:
    _memmove(lVar8,auVar11._0_8_,uVar6);
  }
  *(undefined1 *)(lVar8 + uVar6) = 0;
  in_stack_00000028 = *(undefined8 *)(unaff_x29 + -0x58);
  uStack0000000000000020 = *puVar9;
  in_stack_00000030 = *(long *)(unaff_x29 + -0x50);
  __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0x60,&uStack0000000000000020,0);
  uVar6 = *(ulong *)(unaff_x29 + -0x60);
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if ((((uint)uVar6 & 0xff) != 0xff) && ((uVar6 & 0xff) != 0)) goto code_r0x0004da58;
  auVar11 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000060);
  uVar6 = auVar11._8_8_;
  if (0x7ffffffffffffff7 < uVar6) {
    func_0x0001748c(unaff_x29 + -0x60);
code_r0x0004dbe8:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4dbec);
    (*pcVar2)();
  }
  if (uVar6 < 0x17) {
    *(char *)(unaff_x29 + -0x49) = auVar11[8];
    lVar8 = unaff_x29 + -0x60;
    if (uVar6 != 0) goto code_r0x0004da18;
  }
  else {
    uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
    if ((uVar6 | 7) != 0x17) {
      uVar1 = uVar6 | 7;
    }
    lVar8 = __Znwm(uVar1 + 1);
    *(ulong *)(unaff_x29 + -0x58) = uVar6;
    *(ulong *)(unaff_x29 + -0x50) = uVar1 + 1 | 0x8000000000000000;
    *(long *)(unaff_x29 + -0x60) = lVar8;
code_r0x0004da18:
    _memmove(lVar8,auVar11._0_8_,uVar6);
  }
  *(undefined1 *)(lVar8 + uVar6) = 0;
  in_stack_00000028 = *(undefined8 *)(unaff_x29 + -0x58);
  uStack0000000000000020 = *puVar9;
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
  puVar7 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKcm
                     (&uStack0000000000000020,0,"rbxasset://",0xb);
  uVar10 = puVar7[1];
  uVar3 = *puVar7;
  *(undefined8 *)(unaff_x29 + -0x50) = puVar7[2];
  *(undefined8 *)(unaff_x29 + -0x58) = uVar10;
  *puVar9 = uVar3;
  puVar7[1] = 0;
  puVar7[2] = 0;
  *puVar7 = 0;
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

