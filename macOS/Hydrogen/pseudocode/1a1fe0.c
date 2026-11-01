
void FUN_001a1fe0(long param_1)

{
  ushort uVar1;
  ulong uVar2;
  code *pcVar3;
  ulong uVar4;
  ulong *puVar5;
  ulong *unaff_x19;
  long unaff_x20;
  ulong *puVar6;
  ulong *unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong uVar7;
  long unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000000;
  ulong in_stack_00000008;
  ulong uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 *in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  
  do {
    uVar7 = param_1 + 2;
    puVar5 = unaff_x19;
    puVar6 = unaff_x21;
    uVar4 = unaff_x25;
    uStack0000000000000010 = unaff_x24;
LAB_001a1ec0:
    while( true ) {
      unaff_x27 = unaff_x27 + 1;
      puVar5[-2] = uVar7;
      puVar5[-1] = uVar4;
      unaff_x19 = puVar5 + 4;
      *puVar5 = unaff_x24;
      puVar5[1] = unaff_x25;
      unaff_x21 = puVar6 + 4;
      unaff_x20 = unaff_x20 + -0x20;
      if ((unaff_x28 == unaff_x27) || (unaff_x20 == 0)) {
        in_stack_00000020[1] = in_stack_00000030;
        *in_stack_00000020 = in_stack_00000028;
        in_stack_00000020[2] = unaff_x28;
        return;
      }
      uVar7 = puVar6[2];
      uVar4 = uVar7 + unaff_x22;
      if (3 < uVar7 + unaff_x22) {
        uVar4 = unaff_x23;
      }
      puVar5 = unaff_x19;
      if (1 < (long)uVar4) break;
      if (uVar4 != 0) {
        unaff_x25 = puVar6[5];
        if (-1 < (long)unaff_x25) {
          uVar7 = *unaff_x21;
          if (unaff_x25 == 0) {
            unaff_x24 = 1;
          }
          else {
            unaff_x24 = func_0x00187bd0(unaff_x25,1);
            if (unaff_x24 == 0) goto code_r0x001a208c;
          }
          _memcpy(unaff_x24,uVar7,unaff_x25);
          uVar7 = 0x8000000000000002;
          uVar4 = unaff_x25;
          in_stack_00000018 = unaff_x24;
          goto code_r0x001a204c;
        }
        in_stack_00000000 = 0;
        goto code_r0x001a20cc;
      }
code_r0x001a1eb8:
      uVar4 = puVar6[3];
      unaff_x24 = *unaff_x21;
      unaff_x25 = puVar6[5];
      puVar6 = unaff_x21;
    }
    if (uVar4 == 2) goto code_r0x001a1eb8;
    if (uVar4 != 3) {
      uVar2 = puVar6[5];
      uVar1 = *(ushort *)((long)puVar6 + 0x2a);
      if (uVar7 == 0x8000000000000000) {
        uVar4 = puVar6[3];
        unaff_x24 = puVar6[4];
        uVar7 = 0x8000000000000000;
      }
      else {
        unaff_x24 = *unaff_x21;
        if ((long)unaff_x24 < 0) {
          in_stack_00000018 = in_stack_00000008;
          goto code_r0x001a20c8;
        }
        uVar7 = puVar6[3];
        if (unaff_x24 == 0) {
          uVar4 = 1;
        }
        else {
          uVar4 = func_0x00187bd0(unaff_x24,1);
          if (uVar4 == 0) {
            in_stack_00000018 = unaff_x24;
            goto code_r0x001a20cc;
          }
        }
        _memcpy(uVar4,uVar7,unaff_x24);
        uVar7 = unaff_x24;
        in_stack_00000008 = uVar4;
      }
      unaff_x25 = unaff_x25 & 0xffffffff00000000 | (ulong)(ushort)uVar2 | (ulong)uVar1 << 0x10;
      unaff_x22 = 0x7fffffffffffffff;
code_r0x001a204c:
      unaff_x23 = 4;
      puVar6 = unaff_x21;
      goto LAB_001a1ec0;
    }
    unaff_x25 = puVar6[5];
    if ((long)unaff_x25 < 0) {
      in_stack_00000018 = uStack0000000000000010;
code_r0x001a20c8:
      in_stack_00000000 = 0;
      goto code_r0x001a20cc;
    }
    uVar7 = *unaff_x21;
    if (unaff_x25 == 0) {
      unaff_x24 = 1;
    }
    else {
      unaff_x24 = func_0x00187bd0(unaff_x25,1);
      if (unaff_x24 == 0) {
code_r0x001a208c:
        in_stack_00000018 = unaff_x25;
code_r0x001a20cc:
        func_0x007a1f00(in_stack_00000000,in_stack_00000018,&UNK_009c24c0);
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x1a20e4);
        (*pcVar3)();
      }
    }
    _memcpy(unaff_x24,uVar7,unaff_x25);
    param_1 = -0x7ffffffffffffffe;
  } while( true );
}

