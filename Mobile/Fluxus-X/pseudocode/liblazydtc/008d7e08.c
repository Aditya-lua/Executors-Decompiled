/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d7e08
 */

int LZ4_decompress_fast(ushort *param_1,void *param_2,int param_3)

{
  long lVar1;
  ulong uVar2;
  ushort *puVar3;
  byte bVar4;
  undefined8 *puVar5;
  ushort uVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  undefined1 *puVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  byte *__src;
  byte *pbVar16;
  ushort *puVar18;
  ushort *puVar17;
  void *__dest;
  ulong __n;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  
  lVar1 = (long)param_2 + (long)param_3;
  puVar17 = param_1;
  __dest = param_2;
  do {
    __src = (byte *)((long)puVar17 + 1);
    uVar6 = *puVar17;
    bVar4 = (byte)uVar6 >> 4;
    __n = (ulong)bVar4;
    if (bVar4 == 0xf) {
      lVar7 = 0;
      pbVar16 = __src;
      do {
        __src = pbVar16 + 1;
        bVar4 = *pbVar16;
        lVar7 = lVar7 + (ulong)bVar4;
        pbVar16 = __src;
      } while ((ulong)bVar4 == 0xff);
      __n = lVar7 + 0xf;
    }
    if ((ulong)(lVar1 - (long)__dest) < __n) {
      return -1;
    }
    memmove(__dest,__src,__n);
    lVar7 = (long)__dest + __n;
    puVar3 = (ushort *)(__src + __n);
    if ((ulong)(lVar1 - lVar7) < 0xc) {
      if (lVar7 == lVar1) {
        return (int)puVar3 - (int)param_1;
      }
      return -1;
    }
    uVar9 = (ulong)(byte)uVar6 & 0xf;
    puVar17 = puVar3 + 1;
    uVar13 = (ulong)*puVar3;
    if ((int)uVar9 == 0xf) {
      lVar8 = 0;
      puVar18 = puVar17;
      do {
        puVar17 = (ushort *)((long)puVar18 + 1);
        uVar6 = *puVar18;
        lVar8 = lVar8 + (ulong)(byte)uVar6;
        puVar18 = puVar17;
      } while ((ulong)(byte)uVar6 == 0xff);
      uVar9 = lVar8 + 0xf;
    }
    uVar2 = uVar9 + 4;
    if ((ulong)(lVar1 - lVar7) < uVar2 || (ulong)(lVar7 - (long)param_2) < uVar13) {
      return -1;
    }
    if (uVar2 != 0) {
      uVar11 = 0;
      if ((7 < uVar2) && (0x1f < *puVar3)) {
        if (uVar2 < 0x20) {
          uVar12 = 0;
        }
        else {
          uVar11 = uVar2 & 0xffffffffffffffe0;
          puVar14 = (undefined8 *)((long)__dest + (__n - uVar13) + 0x10);
          puVar15 = (undefined8 *)((long)__dest + __n + 0x10);
          uVar12 = uVar11;
          do {
            puVar5 = puVar14 + -1;
            uVar19 = puVar14[-2];
            uVar21 = puVar14[1];
            uVar20 = *puVar14;
            uVar12 = uVar12 - 0x20;
            puVar14 = puVar14 + 4;
            puVar15[-1] = *puVar5;
            puVar15[-2] = uVar19;
            puVar15[1] = uVar21;
            *puVar15 = uVar20;
            puVar15 = puVar15 + 4;
          } while (uVar12 != 0);
          if (uVar2 == uVar11) goto LAB_008d7e38;
          uVar12 = uVar11;
          if ((uVar2 & 0x18) == 0) goto LAB_008d7f74;
        }
        uVar11 = uVar2 & 0xfffffffffffffff8;
        lVar8 = uVar12 - uVar11;
        puVar14 = (undefined8 *)((long)__dest + uVar12 + __n);
        do {
          lVar8 = lVar8 + 8;
          *puVar14 = *(undefined8 *)((long)puVar14 + -uVar13);
          puVar14 = puVar14 + 1;
        } while (lVar8 != 0);
        if (uVar2 == uVar11) goto LAB_008d7e38;
      }
LAB_008d7f74:
      lVar8 = (uVar9 - uVar11) + 4;
      puVar10 = (undefined1 *)((long)__dest + uVar11 + __n);
      do {
        lVar8 = lVar8 + -1;
        *puVar10 = puVar10[-uVar13];
        puVar10 = puVar10 + 1;
      } while (lVar8 != 0);
    }
LAB_008d7e38:
    __dest = (void *)(lVar7 + uVar2);
    if ((ulong)(lVar1 - (long)__dest) < 5) {
      return -1;
    }
  } while( true );
}

