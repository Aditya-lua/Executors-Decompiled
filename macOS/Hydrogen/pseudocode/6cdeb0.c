
void FUN_006cdeb0(long param_1,undefined8 param_2,ulong param_3)

{
  code *pcVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  long in_x9;
  long in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  ulong uVar5;
  ulong uVar6;
  long in_x17;
  long unaff_x19;
  long unaff_x29;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  
code_r0x006cdeb0:
  *(undefined8 *)(in_x17 + param_3 * in_x12 + 8) = 0;
LAB_006cdeb8:
  do {
    do {
      do {
        in_x9 = in_x9 + 1;
        if (in_x9 == param_1) {
          func_0x006d621c();
          if (uStack0000000000000058 != 0) {
            in_stack_00000060 = uStack0000000000000058;
            __ZdlPv();
          }
          *(undefined4 *)(unaff_x19 + 0x484) = in_stack_00000040._4_4_;
          if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x70)) {
            ___stack_chk_fail();
            func_0x00017f90(&uStack0000000000000058);
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x6ce108);
            (*pcVar1)();
          }
          return;
        }
        uVar5 = *(ulong *)(in_x10 + in_x9 * 8);
        if ((in_x11 != 0) && (uVar5 != *(ulong *)(unaff_x19 + 0x140))) {
          uVar6 = 0;
          uVar2 = *(long *)(unaff_x19 + 0x130) - 1;
          uVar3 = uVar5 >> 4 ^ uVar5 >> 9;
          do {
            uVar3 = uVar3 & uVar2;
            uVar4 = *(ulong *)(*(long *)(unaff_x19 + 0x128) + uVar3 * 0x20);
            if (uVar4 == uVar5) {
              *(undefined4 *)(*(long *)(unaff_x19 + 0x128) + uVar3 * 0x20 + 8) = 0;
              if (in_x13 != 0) goto LAB_006cdf18;
              goto LAB_006cdeb8;
            }
            uVar6 = uVar6 + 1;
            uVar3 = uVar6 + uVar3;
          } while (uVar4 != *(ulong *)(unaff_x19 + 0x140) && uVar6 <= uVar2);
        }
      } while (in_x13 == 0);
LAB_006cdf18:
    } while (uVar5 == *(ulong *)(unaff_x19 + 0xf0));
    uVar6 = 0;
    in_x17 = *(long *)(unaff_x19 + 0xd8);
    uVar3 = *(long *)(unaff_x19 + 0xe0) - 1;
    param_3 = uVar5 >> 4 ^ uVar5 >> 9;
    do {
      param_3 = param_3 & uVar3;
      uVar2 = *(ulong *)(in_x17 + param_3 * in_x12);
      if (uVar2 == uVar5) goto code_r0x006cdeb0;
      uVar6 = uVar6 + 1;
      param_3 = uVar6 + param_3;
    } while (uVar2 != *(ulong *)(unaff_x19 + 0xf0) && uVar6 <= uVar3);
  } while( true );
}

