
ulong FUN_0041ce64(ulong param_1,ulong param_2)

{
  char cVar1;
  code *pcVar2;
  undefined *puVar3;
  ulong uVar4;
  ulong in_x9;
  long in_x10;
  ulong *in_x11;
  undefined8 unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  ulong uVar5;
  undefined8 unaff_x22;
  undefined8 uVar6;
  long unaff_x23;
  ulong unaff_x25;
  undefined8 *puVar7;
  undefined1 auVar8 [16];
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  
  auVar8._8_8_ = unaff_x19;
  auVar8._0_8_ = unaff_x22;
code_r0x0041ce64:
  uVar5 = param_1 - *in_x11;
  if (*in_x11 <= param_1) goto code_r0x0041ce70;
  goto LAB_0041ce88;
code_r0x0041ce70:
  param_2 = param_2 + 1;
  in_x10 = in_x10 + -0x10;
  param_1 = uVar5;
  in_x11 = in_x11 + 2;
  if (in_x10 != 0) goto code_r0x0041ce64;
  param_2 = in_x9;
LAB_0041ce88:
  uVar5 = unaff_x21 - param_2;
  if (unaff_x21 < param_2) {
    func_0x007a28a4(param_2,unaff_x21,&UNK_009da738);
  }
  else {
    unaff_x20 = unaff_x20 + param_2 * 2;
    if (uVar5 == 0) {
      if (param_1 == 0) {
        uVar5 = 0;
LAB_0041cdec:
        while( true ) {
          uVar4 = auVar8._8_8_;
          if ((auVar8._0_4_ & (uint)((uVar4 & 3) == 1)) != 0) {
            uVar6 = *(undefined8 *)(uVar4 - 1);
            puVar7 = *(undefined8 **)(uVar4 + 7);
            if ((code *)*puVar7 != (code *)0x0) {
              (*(code *)*puVar7)(uVar6);
            }
            if (puVar7[1] != 0) {
              func_0x00187bd4(uVar6,puVar7[1],puVar7[2]);
            }
            func_0x00187bd4((undefined8 *)(uVar4 - 1),0x18,8);
          }
          if (uVar5 == 0) {
            param_1 = 0;
            goto code_r0x0041cda4;
          }
          auVar8 = func_0x00418640(unaff_x23 + 0x20,unaff_x20,uVar5);
          param_1 = auVar8._8_8_;
          if ((auVar8._0_8_ & 1) == 0) break;
          uVar4 = param_1 & 3;
          if (uVar4 < 2) {
            if (uVar4 == 0) {
              cVar1 = *(char *)(param_1 + 0x10);
            }
            else {
              cVar1 = *(char *)(param_1 + 0xf);
            }
            if (cVar1 != '#') goto code_r0x0041cda4;
          }
          else if (uVar4 == 2) {
            if (param_1 >> 0x20 != 4) goto code_r0x0041cda4;
          }
          else if (param_1 >> 0x20 != 0x23) goto code_r0x0041cda4;
        }
        if (param_1 == 0) {
          param_1 = unaff_x25;
code_r0x0041cda4:
          *(long *)(unaff_x23 + 0x18) = *(long *)(unaff_x23 + 0x18) + 1;
          return param_1;
        }
        param_2 = 0;
        in_x9 = (uVar5 - 1 & 0xfffffffffffffff) + 1;
        in_x10 = uVar5 << 4;
        in_x11 = (ulong *)(unaff_x20 + 1);
        unaff_x21 = uVar5;
        goto code_r0x0041ce64;
      }
      uStack0000000000000010 = &UNK_009da750;
      puVar3 = &UNK_009da760;
    }
    else {
      if (param_1 <= (ulong)unaff_x20[1]) {
        *unaff_x20 = *unaff_x20 + param_1;
        unaff_x20[1] = unaff_x20[1] - param_1;
        goto LAB_0041cdec;
      }
      uStack0000000000000010 = &UNK_009da778;
      puVar3 = &UNK_009da788;
    }
    in_stack_00000018 = 1;
    in_stack_00000020 = 8;
    in_stack_00000028 = 0;
    in_stack_00000030 = 0;
    func_0x007a2420(&uStack0000000000000010,puVar3);
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x41cfac);
  (*pcVar2)();
}

