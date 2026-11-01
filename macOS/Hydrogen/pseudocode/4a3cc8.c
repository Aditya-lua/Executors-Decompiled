
void FUN_004a3cc8(void)

{
  undefined4 uVar1;
  undefined4 uVar2;
  byte bVar3;
  code *pcVar4;
  long lVar5;
  int iVar6;
  byte *pbVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 uVar10;
  long *plVar11;
  ulong uVar12;
  undefined8 *unaff_x19;
  byte *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  undefined8 uStack0000000000000000;
  long *in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000050;
  long *in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  iVar6 = func_0x005e7964();
  if (iVar6 == 0) {
    uStack0000000000000050 = 2;
    in_stack_00000070 = 0;
  }
  else {
    in_stack_00000010 = *(long *)(unaff_x22 + 0x758) + 0x30;
    uStack0000000000000000 = 8;
    in_stack_00000008 = (long *)0x0;
    func_0x005e699c(&uStack0000000000000050);
  }
  in_stack_00000008 = in_stack_00000058;
  uStack0000000000000000 = uStack0000000000000050;
  in_stack_00000018 = in_stack_00000068;
  in_stack_00000010 = in_stack_00000060;
  in_stack_00000020 = in_stack_00000070;
  if (uStack0000000000000050 == 2) {
    if (unaff_x21 != 0) goto code_r0x004a3ad4;
code_r0x004a3ab8:
    unaff_x19[2] = unaff_x20;
code_r0x004a3abc:
    unaff_x19[3] = 0;
    *(undefined1 *)(unaff_x19 + 4) = 0x17;
code_r0x004a3e88:
    unaff_x19[1] = 1;
    *unaff_x19 = 1;
  }
  else {
    func_0x005ec344();
    if (unaff_x21 == 0) goto code_r0x004a3ab8;
code_r0x004a3ad4:
    pbVar7 = unaff_x20 + 1;
    uStack0000000000000028._7_1_ = *unaff_x20;
    uVar8 = unaff_x21 - 1;
    if (uStack0000000000000028._7_1_ < 4) {
      if (uStack0000000000000028._7_1_ < 2) {
        if (uStack0000000000000028._7_1_ == 0) {
          unaff_x19[1] = pbVar7;
          unaff_x19[2] = uVar8;
          unaff_x19[3] = 0x8000000000000000;
          *unaff_x19 = 0;
        }
        else {
          if (uStack0000000000000028._7_1_ != 1) goto code_r0x004a4008;
          if (uVar8 == 0) {
            unaff_x19[2] = pbVar7;
            goto code_r0x004a3abc;
          }
          bVar3 = unaff_x20[1];
          unaff_x19[1] = unaff_x20 + 2;
          unaff_x19[2] = unaff_x21 - 2;
          unaff_x19[3] = 0x8000000000000001;
          *(bool *)(unaff_x19 + 4) = bVar3 != 0;
          *unaff_x19 = 0;
        }
      }
      else {
        if (uStack0000000000000028._7_1_ == 2) {
          if (unaff_x21 < 9) {
            unaff_x19[2] = pbVar7;
            unaff_x19[3] = uVar8;
            unaff_x19[4] = 0x17;
            goto code_r0x004a3e88;
          }
          uVar12 = *(ulong *)(unaff_x20 + 1);
          unaff_x19[1] = unaff_x20 + 9;
          unaff_x19[2] = unaff_x21 - 9;
          uVar10 = 0x8000000000000002;
        }
        else {
          if (uStack0000000000000028._7_1_ != 3) {
code_r0x004a4008:
            func_0x007a4b08((long)&uStack0000000000000028 + 7);
            goto code_r0x004a4024;
          }
          if (unaff_x21 == 1) goto code_r0x004a3c78;
          bVar3 = unaff_x20[1];
          iVar6 = (int)(char)bVar3;
          if ((char)bVar3 < '\0') {
            if (unaff_x21 == 2) goto code_r0x004a3c78;
            uVar12 = (ulong)bVar3 & 0x7f;
            bVar3 = unaff_x20[2];
            iVar6 = (int)(char)bVar3;
            if ((char)bVar3 < '\0') {
              if (unaff_x21 == 3) goto code_r0x004a3c78;
              uVar12 = uVar12 | ((long)(char)bVar3 & 0x7fU) << 7;
              bVar3 = unaff_x20[3];
              iVar6 = (int)(char)bVar3;
              if ((char)bVar3 < '\0') {
                if (unaff_x21 == 4) goto code_r0x004a3c78;
                uVar12 = uVar12 | ((long)(char)bVar3 & 0x7fU) << 0xe;
                bVar3 = unaff_x20[4];
                iVar6 = (int)(char)bVar3;
                if ((char)bVar3 < '\0') {
                  if (unaff_x21 == 5) goto code_r0x004a3c78;
                  uVar12 = uVar12 | ((long)(char)bVar3 & 0x7fU) << 0x15;
                  bVar3 = unaff_x20[5];
                  iVar6 = (int)(char)bVar3;
                  if ((char)bVar3 < '\0') {
                    if (unaff_x21 == 6) goto code_r0x004a3c78;
                    uVar12 = uVar12 | ((long)(char)bVar3 & 0x7fU) << 0x1c;
                    bVar3 = unaff_x20[6];
                    iVar6 = (int)(char)bVar3;
                    if ((char)bVar3 < 0) {
                      if (unaff_x21 == 7) goto code_r0x004a3c78;
                      uVar12 = uVar12 | (ulong)((int)(char)bVar3 & 0x7f) << 0x23;
                      bVar3 = unaff_x20[7];
                      iVar6 = (int)(char)bVar3;
                      if ((char)bVar3 < 0) {
                        if (unaff_x21 == 8) goto code_r0x004a3c78;
                        uVar12 = uVar12 | (ulong)((int)(char)bVar3 & 0x7f) << 0x2a;
                        bVar3 = unaff_x20[8];
                        iVar6 = (int)(char)bVar3;
                        if ((char)bVar3 < 0) {
                          if (unaff_x21 == 9) goto code_r0x004a3c78;
                          uVar12 = uVar12 | (ulong)((int)(char)bVar3 & 0x7f) << 0x31;
                          bVar3 = unaff_x20[9];
                          iVar6 = (int)(char)bVar3;
                          if ((char)bVar3 < 0) {
                            if (unaff_x21 == 10) goto code_r0x004a3c78;
                            iVar6 = (int)(char)unaff_x20[10];
                            if ((char)unaff_x20[10] < '\0') goto code_r0x004a4198;
                            uVar12 = uVar12 | (ulong)((int)(char)bVar3 & 0x7f) << 0x38;
                            uVar9 = 10;
                            lVar5 = 0x3f;
                          }
                          else {
                            uVar9 = 9;
                            lVar5 = 0x38;
                          }
                        }
                        else {
                          uVar9 = 8;
                          lVar5 = 0x31;
                        }
                      }
                      else {
                        uVar9 = 7;
                        lVar5 = 0x2a;
                      }
                    }
                    else {
                      uVar9 = 6;
                      lVar5 = 0x23;
                    }
                  }
                  else {
                    uVar9 = 5;
                    lVar5 = 0x1c;
                  }
                }
                else {
                  uVar9 = 4;
                  lVar5 = 0x15;
                }
              }
              else {
                uVar9 = 3;
                lVar5 = 0xe;
              }
            }
            else {
              uVar9 = 2;
              lVar5 = 7;
            }
          }
          else {
            uVar12 = 0;
            lVar5 = 0;
            uVar9 = 1;
          }
          if (uVar8 < uVar9) goto code_r0x004a4014;
          uVar12 = (long)iVar6 << lVar5 | uVar12;
          unaff_x19[1] = pbVar7 + uVar9;
          unaff_x19[2] = uVar8 - uVar9;
          uVar10 = 0x8000000000000003;
        }
code_r0x004a3d6c:
        unaff_x19[3] = uVar10;
        unaff_x19[4] = uVar12;
        *unaff_x19 = 0;
      }
joined_r0x004a3db0:
      if (uStack0000000000000000 == 2) {
        return;
      }
      func_0x005ec378();
      lVar5 = uStack0000000000000000;
      if (uStack0000000000000000 == 2) {
        return;
      }
      func_0x005ec3ac();
      goto code_r0x004a3ecc;
    }
    if (uStack0000000000000028._7_1_ < 6) {
      if (uStack0000000000000028._7_1_ == 4) {
        if (4 < unaff_x21) {
          uVar12 = (ulong)*(uint *)(unaff_x20 + 1);
          unaff_x19[1] = unaff_x20 + 5;
          unaff_x19[2] = unaff_x21 - 5;
          uVar10 = 0x8000000000000004;
          goto code_r0x004a3d6c;
        }
code_r0x004a3c50:
        unaff_x19[2] = pbVar7;
        unaff_x19[3] = uVar8;
code_r0x004a3e80:
        *(undefined4 *)(unaff_x19 + 4) = 0x17;
        goto code_r0x004a3e88;
      }
      if (uStack0000000000000028._7_1_ != 5) goto code_r0x004a4008;
      func_0x004b9310(&uStack0000000000000050);
      if ((int)uStack0000000000000050 != 1) {
        unaff_x19[4] = in_stack_00000070;
        unaff_x19[3] = in_stack_00000068;
        unaff_x19[5] = in_stack_00000078;
        unaff_x19[1] = in_stack_00000058;
        unaff_x19[2] = in_stack_00000060;
        *unaff_x19 = 0;
        in_stack_00000038 = in_stack_00000070;
        in_stack_00000030 = in_stack_00000068;
        in_stack_00000040 = in_stack_00000078;
        goto joined_r0x004a3db0;
      }
      in_stack_00000038 = in_stack_00000070;
      in_stack_00000030 = in_stack_00000068;
      unaff_x19[4] = in_stack_00000070;
      unaff_x19[3] = in_stack_00000068;
      unaff_x19[2] = in_stack_00000060;
      plVar11 = in_stack_00000058;
    }
    else {
      if (uStack0000000000000028._7_1_ != 6) {
        if (uStack0000000000000028._7_1_ != 7) goto code_r0x004a4008;
        uVar12 = unaff_x21 - 5;
        if (unaff_x21 < 5) goto code_r0x004a3c50;
        if (uVar12 < 4) {
          pbVar7 = unaff_x20 + 5;
        }
        else {
          uVar12 = unaff_x21 - 9;
          if (uVar12 < 4) {
            pbVar7 = unaff_x20 + 9;
          }
          else {
            uVar12 = unaff_x21 - 0xd;
            if (3 < uVar12) {
              uVar1 = *(undefined4 *)(unaff_x20 + 1);
              uVar2 = *(undefined4 *)(unaff_x20 + 5);
              unaff_x19[1] = unaff_x20 + 0x11;
              unaff_x19[2] = unaff_x21 - 0x11;
              unaff_x19[3] = 0x8000000000000007;
              *(undefined4 *)(unaff_x19 + 4) = uVar1;
              *(undefined4 *)((long)unaff_x19 + 0x24) = uVar2;
              unaff_x19[5] = *(undefined8 *)(unaff_x20 + 9);
              *unaff_x19 = 0;
              goto joined_r0x004a3db0;
            }
            pbVar7 = unaff_x20 + 0xd;
          }
        }
        unaff_x19[2] = pbVar7;
        unaff_x19[3] = uVar12;
        goto code_r0x004a3e80;
      }
      if (unaff_x21 == 1) {
code_r0x004a3c78:
        plVar11 = (long *)0x0;
        pbVar7 = (byte *)((long)&MACH_HEADER.magic + 1);
      }
      else {
        bVar3 = unaff_x20[1];
        iVar6 = (int)(char)bVar3;
        if (-1 < (char)bVar3) {
          uVar12 = 0;
          lVar5 = 0;
          uVar9 = 1;
code_r0x004a3d44:
          if (uVar9 <= uVar8) {
            uVar12 = (long)iVar6 << lVar5 | uVar12;
            unaff_x19[1] = pbVar7 + uVar9;
            unaff_x19[2] = uVar8 - uVar9;
            uVar10 = 0x8000000000000006;
            goto code_r0x004a3d6c;
          }
code_r0x004a4014:
          func_0x007a28a4(uVar9,uVar8,&UNK_009e4938);
code_r0x004a4024:
                    /* WARNING: Does not return */
          pcVar4 = (code *)SoftwareBreakpoint(1,0x4a4028);
          (*pcVar4)();
        }
        if (unaff_x21 == 2) goto code_r0x004a3c78;
        uVar12 = (ulong)bVar3 & 0x7f;
        bVar3 = unaff_x20[2];
        iVar6 = (int)(char)bVar3;
        if (-1 < (char)bVar3) {
          uVar9 = 2;
          lVar5 = 7;
          goto code_r0x004a3d44;
        }
        if (unaff_x21 == 3) goto code_r0x004a3c78;
        uVar12 = uVar12 | ((long)(char)bVar3 & 0x7fU) << 7;
        bVar3 = unaff_x20[3];
        iVar6 = (int)(char)bVar3;
        if (-1 < (char)bVar3) {
          uVar9 = 3;
          lVar5 = 0xe;
          goto code_r0x004a3d44;
        }
        if (unaff_x21 == 4) goto code_r0x004a3c78;
        uVar12 = uVar12 | ((long)(char)bVar3 & 0x7fU) << 0xe;
        bVar3 = unaff_x20[4];
        iVar6 = (int)(char)bVar3;
        if (-1 < (char)bVar3) {
          uVar9 = 4;
          lVar5 = 0x15;
          goto code_r0x004a3d44;
        }
        if (unaff_x21 == 5) goto code_r0x004a3c78;
        uVar12 = uVar12 | ((long)(char)bVar3 & 0x7fU) << 0x15;
        bVar3 = unaff_x20[5];
        iVar6 = (int)(char)bVar3;
        if (-1 < (char)bVar3) {
          uVar9 = 5;
          lVar5 = 0x1c;
          goto code_r0x004a3d44;
        }
        if (unaff_x21 == 6) goto code_r0x004a3c78;
        uVar12 = uVar12 | ((long)(char)bVar3 & 0x7fU) << 0x1c;
        bVar3 = unaff_x20[6];
        iVar6 = (int)(char)bVar3;
        if (-1 < (char)bVar3) {
          uVar9 = 6;
          lVar5 = 0x23;
          goto code_r0x004a3d44;
        }
        if (unaff_x21 == 7) goto code_r0x004a3c78;
        uVar12 = uVar12 | (ulong)((int)(char)bVar3 & 0x7f) << 0x23;
        bVar3 = unaff_x20[7];
        iVar6 = (int)(char)bVar3;
        if (-1 < (char)bVar3) {
          uVar9 = 7;
          lVar5 = 0x2a;
          goto code_r0x004a3d44;
        }
        if (unaff_x21 == 8) goto code_r0x004a3c78;
        uVar12 = uVar12 | (ulong)((int)(char)bVar3 & 0x7f) << 0x2a;
        bVar3 = unaff_x20[8];
        iVar6 = (int)(char)bVar3;
        if (-1 < (char)bVar3) {
          uVar9 = 8;
          lVar5 = 0x31;
          goto code_r0x004a3d44;
        }
        if (unaff_x21 == 9) goto code_r0x004a3c78;
        uVar12 = uVar12 | (ulong)((int)(char)bVar3 & 0x7f) << 0x31;
        bVar3 = unaff_x20[9];
        iVar6 = (int)(char)bVar3;
        if (-1 < (char)bVar3) {
          uVar9 = 9;
          lVar5 = 0x38;
          goto code_r0x004a3d44;
        }
        if (unaff_x21 == 10) goto code_r0x004a3c78;
        iVar6 = (int)(char)unaff_x20[10];
        if (-1 < (char)unaff_x20[10]) {
          uVar12 = uVar12 | (ulong)((int)(char)bVar3 & 0x7f) << 0x38;
          uVar9 = 10;
          lVar5 = 0x3f;
          goto code_r0x004a3d44;
        }
code_r0x004a4198:
        plVar11 = (long *)((long)&MACH_HEADER.magic + 1);
      }
      unaff_x19[2] = pbVar7;
      unaff_x19[3] = uVar8;
      unaff_x19[4] = 0x2f;
    }
    *unaff_x19 = 1;
    unaff_x19[1] = plVar11;
  }
  if (uStack0000000000000000 == 2) {
    return;
  }
  func_0x005ec378();
  lVar5 = uStack0000000000000000;
  if (uStack0000000000000000 == 2) {
    return;
  }
  func_0x005ec3ac();
code_r0x004a3ecc:
  if (lVar5 != 0) {
    lVar5 = *in_stack_00000008;
    *in_stack_00000008 = lVar5 + -1;
    LORelease();
    if (lVar5 == 1) {
      DataMemoryBarrier(2,1);
      func_0x005e80f0((ulong)&uStack0000000000000000 | 8);
    }
  }
  return;
}

