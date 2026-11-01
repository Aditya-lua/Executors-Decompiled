
undefined8 FUN_00051e50(void)

{
  undefined8 *puVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  int iVar5;
  long unaff_x20;
  ulong unaff_x23;
  undefined8 *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  ulong in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined1 uStack0000000000000060;
  long in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a8;
  long in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long in_stack_000000c0;
  long *in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  undefined8 in_stack_00000150;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 in_stack_00000178;
  undefined8 in_stack_00000180;
  undefined8 in_stack_00000188;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined4 in_stack_000001d0;
  undefined4 uStack00000000000001d4;
  char in_stack_000001d8;
  char cStack00000000000001d9;
  undefined1 uStack00000000000001da;
  undefined8 uStack00000000000001e0;
  
  *(undefined4 *)((long)unaff_x24 + unaff_x20) = 0x6e69622e;
  if (unaff_x26 != 0x16) {
    __ZdlPv();
  }
  in_stack_00000030 = unaff_x23 | 0x8000000000000000;
  *(undefined1 *)((long)unaff_x24 + unaff_x25) = 0;
  uStack0000000000000048 = (undefined *)0x0;
  uStack0000000000000050 = 0;
  uStack0000000000000040 = (undefined *)0x0;
  uStack0000000000000020 = unaff_x24;
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
  }
  uStack0000000000000040 = &UNK_009b7ab0;
  uStack00000000000001e0 = &UNK_009b7ad8;
  __ZNSt3__18ios_base4initEPv(&uStack00000000000001e0,&uStack0000000000000048);
  uStack0000000000000040 = &UNK_009b7a40;
  uStack00000000000001e0 = &UNK_009b7a68;
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEEC2Ev(&uStack0000000000000048);
  uStack0000000000000048 = &UNK_009b2ae8;
  in_stack_00000088 = 0;
  in_stack_00000090 = 0;
  in_stack_00000098 = 0;
  in_stack_00000150 = 0;
  in_stack_00000148 = 0;
  in_stack_00000160 = 0;
  in_stack_00000158 = 0;
  in_stack_00000170 = 0;
  in_stack_00000168 = 0;
  in_stack_00000180 = 0;
  in_stack_00000178 = 0;
  in_stack_00000190 = 0;
  in_stack_00000188 = 0;
  in_stack_000001a0 = 0;
  in_stack_00000198 = 0;
  in_stack_000001b0 = 0;
  in_stack_000001a8 = 0;
  in_stack_000001c0 = 0;
  in_stack_000001b8 = 0;
  in_stack_000001d0 = 0;
  in_stack_000001c8 = 0;
  uStack00000000000001d4 = 0;
  in_stack_000001d8 = '\0';
  cStack00000000000001d9 = '\0';
  uStack00000000000001da = 0;
  in_stack_000000b0 = 0;
  in_stack_000000a8 = 0;
  in_stack_000000c0 = 0;
  in_stack_000000b8 = 0;
  in_stack_000000d0 = 0;
  in_stack_000000c8 = (long *)0x0;
  in_stack_000000e0 = 0;
  in_stack_000000d8 = 0;
  in_stack_000000f0 = 0;
  in_stack_000000e8 = 0;
  in_stack_00000100 = 0;
  in_stack_000000f8 = 0;
  in_stack_00000110 = 0;
  in_stack_00000108 = 0;
  in_stack_00000120 = 0;
  in_stack_00000118 = 0;
  in_stack_00000130 = 0;
  in_stack_00000128 = 0;
  in_stack_00000140 = 0;
  in_stack_00000138 = 0;
  __ZNSt3__16localeC1ERKS0_(&uStack0000000000000008,&uStack0000000000000050);
  iVar4 = __ZNKSt3__16locale9has_facetERNS0_2idE
                    (&uStack0000000000000008,PTR___ZNSt3__17codecvtIcc11__mbstate_tE2idE_009b0098);
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  if (iVar4 != 0) {
    __ZNSt3__16localeC1ERKS0_(&uStack0000000000000008,&uStack0000000000000050);
    in_stack_000000c8 =
         (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                           (&uStack0000000000000008,
                            PTR___ZNSt3__17codecvtIcc11__mbstate_tE2idE_009b0098);
    __ZNSt3__16localeD1Ev(&uStack0000000000000008);
    uStack00000000000001da = (**(code **)(*in_stack_000000c8 + 0x38))();
  }
  (**(code **)(uStack0000000000000048 + 0x18))(&uStack0000000000000048,0,0x1000);
  if (in_stack_000000c0 == 0) {
    puVar1 = uStack0000000000000020;
    if (-1 < (long)in_stack_00000030) {
      puVar1 = &uStack0000000000000020;
    }
    in_stack_000000c0 = _fopen(puVar1,"wb");
    if (in_stack_000000c0 == 0) goto code_r0x00051ffc;
    in_stack_000001d0 = 0x14;
  }
  else {
code_r0x00051ffc:
    __ZNSt3__18ios_base5clearEj
              ((long)&uStack0000000000000040 + *(long *)(uStack0000000000000040 + -0x18),
               *(uint *)(&uStack0000000000000060 + *(long *)(uStack0000000000000040 + -0x18)) | 4);
    if (in_stack_000000c0 == 0) goto code_r0x000520cc;
  }
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5writeEPKcl(&uStack0000000000000040);
  lVar2 = in_stack_000000c0;
  if (in_stack_000000c0 != 0) {
    iVar4 = (**(code **)(uStack0000000000000048 + 0x30))(&uStack0000000000000048);
    iVar5 = _fclose(lVar2);
    in_stack_000000c0 = 0;
    (**(code **)(uStack0000000000000048 + 0x18))(&uStack0000000000000048,0,0);
    if (iVar5 == 0 && iVar4 == 0) goto code_r0x000520cc;
  }
  __ZNSt3__18ios_base5clearEj
            ((long)&uStack0000000000000040 + *(long *)(uStack0000000000000040 + -0x18),
             *(uint *)(&uStack0000000000000060 + *(long *)(uStack0000000000000040 + -0x18)) | 4);
code_r0x000520cc:
  func_0x00479c54();
  func_0x006e3964();
  lVar2 = in_stack_000000c0;
  uStack00000000000001e0 = &UNK_009b7a68;
  uStack0000000000000040 = &UNK_009b7a40;
  uStack0000000000000048 = &UNK_009b2ae8;
  if (in_stack_000000c0 != 0) {
    func_0x0001af20(&uStack0000000000000048);
    _fclose(lVar2);
    in_stack_000000c0 = 0;
    (**(code **)(uStack0000000000000048 + 0x18))(&uStack0000000000000048,0,0);
  }
  if ((in_stack_000001d8 != '\0') && (in_stack_00000088 != 0)) {
    __ZdaPv();
  }
  if ((cStack00000000000001d9 != '\0') && (in_stack_000000b0 != 0)) {
    __ZdaPv();
  }
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000048);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000040,&UNK_009b7a80);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(&uStack00000000000001e0);
  if ((long)in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x58)) {
    ___stack_chk_fail();
    func_0x0001748c(&uStack0000000000000008);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x521e4);
    (*pcVar3)();
  }
  return 1;
}

