
void FUN_0025e80c(void)

{
  char *pcVar1;
  byte *pbVar2;
  byte bVar3;
  bool in_ZR;
  bool bVar4;
  int iVar5;
  undefined4 uVar6;
  ulong uVar7;
  ulong *unaff_x19;
  ulong *unaff_x20;
  ulong unaff_x21;
  ulong uVar8;
  ulong *unaff_x22;
  undefined8 *puVar9;
  long unaff_x23;
  ulong unaff_x24;
  ulong uVar10;
  long unaff_x29;
  undefined8 uVar11;
  ulong uVar12;
  undefined8 uVar13;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  ulong uVar17;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  undefined8 uStack0000000000000080;
  ulong in_stack_00000088;
  ulong in_stack_00000090;
  ulong in_stack_00000098;
  ulong in_stack_000000b0;
  ulong in_stack_000000b8;
  ulong in_stack_000000c0;
  ulong in_stack_000000c8;
  ulong in_stack_000000d0;
  ulong in_stack_000000d8;
  ulong in_stack_000000e0;
  
  if (!in_ZR) {
    uVar8 = 0;
    uVar7 = 0;
    uVar10 = unaff_x24 - 10;
    goto LAB_0025e890;
  }
  func_0x00263a40(&uStack0000000000000080,&uStack0000000000000008,0x30);
  unaff_x21 = in_stack_00000090;
  if (uStack0000000000000080 == unaff_x24) {
    uVar10 = unaff_x24 - 0x11;
    if ((in_stack_00000090 != unaff_x22[3]) ||
       (iVar5 = _memcmp(in_stack_00000088,unaff_x22[2],in_stack_00000090), iVar5 != 0))
    goto LAB_0025e850;
    func_0x00263a40(&uStack0000000000000080,&uStack0000000000000008,0x30);
    unaff_x21 = in_stack_00000090;
    uVar12 = in_stack_00000088;
    if (uStack0000000000000080 != unaff_x24) {
      *(undefined8 *)(unaff_x23 + 0xe8) = *(undefined8 *)(unaff_x23 + 0x20);
      *(undefined8 *)(unaff_x23 + 0xe0) = *(undefined8 *)(unaff_x23 + 0x18);
      *(undefined8 *)(unaff_x23 + 0xf8) = *(undefined8 *)(unaff_x23 + 0x30);
      *(undefined8 *)(unaff_x23 + 0xf0) = *(undefined8 *)(unaff_x23 + 0x28);
      uVar7 = in_stack_00000088 & 0xffffffffffffff00;
      uVar8 = in_stack_00000088;
      uVar10 = uStack0000000000000080;
      goto LAB_0025e890;
    }
    if (in_stack_00000018 < in_stack_00000010) {
      bVar4 = *(char *)(uStack0000000000000008 + in_stack_00000018) == '\x17';
    }
    else {
      bVar4 = false;
    }
    *(bool *)(unaff_x29 + -0xe0) = bVar4;
    in_stack_00000088 = CONCAT71(in_stack_00000088._1_7_,0x12);
    uStack0000000000000080 = unaff_x24 - 0x10;
    uVar6 = 0x17;
    if (!bVar4) {
      uVar6 = 0x18;
    }
    func_0x00262c20(unaff_x29 + -0xa8,&uStack0000000000000008,uVar6,&uStack0000000000000080,
                    unaff_x29 + -0xe0,0xffff);
    if (*(ulong *)(unaff_x29 + -0xa8) != unaff_x24) {
      uVar13 = *(undefined8 *)(unaff_x23 + 200);
      uVar11 = *(undefined8 *)(unaff_x23 + 0xc0);
      uVar16 = *(undefined8 *)(unaff_x23 + 0xd8);
      uVar15 = *(undefined8 *)(unaff_x23 + 0xd0);
      uVar8 = *(ulong *)(unaff_x29 + -0xa0);
      unaff_x21 = *(ulong *)(unaff_x29 + -0x98);
      uVar10 = *(ulong *)(unaff_x29 + -0xa8);
      goto code_r0x0025e864;
    }
    func_0x0026f1e4(&uStack0000000000000080,&uStack0000000000000008);
    if (uStack0000000000000080 != unaff_x24) {
      *(undefined8 *)(unaff_x23 + 0xe8) = *(undefined8 *)(unaff_x23 + 0x20);
      *(undefined8 *)(unaff_x23 + 0xe0) = *(undefined8 *)(unaff_x23 + 0x18);
      *(undefined8 *)(unaff_x23 + 0xf8) = *(undefined8 *)(unaff_x23 + 0x30);
      *(undefined8 *)(unaff_x23 + 0xf0) = *(undefined8 *)(unaff_x23 + 0x28);
      uVar7 = in_stack_00000088 & 0xffffffffffffff00;
      uVar8 = in_stack_00000088;
      unaff_x21 = in_stack_00000090;
      uVar10 = uStack0000000000000080;
      goto LAB_0025e890;
    }
    if ((in_stack_00000018 < in_stack_00000010) &&
       (*(char *)(uStack0000000000000008 + in_stack_00000018) == '0')) {
      if (in_stack_00000018 + 1 < in_stack_00000010) {
        uVar14 = in_stack_00000018 + 2;
        bVar3 = *(byte *)(uStack0000000000000008 + in_stack_00000018 + 1);
        uVar8 = (ulong)(char)bVar3;
        if ((long)uVar8 < 0) {
          uVar10 = 0x8000000000000000;
          uVar8 = 0;
          if (0x82 < bVar3) {
            if (bVar3 == 0x83) {
              if ((uVar14 < in_stack_00000010) && (in_stack_00000018 + 3 < in_stack_00000010)) {
                if (in_stack_00000010 <= in_stack_00000018 + 4) {
code_r0x0025ece8:
                  uVar7 = 0;
                  uVar8 = uVar7;
                  goto LAB_0025e890;
                }
                pbVar2 = (byte *)(uStack0000000000000008 + uVar14);
                uVar7 = 0;
                uVar8 = 0;
                if (*pbVar2 == 0) goto LAB_0025e890;
                uVar14 = in_stack_00000018 + 5;
                uVar8 = (ulong)*pbVar2 << 0x10 |
                        (ulong)*(byte *)(uStack0000000000000008 + in_stack_00000018 + 3) << 8 |
                        (ulong)*(byte *)(uStack0000000000000008 + in_stack_00000018 + 4);
                goto LAB_0025ea48;
              }
            }
            else {
              uVar7 = 0;
              if (bVar3 != 0x84) goto LAB_0025e890;
              if (((uVar14 < in_stack_00000010) && (in_stack_00000018 + 3 < in_stack_00000010)) &&
                 (in_stack_00000018 + 4 < in_stack_00000010)) {
                if (in_stack_00000010 <= in_stack_00000018 + 5) goto code_r0x0025ece8;
                uVar7 = 0;
                uVar8 = 0;
                if (*(byte *)(uStack0000000000000008 + uVar14) == 0) goto LAB_0025e890;
                uVar8 = (ulong)*(byte *)(uStack0000000000000008 + uVar14) << 0x18 |
                        (ulong)*(byte *)(uStack0000000000000008 + in_stack_00000018 + 3) << 0x10 |
                        (ulong)*(byte *)(uStack0000000000000008 + in_stack_00000018 + 4) << 8 |
                        (ulong)*(byte *)(uStack0000000000000008 + in_stack_00000018 + 5);
                if (uVar8 != 0xffffffff) {
                  uVar14 = in_stack_00000018 + 6;
                  goto LAB_0025ea48;
                }
              }
            }
LAB_0025e850:
            uVar7 = 0;
            uVar8 = 0;
            goto LAB_0025e890;
          }
          if (bVar3 == 0x81) {
            if ((in_stack_00000010 <= uVar14) ||
               (-1 < (char)*(byte *)(uStack0000000000000008 + uVar14))) goto LAB_0025e850;
            uVar8 = (ulong)*(byte *)(uStack0000000000000008 + uVar14);
            uVar14 = in_stack_00000018 + 3;
          }
          else {
            uVar7 = 0;
            if (bVar3 != 0x82) goto LAB_0025e890;
            if (in_stack_00000010 <= uVar14) goto LAB_0025e850;
            if (in_stack_00000010 <= in_stack_00000018 + 3) goto code_r0x0025ece8;
            pcVar1 = (char *)(uStack0000000000000008 + uVar14);
            uVar7 = 0;
            uVar8 = 0;
            if (*pcVar1 == '\0') goto LAB_0025e890;
            uVar14 = in_stack_00000018 + 4;
            uVar8 = (ulong)CONCAT11(*pcVar1,*(undefined1 *)
                                             (uStack0000000000000008 + in_stack_00000018 + 3));
          }
        }
LAB_0025ea48:
        if ((!CARRY8(uVar14,uVar8)) && (uVar8 + uVar14 <= in_stack_00000010)) {
          in_stack_000000c0 = uStack0000000000000008 + uVar14;
          in_stack_00000018 = uVar8 + uVar14;
          goto code_r0x0025ea9c;
        }
      }
      uVar7 = 0;
      uVar8 = 0;
      uVar10 = 0x8000000000000000;
      goto LAB_0025e890;
    }
    uVar8 = 0;
    in_stack_000000c0 = 1;
code_r0x0025ea9c:
    uVar7 = unaff_x22[1];
    uStack0000000000000080 = *unaff_x22;
    uVar17 = unaff_x22[2];
    uVar14 = unaff_x22[5];
    uVar10 = unaff_x22[4];
    *(ulong *)(unaff_x23 + 0x18) = unaff_x22[3];
    *(ulong *)(unaff_x23 + 0x10) = uVar17;
    *(ulong *)(unaff_x23 + 0x28) = uVar14;
    *(ulong *)(unaff_x23 + 0x20) = uVar10;
    in_stack_000000b0 = uVar12;
    in_stack_000000b8 = unaff_x21;
    in_stack_000000d0 = 0;
    in_stack_000000e0 = in_stack_00000088;
    *(ulong *)(unaff_x29 + -0xa8) = unaff_x24 - 0x1a;
    in_stack_00000088 = uVar7;
    in_stack_000000c8 = uVar8;
    func_0x00262a20(unaff_x29 + -0xe0,&uStack0000000000000008,0xa0,unaff_x29 + -0xa8,
                    &uStack0000000000000080,0xffff);
    uVar10 = *(ulong *)(unaff_x29 + -0xe0);
    if (uVar10 != unaff_x24) {
      uVar8 = *(ulong *)(unaff_x29 + -0xd8);
      unaff_x21 = *(ulong *)(unaff_x29 + -0xd0);
      uVar7 = uVar8 & 0xffffffffffffff00;
      *(undefined8 *)(unaff_x23 + 0xe8) = *(undefined8 *)(unaff_x23 + 0x90);
      *(undefined8 *)(unaff_x23 + 0xe0) = *(undefined8 *)(unaff_x23 + 0x88);
      *(undefined8 *)(unaff_x23 + 0xf8) = *(undefined8 *)(unaff_x23 + 0xa0);
      *(undefined8 *)(unaff_x23 + 0xf0) = *(undefined8 *)(unaff_x23 + 0x98);
      goto LAB_0025e890;
    }
    *(undefined8 *)(unaff_x23 + 0xe8) = *(undefined8 *)(unaff_x23 + 0x28);
    *(undefined8 *)(unaff_x23 + 0xe0) = *(undefined8 *)(unaff_x23 + 0x20);
    *(undefined8 *)(unaff_x23 + 0xf8) = *(undefined8 *)(unaff_x23 + 0x38);
    *(undefined8 *)(unaff_x23 + 0xf0) = *(undefined8 *)(unaff_x23 + 0x30);
    in_stack_00000058 = in_stack_000000c8;
    in_stack_00000050 = in_stack_000000c0;
    in_stack_00000068 = in_stack_000000d8;
    in_stack_00000060 = in_stack_000000d0;
    in_stack_00000070 = in_stack_000000e0;
    uVar8 = in_stack_00000090;
    unaff_x21 = in_stack_00000098;
    uVar10 = in_stack_00000088;
    if (uStack0000000000000080 != 0) {
      in_stack_00000028 = in_stack_000000c8;
      in_stack_00000020 = in_stack_000000c0;
      in_stack_00000038 = in_stack_000000d8;
      in_stack_00000030 = in_stack_000000d0;
      in_stack_00000040 = in_stack_000000e0;
      if (in_stack_00000018 == in_stack_00000010) {
        uVar8 = *(ulong *)(unaff_x23 + 0xe0);
        uVar7 = *(ulong *)(unaff_x23 + 0xf8);
        uVar10 = *(ulong *)(unaff_x23 + 0xf0);
        unaff_x20[5] = *(ulong *)(unaff_x23 + 0xe8);
        unaff_x20[4] = uVar8;
        unaff_x20[7] = uVar7;
        unaff_x20[6] = uVar10;
        unaff_x20[9] = in_stack_000000c8;
        unaff_x20[8] = in_stack_000000c0;
        unaff_x20[0xb] = in_stack_000000d8;
        unaff_x20[10] = in_stack_000000d0;
        unaff_x20[0xc] = in_stack_000000e0;
        *unaff_x20 = uStack0000000000000080;
        unaff_x20[1] = in_stack_00000088;
        unaff_x20[2] = in_stack_00000090;
        unaff_x20[3] = in_stack_00000098;
        func_0x002219a8();
        return;
      }
      uVar8 = *unaff_x19;
      uVar7 = unaff_x19[3];
      uVar10 = unaff_x19[2];
      unaff_x20[2] = unaff_x19[1];
      unaff_x20[1] = uVar8;
      unaff_x20[4] = uVar7;
      unaff_x20[3] = uVar10;
      uVar8 = unaff_x19[4];
      unaff_x20[6] = unaff_x19[5];
      unaff_x20[5] = uVar8;
      unaff_x20[7] = unaff_x19[6];
      *unaff_x20 = 0;
      return;
    }
  }
  else {
    uVar13 = *(undefined8 *)(unaff_x23 + 0x20);
    uVar11 = *(undefined8 *)(unaff_x23 + 0x18);
    uVar16 = *(undefined8 *)(unaff_x23 + 0x30);
    uVar15 = *(undefined8 *)(unaff_x23 + 0x28);
    uVar8 = in_stack_00000088;
    uVar10 = uStack0000000000000080;
code_r0x0025e864:
    *(undefined8 *)(unaff_x23 + 0xe8) = uVar13;
    *(undefined8 *)(unaff_x23 + 0xe0) = uVar11;
    *(undefined8 *)(unaff_x23 + 0xf8) = uVar16;
    *(undefined8 *)(unaff_x23 + 0xf0) = uVar15;
  }
  uVar7 = uVar8 & 0xffffffffffffff00;
LAB_0025e890:
  uVar12 = *(ulong *)(unaff_x23 + 0xe0);
  uVar17 = *(ulong *)(unaff_x23 + 0xf8);
  uVar14 = *(ulong *)(unaff_x23 + 0xf0);
  unaff_x20[5] = *(ulong *)(unaff_x23 + 0xe8);
  unaff_x20[4] = uVar12;
  unaff_x20[7] = uVar17;
  unaff_x20[6] = uVar14;
  unaff_x20[2] = uVar7 | uVar8 & 0xff;
  unaff_x20[3] = unaff_x21;
  *unaff_x20 = 0;
  unaff_x20[1] = uVar10;
  uVar8 = *unaff_x19;
  if ((long)(unaff_x24 - 1) < (long)uVar8) {
    if ((((unaff_x19[3] & 1) == 0) && (uVar10 = unaff_x19[4], uVar10 != 0x8000000000000000)) &&
       (uVar10 != 0)) {
      func_0x00187bd4(unaff_x19[5],uVar10,1);
    }
    uVar10 = unaff_x19[1];
    uVar7 = unaff_x19[2];
    if (uVar7 != 0) {
      puVar9 = (undefined8 *)(uVar10 + 8);
      do {
        if (puVar9[-1] != 0) {
          func_0x00187bd4(*puVar9,puVar9[-1],1);
        }
        puVar9 = puVar9 + 3;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    if (uVar8 != 0) {
      func_0x00187bd4(uVar10,uVar8 * 0x18,8);
    }
  }
  return;
}

