
void FUN_000943d0(long param_1,undefined8 param_2)

{
  long lVar1;
  ulong uVar2;
  code *pcVar3;
  long *plVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long lVar7;
  undefined8 *unaff_x24;
  long unaff_x25;
  long *plVar8;
  long unaff_x29;
  undefined8 uStack0000000000000010;
  undefined1 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined *puStack0000000000000028;
  undefined *in_stack_00000030;
  long lStack0000000000000040;
  ulong in_stack_00000050;
  long lStack0000000000000058;
  ulong in_stack_00000060;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  long in_stack_00000080;
  ulong in_stack_00000088;
  uint in_stack_00000090;
  undefined *puStack0000000000000098;
  undefined8 in_stack_00000120;
  undefined4 in_stack_00000128;
  
  lVar1 = unaff_x21 + 0x18;
  puStack0000000000000098 = (undefined *)(param_1 + 0x40);
  uStack0000000000000020 = 0;
  _uStack0000000000000018 = (undefined *)(param_1 + 0x18);
  uStack0000000000000010 = param_2;
  puStack0000000000000028 = (undefined *)(unaff_x25 + 0x40);
  __ZNSt3__18ios_base4initEPv(param_2,lVar1);
  in_stack_00000128 = 0xffffffff;
  _uStack0000000000000018 = (undefined *)(unaff_x25 + 0x18);
  puStack0000000000000098 = (undefined *)(unaff_x25 + 0x68);
  in_stack_00000120 = 0;
  puStack0000000000000028 = (undefined *)(unaff_x25 + 0x40);
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEEC2Ev(lVar1);
  in_stack_00000030 = &UNK_009b2780;
  in_stack_00000078 = 0;
  in_stack_00000070 = 0;
  in_stack_00000088 = 0;
  in_stack_00000080 = 0;
  in_stack_00000090 = 0x18;
  plVar8 = &lStack0000000000000040;
  if (*(long *)(unaff_x23 + 0x2f0) == 0) {
    if (unaff_x22 != 0) goto code_r0x000944f4;
  }
  else {
    uVar6 = 0;
    do {
      *(uint *)(lVar1 + *(long *)((long)puStack0000000000000028 + -0x18)) =
           *(uint *)(lVar1 + *(long *)((long)puStack0000000000000028 + -0x18)) & 0xffffffb5 | 8;
      *(undefined8 *)((long)plVar8 + *(long *)((long)puStack0000000000000028 + -0x18)) = 0x10;
      lVar7 = unaff_x21 + 0x10 + *(long *)((long)puStack0000000000000028 + -0x18);
      if (*(int *)(lVar7 + 0x90) == -1) {
        __ZNKSt3__18ios_base6getlocEv(unaff_x29 + -0x60,lVar7);
        plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                                   (unaff_x29 + -0x60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
        (**(code **)(*plVar4 + 0x38))(plVar4,0x20);
        __ZNSt3__16localeD1Ev(unaff_x29 + -0x60);
      }
      *(undefined4 *)(lVar7 + 0x90) = 0x30;
      __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEy
                (unaff_x21 + 0x10,*(undefined8 *)(unaff_x22 + uVar6 * 8));
      uVar6 = uVar6 + 1;
    } while (uVar6 < *(ulong *)(unaff_x23 + 0x2f0));
code_r0x000944f4:
    __ZdaPv();
  }
  if ((in_stack_00000090 >> 4 & 1) == 0) {
    if ((in_stack_00000090 >> 3 & 1) == 0) {
      uVar6 = 0;
      *(undefined1 *)((long)unaff_x24 + 0x17) = 0;
      goto code_r0x000945bc;
    }
    uVar6 = in_stack_00000050;
  }
  else {
    if (in_stack_00000088 < in_stack_00000060) {
      in_stack_00000088 = in_stack_00000060;
    }
    plVar8 = &lStack0000000000000058;
    uVar6 = in_stack_00000088;
  }
  lVar7 = *plVar8;
  uVar6 = uVar6 - lVar7;
  if (0x7ffffffffffffff7 < uVar6) {
    func_0x0001748c(unaff_x24);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x94648);
    (*pcVar3)();
  }
  if (uVar6 < 0x17) {
    *(char *)((long)unaff_x24 + 0x17) = (char)uVar6;
    puVar5 = unaff_x24;
    if (uVar6 == 0) goto code_r0x000945bc;
  }
  else {
    uVar2 = (uVar6 & 0xfffffffffffffff8) + 8;
    if ((uVar6 | 7) != 0x17) {
      uVar2 = uVar6 | 7;
    }
    puVar5 = (undefined8 *)__Znwm(uVar2 + 1);
    unaff_x24[1] = uVar6;
    unaff_x24[2] = uVar2 + 1 | 0x8000000000000000;
    *unaff_x24 = puVar5;
  }
  _memmove(puVar5,lVar7,uVar6);
  unaff_x24 = puVar5;
code_r0x000945bc:
  *(undefined1 *)((long)unaff_x24 + uVar6) = 0;
  _uStack0000000000000018 = &UNK_009b2820;
  puStack0000000000000028 = &UNK_009b2848;
  puStack0000000000000098 = &UNK_009b2870;
  in_stack_00000030 = &UNK_009b2780;
  if (in_stack_00000080 < 0) {
    __ZdlPv(in_stack_00000070);
  }
  __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev(lVar1);
  __ZNSt3__114basic_iostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000018,&UNK_009b2888);
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(uStack0000000000000010);
  return;
}

