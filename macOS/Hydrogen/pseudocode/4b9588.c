
void FUN_004b9588(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  undefined1 in_ZR;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  ulong extraout_x9;
  ulong in_x9;
  uint extraout_w10;
  uint in_w10;
  uint uVar5;
  long lVar6;
  undefined8 *unaff_x19;
  long lVar7;
  ulong uVar8;
  undefined1 auVar9 [16];
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  ulong in_stack_00000048;
  undefined8 uStack0000000000000050;
  long in_stack_00000058;
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  
  auVar9._8_8_ = param_2;
  auVar9._0_8_ = param_1;
code_r0x004b9588:
  lVar2 = auVar9._8_8_;
  lVar6 = auVar9._0_8_;
  if ((bool)in_ZR) {
LAB_004b940c:
    uVar4 = 0;
    auVar9._8_8_ = lVar2;
    auVar9._0_8_ = 1;
LAB_004b9414:
    *(undefined1 (*) [16])(unaff_x19 + 2) = auVar9;
    unaff_x19[4] = 0x2f;
    *unaff_x19 = 1;
    unaff_x19[1] = uVar4;
    return;
  }
  in_x9 = in_x9 | (ulong)(in_w10 & 0x7f) << 0x2a;
  in_w10 = (uint)*(char *)(lVar6 + 7);
  if ((int)in_w10 < 0) {
    if (lVar2 == 8) goto LAB_004b940c;
    in_x9 = in_x9 | (ulong)(in_w10 & 0x7f) << 0x31;
    uVar5 = (uint)*(char *)(lVar6 + 8);
    if ((int)uVar5 < 0) {
      if (lVar2 == 9) goto LAB_004b940c;
      in_w10 = (uint)*(char *)(lVar6 + 9);
      if ((int)in_w10 < 0) {
LAB_004b9608:
        uVar4 = 1;
        goto LAB_004b9414;
      }
      in_x9 = in_x9 | (ulong)(uVar5 & 0x7f) << 0x38;
      uVar3 = 10;
      lVar6 = 0x3f;
    }
    else {
      uVar3 = 9;
      lVar6 = 0x38;
      in_w10 = uVar5;
    }
  }
  else {
    uVar3 = 8;
    lVar6 = 0x31;
  }
  do {
    uVar8 = auVar9._8_8_;
    lVar2 = uVar8 - uVar3;
    if (uVar3 <= uVar8) {
      lVar7 = auVar9._0_8_ + uVar3;
      uVar8 = (long)(int)in_w10 << lVar6 | in_x9;
      uVar3 = uVar8;
      if (0x1fff < uVar8) {
        uVar3 = 0x2000;
      }
      if (uVar8 == 0) {
        uStack0000000000000038 = 0;
        in_stack_00000040 = 8;
        in_stack_00000048 = 0;
        goto code_r0x004b9438;
      }
      lVar6 = func_0x00187bd0(uVar3 << 3,8);
      if (lVar6 != 0) {
        in_stack_00000048 = 0;
        uStack0000000000000038 = uVar3;
        in_stack_00000040 = lVar6;
        do {
          lVar6 = func_0x004b904c(&uStack0000000000000050,lVar6,lVar7,lVar2);
          uVar4 = in_stack_00000068;
          lVar2 = in_stack_00000060;
          lVar7 = in_stack_00000058;
          lVar1 = uStack0000000000000050;
          uVar3 = in_stack_00000048;
          if (uStack0000000000000050 != 3) {
            if (uStack0000000000000038 != 0) {
              func_0x00187bd4(in_stack_00000040,uStack0000000000000038 << 3,8);
            }
            unaff_x19[4] = uVar4;
            unaff_x19[3] = lVar2;
            unaff_x19[1] = lVar1;
            unaff_x19[2] = lVar7;
            *unaff_x19 = 1;
            return;
          }
          if (in_stack_00000048 == uStack0000000000000038) {
            lVar6 = func_0x0050c238(&uStack0000000000000038,&UNK_009e5610);
          }
          *(undefined8 *)(in_stack_00000040 + uVar3 * 8) = uVar4;
          in_stack_00000048 = uVar3 + 1;
          uVar8 = uVar8 - 1;
        } while (uVar8 != 0);
code_r0x004b9438:
        unaff_x19[4] = in_stack_00000040;
        unaff_x19[3] = uStack0000000000000038;
        unaff_x19[5] = in_stack_00000048;
        unaff_x19[1] = lVar7;
        unaff_x19[2] = lVar2;
        *unaff_x19 = 0;
        return;
      }
      auVar9 = func_0x007a1f00(8,uVar3 << 3,&UNK_009e55f8);
      goto LAB_004b9608;
    }
    auVar9 = func_0x007a28a4(uVar3,uVar8,&UNK_009e4938);
    lVar2 = auVar9._8_8_;
    if (lVar2 == 6) goto LAB_004b940c;
    in_x9 = extraout_x9 | (ulong)(extraout_w10 & 0x7f) << 0x23;
    in_w10 = (uint)*(char *)(auVar9._0_8_ + 6);
    if ((int)in_w10 < 0) break;
    uVar3 = 7;
    lVar6 = 0x2a;
  } while( true );
  in_ZR = lVar2 == 7;
  goto code_r0x004b9588;
}

