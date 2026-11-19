/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c18d08
 */

undefined8 * FUN_00c18d08(long *param_1)

{
  long lVar1;
  char *pcVar2;
  long lVar3;
  undefined8 *puVar4;
  short *psVar5;
  undefined **ppuVar6;
  char *pcVar7;
  long lVar8;
  long lVar9;
  short *psVar10;
  undefined8 *puVar11;
  void *pvVar12;
  long *plVar13;
  size_t sVar14;
  long lVar15;
  long *plVar16;
  undefined1 uVar17;
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  
  psVar5 = (short *)*param_1;
  psVar10 = (short *)param_1[1];
  if ((ulong)((long)psVar10 - (long)psVar5) < 2) {
    return (undefined8 *)0x0;
  }
  if (*psVar5 == 0x5172) {
    lVar9 = param_1[2];
    lVar1 = param_1[3];
    psVar5 = psVar5 + 1;
    *param_1 = (long)psVar5;
    while ((psVar5 == psVar10 || ((char)*psVar5 != '_'))) {
      lVar3 = FUN_00c10bfc(param_1);
      if (lVar3 == 0) {
        return (undefined8 *)0x0;
      }
      plVar13 = (long *)param_1[3];
      if (plVar13 == (long *)param_1[4]) {
        plVar16 = (long *)param_1[2];
        sVar14 = (long)plVar13 - (long)plVar16;
        if (plVar16 == param_1 + 5) {
          pvVar12 = malloc(sVar14 * 2);
          if (pvVar12 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (plVar13 != param_1 + 5) {
            memmove(pvVar12,plVar16,sVar14);
          }
          param_1[2] = (long)pvVar12;
        }
        else {
          pvVar12 = realloc(plVar16,sVar14 * 2);
          param_1[2] = (long)pvVar12;
          if (pvVar12 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        plVar13 = (long *)((long)pvVar12 + sVar14);
        param_1[4] = (long)((long)pvVar12 + ((long)sVar14 >> 2) * 8);
      }
      psVar5 = (short *)*param_1;
      psVar10 = (short *)param_1[1];
      *plVar13 = lVar3;
      param_1[3] = (long)(plVar13 + 1);
    }
    *param_1 = (long)((long)psVar5 + 1);
    auVar18 = FUN_00c13140(param_1,lVar1 - lVar9 >> 3);
    psVar5 = (short *)*param_1;
    if (psVar5 == (short *)param_1[1]) {
      return (undefined8 *)0x0;
    }
  }
  else {
    if (*psVar5 != 0x7172) {
      return (undefined8 *)0x0;
    }
    auVar18 = ZEXT816(0);
    psVar5 = psVar5 + 1;
    *param_1 = (long)psVar5;
    if (psVar5 == psVar10) {
      return (undefined8 *)0x0;
    }
  }
  lVar9 = param_1[2];
  lVar1 = param_1[3];
  do {
    if ((char)*psVar5 == 'X') {
      *param_1 = (long)((long)psVar5 + 1);
      lVar3 = FUN_00c16098(param_1);
      if (lVar3 == 0) {
        return (undefined8 *)0x0;
      }
      pcVar7 = (char *)*param_1;
      pcVar2 = (char *)param_1[1];
      if ((pcVar7 == pcVar2) || (*pcVar7 != 'N')) {
        uVar17 = 0;
        if (pcVar7 != pcVar2) goto LAB_00c18f88;
LAB_00c18fb4:
        lVar15 = 0;
      }
      else {
        pcVar7 = pcVar7 + 1;
        uVar17 = 1;
        *param_1 = (long)pcVar7;
        if (pcVar7 == pcVar2) goto LAB_00c18fb4;
LAB_00c18f88:
        if (*pcVar7 != 'R') goto LAB_00c18fb4;
        *param_1 = (long)(pcVar7 + 1);
        lVar15 = FUN_00c12574(param_1,0);
        if (lVar15 == 0) {
          return (undefined8 *)0x0;
        }
      }
      pvVar12 = (void *)param_1[0x266];
      lVar8 = *(long *)((long)pvVar12 + 8);
      puVar4 = pvVar12;
      if (lVar8 - 0xfc0U < 0xfffffffffffff00f || lVar8 == -0x31) {
        puVar4 = malloc(0x1000);
        if (puVar4 == (void *)0x0) goto LAB_00c191c8;
        lVar8 = 0;
        *puVar4 = pvVar12;
        puVar4[1] = 0;
        param_1[0x266] = (long)puVar4;
      }
      *(long *)((long)puVar4 + 8) = lVar8 + 0x30;
      puVar11 = (undefined8 *)((long)puVar4 + lVar8 + 0x10);
      *puVar11 = &PTR_LAB_00cb2a80;
      *(undefined1 *)((long)puVar4 + lVar8 + 0x18) = 0x54;
      *(long *)((long)puVar4 + lVar8 + 0x20) = lVar3;
      *(undefined1 *)((long)puVar4 + lVar8 + 0x28) = uVar17;
      *(ushort *)((long)puVar4 + lVar8 + 0x19) =
           *(ushort *)((long)puVar4 + lVar8 + 0x19) & 0xf000 | 0x540;
      *(long *)((long)puVar4 + lVar8 + 0x30) = lVar15;
    }
    else {
      if ((char)*psVar5 == 'T') {
        *param_1 = (long)((long)psVar5 + 1);
        lVar3 = FUN_00c10bfc(param_1);
        if (lVar3 == 0) {
          return (undefined8 *)0x0;
        }
        pvVar12 = (void *)param_1[0x266];
        lVar15 = *(long *)((long)pvVar12 + 8);
        puVar11 = pvVar12;
        if (lVar15 - 0xfd0U < 0xfffffffffffff00f || lVar15 == -0x21) {
          puVar11 = malloc(0x1000);
          if (puVar11 == (void *)0x0) goto LAB_00c191c8;
          lVar15 = 0;
          *puVar11 = pvVar12;
          puVar11[1] = 0;
          param_1[0x266] = (long)puVar11;
        }
        lVar8 = (long)puVar11 + lVar15;
        ppuVar6 = &PTR_LAB_00cb2af8;
        *(long *)((long)puVar11 + 8) = lVar15 + 0x20;
        uVar17 = 0x55;
      }
      else {
        if ((char)*psVar5 != 'Q') {
          return (undefined8 *)0x0;
        }
        *param_1 = (long)((long)psVar5 + 1);
        lVar3 = FUN_00c16098(param_1);
        if (lVar3 == 0) {
          return (undefined8 *)0x0;
        }
        pvVar12 = (void *)param_1[0x266];
        lVar15 = *(long *)((long)pvVar12 + 8);
        puVar11 = pvVar12;
        if (lVar15 - 0xfd0U < 0xfffffffffffff00f || lVar15 == -0x21) {
          puVar11 = malloc(0x1000);
          if (puVar11 == (void *)0x0) goto LAB_00c191c8;
          lVar15 = 0;
          *puVar11 = pvVar12;
          puVar11[1] = 0;
          param_1[0x266] = (long)puVar11;
        }
        lVar8 = (long)puVar11 + lVar15;
        ppuVar6 = &PTR_LAB_00cb2b70;
        *(long *)((long)puVar11 + 8) = lVar15 + 0x20;
        uVar17 = 0x56;
      }
      puVar11 = (undefined8 *)(lVar8 + 0x10);
      *puVar11 = ppuVar6;
      *(undefined1 *)(lVar8 + 0x18) = uVar17;
      *(ushort *)(lVar8 + 0x19) = *(ushort *)(lVar8 + 0x19) & 0xf000 | 0x540;
      *(long *)(lVar8 + 0x20) = lVar3;
    }
    plVar13 = (long *)param_1[3];
    if (plVar13 == (long *)param_1[4]) {
      plVar16 = (long *)param_1[2];
      sVar14 = (long)plVar13 - (long)plVar16;
      if (plVar16 == param_1 + 5) {
        pvVar12 = malloc(sVar14 * 2);
        if (pvVar12 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
          abort();
        }
        if (plVar13 != param_1 + 5) {
          memmove(pvVar12,plVar16,sVar14);
        }
        param_1[2] = (long)pvVar12;
      }
      else {
        pvVar12 = realloc(plVar16,sVar14 * 2);
        param_1[2] = (long)pvVar12;
        if (pvVar12 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
          abort();
        }
      }
      plVar13 = (long *)((long)pvVar12 + sVar14);
      param_1[4] = (long)((long)pvVar12 + ((long)sVar14 >> 2) * 8);
    }
    psVar5 = (short *)*param_1;
    psVar10 = (short *)param_1[1];
    *plVar13 = (long)puVar11;
    param_1[3] = (long)(plVar13 + 1);
    if ((psVar5 != psVar10) && ((char)*psVar5 == 'E')) {
      *param_1 = (long)((long)psVar5 + 1);
      auVar19 = FUN_00c13140(param_1,lVar1 - lVar9 >> 3);
      pvVar12 = (void *)param_1[0x266];
      lVar9 = *(long *)((long)pvVar12 + 8);
      puVar11 = pvVar12;
      if (lVar9 - 0xfc0U < 0xfffffffffffff00f || lVar9 == -0x31) {
        puVar11 = malloc(0x1000);
        if (puVar11 == (void *)0x0) {
LAB_00c191c8:
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar9 = 0;
        *puVar11 = pvVar12;
        puVar11[1] = 0;
        param_1[0x266] = (long)puVar11;
      }
      *(long *)((long)puVar11 + 8) = lVar9 + 0x30;
      puVar4 = (undefined8 *)((long)puVar11 + lVar9 + 0x10);
      *puVar4 = &PTR_LAB_00cb2be8;
      *(undefined1 *)((long)puVar11 + lVar9 + 0x18) = 0x53;
      *(undefined1 (*) [16])((long)puVar11 + lVar9 + 0x30) = auVar19;
      *(undefined1 (*) [16])((long)puVar11 + lVar9 + 0x20) = auVar18;
      *(ushort *)((long)puVar11 + lVar9 + 0x19) =
           *(ushort *)((long)puVar11 + lVar9 + 0x19) & 0xf000 | 0x540;
      return puVar4;
    }
    if (psVar5 == psVar10) {
      return (undefined8 *)0x0;
    }
  } while( true );
}

