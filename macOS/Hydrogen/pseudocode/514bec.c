
void FUN_00514bec(long param_1,long param_2,double param_3)

{
  ulong uVar1;
  double *pdVar2;
  code *pcVar3;
  undefined8 uVar4;
  int *piVar5;
  ulong uVar6;
  ulong uVar7;
  int *unaff_x21;
  undefined8 unaff_x22;
  int *unaff_x24;
  long unaff_x26;
  double unaff_x28;
  double dVar8;
  double dVar9;
  double in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  double in_stack_00000040;
  long in_stack_00000048;
  
  do {
    _memcpy(param_1,param_2,param_3);
    dVar8 = unaff_x28;
    do {
      dVar9 = (double)func_0x005320d4();
      if (0.7 < dVar9) {
        if ((long)dVar8 < 0) {
          uVar4 = 0;
code_r0x00514ddc:
          func_0x007a1f00(uVar4,in_stack_00000010,&UNK_009e9838);
          goto code_r0x00514dec;
        }
        if (dVar8 == 0.0) {
          in_stack_00000010 = 4.94065645841247e-324;
          _memcpy(1,unaff_x26,0);
          if (in_stack_00000028 != 0) goto LAB_00514c68;
LAB_00514c94:
          uVar6 = in_stack_00000028;
          uVar7 = in_stack_00000028;
          if (in_stack_00000028 == uStack0000000000000018) goto code_r0x00514cf0;
        }
        else {
          in_stack_00000010 = (double)func_0x00187bd0(dVar8,1);
          if (in_stack_00000010 == 0.0) {
            uVar4 = 1;
            in_stack_00000010 = dVar8;
            goto code_r0x00514ddc;
          }
          _memcpy(in_stack_00000010,unaff_x26,dVar8);
          if (in_stack_00000028 == 0) goto LAB_00514c94;
LAB_00514c68:
          if (in_stack_00000028 == 1) {
            uVar6 = 0;
          }
          else {
            uVar6 = 0;
            uVar7 = in_stack_00000028;
            do {
              uVar1 = (uVar7 >> 1) + uVar6;
              if (*(double *)(in_stack_00000020 + uVar1 * 0x20) <= dVar9) {
                uVar6 = uVar1;
              }
              uVar7 = uVar7 - (uVar7 >> 1);
            } while (1 < uVar7);
          }
          if (*(double *)(in_stack_00000020 + uVar6 * 0x20) <= dVar9) {
            uVar6 = uVar6 + 1;
          }
          uVar7 = in_stack_00000028;
          if (in_stack_00000028 == uStack0000000000000018) {
code_r0x00514cf0:
            uVar7 = in_stack_00000028;
            func_0x0050c2ec(&uStack0000000000000018,&UNK_009e9850);
          }
        }
        pdVar2 = (double *)(in_stack_00000020 + uVar6 * 0x20);
        if (uVar6 <= uVar7 && uVar7 - uVar6 != 0) {
          _memmove(pdVar2 + 4,pdVar2,(uVar7 - uVar6) * 0x20);
        }
        *pdVar2 = dVar9;
        pdVar2[1] = dVar8;
        pdVar2[2] = in_stack_00000010;
        pdVar2[3] = dVar8;
        in_stack_00000028 = uVar7 + 1;
        unaff_x22 = 1;
      }
      if (unaff_x28 != 0.0) {
        func_0x00187bd4(unaff_x26,unaff_x28,1);
      }
      if (unaff_x24 + 8 == unaff_x21) {
code_r0x00514d64:
        in_stack_00000048 = in_stack_00000020 + in_stack_00000028 * 0x20;
        uStack0000000000000030 = (double)in_stack_00000020;
        in_stack_00000038 = in_stack_00000020;
        in_stack_00000040 = (double)uStack0000000000000018;
        func_0x0051601c(&uStack0000000000000030,&UNK_009e7fb0);
        return;
      }
      unaff_x24 = unaff_x24 + 8;
      while (piVar5 = unaff_x24 + 8, *unaff_x24 != 1) {
        unaff_x24 = piVar5;
        if (piVar5 == unaff_x21) goto code_r0x00514d64;
      }
      func_0x0045b558(&uStack0000000000000030,*(undefined8 *)(unaff_x24 + 2),
                      *(undefined8 *)(unaff_x24 + 4));
      param_3 = in_stack_00000040;
      param_2 = in_stack_00000038;
      unaff_x26 = in_stack_00000038;
      unaff_x28 = uStack0000000000000030;
      dVar8 = in_stack_00000040;
    } while (uStack0000000000000030 != -0.0);
    if ((long)in_stack_00000040 < 0) {
      unaff_x22 = 0;
code_r0x00514dbc:
      func_0x007a1f00(unaff_x22,param_3,&UNK_009e9838);
code_r0x00514dec:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x514df0);
      (*pcVar3)();
    }
    if (in_stack_00000040 == 0.0) {
      param_1 = 1;
    }
    else {
      param_1 = func_0x00187bd0(in_stack_00000040,1);
      if (param_1 == 0) goto code_r0x00514dbc;
    }
    unaff_x26 = param_1;
    unaff_x28 = param_3;
  } while( true );
}

