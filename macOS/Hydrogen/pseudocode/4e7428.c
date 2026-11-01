
void FUN_004e7428(long param_1)

{
  long *plVar1;
  long *plVar2;
  long *plVar3;
  code *pcVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  long *in_x12;
  ulong uVar8;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  long lVar9;
  long unaff_x24;
  long lVar10;
  long *unaff_x27;
  long *plVar11;
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
  undefined8 uStack0000000000000068;
  long in_stack_00000070;
  long in_stack_00000078;
  
  do {
    plVar11 = unaff_x27 + 3;
    uVar8 = 2;
    lVar6 = unaff_x27[1];
    lVar9 = unaff_x24;
    lVar10 = *unaff_x27;
code_r0x004e7430:
    unaff_x24 = lVar9;
    if (lVar6 < 0) {
      in_stack_00000008 = 0;
code_r0x004e7668:
      func_0x007a1f00(in_stack_00000008,in_stack_00000040,&UNK_009e7fe0);
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x4e7694);
      (*pcVar4)();
    }
    if (lVar6 == 0) {
      in_stack_00000040 = 1;
    }
    else {
      in_stack_00000040 = func_0x00187bd0(lVar6,1);
      if (in_stack_00000040 == 0) {
        in_stack_00000040 = lVar6;
        goto code_r0x004e7668;
      }
      _memcpy(in_stack_00000040,lVar10,lVar6);
    }
    if (unaff_x22 == uStack0000000000000068) {
      if (uVar8 == 2) {
LAB_004e74d0:
        uVar5 = 0;
joined_r0x004e750c:
        if (unaff_x23 == 2) goto LAB_004e7538;
LAB_004e7544:
        if ((unaff_x23 & 1) == 0) {
          if (plVar11 == (long *)0x0) goto LAB_004e7538;
          uVar7 = ((ulong)((long)in_stack_00000020 - (long)plVar11) >> 3) * -0x5555555555555555;
        }
        else {
          uVar7 = (ulong)(unaff_x28 != 0);
          if (plVar11 != (long *)0x0) {
            uVar7 = uVar7 + ((ulong)((long)in_stack_00000020 - (long)plVar11) >> 3) *
                            -0x5555555555555555;
          }
        }
      }
      else {
        if ((uVar8 & 1) == 0) {
          if (in_x12 != (long *)0x0) {
            uVar5 = ((ulong)((long)in_stack_00000038 - (long)in_x12) >> 3) * -0x5555555555555555;
            goto LAB_004e7530;
          }
          goto LAB_004e74d0;
        }
        uVar5 = (ulong)(unaff_x24 != 0);
        if (in_x12 != (long *)0x0) {
          uVar5 = uVar5 + ((ulong)((long)in_stack_00000038 - (long)in_x12) >> 3) *
                          -0x5555555555555555;
          goto joined_r0x004e750c;
        }
LAB_004e7530:
        if (unaff_x23 != 2) goto LAB_004e7544;
LAB_004e7538:
        uVar7 = 0;
      }
      func_0x007a5594(&uStack0000000000000068,unaff_x22,uVar5 + uVar7 + 1,8,0x18);
      param_1 = in_stack_00000070;
    }
    lVar10 = param_1 + unaff_x21;
    *(long *)(lVar10 + 0x18) = lVar6;
    *(long *)(lVar10 + 0x20) = in_stack_00000040;
    *(long *)(lVar10 + 0x28) = lVar6;
    unaff_x22 = unaff_x22 + 1;
    unaff_x21 = unaff_x21 + 0x18;
    in_stack_00000078 = unaff_x22;
    if (uVar8 != 2) {
      if ((uVar8 & 1) == 0) {
        if (in_x12 != (long *)0x0) goto code_r0x004e73fc;
        goto code_r0x004e7354;
      }
      lVar9 = 0;
      if (unaff_x24 == 0) {
        uVar8 = 0;
        unaff_x24 = lVar9;
        if (in_x12 == (long *)0x0) goto code_r0x004e7354;
code_r0x004e73fc:
        if (in_x12 == in_stack_00000038) goto code_r0x004e7354;
        lVar10 = *in_x12;
        lVar6 = in_x12[1];
        in_x12 = in_x12 + 3;
        lVar9 = unaff_x24;
      }
      else {
        lVar6 = in_stack_00000028;
        lVar10 = unaff_x24;
      }
      goto code_r0x004e7430;
    }
code_r0x004e7354:
    if ((in_stack_00000048 != 0) && (in_stack_00000048 != in_stack_00000030)) {
      plVar1 = (long *)(in_stack_00000048 + 0x230);
      in_stack_00000028 = *(long *)(in_stack_00000048 + 0x238);
      plVar2 = (long *)(in_stack_00000048 + 0x40);
      plVar3 = (long *)(in_stack_00000048 + 0x48);
      in_stack_00000048 = in_stack_00000048 + 0x2c8;
      in_stack_00000038 = (long *)*plVar2 + *plVar3 * 3;
      uVar8 = 1;
      lVar6 = in_stack_00000028;
      in_x12 = (long *)*plVar2;
      lVar9 = 0;
      lVar10 = *plVar1;
      goto code_r0x004e7430;
    }
    if (unaff_x23 == 2) goto code_r0x004e75bc;
    if ((unaff_x23 & 1) == 0) goto joined_r0x004e73ec;
    if (unaff_x28 != 0) {
      uVar8 = 2;
      lVar6 = in_stack_00000018;
      lVar9 = unaff_x24;
      lVar10 = unaff_x28;
      unaff_x28 = 0;
      goto code_r0x004e7430;
    }
    unaff_x23 = 0;
    unaff_x28 = 0;
joined_r0x004e73ec:
    if ((plVar11 == (long *)0x0) || (unaff_x27 = plVar11, plVar11 == in_stack_00000020)) {
code_r0x004e75bc:
      in_stack_00000010[1] = in_stack_00000070;
      *in_stack_00000010 = uStack0000000000000068;
      in_stack_00000010[2] = unaff_x22;
      return;
    }
  } while( true );
}

