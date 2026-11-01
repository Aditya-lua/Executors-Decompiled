
void FUN_005e1908(byte *param_1,long param_2,long param_3)

{
  uint uVar1;
  bool bVar2;
  byte *in_x9;
  byte *extraout_x9;
  byte bVar3;
  uint uVar4;
  ulong uVar5;
  undefined *in_x15;
  uint in_w16;
  byte in_w17;
  ulong unaff_x19;
  byte *unaff_x20;
  byte *pbVar6;
  byte *unaff_x21;
  ulong uVar7;
  byte *unaff_x22;
  byte unaff_w23;
  byte *unaff_x24;
  byte *unaff_x25;
  ulong unaff_x26;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  undefined8 *in_stack_00000008;
  ulong in_stack_00000010;
  byte *in_stack_00000018;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  ulong in_stack_00000038;
  ulong uStack0000000000000040;
  byte *pbStack00000000000000a0;
  byte *pbStack00000000000000a8;
  undefined1 uStack00000000000000b0;
  byte *in_stack_000000b8;
  long in_stack_000000c0;
  byte *pbStack00000000000000d0;
  byte *in_stack_000000d8;
  byte *pbStack00000000000000e0;
  byte in_stack_000000e8;
  byte bStack00000000000000e9;
  
code_r0x005e1908:
  pbStack00000000000000d0 = unaff_x20;
  _uStack00000000000000b0 = unaff_x21;
  if (unaff_x22 == param_1) goto LAB_005e1938;
code_r0x005e1910:
  in_x9 = unaff_x22 + -(long)param_1;
  pbVar6 = param_1;
  unaff_x20 = pbStack00000000000000d0;
  unaff_x21 = _uStack00000000000000b0;
  pbStack00000000000000e0 = unaff_x24;
  bVar3 = 1;
  if (in_x9 == (byte *)0x0) goto LAB_005e17fc;
code_r0x005e1920:
  param_1 = param_1 + in_stack_00000028;
  bStack00000000000000e9 = unaff_w23;
  do {
    uStack0000000000000040 = 1;
    unaff_x20 = pbStack00000000000000d0;
    pbVar6 = _uStack00000000000000b0;
    unaff_x24 = pbStack00000000000000e0;
    uVar5 = unaff_x26;
    pbStack00000000000000a0 = param_1;
    pbStack00000000000000a8 = in_x9;
    unaff_w23 = bStack00000000000000e9;
    do {
      if (param_1 != (byte *)0x0) {
        if (*(long *)(unaff_x29 + -0x70) == param_3) {
          func_0x007afcf8(unaff_x29 + -0x70,param_3,1,1,1);
          param_2 = *(long *)(unaff_x29 + -0x68);
          param_3 = *(long *)(unaff_x29 + -0x60);
          in_x9 = extraout_x9;
        }
        *(undefined1 *)(param_2 + param_3) = 0x20;
        param_3 = param_3 + 1;
        *(long *)(unaff_x29 + -0x60) = param_3;
      }
      if (unaff_x19 < in_stack_00000038) {
        unaff_x19 = unaff_x19 + 1;
      }
      else {
        in_x9 = in_stack_00000018;
        uStack0000000000000040 = uVar5;
        do {
          auVar9._8_8_ = pbStack00000000000000a8;
          auVar9._0_8_ = pbStack00000000000000a0;
          uVar5 = 0;
          if ((uStack0000000000000040 & 1) == 0) {
            auVar9 = func_0x005e0d84(&uStack00000000000000b0);
          }
          uVar7 = auVar9._8_8_;
          if (auVar9._0_8_ == 0) {
            uVar8 = *(undefined8 *)(unaff_x29 + -0x70);
            in_stack_00000008[1] = *(undefined8 *)(unaff_x29 + -0x68);
            *in_stack_00000008 = uVar8;
            in_stack_00000008[2] = *(undefined8 *)(unaff_x29 + -0x60);
            return;
          }
          if ((ulong)(*(long *)(unaff_x29 + -0x70) - param_3) < uVar7) {
            func_0x007afcf8(unaff_x29 + -0x70,param_3,uVar7,1,1);
            param_2 = *(long *)(unaff_x29 + -0x68);
            param_3 = *(long *)(unaff_x29 + -0x60);
          }
          _memcpy(param_2 + param_3,auVar9._0_8_,uVar7);
          param_3 = param_3 + uVar7;
          *(long *)(unaff_x29 + -0x60) = param_3;
          bVar2 = in_x9 != (byte *)0x0;
          pbVar6 = in_x9 + -1;
          in_stack_00000038 = in_stack_00000010;
          in_x9 = (byte *)0x0;
          if (bVar2) {
            in_stack_00000038 = in_stack_00000010 + 1;
            in_x9 = pbVar6;
          }
          uStack0000000000000040 = uVar5;
        } while (in_stack_00000038 == 0);
        unaff_x19 = 1;
        in_stack_00000028 = in_stack_000000c0;
        unaff_x20 = pbStack00000000000000d0;
        pbVar6 = _uStack00000000000000b0;
        unaff_x22 = in_stack_000000b8;
        unaff_x24 = pbStack00000000000000e0;
        unaff_x25 = in_stack_000000d8;
        param_1 = pbStack00000000000000a0;
        in_stack_00000018 = in_x9;
        unaff_w23 = bStack00000000000000e9;
        in_stack_00000030._4_1_ = in_stack_000000e8;
      }
    } while ((uStack0000000000000040 & 1) != 0);
    in_x15 = &__ZN4core7unicode12unicode_data11white_space14WHITESPACE_MAP17h271c64803ec2808fE;
    in_w16 = 0x1680;
    unaff_x21 = pbVar6;
    bVar3 = unaff_w23;
    in_w17 = in_stack_00000030._4_1_;
LAB_005e17fc:
    while( true ) {
      param_1 = pbVar6;
      _uStack00000000000000b0 = unaff_x24;
      if ((bVar3 & 1) != 0) break;
      do {
        while( true ) {
          while( true ) {
            do {
              unaff_x24 = _uStack00000000000000b0;
              if (unaff_x20 == unaff_x25) {
                unaff_w23 = 1;
                pbStack00000000000000d0 = unaff_x20;
                _uStack00000000000000b0 = unaff_x21;
                if ((in_w17 & 1) != 0) goto code_r0x005e1910;
                goto code_r0x005e1908;
              }
              pbStack00000000000000d0 = unaff_x20 + 1;
              uVar4 = (uint)*unaff_x20;
              uVar5 = (ulong)uVar4;
              if ((char)*unaff_x20 < '\0') {
                if (uVar4 < 0xe0) {
                  pbStack00000000000000d0 = unaff_x20 + 2;
                  uVar5 = (ulong)(unaff_x20[1] & 0x3f | (uVar4 & 0x1f) << 6);
                }
                else {
                  uVar1 = unaff_x20[2] & 0x3f | (unaff_x20[1] & 0x3f) << 6;
                  if (uVar4 < 0xf0) {
                    pbStack00000000000000d0 = unaff_x20 + 3;
                    uVar5 = (ulong)(uVar1 | (uVar4 & 0x1f) << 0xc);
                  }
                  else {
                    pbStack00000000000000d0 = unaff_x20 + 4;
                    uVar5 = (ulong)(unaff_x20[3] & 0x3f | uVar1 << 6 | (uVar4 & 7) << 0x12);
                  }
                }
              }
              _uStack00000000000000b0 =
                   pbStack00000000000000d0 + ((long)unaff_x24 - (long)unaff_x20);
              uVar4 = (uint)uVar5;
              unaff_x20 = pbStack00000000000000d0;
              if (uVar4 < 0x21 && (unaff_x26 << (uVar5 & 0x3f) & unaff_x28) != 0)
              goto code_r0x005e17e8;
              in_x9 = unaff_x24;
            } while (uVar4 < 0x80);
            uVar1 = uVar4 >> 8;
            if (0x1f < uVar1) break;
            if (uVar1 == 0) {
              if ((in_x15[uVar5 & 0xff] & 1) != 0) goto code_r0x005e17e8;
            }
            else if ((uVar1 == 0x16) && (uVar4 == in_w16)) goto code_r0x005e17e8;
          }
          if (uVar1 == 0x20) break;
          if ((uVar1 == 0x30) && (uVar4 == 0x3000)) goto code_r0x005e17e8;
        }
      } while (((byte)in_x15[uVar5 & 0xff] >> 1 & 1) == 0);
code_r0x005e17e8:
      bVar3 = 0;
      in_x9 = unaff_x24 + -(long)param_1;
      pbVar6 = _uStack00000000000000b0;
      unaff_x21 = _uStack00000000000000b0;
      unaff_x24 = _uStack00000000000000b0;
      pbStack00000000000000e0 = _uStack00000000000000b0;
      if (in_x9 != (byte *)0x0) goto code_r0x005e1920;
    }
LAB_005e1938:
    param_1 = (byte *)0x0;
    _uStack00000000000000b0 = unaff_x21;
    pbStack00000000000000d0 = unaff_x20;
    pbStack00000000000000e0 = unaff_x24;
    bStack00000000000000e9 = unaff_w23;
  } while( true );
}

