
undefined8 FUN_0003d744(undefined8 param_1,int param_2)

{
  char *pcVar1;
  ulong uVar2;
  long *******ppppppplVar3;
  long *******ppppppplVar4;
  code *pcVar5;
  long *plVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long *plVar9;
  char *pcVar10;
  ulong uVar11;
  undefined8 *******pppppppuVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 *puVar15;
  undefined8 in_stack_00000098;
  long in_stack_000000a8;
  undefined8 in_stack_000000b0;
  long in_stack_000000c0;
  undefined1 uStack_138;
  undefined7 uStack_137;
  char cStack_121;
  undefined2 uStack_120;
  undefined6 uStack_11e;
  char cStack_109;
  long *******ppppppplStack_108;
  undefined8 uStack_100;
  long lStack_f8;
  undefined8 *******pppppppuStack_f0;
  ulong uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined *puStack_d0;
  undefined *puStack_c8;
  long *plStack_b8;
  long lStack_68;
  
  __ZdlPv();
  __ZdlPv();
  if (param_2 == 2) {
    plVar6 = (long *)___cxa_begin_catch(param_1);
    (**(code **)(*plVar6 + 0x10))();
    func_0x006e644c();
code_r0x0003da3c:
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x3da40);
    (*pcVar5)();
  }
  if (param_2 == 1) {
    plVar6 = (long *)___cxa_begin_catch(param_1);
    (**(code **)(*plVar6 + 0x10))();
    func_0x006e644c();
    goto code_r0x0003da3c;
  }
  if (in_stack_000000a8 < 0) {
    __ZdlPv(in_stack_00000098);
  }
  if (in_stack_000000c0 < 0) {
    __ZdlPv(in_stack_000000b0);
  }
  uVar7 = __Unwind_Resume(param_1);
  lStack_68 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar8 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar8 = func_0x00086db4(uVar8,"crypt_hash",10);
  uVar8 = func_0x00086db4(uVar8," @ ",3);
  uVar8 = func_0x00086db4(uVar8,"/Users/x0rch/hydrogen-m/src/lua/libs/crypt.h",0x2c);
  uVar8 = func_0x00086db4(uVar8,":",1);
  plVar6 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar8,0x21b);
  __ZNKSt3__18ios_base6getlocEv(&pppppppuStack_f0,(long)plVar6 + *(long *)(*plVar6 + -0x18));
  plVar9 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&pppppppuStack_f0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar8 = (**(code **)(*plVar9 + 0x38))(plVar9,10);
  __ZNSt3__16localeD1Ev(&pppppppuStack_f0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar6,uVar8);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar6);
  uVar8 = func_0x006e67c8(uVar7,1,&uStack_d8);
  pcVar10 = (char *)func_0x006e671c(uVar7,2,"sha256",0);
  pcVar1 = "sha256";
  if (pcVar10 != (char *)0x0) {
    pcVar1 = pcVar10;
  }
  uVar11 = _strlen(pcVar1);
  if (0x7ffffffffffffff7 < uVar11) goto code_r0x0003de50;
  if (uVar11 < 0x17) {
    uStack_e0 = CONCAT17((char)uVar11,(undefined7)uStack_e0);
    pppppppuVar12 = &pppppppuStack_f0;
    if (uVar11 != 0) goto code_r0x0003dc48;
  }
  else {
    uVar2 = (uVar11 & 0xfffffffffffffff8) + 8;
    if ((uVar11 | 7) != 0x17) {
      uVar2 = uVar11 | 7;
    }
    pppppppuVar12 = (undefined8 *******)__Znwm(uVar2 + 1);
    uStack_e0 = uVar2 + 1 | 0x8000000000000000;
    pppppppuStack_f0 = pppppppuVar12;
    uStack_e8 = uVar11;
code_r0x0003dc48:
    _memmove(pppppppuVar12,pcVar1,uVar11);
  }
  *(undefined1 *)((long)pppppppuVar12 + uVar11) = 0;
  func_0x00047adc(&ppppppplStack_108,&pppppppuStack_f0);
  ppppppplVar4 = ppppppplStack_108;
  ppppppplStack_108 = (long *******)0x0;
  uStack_100 = 0;
  lStack_f8 = 0;
  uVar13 = __Znwm(0xa0);
  uVar14 = __Znwm(0x98);
  puVar15 = (undefined8 *)__Znwm(0x20);
  func_0x005edf2c(puVar15,0);
  *puVar15 = &UNK_009f9e90;
  puVar15[1] = &UNK_009fa020;
  puVar15[3] = &ppppppplStack_108;
  cStack_109 = '\x01';
  uStack_120 = 0x3a;
  cStack_121 = '\0';
  uStack_138 = 0;
  func_0x0004af28(uVar14,puVar15,1,0,&uStack_120,&uStack_138);
  func_0x0066e084(uVar13,ppppppplVar4,uVar14,0,0xffffffff,&UNK_008ba5c8,&UNK_008ba5c8);
  func_0x0003f450(&puStack_d0,uVar8,uStack_d8,1,uVar13);
  puStack_d0 = &UNK_00a0c238;
  puStack_c8 = &UNK_00a0c3e0;
  if (plStack_b8 != (long *)0x0) {
    (**(code **)(*plStack_b8 + 8))();
  }
  if (cStack_121 < '\0') {
    __ZdlPv(CONCAT71(uStack_137,uStack_138));
  }
  if (cStack_109 < '\0') {
    __ZdlPv(CONCAT62(uStack_11e,uStack_120));
  }
  ppppppplVar3 = ppppppplStack_108;
  if (-1 < lStack_f8) {
    ppppppplVar3 = (long *******)&ppppppplStack_108;
  }
  func_0x006e3964(uVar7,ppppppplVar3);
  if (lStack_f8 < 0) {
    __ZdlPv(ppppppplStack_108);
    (*(code *)(*ppppppplVar4)[1])(ppppppplVar4);
    if (-1 < (long)uStack_e0) goto code_r0x0003ddb4;
code_r0x0003de2c:
    __ZdlPv(pppppppuStack_f0);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
      return 1;
    }
  }
  else {
    (*(code *)(*ppppppplVar4)[1])(ppppppplVar4);
    if ((long)uStack_e0 < 0) goto code_r0x0003de2c;
code_r0x0003ddb4:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
      return 1;
    }
  }
  ___stack_chk_fail();
code_r0x0003de50:
  func_0x0001748c(&pppppppuStack_f0);
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x3df98);
  (*pcVar5)();
}

