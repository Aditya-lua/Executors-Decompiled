
undefined8 FUN_00051f8c(void)

{
  undefined8 *puVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  int iVar5;
  long unaff_x25;
  long unaff_x26;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000040;
  long in_stack_00000048;
  undefined1 uStack0000000000000060;
  long in_stack_00000088;
  long in_stack_000000b0;
  long in_stack_000000c0;
  long *in_stack_000000c8;
  undefined4 in_stack_000001d0;
  char cStack00000000000001d8;
  char cStack00000000000001d9;
  undefined1 uStack00000000000001da;
  long in_stack_000001e0;
  
  iVar4 = __ZNKSt3__16locale9has_facetERNS0_2idE();
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  if (iVar4 != 0) {
    __ZNSt3__16localeC1ERKS0_(&uStack0000000000000008);
    in_stack_000000c8 =
         (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                           (&uStack0000000000000008,
                            PTR___ZNSt3__17codecvtIcc11__mbstate_tE2idE_009b0098);
    __ZNSt3__16localeD1Ev(&uStack0000000000000008);
    uStack00000000000001da = (**(code **)(*in_stack_000000c8 + 0x38))();
  }
  (**(code **)(in_stack_00000048 + 0x18))();
  if (in_stack_000000c0 == 0) {
    puVar1 = uStack0000000000000020;
    if (-1 < in_stack_00000030._7_1_) {
      puVar1 = &uStack0000000000000020;
    }
    in_stack_000000c0 = _fopen(puVar1,"wb");
    if (in_stack_000000c0 == 0) goto LAB_00051ffc;
    in_stack_000001d0 = 0x14;
  }
  else {
LAB_00051ffc:
    __ZNSt3__18ios_base5clearEj
              ((long)&uStack0000000000000040 + *(long *)(uStack0000000000000040 + -0x18),
               *(uint *)(&uStack0000000000000060 + *(long *)(uStack0000000000000040 + -0x18)) | 4);
    if (in_stack_000000c0 == 0) goto LAB_000520cc;
  }
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5writeEPKcl(&uStack0000000000000040);
  lVar2 = in_stack_000000c0;
  if (in_stack_000000c0 != 0) {
    iVar4 = (**(code **)(in_stack_00000048 + 0x30))();
    iVar5 = _fclose(lVar2);
    in_stack_000000c0 = 0;
    (**(code **)(in_stack_00000048 + 0x18))();
    if (iVar5 == 0 && iVar4 == 0) goto LAB_000520cc;
  }
  __ZNSt3__18ios_base5clearEj
            ((long)&uStack0000000000000040 + *(long *)(uStack0000000000000040 + -0x18),
             *(uint *)(&uStack0000000000000060 + *(long *)(uStack0000000000000040 + -0x18)) | 4);
LAB_000520cc:
  func_0x00479c54();
  func_0x006e3964();
  lVar2 = in_stack_000000c0;
  uStack0000000000000040 = unaff_x25 + 0x18;
  in_stack_000001e0 = unaff_x25 + 0x40;
  in_stack_00000048 = unaff_x26 + 0x10;
  if (in_stack_000000c0 != 0) {
    func_0x0001af20();
    _fclose(lVar2);
    in_stack_000000c0 = 0;
    (**(code **)(in_stack_00000048 + 0x18))();
  }
  if ((cStack00000000000001d8 != '\0') && (in_stack_00000088 != 0)) {
    __ZdaPv();
  }
  if ((cStack00000000000001d9 != '\0') && (in_stack_000000b0 != 0)) {
    __ZdaPv();
  }
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev();
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000040,&UNK_009b7a80);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev();
  if (in_stack_00000030._7_1_ < '\0') {
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

