
long FUN_005e0094(long param_1,uint param_2,long param_3,ulong param_4)

{
  long lVar1;
  long lVar2;
  undefined1 *puVar3;
  undefined2 uVar4;
  byte bVar5;
  byte *pbVar6;
  uint in_w8;
  ulong uVar7;
  undefined2 *puVar8;
  undefined2 *puVar9;
  int iVar10;
  int iVar11;
  uint uVar12;
  ulong in_x9;
  uint uVar13;
  ulong in_x10;
  undefined2 *puVar14;
  ulong in_x11;
  ulong uVar15;
  int in_w12;
  uint in_w13;
  int iVar16;
  ulong in_x14;
  ulong uVar17;
  ulong in_x15;
  ulong uVar18;
  ulong in_x16;
  int in_w17;
  ulong unaff_x20;
  uint uVar19;
  
  iVar11 = (int)in_x11;
  iVar10 = (int)in_x9;
  if ((uint)((in_x9 & 0xffffffff) / 10) < (uint)((param_4 & 0xffffffff) / 10)) {
    uVar19 = 0;
    if (param_2 < 0x22) goto LAB_005dff84;
LAB_005e0434:
    uVar17 = (ulong)in_w13;
    uVar18 = in_x9 & 0xffffffff;
    if ((uint)(uVar18 / 10) < in_w13 / 10) {
      iVar16 = 0;
      do {
        uVar15 = in_x11;
        uVar18 = uVar18 / 10;
        uVar17 = uVar17 / 10;
        iVar10 = (int)uVar18;
        uVar7 = uVar15 & 0xffffffff;
        in_x11 = uVar7 / 10;
        iVar11 = (int)in_x11;
        iVar16 = iVar16 + 1;
      } while ((uint)(uVar18 / 10) < (uint)(uVar17 / 10));
      uVar19 = (int)uVar15 + (int)(uVar7 / 10) * -10;
    }
    else {
      iVar16 = 0;
    }
    iVar16 = in_w8 + iVar16;
    uVar19 = iVar11 + (uint)(iVar11 == iVar10 || 4 < (uVar19 & 0xff));
    uVar17 = (ulong)uVar19;
    if (uVar19 < 100000000) goto LAB_005e03ac;
code_r0x005e04bc:
    uVar18 = 9;
  }
  else {
    uVar17 = *(long *)(param_3 + (ulong)(in_w8 - 1) * 0x10 + 8) + 1;
    uVar17 = ((uVar17 & 0xffffffff) * (in_x14 & 0xffffffff) >> 0x20) +
             (uVar17 >> 0x20) * (in_x14 & 0xffffffff) >>
             ((ulong)(in_w12 + ((in_w8 - 1) * in_w17 >> 0x13) + 0x1c) & 0x3f);
    uVar19 = (int)uVar17 + (int)((uVar17 & 0xffffffff) / 10) * -10;
    if (0x21 < param_2) goto LAB_005e0434;
LAB_005dff84:
    if (0x33333333 < (uint)((int)in_x14 * -0x33333333)) {
      if ((in_x10 & 1) == 0) {
        if ((uint)((int)in_x15 * -0x33333333) < 0x33333334) {
          uVar13 = 0;
          do {
            uVar17 = in_x15 & 0xffffffff;
            in_x15 = uVar17 / 5;
            uVar13 = uVar13 + 1;
          } while ((uint)((int)(uVar17 / 5) * -0x33333333) < 0x33333334);
        }
        else {
          uVar13 = 0;
        }
        if (in_w8 <= uVar13) {
          bVar5 = 0;
          uVar13 = 1;
          goto code_r0x005e0258;
        }
      }
      else {
        if ((uint)((int)in_x16 * -0x33333333) < 0x33333334) {
          uVar13 = 0;
          do {
            uVar17 = in_x16 & 0xffffffff;
            in_x16 = uVar17 / 5;
            uVar13 = uVar13 + 1;
          } while ((uint)((int)(uVar17 / 5) * -0x33333333) < 0x33333334);
        }
        else {
          uVar13 = 0;
        }
        in_w13 = in_w13 - (in_w8 <= uVar13);
      }
      goto LAB_005e0434;
    }
    uVar13 = 0;
    do {
      uVar17 = in_x14 & 0xffffffff;
      in_x14 = uVar17 / 5;
      uVar13 = uVar13 + 1;
    } while ((uint)((int)(uVar17 / 5) * -0x33333333) < 0x33333334);
    if (uVar13 < in_w8) goto LAB_005e0434;
    uVar13 = 0;
    bVar5 = 1;
code_r0x005e0258:
    uVar17 = (ulong)in_w13;
    if ((uint)((in_x9 & 0xffffffff) / 10) < in_w13 / 10) {
      iVar16 = 0;
      uVar18 = in_x9;
      uVar7 = in_x11;
      in_x9 = in_x9 & 0xffffffff;
      do {
        in_x9 = in_x9 / 10;
        uVar17 = uVar17 / 10;
        uVar13 = uVar13 & (int)in_x9 * -10 + (int)uVar18 == 0;
        bVar5 = bVar5 & (uVar19 & 0xff) == 0;
        in_x11 = (uVar7 & 0xffffffff) / 10;
        uVar19 = (int)uVar7 + (int)((uVar7 & 0xffffffff) / 10) * -10;
        iVar16 = iVar16 + 1;
        uVar18 = in_x9;
        uVar7 = in_x11;
      } while ((uint)(in_x9 / 10) < (uint)(uVar17 / 10));
    }
    else {
      iVar16 = 0;
    }
    iVar10 = (int)in_x9;
    uVar17 = in_x11;
    if (!(uVar13 == 0 || iVar10 + (int)((in_x9 & 0xffffffff) / 10) * -10 != 0)) {
      do {
        bVar5 = bVar5 & (uVar19 & 0xff) == 0;
        in_x11 = (uVar17 & 0xffffffff) / 10;
        uVar19 = (int)uVar17 + (int)((uVar17 & 0xffffffff) / 10) * -10;
        uVar17 = in_x9 & 0xffffffff;
        in_x9 = uVar17 / 10;
        iVar10 = (int)in_x9;
        iVar16 = iVar16 + 1;
        iVar11 = (int)(uVar17 / 10);
        uVar17 = in_x11;
      } while (((uint)(iVar11 * -0x33333333) >> 1 | iVar11 * -0x80000000) < 0x1999999a);
    }
    uVar12 = 4;
    if ((in_x11 & 1) != 0) {
      uVar12 = 5;
    }
    if (!(bool)(bVar5 & (uVar19 & 0xff) == 5)) {
      uVar12 = uVar19;
    }
    uVar19 = 0;
    if ((in_x10 & 1) == 0) {
      uVar19 = uVar13;
    }
    uVar19 = (uint)((int)in_x11 == iVar10) & (uVar19 ^ 1);
    if (4 < (uVar12 & 0xff)) {
      uVar19 = 1;
    }
    iVar16 = in_w8 + iVar16;
    uVar19 = (int)in_x11 + uVar19;
    uVar17 = (ulong)uVar19;
    if (99999999 < uVar19) goto code_r0x005e04bc;
LAB_005e03ac:
    uVar19 = (uint)uVar17;
    if (uVar19 < 10000000) {
      if (uVar19 < 1000000) {
        if (uVar19 >> 5 < 0xc35) {
          if (uVar19 >> 4 < 0x271) {
            if (uVar19 < 1000) {
              uVar13 = 1;
              if (9 < uVar19) {
                uVar13 = 2;
              }
              uVar12 = 3;
              if (uVar19 < 100) {
                uVar12 = uVar13;
              }
              uVar18 = (ulong)uVar12;
            }
            else {
              uVar18 = 4;
            }
          }
          else {
            uVar18 = 5;
          }
        }
        else {
          uVar18 = 6;
        }
      }
      else {
        uVar18 = 7;
      }
    }
    else {
      uVar18 = 8;
    }
  }
  lVar2 = uVar18 + (long)iVar16;
  uVar19 = (uint)uVar17;
  if ((iVar16 < 0) || (0xd < lVar2)) {
    uVar7 = lVar2 - 1;
    if (0xc < uVar7) {
      if (lVar2 + 5U < 6) {
        *(undefined2 *)(param_1 + unaff_x20) = 0x2e30;
        uVar7 = 2 - lVar2;
        if (lVar2 < 0) {
          uVar15 = uVar7;
          if (uVar7 < 4) {
            uVar15 = 3;
          }
          _memset(param_1 + unaff_x20 + 2,0x30,uVar15 - 2);
        }
        lVar2 = unaff_x20 + uVar18 + uVar7;
        puVar8 = (undefined2 *)(param_1 + lVar2);
        puVar9 = puVar8;
        if (0x270 < (uint)(uVar17 >> 4)) {
          do {
            uVar19 = (uint)(uVar17 / 10000);
            uVar12 = (uint)uVar17;
            uVar13 = uVar12 + (int)(uVar17 / 10000) * -10000;
            uVar4 = *(undefined2 *)(&UNK_008b6488 + (ulong)(uVar13 % 100) * 2);
            puVar9 = puVar8 + -2;
            *puVar9 = *(undefined2 *)(&UNK_008b6488 + ((ulong)uVar13 / 100) * 2);
            puVar8[-1] = uVar4;
            puVar8 = puVar9;
            uVar17 = uVar17 / 10000;
          } while (99999999 < uVar12);
        }
        uVar13 = uVar19;
        if (99 < uVar19) {
          uVar13 = (uVar19 >> 2 & 0x3fff) / 0x19;
          puVar9 = puVar9 + -1;
          *puVar9 = *(undefined2 *)(&UNK_008b6488 + ((ulong)(uVar19 + uVar13 * -100) & 0xffff) * 2);
        }
        if (uVar13 < 10) {
          *(byte *)((long)puVar9 + -1) = (byte)uVar13 | 0x30;
          return lVar2;
        }
        puVar9[-1] = *(undefined2 *)(&UNK_008b6488 + (ulong)uVar13 * 2);
        return lVar2;
      }
      if ((int)uVar18 == 1) {
        *(char *)(param_1 + unaff_x20) = (char)uVar17 + '0';
        ((char *)(param_1 + unaff_x20))[1] = 'e';
        uVar17 = unaff_x20 | 2;
      }
      else {
        puVar8 = (undefined2 *)(param_1 + unaff_x20 + uVar18 + 1);
        if (uVar19 >> 4 < 0x271) {
          puVar9 = puVar8;
        }
        else {
          puVar14 = puVar8;
          do {
            uVar19 = (uint)(uVar17 / 10000);
            uVar12 = (uint)uVar17;
            uVar13 = uVar12 + (int)(uVar17 / 10000) * -10000;
            uVar4 = *(undefined2 *)(&UNK_008b6488 + (ulong)(uVar13 % 100) * 2);
            puVar9 = puVar14 + -2;
            *puVar9 = *(undefined2 *)(&UNK_008b6488 + ((ulong)uVar13 / 100) * 2);
            puVar14[-1] = uVar4;
            puVar14 = puVar9;
            uVar17 = uVar17 / 10000;
          } while (99999999 < uVar12);
        }
        uVar13 = uVar19;
        if (99 < uVar19) {
          uVar13 = (uVar19 >> 2 & 0x3fff) / 0x19;
          puVar9 = puVar9 + -1;
          *puVar9 = *(undefined2 *)(&UNK_008b6488 + ((ulong)(uVar19 + uVar13 * -100) & 0xffff) * 2);
        }
        if (uVar13 < 10) {
          *(byte *)((long)puVar9 + -1) = (byte)uVar13 | 0x30;
        }
        else {
          puVar9[-1] = *(undefined2 *)(&UNK_008b6488 + (ulong)uVar13 * 2);
        }
        puVar3 = (undefined1 *)(param_1 + unaff_x20);
        *puVar3 = puVar3[1];
        puVar3[1] = 0x2e;
        *(undefined1 *)puVar8 = 0x65;
        uVar17 = unaff_x20 + uVar18 + 2;
      }
      pbVar6 = (byte *)(param_1 + uVar17);
      uVar18 = uVar7;
      if (lVar2 < 1) {
        *pbVar6 = 0x2d;
        uVar18 = 1 - lVar2;
        pbVar6 = pbVar6 + 1;
      }
      if (uVar18 < 10) {
        *pbVar6 = (byte)uVar18 | 0x30;
        return (1 - ((long)uVar7 >> 0x3f)) + uVar17;
      }
      *(undefined2 *)pbVar6 = *(undefined2 *)(&UNK_008b6488 + uVar18 * 2);
      return (uVar7 >> 0x3f | 2) + uVar17;
    }
    lVar1 = unaff_x20 + uVar18 + 1;
    puVar8 = (undefined2 *)(param_1 + lVar1);
    if ((uint)(uVar17 >> 4) < 0x271) {
      if (uVar19 < 100) goto LAB_005e0654;
    }
    else {
      do {
        uVar18 = uVar17;
        uVar19 = (uint)(uVar18 / 10000);
        uVar12 = (uint)(uVar18 / 10000);
        uVar13 = (uint)uVar18 + uVar12 * -10000;
        uVar4 = *(undefined2 *)(&UNK_008b6488 + (ulong)(uVar13 % 100) * 2);
        puVar9 = puVar8 + -2;
        *puVar9 = *(undefined2 *)(&UNK_008b6488 + ((ulong)uVar13 / 100) * 2);
        puVar8[-1] = uVar4;
        puVar8 = puVar9;
        uVar17 = uVar18 / 10000;
      } while (99999999 < (uint)uVar18);
      if (uVar12 < 99 || (int)(uVar18 / 10000) == 99) goto LAB_005e0654;
    }
    uVar13 = (uVar19 >> 2 & 0x3fff) / 0x19;
    puVar8 = puVar8 + -1;
    *puVar8 = *(undefined2 *)(&UNK_008b6488 + ((ulong)(uVar19 + uVar13 * -100) & 0xffff) * 2);
    uVar19 = uVar13;
LAB_005e0654:
    if (uVar19 < 10) {
      *(byte *)((long)puVar8 + -1) = (byte)uVar19 | 0x30;
    }
    else {
      puVar8[-1] = *(undefined2 *)(&UNK_008b6488 + (ulong)uVar19 * 2);
    }
    param_1 = param_1 + unaff_x20;
    _memmove(param_1,param_1 + 1,lVar2);
    *(undefined1 *)(param_1 + lVar2) = 0x2e;
    return lVar1;
  }
  puVar8 = (undefined2 *)(param_1 + unaff_x20 + uVar18);
  if ((uint)(uVar17 >> 4) < 0x271) {
    puVar9 = puVar8;
    if (uVar19 < 100) goto LAB_005e057c;
  }
  else {
    puVar14 = puVar8;
    do {
      uVar18 = uVar17;
      uVar19 = (uint)(uVar18 / 10000);
      uVar12 = (uint)(uVar18 / 10000);
      uVar13 = (uint)uVar18 + uVar12 * -10000;
      uVar4 = *(undefined2 *)(&UNK_008b6488 + (ulong)(uVar13 % 100) * 2);
      puVar9 = puVar14 + -2;
      *puVar9 = *(undefined2 *)(&UNK_008b6488 + ((ulong)uVar13 / 100) * 2);
      puVar14[-1] = uVar4;
      puVar14 = puVar9;
      uVar17 = uVar18 / 10000;
    } while (99999999 < (uint)uVar18);
    if (uVar12 < 99 || (int)(uVar18 / 10000) == 99) goto LAB_005e057c;
  }
  uVar13 = (uVar19 >> 2 & 0x3fff) / 0x19;
  puVar9[-1] = *(undefined2 *)(&UNK_008b6488 + ((ulong)(uVar19 + uVar13 * -100) & 0xffff) * 2);
  puVar9 = puVar9 + -1;
  uVar19 = uVar13;
LAB_005e057c:
  if (uVar19 < 10) {
    *(byte *)((long)puVar9 + -1) = (byte)uVar19 | 0x30;
  }
  else {
    puVar9[-1] = *(undefined2 *)(&UNK_008b6488 + (ulong)uVar19 * 2);
  }
  if (0 < iVar16) {
    _memset(puVar8,0x30);
  }
  *(undefined2 *)(param_1 + lVar2 + unaff_x20) = 0x302e;
  return lVar2 + unaff_x20 + 2;
}

