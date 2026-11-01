
void FUN_004d5824(ulong param_1)

{
  uint uVar1;
  code *pcVar2;
  undefined1 in_ZR;
  ulong uVar3;
  long *in_x9;
  uint in_w10;
  ulong uVar4;
  ulong in_x11;
  uint *in_x12;
  ulong uVar5;
  uint *puVar6;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  uint *unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long lVar7;
  undefined8 in_stack_00000000;
  undefined8 *in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  long lStack0000000000000038;
  long lStack0000000000000040;
  long lStack0000000000000048;
  
  do {
    uVar3 = param_1;
    if (!(bool)in_ZR) {
      do {
        if (unaff_x26 <= in_x11) goto LAB_004d5844;
        in_x12 = (uint *)(unaff_x27 + in_x11 * unaff_x28 + 0x24);
        in_x11 = (ulong)*in_x12;
      } while (in_x11 != unaff_x25);
    }
    *in_x12 = in_w10;
LAB_004d5844:
    do {
      do {
        param_1 = unaff_x25;
        *(int *)(in_x9 + 4) = (int)uVar3;
        *(undefined8 *)((long)in_x9 + 0x24) = 0xffffffffffffffff;
        *(undefined4 *)((long)in_x9 + 0x2c) = 0xffffffff;
        *(int *)(unaff_x20 + 0x44) = (int)param_1;
        unaff_x21 = unaff_x21 + -1;
        *(long *)(unaff_x20 + 0x38) = unaff_x21;
        lStack0000000000000038 = in_x9[1];
        lVar7 = *in_x9;
        lStack0000000000000048 = in_x9[3];
        lStack0000000000000040 = in_x9[2];
        *in_x9 = unaff_x19;
        _uStack0000000000000030 = lVar7;
        if ((lVar7 != unaff_x19) && (func_0x004ce418(&uStack0000000000000030), lVar7 != 0)) {
          func_0x00187bd4(lStack0000000000000038,lVar7 * 0x48,8);
        }
        do {
          unaff_x25 = (ulong)unaff_x24[1];
          if (unaff_x24[1] == 0xffffffff) {
            uVar1 = *(uint *)(unaff_x20 + 0x40);
            *unaff_x24 = uVar1;
            unaff_x24[1] = 0xffffffff;
            if (uVar1 != 0xffffffff) {
              if (unaff_x22 <= uVar1) {
                func_0x007a2570();
                    /* WARNING: Does not return */
                pcVar2 = (code *)SoftwareBreakpoint(1,0x4d58b4);
                (*pcVar2)();
              }
              *(undefined4 *)(in_stack_00000010 + (ulong)uVar1 * 0x20 + 0x1c) =
                   in_stack_00000000._4_4_;
            }
            *(undefined4 *)(unaff_x20 + 0x40) = in_stack_00000000._4_4_;
            *(long *)(unaff_x20 + 0x30) = *(long *)(unaff_x20 + 0x30) + -1;
            in_stack_00000008[1] = in_stack_00000020;
            *in_stack_00000008 = in_stack_00000018;
            in_stack_00000008[2] = in_stack_00000028;
            return;
          }
        } while ((unaff_x26 <= unaff_x25) ||
                (in_x9 = (long *)(unaff_x27 + unaff_x25 * unaff_x28), *in_x9 == unaff_x19));
        uVar4 = in_x9[5];
        uVar5 = uVar4 & 0xffffffff;
        uVar3 = param_1;
      } while (unaff_x22 <= uVar5);
      in_w10 = *(uint *)((long)in_x9 + 0x24);
      puVar6 = (uint *)(in_stack_00000010 + uVar5 * 0x20 + 0x18);
      uVar1 = *puVar6;
      while (uVar5 = (ulong)uVar1, uVar5 != unaff_x25) {
        if (unaff_x26 <= uVar5) goto code_r0x004d5808;
        puVar6 = (uint *)(unaff_x27 + uVar5 * unaff_x28 + 0x20);
        uVar1 = *puVar6;
      }
      *puVar6 = *(uint *)(in_x9 + 4);
code_r0x004d5808:
      uVar4 = uVar4 >> 0x20;
    } while (unaff_x22 <= uVar4);
    in_x12 = (uint *)(in_stack_00000010 + uVar4 * 0x20 + 0x1c);
    in_x11 = (ulong)*in_x12;
    in_ZR = in_x11 == unaff_x25;
  } while( true );
}

