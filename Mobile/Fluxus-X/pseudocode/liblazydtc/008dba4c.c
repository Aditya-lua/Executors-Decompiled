/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dba4c
 */

ulong LZ4_decompress_fast_continue(long *param_1,ushort *param_2,void *param_3,int param_4)

{
  ulong uVar1;
  void *__src;
  byte bVar2;
  uint uVar3;
  undefined8 *puVar4;
  ushort uVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  undefined1 *puVar11;
  long lVar12;
  ulong uVar13;
  undefined8 *puVar14;
  undefined1 *puVar15;
  undefined8 *puVar16;
  ulong uVar17;
  ulong uVar18;
  long lVar19;
  int iVar20;
  ushort *puVar21;
  byte *pbVar22;
  byte *pbVar23;
  ushort *puVar24;
  void *pvVar25;
  long lVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  
  lVar7 = param_1[3];
  iVar20 = (int)param_2;
  if (lVar7 == 0) {
    lVar7 = (long)param_3 + (long)param_4;
    pvVar25 = param_3;
    do {
      pbVar22 = (byte *)((long)param_2 + 1);
      uVar5 = *param_2;
      bVar2 = (byte)uVar5 >> 4;
      uVar6 = (ulong)bVar2;
      if (bVar2 == 0xf) {
        lVar8 = 0;
        pbVar23 = pbVar22;
        do {
          pbVar22 = pbVar23 + 1;
          bVar2 = *pbVar23;
          lVar8 = lVar8 + (ulong)bVar2;
          pbVar23 = pbVar22;
        } while ((ulong)bVar2 == 0xff);
        uVar6 = lVar8 + 0xf;
      }
      if ((ulong)(lVar7 - (long)pvVar25) < uVar6) {
        return 0xffffffff;
      }
      memmove(pvVar25,pbVar22,uVar6);
      lVar8 = (long)pvVar25 + uVar6;
      puVar24 = (ushort *)(pbVar22 + uVar6);
      if ((ulong)(lVar7 - lVar8) < 0xc) {
        if (lVar8 != lVar7) {
          return 0xffffffff;
        }
        uVar3 = (int)puVar24 - iVar20;
        if ((int)uVar3 < 1) {
          return (ulong)uVar3;
        }
        param_1[3] = (long)param_4;
        param_1[1] = lVar7;
        return (ulong)uVar3;
      }
      uVar10 = (ulong)(byte)uVar5 & 0xf;
      param_2 = puVar24 + 1;
      uVar13 = (ulong)*puVar24;
      if ((int)uVar10 == 0xf) {
        lVar12 = 0;
        puVar21 = param_2;
        do {
          param_2 = (ushort *)((long)puVar21 + 1);
          uVar5 = *puVar21;
          lVar12 = lVar12 + (ulong)(byte)uVar5;
          puVar21 = param_2;
        } while ((ulong)(byte)uVar5 == 0xff);
        uVar10 = lVar12 + 0xf;
      }
      uVar1 = uVar10 + 4;
      if ((ulong)(lVar7 - lVar8) < uVar1 || (ulong)(lVar8 - (long)param_3) < uVar13) {
        return 0xffffffff;
      }
      if (uVar1 != 0) {
        uVar17 = 0;
        if ((7 < uVar1) && (0x1f < *puVar24)) {
          if (uVar1 < 0x20) {
            uVar18 = 0;
          }
          else {
            uVar17 = uVar1 & 0xffffffffffffffe0;
            puVar14 = (undefined8 *)((long)pvVar25 + (uVar6 - uVar13) + 0x10);
            puVar16 = (undefined8 *)((long)pvVar25 + uVar6 + 0x10);
            uVar18 = uVar17;
            do {
              puVar4 = puVar14 + -1;
              uVar27 = puVar14[-2];
              uVar29 = puVar14[1];
              uVar28 = *puVar14;
              uVar18 = uVar18 - 0x20;
              puVar14 = puVar14 + 4;
              puVar16[-1] = *puVar4;
              puVar16[-2] = uVar27;
              puVar16[1] = uVar29;
              *puVar16 = uVar28;
              puVar16 = puVar16 + 4;
            } while (uVar18 != 0);
            if (uVar1 == uVar17) goto LAB_008dbadc;
            uVar18 = uVar17;
            if ((uVar1 & 0x18) == 0) goto LAB_008dbc18;
          }
          uVar17 = uVar1 & 0xfffffffffffffff8;
          lVar12 = uVar18 - uVar17;
          puVar14 = (undefined8 *)((long)pvVar25 + uVar18 + uVar6);
          do {
            lVar12 = lVar12 + 8;
            *puVar14 = *(undefined8 *)((long)puVar14 + -uVar13);
            puVar14 = puVar14 + 1;
          } while (lVar12 != 0);
          if (uVar1 == uVar17) goto LAB_008dbadc;
        }
LAB_008dbc18:
        lVar12 = (uVar10 - uVar17) + 4;
        puVar11 = (undefined1 *)((long)pvVar25 + uVar17 + uVar6);
        do {
          lVar12 = lVar12 + -1;
          *puVar11 = puVar11[-uVar13];
          puVar11 = puVar11 + 1;
        } while (lVar12 != 0);
      }
LAB_008dbadc:
      pvVar25 = (void *)(lVar8 + uVar1);
    } while (4 < (ulong)(lVar7 - (long)pvVar25));
  }
  else {
    if ((void *)param_1[1] != param_3) {
      param_1[2] = lVar7;
      *param_1 = param_1[1] - lVar7;
      uVar6 = FUN_008dbe88(param_2,param_3,param_4);
      if ((int)uVar6 < 1) {
        return uVar6;
      }
      param_1[3] = (long)param_4;
      param_1[1] = (long)param_3 + (long)param_4;
      return uVar6;
    }
    lVar12 = (long)param_4;
    lVar26 = param_1[2];
    lVar7 = (long)param_3 - lVar7;
    pvVar25 = (void *)((long)param_3 + lVar12);
    lVar8 = *param_1 + lVar26;
    while( true ) {
      pbVar22 = (byte *)((long)param_2 + 1);
      uVar5 = *param_2;
      bVar2 = (byte)uVar5 >> 4;
      uVar6 = (ulong)bVar2;
      if (bVar2 == 0xf) {
        lVar9 = 0;
        pbVar23 = pbVar22;
        do {
          pbVar22 = pbVar23 + 1;
          bVar2 = *pbVar23;
          lVar9 = lVar9 + (ulong)bVar2;
          pbVar23 = pbVar22;
        } while ((ulong)bVar2 == 0xff);
        uVar6 = lVar9 + 0xf;
      }
      if ((ulong)((long)pvVar25 - (long)param_3) < uVar6) {
        return 0xffffffff;
      }
      memmove(param_3,pbVar22,uVar6);
      param_3 = (void *)((long)param_3 + uVar6);
      puVar24 = (ushort *)(pbVar22 + uVar6);
      if ((ulong)((long)pvVar25 - (long)param_3) < 0xc) break;
      uVar6 = (ulong)(byte)uVar5 & 0xf;
      param_2 = puVar24 + 1;
      uVar10 = (ulong)*puVar24;
      if ((int)uVar6 == 0xf) {
        lVar9 = 0;
        puVar24 = param_2;
        do {
          param_2 = (ushort *)((long)puVar24 + 1);
          uVar5 = *puVar24;
          lVar9 = lVar9 + (ulong)(byte)uVar5;
          puVar24 = param_2;
        } while ((ulong)(byte)uVar5 == 0xff);
        uVar6 = lVar9 + 0xf;
      }
      uVar6 = uVar6 + 4;
      if ((ulong)((long)pvVar25 - (long)param_3) < uVar6) {
        return 0xffffffff;
      }
      uVar13 = (long)param_3 - lVar7;
      if (uVar13 + lVar26 < uVar10) {
        return 0xffffffff;
      }
      if (uVar13 < uVar10) {
        __src = (void *)(lVar8 + (uVar13 - uVar10));
        uVar10 = lVar8 - (long)__src;
        uVar13 = uVar6 - uVar10;
        if (uVar6 < uVar10) {
          memmove(param_3,__src,uVar6);
          uVar13 = 0;
          uVar10 = uVar6;
        }
        else {
          memmove(param_3,__src,uVar10);
        }
        param_3 = (void *)((long)param_3 + uVar10);
        lVar9 = lVar7;
      }
      else {
        uVar13 = uVar6;
        lVar9 = (long)param_3 - uVar10;
      }
      if (uVar13 != 0) {
        uVar6 = 0;
        if ((7 < uVar13) && (0x1f < (ulong)((long)param_3 - lVar9))) {
          if (uVar13 < 0x20) {
            uVar10 = 0;
          }
          else {
            uVar6 = uVar13 & 0xffffffffffffffe0;
            puVar14 = (undefined8 *)(lVar9 + 0x10);
            puVar16 = (undefined8 *)((long)param_3 + 0x10);
            uVar10 = uVar6;
            do {
              puVar4 = puVar14 + -1;
              uVar27 = puVar14[-2];
              uVar29 = puVar14[1];
              uVar28 = *puVar14;
              uVar10 = uVar10 - 0x20;
              puVar14 = puVar14 + 4;
              puVar16[-1] = *puVar4;
              puVar16[-2] = uVar27;
              puVar16[1] = uVar29;
              *puVar16 = uVar28;
              puVar16 = puVar16 + 4;
            } while (uVar10 != 0);
            if (uVar13 == uVar6) goto LAB_008dbc60;
            uVar10 = uVar6;
            if ((uVar13 & 0x18) == 0) goto LAB_008dbdec;
          }
          uVar6 = uVar13 & 0xfffffffffffffff8;
          lVar19 = uVar10 - uVar6;
          puVar14 = (undefined8 *)(lVar9 + uVar10);
          puVar16 = (undefined8 *)((long)param_3 + uVar10);
          do {
            lVar19 = lVar19 + 8;
            *puVar16 = *puVar14;
            puVar14 = puVar14 + 1;
            puVar16 = puVar16 + 1;
          } while (lVar19 != 0);
          if (uVar13 == uVar6) goto LAB_008dbc60;
        }
LAB_008dbdec:
        lVar19 = uVar13 - uVar6;
        puVar11 = (undefined1 *)(lVar9 + uVar6);
        puVar15 = (undefined1 *)((long)param_3 + uVar6);
        do {
          lVar19 = lVar19 + -1;
          *puVar15 = *puVar11;
          puVar11 = puVar11 + 1;
          puVar15 = puVar15 + 1;
        } while (lVar19 != 0);
      }
LAB_008dbc60:
      param_3 = (void *)((long)param_3 + uVar13);
      if ((ulong)((long)pvVar25 - (long)param_3) < 5) {
        return 0xffffffff;
      }
    }
    if (param_3 == pvVar25) {
      uVar3 = (int)puVar24 - iVar20;
      if ((int)uVar3 < 1) {
        return (ulong)uVar3;
      }
      param_1[3] = param_1[3] + lVar12;
      param_1[1] = param_1[1] + lVar12;
      return (ulong)uVar3;
    }
  }
  return 0xffffffff;
}

