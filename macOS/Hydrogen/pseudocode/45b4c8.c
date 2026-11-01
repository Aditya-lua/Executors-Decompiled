
void FUN_0045b4c8(byte *param_1)

{
  uint uVar1;
  byte bVar2;
  byte bVar3;
  byte *pbVar4;
  uint in_w9;
  long *unaff_x19;
  byte *pbVar5;
  byte *unaff_x20;
  long unaff_x21;
  long lVar6;
  long unaff_x22;
  ulong uVar7;
  ulong uVar8;
  ulong unaff_x23;
  byte *unaff_x24;
  uint uVar9;
  ulong unaff_x27;
  uint unaff_w28;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long lStack0000000000000018;
  undefined8 uStack0000000000000020;
  uint uStack0000000000000028;
  uint uStack000000000000002c;
  
code_r0x0045b4c8:
  *param_1 = (byte)in_w9 | 0xe0;
  param_1[1] = (byte)(unaff_w28 >> 6) & 0x3f | 0x80;
  uVar9 = unaff_w28 & 0x3f | 0x80;
code_r0x0045b4e4:
  do {
    param_1[2] = (byte)uVar9;
    pbVar5 = unaff_x20;
LAB_0045ae70:
    while( true ) {
      while( true ) {
        unaff_x22 = unaff_x23 + unaff_x22;
        if (pbVar5 == unaff_x24) {
          unaff_x19[1] = in_stack_00000010;
          *unaff_x19 = uStack0000000000000008;
          unaff_x19[2] = unaff_x22;
          return;
        }
        unaff_x20 = pbVar5 + 1;
        uVar9 = (uint)*pbVar5;
        if ((char)*pbVar5 < '\0') {
          if (uVar9 < 0xe0) {
            unaff_x20 = pbVar5 + 2;
            uVar9 = pbVar5[1] & 0x3f | (uVar9 & 0x1f) << 6;
          }
          else {
            uVar1 = pbVar5[2] & 0x3f | (pbVar5[1] & 0x3f) << 6;
            if (uVar9 < 0xf0) {
              unaff_x20 = pbVar5 + 3;
              uVar9 = uVar1 | (uVar9 & 0x1f) << 0xc;
            }
            else {
              unaff_x20 = pbVar5 + 4;
              uVar9 = pbVar5[3] & 0x3f | uVar1 << 6 | (uVar9 & 7) << 0x12;
            }
          }
        }
        lStack0000000000000018 = unaff_x22;
        func_0x00479468((long)&uStack0000000000000020 + 4,uVar9);
        uVar1 = uStack000000000000002c;
        unaff_w28 = uStack0000000000000028;
        uVar9 = uStack0000000000000020._4_4_;
        bVar3 = (byte)uStack0000000000000020._4_4_;
        pbVar5 = unaff_x20;
        if (uStack0000000000000028 != 0) break;
        uVar7 = unaff_x27;
        if (0xffff < uStack0000000000000020._4_4_) {
          uVar7 = unaff_x27 + 1;
        }
        uVar8 = 2;
        if (0x7ff < uStack0000000000000020._4_4_) {
          uVar8 = uVar7;
        }
        unaff_x23 = 1;
        if (0x7f < uStack0000000000000020._4_4_) {
          unaff_x23 = uVar8;
        }
        if ((ulong)(uStack0000000000000008 - unaff_x22) < unaff_x23) {
          func_0x007a1e50(&uStack0000000000000008,unaff_x22,unaff_x23);
          param_1 = (byte *)(in_stack_00000010 + lStack0000000000000018);
          unaff_x21 = in_stack_00000010;
        }
        else {
          param_1 = (byte *)(unaff_x21 + unaff_x22);
        }
        if (uVar9 < 0x80) goto code_r0x0045ae6c;
        if (uVar9 < 0x800) {
          *param_1 = (byte)(uVar9 >> 6) | 0xc0;
          param_1[1] = bVar3 & 0x3f | 0x80;
        }
        else {
          if (uVar9 < 0x10000) {
            *param_1 = (byte)(uVar9 >> 0xc) | 0xe0;
            param_1[1] = (byte)(uVar9 >> 6) & 0x3f | 0x80;
            uVar9 = uVar9 & 0x3f | 0x80;
            goto code_r0x0045b4e4;
          }
          *param_1 = (byte)(uVar9 >> 0x12) | 0xf0;
          param_1[1] = (byte)(uVar9 >> 0xc) & 0x3f | 0x80;
          param_1[2] = (byte)(uVar9 >> 6) & 0x3f | 0x80;
          param_1[3] = bVar3 & 0x3f | 0x80;
        }
      }
      bVar2 = (byte)uStack0000000000000028;
      unaff_x23 = unaff_x27;
      if (uStack000000000000002c != 0) break;
      if (0x7f < uStack0000000000000020._4_4_) {
        if (uStack0000000000000020._4_4_ < 0x800) {
          uVar7 = 2;
        }
        else {
          uVar7 = unaff_x27;
          if (0xffff < uStack0000000000000020._4_4_) {
            uVar7 = unaff_x27 + 1;
          }
        }
      }
      else {
        uVar7 = 1;
      }
      if ((ulong)(uStack0000000000000008 - unaff_x22) < uVar7) {
        func_0x007a1e50(&uStack0000000000000008,unaff_x22,uVar7);
        pbVar4 = (byte *)(in_stack_00000010 + lStack0000000000000018);
        if (uVar9 < 0x80) goto code_r0x0045b048;
code_r0x0045b384:
        if (uVar9 < 0x800) {
          *pbVar4 = (byte)(uVar9 >> 6) | 0xc0;
          pbVar4[1] = bVar3 & 0x3f | 0x80;
          goto joined_r0x0045b3b0;
        }
        if (uVar9 < 0x10000) {
          *pbVar4 = (byte)(uVar9 >> 0xc) | 0xe0;
          pbVar4[1] = (byte)(uVar9 >> 6) & 0x3f | 0x80;
          pbVar4[2] = bVar3 & 0x3f | 0x80;
          goto joined_r0x0045b3b0;
        }
        *pbVar4 = (byte)(uVar9 >> 0x12) | 0xf0;
        pbVar4[1] = (byte)(uVar9 >> 0xc) & 0x3f | 0x80;
        pbVar4[2] = (byte)(uVar9 >> 6) & 0x3f | 0x80;
        pbVar4[3] = bVar3 & 0x3f | 0x80;
        if (0x7f < unaff_w28) goto code_r0x0045b3b4;
code_r0x0045b05c:
        unaff_x23 = 1;
      }
      else {
        pbVar4 = (byte *)(unaff_x21 + unaff_x22);
        if (0x7f < uStack0000000000000020._4_4_) goto code_r0x0045b384;
code_r0x0045b048:
        *pbVar4 = bVar3;
joined_r0x0045b3b0:
        if (unaff_w28 < 0x80) goto code_r0x0045b05c;
code_r0x0045b3b4:
        if (unaff_w28 < 0x800) {
          unaff_x23 = 2;
        }
        else if (0xffff < unaff_w28) {
          unaff_x23 = unaff_x27 + 1;
        }
      }
      unaff_x22 = uVar7 + unaff_x22;
      if ((ulong)(uStack0000000000000008 - unaff_x22) < unaff_x23) {
        lStack0000000000000018 = unaff_x22;
        func_0x007a1e50(&uStack0000000000000008,unaff_x22,unaff_x23);
        param_1 = (byte *)(in_stack_00000010 + lStack0000000000000018);
        unaff_x21 = in_stack_00000010;
      }
      else {
        param_1 = (byte *)(in_stack_00000010 + unaff_x22);
        unaff_x21 = in_stack_00000010;
      }
      in_stack_00000010 = unaff_x21;
      if (unaff_w28 < 0x80) {
        *param_1 = bVar2;
      }
      else if (unaff_w28 < 0x800) {
        *param_1 = (byte)(unaff_w28 >> 6) | 0xc0;
        param_1[1] = bVar2 & 0x3f | 0x80;
      }
      else {
        if (unaff_w28 < 0x10000) {
          in_w9 = unaff_w28 >> 0xc;
          goto code_r0x0045b4c8;
        }
        *param_1 = (byte)(unaff_w28 >> 0x12) | 0xf0;
        param_1[1] = (byte)(unaff_w28 >> 0xc) & 0x3f | 0x80;
        param_1[2] = (byte)(unaff_w28 >> 6) & 0x3f | 0x80;
        param_1[3] = bVar2 & 0x3f | 0x80;
      }
    }
    if (0x7f < uStack0000000000000020._4_4_) {
      if (uStack0000000000000020._4_4_ < 0x800) {
        uVar7 = 2;
      }
      else {
        uVar7 = unaff_x27;
        if (0xffff < uStack0000000000000020._4_4_) {
          uVar7 = unaff_x27 + 1;
        }
      }
    }
    else {
      uVar7 = 1;
    }
    if ((ulong)(uStack0000000000000008 - unaff_x22) < uVar7) {
      func_0x007a1e50(&uStack0000000000000008,unaff_x22,uVar7);
      pbVar4 = (byte *)(in_stack_00000010 + lStack0000000000000018);
      if (uVar9 < 0x80) goto code_r0x0045afd8;
code_r0x0045b0b8:
      if (uVar9 < 0x800) {
        *pbVar4 = (byte)(uVar9 >> 6) | 0xc0;
        pbVar4[1] = bVar3 & 0x3f | 0x80;
        goto joined_r0x0045b130;
      }
      if (uVar9 < 0x10000) {
        *pbVar4 = (byte)(uVar9 >> 0xc) | 0xe0;
        pbVar4[1] = (byte)(uVar9 >> 6) & 0x3f | 0x80;
        pbVar4[2] = bVar3 & 0x3f | 0x80;
        goto joined_r0x0045b130;
      }
      *pbVar4 = (byte)(uVar9 >> 0x12) | 0xf0;
      pbVar4[1] = (byte)(uVar9 >> 0xc) & 0x3f | 0x80;
      pbVar4[2] = (byte)(uVar9 >> 6) & 0x3f | 0x80;
      pbVar4[3] = bVar3 & 0x3f | 0x80;
      if (0x7f < unaff_w28) goto code_r0x0045b0e8;
code_r0x0045afec:
      uVar8 = 1;
    }
    else {
      pbVar4 = (byte *)(unaff_x21 + unaff_x22);
      if (0x7f < uStack0000000000000020._4_4_) goto code_r0x0045b0b8;
code_r0x0045afd8:
      *pbVar4 = bVar3;
joined_r0x0045b130:
      if (unaff_w28 < 0x80) goto code_r0x0045afec;
code_r0x0045b0e8:
      if (unaff_w28 < 0x800) {
        uVar8 = 2;
      }
      else {
        uVar8 = unaff_x27;
        if (0xffff < unaff_w28) {
          uVar8 = unaff_x27 + 1;
        }
      }
    }
    lVar6 = uVar7 + unaff_x22;
    if ((ulong)(uStack0000000000000008 - lVar6) < uVar8) {
      lStack0000000000000018 = lVar6;
      func_0x007a1e50(&uStack0000000000000008,lVar6,uVar8);
      pbVar4 = (byte *)(in_stack_00000010 + lStack0000000000000018);
      if (unaff_w28 < 0x80) goto code_r0x0045b160;
code_r0x0045b1e0:
      bVar3 = bVar2 & 0x3f | 0x80;
      if (unaff_w28 < 0x800) {
        *pbVar4 = (byte)(unaff_w28 >> 6) | 0xc0;
        pbVar4[1] = bVar3;
        goto joined_r0x0045b20c;
      }
      bVar2 = (byte)(unaff_w28 >> 6) & 0x3f | 0x80;
      if (unaff_w28 < 0x10000) {
        *pbVar4 = (byte)(unaff_w28 >> 0xc) | 0xe0;
        pbVar4[1] = bVar2;
        pbVar4[2] = bVar3;
        goto joined_r0x0045b20c;
      }
      *pbVar4 = (byte)(unaff_w28 >> 0x12) | 0xf0;
      pbVar4[1] = (byte)(unaff_w28 >> 0xc) & 0x3f | 0x80;
      pbVar4[2] = bVar2;
      pbVar4[3] = bVar3;
      if (0x7f < uVar1) goto code_r0x0045b210;
code_r0x0045b174:
      unaff_x23 = 1;
    }
    else {
      pbVar4 = (byte *)(in_stack_00000010 + lVar6);
      if (0x7f < unaff_w28) goto code_r0x0045b1e0;
code_r0x0045b160:
      *pbVar4 = bVar2;
joined_r0x0045b20c:
      if (uVar1 < 0x80) goto code_r0x0045b174;
code_r0x0045b210:
      if (uVar1 < 0x800) {
        unaff_x23 = 2;
      }
      else if (0xffff < uVar1) {
        unaff_x23 = unaff_x27 + 1;
      }
    }
    unaff_x22 = uVar8 + lVar6;
    uVar9 = uVar1;
    if ((ulong)(uStack0000000000000008 - unaff_x22) < unaff_x23) {
      lStack0000000000000018 = unaff_x22;
      func_0x007a1e50(&uStack0000000000000008,unaff_x22,unaff_x23);
      param_1 = (byte *)(in_stack_00000010 + lStack0000000000000018);
      unaff_x21 = in_stack_00000010;
      if (0x7f < uVar1) goto code_r0x0045b27c;
code_r0x0045ae6c:
      *param_1 = (byte)uVar9;
      goto LAB_0045ae70;
    }
    param_1 = (byte *)(in_stack_00000010 + unaff_x22);
    unaff_x21 = in_stack_00000010;
    if (uVar1 < 0x80) goto code_r0x0045ae6c;
code_r0x0045b27c:
    uVar9 = uVar1 & 0x3f | 0x80;
    unaff_x21 = in_stack_00000010;
    if (uVar1 < 0x800) {
      *param_1 = (byte)(uVar1 >> 6) | 0xc0;
      param_1[1] = (byte)uVar9;
      goto LAB_0045ae70;
    }
    bVar3 = (byte)(uVar1 >> 6) & 0x3f | 0x80;
    if (0xffff < uVar1) {
      *param_1 = (byte)(uVar1 >> 0x12) | 0xf0;
      param_1[1] = (byte)(uVar1 >> 0xc) & 0x3f | 0x80;
      param_1[2] = bVar3;
      param_1[3] = (byte)uVar9;
      goto LAB_0045ae70;
    }
    *param_1 = (byte)(uVar1 >> 0xc) | 0xe0;
    param_1[1] = bVar3;
  } while( true );
}

