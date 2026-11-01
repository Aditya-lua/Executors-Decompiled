
void FUN_00514c7c(double param_1)

{
  ulong uVar1;
  double *pdVar2;
  long lVar3;
  code *pcVar4;
  int *piVar5;
  ulong uVar6;
  ulong uVar7;
  long unaff_x20;
  int *unaff_x21;
  undefined8 uVar8;
  int *unaff_x24;
  double unaff_x27;
  double unaff_x28;
  double unaff_d8;
  double dStack0000000000000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  double in_stack_00000040;
  long in_stack_00000048;
  
code_r0x00514c7c:
  dStack0000000000000010 = param_1;
  _memcpy(param_1,unaff_x20,unaff_x28);
  if (in_stack_00000028 != 0) goto LAB_00514c68;
  do {
    uVar6 = in_stack_00000028;
    uVar7 = in_stack_00000028;
    if (in_stack_00000028 == uStack0000000000000018) goto code_r0x00514cf0;
LAB_00514d04:
    pdVar2 = (double *)(in_stack_00000020 + uVar6 * 0x20);
    if (uVar6 <= uVar7 && uVar7 - uVar6 != 0) {
      _memmove(pdVar2 + 4,pdVar2,(uVar7 - uVar6) * 0x20);
    }
    *pdVar2 = unaff_d8;
    pdVar2[1] = unaff_x28;
    pdVar2[2] = dStack0000000000000010;
    pdVar2[3] = unaff_x28;
    in_stack_00000028 = uVar7 + 1;
    uVar8 = 1;
    do {
      if (unaff_x27 != 0.0) {
        func_0x00187bd4(unaff_x20,unaff_x27,1);
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
      unaff_x28 = in_stack_00000040;
      lVar3 = in_stack_00000038;
      unaff_x20 = in_stack_00000038;
      unaff_x27 = uStack0000000000000030;
      if (uStack0000000000000030 == -0.0) {
        if ((long)in_stack_00000040 < 0) {
          uVar8 = 0;
code_r0x00514dbc:
          func_0x007a1f00(uVar8,unaff_x28,&UNK_009e9838);
          goto code_r0x00514dec;
        }
        if (in_stack_00000040 == 0.0) {
          unaff_x20 = 1;
        }
        else {
          unaff_x20 = func_0x00187bd0(in_stack_00000040,1);
          if (unaff_x20 == 0) goto code_r0x00514dbc;
        }
        _memcpy(unaff_x20,lVar3,unaff_x28);
        unaff_x27 = unaff_x28;
      }
      unaff_d8 = (double)func_0x005320d4();
    } while (unaff_d8 <= 0.7);
    if ((long)unaff_x28 < 0) {
      uVar8 = 0;
code_r0x00514ddc:
      func_0x007a1f00(uVar8,dStack0000000000000010,&UNK_009e9838);
code_r0x00514dec:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x514df0);
      (*pcVar4)();
    }
    if (unaff_x28 == 0.0) {
      param_1 = 4.94065645841247e-324;
      goto code_r0x00514c7c;
    }
    dStack0000000000000010 = (double)func_0x00187bd0(unaff_x28,1);
    if (dStack0000000000000010 == 0.0) {
      uVar8 = 1;
      dStack0000000000000010 = unaff_x28;
      goto code_r0x00514ddc;
    }
    _memcpy(dStack0000000000000010,unaff_x20,unaff_x28);
  } while (in_stack_00000028 == 0);
LAB_00514c68:
  if (in_stack_00000028 == 1) {
    uVar6 = 0;
  }
  else {
    uVar6 = 0;
    uVar7 = in_stack_00000028;
    do {
      uVar1 = (uVar7 >> 1) + uVar6;
      if (*(double *)(in_stack_00000020 + uVar1 * 0x20) <= unaff_d8) {
        uVar6 = uVar1;
      }
      uVar7 = uVar7 - (uVar7 >> 1);
    } while (1 < uVar7);
  }
  if (*(double *)(in_stack_00000020 + uVar6 * 0x20) <= unaff_d8) {
    uVar6 = uVar6 + 1;
  }
  uVar7 = in_stack_00000028;
  if (in_stack_00000028 == uStack0000000000000018) {
code_r0x00514cf0:
    uVar7 = in_stack_00000028;
    func_0x0050c2ec(&uStack0000000000000018,&UNK_009e9850);
  }
  goto LAB_00514d04;
}

