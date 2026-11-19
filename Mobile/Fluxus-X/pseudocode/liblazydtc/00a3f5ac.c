/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3f5ac
 */

void FUN_00a3f5ac(ushort *param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  ulong uVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  ulong uVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  ulong uVar30;
  ulong uVar31;
  
  uVar31 = (ulong)(*(uint3 *)((long)param_1 + 0x2f) >> 2) & 0x1fffff;
  uVar13 = ((ulong)(byte)param_1[0x1e] & 0xf8 | (ulong)*(byte *)((long)param_1 + 0x3d) << 8 |
            (ulong)(byte)param_1[0x1f] << 0x10 | (ulong)*(byte *)((long)param_1 + 0x3f) << 0x18) >>
           3;
  lVar16 = ((ulong)param_1[0x15] | ((ulong)(byte)*(uint *)(param_1 + 0x16) & 0x1f) << 0x10) +
           uVar13 * -0xa6f7d;
  uVar1 = lVar16 + 0x100000;
  lVar23 = ((ulong)(*(uint *)(param_1 + 0x16) >> 5) & 0x1fffff) + ((long)uVar1 >> 0x15);
  uVar26 = (ulong)(*(uint *)((long)param_1 + 0x31) >> 7) & 0x1fffff;
  uVar30 = (ulong)(*(uint *)(param_1 + 0x1a) >> 4) & 0x1fffff;
  lVar29 = ((ulong)*(ushort *)((long)param_1 + 0x15) |
           ((ulong)*(byte *)((long)param_1 + 0x17) & 0x1f) << 0x10) + uVar31 * 0x9fb67 +
           uVar26 * 0x72d18 + uVar30 * 0xa2c13;
  uVar11 = (ulong)(*(uint3 *)((long)param_1 + 0x37) >> 1) & 0x1fffff;
  uVar2 = lVar29 + 0x100000;
  uVar8 = (ulong)(*(uint *)((long)param_1 + 0x39) >> 6) & 0x1fffff;
  lVar9 = ((ulong)(*(uint *)((long)param_1 + 0x17) >> 5) & 0x1fffff) + uVar31 * -0xf39ad +
          uVar26 * 0x9fb67 + uVar30 * 0x72d18 + uVar11 * 0xa2c13 + (uVar2 >> 0x15);
  lVar21 = ((ulong)(*(uint3 *)(param_1 + 0xd) >> 2) & 0x1fffff) + uVar31 * 0x215d1 +
           uVar26 * -0xf39ad + uVar30 * 0x9fb67 + uVar11 * 0x72d18 + uVar8 * 0xa2c13;
  uVar3 = lVar9 + 0x100000;
  lVar19 = ((ulong)(*(uint *)((long)param_1 + 0xf) >> 6) & 0x1fffff) + uVar31 * 0xa2c13;
  lVar24 = ((ulong)(*(uint *)((long)param_1 + 0x1f) >> 4) & 0x1fffff) + uVar26 * -0xa6f7d +
           uVar30 * 0x215d1 + uVar11 * -0xf39ad + uVar8 * 0x9fb67 + uVar13 * 0x72d18;
  lVar12 = ((ulong)(*(uint *)(param_1 + 0x12) >> 6) & 0x1fffff) + uVar11 * -0xa6f7d +
           uVar8 * 0x215d1 + uVar13 * -0xf39ad;
  uVar4 = lVar19 + 0x100000;
  uVar5 = lVar21 + 0x100000;
  lVar7 = ((ulong)(*(uint *)(param_1 + 0xe) >> 7) & 0x1fffff) + uVar31 * -0xa6f7d + uVar26 * 0x215d1
          + uVar30 * -0xf39ad + uVar11 * 0x9fb67 + uVar8 * 0x72d18 + uVar13 * 0xa2c13 +
          ((long)uVar5 >> 0x15);
  uVar6 = lVar24 + 0x100000;
  lVar28 = ((ulong)(*(uint3 *)(param_1 + 0x11) >> 1) & 0x1fffff) + uVar30 * -0xa6f7d +
           uVar11 * 0x215d1 + uVar8 * -0xf39ad + uVar13 * 0x9fb67 + ((long)uVar6 >> 0x15);
  uVar11 = lVar12 + 0x100000;
  lVar14 = uVar8 * -0xa6f7d +
           (((ulong)*(byte *)((long)param_1 + 0x27) & 0xf8 | (ulong)(byte)param_1[0x14] << 8 |
            (ulong)*(byte *)((long)param_1 + 0x29) << 0x10) >> 3) + uVar13 * 0x215d1 +
           ((long)uVar11 >> 0x15);
  uVar8 = lVar7 + 0x100000;
  lVar27 = uVar31 * 0x72d18 +
           (((ulong)(byte)param_1[9] & 0xf8 | (ulong)*(byte *)((long)param_1 + 0x13) << 8 |
            (ulong)(byte)param_1[10] << 0x10) >> 3) + (uVar4 >> 0x15) + uVar26 * 0xa2c13;
  lVar24 = (lVar24 - (uVar6 & 0xffffffffffe00000)) + ((long)uVar8 >> 0x15);
  uVar6 = lVar27 + 0x100000;
  lVar22 = ((lVar21 + ((long)uVar3 >> 0x15)) - (uVar5 & 0xffffffffffe00000)) + lVar23 * -0xa6f7d;
  uVar5 = lVar14 + 0x100000;
  uVar13 = lVar22 + 0x100000;
  lVar16 = (lVar16 - (uVar1 & 0xffffffffffe00000)) + ((long)uVar5 >> 0x15);
  lVar7 = (lVar7 - (uVar8 & 0xffffffffffe00000)) + ((long)uVar13 >> 0x15);
  uVar1 = lVar28 + 0x100000;
  lVar12 = (lVar12 - (uVar11 & 0xffffffffffe00000)) + ((long)uVar1 >> 0x15);
  lVar28 = lVar28 - (uVar1 & 0xffffffffffe00000);
  lVar14 = lVar14 - (uVar5 & 0xffffffffffe00000);
  lVar25 = ((ulong)*param_1 | ((ulong)(byte)*(uint *)(param_1 + 1) & 0x1f) << 0x10) +
           lVar24 * 0xa2c13;
  lVar15 = ((lVar29 + (uVar6 >> 0x15)) - (uVar2 & 0xffffffffffe00000)) + lVar23 * -0xf39ad +
           lVar16 * 0x215d1 + lVar14 * -0xa6f7d;
  uVar1 = lVar25 + 0x100000;
  lVar21 = ((ulong)(*(uint *)(param_1 + 1) >> 5) & 0x1fffff) + lVar24 * 0x72d18 + lVar28 * 0xa2c13 +
           ((long)uVar1 >> 0x15);
  uVar2 = lVar7 + 0x100000;
  lVar10 = ((ulong)(*(uint3 *)((long)param_1 + 5) >> 2) & 0x1fffff) + lVar24 * 0x9fb67 +
           lVar12 * 0xa2c13 + lVar28 * 0x72d18;
  lVar29 = (long)uVar2 >> 0x15;
  uVar5 = lVar21 + 0x100000;
  uVar11 = lVar10 + 0x100000;
  lVar20 = (lVar19 - (uVar4 & 0x7ffffe00000)) + lVar23 * 0x72d18 + lVar16 * 0x9fb67 +
           lVar14 * -0xf39ad + lVar12 * 0x215d1 + lVar28 * -0xa6f7d;
  lVar18 = ((ulong)(*(uint *)(param_1 + 5) >> 4) & 0x1fffff) + lVar16 * 0xa2c13 + lVar14 * 0x72d18 +
           lVar24 * 0x215d1 + lVar12 * 0x9fb67 + lVar28 * -0xf39ad;
  lVar19 = ((ulong)(*(uint *)((long)param_1 + 7) >> 7) & 0x1fffff) + lVar14 * 0xa2c13 +
           lVar24 * -0xf39ad + lVar12 * 0x72d18 + lVar28 * 0x9fb67 + ((long)uVar11 >> 0x15);
  uVar4 = lVar15 + 0x100000;
  lVar9 = (lVar9 - (uVar3 & 0xffffffffffe00000)) + lVar23 * 0x215d1 + lVar16 * -0xa6f7d +
          ((long)uVar4 >> 0x15);
  uVar3 = lVar20 + 0x100000;
  uVar8 = lVar18 + 0x100000;
  lVar27 = (lVar27 - (uVar6 & 0xffffffffffe00000)) + lVar23 * 0x9fb67 + lVar16 * -0xf39ad +
           lVar14 * 0x215d1 + lVar12 * -0xa6f7d + ((long)uVar3 >> 0x15);
  uVar6 = lVar9 + 0x100000;
  lVar23 = ((ulong)(*(uint3 *)((long)param_1 + 0xd) >> 1) & 0x1fffff) + lVar23 * 0xa2c13 +
           lVar16 * 0x72d18 + lVar14 * 0x9fb67 + lVar24 * -0xa6f7d + lVar12 * -0xf39ad +
           lVar28 * 0x215d1 + ((long)uVar8 >> 0x15);
  uVar26 = lVar27 + 0x100000;
  uVar30 = lVar19 + 0x100000;
  uVar17 = (lVar25 - (uVar1 & 0xffffffffffe00000)) + lVar29 * 0xa2c13;
  uVar31 = ((lVar21 + lVar29 * 0x72d18) - (uVar5 & 0xffffffffffe00000)) + ((long)uVar17 >> 0x15);
  uVar5 = ((lVar10 + lVar29 * 0x9fb67) - (uVar11 & 0xffffffffffe00000)) + ((long)uVar5 >> 0x15) +
          ((long)uVar31 >> 0x15);
  uVar1 = lVar23 + 0x100000;
  uVar11 = ((lVar19 + lVar29 * -0xf39ad) - (uVar30 & 0xffffffffffe00000)) + ((long)uVar5 >> 0x15);
  uVar8 = ((lVar18 + lVar29 * 0x215d1) - (uVar8 & 0xffffffffffe00000)) + ((long)uVar30 >> 0x15) +
          ((long)uVar11 >> 0x15);
  uVar30 = ((lVar23 + lVar29 * -0xa6f7d) - (uVar1 & 0xffffffffffe00000)) + ((long)uVar8 >> 0x15);
  uVar1 = (lVar20 - (uVar3 & 0xffffffffffe00000)) + ((long)uVar1 >> 0x15) + ((long)uVar30 >> 0x15);
  uVar3 = (lVar27 - (uVar26 & 0xffffffffffe00000)) + ((long)uVar1 >> 0x15);
  uVar4 = (lVar15 - (uVar4 & 0xffffffffffe00000)) + ((long)uVar26 >> 0x15) + ((long)uVar3 >> 0x15);
  uVar26 = (lVar9 - (uVar6 & 0xffffffffffe00000)) + ((long)uVar4 >> 0x15);
  uVar6 = (lVar22 - (uVar13 & 0xffffffffffe00000)) + ((long)uVar6 >> 0x15) + ((long)uVar26 >> 0x15);
  uVar2 = (lVar7 - (uVar2 & 0xffffffffffe00000)) + ((long)uVar6 >> 0x15);
  lVar23 = (long)uVar2 >> 0x15;
  lVar9 = (uVar17 & 0x1fffff) + lVar23 * 0xa2c13;
  uVar13 = (uVar31 & 0x1fffff) + lVar23 * 0x72d18 + (lVar9 >> 0x15);
  *(char *)param_1 = (char)lVar9;
  *(char *)((long)param_1 + 1) = (char)((ulong)lVar9 >> 8);
  *(char *)((long)param_1 + 3) = (char)(uVar13 >> 3);
  uVar5 = (uVar5 & 0x1fffff) + lVar23 * 0x9fb67 + ((long)uVar13 >> 0x15);
  *(char *)(param_1 + 2) = (char)(uVar13 >> 0xb);
  *(char *)(param_1 + 3) = (char)(uVar5 >> 6);
  uVar11 = (uVar11 & 0x1fffff) + lVar23 * -0xf39ad + ((long)uVar5 >> 0x15);
  *(byte *)((long)param_1 + 5) =
       (byte)((uint)uVar13 >> 0x13) & 3 | (byte)(((uint)uVar5 & 0x1fffff) << 2);
  *(char *)(param_1 + 4) = (char)(uVar11 >> 1);
  *(char *)((long)param_1 + 9) = (char)(uVar11 >> 9);
  uVar8 = (uVar8 & 0x1fffff) + lVar23 * 0x215d1 + ((long)uVar11 >> 0x15);
  *(byte *)((long)param_1 + 7) =
       (byte)((uint)uVar5 >> 0xe) & 0x7f | (byte)(((uint)uVar11 & 0x1fffff) << 7);
  *(char *)((long)param_1 + 0xb) = (char)(uVar8 >> 4);
  *(char *)(param_1 + 6) = (char)(uVar8 >> 0xc);
  uVar5 = (uVar30 & 0x1fffff) + lVar23 * -0xa6f7d + ((long)uVar8 >> 0x15);
  uVar1 = (uVar1 & 0x1fffff) + ((long)uVar5 >> 0x15);
  *(byte *)((long)param_1 + 0xd) =
       (byte)((uint)uVar8 >> 0x14) & 1 | (byte)(((uint)uVar5 & 0x1fffff) << 1);
  *(char *)(param_1 + 8) = (char)(uVar1 >> 2);
  uVar3 = (uVar3 & 0x1fffff) + ((long)uVar1 >> 0x15);
  *(byte *)(param_1 + 9) = (byte)((uint)uVar1 >> 0x12) & 7 | (byte)((int)uVar3 << 3);
  lVar23 = (uVar4 & 0x1fffff) + ((long)uVar3 >> 0x15);
  uVar4 = (uVar26 & 0x1fffff) + (lVar23 >> 0x15);
  *(char *)(param_1 + 10) = (char)(uVar3 >> 0xd);
  *(char *)((long)param_1 + 0x15) = (char)lVar23;
  *(char *)(param_1 + 0xb) = (char)((ulong)lVar23 >> 8);
  uVar6 = (uVar6 & 0x1fffff) + ((long)uVar4 >> 0x15);
  *(char *)(param_1 + 0xc) = (char)(uVar4 >> 3);
  *(byte *)((long)param_1 + 0x17) =
       (byte)((ulong)lVar23 >> 0x10) & 0x1f | (byte)(((uint)uVar4 & 0x1fffff) << 5);
  uVar2 = (uVar2 & 0x1fffff) + ((long)uVar6 >> 0x15);
  *(byte *)(param_1 + 0xe) = (byte)((uint)uVar6 >> 0xe) & 0x7f | (byte)((int)uVar2 << 7);
  *(char *)((long)param_1 + 0x1d) = (char)(uVar2 >> 1);
  *(byte *)(param_1 + 1) =
       (byte)((ulong)lVar9 >> 0x10) & 0x1f | (byte)(((uint)uVar13 & 0x1fffff) << 5);
  *(byte *)(param_1 + 5) =
       (byte)((uint)uVar11 >> 0x11) & 0xf | (byte)(((uint)uVar8 & 0x1fffff) << 4);
  *(char *)(param_1 + 7) = (char)(uVar5 >> 7);
  *(char *)((long)param_1 + 0x11) = (char)(uVar1 >> 10);
  *(byte *)((long)param_1 + 0xf) =
       (byte)((uint)uVar5 >> 0xf) & 0x3f | (byte)(((uint)uVar1 & 0x1fffff) << 6);
  *(char *)((long)param_1 + 0x13) = (char)(uVar3 >> 5);
  *(char *)((long)param_1 + 0x19) = (char)(uVar4 >> 0xb);
  *(char *)((long)param_1 + 0x1b) = (char)(uVar6 >> 6);
  *(byte *)(param_1 + 0xd) = (byte)((uint)uVar4 >> 0x13) & 3 | (byte)(((uint)uVar6 & 0x1fffff) << 2)
  ;
  *(char *)(param_1 + 0xf) = (char)(uVar2 >> 9);
  *(char *)((long)param_1 + 0x1f) = (char)(uVar2 >> 0x11);
  return;
}

