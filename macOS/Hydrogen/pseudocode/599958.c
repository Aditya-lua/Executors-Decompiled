
void FUN_00599958(long param_1,long param_2)

{
  char *pcVar1;
  char cVar2;
  code *pcVar3;
  ulong uVar4;
  undefined *puVar5;
  long lVar6;
  long lVar7;
  char *pcVar8;
  ulong unaff_x19;
  ulong uVar9;
  ulong unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  ulong in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  char *in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  ulong in_stack_00000068;
  undefined8 in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000088;
  long in_stack_00000090;
  long in_stack_00000098;
  
code_r0x00599958:
  _memcpy(param_2,param_1 + in_stack_00000060,unaff_x21);
  in_stack_00000098 = unaff_x28 + unaff_x21;
  if ((ulong)(unaff_x24 - in_stack_00000098) < in_stack_00000068) {
    func_0x007acb90(&uStack0000000000000088,in_stack_00000098,in_stack_00000068);
    in_stack_00000080 = in_stack_00000090;
  }
  lVar7 = in_stack_00000098;
  in_stack_00000060 = unaff_x23 + unaff_x19;
  _memcpy(in_stack_00000080 + in_stack_00000098,in_stack_00000070,in_stack_00000068);
  in_stack_00000098 = lVar7 + in_stack_00000068;
  uVar9 = in_stack_00000060 + in_stack_00000048;
  unaff_x23 = in_stack_00000060;
  if (unaff_x20 == 0xffffffffffffffff) {
    if (uVar9 < unaff_x22) {
code_r0x005998a0:
      if ((in_stack_00000050 >> ((ulong)*(byte *)(unaff_x25 + uVar9) & 0x3f) & 1) == 0) {
        unaff_x23 = unaff_x23 + unaff_x19;
      }
      else {
        lVar6 = -unaff_x23;
        uVar9 = unaff_x27 + unaff_x23;
        lVar7 = in_stack_00000018;
        pcVar8 = in_stack_00000020;
        do {
          if (lVar7 == 0) {
            if (in_stack_00000038._4_4_ != 0) {
              uVar9 = unaff_x27;
              goto code_r0x005998fc;
            }
            if (unaff_x27 == 0) goto code_r0x00599934;
            uVar4 = in_stack_00000000;
            goto code_r0x00599e40;
          }
          if (unaff_x22 <= uVar9) {
            uVar9 = unaff_x23 + unaff_x27;
            goto code_r0x00599dc8;
          }
          cVar2 = *pcVar8;
          pcVar1 = (char *)(unaff_x25 + uVar9);
          lVar6 = lVar6 + -1;
          uVar9 = uVar9 + 1;
          lVar7 = lVar7 + -1;
          pcVar8 = pcVar8 + 1;
        } while (cVar2 == *pcVar1);
        unaff_x23 = -lVar6;
      }
      goto code_r0x00599894;
    }
  }
  else if (uVar9 < unaff_x22) {
code_r0x005997c4:
    if ((in_stack_00000050 >> ((ulong)*(byte *)(unaff_x25 + uVar9) & 0x3f) & 1) == 0) {
      unaff_x20 = 0;
      lVar7 = unaff_x23 + unaff_x19;
    }
    else {
      uVar9 = unaff_x20;
      if (unaff_x20 <= unaff_x27) {
        uVar9 = unaff_x27;
      }
      uVar4 = unaff_x23 + uVar9;
      lVar7 = uVar4 + in_stack_00000040;
      lVar6 = 0;
      if (uVar9 <= unaff_x19) {
        lVar6 = unaff_x19 - uVar9;
      }
      pcVar8 = (char *)(unaff_x26 + uVar9);
      do {
        if (lVar6 == 0) {
          uVar9 = unaff_x27;
          goto code_r0x00599820;
        }
        if (unaff_x22 <= uVar4) {
          uVar9 = unaff_x23 + uVar9;
code_r0x00599dc8:
          uVar4 = unaff_x22;
          if (unaff_x22 <= uVar9) {
            uVar4 = uVar9;
          }
          puVar5 = &UNK_009f19f8;
code_r0x00599dd8:
          goto code_r0x00599e48;
        }
        cVar2 = *pcVar8;
        pcVar1 = (char *)(unaff_x25 + uVar4);
        lVar7 = lVar7 + 1;
        uVar4 = uVar4 + 1;
        lVar6 = lVar6 + -1;
        pcVar8 = pcVar8 + 1;
      } while (cVar2 == *pcVar1);
      unaff_x20 = 0;
    }
    goto code_r0x005997b4;
  }
LAB_00599a44:
  uVar9 = in_stack_00000028 - in_stack_00000060;
  if ((ulong)(uStack0000000000000088 - in_stack_00000098) < uVar9) {
    func_0x007acb90(&uStack0000000000000088,in_stack_00000098,uVar9);
    in_stack_00000080 = in_stack_00000090;
  }
  lVar7 = in_stack_00000098;
  _memcpy(in_stack_00000080 + in_stack_00000098,in_stack_00000078 + in_stack_00000060,uVar9);
  in_stack_00000008[2] = lVar7 + uVar9;
  in_stack_00000008[1] = in_stack_00000090;
  *in_stack_00000008 = uStack0000000000000088;
  return;
  while( true ) {
    uVar4 = (unaff_x23 + uVar9) - 1;
    if (unaff_x22 <= uVar4) {
      puVar5 = &UNK_009f19e0;
      goto code_r0x00599dd8;
    }
    pcVar8 = (char *)(in_stack_00000010 + uVar9);
    lVar7 = unaff_x25 + unaff_x23 + uVar9;
    uVar9 = uVar9 - 1;
    if (*pcVar8 != *(char *)(lVar7 + -1)) break;
code_r0x005998fc:
    if (uVar9 == 0) goto code_r0x00599934;
  }
  unaff_x23 = unaff_x23 + in_stack_00000058;
code_r0x00599894:
  uVar9 = unaff_x23 + in_stack_00000048;
  if (unaff_x22 <= uVar9) goto LAB_00599a44;
  goto code_r0x005998a0;
code_r0x00599934:
  unaff_x20 = 0xffffffffffffffff;
  unaff_x21 = unaff_x23 - in_stack_00000060;
  if ((ulong)(uStack0000000000000088 - in_stack_00000098) < unaff_x21) {
code_r0x005999c0:
    func_0x007acb90(&uStack0000000000000088,in_stack_00000098,unaff_x21);
    in_stack_00000080 = in_stack_00000090;
  }
code_r0x00599950:
  param_2 = in_stack_00000080 + in_stack_00000098;
  param_1 = in_stack_00000078;
  unaff_x24 = uStack0000000000000088;
  unaff_x28 = in_stack_00000098;
  goto code_r0x00599958;
  while (*(char *)(unaff_x26 + uVar9) == *(char *)(unaff_x25 + uVar4)) {
code_r0x00599820:
    if (uVar9 <= unaff_x20) {
      unaff_x20 = 0;
      unaff_x21 = unaff_x23 - in_stack_00000060;
      if (unaff_x21 <= (ulong)(uStack0000000000000088 - in_stack_00000098)) goto code_r0x00599950;
      goto code_r0x005999c0;
    }
    uVar9 = uVar9 - 1;
    uVar4 = uVar9;
    if (unaff_x19 <= uVar9) goto code_r0x00599e40;
    uVar4 = uVar9 + unaff_x23;
    if (unaff_x22 <= uVar4) {
      puVar5 = &UNK_009f19e0;
      goto code_r0x00599e48;
    }
  }
  lVar7 = unaff_x23 + in_stack_00000058;
  unaff_x20 = in_stack_00000030;
code_r0x005997b4:
  uVar9 = lVar7 + in_stack_00000048;
  unaff_x23 = lVar7;
  if (unaff_x22 <= uVar9) goto LAB_00599a44;
  goto code_r0x005997c4;
code_r0x00599e40:
  puVar5 = &UNK_009f19c8;
  unaff_x22 = unaff_x19;
code_r0x00599e48:
  func_0x007a2570(uVar4,unaff_x22,puVar5);
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x599e54);
  (*pcVar3)();
}

