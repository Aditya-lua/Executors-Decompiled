
/* WARNING: Possible PIC construction at 0x00762eac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00763ea0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00762eb0) */
/* WARNING: Removing unreachable block (ram,0x00763ea4) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_00763118(long param_1,undefined8 param_2,long param_3)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  double dVar4;
  double *pdVar5;
  bool bVar6;
  int iVar7;
  int iVar8;
  undefined8 uVar9;
  char *in_x6;
  undefined1 uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  ulong uVar17;
  long lVar18;
  undefined1 uVar19;
  int iVar20;
  long lVar21;
  byte *pbVar22;
  double dVar23;
  byte *pbVar24;
  byte *pbVar25;
  byte bVar26;
  uint in_w12;
  uint uVar27;
  byte *pbVar28;
  undefined1 *unaff_x19;
  ulong unaff_x20;
  int iVar29;
  byte *unaff_x21;
  ulong uVar30;
  int unaff_w22;
  uint uVar31;
  ulong unaff_x23;
  byte *pbVar32;
  undefined1 *puVar33;
  byte *pbVar34;
  undefined1 *puVar35;
  char *pcVar36;
  long unaff_x24;
  ulong uVar37;
  undefined1 *puVar38;
  uint unaff_w25;
  ulong unaff_x26;
  ulong unaff_x27;
  undefined1 *unaff_x29;
  undefined *puVar39;
  double dVar40;
  undefined8 uVar41;
  double unaff_d8;
  undefined1 auVar42 [16];
  ulong in_stack_00000000;
  uint uStack0000000000000010;
  uint uStack0000000000000014;
  ulong in_stack_00000018;
  undefined1 *in_stack_00000020;
  byte *in_stack_00000028;
  byte *in_stack_00000030;
  byte *in_stack_00000038;
  undefined1 *in_stack_00000040;
  char *in_stack_00000048;
  ulong in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  byte bStack0000000000000088;
  byte abStack_7ffffffe [2];
  uint auStack_7ffffffc [536869231];
  double dStack_1a40;
  uint uStack_1a34;
  undefined1 *puStack_1a30;
  byte *pbStack_1a28;
  undefined1 *puStack_1a20;
  byte *pbStack_1a18;
  int iStack_1a0c;
  char *pcStack_1a08;
  byte *pbStack_1a00;
  undefined8 uStack_19f8;
  undefined8 uStack_19f0;
  undefined8 uStack_19e8;
  undefined8 uStack_19e0;
  undefined8 uStack_19d8;
  byte bStack_19c8;
  byte abStack_19c7 [323];
  byte abStack_1884 [4];
  uint auStack_1880 [2];
  double adStack_1878 [255];
  uint auStack_1080 [4];
  long alStack_1070 [510];
  long lStack_80;
  undefined1 auStack_78 [8];
  
code_r0x00763118:
  uStack0000000000000010 = in_w12;
  _memset(param_1,param_2,param_3);
  uVar37 = in_stack_00000018 & 0xffffffff;
  puVar33 = in_stack_00000040;
  pbVar32 = in_stack_00000038;
  pbVar34 = in_stack_00000030;
  pbVar22 = (byte *)(unaff_x24 + -1);
  pbVar28 = in_stack_00000028;
  puVar35 = in_stack_00000020;
  in_w12 = uStack0000000000000010;
  uVar11 = uStack0000000000000014;
code_r0x0076316c:
  iVar7 = unaff_w22 + -2;
  if ((uVar11 & in_w12) == 0) {
    iVar7 = unaff_w22;
  }
  iVar8 = (int)uVar37;
  if ((unaff_w25 & 3) != 0) {
    iVar8 = 1;
  }
  uVar31 = iVar7 - iVar8;
  uVar13 = uVar31;
  if ((unaff_w25 & 0x104) == 0) {
    uVar13 = uVar31 - 1;
    uVar30 = (ulong)uVar13;
    if (0 < (int)uVar31) {
      uVar17 = unaff_x26;
      if (unaff_x26 <= unaff_x23) {
        uVar17 = unaff_x23;
      }
      uVar2 = uVar30;
      if (uVar17 - unaff_x26 <= uVar30) {
        uVar2 = uVar17 - unaff_x26;
      }
      pbVar25 = unaff_x21;
      if (0xf < uVar2) {
        uVar30 = uVar2 + 1 & 0xf;
        uVar3 = 0x10;
        if (uVar30 != 0) {
          uVar3 = uVar30;
        }
        lVar18 = (uVar2 + 1) - uVar3;
        uVar30 = (ulong)(uVar13 - (int)lVar18);
        unaff_x20 = (ulong)(uint)((int)unaff_x20 + (int)lVar18);
        pbVar25 = unaff_x21 + lVar18;
        unaff_x26 = unaff_x26 + lVar18;
        do {
          unaff_x21[8] = 0x20;
          unaff_x21[9] = 0x20;
          unaff_x21[10] = 0x20;
          unaff_x21[0xb] = 0x20;
          unaff_x21[0xc] = 0x20;
          unaff_x21[0xd] = 0x20;
          unaff_x21[0xe] = 0x20;
          unaff_x21[0xf] = 0x20;
          unaff_x21[0] = 0x20;
          unaff_x21[1] = 0x20;
          unaff_x21[2] = 0x20;
          unaff_x21[3] = 0x20;
          unaff_x21[4] = 0x20;
          unaff_x21[5] = 0x20;
          unaff_x21[6] = 0x20;
          unaff_x21[7] = 0x20;
          lVar18 = lVar18 + -0x10;
          unaff_x21 = unaff_x21 + 0x10;
        } while (lVar18 != 0);
      }
      do {
        if (uVar17 == unaff_x26) goto joined_r0x00763a10;
        unaff_x21 = pbVar25 + 1;
        *pbVar25 = 0x20;
        unaff_x26 = unaff_x26 + 1;
        unaff_x20 = (ulong)((int)unaff_x20 + 1);
        iVar7 = (int)uVar30;
        uVar13 = iVar7 - 1;
        uVar30 = (ulong)uVar13;
        pbVar25 = unaff_x21;
      } while (0 < iVar7);
    }
  }
  uVar17 = unaff_x26;
  pbVar25 = unaff_x21;
  if ((int)uVar37 == 0) {
    if ((unaff_w25 >> 1 & 1) == 0) {
      if ((unaff_w25 & 1) == 0) goto LAB_00763258;
      if (unaff_x26 < unaff_x23) {
        bVar26 = 0x20;
        goto LAB_0076324c;
      }
    }
    else if (unaff_x26 < unaff_x23) {
      bVar26 = 0x2b;
      goto LAB_0076324c;
    }
joined_r0x00763a10:
    uVar37 = uVar17;
    if (unaff_x23 != 0) goto code_r0x00763a4c;
  }
  else {
    if (unaff_x23 <= unaff_x26) goto joined_r0x00763a10;
    bVar26 = 0x2d;
LAB_0076324c:
    *unaff_x21 = bVar26;
    unaff_x26 = unaff_x26 + 1;
    unaff_x20 = (ulong)((int)unaff_x20 + 1);
    unaff_x21 = unaff_x21 + 1;
LAB_00763258:
    if ((uVar11 & in_w12 & 1) == 0) {
LAB_00763298:
      if ((unaff_w25 & 0x104) == 0x100) {
        uVar11 = uVar13 - 1;
        uVar37 = (ulong)uVar11;
        bVar6 = 0 < (int)uVar13;
        uVar13 = uVar11;
        if (bVar6) {
          uVar17 = unaff_x26;
          if (unaff_x26 <= unaff_x23) {
            uVar17 = unaff_x23;
          }
          uVar30 = uVar37;
          if (uVar17 - unaff_x26 <= uVar37) {
            uVar30 = uVar17 - unaff_x26;
          }
          pbVar25 = unaff_x21;
          if (0xf < uVar30) {
            uVar37 = uVar30 + 1 & 0xf;
            uVar2 = 0x10;
            if (uVar37 != 0) {
              uVar2 = uVar37;
            }
            lVar18 = (uVar30 + 1) - uVar2;
            uVar37 = (ulong)(uVar11 - (int)lVar18);
            unaff_x20 = (ulong)(uint)((int)unaff_x20 + (int)lVar18);
            pbVar25 = unaff_x21 + lVar18;
            unaff_x26 = unaff_x26 + lVar18;
            do {
              unaff_x21[8] = 0x30;
              unaff_x21[9] = 0x30;
              unaff_x21[10] = 0x30;
              unaff_x21[0xb] = 0x30;
              unaff_x21[0xc] = 0x30;
              unaff_x21[0xd] = 0x30;
              unaff_x21[0xe] = 0x30;
              unaff_x21[0xf] = 0x30;
              unaff_x21[0] = 0x30;
              unaff_x21[1] = 0x30;
              unaff_x21[2] = 0x30;
              unaff_x21[3] = 0x30;
              unaff_x21[4] = 0x30;
              unaff_x21[5] = 0x30;
              unaff_x21[6] = 0x30;
              unaff_x21[7] = 0x30;
              lVar18 = lVar18 + -0x10;
              unaff_x21 = unaff_x21 + 0x10;
            } while (lVar18 != 0);
          }
          do {
            if (uVar17 == unaff_x26) goto joined_r0x00763a10;
            unaff_x21 = pbVar25 + 1;
            *pbVar25 = 0x30;
            unaff_x26 = unaff_x26 + 1;
            unaff_x20 = (ulong)((int)unaff_x20 + 1);
            iVar7 = (int)uVar37;
            uVar13 = iVar7 - 1;
            uVar37 = (ulong)uVar13;
            pbVar25 = unaff_x21;
          } while (0 < iVar7);
        }
      }
      if (pbVar22 + 1 <= pbVar28) {
        pbVar24 = pbVar22 + 1;
        uVar17 = unaff_x26;
        if (unaff_x26 <= unaff_x23) {
          uVar17 = unaff_x23;
        }
        uVar37 = unaff_x27 - (long)pbVar22;
        if (uVar17 - unaff_x26 <= unaff_x27 - (long)pbVar22) {
          uVar37 = uVar17 - unaff_x26;
        }
        uVar37 = uVar37 + 1;
        pbVar25 = unaff_x21;
        if (0x10 < uVar37 && (byte *)((long)&MACH_HEADER.filetype + 3) < unaff_x21 + ~(ulong)pbVar22
           ) {
          uVar30 = 0x10;
          if ((uVar37 & 0xf) != 0) {
            uVar30 = uVar37 & 0xf;
          }
          lVar18 = uVar37 - uVar30;
          pbVar22 = pbVar24 + lVar18;
          unaff_x20 = (ulong)(uint)((int)unaff_x20 + (int)lVar18);
          pbVar25 = unaff_x21 + lVar18;
          unaff_x26 = unaff_x26 + lVar18;
          do {
            uVar41 = *(undefined8 *)pbVar24;
            *(undefined8 *)(unaff_x21 + 8) = *(undefined8 *)(pbVar24 + 8);
            *(undefined8 *)unaff_x21 = uVar41;
            lVar18 = lVar18 + -0x10;
            pbVar24 = pbVar24 + 0x10;
            unaff_x21 = unaff_x21 + 0x10;
          } while (lVar18 != 0);
          pbVar24 = pbVar22;
        }
        do {
          if (uVar17 == unaff_x26) goto joined_r0x00763a10;
          pbVar22 = pbVar24 + 1;
          unaff_x21 = pbVar25 + 1;
          *pbVar25 = *pbVar24;
          unaff_x26 = unaff_x26 + 1;
          unaff_x20 = (ulong)((int)unaff_x20 + 1);
          pbVar24 = pbVar22;
          pbVar25 = unaff_x21;
        } while (pbVar22 != pbVar32);
      }
      pbVar22 = unaff_x21;
      if ((unaff_w25 >> 2 & 1) != 0) {
        if (0 < (int)uVar13) {
          uVar17 = unaff_x26;
          if (unaff_x26 <= unaff_x23) {
            uVar17 = unaff_x23;
          }
          uVar37 = (ulong)(uVar13 - 1);
          if (uVar17 - unaff_x26 <= (ulong)(uVar13 - 1)) {
            uVar37 = uVar17 - unaff_x26;
          }
          pbVar25 = unaff_x21;
          if (0xf < uVar37) {
            uVar30 = uVar37 + 1 & 0xf;
            uVar2 = 0x10;
            if (uVar30 != 0) {
              uVar2 = uVar30;
            }
            lVar18 = (uVar37 + 1) - uVar2;
            uVar13 = uVar13 - (int)lVar18;
            unaff_x20 = (ulong)(uint)((int)unaff_x20 + (int)lVar18);
            pbVar25 = unaff_x21 + lVar18;
            unaff_x26 = unaff_x26 + lVar18;
            do {
              unaff_x21[8] = 0x20;
              unaff_x21[9] = 0x20;
              unaff_x21[10] = 0x20;
              unaff_x21[0xb] = 0x20;
              unaff_x21[0xc] = 0x20;
              unaff_x21[0xd] = 0x20;
              unaff_x21[0xe] = 0x20;
              unaff_x21[0xf] = 0x20;
              unaff_x21[0] = 0x20;
              unaff_x21[1] = 0x20;
              unaff_x21[2] = 0x20;
              unaff_x21[3] = 0x20;
              unaff_x21[4] = 0x20;
              unaff_x21[5] = 0x20;
              unaff_x21[6] = 0x20;
              unaff_x21[7] = 0x20;
              lVar18 = lVar18 + -0x10;
              unaff_x21 = unaff_x21 + 0x10;
            } while (lVar18 != 0);
          }
          iVar7 = uVar13 + 1;
          do {
            if (uVar17 == unaff_x26) goto joined_r0x00763a10;
            pbVar22 = pbVar25 + 1;
            *pbVar25 = 0x20;
            unaff_x26 = unaff_x26 + 1;
            unaff_x20 = (ulong)((int)unaff_x20 + 1);
            iVar7 = iVar7 + -1;
            pbVar25 = pbVar22;
          } while (1 < iVar7);
        }
      }
LAB_00762b38:
      puVar35 = puVar35 + 1;
      pbVar25 = pbVar22;
      uVar17 = unaff_x26;
      if ((long)puVar35 < (long)in_stack_00000058._4_4_) {
        lVar18 = (long)puVar35 * 0x20;
        lVar21 = *(long *)(abStack_7ffffffe + lVar18 + 0x800009e6);
        unaff_w25 = *(uint *)(abStack_7ffffffe + lVar18 + 0x800009d6);
        unaff_x21 = pbVar22;
        if (lVar21 != 0) goto code_r0x00762b5c;
        goto code_r0x00762bac;
      }
      goto joined_r0x00763a10;
    }
    pbVar25 = unaff_x21;
    uVar17 = unaff_x26;
    if (unaff_x23 <= unaff_x26) goto joined_r0x00763a10;
    pbVar25 = unaff_x21 + 1;
    *unaff_x21 = 0x30;
    if (unaff_x26 + 1 < unaff_x23) {
      bVar26 = 0x78;
      if ((unaff_w25 & 0x1000) != 0) {
        bVar26 = 0x58;
      }
      unaff_x21[1] = bVar26;
      unaff_x21 = unaff_x21 + 2;
      unaff_x26 = unaff_x26 + 2;
      unaff_x20 = (ulong)((int)unaff_x20 + 2);
      goto LAB_00763298;
    }
    unaff_x20 = (ulong)((int)unaff_x20 + 1);
    uVar37 = unaff_x26 + 1;
code_r0x00763a4c:
    if (uVar37 == unaff_x23) {
      pbVar25[-1] = 0;
      unaff_x20 = (ulong)((int)unaff_x20 - 1);
    }
    else {
      *pbVar25 = 0;
    }
  }
  puVar35 = &bStack0000000000000088;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
    return unaff_x20;
  }
  ___stack_chk_fail();
  unaff_x29 = auStack_78 + 0x68;
  auVar42 = (*(code *)PTR____chkstk_darwin_009b01d8)();
  auVar42._8_8_ = auVar42._8_8_;
  uVar41 = auVar42._0_8_;
  pdVar5 = &dStack_1a40;
  lStack_80 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_19f8 = 0;
  uVar37 = func_0x0076489c(puVar35,auStack_1080,auStack_1880,(long)&uStack_19f8 + 4,&uStack_19f8,
                           pbVar32);
  if (((int)uVar37 != 0) || (uStack_19f8._4_4_ < 1)) goto code_r0x0076451c;
  lVar18 = 0;
  iVar7 = 0;
  pbStack_1a00 = abStack_1884;
  puStack_1a20 = (undefined1 *)((long)&uStack_19f0 + 1);
  puStack_1a30 = (undefined1 *)((long)&uStack_19f0 + 2);
  iStack_1a0c = (int)&bStack_19c8 + 0x144;
  pbStack_1a28 = abStack_19c7;
  pbStack_1a18 = abStack_1884;
  pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
  goto code_r0x00763be8;
code_r0x00762b5c:
  pbVar24 = *(byte **)(abStack_7ffffffe + lVar18 + 0x800009de);
  uVar37 = unaff_x26 + lVar21;
  iVar7 = (int)lVar21;
  iVar8 = (int)unaff_x20;
  if (unaff_x26 <= unaff_x23) {
    uVar17 = unaff_x23;
  }
  do {
    unaff_x21 = pbVar22;
    if (*pbVar24 == 0) goto code_r0x00762ba0;
    pbVar25 = pbVar22;
    if (uVar17 == unaff_x26) goto joined_r0x00763a10;
    unaff_x21 = pbVar22 + 1;
    *pbVar22 = *pbVar24;
    unaff_x26 = unaff_x26 + 1;
    pbVar24 = pbVar24 + 1;
    unaff_x20 = (ulong)((int)unaff_x20 + 1);
    lVar21 = lVar21 + -1;
    pbVar22 = unaff_x21;
  } while (lVar21 != 0);
  unaff_x20 = (ulong)(uint)(iVar8 + iVar7);
  unaff_x26 = uVar37;
code_r0x00762ba0:
  pbVar22 = unaff_x21;
  if ((abStack_7ffffffe[lVar18 + 0x800009d8] >> 4 & 1) != 0) goto LAB_00762b38;
code_r0x00762bac:
  uVar11 = *(uint *)(abStack_7ffffffe + lVar18 + 0x800009ce);
  uVar31 = unaff_w25;
  uVar13 = uVar11;
  if ((unaff_w25 >> 0xe & 1) == 0) {
joined_r0x00762ce4:
    uVar12 = unaff_w25 >> 0x10;
    unaff_w25 = uVar31;
    if ((uVar12 & 1) != 0) goto code_r0x00762bbc;
code_r0x00762bec:
    if ((unaff_w25 >> 0xf & 1) == 0) {
      uVar31 = 0xffffffff;
    }
    else {
      uVar31 = *(uint *)(abStack_7ffffffe + (long)puVar35 * 0x20 + 0x800009d2);
    }
  }
  else {
    uVar13 = *(uint *)(abStack_7ffffffe + (long)(int)uVar11 * 0x10 + 0x800001d6);
    if ((int)uVar13 < 0) {
      uVar12 = 0x7fffffff;
      if (uVar13 != 0x80000000) {
        uVar12 = -uVar13;
      }
      uVar31 = unaff_w25 & 0xfffffeff | 4;
      uVar13 = uVar12;
      goto joined_r0x00762ce4;
    }
    if ((unaff_w25 >> 0x10 & 1) == 0) goto code_r0x00762bec;
code_r0x00762bbc:
    uVar31 = *(uint *)(abStack_7ffffffe +
                      (long)*(int *)(abStack_7ffffffe + (long)puVar35 * 0x20 + 0x800009d2) * 0x10 +
                      0x800001d6);
    if ((int)uVar31 < 0) {
      uVar31 = 0xffffffff;
    }
  }
  uVar37 = (ulong)*(uint *)(abStack_7ffffffe + (long)puVar35 * 0x20 + 0x800009da);
  iVar7 = (int)unaff_x20;
  uVar12 = unaff_w25;
  unaff_x23 = in_stack_00000050;
  uVar17 = unaff_x26;
  pbVar24 = pbVar28;
  pbVar22 = unaff_x21;
  pbVar25 = unaff_x21;
  switch(*(undefined4 *)(abStack_7ffffffe + uVar37 * 0x10 + 0x800001ce)) {
  case 0:
    pcVar36 = *(char **)(abStack_7ffffffe + uVar37 * 0x10 + 0x800001d6);
    if ((byte *)pcVar36 == (byte *)0x0) {
      if (uVar31 != 0xffffffff && (int)uVar31 < 5) {
        uVar37 = 0;
        pcVar36 = "";
        goto code_r0x007637fc;
      }
      unaff_w25 = unaff_w25 & 0xfffffff7;
      uVar37 = 5;
      pcVar36 = "(nil)";
      uVar13 = uVar13 - 5;
    }
    else {
      if (uVar31 == 0xffffffff) {
        if (*pcVar36 == 0) {
          uVar37 = 0;
        }
        else {
          in_stack_00000018 = unaff_x27;
          in_stack_00000030 = pbVar34;
          in_stack_00000038 = pbVar32;
          uVar37 = _strlen(pcVar36);
          in_x6 = "0123456789abcdefghijklmnopqrstuvwxyz";
          pbVar32 = in_stack_00000038;
          unaff_x27 = in_stack_00000018;
          pbVar34 = in_stack_00000030;
        }
      }
      else {
        uVar37 = (ulong)(int)uVar31;
      }
code_r0x007637fc:
      uVar30 = uVar37;
      if (0x7ffffffe < uVar37) {
        uVar30 = 0x7fffffff;
      }
      if ((unaff_w25 >> 3 & 1) != 0) {
        unaff_x23 = in_stack_00000050;
        if (in_stack_00000050 <= unaff_x26) goto joined_r0x00763a10;
        bVar6 = false;
        *unaff_x21 = 0x22;
        unaff_x26 = unaff_x26 + 1;
        unaff_x20 = (ulong)(iVar7 + 1);
        uVar13 = uVar13 - (int)uVar30;
        unaff_x21 = unaff_x21 + 1;
        goto joined_r0x00763840;
      }
      uVar13 = uVar13 - (int)uVar30;
    }
    bVar6 = true;
joined_r0x00763840:
    unaff_x23 = in_stack_00000050;
    if ((unaff_w25 >> 2 & 1) == 0) {
      uVar11 = uVar13 - 1;
      uVar30 = (ulong)uVar11;
      bVar1 = 0 < (int)uVar13;
      uVar13 = uVar11;
      if (bVar1) {
        uVar17 = unaff_x26;
        if (unaff_x26 <= in_stack_00000050) {
          uVar17 = in_stack_00000050;
        }
        uVar2 = uVar30;
        if (uVar17 - unaff_x26 <= uVar30) {
          uVar2 = uVar17 - unaff_x26;
        }
        pbVar25 = unaff_x21;
        if (0xf < uVar2) {
          uVar30 = uVar2 + 1 & 0xf;
          uVar3 = 0x10;
          if (uVar30 != 0) {
            uVar3 = uVar30;
          }
          lVar18 = (uVar2 + 1) - uVar3;
          uVar30 = (ulong)(uVar11 - (int)lVar18);
          unaff_x20 = (ulong)(uint)((int)unaff_x20 + (int)lVar18);
          pbVar25 = unaff_x21 + lVar18;
          unaff_x26 = unaff_x26 + lVar18;
          do {
            unaff_x21[8] = 0x20;
            unaff_x21[9] = 0x20;
            unaff_x21[10] = 0x20;
            unaff_x21[0xb] = 0x20;
            unaff_x21[0xc] = 0x20;
            unaff_x21[0xd] = 0x20;
            unaff_x21[0xe] = 0x20;
            unaff_x21[0xf] = 0x20;
            unaff_x21[0] = 0x20;
            unaff_x21[1] = 0x20;
            unaff_x21[2] = 0x20;
            unaff_x21[3] = 0x20;
            unaff_x21[4] = 0x20;
            unaff_x21[5] = 0x20;
            unaff_x21[6] = 0x20;
            unaff_x21[7] = 0x20;
            lVar18 = lVar18 + -0x10;
            unaff_x21 = unaff_x21 + 0x10;
          } while (lVar18 != 0);
        }
        do {
          if (uVar17 == unaff_x26) goto joined_r0x00763a10;
          unaff_x21 = pbVar25 + 1;
          *pbVar25 = 0x20;
          unaff_x26 = unaff_x26 + 1;
          unaff_x20 = (ulong)((int)unaff_x20 + 1);
          iVar7 = (int)uVar30;
          uVar13 = iVar7 - 1;
          uVar30 = (ulong)uVar13;
          pbVar25 = unaff_x21;
        } while (0 < iVar7);
      }
    }
    pbVar24 = unaff_x21;
    if (uVar37 != 0) {
      uVar30 = uVar37 + unaff_x26;
      iVar7 = (int)uVar37;
      iVar8 = (int)unaff_x20;
      uVar17 = unaff_x26;
      if (unaff_x26 <= in_stack_00000050) {
        uVar17 = in_stack_00000050;
      }
      do {
        pbVar24 = unaff_x21;
        if (*pcVar36 == 0) goto code_r0x00763908;
        pbVar25 = unaff_x21;
        if (uVar17 == unaff_x26) goto joined_r0x00763a10;
        pbVar24 = unaff_x21 + 1;
        *unaff_x21 = *pcVar36;
        unaff_x26 = unaff_x26 + 1;
        pcVar36 = pcVar36 + 1;
        unaff_x20 = (ulong)((int)unaff_x20 + 1);
        uVar37 = uVar37 - 1;
        unaff_x21 = pbVar24;
      } while (uVar37 != 0);
      unaff_x20 = (ulong)(uint)(iVar8 + iVar7);
      unaff_x26 = uVar30;
    }
code_r0x00763908:
    if (((unaff_w25 >> 2 & 1) != 0) && (0 < (int)uVar13)) {
      uVar17 = unaff_x26;
      if (unaff_x26 <= in_stack_00000050) {
        uVar17 = in_stack_00000050;
      }
      uVar37 = (ulong)(uVar13 - 1);
      if (uVar17 - unaff_x26 <= (ulong)(uVar13 - 1)) {
        uVar37 = uVar17 - unaff_x26;
      }
      pbVar25 = pbVar24;
      if (0xf < uVar37) {
        uVar30 = uVar37 + 1 & 0xf;
        uVar2 = 0x10;
        if (uVar30 != 0) {
          uVar2 = uVar30;
        }
        lVar18 = (uVar37 + 1) - uVar2;
        uVar13 = uVar13 - (int)lVar18;
        unaff_x20 = (ulong)(uint)((int)unaff_x20 + (int)lVar18);
        pbVar25 = pbVar24 + lVar18;
        unaff_x26 = unaff_x26 + lVar18;
        do {
          pbVar24[8] = 0x20;
          pbVar24[9] = 0x20;
          pbVar24[10] = 0x20;
          pbVar24[0xb] = 0x20;
          pbVar24[0xc] = 0x20;
          pbVar24[0xd] = 0x20;
          pbVar24[0xe] = 0x20;
          pbVar24[0xf] = 0x20;
          pbVar24[0] = 0x20;
          pbVar24[1] = 0x20;
          pbVar24[2] = 0x20;
          pbVar24[3] = 0x20;
          pbVar24[4] = 0x20;
          pbVar24[5] = 0x20;
          pbVar24[6] = 0x20;
          pbVar24[7] = 0x20;
          lVar18 = lVar18 + -0x10;
          pbVar24 = pbVar24 + 0x10;
        } while (lVar18 != 0);
      }
      iVar7 = uVar13 + 1;
      do {
        if (uVar17 == unaff_x26) goto joined_r0x00763a10;
        pbVar24 = pbVar25 + 1;
        *pbVar25 = 0x20;
        unaff_x26 = unaff_x26 + 1;
        unaff_x20 = (ulong)((int)unaff_x20 + 1);
        iVar7 = iVar7 + -1;
        pbVar25 = pbVar24;
      } while (1 < iVar7);
    }
    pbVar22 = pbVar24;
    if (!bVar6) {
      pbVar25 = pbVar24;
      uVar17 = unaff_x26;
      if (in_stack_00000050 <= unaff_x26) goto joined_r0x00763a10;
      pbVar22 = pbVar24 + 1;
      *pbVar24 = 0x22;
      unaff_x26 = unaff_x26 + 1;
      unaff_x20 = (ulong)((int)unaff_x20 + 1);
    }
    goto LAB_00762b38;
  case 1:
    uVar30 = *(ulong *)(abStack_7ffffffe + uVar37 * 0x10 + 0x800001d6);
    if (uVar30 != 0) {
      uVar15 = 0;
      in_stack_00000048 = in_x6;
      if ((unaff_w25 & 0x1000) != 0) {
        in_stack_00000048 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      }
      uVar11 = 1;
      uVar37 = 0x10;
      in_w12 = 1;
      goto code_r0x00762f3c;
    }
    uVar30 = unaff_x26;
    if ((unaff_w25 >> 2 & 1) == 0) {
      uVar11 = uVar13 - 5;
    }
    else {
      uVar11 = uVar13 - 6;
      uVar37 = (ulong)uVar11;
      if (5 < (int)uVar13) {
        if (unaff_x26 <= in_stack_00000050) {
          uVar17 = in_stack_00000050;
        }
        uVar2 = uVar37;
        if (uVar17 - unaff_x26 <= uVar37) {
          uVar2 = uVar17 - unaff_x26;
        }
        if (0xf < uVar2) {
          uVar37 = uVar2 + 1 & 0xf;
          uVar30 = 0x10;
          if (uVar37 != 0) {
            uVar30 = uVar37;
          }
          lVar18 = (uVar2 + 1) - uVar30;
          uVar37 = (ulong)(uVar11 - (int)lVar18);
          unaff_x20 = (ulong)(uint)(iVar7 + (int)lVar18);
          pbVar25 = unaff_x21 + lVar18;
          uVar30 = unaff_x26 + lVar18;
          do {
            unaff_x21[8] = 0x20;
            unaff_x21[9] = 0x20;
            unaff_x21[10] = 0x20;
            unaff_x21[0xb] = 0x20;
            unaff_x21[0xc] = 0x20;
            unaff_x21[0xd] = 0x20;
            unaff_x21[0xe] = 0x20;
            unaff_x21[0xf] = 0x20;
            unaff_x21[0] = 0x20;
            unaff_x21[1] = 0x20;
            unaff_x21[2] = 0x20;
            unaff_x21[3] = 0x20;
            unaff_x21[4] = 0x20;
            unaff_x21[5] = 0x20;
            unaff_x21[6] = 0x20;
            unaff_x21[7] = 0x20;
            lVar18 = lVar18 + -0x10;
            unaff_x21 = unaff_x21 + 0x10;
          } while (lVar18 != 0);
        }
        do {
          if (uVar17 == uVar30) goto joined_r0x00763a10;
          unaff_x21 = pbVar25 + 1;
          *pbVar25 = 0x20;
          uVar30 = uVar30 + 1;
          unaff_x20 = (ulong)((int)unaff_x20 + 1);
          iVar7 = (int)uVar37;
          uVar11 = iVar7 - 1;
          uVar37 = (ulong)uVar11;
          pbVar25 = unaff_x21;
        } while (0 < iVar7);
      }
    }
    uVar37 = uVar30;
    if (uVar30 <= in_stack_00000050) {
      uVar37 = in_stack_00000050;
    }
    pbVar25 = unaff_x21;
    uVar17 = uVar30;
    if (in_stack_00000050 <= uVar30) goto joined_r0x00763a10;
    pbVar25 = unaff_x21 + 1;
    *unaff_x21 = 0x28;
    if (uVar30 + 1 == uVar37) {
      iVar7 = 1;
    }
    else {
      unaff_x21[1] = 0x6e;
      if (uVar30 + 2 == uVar37) {
        pbVar25 = unaff_x21 + 2;
        iVar7 = 2;
      }
      else {
        unaff_x21[2] = 0x69;
        if (uVar30 + 3 == uVar37) {
          pbVar25 = unaff_x21 + 3;
          iVar7 = 3;
        }
        else {
          unaff_x21[3] = 0x6c;
          if (uVar30 + 4 != uVar37) {
            pbVar22 = unaff_x21 + 5;
            unaff_x21[4] = 0x29;
            unaff_x26 = uVar30 + 5;
            uVar13 = (int)unaff_x20 + 5;
            unaff_x20 = (ulong)uVar13;
            if (((unaff_w25 >> 2 & 1) == 0) && (0 < (int)uVar11)) {
              uVar37 = in_stack_00000050;
              if (in_stack_00000050 <= unaff_x26) {
                uVar37 = unaff_x26;
              }
              uVar30 = (uVar37 - uVar30) - 5;
              uVar37 = (ulong)(uVar11 - 1);
              if (uVar30 <= uVar11 - 1) {
                uVar37 = uVar30;
              }
              if (uVar37 < 0x10) {
                pbVar25 = pbVar22;
              }
              else {
                uVar30 = uVar37 + 1 & 0xf;
                uVar17 = 0x10;
                if (uVar30 != 0) {
                  uVar17 = uVar30;
                }
                lVar18 = (uVar37 + 1) - uVar17;
                uVar11 = uVar11 - (int)lVar18;
                unaff_x20 = (ulong)(uVar13 + (int)lVar18);
                pbVar25 = pbVar22 + lVar18;
                unaff_x26 = unaff_x26 + lVar18;
                do {
                  pbVar22[8] = 0x20;
                  pbVar22[9] = 0x20;
                  pbVar22[10] = 0x20;
                  pbVar22[0xb] = 0x20;
                  pbVar22[0xc] = 0x20;
                  pbVar22[0xd] = 0x20;
                  pbVar22[0xe] = 0x20;
                  pbVar22[0xf] = 0x20;
                  pbVar22[0] = 0x20;
                  pbVar22[1] = 0x20;
                  pbVar22[2] = 0x20;
                  pbVar22[3] = 0x20;
                  pbVar22[4] = 0x20;
                  pbVar22[5] = 0x20;
                  pbVar22[6] = 0x20;
                  pbVar22[7] = 0x20;
                  lVar18 = lVar18 + -0x10;
                  pbVar22 = pbVar22 + 0x10;
                } while (lVar18 != 0);
              }
              iVar7 = uVar11 + 1;
              do {
                uVar17 = unaff_x26;
                if (in_stack_00000050 <= unaff_x26) goto joined_r0x00763a10;
                pbVar22 = pbVar25 + 1;
                *pbVar25 = 0x20;
                unaff_x26 = unaff_x26 + 1;
                unaff_x20 = (ulong)((int)unaff_x20 + 1);
                iVar7 = iVar7 + -1;
                pbVar25 = pbVar22;
              } while (1 < iVar7);
            }
            else {
            }
            goto LAB_00762b38;
          }
          pbVar25 = unaff_x21 + 4;
          iVar7 = 4;
        }
      }
    }
    unaff_x20 = (ulong)(uint)((int)unaff_x20 + iVar7);
    goto code_r0x00763a4c;
  case 2:
    if ((unaff_w25 >> 6 & 1) == 0) {
      if ((unaff_w25 >> 5 & 1) == 0) {
        if ((unaff_w25 >> 4 & 1) == 0) {
          **(int **)(abStack_7ffffffe + uVar37 * 0x10 + 0x800001d6) = iVar7;
        }
        else {
          **(undefined2 **)(abStack_7ffffffe + uVar37 * 0x10 + 0x800001d6) = (short)unaff_x20;
        }
      }
      else {
        **(long **)(abStack_7ffffffe + uVar37 * 0x10 + 0x800001d6) = (long)iVar7;
      }
      goto LAB_00762b38;
    }
    **(long **)(abStack_7ffffffe + uVar37 * 0x10 + 0x800001d6) = (long)iVar7;
  default:
    goto LAB_00762b38;
  case 3:
  case 4:
  case 5:
    break;
  case 6:
  case 7:
  case 8:
    uVar12 = unaff_w25 | 0x200;
    break;
  case 9:
    in_stack_00000068 = _UNK_008cd86b;
    uStack0000000000000060 = _UNK_008cd863;
    in_stack_00000078 = _UNK_008cd87b;
    in_stack_00000070 = _UNK_008cd873;
    in_stack_00000018 = unaff_x27;
    in_stack_00000020 = unaff_x19;
    in_stack_00000028 = pbVar28;
    in_stack_00000030 = pbVar34;
    in_stack_00000038 = pbVar32;
    in_stack_00000040 = puVar33;
    lVar18 = _strlen(&uStack0000000000000060);
    unaff_x23 = in_stack_00000050;
    if ((unaff_w25 & 0x2000) != 0) {
      uVar13 = uVar11;
    }
    if ((unaff_w25 >> 0xf & 1) != 0) {
      uVar31 = *(uint *)(abStack_7ffffffe + (long)puVar35 * 0x20 + 0x800009d2);
    }
    puVar33 = in_stack_00000020;
    if ((unaff_w25 >> 2 & 1) != 0) {
      uStack0000000000000060._0_2_ = CONCAT11(0x2d,(undefined1)uStack0000000000000060);
      puVar33 = in_stack_00000040;
    }
    if ((unaff_w25 >> 1 & 1) != 0) {
      *puVar33 = 0x2b;
      puVar33 = puVar33 + 1;
    }
    if ((unaff_w25 & 1) != 0) {
      *puVar33 = 0x20;
      puVar33 = puVar33 + 1;
    }
    if ((unaff_w25 >> 3 & 1) == 0) {
      *puVar33 = 0;
    }
    else {
      *puVar33 = 0x23;
      puVar33[1] = 0;
      puVar33 = puVar33 + 1;
    }
    if (-1 < (int)uVar13) {
      auVar42._8_8_ = 0x20 - lVar18;
      auVar42._0_8_ = puVar33;
      if (0x144 < (int)uVar13) {
        uVar13 = 0x145;
      }
      in_stack_00000000 = (ulong)uVar13;
      puVar39 = &UNK_00762eb0;
      pdVar5 = (double *)register0x00000008;
      goto code_r0x00764560;
    }
    if (-1 < (int)uVar31) {
      dVar40 = *(double *)(abStack_7ffffffe + uVar37 * 0x10 + 0x800001d6);
      uVar11 = 0x144;
      if (uVar31 < 0x146) {
        uVar11 = uVar31;
      }
      iVar7 = 0x145;
      if ((int)uVar11 <= (int)uVar13 && 0 < (int)uVar13) {
        iVar7 = 0x145 - uVar13;
      }
      for (; unaff_d8 <= dVar40; dVar40 = dVar40 / unaff_d8) {
        iVar7 = iVar7 + -1;
      }
      uVar13 = iVar7 - 1;
      if ((int)uVar11 <= iVar7) {
        uVar13 = uVar11;
      }
      in_stack_00000000 = (ulong)(uVar13 & ((int)uVar13 >> 0x1f ^ 0xffffffffU));
      iVar7 = func_0x00764560(puVar33,0x20 - lVar18,".%d");
      puVar33 = puVar33 + iVar7;
    }
    puVar38 = puVar33;
    if ((unaff_w25 >> 5 & 1) != 0) {
      puVar38 = puVar33 + 1;
      *puVar33 = 0x6c;
    }
    if ((unaff_w25 >> 0x12 & 1) == 0) {
      uVar10 = 0x67;
      if ((unaff_w25 & 0x1000) != 0) {
        uVar10 = 0x47;
      }
      uVar11 = unaff_w25 & 0x80000;
      uVar19 = 0x66;
    }
    else {
      uVar11 = unaff_w25 & 0x1000;
      uVar10 = 0x45;
      uVar19 = 0x65;
    }
    if (uVar11 != 0) {
      uVar19 = uVar10;
    }
    *puVar38 = uVar19;
    puVar38[1] = 0;
    in_stack_00000000 = *(ulong *)(abStack_7ffffffe + uVar37 * 0x10 + 0x800001d6);
    _snprintf(&bStack0000000000000088,0x146,&uStack0000000000000060);
    puVar33 = in_stack_00000040;
    pbVar32 = in_stack_00000038;
    unaff_x27 = in_stack_00000018;
    pbVar34 = in_stack_00000030;
    pbVar28 = in_stack_00000028;
    unaff_x19 = in_stack_00000020;
    if (bStack0000000000000088 == 0) {
      in_x6 = "0123456789abcdefghijklmnopqrstuvwxyz";
    }
    else {
      if (unaff_x26 <= unaff_x23) {
        uVar17 = unaff_x23;
      }
      in_x6 = "0123456789abcdefghijklmnopqrstuvwxyz";
      pbVar24 = in_stack_00000030;
      bVar26 = bStack0000000000000088;
      do {
        pbVar25 = unaff_x21;
        if (uVar17 == unaff_x26) goto joined_r0x00763a10;
        pbVar22 = unaff_x21 + 1;
        *unaff_x21 = bVar26;
        unaff_x26 = unaff_x26 + 1;
        unaff_x20 = (ulong)((int)unaff_x20 + 1);
        bVar26 = *pbVar24;
        pbVar24 = pbVar24 + 1;
        unaff_x21 = pbVar22;
      } while (bVar26 != 0);
    }
    goto LAB_00762b38;
  }
  uVar30 = *(ulong *)(abStack_7ffffffe + uVar37 * 0x10 + 0x800001d6);
  if ((uVar12 >> 0x11 & 1) != 0) {
    uVar37 = unaff_x26;
    if ((uVar12 >> 2 & 1) == 0) {
      uVar11 = uVar13 - 1;
      uVar31 = uVar13 - 2;
      bVar6 = 1 < (int)uVar13;
      uVar13 = uVar11;
      if (bVar6) {
        if (unaff_x26 <= in_stack_00000050) {
          uVar17 = in_stack_00000050;
        }
        uVar37 = (ulong)uVar31;
        if (uVar17 - unaff_x26 <= (ulong)uVar31) {
          uVar37 = uVar17 - unaff_x26;
        }
        if (0xf < uVar37) {
          uVar2 = uVar37 + 1 & 0xf;
          uVar3 = 0x10;
          if (uVar2 != 0) {
            uVar3 = uVar2;
          }
          lVar18 = (uVar37 + 1) - uVar3;
          uVar11 = uVar11 - (int)lVar18;
          unaff_x20 = (ulong)(uint)(iVar7 + (int)lVar18);
          pbVar25 = unaff_x21 + lVar18;
          unaff_x26 = unaff_x26 + lVar18;
          do {
            unaff_x21[8] = 0x20;
            unaff_x21[9] = 0x20;
            unaff_x21[10] = 0x20;
            unaff_x21[0xb] = 0x20;
            unaff_x21[0xc] = 0x20;
            unaff_x21[0xd] = 0x20;
            unaff_x21[0xe] = 0x20;
            unaff_x21[0xf] = 0x20;
            unaff_x21[0] = 0x20;
            unaff_x21[1] = 0x20;
            unaff_x21[2] = 0x20;
            unaff_x21[3] = 0x20;
            unaff_x21[4] = 0x20;
            unaff_x21[5] = 0x20;
            unaff_x21[6] = 0x20;
            unaff_x21[7] = 0x20;
            lVar18 = lVar18 + -0x10;
            unaff_x21 = unaff_x21 + 0x10;
          } while (lVar18 != 0);
        }
        do {
          if (uVar17 == unaff_x26) goto joined_r0x00763a10;
          unaff_x21 = pbVar25 + 1;
          *pbVar25 = 0x20;
          unaff_x26 = unaff_x26 + 1;
          unaff_x20 = (ulong)((int)unaff_x20 + 1);
          uVar13 = uVar11 - 1;
          bVar6 = 0 < (int)uVar11;
          pbVar25 = unaff_x21;
          uVar37 = unaff_x26;
          uVar11 = uVar13;
        } while (uVar13 != 0 && bVar6);
      }
    }
    pbVar25 = unaff_x21;
    uVar17 = uVar37;
    if (in_stack_00000050 <= uVar37) goto joined_r0x00763a10;
    pbVar22 = unaff_x21 + 1;
    *unaff_x21 = (byte)uVar30;
    unaff_x26 = uVar37 + 1;
    uVar11 = (int)unaff_x20 + 1;
    unaff_x20 = (ulong)uVar11;
    if (((uVar12 >> 2 & 1) == 0) || ((int)uVar13 < 2)) {
    }
    else {
      uVar30 = (ulong)(uVar13 - 2);
      if (~uVar37 + in_stack_00000050 <= (ulong)(uVar13 - 2)) {
        uVar30 = ~uVar37 + in_stack_00000050;
      }
      pbVar25 = pbVar22;
      if (0xf < uVar30) {
        uVar37 = uVar30 + 1 & 0xf;
        uVar17 = 0x10;
        if (uVar37 != 0) {
          uVar17 = uVar37;
        }
        lVar18 = (uVar30 + 1) - uVar17;
        uVar13 = uVar13 - (int)lVar18;
        unaff_x20 = (ulong)(uVar11 + (int)lVar18);
        pbVar25 = pbVar22 + lVar18;
        unaff_x26 = unaff_x26 + lVar18;
        do {
          pbVar22[8] = 0x20;
          pbVar22[9] = 0x20;
          pbVar22[10] = 0x20;
          pbVar22[0xb] = 0x20;
          pbVar22[0xc] = 0x20;
          pbVar22[0xd] = 0x20;
          pbVar22[0xe] = 0x20;
          pbVar22[0xf] = 0x20;
          pbVar22[0] = 0x20;
          pbVar22[1] = 0x20;
          pbVar22[2] = 0x20;
          pbVar22[3] = 0x20;
          pbVar22[4] = 0x20;
          pbVar22[5] = 0x20;
          pbVar22[6] = 0x20;
          pbVar22[7] = 0x20;
          lVar18 = lVar18 + -0x10;
          pbVar22 = pbVar22 + 0x10;
        } while (lVar18 != 0);
      }
      iVar7 = uVar13 + 1;
      do {
        if (in_stack_00000050 == unaff_x26) {
          uVar37 = in_stack_00000050;
          goto code_r0x00763a4c;
        }
        pbVar22 = pbVar25 + 1;
        *pbVar25 = 0x20;
        unaff_x26 = unaff_x26 + 1;
        unaff_x20 = (ulong)((int)unaff_x20 + 1);
        iVar7 = iVar7 + -1;
        pbVar25 = pbVar22;
      } while (2 < iVar7);
    }
    goto LAB_00762b38;
  }
  if ((uVar12 >> 10 & 1) == 0) {
    if ((uVar12 >> 0xb & 1) == 0) {
      uVar17 = -uVar30;
      if (-1 < (long)uVar30) {
        uVar17 = uVar30;
      }
      uVar11 = 0;
      if (-1 >= (long)uVar30) {
        uVar11 = (uint)((uVar12 & 0x200) == 0);
      }
      uVar37 = (ulong)uVar11;
      if ((uVar12 & 0x200) != 0) {
        uVar17 = uVar30;
      }
      if (uVar31 == 0xffffffff) {
        uVar31 = 1;
      }
      if (uVar17 != 0) {
        pbVar22 = pbVar28;
        do {
          pbVar24 = pbVar22 + -1;
          *pbVar22 = (char)uVar17 + (char)(uVar17 / 10) * -10 | 0x30;
          bVar6 = 9 < uVar17;
          pbVar22 = pbVar24;
          uVar17 = uVar17 / 10;
        } while (bVar6);
      }
      uVar11 = 0;
      in_w12 = unaff_w25 >> 3 & 1;
      iVar7 = (int)pbVar28 - (int)pbVar24;
      unaff_w22 = uVar13 - iVar7;
      iVar7 = uVar31 - iVar7;
      unaff_w25 = uVar12;
      goto code_r0x007630c4;
    }
    uVar15 = 0;
    in_stack_00000048 = in_x6;
    if ((uVar12 & 0x1000) != 0) {
      in_stack_00000048 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }
    in_w12 = unaff_w25 >> 3 & 1;
    uVar11 = 1;
    uVar37 = 0x10;
    unaff_w25 = uVar12;
  }
  else {
    uVar11 = 0;
    in_w12 = unaff_w25 >> 3 & 1;
    uVar15 = 1;
    uVar37 = 8;
    unaff_w25 = uVar12;
  }
code_r0x00762f3c:
  if (uVar31 == 0xffffffff) {
    uVar31 = 1;
  }
  if (uVar30 != 0) {
    pbVar22 = pbVar28;
    do {
      pbVar24 = pbVar22 + -1;
      *pbVar22 = in_stack_00000048[uVar30 & uVar37 - 1];
      uVar17 = 0;
      if (uVar37 != 0) {
        uVar17 = uVar30 / uVar37;
      }
      bVar6 = uVar37 <= uVar30;
      pbVar22 = pbVar24;
      uVar30 = uVar17;
    } while (bVar6);
  }
  uVar37 = 0;
  iVar7 = (int)pbVar28 - (int)pbVar24;
  unaff_w22 = uVar13 - iVar7;
  iVar7 = uVar31 - iVar7;
  if (((uVar15 & in_w12) == 1) && (iVar7 < 1)) {
    uVar37 = 0;
    pbVar22 = pbVar24 + -1;
    *pbVar24 = 0x30;
    unaff_w22 = unaff_w22 + -1;
    goto code_r0x0076316c;
  }
code_r0x007630c4:
  pbVar22 = pbVar24;
  if ((iVar7 < 1) || (unaff_w22 = unaff_w22 - iVar7, pbVar24 < &bStack0000000000000088))
  goto code_r0x0076316c;
  uVar17 = (ulong)(((uVar31 - (int)&bStack0000000000000088) + (int)pbVar24) - 0x145);
  uVar30 = (long)pbVar24 - (long)&bStack0000000000000088;
  if (uVar17 <= uVar30) {
    uVar30 = uVar17;
  }
  in_stack_00000018 = CONCAT44(in_stack_00000018._4_4_,(int)uVar37);
  param_1 = (long)pbVar24 - uVar30;
  param_3 = uVar30 + 1;
  param_2 = 0x30;
  unaff_x24 = param_1;
  uStack0000000000000014 = uVar11;
  in_stack_00000020 = puVar35;
  in_stack_00000028 = pbVar28;
  in_stack_00000030 = pbVar34;
  in_stack_00000038 = pbVar32;
  in_stack_00000040 = puVar33;
  goto code_r0x00763118;
code_r0x00763be8:
  do {
    lVar21 = alStack_1070[lVar18 * 4 + 1];
    uVar11 = auStack_1080[lVar18 * 8 + 2];
    if (lVar21 != 0) {
      pbVar32 = (byte *)alStack_1070[lVar18 * 4];
      iVar8 = iVar7 + (int)lVar21;
      do {
        uVar37 = (ulong)*pbVar32;
        if (*pbVar32 == 0) goto code_r0x00763c2c;
        uVar37 = (*auVar42._8_8_)(uVar37,uVar41);
        if ((int)uVar37 != 0) goto code_r0x0076451c;
        pbVar32 = pbVar32 + 1;
        iVar7 = iVar7 + 1;
        lVar21 = lVar21 + -1;
      } while (lVar21 != 0);
      iVar7 = iVar8;
code_r0x00763c2c:
      if ((uVar11 >> 0x14 & 1) == 0) goto code_r0x00763c34;
      goto code_r0x00763bd8;
    }
code_r0x00763c34:
    uVar31 = auStack_1080[lVar18 * 8];
    uVar12 = uVar11;
    uVar13 = uVar31;
    if ((uVar11 >> 0xe & 1) == 0) {
joined_r0x00763da0:
      uVar15 = uVar11 >> 0x10;
      uVar11 = uVar12;
      if ((uVar15 & 1) != 0) goto code_r0x00763c48;
code_r0x00763c78:
      if ((uVar11 >> 0xf & 1) == 0) {
        uVar12 = 0xffffffff;
      }
      else {
        uVar12 = auStack_1080[lVar18 * 8 + 1];
      }
    }
    else {
      uVar13 = *(uint *)(adStack_1878 + (long)(int)uVar31 * 2);
      if ((int)uVar13 < 0) {
        uVar15 = 0x7fffffff;
        if (uVar13 != 0x80000000) {
          uVar15 = -uVar13;
        }
        uVar12 = uVar11 & 0xfffffeff | 4;
        uVar13 = uVar15;
        goto joined_r0x00763da0;
      }
      if ((uVar11 >> 0x10 & 1) == 0) goto code_r0x00763c78;
code_r0x00763c48:
      uVar12 = *(uint *)(adStack_1878 + (long)(int)auStack_1080[lVar18 * 8 + 1] * 2);
      if ((int)uVar12 < 0) {
        uVar12 = 0xffffffff;
      }
    }
    uVar30 = (ulong)auStack_1080[lVar18 * 8 + 3];
    uVar15 = uVar11;
    pbVar32 = pbStack_1a00;
    switch(auStack_1880[uVar30 * 4]) {
    case 0:
      pcVar36 = (char *)adStack_1878[uVar30 * 2];
      if ((byte *)pcVar36 == (byte *)0x0) {
        if (uVar12 != 0xffffffff && (int)uVar12 < 5) {
          uVar30 = 0;
          pcVar36 = "";
          goto code_r0x00764424;
        }
        uVar11 = uVar11 & 0xfffffff7;
        uVar30 = 5;
        iVar20 = 5;
        pcVar36 = "(nil)";
        iVar8 = uVar13 - 5;
joined_r0x00764308:
        uStack_1a34 = 1;
      }
      else {
        if (uVar12 == 0xffffffff) {
          if (*pcVar36 == 0) {
            uVar30 = 0;
          }
          else {
            uVar37 = _strlen(pcVar36);
            uVar30 = uVar37;
          }
        }
        else {
          uVar30 = (long)(int)uVar12;
        }
code_r0x00764424:
        uVar17 = uVar30;
        if (0x7ffffffe < uVar30) {
          uVar17 = 0x7fffffff;
        }
        iVar20 = (int)uVar17;
        if ((uVar11 >> 3 & 1) == 0) {
          iVar8 = uVar13 - iVar20;
          goto joined_r0x00764308;
        }
        uVar37 = (*auVar42._8_8_)(0x22,uVar41);
        if ((int)uVar37 != 0) goto code_r0x0076451c;
        uStack_1a34 = 0;
        iVar7 = iVar7 + 1;
        iVar8 = uVar13 - iVar20;
      }
      if ((uVar11 >> 2 & 1) == 0) {
        if (iVar8 < 1) {
          iVar8 = iVar8 + -1;
        }
        else {
          iVar7 = (uVar13 + iVar7) - iVar20;
          do {
            uVar37 = (*auVar42._8_8_)(0x20,uVar41);
            if ((int)uVar37 != 0) goto code_r0x0076451c;
            iVar20 = iVar8 + -1;
            bVar6 = 0 < iVar8;
            iVar8 = iVar20;
          } while (iVar20 != 0 && bVar6);
          iVar8 = -1;
        }
      }
      if (uVar30 != 0) {
        iVar20 = iVar7 + (int)uVar30;
        do {
          uVar37 = (ulong)(byte)*pcVar36;
          if (*pcVar36 == 0) goto code_r0x007644cc;
          uVar37 = (*auVar42._8_8_)(uVar37,uVar41);
          if ((int)uVar37 != 0) goto code_r0x0076451c;
          pcVar36 = pcVar36 + 1;
          iVar7 = iVar7 + 1;
          uVar30 = uVar30 - 1;
        } while (uVar30 != 0);
        iVar7 = iVar20;
      }
code_r0x007644cc:
      if (((uVar11 >> 2 & 1) != 0) && (0 < iVar8)) {
        iVar7 = iVar8 + iVar7;
        iVar8 = iVar8 + 1;
        do {
          uVar37 = (*auVar42._8_8_)(0x20,uVar41);
          if ((int)uVar37 != 0) goto code_r0x0076451c;
          iVar8 = iVar8 + -1;
        } while (1 < iVar8);
      }
      if ((uStack_1a34 & 1) == 0) {
        uVar37 = (*auVar42._8_8_)(0x22,uVar41);
        if ((int)uVar37 != 0) goto code_r0x0076451c;
        iVar7 = iVar7 + 1;
      }
      break;
    case 1:
      dVar40 = adStack_1878[uVar30 * 2];
      if (dVar40 != 0.0) {
        uVar16 = 0;
        pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
        if ((uVar11 & 0x1000) != 0) {
          pcStack_1a08 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        uVar27 = 1;
        dVar23 = 7.90505033345994e-323;
        uVar31 = 1;
        goto code_r0x00763f80;
      }
      iVar20 = uVar13 - 5;
      iVar8 = iVar20;
      if (((uVar11 >> 2 & 1) != 0) && (iVar8 = uVar13 - 6, 5 < (int)uVar13)) {
        iVar7 = iVar20 + iVar7;
        do {
          uVar37 = (*auVar42._8_8_)(0x20,uVar41);
          if ((int)uVar37 != 0) goto code_r0x0076451c;
          iVar20 = iVar20 + -1;
        } while (0 < iVar20);
        iVar8 = -1;
      }
      uVar37 = (*auVar42._8_8_)(0x28,uVar41);
      if (((((int)uVar37 == 0) && (uVar37 = (*auVar42._8_8_)(0x6e,uVar41), (int)uVar37 == 0)) &&
          (uVar37 = (*auVar42._8_8_)(0x69,uVar41), (int)uVar37 == 0)) &&
         ((uVar37 = (*auVar42._8_8_)(0x6c,uVar41), (int)uVar37 == 0 &&
          (uVar37 = (*auVar42._8_8_)(0x29,uVar41), (int)uVar37 == 0)))) {
        iVar7 = iVar7 + 5;
        if (((uVar11 >> 2 & 1) == 0) && (0 < iVar8)) {
          iVar7 = iVar7 + iVar8;
          iVar8 = iVar8 + 1;
          do {
            uVar37 = (*auVar42._8_8_)(0x20,uVar41);
            if ((int)uVar37 != 0) goto code_r0x0076451c;
            iVar8 = iVar8 + -1;
          } while (1 < iVar8);
        }
        break;
      }
      goto code_r0x0076451c;
    case 2:
      if (((uVar11 >> 6 & 1) == 0) && ((uVar11 >> 5 & 1) == 0)) {
        if ((uVar11 >> 4 & 1) == 0) {
          *(int *)adStack_1878[uVar30 * 2] = iVar7;
        }
        else {
          *(short *)adStack_1878[uVar30 * 2] = (short)iVar7;
        }
      }
      else {
        *(long *)adStack_1878[uVar30 * 2] = (long)iVar7;
      }
      break;
    case 3:
    case 4:
    case 5:
      goto code_r0x00763cc4;
    case 6:
    case 7:
    case 8:
      uVar15 = uVar11 | 0x200;
code_r0x00763cc4:
      dVar40 = adStack_1878[uVar30 * 2];
      if ((uVar15 >> 0x11 & 1) == 0) {
        if ((uVar15 >> 10 & 1) == 0) {
          if ((uVar15 >> 0xb & 1) != 0) {
            uVar16 = 0;
            pcStack_1a08 = "0123456789abcdefghijklmnopqrstuvwxyz";
            if ((uVar15 & 0x1000) != 0) {
              pcStack_1a08 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            }
            uVar31 = uVar11 >> 3 & 1;
            uVar27 = 1;
            dVar23 = 7.90505033345994e-323;
            uVar11 = uVar15;
            goto code_r0x00763f80;
          }
          dVar23 = (double)-(long)dVar40;
          if (-1 < (long)dVar40) {
            dVar23 = dVar40;
          }
          uVar14 = 0;
          if (-1 >= (long)dVar40) {
            uVar14 = (uint)((uVar15 & 0x200) == 0);
          }
          if ((uVar15 & 0x200) != 0) {
            dVar23 = dVar40;
          }
          if (uVar12 == 0xffffffff) {
            uVar12 = 1;
          }
          if (dVar23 != 0.0) {
            pbVar34 = pbStack_1a00;
            do {
              pbVar32 = pbVar34 + -1;
              *pbVar34 = SUB81(dVar23,0) + (char)((ulong)dVar23 / 10) * -10 | 0x30;
              bVar6 = 9 < (ulong)dVar23;
              dVar23 = (double)((ulong)dVar23 / 10);
              pbVar34 = pbVar32;
            } while (bVar6);
          }
          uVar27 = 0;
          uVar31 = uVar11 >> 3 & 1;
          iVar20 = (int)pbStack_1a00 - (int)pbVar32;
          iVar8 = uVar13 - iVar20;
          iVar20 = uVar12 - iVar20;
          uVar11 = uVar15;
code_r0x00763ff0:
          pbVar34 = pbVar32;
          if (0 < iVar20) {
            iVar8 = iVar8 - iVar20;
            if (&bStack_19c8 <= pbVar32) {
              uVar37 = (ulong)(((uVar12 - (int)&bStack_19c8) + (int)pbVar32) - 0x145);
              uVar30 = (long)pbVar32 - (long)&bStack_19c8;
              if (uVar37 <= uVar30) {
                uVar30 = uVar37;
              }
              uVar37 = _memset((long)pbVar32 - uVar30,0x30,uVar30 + 1);
              pbVar34 = (byte *)(((long)pbVar32 - uVar30) + -1);
            }
          }
        }
        else {
          uVar27 = 0;
          uVar31 = uVar11 >> 3 & 1;
          uVar16 = 1;
          dVar23 = 3.95252516672997e-323;
          uVar11 = uVar15;
code_r0x00763f80:
          if (uVar12 == 0xffffffff) {
            uVar12 = 1;
          }
          if (dVar40 != 0.0) {
            pbVar34 = pbStack_1a00;
            do {
              pbVar32 = pbVar34 + -1;
              *pbVar34 = pcStack_1a08[(ulong)dVar40 & (long)dVar23 - 1U];
              dVar4 = 0.0;
              if (dVar23 != 0.0) {
                dVar4 = (double)((ulong)dVar40 / (ulong)dVar23);
              }
              bVar6 = (ulong)dVar23 <= (ulong)dVar40;
              dVar40 = dVar4;
              pbVar34 = pbVar32;
            } while (bVar6);
          }
          uVar14 = 0;
          iVar20 = (int)pbStack_1a00 - (int)pbVar32;
          iVar8 = uVar13 - iVar20;
          iVar20 = uVar12 - iVar20;
          if (((uVar16 & uVar31) != 1) || (0 < iVar20)) goto code_r0x00763ff0;
          uVar14 = 0;
          pbVar34 = pbVar32 + -1;
          *pbVar32 = 0x30;
          iVar8 = iVar8 + -1;
        }
        iVar20 = iVar8 + -2;
        if ((uVar27 & uVar31) == 0) {
          iVar20 = iVar8;
        }
        uVar13 = uVar14;
        if ((uVar11 & 3) != 0) {
          uVar13 = 1;
        }
        iVar8 = iVar20 - uVar13;
        iVar29 = iVar8;
        if (((uVar11 & 0x104) == 0) && (iVar29 = iVar8 + -1, 0 < iVar8)) {
          iVar7 = (iVar20 + iVar7) - uVar13;
          do {
            uVar37 = (*auVar42._8_8_)(0x20,uVar41);
            if ((int)uVar37 != 0) goto code_r0x0076451c;
            iVar20 = iVar8 + -1;
            bVar6 = 0 < iVar8;
            iVar8 = iVar20;
          } while (iVar20 != 0 && bVar6);
          iVar29 = -1;
        }
        if (uVar14 == 0) {
          if ((uVar11 >> 1 & 1) != 0) {
            uVar9 = 0x2b;
            goto code_r0x007640cc;
          }
          if ((uVar11 & 1) != 0) {
            uVar9 = 0x20;
            goto code_r0x007640cc;
          }
        }
        else {
          uVar9 = 0x2d;
code_r0x007640cc:
          uVar37 = (*auVar42._8_8_)(uVar9,uVar41);
          if ((int)uVar37 != 0) goto code_r0x0076451c;
          iVar7 = iVar7 + 1;
        }
        if ((uVar27 & uVar31) != 0) {
          uVar37 = (*auVar42._8_8_)(0x30,uVar41);
          if ((int)uVar37 != 0) goto code_r0x0076451c;
          if ((uVar11 >> 0xc & 1) == 0) {
            uVar9 = 0x78;
          }
          else {
            uVar9 = 0x58;
          }
          uVar37 = (*auVar42._8_8_)(uVar9,uVar41);
          if ((int)uVar37 != 0) goto code_r0x0076451c;
          iVar7 = iVar7 + 2;
        }
        if ((uVar11 & 0x104) == 0x100) {
          iVar8 = iVar29 + -1;
          if (0 < iVar29) {
            iVar7 = iVar7 + iVar29;
            do {
              uVar37 = (*auVar42._8_8_)(0x30,uVar41);
              if ((int)uVar37 != 0) goto code_r0x0076451c;
              iVar8 = iVar29 + -1;
              bVar6 = 0 < iVar29;
              iVar29 = iVar8;
            } while (iVar8 != 0 && bVar6);
            iVar29 = -1;
            goto code_r0x00764140;
          }
          if (pbVar34 + 1 <= pbStack_1a00) goto code_r0x00764150;
        }
        else {
code_r0x00764140:
          iVar8 = iVar29;
          if (pbVar34 + 1 <= pbStack_1a00) {
code_r0x00764150:
            iVar7 = (iStack_1a0c + iVar7) - (int)pbVar34;
            lVar21 = (long)pbStack_1a18 - (long)pbVar34;
            do {
              pbVar34 = pbVar34 + 1;
              uVar37 = (*auVar42._8_8_)(*pbVar34,uVar41);
              if ((int)uVar37 != 0) goto code_r0x0076451c;
              lVar21 = lVar21 + -1;
            } while (lVar21 != 0);
          }
        }
        if (((uVar11 >> 2 & 1) != 0) && (0 < iVar8)) {
          iVar7 = iVar8 + iVar7;
          iVar8 = iVar8 + 1;
          do {
            uVar37 = (*auVar42._8_8_)(0x20,uVar41);
            if ((int)uVar37 != 0) goto code_r0x0076451c;
            iVar8 = iVar8 + -1;
          } while (1 < iVar8);
        }
      }
      else {
        iVar8 = iVar7;
        uVar11 = uVar13;
        if (((uVar15 >> 2 & 1) == 0) && (uVar11 = uVar13 - 1, 1 < (int)uVar13)) {
          iVar8 = uVar11 + iVar7;
          do {
            uVar37 = (*auVar42._8_8_)(0x20,uVar41);
            if ((int)uVar37 != 0) goto code_r0x0076451c;
            uVar13 = uVar13 - 1;
          } while (1 < (int)uVar13);
          uVar11 = 0;
        }
        uVar37 = (*auVar42._8_8_)(SUB84(dVar40,0) & 0xff,uVar41);
        if ((int)uVar37 != 0) goto code_r0x0076451c;
        iVar7 = iVar8 + 1;
        if (((uVar15 >> 2 & 1) != 0) && (1 < (int)uVar11)) {
          iVar7 = uVar11 + iVar8;
          iVar8 = uVar11 + 1;
          do {
            uVar37 = (*auVar42._8_8_)(0x20,uVar41);
            if ((int)uVar37 != 0) goto code_r0x0076451c;
            iVar8 = iVar8 + -1;
          } while (2 < iVar8);
        }
      }
      break;
    case 9:
      uStack_19e8 = _UNK_008cd86b;
      uStack_19f0 = _UNK_008cd863;
      uStack_19d8 = _UNK_008cd87b;
      uStack_19e0 = _UNK_008cd873;
      lVar21 = _strlen(&uStack_19f0);
      if ((uVar11 & 0x2000) != 0) {
        uVar13 = uVar31;
      }
      if ((uVar11 >> 0xf & 1) == 0) {
        if ((uVar11 >> 2 & 1) == 0) goto code_r0x00763e64;
code_r0x00764238:
        uStack_19f0._0_2_ = CONCAT11(0x2d,(undefined1)uStack_19f0);
        puVar35 = puStack_1a30;
        puVar33 = puStack_1a30;
        if ((uVar11 >> 1 & 1) != 0) goto code_r0x00764248;
code_r0x00763e68:
        puVar35 = puVar33;
        if ((uVar11 & 1) == 0) goto code_r0x00763e6c;
code_r0x00764254:
        puVar35 = puVar33 + 1;
        *puVar33 = 0x20;
        if ((uVar11 >> 3 & 1) != 0) goto code_r0x00764260;
code_r0x00763e70:
        *puVar35 = 0;
      }
      else {
        uVar12 = auStack_1080[lVar18 * 8 + 1];
        if ((uVar11 >> 2 & 1) != 0) goto code_r0x00764238;
code_r0x00763e64:
        puVar35 = puStack_1a20;
        puVar33 = puStack_1a20;
        if ((uVar11 >> 1 & 1) == 0) goto code_r0x00763e68;
code_r0x00764248:
        puVar33 = puVar35 + 1;
        *puVar35 = 0x2b;
        puVar35 = puVar33;
        if ((uVar11 & 1) != 0) goto code_r0x00764254;
code_r0x00763e6c:
        if ((uVar11 >> 3 & 1) == 0) goto code_r0x00763e70;
code_r0x00764260:
        *puVar35 = 0x23;
        puVar35[1] = 0;
        puVar35 = puVar35 + 1;
      }
      if (-1 < (int)uVar13) {
        auVar42._8_8_ = 0x20 - lVar21;
        auVar42._0_8_ = puVar35;
        if (0x144 < (int)uVar13) {
          uVar13 = 0x145;
        }
        dStack_1a40 = (double)(ulong)uVar13;
        puVar39 = &UNK_00763ea4;
        goto code_r0x00764560;
      }
      if (-1 < (int)uVar12) {
        dVar40 = adStack_1878[uVar30 * 2];
        uVar31 = 0x144;
        if (uVar12 < 0x146) {
          uVar31 = uVar12;
        }
        iVar8 = 0x145;
        if ((int)uVar31 <= (int)uVar13 && 0 < (int)uVar13) {
          iVar8 = 0x145 - uVar13;
        }
        for (; 10.0 <= dVar40; dVar40 = dVar40 / 10.0) {
          iVar8 = iVar8 + -1;
        }
        uVar13 = iVar8 - 1;
        if ((int)uVar31 <= iVar8) {
          uVar13 = uVar31;
        }
        dStack_1a40 = (double)(ulong)(uVar13 & ((int)uVar13 >> 0x1f ^ 0xffffffffU));
        iVar8 = func_0x00764560(puVar35,0x20 - lVar21,".%d");
        puVar35 = puVar35 + iVar8;
      }
      puVar33 = puVar35;
      if ((uVar11 >> 5 & 1) != 0) {
        puVar33 = puVar35 + 1;
        *puVar35 = 0x6c;
      }
      if ((uVar11 >> 0x12 & 1) == 0) {
        uVar10 = 0x67;
        if ((uVar11 & 0x1000) != 0) {
          uVar10 = 0x47;
        }
        uVar11 = uVar11 & 0x80000;
        uVar19 = 0x66;
      }
      else {
        uVar11 = uVar11 & 0x1000;
        uVar10 = 0x45;
        uVar19 = 0x65;
      }
      if (uVar11 != 0) {
        uVar19 = uVar10;
      }
      *puVar33 = uVar19;
      puVar33[1] = 0;
      dStack_1a40 = adStack_1878[uVar30 * 2];
      uVar37 = _snprintf(&bStack_19c8,0x146,&uStack_19f0);
      pbVar32 = pbStack_1a28;
      bVar26 = bStack_19c8;
      while (bVar26 != 0) {
        uVar37 = (*auVar42._8_8_)(bVar26,uVar41);
        if ((int)uVar37 != 0) goto code_r0x0076451c;
        iVar7 = iVar7 + 1;
        bVar26 = *pbVar32;
        pbVar32 = pbVar32 + 1;
      }
    }
code_r0x00763bd8:
    lVar18 = lVar18 + 1;
  } while (lVar18 < uStack_19f8._4_4_);
code_r0x0076451c:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_80) {
    return uVar37;
  }
  puVar39 = &_curl_msnprintf;
  auVar42 = ___stack_chk_fail();
  pdVar5 = &dStack_1a40;
code_r0x00764560:
  *(undefined1 **)((long)pdVar5 + -0x10) = unaff_x29;
  *(undefined **)((long)pdVar5 + -8) = puVar39;
  *(double **)((long)pdVar5 + -0x18) = pdVar5;
  uVar37 = func_0x00762a38(auVar42._0_8_,auVar42._8_8_);
  return uVar37;
}

