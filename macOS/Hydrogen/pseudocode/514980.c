
void FUN_00514980(double param_1)

{
  long *plVar1;
  ulong uVar2;
  double *pdVar3;
  long *plVar4;
  long lVar5;
  code *pcVar6;
  ulong uVar7;
  ulong uVar8;
  long *unaff_x19;
  long unaff_x22;
  long *plVar9;
  long *unaff_x23;
  long unaff_x24;
  double unaff_x25;
  long unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  double unaff_d8;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  double dStack0000000000000010;
  ulong uStack0000000000000018;
  double in_stack_00000020;
  long *in_stack_00000028;
  double in_stack_00000030;
  long in_stack_00000038;
  ulong in_stack_00000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000050;
  long in_stack_00000058;
  ulong in_stack_00000060;
  undefined8 uStack0000000000000068;
  long in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  
code_r0x00514980:
  dStack0000000000000010 = (double)func_0x00187bd0(param_1,1);
  if (dStack0000000000000010 == 0.0) {
    dStack0000000000000010 = unaff_x25;
code_r0x00514ac8:
    func_0x007a1f00(in_stack_00000000,dStack0000000000000010,&UNK_009e9838);
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x514ae0);
    (*pcVar6)();
  }
  _memcpy(dStack0000000000000010,unaff_x26,unaff_x25);
  param_1 = unaff_x25;
  if (in_stack_00000060 == 0) goto LAB_005149d0;
code_r0x005149a4:
  if (in_stack_00000060 == 1) {
    uVar7 = 0;
  }
  else {
    uVar7 = 0;
    uVar8 = in_stack_00000060;
    do {
      uVar2 = (uVar8 >> 1) + uVar7;
      if (*(double *)(in_stack_00000058 + uVar2 * 0x20) <= unaff_d8) {
        uVar7 = uVar2;
      }
      uVar8 = uVar8 - (uVar8 >> 1);
    } while (1 < uVar8);
  }
  if (*(double *)(in_stack_00000058 + uVar7 * 0x20) <= unaff_d8) {
    uVar7 = uVar7 + 1;
  }
  uStack0000000000000018 = in_stack_00000060;
  if (in_stack_00000060 != uStack0000000000000050) goto LAB_00514a48;
  do {
    uStack0000000000000018 = in_stack_00000060;
    func_0x0050c2ec(&uStack0000000000000050,&UNK_009e9850);
LAB_00514a48:
    do {
      pdVar3 = (double *)(in_stack_00000058 + uVar7 * 0x20);
      if (uVar7 <= uStack0000000000000018 && uStack0000000000000018 - uVar7 != 0) {
        _memmove(pdVar3 + 4,pdVar3,(uStack0000000000000018 - uVar7) * 0x20);
      }
      *pdVar3 = unaff_d8;
      pdVar3[1] = param_1;
      pdVar3[2] = dStack0000000000000010;
      pdVar3[3] = param_1;
      in_stack_00000060 = uStack0000000000000018 + 1;
      plVar9 = unaff_x23;
      do {
        unaff_x23 = plVar9;
        if (unaff_x28 == 2) {
code_r0x00514858:
          if ((unaff_x24 == 0) || (unaff_x24 == in_stack_00000038)) {
            if (in_stack_00000040 == 2) goto code_r0x00514a70;
            lVar5 = unaff_x22;
            if ((in_stack_00000040 & 1) != 0) {
              if (unaff_x27 != 0) {
                unaff_x28 = 2;
                param_1 = in_stack_00000020;
                unaff_x26 = unaff_x27;
                unaff_x27 = 0;
                goto code_r0x00514934;
              }
              in_stack_00000040 = 0;
              unaff_x27 = 0;
            }
            if ((unaff_x19 == (long *)0x0) || (unaff_x19 == in_stack_00000028)) {
code_r0x00514a70:
              in_stack_00000080 = in_stack_00000058 + in_stack_00000060 * 0x20;
              uStack0000000000000068 = in_stack_00000058;
              in_stack_00000070 = in_stack_00000058;
              in_stack_00000078 = uStack0000000000000050;
              func_0x0051601c(in_stack_00000008,&uStack0000000000000068,&UNK_009e7fb0);
              return;
            }
            unaff_x26 = *unaff_x19;
            param_1 = (double)unaff_x19[1];
            unaff_x28 = 2;
            unaff_x19 = unaff_x19 + 3;
          }
          else {
            plVar9 = (long *)(unaff_x24 + 0x230);
            param_1 = *(double *)(unaff_x24 + 0x238);
            plVar1 = (long *)(unaff_x24 + 0x40);
            plVar4 = (long *)(unaff_x24 + 0x48);
            unaff_x24 = unaff_x24 + 0x2c8;
            in_stack_00000048 = (long *)*plVar1 + *plVar4 * 3;
            unaff_x28 = 1;
            lVar5 = 0;
            unaff_x23 = (long *)*plVar1;
            unaff_x26 = *plVar9;
            in_stack_00000030 = param_1;
          }
        }
        else if ((unaff_x28 & 1) == 0) {
joined_r0x005148e0:
          if ((plVar9 == (long *)0x0) || (plVar9 == in_stack_00000048)) goto code_r0x00514858;
          unaff_x23 = plVar9 + 3;
          unaff_x26 = *plVar9;
          param_1 = (double)plVar9[1];
          lVar5 = unaff_x22;
        }
        else {
          if (unaff_x22 == 0) {
            unaff_x28 = 0;
            unaff_x22 = 0;
            goto joined_r0x005148e0;
          }
          lVar5 = 0;
          param_1 = in_stack_00000030;
          unaff_x26 = unaff_x22;
        }
code_r0x00514934:
        unaff_x22 = lVar5;
        unaff_d8 = (double)func_0x005320d4();
        plVar9 = unaff_x23;
      } while (unaff_d8 <= 0.7);
      if ((long)param_1 < 0) {
        in_stack_00000000 = 0;
        goto code_r0x00514ac8;
      }
      if (param_1 != 0.0) {
        unaff_x25 = param_1;
        goto code_r0x00514980;
      }
      dStack0000000000000010 = 4.94065645841247e-324;
      _memcpy(1,unaff_x26,0);
      if (in_stack_00000060 != 0) goto code_r0x005149a4;
LAB_005149d0:
      uVar7 = in_stack_00000060;
      uStack0000000000000018 = in_stack_00000060;
    } while (in_stack_00000060 != uStack0000000000000050);
  } while( true );
}

