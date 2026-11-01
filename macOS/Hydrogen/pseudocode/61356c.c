
undefined8 FUN_0061356c(long param_1)

{
  code *pcVar1;
  undefined1 *puVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  long unaff_x22;
  ulong uVar6;
  undefined1 *in_stack_00000000;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  undefined1 uStack0000000000000018;
  undefined *in_stack_00000020;
  long in_stack_00000030;
  long in_stack_00000040;
  long in_stack_00000048;
  ulong in_stack_00000050;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  long in_stack_00000070;
  ulong in_stack_00000078;
  uint in_stack_00000080;
  undefined *puStack0000000000000088;
  undefined8 in_stack_00000110;
  undefined4 in_stack_00000118;
  
  _uStack0000000000000018 = (undefined *)(param_1 + 0x720);
  puStack0000000000000088 = (undefined *)(param_1 + 0x748);
  __ZNSt3__18ios_base4initEPv();
  in_stack_00000110 = 0;
  in_stack_00000118 = 0xffffffff;
  _uStack0000000000000018 = &UNK_009b26b0;
  puStack0000000000000088 = &UNK_009b26d8;
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEEC2Ev();
  in_stack_00000020 = &UNK_009b2780;
  in_stack_00000068 = 0;
  in_stack_00000060 = 0;
  in_stack_00000078 = 0;
  in_stack_00000070 = 0;
  in_stack_00000080 = 0x10;
  lVar4 = *(long *)(unaff_x22 + 8);
  puVar2 = (undefined1 *)register0x00000008;
  if (*(long *)(unaff_x22 + 0x10) == lVar4) {
LAB_0061365c:
    if (in_stack_00000078 < in_stack_00000050) {
      in_stack_00000078 = in_stack_00000050;
    }
    uVar6 = in_stack_00000078 - in_stack_00000048;
    lVar4 = in_stack_00000048;
  }
  else {
    uVar6 = 0;
    do {
      __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEj
                (&uStack0000000000000018,*(undefined4 *)(lVar4 + uVar6 * 4));
      uVar6 = uVar6 + 1;
      lVar4 = *(long *)(unaff_x22 + 8);
      uVar5 = *(long *)(unaff_x22 + 0x10) - lVar4 >> 2;
      if (uVar6 < uVar5) {
        func_0x00086db4(&uStack0000000000000018,".",1);
        lVar4 = *(long *)(unaff_x22 + 8);
        uVar5 = *(long *)(unaff_x22 + 0x10) - lVar4 >> 2;
      }
    } while (uVar6 < uVar5);
    if ((in_stack_00000080 >> 4 & 1) != 0) goto LAB_0061365c;
    if ((in_stack_00000080 >> 3 & 1) == 0) {
      uVar6 = 0;
      in_stack_00000010 = in_stack_00000010 & 0xffffffffffffff;
      goto LAB_006136e4;
    }
    uVar6 = in_stack_00000040 - in_stack_00000030;
    lVar4 = in_stack_00000030;
  }
  if (0x7ffffffffffffff7 < uVar6) {
    func_0x0001748c();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6137b8);
    (*pcVar1)();
  }
  if (uVar6 < 0x17) {
    in_stack_00000010 = CONCAT17((char)uVar6,(undefined7)in_stack_00000010);
    if (uVar6 == 0) goto LAB_006136e4;
  }
  else {
    uVar5 = (uVar6 & 0xfffffffffffffff8) + 8;
    if ((uVar6 | 7) != 0x17) {
      uVar5 = uVar6 | 7;
    }
    puVar2 = (undefined1 *)__Znwm(uVar5 + 1);
    in_stack_00000010 = uVar5 + 1 | 0x8000000000000000;
    in_stack_00000000 = puVar2;
    in_stack_00000008 = uVar6;
  }
  _memmove(puVar2,lVar4,uVar6);
LAB_006136e4:
  puVar2[uVar6] = 0;
  uVar3 = func_0x00086db4();
  if ((long)in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  puStack0000000000000088 = &UNK_009b26d8;
  _uStack0000000000000018 = &UNK_009b26b0;
  in_stack_00000020 = &UNK_009b2780;
  if (in_stack_00000070 < 0) {
    __ZdlPv(in_stack_00000060);
  }
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000018,&UNK_009b26f0);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev();
  return uVar3;
}

