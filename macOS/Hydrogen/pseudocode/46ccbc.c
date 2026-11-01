
/* WARNING: Removing unreachable block (ram,0x0046cd14) */
/* WARNING: Removing unreachable block (ram,0x0046cb0c) */

undefined8 FUN_0046ccbc(void)

{
  byte *pbVar1;
  uint uVar2;
  int iVar3;
  bool bVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 unaff_x19;
  undefined8 uVar7;
  long unaff_x20;
  uint uVar8;
  code *pcVar9;
  code *unaff_x25;
  long unaff_x26;
  byte *unaff_x27;
  byte *unaff_x28;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000020;
  int iStack0000000000000028;
  byte bStack000000000000002e;
  byte bStack000000000000002f;
  
  uVar6 = (*unaff_x25)();
  if ((uVar6 & 1) == 0) {
    pcVar9 = *(code **)(unaff_x26 + 0x20);
    uVar6 = (*pcVar9)();
    if ((uVar6 & 1) == 0) {
      func_0x004623d8((long)&uStack0000000000000020 + 4);
      iVar3 = iStack0000000000000028;
      bVar4 = uStack0000000000000020._4_1_ != -0x80;
      if (bVar4) {
        uVar6 = func_0x004650d8(&uStack0000000000000008,
                                (long)&uStack0000000000000020 + (ulong)bStack000000000000002e + 4,
                                (ulong)bStack000000000000002f - (ulong)bStack000000000000002e);
      }
      else {
        uVar6 = (*pcVar9)();
      }
      if (((uVar6 & 1) == 0) &&
         (((bVar4 || iVar3 != 10 || (uVar6 = (*unaff_x25)(), (uVar6 & 1) == 0)) &&
          (uVar6 = (*pcVar9)(), (uVar6 & 1) == 0)))) {
        uVar6 = func_0x004650d8(&uStack0000000000000008,&UNK_00893e13,2);
        goto LAB_0046c85c;
      }
    }
  }
  uVar6 = 1;
LAB_0046c85c:
  if (unaff_x28 != unaff_x27) {
    if ((*(uint *)(unaff_x20 + 0x10) >> 0x17 & 1) == 0) {
      do {
        while( true ) {
          uVar8 = (uint)*unaff_x28;
          pbVar1 = unaff_x28 + 1;
          if (-1 < (char)*unaff_x28) break;
          pbVar1 = unaff_x28 + 1;
          if (uVar8 < 0xe0) {
            unaff_x28 = unaff_x28 + 2;
            uVar8 = *pbVar1 & 0x3f | (uVar8 & 0x1f) << 6;
          }
          else {
            uVar2 = unaff_x28[2] & 0x3f | (*pbVar1 & 0x3f) << 6;
            if (0xef < uVar8) {
              uVar8 = unaff_x28[3] & 0x3f | uVar2 << 6 | (uVar8 & 7) << 0x12;
              if (uVar8 != 0x110000) {
                pbVar1 = unaff_x28 + 4;
                break;
              }
              goto code_r0x0046cbb4;
            }
            unaff_x28 = unaff_x28 + 3;
            uVar8 = uVar2 | (uVar8 & 0x1f) << 0xc;
          }
          if ((uVar6 & 1) == 0) goto code_r0x0046c904;
code_r0x0046c92c:
          uVar6 = 1;
          if (unaff_x28 == unaff_x27) goto code_r0x0046cbb4;
        }
        unaff_x28 = pbVar1;
        if ((uVar6 & 1) != 0) goto code_r0x0046c92c;
code_r0x0046c904:
        uVar6 = (*unaff_x25)();
        if ((uVar6 & 1) != 0) goto code_r0x0046c92c;
        pcVar9 = *(code **)(unaff_x26 + 0x20);
        uVar6 = (*pcVar9)();
        if ((uVar6 & 1) != 0) goto code_r0x0046c92c;
        func_0x004623d8(&uStack0000000000000008,uVar8,0x101);
        if ((char)uStack0000000000000008 != -0x80) {
          uVar6 = (*unaff_x25)();
          if ((uVar6 & 1) == 0) goto code_r0x0046c988;
          goto code_r0x0046c92c;
        }
        uVar6 = (*pcVar9)();
        if ((uVar6 & 1) != 0) goto code_r0x0046c92c;
code_r0x0046c988:
        uVar6 = (*pcVar9)();
      } while (unaff_x28 != unaff_x27);
    }
    else {
      do {
        uVar8 = (uint)*unaff_x28;
        pbVar1 = unaff_x28 + 1;
        if ((char)*unaff_x28 < '\0') {
          if (uVar8 < 0xe0) {
            uVar8 = unaff_x28[1] & 0x3f | (uVar8 & 0x1f) << 6;
            pbVar1 = unaff_x28 + 2;
          }
          else {
            uVar2 = unaff_x28[2] & 0x3f | (unaff_x28[1] & 0x3f) << 6;
            if (uVar8 < 0xf0) {
              uVar8 = uVar2 | (uVar8 & 0x1f) << 0xc;
              pbVar1 = unaff_x28 + 3;
            }
            else {
              uVar8 = unaff_x28[3] & 0x3f | uVar2 << 6 | (uVar8 & 7) << 0x12;
              if (uVar8 == 0x110000) break;
              pbVar1 = unaff_x28 + 4;
            }
          }
        }
        unaff_x28 = pbVar1;
        uVar5 = uVar6 & 1;
        uVar6 = 1;
        if (uVar5 == 0) {
          uVar6 = 1;
          uStack0000000000000008 = unaff_x19;
          in_stack_00000010 = unaff_x26;
          uVar5 = (*unaff_x25)();
          if ((uVar5 & 1) == 0) {
            pcVar9 = *(code **)(unaff_x26 + 0x20);
            uVar5 = (*pcVar9)();
            if ((uVar5 & 1) == 0) {
              func_0x004623d8((long)&uStack0000000000000020 + 4,uVar8,0x101);
              iVar3 = iStack0000000000000028;
              bVar4 = uStack0000000000000020._4_1_ != -0x80;
              if (bVar4) {
                uVar6 = func_0x004650d8(&uStack0000000000000008,
                                        (long)&uStack0000000000000020 +
                                        (ulong)bStack000000000000002e + 4,
                                        (ulong)bStack000000000000002f -
                                        (ulong)bStack000000000000002e);
              }
              else {
                uVar6 = (*pcVar9)();
              }
              if ((((uVar6 & 1) != 0) ||
                  ((!(bVar4 || iVar3 != 10) && (uVar6 = (*unaff_x25)(), (uVar6 & 1) != 0)))) ||
                 (uVar6 = (*pcVar9)(), (uVar6 & 1) != 0)) {
                uVar6 = 1;
              }
              else {
                uVar6 = func_0x004650d8(&uStack0000000000000008,&UNK_00893e13,2);
              }
            }
          }
        }
      } while (unaff_x28 != unaff_x27);
    }
  }
code_r0x0046cbb4:
  if ((uVar6 & 1) == 0) {
    uVar7 = 1;
    uVar6 = (*unaff_x25)();
    if ((uVar6 & 1) == 0) {
      uVar7 = (*unaff_x25)();
    }
  }
  else {
    uVar7 = 1;
  }
  return uVar7;
}

