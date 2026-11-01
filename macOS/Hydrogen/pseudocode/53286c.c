
ulong FUN_0053286c(byte *param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  code *pcVar3;
  undefined1 in_ZR;
  byte *in_x9;
  ulong uVar4;
  ulong in_x10;
  uint in_w11;
  ulong in_x12;
  long in_x13;
  byte *pbVar5;
  byte *in_x14;
  long unaff_x19;
  byte *unaff_x20;
  byte *pbVar6;
  ulong unaff_x21;
  byte *unaff_x22;
  long unaff_x27;
  
  do {
    uVar4 = in_x10;
    pbVar5 = in_x14;
    pbVar6 = unaff_x20;
    if (!(bool)in_ZR) goto LAB_005327a0;
    do {
      uVar4 = in_x12;
      if (pbVar6 == param_1) {
code_r0x0053287c:
        if (unaff_x27 != 0) {
          func_0x00187bd4();
        }
        return unaff_x21;
      }
      unaff_x20 = pbVar6 + 1;
      in_w11 = (uint)*pbVar6;
      if ((char)*pbVar6 < '\0') {
        if (in_w11 < 0xe0) {
          unaff_x20 = pbVar6 + 2;
          in_w11 = pbVar6[1] & 0x3f | (in_w11 & 0x1f) << 6;
        }
        else {
          unaff_x20 = pbVar6 + 3;
          uVar1 = pbVar6[2] & 0x3f | (pbVar6[1] & 0x3f) << 6;
          if (in_w11 < 0xf0) {
            in_w11 = uVar1 | (in_w11 & 0x1f) << 0xc;
          }
          else {
            in_w11 = *unaff_x20 & 0x3f | uVar1 << 6 | (in_w11 & 7) << 0x12;
            if (in_w11 == 0x110000) goto code_r0x0053287c;
            unaff_x20 = pbVar6 + 4;
          }
        }
      }
      in_x13 = 0;
      in_x12 = uVar4 + 1;
      pbVar5 = unaff_x22;
      unaff_x21 = in_x12;
LAB_005327a0:
      in_x14 = pbVar5 + 1;
      uVar1 = (uint)*pbVar5;
      if (-1 < (char)*pbVar5) goto joined_r0x005327b8;
      if (uVar1 < 0xe0) {
        in_x14 = pbVar5 + 2;
        uVar1 = pbVar5[1] & 0x3f | (uVar1 & 0x1f) << 6;
        goto joined_r0x005327b8;
      }
      in_x14 = pbVar5 + 3;
      uVar2 = pbVar5[2] & 0x3f | (pbVar5[1] & 0x3f) << 6;
      if (uVar1 < 0xf0) {
        uVar1 = uVar2 | (uVar1 & 0x1f) << 0xc;
        goto joined_r0x005327b8;
      }
      uVar1 = *in_x14 & 0x3f | uVar2 << 6 | (uVar1 & 7) << 0x12;
      pbVar6 = unaff_x20;
    } while (uVar1 == 0x110000);
    in_x14 = pbVar5 + 4;
joined_r0x005327b8:
    if (param_2 == in_x13) {
      func_0x007a2570(param_2,param_2,&UNK_009eb828);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x532938);
      (*pcVar3)();
    }
    if (in_w11 != uVar1) {
      uVar4 = uVar4 + 1;
    }
    in_x10 = *(ulong *)(unaff_x19 + in_x13 * 8);
    if (in_x10 + 1 < uVar4) {
      uVar4 = in_x10 + 1;
    }
    if (unaff_x21 + 1 <= uVar4) {
      uVar4 = unaff_x21 + 1;
    }
    *(ulong *)(unaff_x19 + in_x13 * 8) = uVar4;
    in_x13 = in_x13 + 1;
    in_ZR = in_x14 == in_x9;
    unaff_x21 = uVar4;
  } while( true );
}

