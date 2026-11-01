
ulong FUN_0006f228(ulong param_1)

{
  byte *pbVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  undefined1 *puVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long unaff_x19;
  undefined1 *unaff_x20;
  ulong unaff_x22;
  undefined1 *unaff_x27;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000060;
  undefined8 uStack0000000000000068;
  
  if ((unaff_x22 | 7) != 0x17) {
    param_1 = unaff_x22 | 7;
  }
  uStack0000000000000020 = (undefined1 *)__Znwm(param_1 + 1);
  if (unaff_x27 == unaff_x20) {
    puVar3 = uStack0000000000000020;
  }
  else {
    uVar5 = (long)unaff_x20 - (long)unaff_x27;
    if ((uVar5 < 0x40) || ((ulong)((long)uStack0000000000000020 - (long)unaff_x27) < 0x40)) {
      puVar2 = uStack0000000000000020;
    }
    else {
      uVar6 = uVar5 & 0xffffffffffffffc0;
      puVar3 = uStack0000000000000020 + uVar6;
      puVar7 = (undefined8 *)(unaff_x27 + 0x20);
      puVar8 = (undefined8 *)(uStack0000000000000020 + 0x20);
      uVar9 = uVar6;
      do {
        uVar10 = puVar7[-4];
        uVar12 = puVar7[-1];
        uVar11 = puVar7[-2];
        uVar14 = puVar7[1];
        uVar13 = *puVar7;
        uVar16 = puVar7[3];
        uVar15 = puVar7[2];
        puVar8[-3] = puVar7[-3];
        puVar8[-4] = uVar10;
        puVar8[-1] = uVar12;
        puVar8[-2] = uVar11;
        puVar8[1] = uVar14;
        *puVar8 = uVar13;
        puVar8[3] = uVar16;
        puVar8[2] = uVar15;
        uVar9 = uVar9 - 0x40;
        puVar7 = puVar7 + 8;
        puVar8 = puVar8 + 8;
      } while (uVar9 != 0);
      puVar2 = puVar3;
      unaff_x27 = unaff_x27 + uVar6;
      if (uVar5 == uVar6) goto code_r0x0006f2c8;
    }
    do {
      puVar4 = unaff_x27 + 1;
      *puVar2 = *unaff_x27;
      puVar3 = puVar2 + 1;
      puVar2 = puVar2 + 1;
      unaff_x27 = puVar4;
    } while (puVar4 != unaff_x20);
  }
code_r0x0006f2c8:
  *puVar3 = 0;
  uVar5 = func_0x000616fc(&uStack0000000000000020);
  if ((uVar5 & 1) == 0) goto code_r0x0006f504;
  uVar9 = in_stack_00000040;
  if (-1 < (char)in_stack_00000048._7_1_) {
    uVar9 = (ulong)in_stack_00000048._7_1_;
  }
  if (uVar9 == 7) {
    pbVar1 = uStack0000000000000038;
    if (-1 < (char)in_stack_00000048._7_1_) {
      pbVar1 = (byte *)&uStack0000000000000038;
    }
    if ((*pbVar1 & 0xdf) == 0x52) {
      pbVar1 = uStack0000000000000038;
      if (-1 < (char)in_stack_00000048._7_1_) {
        pbVar1 = (byte *)&uStack0000000000000038;
      }
      if ((pbVar1[1] & 0xdf) == 0x45) {
        pbVar1 = uStack0000000000000038;
        if (-1 < (char)in_stack_00000048._7_1_) {
          pbVar1 = (byte *)&uStack0000000000000038;
        }
        if ((pbVar1[2] & 0xdf) == 0x46) {
          pbVar1 = uStack0000000000000038;
          if (-1 < (char)in_stack_00000048._7_1_) {
            pbVar1 = (byte *)&uStack0000000000000038;
          }
          if ((pbVar1[3] & 0xdf) == 0x45) {
            pbVar1 = uStack0000000000000038;
            if (-1 < (char)in_stack_00000048._7_1_) {
              pbVar1 = (byte *)&uStack0000000000000038;
            }
            if ((pbVar1[4] & 0xdf) == 0x52) {
              pbVar1 = uStack0000000000000038;
              if (-1 < (char)in_stack_00000048._7_1_) {
                pbVar1 = (byte *)&uStack0000000000000038;
              }
              if ((pbVar1[5] & 0xdf) == 0x45) {
                pbVar1 = uStack0000000000000038;
                if (-1 < (char)in_stack_00000048._7_1_) {
                  pbVar1 = (byte *)&uStack0000000000000038;
                }
                if ((pbVar1[6] & 0xdf) == 0x52) {
code_r0x0006f498:
                  func_0x00061844(&uStack0000000000000068,unaff_x19 + 0x48,&uStack0000000000000038,
                                  &uStack0000000000000020);
                  func_0x0005eb38(unaff_x19 + 0x48,uStack0000000000000068);
                  goto code_r0x0006f504;
                }
              }
            }
          }
        }
      }
    }
  }
  else if (uVar9 == 8) {
    pbVar1 = uStack0000000000000038;
    if (-1 < (char)in_stack_00000048._7_1_) {
      pbVar1 = (byte *)&uStack0000000000000038;
    }
    if ((*pbVar1 & 0xdf) == 0x4c) {
      pbVar1 = uStack0000000000000038;
      if (-1 < (char)in_stack_00000048._7_1_) {
        pbVar1 = (byte *)&uStack0000000000000038;
      }
      if ((pbVar1[1] & 0xdf) == 0x4f) {
        pbVar1 = uStack0000000000000038;
        if (-1 < (char)in_stack_00000048._7_1_) {
          pbVar1 = (byte *)&uStack0000000000000038;
        }
        if ((pbVar1[2] & 0xdf) == 0x43) {
          pbVar1 = uStack0000000000000038;
          if (-1 < (char)in_stack_00000048._7_1_) {
            pbVar1 = (byte *)&uStack0000000000000038;
          }
          if ((pbVar1[3] & 0xdf) == 0x41) {
            pbVar1 = uStack0000000000000038;
            if (-1 < (char)in_stack_00000048._7_1_) {
              pbVar1 = (byte *)&uStack0000000000000038;
            }
            if ((pbVar1[4] & 0xdf) == 0x54) {
              pbVar1 = uStack0000000000000038;
              if (-1 < (char)in_stack_00000048._7_1_) {
                pbVar1 = (byte *)&uStack0000000000000038;
              }
              if ((pbVar1[5] & 0xdf) == 0x49) {
                pbVar1 = uStack0000000000000038;
                if (-1 < (char)in_stack_00000048._7_1_) {
                  pbVar1 = (byte *)&uStack0000000000000038;
                }
                if ((pbVar1[6] & 0xdf) == 0x4f) {
                  pbVar1 = uStack0000000000000038;
                  if (-1 < (char)in_stack_00000048._7_1_) {
                    pbVar1 = (byte *)&uStack0000000000000038;
                  }
                  if ((pbVar1[7] & 0xdf) == 0x4e) goto code_r0x0006f498;
                }
              }
            }
          }
        }
      }
    }
  }
  func_0x00060210(&uStack0000000000000008,&uStack0000000000000020,0);
  func_0x00061844(&uStack0000000000000068,unaff_x19 + 0x48,&uStack0000000000000038,
                  &uStack0000000000000008);
  func_0x0005eb38(unaff_x19 + 0x48,uStack0000000000000068);
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
  }
code_r0x0006f504:
  if ((long)(param_1 + 1 | 0x8000000000000000) < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if ((char)in_stack_00000048._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000038);
  }
  if (in_stack_00000060._7_1_ < '\0') {
    __ZdlPv(in_stack_00000050);
  }
  return uVar5;
}

