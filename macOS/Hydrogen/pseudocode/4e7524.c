
void FUN_004e7524(ulong param_1)

{
  long *plVar1;
  long *plVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  code *pcVar6;
  ulong uVar7;
  long *in_x12;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  long lVar8;
  long *unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000008;
  long *in_stack_00000010;
  long in_stack_00000018;
  long *in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long *in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000060;
  undefined8 uStack0000000000000068;
  long in_stack_00000070;
  long in_stack_00000078;
  
code_r0x004e7524:
  param_1 = param_1 * -0x5555555555555555;
code_r0x004e7530:
  if (unaff_x23 != 2) goto LAB_004e7544;
LAB_004e7538:
  do {
    uVar7 = 0;
LAB_004e7594:
    func_0x007a5594(&uStack0000000000000068,unaff_x22,param_1 + uVar7 + 1,8,0x18);
    lVar4 = in_stack_00000070;
LAB_004e7324:
    do {
      lVar8 = lVar4 + unaff_x21;
      *(long *)(lVar8 + 0x18) = in_stack_00000060;
      *(long *)(lVar8 + 0x20) = unaff_x20;
      *(long *)(lVar8 + 0x28) = in_stack_00000060;
      unaff_x22 = unaff_x22 + 1;
      unaff_x21 = unaff_x21 + 0x18;
      if (unaff_x19 == 2) {
code_r0x004e7354:
        if ((in_stack_00000048 == 0) || (in_stack_00000048 == in_stack_00000030)) {
          if (unaff_x23 == 2) goto code_r0x004e75bc;
          lVar5 = unaff_x24;
          if ((unaff_x23 & 1) != 0) {
            if (unaff_x28 != 0) {
              unaff_x19 = 2;
              in_stack_00000060 = in_stack_00000018;
              lVar8 = unaff_x28;
              unaff_x28 = 0;
              goto code_r0x004e7430;
            }
            unaff_x23 = 0;
            unaff_x28 = 0;
          }
          if ((unaff_x27 == (long *)0x0) || (unaff_x27 == in_stack_00000020)) {
code_r0x004e75bc:
            in_stack_00000010[1] = in_stack_00000070;
            *in_stack_00000010 = uStack0000000000000068;
            in_stack_00000010[2] = unaff_x22;
            return;
          }
          in_stack_00000060 = unaff_x27[1];
          unaff_x19 = 2;
          lVar8 = *unaff_x27;
          unaff_x27 = unaff_x27 + 3;
        }
        else {
          plVar1 = (long *)(in_stack_00000048 + 0x230);
          in_stack_00000028 = *(long *)(in_stack_00000048 + 0x238);
          plVar2 = (long *)(in_stack_00000048 + 0x40);
          plVar3 = (long *)(in_stack_00000048 + 0x48);
          in_stack_00000048 = in_stack_00000048 + 0x2c8;
          in_stack_00000038 = (long *)*plVar2 + *plVar3 * 3;
          unaff_x19 = 1;
          in_stack_00000060 = in_stack_00000028;
          in_x12 = (long *)*plVar2;
          lVar5 = 0;
          lVar8 = *plVar1;
        }
      }
      else if ((unaff_x19 & 1) == 0) {
joined_r0x004e73e0:
        if ((in_x12 == (long *)0x0) || (in_x12 == in_stack_00000038)) goto code_r0x004e7354;
        lVar8 = *in_x12;
        in_stack_00000060 = in_x12[1];
        in_x12 = in_x12 + 3;
        lVar5 = unaff_x24;
      }
      else {
        if (unaff_x24 == 0) {
          unaff_x19 = 0;
          unaff_x24 = 0;
          goto joined_r0x004e73e0;
        }
        in_stack_00000060 = in_stack_00000028;
        lVar5 = 0;
        lVar8 = unaff_x24;
      }
code_r0x004e7430:
      unaff_x24 = lVar5;
      in_stack_00000078 = unaff_x22;
      if (in_stack_00000060 < 0) {
        in_stack_00000008 = 0;
code_r0x004e7668:
        func_0x007a1f00(in_stack_00000008,in_stack_00000040,&UNK_009e7fe0);
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x4e7694);
        (*pcVar6)();
      }
      if (in_stack_00000060 != 0) {
        unaff_x20 = func_0x00187bd0(in_stack_00000060,1);
        if (unaff_x20 == 0) {
          in_stack_00000040 = in_stack_00000060;
          goto code_r0x004e7668;
        }
        _memcpy(unaff_x20,lVar8,in_stack_00000060);
        in_stack_00000040 = unaff_x20;
        if (unaff_x22 == uStack0000000000000068) break;
        goto LAB_004e7324;
      }
      unaff_x20 = 1;
      in_stack_00000040 = 1;
    } while (unaff_x22 != uStack0000000000000068);
    unaff_x20 = in_stack_00000040;
    if (unaff_x19 == 2) {
code_r0x004e74d0:
      param_1 = 0;
    }
    else {
      if ((unaff_x19 & 1) == 0) {
        if (in_x12 == (long *)0x0) goto code_r0x004e74d0;
        param_1 = (ulong)((long)in_stack_00000038 - (long)in_x12) >> 3;
        goto code_r0x004e7524;
      }
      param_1 = (ulong)(unaff_x24 != 0);
      if (in_x12 == (long *)0x0) goto code_r0x004e7530;
      param_1 = param_1 + ((ulong)((long)in_stack_00000038 - (long)in_x12) >> 3) *
                          -0x5555555555555555;
    }
  } while (unaff_x23 == 2);
LAB_004e7544:
  if ((unaff_x23 & 1) == 0) {
    if (unaff_x27 == (long *)0x0) goto LAB_004e7538;
    uVar7 = ((ulong)((long)in_stack_00000020 - (long)unaff_x27) >> 3) * -0x5555555555555555;
  }
  else {
    uVar7 = (ulong)(unaff_x28 != 0);
    if (unaff_x27 != (long *)0x0) {
      uVar7 = uVar7 + ((ulong)((long)in_stack_00000020 - (long)unaff_x27) >> 3) *
                      -0x5555555555555555;
    }
  }
  goto LAB_004e7594;
}

