
undefined8 FUN_00241400(void)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  long lVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  byte *pbVar10;
  byte *pbVar11;
  ulong uVar12;
  byte *pbVar13;
  ulong uVar14;
  byte *pbVar15;
  uint uVar16;
  byte bVar18;
  byte bVar19;
  undefined8 uVar17;
  undefined8 uVar20;
  undefined1 auVar21 [16];
  undefined1 uStack0000000000000017;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000019;
  undefined1 uStack000000000000001a;
  undefined1 uStack000000000000001b;
  undefined1 uStack000000000000001c;
  undefined1 uStack000000000000001d;
  undefined1 uStack000000000000001e;
  undefined1 uStack000000000000001f;
  undefined1 uStack0000000000000020;
  undefined1 uStack0000000000000021;
  undefined1 uStack0000000000000022;
  undefined1 uStack0000000000000023;
  undefined1 uStack0000000000000024;
  undefined1 uStack0000000000000025;
  undefined1 uStack0000000000000026;
  undefined1 uStack0000000000000027;
  undefined1 uStack0000000000000028;
  undefined1 uStack0000000000000029;
  undefined1 uStack000000000000002a;
  undefined1 uStack000000000000002b;
  undefined1 uStack000000000000002c;
  undefined1 uStack000000000000002d;
  undefined1 uStack000000000000002e;
  undefined1 uStack000000000000002f;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000031;
  undefined1 uStack0000000000000032;
  undefined1 uStack0000000000000033;
  undefined1 uStack0000000000000034;
  undefined1 uStack0000000000000035;
  undefined1 uStack0000000000000036;
  undefined1 uStack0000000000000037;
  undefined1 uStack0000000000000038;
  undefined1 uStack0000000000000039;
  undefined1 uStack000000000000003a;
  undefined1 uStack000000000000003b;
  undefined1 uStack000000000000003c;
  undefined1 uStack000000000000003d;
  undefined1 uStack000000000000003e;
  undefined1 uStack000000000000003f;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000041;
  undefined1 uStack0000000000000042;
  undefined1 uStack0000000000000043;
  undefined1 uStack0000000000000044;
  undefined1 uStack0000000000000045;
  undefined1 uStack0000000000000046;
  undefined1 uStack0000000000000047;
  undefined1 uStack0000000000000048;
  undefined1 uStack0000000000000049;
  undefined1 uStack000000000000004a;
  undefined1 uStack000000000000004b;
  undefined1 uStack000000000000004c;
  undefined1 uStack000000000000004d;
  undefined1 uStack000000000000004e;
  undefined1 uStack000000000000004f;
  
  uStack0000000000000017 = 0;
  uStack0000000000000018 = 0;
  uStack0000000000000019 = 0;
  uStack000000000000001a = 0;
  uStack000000000000001b = 0;
  uStack000000000000001c = 0;
  uStack000000000000001d = 0;
  uStack000000000000001e = 0;
  uStack000000000000001f = 0;
  uStack0000000000000020 = 0;
  uStack0000000000000021 = 0;
  uStack0000000000000022 = 0;
  uStack0000000000000023 = 0;
  uStack0000000000000024 = 0;
  uStack0000000000000025 = 0;
  uStack0000000000000026 = 0;
  uStack0000000000000027 = 0;
  uStack0000000000000028 = 0;
  uStack0000000000000029 = 0;
  uStack000000000000002a = 0;
  uStack000000000000002b = 0;
  uStack000000000000002c = 0;
  uStack000000000000002d = 0;
  uStack000000000000002e = 0;
  uStack000000000000002f = 0;
  uStack0000000000000030 = 0;
  uStack0000000000000031 = 0;
  uStack0000000000000032 = 0;
  uStack0000000000000033 = 0;
  uStack0000000000000034 = 0;
  uStack0000000000000035 = 0;
  uStack0000000000000036 = 0;
  uStack0000000000000037 = 0;
  uStack0000000000000038 = 0;
  uStack0000000000000039 = 0;
  uStack000000000000003a = 0;
  uStack000000000000003b = 0;
  uStack000000000000003c = 0;
  uStack000000000000003d = 0;
  uStack000000000000003e = 0;
  uStack000000000000003f = 0;
  uStack0000000000000040 = 0;
  uStack0000000000000041 = 0;
  uStack0000000000000042 = 0;
  uStack0000000000000043 = 0;
  uStack0000000000000044 = 0;
  uStack0000000000000045 = 0;
  uStack0000000000000046 = 0;
  uStack0000000000000047 = 0;
  uStack0000000000000048 = 0;
  uStack0000000000000049 = 0;
  uStack000000000000004a = 0;
  uStack000000000000004b = 0;
  uStack000000000000004c = 0;
  uStack000000000000004d = 0;
  uStack000000000000004e = 0;
  uStack000000000000004f = 0;
  auVar21 = __Unwind_Resume();
  puVar9 = auVar21._8_8_;
  if ((*(byte *)*auVar21._0_8_ & 1) == 0) {
    pbVar10 = &UNK_00894093;
    pbVar11 = (byte *)0x5;
  }
  else {
    pbVar10 = &UNK_00890e70;
    pbVar11 = (byte *)0x4;
  }
  uVar5 = *(uint *)(puVar9 + 2);
  if ((uVar5 & 0x18000000) != 0) {
    if ((uVar5 >> 0x1c & 1) == 0) {
      if (pbVar11 < (byte *)0x20) {
        if (pbVar11 == (byte *)0x0) {
          uVar12 = 0;
        }
        else {
          if ((byte *)0x7 < pbVar11) {
            pbVar13 = (byte *)0x0;
            uVar8 = *(undefined8 *)pbVar10;
            uVar20 = *(undefined8 *)(pbVar10 + 8);
            bVar18 = -(-0x41 < (char)((ulong)uVar20 >> 0x28));
            uVar17 = *(undefined8 *)(pbVar10 + 0x10);
            bVar19 = -(-0x41 < (char)((ulong)uVar17 >> 0x28));
            uVar12 = (ulong)(-(-0x41 < (char)uVar8) & 1) + (ulong)(-(-0x41 < (char)uVar20) & 1) +
                     (ulong)(-(-0x41 < (char)uVar17) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x20)) & 1) +
                     ((ulong)((uint6)CONCAT14(bVar18,(uint)CONCAT12(bVar18,(ushort)(byte)-(-0x41 < (
                                                  char)((ulong)uVar20 >> 0x20)))) & 0xffff0000ffff)
                     & 0xffffff01) +
                     ((ulong)((uint6)CONCAT14(bVar19,(uint)CONCAT12(bVar19,(ushort)(byte)-(-0x41 < (
                                                  char)((ulong)uVar17 >> 0x20)))) & 0xffff0000ffff)
                     & 0xffffff01) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 0x10)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar17 >> 0x10)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 0x30)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar17 >> 0x30)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 8)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar17 >> 8)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x28)) & 1) +
                     ((ulong)bVar18 & 0xffffff01) + ((ulong)bVar19 & 0xffffff01) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 0x18)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar17 >> 0x18)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar20 >> 0x38)) & 1) +
                     (ulong)(-(-0x41 < (char)((ulong)uVar17 >> 0x38)) & 1);
            goto code_r0x00468ca4;
          }
          uVar12 = 0;
          pbVar13 = (byte *)0x0;
          do {
            if (-0x41 < (char)pbVar10[(long)pbVar13]) {
              uVar12 = uVar12 + 1;
            }
            pbVar13 = pbVar13 + 1;
code_r0x00468ca4:
          } while (pbVar11 != pbVar13);
        }
      }
      else {
        uVar12 = func_0x0046bd58(pbVar10,pbVar11);
      }
    }
    else {
      uVar12 = (ulong)*(ushort *)((long)puVar9 + 0x16);
      if (uVar12 == 0) {
        pbVar11 = (byte *)0x0;
        uVar14 = 0;
      }
      else {
        pbVar13 = pbVar10 + (long)pbVar11;
        pbVar11 = (byte *)0x0;
        uVar14 = uVar12;
        pbVar15 = pbVar10;
        do {
          if (pbVar15 == pbVar13) break;
          bVar18 = *pbVar15;
          pbVar3 = pbVar15 + 3;
          if (0xef < bVar18) {
            pbVar3 = pbVar15 + 4;
          }
          pbVar2 = pbVar15 + 2;
          if (0xdf < bVar18) {
            pbVar2 = pbVar3;
          }
          pbVar3 = pbVar15 + 1;
          if (((int)(char)bVar18 & 0x80000000U) != 0) {
            pbVar3 = pbVar2;
          }
          pbVar11 = pbVar3 + ((long)pbVar11 - (long)pbVar15);
          uVar14 = uVar14 - 1;
          pbVar15 = pbVar3;
        } while (uVar14 != 0);
      }
      uVar12 = uVar12 - uVar14;
    }
    if (uVar12 < *(ushort *)((long)puVar9 + 0x14)) {
      uVar6 = (uint)*(ushort *)((long)puVar9 + 0x14) - (int)uVar12;
      uVar16 = uVar5 >> 0x1d & 3;
      uVar7 = uVar6 >> 1 & 0x7fff;
      if (uVar16 != 2) {
        uVar7 = 0;
      }
      uVar1 = 0;
      if (uVar16 != 0) {
        uVar1 = uVar6;
      }
      if (uVar16 < 2) {
        uVar7 = uVar1;
      }
      uVar16 = 0;
      uVar8 = *puVar9;
      lVar4 = puVar9[1];
      do {
        if ((uVar7 & 0xffff) <= (uVar16 & 0xffff)) {
          uVar12 = (**(code **)(lVar4 + 0x18))(uVar8,pbVar10,pbVar11);
          if ((uVar12 & 1) != 0) {
            return 1;
          }
          uVar16 = 0;
          do {
            if ((uVar6 - uVar7 & 0xffff) <= (uVar16 & 0xffff)) {
              return 0;
            }
            uVar16 = uVar16 + 1;
            uVar12 = (**(code **)(lVar4 + 0x20))(uVar8,uVar5 & 0x1fffff);
          } while ((uVar12 & 1) == 0);
          return 1;
        }
        uVar16 = uVar16 + 1;
        uVar12 = (**(code **)(lVar4 + 0x20))(uVar8,uVar5 & 0x1fffff);
      } while ((uVar12 & 1) == 0);
      return 1;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar8 = (**(code **)(puVar9[1] + 0x18))(*puVar9,pbVar10,pbVar11);
  return uVar8;
}

