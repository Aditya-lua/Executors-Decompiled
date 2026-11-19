/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c24d58
 */

/* WARNING: Type propagation algorithm not settling */

undefined8 * FUN_00c24d58(long *param_1)

{
  byte *pbVar1;
  byte bVar2;
  ushort uVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  long lVar9;
  byte *pbVar10;
  byte *pbVar11;
  ulong uVar12;
  ulong uVar13;
  byte *pbVar14;
  uint uVar15;
  ulong uVar16;
  byte *pbVar17;
  byte *pbVar18;
  void *pvVar19;
  
  pbVar10 = (byte *)*param_1;
  pbVar1 = (byte *)param_1[1];
  if (pbVar10 == pbVar1) {
LAB_00c24ea8:
    uVar15 = 0;
  }
  else {
    if (*pbVar10 == 0x55) {
      pbVar18 = pbVar10 + 1;
      *param_1 = (long)pbVar18;
      if ((pbVar1 == pbVar18) || (*pbVar18 - 0x3a < 0xfffffff6)) {
        return (undefined8 *)0x0;
      }
      lVar4 = 0;
      pbVar18 = (byte *)0x0;
      do {
        pbVar17 = pbVar18;
        lVar6 = lVar4;
        pbVar14 = pbVar10 + lVar6 + 2;
        *param_1 = (long)pbVar14;
        uVar12 = (ulong)pbVar10[lVar6 + 1];
        pbVar18 = (byte *)(uVar12 + (long)pbVar17 * 10 + -0x30);
        if (pbVar14 == pbVar1) break;
        lVar4 = lVar6 + 1;
      } while (*pbVar14 - 0x30 < 10);
      if (pbVar1 + (-lVar6 - (long)pbVar10) + -2 < pbVar18) {
        return (undefined8 *)0x0;
      }
      pbVar11 = pbVar10 + uVar12 + (long)pbVar17 * 10 + lVar6 + -0x2e;
      *param_1 = (long)pbVar11;
      if (pbVar18 == (byte *)0x0) {
        return (undefined8 *)0x0;
      }
      if (((byte *)0x8 < pbVar18) &&
         (*(long *)(pbVar10 + lVar6 + 2) == 0x746f7270636a626f && pbVar10[lVar6 + 10] == 0x6f)) {
        *param_1 = (long)(pbVar10 + lVar6 + 0xb);
        param_1[1] = (long)pbVar11;
        if ((pbVar18 != (byte *)0x9) && (0xfffffff5 < pbVar10[lVar6 + 0xb] - 0x3a)) {
          uVar16 = 0;
          pbVar18 = pbVar10 + lVar6 + 0xc;
          uVar12 = (uVar12 + (long)pbVar17 * 10) - 0x3a;
          pbVar10 = pbVar10 + lVar6 + 0xc;
          do {
            pbVar14 = pbVar10;
            uVar13 = uVar12;
            *param_1 = (long)pbVar18;
            uVar16 = ((ulong)pbVar18[-1] + uVar16 * 10) - 0x30;
            if (uVar13 == 0) break;
            bVar2 = *pbVar18;
            pbVar18 = pbVar18 + 1;
            uVar12 = uVar13 - 1;
            pbVar10 = pbVar14 + 1;
          } while (bVar2 - 0x30 < 10);
          if (uVar16 <= uVar13) {
            *param_1 = (long)pbVar11;
            param_1[1] = (long)pbVar1;
            if (uVar16 == 0) {
              return (undefined8 *)0x0;
            }
            lVar4 = FUN_00c24d58(param_1);
            if (lVar4 == 0) {
              return (undefined8 *)0x0;
            }
            pvVar19 = (void *)param_1[0x266];
            lVar6 = *(long *)((long)pvVar19 + 8);
            puVar7 = pvVar19;
            if (lVar6 - 0xfc0U < 0xfffffffffffff00f || lVar6 == -0x31) {
              puVar7 = malloc(0x1000);
              if (puVar7 == (void *)0x0) goto LAB_00c2512c;
              lVar6 = 0;
              *puVar7 = pvVar19;
              puVar7[1] = 0;
              param_1[0x266] = (long)puVar7;
            }
            *(long *)((long)puVar7 + 8) = lVar6 + 0x30;
            puVar8 = (undefined8 *)((long)puVar7 + lVar6 + 0x10);
            *puVar8 = &PTR_LAB_00cb3a70;
            *(undefined1 *)((long)puVar7 + lVar6 + 0x18) = 0xb;
            *(long *)((long)puVar7 + lVar6 + 0x20) = lVar4;
            *(byte **)((long)puVar7 + lVar6 + 0x28) = pbVar14;
            *(ulong *)((long)puVar7 + lVar6 + 0x30) = uVar16;
            *(ushort *)((long)puVar7 + lVar6 + 0x19) =
                 *(ushort *)((long)puVar7 + lVar6 + 0x19) & 0xf000 | 0x540;
            return puVar8;
          }
        }
        *param_1 = (long)pbVar11;
        param_1[1] = (long)pbVar1;
        return (undefined8 *)0x0;
      }
      if ((pbVar11 == pbVar1) || (*pbVar11 != 0x49)) {
        lVar4 = 0;
      }
      else {
        lVar4 = FUN_00c14948(param_1,0);
        if (lVar4 == 0) {
          return (undefined8 *)0x0;
        }
      }
      lVar6 = FUN_00c24d58(param_1);
      if (lVar6 == 0) {
        return (undefined8 *)0x0;
      }
      pvVar19 = (void *)param_1[0x266];
      lVar9 = *(long *)((long)pvVar19 + 8);
      puVar7 = pvVar19;
      if (0xfffffffffffff00e < lVar9 - 0xfc0U && lVar9 != -0x31) {
LAB_00c24fc0:
        *(long *)((long)puVar7 + 8) = lVar9 + 0x30;
        puVar8 = (undefined8 *)((long)puVar7 + lVar9 + 0x10);
        *puVar8 = &PTR_LAB_00cb3ae8;
        *(undefined1 *)((long)puVar7 + lVar9 + 0x18) = 2;
        *(long *)((long)puVar7 + lVar9 + 0x20) = lVar6;
        *(byte **)((long)puVar7 + lVar9 + 0x28) = pbVar14;
        *(byte **)((long)puVar7 + lVar9 + 0x30) = pbVar18;
        *(long *)((long)puVar7 + lVar9 + 0x38) = lVar4;
        *(ushort *)((long)puVar7 + lVar9 + 0x19) =
             *(ushort *)((long)puVar7 + lVar9 + 0x19) & 0xf000 | 0x540;
        return puVar8;
      }
      puVar7 = malloc(0x1000);
      if (puVar7 != (void *)0x0) {
        lVar9 = 0;
        *puVar7 = pvVar19;
        puVar7[1] = 0;
        param_1[0x266] = (long)puVar7;
        goto LAB_00c24fc0;
      }
      goto LAB_00c2512c;
    }
    if (*pbVar10 != 0x72) goto LAB_00c24ea8;
    pbVar10 = pbVar10 + 1;
    uVar15 = 4;
    *param_1 = (long)pbVar10;
  }
  if ((pbVar10 != pbVar1) && (*pbVar10 == 0x56)) {
    pbVar10 = pbVar10 + 1;
    uVar15 = uVar15 | 2;
    *param_1 = (long)pbVar10;
  }
  if ((pbVar10 != pbVar1) && (*pbVar10 == 0x4b)) {
    uVar15 = uVar15 | 1;
    *param_1 = (long)(pbVar10 + 1);
  }
  puVar8 = (undefined8 *)FUN_00c10bfc(param_1);
  puVar7 = puVar8;
  if ((puVar8 != (undefined8 *)0x0) && (uVar15 != 0)) {
    pvVar19 = (void *)param_1[0x266];
    lVar4 = *(long *)((long)pvVar19 + 8);
    puVar5 = pvVar19;
    if (lVar4 - 0xfd0U < 0xfffffffffffff00f || lVar4 == -0x21) {
      puVar5 = malloc(0x1000);
      if (puVar5 == (void *)0x0) {
LAB_00c2512c:
                    /* WARNING: Subroutine does not return */
        std::terminate();
      }
      lVar4 = 0;
      *puVar5 = pvVar19;
      puVar5[1] = 0;
      param_1[0x266] = (long)puVar5;
    }
    *(long *)((long)puVar5 + 8) = lVar4 + 0x20;
    uVar3 = *(ushort *)((long)puVar8 + 9);
    puVar7 = (undefined8 *)((long)puVar5 + lVar4 + 0x10);
    *puVar7 = &PTR_LAB_00cb3b60;
    *(undefined8 **)((long)puVar5 + lVar4 + 0x20) = puVar8;
    *(undefined1 *)((long)puVar5 + lVar4 + 0x18) = 3;
    *(uint *)((long)puVar5 + lVar4 + 0x1c) = uVar15;
    *(ushort *)((long)puVar5 + lVar4 + 0x19) =
         *(ushort *)((long)puVar5 + lVar4 + 0x19) & 0xf000 | uVar3 & 0xfc0;
  }
  return puVar7;
}

