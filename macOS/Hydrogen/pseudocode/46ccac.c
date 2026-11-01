
undefined8 FUN_0046ccac(void)

{
  byte *pbVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 unaff_x19;
  undefined8 uVar6;
  long unaff_x20;
  uint uVar7;
  code *pcVar8;
  code *unaff_x25;
  long unaff_x26;
  byte *unaff_x27;
  byte *unaff_x28;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long lStack0000000000000018;
  undefined8 uStack0000000000000020;
  int iStack0000000000000028;
  byte bStack000000000000002e;
  byte bStack000000000000002f;
  
  lStack0000000000000018 = (long)&uStack0000000000000020 + 3;
  uVar5 = (*unaff_x25)();
  if ((uVar5 & 1) == 0) {
    uStack0000000000000020._3_1_ = '\0';
    pcVar8 = *(code **)(unaff_x26 + 0x20);
    uVar5 = (*pcVar8)();
    if ((uVar5 & 1) == 0) {
      func_0x004623d8((long)&uStack0000000000000020 + 4);
      iVar3 = iStack0000000000000028;
      if (uStack0000000000000020._4_1_ == -0x80) {
        if ((uStack0000000000000020._3_1_ == '\x01') && (uVar5 = (*unaff_x25)(), (uVar5 & 1) != 0))
        goto code_r0x0046c858;
        uStack0000000000000020._3_1_ = iVar3 == 10;
        uVar5 = (*pcVar8)();
      }
      else {
        uVar5 = func_0x004650d8(&uStack0000000000000008,
                                (long)&uStack0000000000000020 + (ulong)bStack000000000000002e + 4,
                                (ulong)bStack000000000000002f - (ulong)bStack000000000000002e);
      }
      if (((uVar5 & 1) == 0) &&
         ((uStack0000000000000020._3_1_ != '\x01' || (uVar5 = (*unaff_x25)(), (uVar5 & 1) == 0)))) {
        uStack0000000000000020._3_1_ = '\0';
        uVar5 = (*pcVar8)();
        if ((uVar5 & 1) == 0) {
          uVar5 = func_0x004650d8(&uStack0000000000000008,&UNK_00893e13,2);
          goto code_r0x0046c85c;
        }
      }
    }
  }
code_r0x0046c858:
  uVar5 = 1;
code_r0x0046c85c:
  if (unaff_x28 != unaff_x27) {
    if ((*(uint *)(unaff_x20 + 0x10) >> 0x17 & 1) == 0) {
      do {
        while( true ) {
          uVar7 = (uint)*unaff_x28;
          pbVar1 = unaff_x28 + 1;
          if (-1 < (char)*unaff_x28) break;
          pbVar1 = unaff_x28 + 1;
          if (uVar7 < 0xe0) {
            unaff_x28 = unaff_x28 + 2;
            uVar7 = *pbVar1 & 0x3f | (uVar7 & 0x1f) << 6;
          }
          else {
            uVar2 = unaff_x28[2] & 0x3f | (*pbVar1 & 0x3f) << 6;
            if (0xef < uVar7) {
              uVar7 = unaff_x28[3] & 0x3f | uVar2 << 6 | (uVar7 & 7) << 0x12;
              if (uVar7 != 0x110000) {
                pbVar1 = unaff_x28 + 4;
                break;
              }
              goto code_r0x0046cbb4;
            }
            unaff_x28 = unaff_x28 + 3;
            uVar7 = uVar2 | (uVar7 & 0x1f) << 0xc;
          }
          if ((uVar5 & 1) == 0) goto code_r0x0046c904;
code_r0x0046c92c:
          uVar5 = 1;
          if (unaff_x28 == unaff_x27) goto code_r0x0046cbb4;
        }
        unaff_x28 = pbVar1;
        if ((uVar5 & 1) != 0) goto code_r0x0046c92c;
code_r0x0046c904:
        uVar5 = (*unaff_x25)();
        if ((uVar5 & 1) != 0) goto code_r0x0046c92c;
        pcVar8 = *(code **)(unaff_x26 + 0x20);
        uVar5 = (*pcVar8)();
        if ((uVar5 & 1) != 0) goto code_r0x0046c92c;
        func_0x004623d8(&uStack0000000000000008,uVar7,0x101);
        if ((char)uStack0000000000000008 != -0x80) {
          uVar5 = (*unaff_x25)();
          if ((uVar5 & 1) == 0) goto code_r0x0046c988;
          goto code_r0x0046c92c;
        }
        uVar5 = (*pcVar8)();
        if ((uVar5 & 1) != 0) goto code_r0x0046c92c;
code_r0x0046c988:
        uVar5 = (*pcVar8)();
      } while (unaff_x28 != unaff_x27);
    }
    else {
      do {
        uVar7 = (uint)*unaff_x28;
        pbVar1 = unaff_x28 + 1;
        if ((char)*unaff_x28 < '\0') {
          if (uVar7 < 0xe0) {
            uVar7 = unaff_x28[1] & 0x3f | (uVar7 & 0x1f) << 6;
            pbVar1 = unaff_x28 + 2;
          }
          else {
            uVar2 = unaff_x28[2] & 0x3f | (unaff_x28[1] & 0x3f) << 6;
            if (uVar7 < 0xf0) {
              uVar7 = uVar2 | (uVar7 & 0x1f) << 0xc;
              pbVar1 = unaff_x28 + 3;
            }
            else {
              uVar7 = unaff_x28[3] & 0x3f | uVar2 << 6 | (uVar7 & 7) << 0x12;
              if (uVar7 == 0x110000) break;
              pbVar1 = unaff_x28 + 4;
            }
          }
        }
        unaff_x28 = pbVar1;
        uVar4 = uVar5 & 1;
        uVar5 = 1;
        if (uVar4 == 0) {
          uVar5 = 1;
          uStack0000000000000020._3_1_ = '\x01';
          uStack0000000000000008 = unaff_x19;
          in_stack_00000010 = unaff_x26;
          lStack0000000000000018 = (long)&uStack0000000000000020 + 3;
          uVar4 = (*unaff_x25)();
          if ((uVar4 & 1) == 0) {
            uStack0000000000000020._3_1_ = '\0';
            pcVar8 = *(code **)(unaff_x26 + 0x20);
            uVar4 = (*pcVar8)();
            if ((uVar4 & 1) == 0) {
              func_0x004623d8((long)&uStack0000000000000020 + 4,uVar7,0x101);
              iVar3 = iStack0000000000000028;
              if (uStack0000000000000020._4_1_ == -0x80) {
                if ((uStack0000000000000020._3_1_ != '\x01') ||
                   (uVar5 = (*unaff_x25)(), (uVar5 & 1) == 0)) {
                  uStack0000000000000020._3_1_ = iVar3 == 10;
                  uVar5 = (*pcVar8)();
                  goto joined_r0x0046cb5c;
                }
              }
              else {
                uVar5 = func_0x004650d8(&uStack0000000000000008,
                                        (long)&uStack0000000000000020 +
                                        (ulong)bStack000000000000002e + 4,
                                        (ulong)bStack000000000000002f -
                                        (ulong)bStack000000000000002e);
joined_r0x0046cb5c:
                if (((uVar5 & 1) == 0) &&
                   ((uStack0000000000000020._3_1_ != '\x01' ||
                    (uVar5 = (*unaff_x25)(), (uVar5 & 1) == 0)))) {
                  uStack0000000000000020._3_1_ = '\0';
                  uVar5 = (*pcVar8)();
                  if ((uVar5 & 1) == 0) {
                    uVar5 = func_0x004650d8(&uStack0000000000000008,&UNK_00893e13,2);
                    goto code_r0x0046ca04;
                  }
                }
              }
              uVar5 = 1;
            }
          }
        }
code_r0x0046ca04:
      } while (unaff_x28 != unaff_x27);
    }
  }
code_r0x0046cbb4:
  if ((uVar5 & 1) == 0) {
    uVar6 = 1;
    uVar5 = (*unaff_x25)();
    if ((uVar5 & 1) == 0) {
      uVar6 = (*unaff_x25)();
    }
  }
  else {
    uVar6 = 1;
  }
  return uVar6;
}

