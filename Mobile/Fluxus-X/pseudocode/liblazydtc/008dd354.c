/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd354
 */

ulong LZ4_decompress_fast_usingDict
                (ushort *param_1,void *param_2,int param_3,long param_4,int param_5)

{
  long lVar1;
  ulong uVar2;
  ushort *puVar3;
  byte bVar4;
  undefined8 *puVar5;
  ushort uVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  undefined1 *puVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  byte *__src;
  byte *pbVar18;
  ushort *puVar20;
  ushort *puVar19;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  
  if (param_5 == 0) {
    lVar8 = 0;
  }
  else {
    lVar8 = (long)param_5;
    if ((void *)(param_4 + lVar8) != param_2) {
      uVar7 = FUN_008dbe88(param_1,param_2);
      return uVar7;
    }
  }
  lVar1 = (long)param_2 + (long)param_3;
  lVar8 = (long)param_2 - lVar8;
  puVar19 = param_1;
  do {
    __src = (byte *)((long)puVar19 + 1);
    uVar6 = *puVar19;
    bVar4 = (byte)uVar6 >> 4;
    uVar7 = (ulong)bVar4;
    if (bVar4 == 0xf) {
      lVar9 = 0;
      pbVar18 = __src;
      do {
        __src = pbVar18 + 1;
        bVar4 = *pbVar18;
        lVar9 = lVar9 + (ulong)bVar4;
        pbVar18 = __src;
      } while ((ulong)bVar4 == 0xff);
      uVar7 = lVar9 + 0xf;
    }
    if ((ulong)(lVar1 - (long)param_2) < uVar7) {
      return 0xffffffff;
    }
    memmove(param_2,__src,uVar7);
    lVar9 = (long)param_2 + uVar7;
    puVar3 = (ushort *)(__src + uVar7);
    if ((ulong)(lVar1 - lVar9) < 0xc) {
      if (lVar9 == lVar1) {
        return (ulong)(uint)((int)puVar3 - (int)param_1);
      }
      return 0xffffffff;
    }
    uVar11 = (ulong)(byte)uVar6 & 0xf;
    puVar19 = puVar3 + 1;
    uVar15 = (ulong)*puVar3;
    if ((int)uVar11 == 0xf) {
      lVar10 = 0;
      puVar20 = puVar19;
      do {
        puVar19 = (ushort *)((long)puVar20 + 1);
        uVar6 = *puVar20;
        lVar10 = lVar10 + (ulong)(byte)uVar6;
        puVar20 = puVar19;
      } while ((ulong)(byte)uVar6 == 0xff);
      uVar11 = lVar10 + 0xf;
    }
    uVar2 = uVar11 + 4;
    if ((ulong)(lVar1 - lVar9) < uVar2 || (ulong)(lVar9 - lVar8) < uVar15) {
      return 0xffffffff;
    }
    if (uVar2 != 0) {
      uVar13 = 0;
      if ((7 < uVar2) && (0x1f < *puVar3)) {
        if (uVar2 < 0x20) {
          uVar14 = 0;
        }
        else {
          uVar13 = uVar2 & 0xffffffffffffffe0;
          puVar16 = (undefined8 *)((long)param_2 + (uVar7 - uVar15) + 0x10);
          puVar17 = (undefined8 *)((long)param_2 + uVar7 + 0x10);
          uVar14 = uVar13;
          do {
            puVar5 = puVar16 + -1;
            uVar21 = puVar16[-2];
            uVar23 = puVar16[1];
            uVar22 = *puVar16;
            uVar14 = uVar14 - 0x20;
            puVar16 = puVar16 + 4;
            puVar17[-1] = *puVar5;
            puVar17[-2] = uVar21;
            puVar17[1] = uVar23;
            *puVar17 = uVar22;
            puVar17 = puVar17 + 4;
          } while (uVar14 != 0);
          if (uVar2 == uVar13) goto LAB_008dd3bc;
          uVar14 = uVar13;
          if ((uVar2 & 0x18) == 0) goto LAB_008dd4f8;
        }
        uVar13 = uVar2 & 0xfffffffffffffff8;
        lVar10 = uVar14 - uVar13;
        puVar16 = (undefined8 *)((long)param_2 + uVar14 + uVar7);
        do {
          lVar10 = lVar10 + 8;
          *puVar16 = *(undefined8 *)((long)puVar16 + -uVar15);
          puVar16 = puVar16 + 1;
        } while (lVar10 != 0);
        if (uVar2 == uVar13) goto LAB_008dd3bc;
      }
LAB_008dd4f8:
      lVar10 = (uVar11 - uVar13) + 4;
      puVar12 = (undefined1 *)((long)param_2 + uVar13 + uVar7);
      do {
        lVar10 = lVar10 + -1;
        *puVar12 = puVar12[-uVar15];
        puVar12 = puVar12 + 1;
      } while (lVar10 != 0);
    }
LAB_008dd3bc:
    param_2 = (void *)(lVar9 + uVar2);
    if ((ulong)(lVar1 - (long)param_2) < 5) {
      return 0xffffffff;
    }
  } while( true );
}

