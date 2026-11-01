
void FUN_00511cbc(void)

{
  byte *pbVar1;
  long lVar2;
  byte bVar3;
  uint uVar4;
  long lVar5;
  code *pcVar6;
  undefined1 in_CY;
  uint in_w8;
  uint uVar7;
  undefined1 unaff_w19;
  long unaff_x20;
  ulong unaff_x21;
  ulong uVar8;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  ulong uVar9;
  long *in_stack_00000008;
  long in_stack_00000028;
  undefined8 uStack0000000000000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  
code_r0x00511cbc:
  if (!(bool)in_CY) goto LAB_00511bd4;
code_r0x00511cc0:
  uVar8 = unaff_x24;
  if (in_w8 < 0x800) {
    uVar9 = unaff_x24 + 2;
  }
  else {
    lVar2 = 3;
    if (0xffff < in_w8) {
      lVar2 = 4;
    }
    uVar9 = lVar2 + unaff_x24;
  }
  do {
    if (uVar9 != 0) {
      if (uVar9 < unaff_x21) {
        if (*(char *)(unaff_x23 + uVar9) < -0x40) goto code_r0x00511e5c;
      }
      else if (uVar9 != unaff_x21) goto code_r0x00511e5c;
    }
    unaff_x24 = unaff_x21;
    if (uVar9 != unaff_x21) {
      unaff_x24 = uVar9;
    }
    uVar9 = unaff_x24 - uVar8;
    if ((ulong)(uStack0000000000000078 - unaff_x25) < uVar9) {
      func_0x007a5594(&uStack0000000000000078,unaff_x25,uVar9,1,1);
      unaff_x25 = in_stack_00000088;
    }
    lVar5 = in_stack_00000080;
    lVar2 = uStack0000000000000078;
    _memcpy(in_stack_00000080 + unaff_x25,unaff_x20 + uVar8,uVar9);
    in_stack_00000088 = unaff_x25 + uVar9;
    if (lVar2 == in_stack_00000088) {
      func_0x007a5594(&uStack0000000000000078,lVar2,1,1,1);
      *(undefined1 *)(in_stack_00000080 + in_stack_00000088) = unaff_w19;
    }
    else {
      *(undefined1 *)(lVar5 + in_stack_00000088) = unaff_w19;
    }
    unaff_x25 = in_stack_00000088 + 1;
    in_stack_00000088 = unaff_x25;
    if (unaff_x24 != 0) {
      if (unaff_x24 < unaff_x21) {
        if (*(char *)(unaff_x23 + unaff_x24) < -0x40) {
code_r0x00511e5c:
          func_0x007a297c();
                    /* WARNING: Does not return */
          pcVar6 = (code *)SoftwareBreakpoint(1,0x511e94);
          (*pcVar6)();
        }
      }
      else if (unaff_x24 != unaff_x21) goto code_r0x00511e5c;
    }
    if (unaff_x24 == unaff_x21) {
      uVar8 = in_stack_00000028 - unaff_x21;
      if ((ulong)(uStack0000000000000078 - unaff_x25) < uVar8) {
        func_0x007a5594(&uStack0000000000000078,unaff_x25,uVar8,1,1);
      }
      lVar2 = in_stack_00000088;
      _memcpy(in_stack_00000080 + in_stack_00000088,unaff_x20 + unaff_x21,uVar8);
      in_stack_000000a0 = lVar2 + uVar8;
      in_stack_00000098 = in_stack_00000080;
      in_stack_00000090 = uStack0000000000000078;
      if (*in_stack_00000008 != 0) {
        func_0x00187bd4();
      }
      in_stack_00000008[1] = in_stack_00000098;
      *in_stack_00000008 = in_stack_00000090;
      in_stack_00000008[2] = in_stack_000000a0;
      return;
    }
    pbVar1 = (byte *)(unaff_x23 + unaff_x24);
    bVar3 = *pbVar1;
    if ((char)bVar3 < '\0') {
      if (bVar3 < 0xe0) {
        in_w8 = pbVar1[1] & 0x3f | (bVar3 & 0x1f) << 6;
      }
      else {
        uVar7 = (uint)bVar3;
        uVar4 = pbVar1[2] & 0x3f | (pbVar1[1] & 0x3f) << 6;
        if (uVar7 < 0xf0) {
          in_w8 = uVar4 | (uVar7 & 0x1f) << 0xc;
          in_CY = 0x7f < in_w8;
          goto code_r0x00511cbc;
        }
        in_w8 = pbVar1[3] & 0x3f | uVar4 << 6 | (uVar7 & 7) << 0x12;
      }
      if (0x7f < in_w8) goto code_r0x00511cc0;
    }
LAB_00511bd4:
    uVar9 = unaff_x24 + 1;
    uVar8 = unaff_x24;
  } while( true );
}

