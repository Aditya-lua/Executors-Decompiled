
void FUN_00093ea4(void)

{
  ulong uVar1;
  code *pcVar2;
  long *plVar3;
  undefined8 *puVar4;
  long lVar5;
  long unaff_x19;
  ulong uVar6;
  undefined8 *unaff_x20;
  long unaff_x21;
  long *plVar7;
  undefined *puStack_138;
  undefined8 uStack_130;
  undefined *puStack_128;
  undefined *apuStack_120 [2];
  long alStack_110 [4];
  ulong uStack_f0;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  long lStack_d0;
  ulong uStack_c8;
  uint uStack_c0;
  undefined *apuStack_b8 [4];
  int aiStack_98 [26];
  undefined8 uStack_30;
  undefined4 uStack_28;
  undefined1 auStack_20 [16];
  
  __ZdaPv();
  uStack_130 = 0;
  puStack_128 = &UNK_009b2848;
  apuStack_b8[0] = &UNK_009b2988;
  puStack_138 = &UNK_009b2960;
  __ZNSt3__18ios_base4initEPv(apuStack_b8,apuStack_120);
  uStack_28 = 0xffffffff;
  uStack_30 = 0;
  apuStack_b8[0] = &UNK_009b2870;
  puStack_138 = &UNK_009b2820;
  puStack_128 = &UNK_009b2848;
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEEC2Ev(apuStack_120);
  apuStack_120[0] = &UNK_009b2780;
  uStack_d8 = 0;
  uStack_e0 = 0;
  uStack_c8 = 0;
  lStack_d0 = 0;
  uStack_c0 = 0x18;
  plVar7 = alStack_110;
  if (*(long *)(unaff_x19 + 0x2f0) == 0) {
    if (unaff_x21 != 0) goto code_r0x000944f4;
  }
  else {
    uVar6 = 0;
    do {
      *(uint *)((long)apuStack_120 + *(long *)(puStack_128 + -0x18)) =
           *(uint *)((long)apuStack_120 + *(long *)(puStack_128 + -0x18)) & 0xffffffb5 | 8;
      *(undefined8 *)((long)plVar7 + *(long *)(puStack_128 + -0x18)) = 0x10;
      lVar5 = *(long *)(puStack_128 + -0x18);
      if (*(int *)((long)aiStack_98 + lVar5) == -1) {
        __ZNKSt3__18ios_base6getlocEv(auStack_20,(long)&puStack_128 + lVar5);
        plVar3 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                                   (auStack_20,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
        (**(code **)(*plVar3 + 0x38))(plVar3,0x20);
        __ZNSt3__16localeD1Ev(auStack_20);
      }
      *(undefined4 *)((long)aiStack_98 + lVar5) = 0x30;
      __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEy
                (&puStack_128,*(undefined8 *)(unaff_x21 + uVar6 * 8));
      uVar6 = uVar6 + 1;
    } while (uVar6 < *(ulong *)(unaff_x19 + 0x2f0));
code_r0x000944f4:
    __ZdaPv();
  }
  if ((uStack_c0 >> 4 & 1) == 0) {
    if ((uStack_c0 >> 3 & 1) == 0) {
      uVar6 = 0;
      *(undefined1 *)((long)unaff_x20 + 0x17) = 0;
      goto code_r0x000945bc;
    }
  }
  else {
    if (uStack_c8 < uStack_f0) {
      uStack_c8 = uStack_f0;
    }
    plVar7 = alStack_110 + 3;
    alStack_110[2] = uStack_c8;
  }
  lVar5 = *plVar7;
  uVar6 = alStack_110[2] - lVar5;
  if (0x7ffffffffffffff7 < uVar6) {
    func_0x0001748c(unaff_x20);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x94648);
    (*pcVar2)();
  }
  if (uVar6 < 0x17) {
    *(char *)((long)unaff_x20 + 0x17) = (char)uVar6;
    puVar4 = unaff_x20;
    if (uVar6 == 0) goto code_r0x000945bc;
  }
  else {
    uVar1 = (uVar6 & 0xfffffffffffffff8) + 8;
    if ((uVar6 | 7) != 0x17) {
      uVar1 = uVar6 | 7;
    }
    puVar4 = (undefined8 *)__Znwm(uVar1 + 1);
    unaff_x20[1] = uVar6;
    unaff_x20[2] = uVar1 + 1 | 0x8000000000000000;
    *unaff_x20 = puVar4;
  }
  _memmove(puVar4,lVar5,uVar6);
  unaff_x20 = puVar4;
code_r0x000945bc:
  *(undefined1 *)((long)unaff_x20 + uVar6) = 0;
  puStack_138 = &UNK_009b2820;
  puStack_128 = &UNK_009b2848;
  apuStack_b8[0] = &UNK_009b2870;
  apuStack_120[0] = &UNK_009b2780;
  if (lStack_d0 < 0) {
    __ZdlPv(uStack_e0);
  }
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev(apuStack_120);
  __ZNSt3__114basic_iostreamIcNS_11char_traitsIcEEED2Ev(&puStack_138,&UNK_009b2888);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(apuStack_b8);
  return;
}

