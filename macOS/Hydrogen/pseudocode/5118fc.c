
void FUN_005118fc(undefined8 param_1,long param_2)

{
  char *pcVar1;
  char cVar2;
  code *pcVar3;
  ulong uVar4;
  undefined *puVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  char *pcVar9;
  char *in_x14;
  long in_x15;
  long in_x16;
  long in_x17;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong uVar10;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
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
  long lStack0000000000000058;
  long in_stack_00000060;
  ulong in_stack_00000068;
  long in_stack_00000070;
  undefined8 uStack0000000000000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  
LAB_00511858:
  do {
    uVar7 = unaff_x20 + in_stack_00000070;
    if (unaff_x21 <= uVar7) {
code_r0x005119e8:
      uVar7 = in_stack_00000028 - in_x17;
      if ((ulong)(uStack0000000000000078 - unaff_x25) < uVar7) {
        func_0x007a5594(&uStack0000000000000078,unaff_x25,uVar7,1,1);
        unaff_x25 = in_stack_00000088;
      }
      _memcpy(in_stack_00000080 + unaff_x25,in_stack_00000048 + in_x17,uVar7);
      in_stack_000000a0 = unaff_x25 + uVar7;
      in_stack_00000098 = in_stack_00000080;
      in_stack_00000090 = uStack0000000000000078;
      if (*in_stack_00000008 != 0) {
        func_0x00187bd4(in_stack_00000048,*in_stack_00000008,1);
      }
      in_stack_00000008[1] = in_stack_00000098;
      *in_stack_00000008 = in_stack_00000090;
      in_stack_00000008[2] = in_stack_000000a0;
      return;
    }
    while ((in_stack_00000068 >> ((ulong)*(byte *)(unaff_x23 + uVar7) & 0x3f) & 1) != 0) {
      lVar6 = -unaff_x20;
      uVar7 = unaff_x24 + unaff_x20;
      lVar8 = in_x15;
      pcVar9 = in_x14;
code_r0x00511888:
      if (lVar8 != 0) {
        if (uVar7 < unaff_x21) goto code_r0x00511894;
        uVar7 = unaff_x20 + unaff_x24;
code_r0x00511e18:
        uVar4 = unaff_x21;
        if (unaff_x21 <= uVar7) {
          uVar4 = uVar7;
        }
        puVar5 = &UNK_009e94b8;
        goto code_r0x00511e28;
      }
      if (in_stack_00000038._4_4_ == 0) {
        if (unaff_x24 != 0) {
          uVar4 = in_stack_00000000;
code_r0x00511e80:
          puVar5 = &UNK_009e9488;
code_r0x00511e88:
          func_0x007a2570(uVar4,unaff_x26,puVar5);
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x511e94);
          (*pcVar3)();
        }
      }
      else {
        uVar7 = unaff_x24;
        while (uVar7 != 0) {
          uVar4 = (unaff_x20 + uVar7) - 1;
          if (unaff_x21 <= uVar4) {
            puVar5 = &UNK_009e94a0;
code_r0x00511e28:
            unaff_x26 = unaff_x21;
            goto code_r0x00511e88;
          }
          pcVar9 = (char *)(in_x16 + uVar7);
          lVar8 = unaff_x23 + unaff_x20 + uVar7;
          uVar7 = uVar7 - 1;
          if (*pcVar9 != *(char *)(lVar8 + -1)) {
            unaff_x20 = unaff_x20 + in_stack_00000040;
            goto LAB_00511858;
          }
        }
      }
      uVar10 = 0xffffffffffffffff;
      uVar7 = unaff_x20 - in_x17;
      lStack0000000000000058 = in_x17;
      if ((ulong)(uStack0000000000000078 - unaff_x25) < uVar7) goto code_r0x00511984;
code_r0x00511920:
      lVar8 = uStack0000000000000078;
      _memcpy(param_2 + unaff_x25,in_stack_00000048 + lStack0000000000000058,uVar7);
      in_stack_00000088 = unaff_x25 + uVar7;
      if (lVar8 == in_stack_00000088) {
        func_0x007a5594(&uStack0000000000000078,lVar8,1,1,1);
        param_2 = in_stack_00000080;
      }
      in_x17 = unaff_x20 + unaff_x26;
      *(undefined1 *)(param_2 + in_stack_00000088) = 10;
      unaff_x25 = in_stack_00000088 + 1;
      uVar7 = in_x17 + in_stack_00000070;
      unaff_x20 = in_x17;
      in_stack_00000088 = unaff_x25;
      if (uVar10 != 0xffffffffffffffff) {
        if (uVar7 < unaff_x21) {
code_r0x0051177c:
          if ((in_stack_00000068 >> ((ulong)*(byte *)(unaff_x23 + uVar7) & 0x3f) & 1) == 0) {
            uVar10 = 0;
            lVar8 = unaff_x20 + unaff_x26;
          }
          else {
            uVar7 = uVar10;
            if (uVar10 <= in_stack_00000050) {
              uVar7 = in_stack_00000050;
            }
            uVar4 = unaff_x20 + uVar7;
            lVar8 = uVar4 + in_stack_00000060;
            lVar6 = 0;
            if (uVar7 <= unaff_x26) {
              lVar6 = unaff_x26 - uVar7;
            }
            pcVar9 = (char *)(unaff_x19 + uVar7);
            do {
              if (lVar6 == 0) {
                uVar7 = in_stack_00000050;
                goto code_r0x005117e0;
              }
              if (unaff_x21 <= uVar4) {
                uVar7 = unaff_x20 + uVar7;
                goto code_r0x00511e18;
              }
              cVar2 = *pcVar9;
              pcVar1 = (char *)(unaff_x23 + uVar4);
              lVar8 = lVar8 + 1;
              uVar4 = uVar4 + 1;
              lVar6 = lVar6 + -1;
              pcVar9 = pcVar9 + 1;
            } while (cVar2 == *pcVar1);
            uVar10 = 0;
          }
          goto code_r0x00511768;
        }
        goto code_r0x005119e8;
      }
      if (unaff_x21 <= uVar7) goto code_r0x005119e8;
      in_x14 = in_stack_00000020;
      in_x15 = in_stack_00000018;
      in_x16 = in_stack_00000010;
      unaff_x24 = in_stack_00000050;
    }
    unaff_x20 = unaff_x20 + unaff_x26;
  } while( true );
code_r0x00511894:
  cVar2 = *pcVar9;
  pcVar1 = (char *)(unaff_x23 + uVar7);
  lVar6 = lVar6 + -1;
  uVar7 = uVar7 + 1;
  lVar8 = lVar8 + -1;
  pcVar9 = pcVar9 + 1;
  if (cVar2 != *pcVar1) {
    unaff_x20 = -lVar6;
    goto LAB_00511858;
  }
  goto code_r0x00511888;
  while (*(char *)(unaff_x19 + uVar7) == *(char *)(unaff_x23 + uVar4)) {
code_r0x005117e0:
    if (uVar7 <= uVar10) {
      uVar10 = 0;
      uVar7 = unaff_x20 - in_x17;
      lStack0000000000000058 = in_x17;
      if ((ulong)(uStack0000000000000078 - unaff_x25) < uVar7) {
code_r0x00511984:
        func_0x007a5594(&uStack0000000000000078,unaff_x25,uVar7,1,1);
        param_2 = in_stack_00000080;
        unaff_x25 = in_stack_00000088;
      }
      goto code_r0x00511920;
    }
    uVar7 = uVar7 - 1;
    uVar4 = uVar7;
    if (unaff_x26 <= uVar7) goto code_r0x00511e80;
    uVar4 = uVar7 + unaff_x20;
    if (unaff_x21 <= uVar4) {
      puVar5 = &UNK_009e94a0;
      unaff_x26 = unaff_x21;
      goto code_r0x00511e88;
    }
  }
  lVar8 = unaff_x20 + in_stack_00000040;
  uVar10 = in_stack_00000030;
code_r0x00511768:
  uVar7 = lVar8 + in_stack_00000070;
  unaff_x20 = lVar8;
  if (unaff_x21 <= uVar7) goto code_r0x005119e8;
  goto code_r0x0051177c;
}

