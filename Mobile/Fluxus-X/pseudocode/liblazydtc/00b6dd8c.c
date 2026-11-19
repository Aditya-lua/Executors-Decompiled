/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6dd8c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 mbedtls_aes_setkey_enc(undefined8 *param_1,ulong param_2,uint param_3)

{
  uint *puVar1;
  long lVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  int iVar10;
  undefined8 uVar11;
  undefined4 uVar12;
  uint *puVar13;
  long lVar14;
  ulong uVar15;
  undefined8 *puVar16;
  undefined4 *puVar17;
  undefined4 *puVar18;
  ulong uVar19;
  int iVar20;
  ulong uVar21;
  uint uVar22;
  uint uVar23;
  uint uVar24;
  uint uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  byte abStack_270 [256];
  byte local_170 [256];
  long local_70;
  
  lVar7 = tpidr_el0;
  local_70 = *(long *)(lVar7 + 0x28);
  if (param_3 == 0x80) {
    iVar20 = 2;
    uVar12 = 10;
  }
  else if (param_3 == 0x100) {
    iVar20 = 6;
    uVar12 = 0xe;
  }
  else {
    if (param_3 != 0xc0) {
      uVar11 = 0xffffffe0;
      goto LAB_00b6e33c;
    }
    iVar20 = 4;
    uVar12 = 0xc;
  }
  *(undefined4 *)param_1 = uVar12;
  if ((DAT_00d238d0 & 1) == 0) {
    lVar14 = 0;
    uVar21 = 1;
    do {
      local_170[lVar14] = (byte)uVar21;
      abStack_270[uVar21 & 0xff] = (byte)lVar14;
      lVar14 = lVar14 + 1;
      uVar21 = (ulong)((uint)uVar21 ^ (uint)uVar21 << 1 ^ (uint)(int)(char)(byte)uVar21 >> 7 & 0x1b)
      ;
    } while (lVar14 != 0x100);
    DAT_00d23900 = 0x360000001b;
    uRam0000000000d238e8 = 0x800000004;
    _DAT_00d238e0 = 0x200000001;
    uRam0000000000d238f8 = 0x8000000040;
    _DAT_00d238f0 = 0x2000000010;
    lVar14 = 1;
    DAT_00d23908 = 99;
    DAT_00d25a6b = 0;
    do {
      bVar4 = local_170[(ulong)~(uint)abStack_270[lVar14] & 0xff];
      bVar5 = bVar4 >> 7 | bVar4 << 1;
      bVar6 = bVar4 >> 6 & 1 | bVar5 << 1;
      bVar3 = bVar4 >> 5 & 1 | bVar6 << 1;
      bVar5 = bVar4 ^ bVar5 ^ bVar6 ^ bVar3 ^ (bVar4 >> 4 & 1 | bVar3 << 1) ^ 99;
      (&DAT_00d23908)[lVar14] = bVar5;
      (&DAT_00d25a08)[bVar5] = (char)lVar14;
      lVar14 = lVar14 + 1;
    } while (lVar14 != 0x100);
    lVar14 = 0;
    do {
      bVar5 = (&DAT_00d23908)[lVar14];
      uVar23 = (uint)bVar5;
      uVar22 = (int)((uint)bVar5 << 0x18) >> 0x1f & 0x1bU ^ uVar23 << 1;
      uVar25 = (uint)bVar5 << 8 | uVar23 << 0x10 | uVar22 & 0xff;
      uVar24 = (uVar22 ^ uVar23) & 0xff;
      bVar6 = (&DAT_00d25a08)[lVar14];
      (&DAT_00d24e08)[lVar14] = uVar24 | uVar25 << 8;
      (&DAT_00d24a08)[lVar14] = uVar25 | (uVar22 ^ uVar23) << 0x18;
      (&DAT_00d25208)[lVar14] = uVar23 | (uVar24 | ((uint)bVar5 << 8 | uVar22 & 0xff) << 8) << 8;
      (&DAT_00d25608)[lVar14] = (uint)bVar5 | (uVar23 | (uVar24 | (uVar22 & 0xff) << 8) << 8) << 8;
      if ((ulong)bVar6 == 0) {
        uVar24 = 0;
        uVar25 = 0;
        uVar23 = 0;
        uVar22 = 0;
      }
      else {
        bVar5 = abStack_270[bVar6];
        uVar22 = (uint)local_170[((uint)bVar5 + (uint)abStack_270[9]) % 0xff];
        uVar25 = (uint)local_170[((uint)bVar5 + (uint)abStack_270[0xd]) % 0xff];
        uVar23 = (uint)local_170[((uint)bVar5 + (uint)abStack_270[0xb]) % 0xff];
        uVar24 = (uint)CONCAT12(local_170[((uint)bVar5 + (uint)abStack_270[0xd]) % 0xff],
                                CONCAT11(local_170[((uint)bVar5 + (uint)abStack_270[9]) % 0xff],
                                         local_170[((uint)bVar5 + (uint)abStack_270[0xe]) % 0xff]));
      }
      uVar23 = uVar24 | uVar23 << 0x18;
      (&DAT_00d23a08)[lVar14] = uVar23;
      lVar2 = lVar14 + 1;
      iVar10 = (int)(CONCAT44(uVar24,uVar23) >> 0x18);
      uVar25 = uVar25 | iVar10 << 8;
      (&DAT_00d23e08)[lVar14] = iVar10;
      (&DAT_00d24208)[lVar14] = uVar25;
      (&DAT_00d24608)[lVar14] = uVar22 | uVar25 << 8;
      lVar14 = lVar2;
    } while (lVar2 != 0x100);
    DAT_00d238d0 = 1;
  }
  uVar24 = param_3 >> 5;
  param_1[1] = 0;
  if (uVar24 != 0) {
    uVar15 = 0;
    uVar21 = (ulong)uVar24;
    if ((0xff < param_3) &&
       (((undefined8 *)(param_2 + (uVar24 << 2)) <= param_1 + 2 ||
        (uVar15 = 0, (long)param_1 + (ulong)(uVar24 << 2) + 0x10 <= param_2)))) {
      uVar15 = uVar21 & 0x7fffff8;
      puVar16 = (undefined8 *)(param_2 + 0x10);
      uVar19 = uVar15;
      puVar9 = param_1;
      do {
        puVar8 = puVar16 + -1;
        uVar11 = puVar16[-2];
        uVar27 = puVar16[1];
        uVar26 = *puVar16;
        puVar16 = puVar16 + 4;
        uVar19 = uVar19 - 8;
        puVar9[3] = *puVar8;
        puVar9[2] = uVar11;
        puVar9[5] = uVar27;
        puVar9[4] = uVar26;
        puVar9 = puVar9 + 4;
      } while (uVar19 != 0);
      if (uVar15 == uVar21) goto LAB_00b6e120;
    }
    lVar14 = uVar21 - uVar15;
    puVar17 = (undefined4 *)(param_2 + uVar15 * 4);
    puVar18 = (undefined4 *)((long)param_1 + uVar15 * 4 + 0x10);
    do {
      lVar14 = lVar14 + -1;
      *puVar18 = *puVar17;
      puVar17 = puVar17 + 1;
      puVar18 = puVar18 + 1;
    } while (lVar14 != 0);
  }
LAB_00b6e120:
  if (iVar20 == 2) {
    uVar24 = *(uint *)(param_1 + 2);
    lVar14 = 0;
    puVar13 = (uint *)(param_1 + 3);
    do {
      puVar1 = (uint *)((long)&DAT_00d238e0 + lVar14);
      uVar22 = puVar13[1];
      lVar14 = lVar14 + 4;
      uVar24 = *puVar1 ^ uVar24 ^ (uint)(byte)(&DAT_00d23908)[uVar22 >> 8 & 0xff] ^
               (uint)(byte)(&DAT_00d23908)[uVar22 >> 0x10 & 0xff] << 8 ^
               (uint)(byte)(&DAT_00d23908)[uVar22 >> 0x18] << 0x10 ^
               (uint)(byte)(&DAT_00d23908)[(ulong)uVar22 & 0xff] << 0x18;
      puVar13[2] = uVar24;
      puVar13[3] = uVar24 ^ puVar13[-1];
      uVar25 = *puVar13 ^ uVar24 ^ puVar13[-1];
      puVar13[4] = uVar25;
      puVar13[5] = uVar25 ^ uVar22;
      puVar13 = puVar13 + 4;
    } while (lVar14 != 0x28);
  }
  else if (iVar20 == 4) {
    uVar24 = *(uint *)(param_1 + 2);
    lVar14 = 0;
    puVar13 = (uint *)(param_1 + 4);
    do {
      puVar1 = (uint *)((long)&DAT_00d238e0 + lVar14);
      uVar23 = puVar13[1];
      lVar14 = lVar14 + 4;
      uVar24 = *puVar1 ^ uVar24 ^ (uint)(byte)(&DAT_00d23908)[uVar23 >> 8 & 0xff] ^
               (uint)(byte)(&DAT_00d23908)[uVar23 >> 0x10 & 0xff] << 8 ^
               (uint)(byte)(&DAT_00d23908)[uVar23 >> 0x18] << 0x10 ^
               (uint)(byte)(&DAT_00d23908)[(ulong)uVar23 & 0xff] << 0x18;
      puVar13[2] = uVar24;
      puVar13[3] = uVar24 ^ puVar13[-3];
      uVar25 = puVar13[-2] ^ uVar24 ^ puVar13[-3];
      uVar22 = puVar13[-1] ^ uVar25;
      puVar13[4] = uVar25;
      puVar13[5] = uVar22;
      uVar22 = *puVar13 ^ uVar22;
      puVar13[6] = uVar22;
      puVar13[7] = uVar22 ^ uVar23;
      puVar13 = puVar13 + 6;
    } while (lVar14 != 0x20);
  }
  else {
    uVar11 = 0;
    if (iVar20 != 6) goto LAB_00b6e33c;
    uVar24 = *(uint *)(param_1 + 2);
    lVar14 = 0;
    puVar13 = (uint *)(param_1 + 5);
    do {
      puVar1 = (uint *)((long)&DAT_00d238e0 + lVar14);
      uVar23 = puVar13[1];
      lVar14 = lVar14 + 4;
      uVar24 = *puVar1 ^ uVar24 ^ (uint)(byte)(&DAT_00d23908)[uVar23 >> 8 & 0xff] ^
               (uint)(byte)(&DAT_00d23908)[uVar23 >> 0x10 & 0xff] << 8 ^
               (uint)(byte)(&DAT_00d23908)[uVar23 >> 0x18] << 0x10 ^
               (uint)(byte)(&DAT_00d23908)[(ulong)uVar23 & 0xff] << 0x18;
      puVar13[2] = uVar24;
      puVar13[3] = uVar24 ^ puVar13[-5];
      uVar25 = puVar13[-4] ^ uVar24 ^ puVar13[-5];
      uVar22 = puVar13[-3] ^ uVar25;
      puVar13[4] = uVar25;
      puVar13[5] = uVar22;
      uVar25 = puVar13[-2] ^ (uint)(byte)(&DAT_00d23908)[uVar22 & 0xff] ^
               (uint)(byte)(&DAT_00d23908)[uVar22 >> 8 & 0xff] << 8 ^
               (uint)(byte)(&DAT_00d23908)[uVar22 >> 0x10 & 0xff] << 0x10 ^
               (uint)(byte)(&DAT_00d23908)[uVar22 >> 0x18] << 0x18;
      uVar22 = uVar25 ^ puVar13[-1];
      puVar13[6] = uVar25;
      puVar13[7] = uVar22;
      uVar22 = *puVar13 ^ uVar22;
      puVar13[8] = uVar22;
      puVar13[9] = uVar22 ^ uVar23;
      puVar13 = puVar13 + 8;
    } while (lVar14 != 0x1c);
  }
  uVar11 = 0;
LAB_00b6e33c:
  if (*(long *)(lVar7 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar11;
}

