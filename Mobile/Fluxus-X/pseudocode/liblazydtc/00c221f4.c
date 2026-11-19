/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c221f4
 */

undefined8 * FUN_00c221f4(long *param_1,undefined1 *param_2)

{
  byte *pbVar1;
  byte *pbVar2;
  byte *pbVar3;
  byte bVar4;
  undefined1 uVar5;
  long lVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  size_t sVar9;
  undefined **ppuVar10;
  long lVar11;
  undefined1 uVar12;
  long lVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  char *__s;
  void *pvVar17;
  
  pbVar2 = (byte *)*param_1;
  pbVar3 = (byte *)param_1[1];
  if (1 < (ulong)((long)pbVar3 - (long)pbVar2)) {
    bVar4 = *pbVar2;
    uVar14 = 0;
    uVar15 = 0x3e;
    do {
      uVar16 = uVar14 + uVar15 >> 1;
      if ((byte)(&UNK_00cb1618)[uVar16 * 0x10] < bVar4) {
        uVar14 = uVar16 + 1;
      }
      else if ((&UNK_00cb1618)[uVar16 * 0x10] == bVar4) {
        if ((byte)(&UNK_00cb1619)[uVar16 * 0x10] < pbVar2[1]) {
          uVar14 = uVar16 + 1;
          uVar16 = uVar15;
        }
        uVar15 = uVar16;
      }
      else {
        uVar15 = uVar16;
      }
    } while (uVar15 != uVar14);
    lVar11 = uVar14 * 0x10;
    if (((&UNK_00cb1618)[lVar11] == bVar4) && ((&UNK_00cb1619)[lVar11] == pbVar2[1])) {
      bVar4 = (&UNK_00cb161a)[lVar11];
      *param_1 = (long)(pbVar2 + 2);
      if (bVar4 == 8) {
        uVar5 = *(undefined1 *)((long)param_1 + 0x309);
        lVar11 = param_1[0x61];
        *(undefined1 *)(param_1 + 0x61) = 0;
        uVar12 = uVar5;
        if (param_2 != (undefined1 *)0x0) {
          uVar12 = 1;
        }
        *(undefined1 *)((long)param_1 + 0x309) = uVar12;
                    /* try { // try from 00c222d0 to 00c222d7 has its CatchHandler @ 00c2255c */
        lVar6 = FUN_00c10bfc();
        if (lVar6 == 0) {
          puVar8 = (undefined8 *)0x0;
        }
        else {
          if (param_2 != (undefined1 *)0x0) {
            *param_2 = 1;
          }
          pvVar17 = (void *)param_1[0x266];
          lVar13 = *(long *)((long)pvVar17 + 8);
          puVar7 = pvVar17;
          if (lVar13 - 0xfd0U < 0xfffffffffffff00f || lVar13 == -0x21) {
            puVar7 = malloc(0x1000);
            if (puVar7 == (void *)0x0) goto LAB_00c22558;
            lVar13 = 0;
            *puVar7 = pvVar17;
            puVar7[1] = 0;
            param_1[0x266] = (long)puVar7;
          }
          *(long *)((long)puVar7 + 8) = lVar13 + 0x20;
          puVar8 = (undefined8 *)((long)puVar7 + lVar13 + 0x10);
          *puVar8 = &PTR_LAB_00cb2f30;
          *(long *)((long)puVar7 + lVar13 + 0x20) = lVar6;
          *(undefined1 *)((long)puVar7 + lVar13 + 0x18) = 4;
          *(ushort *)((long)puVar7 + lVar13 + 0x19) =
               *(ushort *)((long)puVar7 + lVar13 + 0x19) & 0xf000 | 0x540;
        }
        *(undefined1 *)((long)param_1 + 0x309) = uVar5;
        *(char *)(param_1 + 0x61) = (char)lVar11;
        return puVar8;
      }
      if (10 < bVar4) {
        return (undefined8 *)0x0;
      }
      if ((bVar4 == 4) && (((&UNK_00cb161b)[lVar11] & 1) == 0)) {
        return (undefined8 *)0x0;
      }
      __s = *(char **)(&UNK_00cb1620 + lVar11);
      sVar9 = strlen(__s);
      pvVar17 = (void *)param_1[0x266];
      lVar11 = *(long *)((long)pvVar17 + 8);
      puVar8 = pvVar17;
      if (0xfffffffffffff00e < lVar11 - 0xfd0U && lVar11 != -0x21) {
LAB_00c22508:
        *(long *)((long)puVar8 + 8) = lVar11 + 0x20;
        puVar7 = (undefined8 *)((long)puVar8 + lVar11 + 0x10);
        *puVar7 = &PTR_LAB_00cb14c0;
        *(char **)((long)puVar8 + lVar11 + 0x20) = __s;
        *(size_t *)((long)puVar8 + lVar11 + 0x28) = sVar9;
        *(undefined1 *)((long)puVar8 + lVar11 + 0x18) = 8;
        *(ushort *)((long)puVar8 + lVar11 + 0x19) =
             *(ushort *)((long)puVar8 + lVar11 + 0x19) & 0xf000 | 0x540;
        return puVar7;
      }
      puVar8 = malloc(0x1000);
      if (puVar8 != (void *)0x0) {
        lVar11 = 0;
        *puVar8 = pvVar17;
        puVar8[1] = 0;
        param_1[0x266] = (long)puVar8;
        goto LAB_00c22508;
      }
      goto LAB_00c22558;
    }
    if (*(short *)pbVar2 == 0x696c) {
      *param_1 = (long)(pbVar2 + 2);
      lVar11 = FUN_00c14270();
      if (lVar11 == 0) {
        return (undefined8 *)0x0;
      }
      pvVar17 = (void *)param_1[0x266];
      lVar6 = *(long *)((long)pvVar17 + 8);
      puVar8 = pvVar17;
      if (lVar6 - 0xfd0U < 0xfffffffffffff00f || lVar6 == -0x21) {
        puVar8 = malloc(0x1000);
        if (puVar8 == (void *)0x0) goto LAB_00c22558;
        lVar6 = 0;
        *puVar8 = pvVar17;
        puVar8[1] = 0;
        param_1[0x266] = (long)puVar8;
      }
      lVar13 = (long)puVar8 + lVar6;
      ppuVar10 = &PTR_LAB_00cb2fa8;
      *(long *)((long)puVar8 + 8) = lVar6 + 0x20;
      uVar12 = 0x14;
      goto LAB_00c22468;
    }
  }
  if ((pbVar2 != pbVar3) && (*pbVar2 == 0x76)) {
    pbVar1 = pbVar2 + 1;
    *param_1 = (long)pbVar1;
    if ((pbVar3 != pbVar1) && (*pbVar1 - 0x30 < 10)) {
      *param_1 = (long)(pbVar2 + 2);
      lVar11 = FUN_00c14270();
      if (lVar11 == 0) {
        return (undefined8 *)0x0;
      }
      pvVar17 = (void *)param_1[0x266];
      lVar6 = *(long *)((long)pvVar17 + 8);
      puVar8 = pvVar17;
      if (lVar6 - 0xfd0U < 0xfffffffffffff00f || lVar6 == -0x21) {
        puVar8 = malloc(0x1000);
        if (puVar8 == (void *)0x0) {
LAB_00c22558:
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar6 = 0;
        *puVar8 = pvVar17;
        puVar8[1] = 0;
        param_1[0x266] = (long)puVar8;
      }
      lVar13 = (long)puVar8 + lVar6;
      ppuVar10 = &PTR_LAB_00cb2f30;
      *(long *)((long)puVar8 + 8) = lVar6 + 0x20;
      uVar12 = 4;
LAB_00c22468:
      *(undefined8 *)(lVar13 + 0x10) = ppuVar10;
      *(undefined1 *)(lVar13 + 0x18) = uVar12;
      *(long *)(lVar13 + 0x20) = lVar11;
      *(ushort *)(lVar13 + 0x19) = *(ushort *)(lVar13 + 0x19) & 0xf000 | 0x540;
      return (undefined8 *)(lVar13 + 0x10);
    }
  }
  return (undefined8 *)0x0;
}

