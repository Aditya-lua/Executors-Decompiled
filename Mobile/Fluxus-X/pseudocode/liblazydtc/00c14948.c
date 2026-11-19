/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c14948
 */

undefined8 * FUN_00c14948(long *param_1,ulong param_2)

{
  ushort uVar1;
  long lVar2;
  char cVar3;
  undefined1 uVar4;
  long *plVar5;
  undefined8 *puVar6;
  void *pvVar7;
  long lVar8;
  undefined8 *puVar9;
  ushort uVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  char *pcVar15;
  char *pcVar16;
  size_t sVar17;
  long *plVar18;
  long *plVar19;
  undefined1 auVar20 [16];
  
  pcVar15 = (char *)*param_1;
  pcVar16 = (char *)param_1[1];
  if ((pcVar15 == pcVar16) || (*pcVar15 != 'I')) {
    return (undefined8 *)0x0;
  }
  pcVar15 = pcVar15 + 1;
  *param_1 = (long)pcVar15;
  if ((param_2 & 1) != 0) {
    plVar5 = (long *)param_1[0x53];
    param_1[0x54] = (long)plVar5;
    if (plVar5 == (long *)param_1[0x55]) {
      if (plVar5 == param_1 + 0x56) {
        plVar5 = malloc(0);
        if (plVar5 == (long *)0x0) {
                    /* WARNING: Subroutine does not return */
          abort();
        }
        param_1[0x53] = (long)plVar5;
      }
      else {
        plVar5 = realloc(plVar5,0);
        param_1[0x53] = (long)plVar5;
        if (plVar5 == (long *)0x0) {
                    /* WARNING: Subroutine does not return */
          abort();
        }
        pcVar15 = (char *)*param_1;
        pcVar16 = (char *)param_1[1];
      }
      param_1[0x55] = (long)plVar5;
    }
    lVar12 = param_1[0x48];
    *plVar5 = (long)(param_1 + 0x48);
    param_1[0x54] = (long)(plVar5 + 1);
    param_1[0x49] = lVar12;
  }
  lVar12 = param_1[2];
  lVar2 = param_1[3];
  plVar5 = param_1 + 5;
LAB_00c14a18:
  if ((pcVar15 == pcVar16) || (*pcVar15 != 'E')) {
    puVar6 = (undefined8 *)FUN_00c12c94(param_1);
    if ((param_2 & 1) == 0) {
      if (puVar6 == (undefined8 *)0x0) {
        return (undefined8 *)0x0;
      }
      plVar19 = (long *)param_1[3];
      if (plVar19 == (long *)param_1[4]) {
        plVar18 = (long *)param_1[2];
        sVar17 = (long)plVar19 - (long)plVar18;
        if (plVar18 == plVar5) {
          pvVar7 = malloc(sVar17 * 2);
          if (pvVar7 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
          if (plVar19 != plVar5) {
            memmove(pvVar7,plVar18,sVar17);
          }
          param_1[2] = (long)pvVar7;
        }
        else {
          pvVar7 = realloc(plVar18,sVar17 * 2);
          param_1[2] = (long)pvVar7;
          if (pvVar7 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
            abort();
          }
        }
        plVar19 = (long *)((long)pvVar7 + sVar17);
        param_1[4] = (long)((long)pvVar7 + ((long)sVar17 >> 2) * 8);
      }
      *plVar19 = (long)puVar6;
      param_1[3] = (long)(plVar19 + 1);
      goto LAB_00c14cd8;
    }
    if (puVar6 == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
    plVar19 = (long *)param_1[3];
    if (plVar19 == (long *)param_1[4]) {
      plVar18 = (long *)param_1[2];
      sVar17 = (long)plVar19 - (long)plVar18;
      if (plVar18 == plVar5) {
        pvVar7 = malloc(sVar17 * 2);
        if (pvVar7 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
          abort();
        }
        if (plVar19 != plVar5) {
          memmove(pvVar7,plVar18,sVar17);
        }
        param_1[2] = (long)pvVar7;
      }
      else {
        pvVar7 = realloc(plVar18,sVar17 * 2);
        param_1[2] = (long)pvVar7;
        if (pvVar7 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
          abort();
        }
      }
      plVar19 = (long *)((long)pvVar7 + sVar17);
      param_1[4] = (long)((long)pvVar7 + ((long)sVar17 >> 2) * 8);
    }
    cVar3 = *(char *)(puVar6 + 1);
    *plVar19 = (long)puVar6;
    param_1[3] = (long)(plVar19 + 1);
    if (cVar3 != ')') {
      if (cVar3 == '\"') {
        puVar6 = (undefined8 *)puVar6[3];
      }
      goto LAB_00c14c14;
    }
    pvVar7 = (void *)param_1[0x266];
    plVar19 = (long *)puVar6[2];
    lVar8 = puVar6[3];
    lVar11 = *(long *)((long)pvVar7 + 8);
    puVar9 = pvVar7;
    if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
      puVar9 = malloc(0x1000);
      if (puVar9 == (void *)0x0) goto LAB_00c14df4;
      lVar11 = 0;
      *puVar9 = pvVar7;
      puVar9[1] = 0;
      param_1[0x266] = (long)puVar9;
    }
    *(long *)((long)puVar9 + 8) = lVar11 + 0x20;
    lVar13 = lVar8 << 3;
    puVar6 = (undefined8 *)((long)puVar9 + lVar11 + 0x10);
    *puVar6 = &PTR_LAB_00cb34d0;
    *(undefined1 *)((long)puVar9 + lVar11 + 0x18) = 0x28;
    uVar1 = *(ushort *)((long)puVar9 + lVar11 + 0x19) & 0xf000;
    *(long **)((long)puVar9 + lVar11 + 0x20) = plVar19;
    *(long *)((long)puVar9 + lVar11 + 0x28) = lVar8;
    uVar10 = uVar1 | 0xa80;
    *(ushort *)((long)puVar9 + lVar11 + 0x19) = uVar10;
    if (lVar8 != 0) {
      lVar14 = lVar13;
      plVar18 = plVar19;
      do {
        if ((*(ushort *)(*plVar18 + 9) & 0x300) != 0x100) goto LAB_00c14bac;
        lVar14 = lVar14 + -8;
        plVar18 = plVar18 + 1;
      } while (lVar14 != 0);
    }
    uVar10 = uVar1 | 0x980;
    *(ushort *)((long)puVar9 + lVar11 + 0x19) = uVar10;
LAB_00c14bac:
    if (lVar8 != 0) {
      lVar14 = lVar13;
      plVar18 = plVar19;
      do {
        if ((*(ushort *)(*plVar18 + 9) & 0xc00) != 0x400) goto joined_r0x00c14be4;
        lVar14 = lVar14 + -8;
        plVar18 = plVar18 + 1;
      } while (lVar14 != 0);
    }
    uVar10 = uVar10 & 0xf3ff | 0x400;
    *(ushort *)((long)puVar9 + lVar11 + 0x19) = uVar10;
joined_r0x00c14be4:
    do {
      if (lVar8 == 0) goto LAB_00c14c08;
      if ((*(ushort *)(*plVar19 + 9) & 0xc0) != 0x40) goto LAB_00c14c14;
      lVar13 = lVar13 + -8;
      plVar19 = plVar19 + 1;
      lVar8 = lVar13;
    } while( true );
  }
  lVar8 = 0;
  goto LAB_00c14d5c;
LAB_00c14c08:
  *(ushort *)((long)puVar9 + lVar11 + 0x19) = uVar10 & 0xff7f | 0x40;
LAB_00c14c14:
  plVar19 = (long *)param_1[0x49];
  if (plVar19 == (long *)param_1[0x4a]) {
    plVar18 = (long *)param_1[0x48];
    sVar17 = (long)plVar19 - (long)plVar18;
    if (plVar18 == param_1 + 0x4b) {
      pvVar7 = malloc(sVar17 * 2);
      if (pvVar7 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (plVar19 != param_1 + 0x4b) {
        memmove(pvVar7,plVar18,sVar17);
      }
      param_1[0x48] = (long)pvVar7;
    }
    else {
      pvVar7 = realloc(plVar18,sVar17 * 2);
      param_1[0x48] = (long)pvVar7;
      if (pvVar7 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
    }
    plVar19 = (long *)((long)pvVar7 + sVar17);
    param_1[0x4a] = (long)((long)pvVar7 + ((long)sVar17 >> 2) * 8);
  }
  *plVar19 = (long)puVar6;
  param_1[0x49] = (long)(plVar19 + 1);
LAB_00c14cd8:
  pcVar15 = (char *)*param_1;
  pcVar16 = (char *)param_1[1];
  if ((pcVar15 != pcVar16) && (*pcVar15 == 'Q')) {
    uVar4 = *(undefined1 *)((long)param_1 + 0x30a);
    *param_1 = (long)(pcVar15 + 1);
    *(undefined1 *)((long)param_1 + 0x30a) = 1;
                    /* try { // try from 00c14d04 to 00c14d0b has its CatchHandler @ 00c14e0c */
    lVar8 = FUN_00c16098(param_1);
    *(undefined1 *)((long)param_1 + 0x30a) = uVar4;
    if (lVar8 == 0) {
      return (undefined8 *)0x0;
    }
    pcVar15 = (char *)*param_1;
    if (pcVar15 == (char *)param_1[1]) {
      return (undefined8 *)0x0;
    }
    if (*pcVar15 != 'E') {
      return (undefined8 *)0x0;
    }
LAB_00c14d5c:
    *param_1 = (long)(pcVar15 + 1);
    auVar20 = FUN_00c13140(param_1,lVar2 - lVar12 >> 3);
    pvVar7 = (void *)param_1[0x266];
    lVar12 = *(long *)((long)pvVar7 + 8);
    puVar6 = pvVar7;
    if (lVar12 - 0xfc0U < 0xfffffffffffff00f || lVar12 == -0x31) {
      puVar6 = malloc(0x1000);
      if (puVar6 == (void *)0x0) {
LAB_00c14df4:
                    /* WARNING: Subroutine does not return */
        std::terminate();
      }
      lVar12 = 0;
      *puVar6 = pvVar7;
      puVar6[1] = 0;
      param_1[0x266] = (long)puVar6;
    }
    *(long *)((long)puVar6 + 8) = lVar12 + 0x30;
    puVar9 = (undefined8 *)((long)puVar6 + lVar12 + 0x10);
    *puVar9 = &PTR_LAB_00cb3548;
    *(undefined1 *)((long)puVar6 + lVar12 + 0x18) = 0x2b;
    *(undefined1 (*) [16])((long)puVar6 + lVar12 + 0x20) = auVar20;
    *(long *)((long)puVar6 + lVar12 + 0x30) = lVar8;
    *(ushort *)((long)puVar6 + lVar12 + 0x19) =
         *(ushort *)((long)puVar6 + lVar12 + 0x19) & 0xf000 | 0x540;
    return puVar9;
  }
  goto LAB_00c14a18;
}

