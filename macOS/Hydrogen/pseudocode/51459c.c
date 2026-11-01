
void FUN_0051459c(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  ulong uVar1;
  double *pdVar2;
  code *pcVar3;
  ulong uVar4;
  ulong uVar5;
  long unaff_x20;
  double unaff_x25;
  double dVar6;
  undefined8 uVar7;
  double dVar8;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  ulong in_stack_00000040;
  long in_stack_00000048;
  
  uStack0000000000000008 = 1;
  uStack0000000000000010 = param_1;
  do {
    dVar8 = (double)func_0x005320d4(param_2,param_3,*(undefined8 *)(param_4 + 8),
                                    *(undefined8 *)(param_4 + 0x10));
    if (0.7 < dVar8) {
      dVar6 = *(double *)(param_4 + 0x10);
      if ((long)dVar6 < 0) {
        uStack0000000000000008 = 0;
code_r0x00514764:
        func_0x007a1f00(uStack0000000000000008,unaff_x25,&UNK_009e9838);
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x51477c);
        (*pcVar3)();
      }
      uVar7 = *(undefined8 *)(param_4 + 8);
      if (dVar6 == 0.0) {
        unaff_x25 = 4.94065645841247e-324;
        _memcpy(1,uVar7,0);
        if (in_stack_00000028 != 0) goto LAB_00514644;
LAB_00514670:
        uVar4 = in_stack_00000028;
        uVar5 = in_stack_00000028;
        if (in_stack_00000028 == uStack0000000000000018) goto LAB_005146cc;
      }
      else {
        unaff_x25 = (double)func_0x00187bd0(dVar6,1);
        if (unaff_x25 == 0.0) {
          unaff_x25 = dVar6;
          goto code_r0x00514764;
        }
        _memcpy(unaff_x25,uVar7,dVar6);
        if (in_stack_00000028 == 0) goto LAB_00514670;
LAB_00514644:
        if (in_stack_00000028 == 1) {
          uVar4 = 0;
        }
        else {
          uVar4 = 0;
          uVar5 = in_stack_00000028;
          do {
            uVar1 = (uVar5 >> 1) + uVar4;
            if (*(double *)(in_stack_00000020 + uVar1 * 0x20) <= dVar8) {
              uVar4 = uVar1;
            }
            uVar5 = uVar5 - (uVar5 >> 1);
          } while (1 < uVar5);
        }
        if (*(double *)(in_stack_00000020 + uVar4 * 0x20) <= dVar8) {
          uVar4 = uVar4 + 1;
        }
        uVar5 = in_stack_00000028;
        if (in_stack_00000028 == uStack0000000000000018) {
LAB_005146cc:
          uVar5 = in_stack_00000028;
          func_0x0050c2ec(&uStack0000000000000018,&UNK_009e9850);
        }
      }
      pdVar2 = (double *)(in_stack_00000020 + uVar4 * 0x20);
      if (uVar4 <= uVar5 && uVar5 - uVar4 != 0) {
        _memmove(pdVar2 + 4,pdVar2,(uVar5 - uVar4) * 0x20);
      }
      *pdVar2 = dVar8;
      pdVar2[1] = dVar6;
      pdVar2[2] = unaff_x25;
      pdVar2[3] = dVar6;
      in_stack_00000028 = uVar5 + 1;
    }
    param_4 = param_4 + 0x18;
    if (param_4 == unaff_x20) {
      uStack0000000000000030 = in_stack_00000020;
      in_stack_00000038 = in_stack_00000020;
      in_stack_00000048 = in_stack_00000020 + in_stack_00000028 * 0x20;
      in_stack_00000040 = uStack0000000000000018;
      func_0x0051601c(uStack0000000000000010,&uStack0000000000000030,&UNK_009e7fb0);
      return;
    }
  } while( true );
}

