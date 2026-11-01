
void FUN_00514cbc(long param_1)

{
  double *pdVar1;
  long lVar2;
  code *pcVar3;
  int *piVar4;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong in_x12;
  long in_x13;
  long unaff_x20;
  int *unaff_x21;
  undefined8 uVar5;
  int *unaff_x24;
  ulong unaff_x25;
  double unaff_x27;
  double unaff_x28;
  double unaff_d8;
  double in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  double in_stack_00000040;
  long in_stack_00000048;
  
  while( true ) {
    if (*(double *)(param_1 + in_x13) <= unaff_d8) {
      in_x9 = in_x12;
    }
    in_x10 = in_x10 - in_x11;
    if (in_x10 < 2) break;
LAB_00514cb0:
    in_x11 = in_x10 >> 1;
    in_x12 = in_x11 + in_x9;
    in_x13 = in_x12 * 0x20;
  }
code_r0x00514cd4:
  if (*(double *)(param_1 + in_x9 * 0x20) <= unaff_d8) {
    in_x9 = in_x9 + 1;
  }
  in_x10 = unaff_x25;
  if (unaff_x25 != uStack0000000000000018) goto LAB_00514d04;
  do {
    func_0x0050c2ec(&uStack0000000000000018,&UNK_009e9850);
    param_1 = in_stack_00000020;
LAB_00514d04:
    do {
      pdVar1 = (double *)(param_1 + in_x9 * 0x20);
      if (in_x9 <= in_x10 && in_x10 - in_x9 != 0) {
        _memmove(pdVar1 + 4,pdVar1,(in_x10 - in_x9) * 0x20);
      }
      *pdVar1 = unaff_d8;
      pdVar1[1] = unaff_x28;
      pdVar1[2] = in_stack_00000010;
      pdVar1[3] = unaff_x28;
      in_stack_00000028 = in_x10 + 1;
      uVar5 = 1;
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
        while (piVar4 = unaff_x24 + 8, *unaff_x24 != 1) {
          unaff_x24 = piVar4;
          if (piVar4 == unaff_x21) goto code_r0x00514d64;
        }
        func_0x0045b558(&uStack0000000000000030,*(undefined8 *)(unaff_x24 + 2),
                        *(undefined8 *)(unaff_x24 + 4));
        unaff_x28 = in_stack_00000040;
        lVar2 = in_stack_00000038;
        unaff_x20 = in_stack_00000038;
        unaff_x27 = uStack0000000000000030;
        if (uStack0000000000000030 == -0.0) {
          if ((long)in_stack_00000040 < 0) {
            uVar5 = 0;
code_r0x00514dbc:
            func_0x007a1f00(uVar5,unaff_x28,&UNK_009e9838);
            goto code_r0x00514dec;
          }
          if (in_stack_00000040 == 0.0) {
            unaff_x20 = 1;
          }
          else {
            unaff_x20 = func_0x00187bd0(in_stack_00000040,1);
            if (unaff_x20 == 0) goto code_r0x00514dbc;
          }
          _memcpy(unaff_x20,lVar2,unaff_x28);
          unaff_x27 = unaff_x28;
        }
        unaff_d8 = (double)func_0x005320d4();
      } while (unaff_d8 <= 0.7);
      if ((long)unaff_x28 < 0) {
        uVar5 = 0;
code_r0x00514ddc:
        func_0x007a1f00(uVar5,in_stack_00000010,&UNK_009e9838);
code_r0x00514dec:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x514df0);
        (*pcVar3)();
      }
      if (unaff_x28 == 0.0) {
        in_stack_00000010 = 4.94065645841247e-324;
        _memcpy(1,unaff_x20,0);
        param_1 = in_stack_00000020;
        in_x10 = in_stack_00000028;
      }
      else {
        in_stack_00000010 = (double)func_0x00187bd0(unaff_x28,1);
        if (in_stack_00000010 == 0.0) {
          uVar5 = 1;
          in_stack_00000010 = unaff_x28;
          goto code_r0x00514ddc;
        }
        _memcpy(in_stack_00000010,unaff_x20,unaff_x28);
        param_1 = in_stack_00000020;
        in_x10 = in_stack_00000028;
      }
      in_stack_00000020 = param_1;
      in_stack_00000028 = in_x10;
      if (in_x10 != 0) {
        unaff_x25 = in_x10;
        if (in_x10 == 1) {
          in_x9 = 0;
          goto code_r0x00514cd4;
        }
        in_x9 = 0;
        goto LAB_00514cb0;
      }
      in_x9 = 0;
    } while (uStack0000000000000018 != 0);
  } while( true );
}

