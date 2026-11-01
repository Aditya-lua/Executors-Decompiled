
void FUN_001a2030(ulong param_1,ulong param_2,ulong param_3)

{
  code *pcVar1;
  ulong *puVar2;
  ulong *unaff_x19;
  long unaff_x20;
  ulong *puVar3;
  ulong *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong uVar4;
  ulong uVar5;
  ulong unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000000;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 *in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  
code_r0x001a2030:
  _memcpy(param_1,param_2,param_3);
  uVar5 = unaff_x25;
  uVar4 = unaff_x26;
code_r0x001a203c:
  unaff_x24 = unaff_x24 & 0xffffffff00000000 | unaff_x22 | unaff_x23 << 0x10;
  do {
    puVar2 = unaff_x19;
    puVar3 = unaff_x21;
LAB_001a1ec0:
    while( true ) {
      unaff_x27 = unaff_x27 + 1;
      puVar2[-2] = uVar4;
      puVar2[-1] = uVar5;
      unaff_x19 = puVar2 + 4;
      *puVar2 = unaff_x26;
      puVar2[1] = unaff_x24;
      unaff_x21 = puVar3 + 4;
      unaff_x20 = unaff_x20 + -0x20;
      if ((unaff_x28 == unaff_x27) || (unaff_x20 == 0)) {
        in_stack_00000020[1] = in_stack_00000030;
        *in_stack_00000020 = in_stack_00000028;
        in_stack_00000020[2] = unaff_x28;
        return;
      }
      uVar4 = puVar3[2];
      uVar5 = uVar4 + 0x7fffffffffffffff;
      if (3 < uVar4 + 0x7fffffffffffffff) {
        uVar5 = 4;
      }
      puVar2 = unaff_x19;
      if ((long)uVar5 < 2) break;
      if (uVar5 == 2) goto code_r0x001a1eb8;
      if (uVar5 != 3) {
        unaff_x22 = (ulong)(ushort)puVar3[5];
        unaff_x23 = (ulong)*(ushort *)((long)puVar3 + 0x2a);
        if (uVar4 == 0x8000000000000000) {
          uVar5 = puVar3[3];
          unaff_x26 = puVar3[4];
          uVar4 = 0x8000000000000000;
          goto code_r0x001a203c;
        }
        param_3 = *unaff_x21;
        if ((long)param_3 < 0) {
code_r0x001a20c8:
          in_stack_00000000 = 0;
          in_stack_00000018 = unaff_x25;
          goto code_r0x001a20cc;
        }
        param_2 = puVar3[3];
        if (param_3 == 0) {
          param_1 = 1;
        }
        else {
          param_1 = func_0x00187bd0(param_3,1);
          if (param_1 == 0) {
            in_stack_00000018 = param_3;
            goto code_r0x001a20cc;
          }
        }
        unaff_x25 = param_1;
        unaff_x26 = param_3;
        goto code_r0x001a2030;
      }
      unaff_x24 = puVar3[5];
      if ((long)unaff_x24 < 0) {
        unaff_x25 = in_stack_00000010;
        goto code_r0x001a20c8;
      }
      uVar5 = *unaff_x21;
      if (unaff_x24 == 0) {
        unaff_x26 = 1;
      }
      else {
        unaff_x26 = func_0x00187bd0(unaff_x24,1);
        if (unaff_x26 == 0) goto code_r0x001a208c;
      }
      _memcpy(unaff_x26,uVar5,unaff_x24);
      uVar4 = 0x8000000000000004;
      puVar3 = unaff_x21;
      uVar5 = unaff_x24;
      in_stack_00000010 = unaff_x26;
    }
    if (uVar5 == 0) {
code_r0x001a1eb8:
      uVar5 = puVar3[3];
      unaff_x26 = *unaff_x21;
      unaff_x24 = puVar3[5];
      puVar3 = unaff_x21;
      goto LAB_001a1ec0;
    }
    unaff_x24 = puVar3[5];
    if ((long)unaff_x24 < 0) {
      in_stack_00000000 = 0;
      goto code_r0x001a20cc;
    }
    uVar5 = *unaff_x21;
    if (unaff_x24 == 0) {
      unaff_x26 = 1;
    }
    else {
      unaff_x26 = func_0x00187bd0(unaff_x24,1);
      if (unaff_x26 == 0) {
code_r0x001a208c:
        in_stack_00000018 = unaff_x24;
code_r0x001a20cc:
        func_0x007a1f00(in_stack_00000000,in_stack_00000018,&UNK_009c24c0);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x1a20e4);
        (*pcVar1)();
      }
    }
    _memcpy(unaff_x26,uVar5,unaff_x24);
    uVar4 = 0x8000000000000002;
    uVar5 = unaff_x24;
    in_stack_00000018 = unaff_x26;
  } while( true );
}

