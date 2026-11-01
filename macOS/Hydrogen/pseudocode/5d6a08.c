
void FUN_005d6a08(undefined8 param_1,undefined8 param_2)

{
  char cVar1;
  undefined8 uVar2;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 extraout_x1_02;
  undefined8 extraout_x1_03;
  undefined8 extraout_x1_04;
  undefined8 extraout_x1_05;
  undefined8 extraout_x1_06;
  undefined8 extraout_x1_07;
  undefined8 extraout_x1_08;
  undefined8 extraout_x1_09;
  undefined8 extraout_x1_10;
  undefined8 extraout_x1_11;
  undefined8 extraout_x1_12;
  undefined8 extraout_x1_13;
  undefined8 extraout_x1_14;
  undefined8 extraout_x1_15;
  undefined8 extraout_x1_16;
  undefined8 extraout_x1_17;
  undefined8 extraout_x1_18;
  undefined8 extraout_x1_19;
  undefined8 extraout_x1_20;
  undefined8 extraout_x1_21;
  undefined8 extraout_x1_22;
  undefined8 extraout_x1_23;
  undefined8 extraout_x1_24;
  undefined8 extraout_x1_25;
  char in_w8;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  long *plVar7;
  ulong uVar8;
  undefined8 unaff_x19;
  long lVar9;
  char *pcVar10;
  long *unaff_x22;
  undefined8 *puVar11;
  char cVar12;
  ulong *puVar13;
  long unaff_x25;
  long *unaff_x28;
  long unaff_x29;
  char in_wzr;
  undefined1 auVar14 [16];
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000048;
  long in_stack_00000050;
  long *in_stack_00000060;
  
code_r0x005d6a08:
  pcVar10 = (char *)(unaff_x22[0xd] + 8);
  cVar1 = *pcVar10;
  if (cVar1 == in_w8) {
    *pcVar10 = (char)unaff_x25;
  }
joined_r0x005d6a18:
  if (cVar1 != '\0') {
    func_0x007aff64(pcVar10,param_2,1000000000);
  }
  func_0x005d6394();
  uVar2 = extraout_x1_05;
code_r0x005d6438:
  do {
    if (*pcVar10 == '\x01') {
      *pcVar10 = in_wzr;
    }
    else {
      func_0x007b05dc(pcVar10,0);
      uVar2 = extraout_x1_24;
    }
code_r0x005d6448:
    unaff_x22 = unaff_x28;
    lVar3 = 0;
    if (unaff_x22 != in_stack_00000060) {
      lVar3 = 0x108;
    }
    unaff_x28 = (long *)((long)unaff_x22 + lVar3);
    if (unaff_x22 == in_stack_00000060) {
      return;
    }
    *(undefined8 *)(unaff_x29 + -0x58) = unaff_x19;
    switch(unaff_x22[3]) {
    case 0xc:
    case 0x11:
    case 0x12:
    case 0x1c:
    case 0x1d:
    case 0x1e:
    case 0x20:
      break;
    case 0xd:
      func_0x005d0a60(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_11;
      break;
    case 0xe:
      func_0x005d010c(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_15;
      break;
    case 0xf:
      func_0x005d90b4(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_10;
      break;
    case 0x10:
      func_0x005cfb54(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_14;
      break;
    case 0x13:
      func_0x005d06c8(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_08;
      break;
    case 0x14:
      func_0x005d06c8(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_09;
      break;
    default:
      func_0x005dd81c(unaff_x22,unaff_x29 + -0x58);
      uVar2 = extraout_x1_13;
      break;
    case 0x16:
      func_0x005dd1ac(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_19;
      break;
    case 0x17:
      func_0x005dd4fc(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_12;
      break;
    case 0x18:
      func_0x005dc998(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_20;
      break;
    case 0x19:
      func_0x005de220(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_16;
      break;
    case 0x1a:
      func_0x005dedec(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_18;
      break;
    case 0x1b:
      lVar3 = unaff_x22[2];
      if (lVar3 != 0) {
        unaff_x25 = unaff_x22[1];
        in_stack_00000048 = lVar3 << 3;
        auVar14 = func_0x00187bd0(in_stack_00000048,8);
        in_stack_00000050 = auVar14._0_8_;
        if (in_stack_00000050 == 0) {
code_r0x005d6a5c:
          uVar2 = func_0x007a1f00(8,in_stack_00000048,&UNK_009f2e80);
          if ((char)*unaff_x22 == '\x01') {
            *(char *)unaff_x22 = in_wzr;
          }
          else {
            func_0x007b05dc(unaff_x22,0);
          }
          do {
            __Unwind_Resume(uVar2);
            func_0x007b05dc(unaff_x25,0);
            func_0x00187bd4(in_stack_00000050,in_stack_00000048,8);
          } while( true );
        }
        uVar4 = lVar3 - 1U & 0x3ffffffffffffff;
        if (uVar4 < 7) {
          uVar5 = 0;
          lVar6 = unaff_x25;
code_r0x005d67b4:
          do {
            *(long *)(in_stack_00000050 + uVar5 * 8) = lVar6;
            lVar6 = lVar6 + 0x40;
            uVar5 = uVar5 + 1;
          } while (lVar6 != unaff_x25 + lVar3 * 0x40);
        }
        else {
          uVar4 = uVar4 + 1;
          uVar5 = uVar4 & 0x7fffffffffffff8;
          lVar6 = unaff_x25 + uVar5 * 0x40;
          plVar7 = (long *)(in_stack_00000050 + 0x20);
          uVar8 = uVar5;
          lVar9 = unaff_x25;
          do {
            plVar7[-3] = lVar9 + in_stack_00000038;
            plVar7[-4] = lVar9 + in_stack_00000030;
            plVar7[-1] = lVar9 + in_stack_00000028;
            plVar7[-2] = lVar9 + in_stack_00000020;
            plVar7[1] = lVar9 + in_stack_00000018;
            *plVar7 = lVar9 + in_stack_00000010;
            plVar7[3] = lVar9 + in_stack_00000008;
            plVar7[2] = lVar9 + in_stack_00000000;
            lVar9 = lVar9 + 0x200;
            uVar8 = uVar8 - 8;
            plVar7 = plVar7 + 8;
          } while (uVar8 != 0);
          if (uVar4 != uVar5) goto code_r0x005d67b4;
        }
        do {
          uVar2 = auVar14._8_8_;
          puVar11 = auVar14._0_8_ + 1;
          puVar13 = (ulong *)*auVar14._0_8_;
          uVar4 = *puVar13;
          if ((long)uVar4 < 6) {
            if ((long)uVar4 < 3) {
              if (uVar4 < 2) goto code_r0x005d68d4;
              lVar3 = 8;
code_r0x005d6890:
              auVar14 = func_0x005d0a60((long)puVar13 + lVar3,unaff_x29 + -0x58);
code_r0x005d68cc:
              uVar2 = auVar14._8_8_;
              if ((auVar14._0_8_ & 1) == 0) {
                uVar4 = *puVar13;
                goto code_r0x005d68d4;
              }
              break;
            }
            if (uVar4 == 3) {
code_r0x005d68a4:
              auVar14 = func_0x005d010c(puVar13 + 1,unaff_x29 + -0x58);
              goto code_r0x005d68cc;
            }
            if (uVar4 != 4) {
              auVar14 = func_0x005cc4b0(puVar13 + 1,unaff_x29 + -0x58);
              goto code_r0x005d68cc;
            }
          }
          else {
            if ((long)uVar4 < 9) {
              if (uVar4 != 6) {
                if (uVar4 == 7) {
                  auVar14 = func_0x005d0800(puVar13 + 1,unaff_x29 + -0x58);
                }
                else {
                  auVar14 = func_0x005cc374(puVar13 + 1,unaff_x29 + -0x58);
                }
                goto code_r0x005d68cc;
              }
            }
            else {
              if (uVar4 == 9) {
                auVar14 = func_0x005c2d98(puVar13 + 1,unaff_x29 + -0x58);
                goto code_r0x005d68cc;
              }
              if (uVar4 != 10) {
                uVar4 = puVar13[1] ^ 0x8000000000000000;
                if (1 < uVar4) {
                  uVar4 = 2;
                }
                if (uVar4 == 0) goto code_r0x005d67e0;
                if (uVar4 != 2) {
                  lVar3 = 0x10;
                  goto code_r0x005d6890;
                }
                goto code_r0x005d68a4;
              }
            }
code_r0x005d68d4:
            if (uVar4 == 10) {
              uVar4 = puVar13[4];
              pcVar10 = (char *)(uVar4 + 8);
              if (*pcVar10 == '\0') {
                *pcVar10 = '\x01';
              }
              else {
                func_0x007aff64(pcVar10,uVar2,1000000000);
              }
              uVar2 = *(undefined8 *)(unaff_x29 + -0x58);
              if (*(long *)(uVar4 + 0x20) != 0) {
                lVar3 = *(long *)(uVar4 + 0x18);
                lVar9 = *(long *)(uVar4 + 0x20) << 3;
                do {
                  func_0x005d5ff8(uVar2,&UNK_008b6109,1,lVar3);
                  lVar3 = lVar3 + 8;
                  lVar9 = lVar9 + -8;
                } while (lVar9 != 0);
              }
              func_0x005d6394(uVar2,uVar4 + 0x28);
              if (*pcVar10 == '\x01') {
                *pcVar10 = in_wzr;
                uVar2 = extraout_x1_21;
              }
              else {
                func_0x007b05dc(pcVar10,0);
                uVar2 = extraout_x1_22;
              }
            }
          }
code_r0x005d67e0:
          auVar14._8_8_ = uVar2;
          auVar14._0_8_ = puVar11;
        } while (puVar11 != (undefined8 *)(in_stack_00000050 + uVar5 * 8));
        func_0x00187bd4(in_stack_00000050,in_stack_00000048,8);
        unaff_x25 = 1;
        uVar2 = extraout_x1_23;
      }
      break;
    case 0x1f:
      func_0x005cff30(unaff_x22 + 4,unaff_x29 + -0x58);
      uVar2 = extraout_x1_17;
    }
    lVar3 = unaff_x22[3];
    cVar12 = (char)unaff_x25;
    if (lVar3 < 0x14) {
      if (lVar3 == 0xf) {
        if (((*(byte *)(unaff_x22 + 10) & 1) != 0) && (plVar7 = unaff_x22 + 6, *plVar7 != 0)) {
          unaff_x22 = (long *)unaff_x22[5];
          lVar3 = *plVar7 * 0x18;
          do {
            if (*unaff_x22 != -0x8000000000000000) {
              func_0x007a23bc(&UNK_009f2fb0);
              goto code_r0x005d6a5c;
            }
            func_0x005d5ff8();
            unaff_x22 = unaff_x22 + 3;
            lVar3 = lVar3 + -0x18;
            uVar2 = extraout_x1_03;
          } while (lVar3 != 0);
        }
        goto code_r0x005d6448;
      }
      if (lVar3 == 0x10) {
        pcVar10 = (char *)(unaff_x22[0xc] + 8);
        if (*pcVar10 == '\0') {
          *pcVar10 = cVar12;
        }
        else {
          func_0x007aff64(pcVar10,uVar2,1000000000);
        }
        func_0x005d6394();
        if (*pcVar10 == '\x01') {
          *pcVar10 = in_wzr;
          pcVar10 = (char *)(unaff_x22[0xd] + 8);
          cVar1 = *pcVar10;
          param_2 = extraout_x1_04;
          if (cVar1 == '\0') {
            *pcVar10 = cVar12;
          }
          goto joined_r0x005d6a18;
        }
        func_0x007b05dc(pcVar10,0);
        in_w8 = '\0';
        param_2 = extraout_x1_25;
        goto code_r0x005d6a08;
      }
      if (lVar3 != 0x13) goto code_r0x005d6448;
      pcVar10 = (char *)(unaff_x22[0xc] + 8);
      if (*pcVar10 == '\0') {
        *pcVar10 = cVar12;
      }
      else {
        func_0x007aff64(pcVar10,uVar2,1000000000);
      }
      func_0x005d6394();
      uVar2 = extraout_x1_00;
      goto code_r0x005d6438;
    }
    if (lVar3 == 0x14) {
      pcVar10 = (char *)(unaff_x22[0xc] + 8);
      if (*pcVar10 == '\0') {
        *pcVar10 = cVar12;
      }
      else {
        func_0x007aff64(pcVar10,uVar2,1000000000);
      }
      func_0x005d6394();
      uVar2 = extraout_x1;
      goto code_r0x005d6438;
    }
    if (lVar3 == 0x17) {
      func_0x005d5ff8();
      pcVar10 = (char *)(unaff_x22[0x1d] + 8);
      if (*pcVar10 == '\0') {
        *pcVar10 = cVar12;
      }
      else {
        func_0x007aff64(pcVar10,extraout_x1_06,1000000000);
      }
      func_0x005d6394();
      uVar2 = extraout_x1_07;
      goto code_r0x005d6438;
    }
    if (lVar3 != 0x1a) goto code_r0x005d6448;
    if (unaff_x22[6] != 0) {
      lVar3 = unaff_x22[6] << 3;
      do {
        func_0x005d5ff8();
        lVar3 = lVar3 + -8;
        uVar2 = extraout_x1_01;
      } while (lVar3 != 0);
    }
    pcVar10 = (char *)(unaff_x22[10] + 8);
    if (*pcVar10 == '\0') {
      *pcVar10 = cVar12;
    }
    else {
      func_0x007aff64(pcVar10,uVar2,1000000000);
    }
    func_0x005d6394();
    uVar2 = extraout_x1_02;
  } while( true );
}

