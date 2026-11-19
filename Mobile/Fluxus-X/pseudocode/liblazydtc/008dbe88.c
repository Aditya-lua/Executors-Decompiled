/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dbe88
 */

int FUN_008dbe88(ushort *param_1,void *param_2,int param_3,long param_4,long param_5)

{
  void *pvVar1;
  void *pvVar2;
  byte bVar3;
  undefined8 *puVar4;
  ushort uVar5;
  long lVar6;
  ulong uVar7;
  undefined1 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined1 *puVar11;
  undefined8 *puVar12;
  byte *__src;
  byte *pbVar13;
  ushort *puVar15;
  ushort *puVar14;
  void *pvVar16;
  ulong uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  pvVar1 = (void *)((long)param_2 + (long)param_3);
  puVar14 = param_1;
  pvVar16 = param_2;
  do {
    __src = (byte *)((long)puVar14 + 1);
    uVar5 = *puVar14;
    bVar3 = (byte)uVar5 >> 4;
    uVar17 = (ulong)bVar3;
    if (bVar3 == 0xf) {
      lVar6 = 0;
      pbVar13 = __src;
      do {
        __src = pbVar13 + 1;
        bVar3 = *pbVar13;
        lVar6 = lVar6 + (ulong)bVar3;
        pbVar13 = __src;
      } while ((ulong)bVar3 == 0xff);
      uVar17 = lVar6 + 0xf;
    }
    if ((ulong)((long)pvVar1 - (long)pvVar16) < uVar17) {
      return -1;
    }
    memmove(pvVar16,__src,uVar17);
    pvVar16 = (void *)((long)pvVar16 + uVar17);
    puVar15 = (ushort *)(__src + uVar17);
    if ((ulong)((long)pvVar1 - (long)pvVar16) < 0xc) {
      if (pvVar16 == pvVar1) {
        return (int)puVar15 - (int)param_1;
      }
      return -1;
    }
    uVar17 = (ulong)(byte)uVar5 & 0xf;
    puVar14 = puVar15 + 1;
    uVar7 = (ulong)*puVar15;
    if ((int)uVar17 == 0xf) {
      lVar6 = 0;
      puVar15 = puVar14;
      do {
        puVar14 = (ushort *)((long)puVar15 + 1);
        uVar5 = *puVar15;
        lVar6 = lVar6 + (ulong)(byte)uVar5;
        puVar15 = puVar14;
      } while ((ulong)(byte)uVar5 == 0xff);
      uVar17 = lVar6 + 0xf;
    }
    uVar17 = uVar17 + 4;
    if ((ulong)((long)pvVar1 - (long)pvVar16) < uVar17) {
      return -1;
    }
    uVar9 = (long)pvVar16 - (long)param_2;
    if (uVar9 + param_5 < uVar7) {
      return -1;
    }
    if (uVar9 < uVar7) {
      pvVar2 = (void *)(param_4 + param_5 + (uVar9 - uVar7));
      uVar7 = (param_4 + param_5) - (long)pvVar2;
      uVar9 = uVar17 - uVar7;
      if (uVar17 < uVar7) {
        memmove(pvVar16,pvVar2,uVar17);
        uVar9 = 0;
        uVar7 = uVar17;
      }
      else {
        memmove(pvVar16,pvVar2,uVar7);
      }
      pvVar16 = (void *)((long)pvVar16 + uVar7);
      pvVar2 = param_2;
    }
    else {
      uVar9 = uVar17;
      pvVar2 = (void *)((long)pvVar16 - uVar7);
    }
    if (uVar9 != 0) {
      uVar17 = 0;
      if ((7 < uVar9) && (0x1f < (ulong)((long)pvVar16 - (long)pvVar2))) {
        if (uVar9 < 0x20) {
          uVar7 = 0;
        }
        else {
          uVar17 = uVar9 & 0xffffffffffffffe0;
          puVar10 = (undefined8 *)((long)pvVar2 + 0x10);
          puVar12 = (undefined8 *)((long)pvVar16 + 0x10);
          uVar7 = uVar17;
          do {
            puVar4 = puVar10 + -1;
            uVar18 = puVar10[-2];
            uVar20 = puVar10[1];
            uVar19 = *puVar10;
            uVar7 = uVar7 - 0x20;
            puVar10 = puVar10 + 4;
            puVar12[-1] = *puVar4;
            puVar12[-2] = uVar18;
            puVar12[1] = uVar20;
            *puVar12 = uVar19;
            puVar12 = puVar12 + 4;
          } while (uVar7 != 0);
          if (uVar9 == uVar17) goto LAB_008dbec4;
          uVar7 = uVar17;
          if ((uVar9 & 0x18) == 0) goto LAB_008dc050;
        }
        uVar17 = uVar9 & 0xfffffffffffffff8;
        lVar6 = uVar7 - uVar17;
        puVar10 = (undefined8 *)((long)pvVar2 + uVar7);
        puVar12 = (undefined8 *)((long)pvVar16 + uVar7);
        do {
          lVar6 = lVar6 + 8;
          *puVar12 = *puVar10;
          puVar10 = puVar10 + 1;
          puVar12 = puVar12 + 1;
        } while (lVar6 != 0);
        if (uVar9 == uVar17) goto LAB_008dbec4;
      }
LAB_008dc050:
      lVar6 = uVar9 - uVar17;
      puVar8 = (undefined1 *)((long)pvVar2 + uVar17);
      puVar11 = (undefined1 *)((long)pvVar16 + uVar17);
      do {
        lVar6 = lVar6 + -1;
        *puVar11 = *puVar8;
        puVar8 = puVar8 + 1;
        puVar11 = puVar11 + 1;
      } while (lVar6 != 0);
    }
LAB_008dbec4:
    pvVar16 = (void *)((long)pvVar16 + uVar9);
    if ((ulong)((long)pvVar1 - (long)pvVar16) < 5) {
      return -1;
    }
  } while( true );
}

