
/* WARNING: Removing unreachable block (ram,0x0046cd14) */
/* WARNING: Removing unreachable block (ram,0x0046cb0c) */

undefined8 FUN_0046c9dc(long param_1)

{
  byte *pbVar1;
  uint uVar2;
  int iVar3;
  bool bVar4;
  ulong uVar5;
  undefined8 unaff_x19;
  long unaff_x20;
  undefined8 uVar6;
  ulong unaff_x21;
  code *pcVar7;
  uint uVar8;
  int unaff_w22;
  code *unaff_x25;
  long unaff_x26;
  byte *unaff_x27;
  byte *pbVar9;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000020;
  int iStack0000000000000028;
  byte bStack000000000000002e;
  byte bStack000000000000002f;
  
  if (unaff_w22 == 0x110000) goto LAB_0046cbb4;
  pbVar9 = (byte *)(param_1 + 4);
  if ((unaff_x21 & 1) == 0) {
    if (-1 < *(char *)(unaff_x20 + 0x12)) {
      pcVar7 = *(code **)(unaff_x26 + 0x20);
      uVar5 = (*pcVar7)();
      if ((uVar5 & 1) == 0) {
        func_0x004623d8(&uStack0000000000000008);
        if ((char)uStack0000000000000008 == -0x80) {
          uVar5 = (*pcVar7)();
        }
        else {
          uVar5 = (*unaff_x25)();
        }
        if ((uVar5 & 1) == 0) {
          unaff_x21 = (*pcVar7)();
          goto code_r0x0046c85c;
        }
      }
      goto LAB_0046c858;
    }
    unaff_x21 = 1;
    uVar5 = (*unaff_x25)();
    if ((uVar5 & 1) == 0) {
      uStack0000000000000008 = unaff_x19;
      in_stack_00000010 = unaff_x26;
      uVar5 = (*unaff_x25)();
      if ((uVar5 & 1) == 0) {
        pcVar7 = *(code **)(unaff_x26 + 0x20);
        uVar5 = (*pcVar7)();
        if ((uVar5 & 1) == 0) {
          func_0x004623d8((long)&uStack0000000000000020 + 4);
          iVar3 = iStack0000000000000028;
          bVar4 = uStack0000000000000020._4_1_ != -0x80;
          if (bVar4) {
            uVar5 = func_0x004650d8(&uStack0000000000000008,
                                    (long)&uStack0000000000000020 +
                                    (ulong)bStack000000000000002e + 4,
                                    (ulong)bStack000000000000002f - (ulong)bStack000000000000002e);
          }
          else {
            uVar5 = (*pcVar7)();
          }
          if (((uVar5 & 1) == 0) &&
             (((bVar4 || iVar3 != 10 || (uVar5 = (*unaff_x25)(), (uVar5 & 1) == 0)) &&
              (uVar5 = (*pcVar7)(), (uVar5 & 1) == 0)))) {
            unaff_x21 = func_0x004650d8(&uStack0000000000000008,&UNK_00893e13,2);
            goto code_r0x0046c85c;
          }
        }
      }
      goto LAB_0046c858;
    }
  }
  else {
LAB_0046c858:
    unaff_x21 = 1;
  }
code_r0x0046c85c:
  if (pbVar9 != unaff_x27) {
    if ((*(uint *)(unaff_x20 + 0x10) >> 0x17 & 1) == 0) {
      do {
        while( true ) {
          uVar8 = (uint)*pbVar9;
          pbVar1 = pbVar9 + 1;
          if (-1 < (char)*pbVar9) break;
          pbVar1 = pbVar9 + 1;
          if (uVar8 < 0xe0) {
            pbVar9 = pbVar9 + 2;
            uVar8 = *pbVar1 & 0x3f | (uVar8 & 0x1f) << 6;
          }
          else {
            uVar2 = pbVar9[2] & 0x3f | (*pbVar1 & 0x3f) << 6;
            if (0xef < uVar8) {
              uVar8 = pbVar9[3] & 0x3f | uVar2 << 6 | (uVar8 & 7) << 0x12;
              if (uVar8 != 0x110000) {
                pbVar1 = pbVar9 + 4;
                break;
              }
              goto LAB_0046cbb4;
            }
            pbVar9 = pbVar9 + 3;
            uVar8 = uVar2 | (uVar8 & 0x1f) << 0xc;
          }
          if ((unaff_x21 & 1) == 0) goto code_r0x0046c904;
code_r0x0046c92c:
          unaff_x21 = 1;
          if (pbVar9 == unaff_x27) goto LAB_0046cbb4;
        }
        pbVar9 = pbVar1;
        if ((unaff_x21 & 1) != 0) goto code_r0x0046c92c;
code_r0x0046c904:
        uVar5 = (*unaff_x25)();
        if ((uVar5 & 1) != 0) goto code_r0x0046c92c;
        pcVar7 = *(code **)(unaff_x26 + 0x20);
        uVar5 = (*pcVar7)();
        if ((uVar5 & 1) != 0) goto code_r0x0046c92c;
        func_0x004623d8(&uStack0000000000000008,uVar8,0x101);
        if ((char)uStack0000000000000008 != -0x80) {
          uVar5 = (*unaff_x25)();
          if ((uVar5 & 1) == 0) goto code_r0x0046c988;
          goto code_r0x0046c92c;
        }
        uVar5 = (*pcVar7)();
        if ((uVar5 & 1) != 0) goto code_r0x0046c92c;
code_r0x0046c988:
        unaff_x21 = (*pcVar7)();
      } while (pbVar9 != unaff_x27);
    }
    else {
      do {
        uVar8 = (uint)*pbVar9;
        pbVar1 = pbVar9 + 1;
        if ((char)*pbVar9 < '\0') {
          if (uVar8 < 0xe0) {
            uVar8 = pbVar9[1] & 0x3f | (uVar8 & 0x1f) << 6;
            pbVar1 = pbVar9 + 2;
          }
          else {
            uVar2 = pbVar9[2] & 0x3f | (pbVar9[1] & 0x3f) << 6;
            if (uVar8 < 0xf0) {
              uVar8 = uVar2 | (uVar8 & 0x1f) << 0xc;
              pbVar1 = pbVar9 + 3;
            }
            else {
              uVar8 = pbVar9[3] & 0x3f | uVar2 << 6 | (uVar8 & 7) << 0x12;
              if (uVar8 == 0x110000) break;
              pbVar1 = pbVar9 + 4;
            }
          }
        }
        pbVar9 = pbVar1;
        uVar5 = unaff_x21 & 1;
        unaff_x21 = 1;
        if (uVar5 == 0) {
          unaff_x21 = 1;
          uStack0000000000000008 = unaff_x19;
          in_stack_00000010 = unaff_x26;
          uVar5 = (*unaff_x25)();
          if ((uVar5 & 1) == 0) {
            pcVar7 = *(code **)(unaff_x26 + 0x20);
            uVar5 = (*pcVar7)();
            if ((uVar5 & 1) == 0) {
              func_0x004623d8((long)&uStack0000000000000020 + 4,uVar8,0x101);
              iVar3 = iStack0000000000000028;
              bVar4 = uStack0000000000000020._4_1_ != -0x80;
              if (bVar4) {
                uVar5 = func_0x004650d8(&uStack0000000000000008,
                                        (long)&uStack0000000000000020 +
                                        (ulong)bStack000000000000002e + 4,
                                        (ulong)bStack000000000000002f -
                                        (ulong)bStack000000000000002e);
              }
              else {
                uVar5 = (*pcVar7)();
              }
              if ((((uVar5 & 1) != 0) ||
                  ((!(bVar4 || iVar3 != 10) && (uVar5 = (*unaff_x25)(), (uVar5 & 1) != 0)))) ||
                 (uVar5 = (*pcVar7)(), (uVar5 & 1) != 0)) {
                unaff_x21 = 1;
              }
              else {
                unaff_x21 = func_0x004650d8(&uStack0000000000000008,&UNK_00893e13,2);
              }
            }
          }
        }
      } while (pbVar9 != unaff_x27);
    }
  }
LAB_0046cbb4:
  if ((unaff_x21 & 1) == 0) {
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

