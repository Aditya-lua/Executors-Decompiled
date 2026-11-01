
void FUN_00094498(void)

{
  ulong uVar1;
  code *pcVar2;
  long *plVar3;
  undefined8 *puVar4;
  ulong unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  ulong uVar5;
  long unaff_x23;
  long lVar6;
  long unaff_x24;
  undefined4 unaff_w25;
  long unaff_x26;
  uint unaff_w27;
  long *unaff_x28;
  long unaff_x29;
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined *in_stack_00000028;
  undefined *in_stack_00000030;
  ulong in_stack_00000050;
  long lStack0000000000000058;
  ulong in_stack_00000060;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000080;
  ulong in_stack_00000088;
  uint in_stack_00000090;
  undefined *in_stack_00000098;
  
  do {
    __ZNKSt3__18ios_base6getlocEv(unaff_x29 + -0x60,unaff_x26);
    plVar3 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                               (unaff_x29 + -0x60,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
    (**(code **)(*plVar3 + 0x38))(plVar3,0x20);
    __ZNSt3__16localeD1Ev(unaff_x29 + -0x60);
    do {
      *(undefined4 *)(unaff_x26 + 0x90) = unaff_w25;
      __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEy();
      unaff_x19 = unaff_x19 + 1;
      if (*(ulong *)(unaff_x23 + 0x2f0) <= unaff_x19) {
        __ZdaPv();
        if ((in_stack_00000090 >> 4 & 1) == 0) {
          if ((in_stack_00000090 >> 3 & 1) == 0) {
            uVar5 = 0;
            *(undefined1 *)((long)in_stack_00000008 + 0x17) = 0;
            goto LAB_000945bc;
          }
          uVar5 = in_stack_00000050;
        }
        else {
          if (in_stack_00000088 < in_stack_00000060) {
            in_stack_00000088 = in_stack_00000060;
          }
          unaff_x28 = &lStack0000000000000058;
          uVar5 = in_stack_00000088;
        }
        lVar6 = *unaff_x28;
        uVar5 = uVar5 - lVar6;
        if (0x7ffffffffffffff7 < uVar5) {
          func_0x0001748c(in_stack_00000008);
                    /* WARNING: Does not return */
          pcVar2 = (code *)SoftwareBreakpoint(1,0x94648);
          (*pcVar2)();
        }
        if (uVar5 < 0x17) {
          *(char *)((long)in_stack_00000008 + 0x17) = (char)uVar5;
          puVar4 = in_stack_00000008;
          if (uVar5 == 0) goto LAB_000945bc;
        }
        else {
          uVar1 = (uVar5 & 0xfffffffffffffff8) + 8;
          if ((uVar5 | 7) != 0x17) {
            uVar1 = uVar5 | 7;
          }
          puVar4 = (undefined8 *)__Znwm(uVar1 + 1);
          in_stack_00000008[1] = uVar5;
          in_stack_00000008[2] = uVar1 + 1 | 0x8000000000000000;
          *in_stack_00000008 = puVar4;
        }
        _memmove(puVar4,lVar6,uVar5);
        in_stack_00000008 = puVar4;
LAB_000945bc:
        *(undefined1 *)((long)in_stack_00000008 + uVar5) = 0;
        uStack0000000000000018 = &UNK_009b2820;
        in_stack_00000028 = &UNK_009b2848;
        in_stack_00000098 = &UNK_009b2870;
        in_stack_00000030 = &UNK_009b2780;
        if (in_stack_00000080._7_1_ < '\0') {
          __ZdlPv(in_stack_00000070);
        }
        __ZNSt3__115basic_streambufIcNS_11char_traitsIcEEED2Ev();
        __ZNSt3__114basic_iostreamIcNS_11char_traitsIcEEED2Ev(&uStack0000000000000018,&UNK_009b2888)
        ;
        __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(in_stack_00000010);
        return;
      }
      *(uint *)(unaff_x20 + *(long *)((long)in_stack_00000028 + -0x18)) =
           *(uint *)(unaff_x20 + *(long *)((long)in_stack_00000028 + -0x18)) & unaff_w27 | 8;
      *(undefined8 *)((long)unaff_x28 + *(long *)((long)in_stack_00000028 + -0x18)) = unaff_x21;
      unaff_x26 = unaff_x24 + *(long *)((long)in_stack_00000028 + -0x18);
    } while (*(int *)(unaff_x26 + 0x90) != -1);
  } while( true );
}

