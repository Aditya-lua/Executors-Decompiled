/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c14ebc
 */

undefined8 * FUN_00c14ebc(long *param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  byte *pbVar3;
  undefined8 *puVar4;
  long *plVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  byte *pbVar10;
  byte *pbVar11;
  undefined8 *puVar12;
  size_t __n;
  ulong uVar13;
  void *pvVar14;
  long *plVar15;
  undefined8 local_48;
  
  pbVar1 = (byte *)*param_1;
  pbVar2 = (byte *)param_1[1];
  if (pbVar1 == pbVar2) {
    return (undefined8 *)0x0;
  }
  if (*pbVar1 != 0x54) {
    return (undefined8 *)0x0;
  }
  pbVar11 = pbVar1 + 1;
  *param_1 = (long)pbVar11;
  if ((pbVar11 == pbVar2) || (*pbVar11 != 0x4c)) {
    uVar9 = 0;
  }
  else {
    pbVar11 = pbVar1 + 2;
    *param_1 = (long)pbVar11;
    if (pbVar2 == pbVar11) {
      return (undefined8 *)0x0;
    }
    if (*pbVar11 - 0x3a < 0xfffffff6) {
      return (undefined8 *)0x0;
    }
    lVar7 = 0;
    pbVar3 = pbVar1 + 4;
    do {
      pbVar11 = pbVar3;
      pbVar10 = pbVar11 + -1;
      *param_1 = (long)pbVar10;
      lVar8 = (ulong)pbVar11[-2] + lVar7 * 10;
      lVar7 = lVar8 + -0x30;
      if (pbVar10 == pbVar2) break;
      pbVar3 = pbVar11 + 1;
    } while (pbVar11[-1] - 0x30 < 10);
    if (pbVar10 == pbVar2) {
      return (undefined8 *)0x0;
    }
    if (pbVar11[-1] != 0x5f) {
      return (undefined8 *)0x0;
    }
    uVar9 = lVar8 - 0x2f;
    *param_1 = (long)pbVar11;
  }
  if (pbVar11 == pbVar2) {
    return (undefined8 *)0x0;
  }
  if (*pbVar11 == 0x5f) {
    uVar13 = 0;
  }
  else {
    if (*pbVar11 - 0x3a < 0xfffffff6) {
      return (undefined8 *)0x0;
    }
    lVar7 = 0;
    pbVar3 = pbVar11;
    do {
      pbVar11 = pbVar3 + 1;
      *param_1 = (long)pbVar11;
      lVar8 = (ulong)*pbVar3 + lVar7 * 10;
      lVar7 = lVar8 + -0x30;
      if (pbVar11 == pbVar2) break;
      pbVar3 = pbVar11;
    } while (*pbVar11 - 0x30 < 10);
    if (pbVar11 == pbVar2) {
      return (undefined8 *)0x0;
    }
    if (*pbVar11 != 0x5f) {
      return (undefined8 *)0x0;
    }
    uVar13 = lVar8 - 0x2f;
  }
  *param_1 = (long)(pbVar11 + 1);
  if (*(char *)((long)param_1 + 0x30a) == '\x01') {
    pvVar14 = (void *)param_1[0x266];
    lVar7 = *(long *)((long)pvVar14 + 8);
    puVar4 = pvVar14;
    if (lVar7 - 0xfd0U < 0xfffffffffffff00f || lVar7 == -0x21) {
      puVar4 = malloc(0x1000);
      if (puVar4 == (void *)0x0) goto LAB_00c1527c;
      lVar7 = 0;
      *puVar4 = pvVar14;
      puVar4[1] = 0;
      param_1[0x266] = (long)puVar4;
    }
    *(long *)((long)puVar4 + 8) = lVar7 + 0x20;
    puVar12 = (undefined8 *)((long)puVar4 + lVar7 + 0x10);
    *puVar12 = &PTR_LAB_00cb14c0;
    *(undefined1 *)((long)puVar4 + lVar7 + 0x18) = 8;
    *(ushort *)((long)puVar4 + lVar7 + 0x19) =
         *(ushort *)((long)puVar4 + lVar7 + 0x19) & 0xf000 | 0x540;
    *(byte **)((long)puVar4 + lVar7 + 0x20) = pbVar1;
    *(long *)((long)puVar4 + lVar7 + 0x28) = (long)pbVar11 - (long)pbVar1;
    return puVar12;
  }
  if ((*(char *)((long)param_1 + 0x309) != '\x01') || (uVar9 != 0)) {
    uVar6 = param_1[0x54] - param_1[0x53] >> 3;
    if ((uVar9 < uVar6) &&
       ((plVar15 = *(long **)(param_1[0x53] + uVar9 * 8), plVar15 != (long *)0x0 &&
        (uVar13 < (ulong)(plVar15[1] - *plVar15 >> 3))))) {
      return *(undefined8 **)(*plVar15 + uVar13 * 8);
    }
    if (uVar6 < uVar9) {
      return (undefined8 *)0x0;
    }
    if (param_1[0x62] != uVar9) {
      return (undefined8 *)0x0;
    }
    if (uVar9 == uVar6) {
      local_48 = 0;
      FUN_00c15c8c(param_1 + 0x53,&local_48);
    }
    puVar4 = (undefined8 *)FUN_00c15d60(param_1,&DAT_002a1f81);
    return puVar4;
  }
  pvVar14 = (void *)param_1[0x266];
  lVar7 = *(long *)((long)pvVar14 + 8);
  puVar4 = pvVar14;
  if (lVar7 - 0xfc0U < 0xfffffffffffff00f || lVar7 == -0x31) {
    puVar4 = malloc(0x1000);
    if (puVar4 == (void *)0x0) {
LAB_00c1527c:
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    lVar7 = 0;
    *puVar4 = pvVar14;
    puVar4[1] = 0;
    param_1[0x266] = (long)puVar4;
  }
  *(long *)((long)puVar4 + 8) = lVar7 + 0x30;
  puVar12 = (undefined8 *)((long)puVar4 + lVar7 + 0x10);
  *puVar12 = &PTR_FUN_00cb15b0;
  *(ulong *)((long)puVar4 + lVar7 + 0x20) = uVar13;
  *(undefined8 *)((long)puVar4 + lVar7 + 0x28) = 0;
  *(undefined1 *)((long)puVar4 + lVar7 + 0x30) = 0;
  *(ushort *)((long)puVar4 + lVar7 + 0x19) =
       *(ushort *)((long)puVar4 + lVar7 + 0x19) & 0xf000 | 0xa80;
  plVar15 = (long *)param_1[0x5b];
  plVar5 = (long *)param_1[0x5c];
  *(undefined1 *)((long)puVar4 + lVar7 + 0x18) = 0x2c;
  if (plVar15 == plVar5) {
    plVar5 = (long *)param_1[0x5a];
    __n = (long)plVar15 - (long)plVar5;
    if (plVar5 == param_1 + 0x5d) {
      pvVar14 = malloc(__n * 2);
      if (pvVar14 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (plVar15 != plVar5) {
        memmove(pvVar14,plVar5,__n);
      }
      param_1[0x5a] = (long)pvVar14;
    }
    else {
      pvVar14 = realloc(plVar5,__n * 2);
      param_1[0x5a] = (long)pvVar14;
      if (pvVar14 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
    }
    plVar15 = (long *)((long)pvVar14 + __n);
    param_1[0x5c] = (long)((long)pvVar14 + ((long)__n >> 2) * 8);
  }
  *plVar15 = (long)puVar12;
  param_1[0x5b] = (long)(plVar15 + 1);
  return puVar12;
}

