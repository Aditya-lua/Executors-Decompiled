/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c15688
 */

undefined8 * FUN_00c15688(long *param_1,undefined1 *param_2,long param_3,long param_4)

{
  char *pcVar1;
  byte bVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  long lVar6;
  bool bVar7;
  byte *pbVar8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  byte *pbVar12;
  undefined **ppuVar13;
  undefined1 uVar14;
  byte *pbVar15;
  void *pvVar16;
  size_t __n;
  long *__src;
  long *plVar17;
  bool bVar18;
  undefined1 auVar19 [16];
  long local_78;
  long local_70;
  undefined1 local_64 [4];
  long local_48;
  
  local_78 = param_4;
  local_70 = param_3;
  uVar3 = FUN_00c13df0(param_1,&local_78);
  if ((uVar3 & 1) != 0) {
    return (undefined8 *)0x0;
  }
  pbVar8 = (byte *)*param_1;
  pbVar12 = (byte *)param_1[1];
  if (param_3 == 0) {
LAB_00c15704:
    bVar18 = true;
joined_r0x00c1570c:
    if ((pbVar8 != pbVar12) && (*pbVar8 == 0x4c)) {
      pbVar8 = pbVar8 + 1;
      *param_1 = (long)pbVar8;
    }
    if (pbVar12 == pbVar8) goto LAB_00c1580c;
    bVar2 = *pbVar8;
    if (bVar2 < 0x31) {
LAB_00c1576c:
      if (((ulong)((long)pbVar12 - (long)pbVar8) < 2) || (*(short *)pbVar8 != 0x4344)) {
        if (1 < *pbVar8 - 0x43) goto LAB_00c1580c;
        if (param_3 == 0) {
          return (undefined8 *)0x0;
        }
        if (local_78 != 0) {
          return (undefined8 *)0x0;
        }
        if (*(char *)(param_3 + 8) == '0') {
          local_48 = param_3;
          param_3 = FUN_00c23198(param_1,&local_48);
          pbVar8 = (byte *)*param_1;
          pbVar12 = (byte *)param_1[1];
          local_70 = param_3;
        }
        if (pbVar8 == pbVar12) {
          return (undefined8 *)0x0;
        }
        if (*pbVar8 == 0x43) {
          pbVar15 = pbVar8 + 1;
          *param_1 = (long)pbVar15;
          if ((pbVar15 == pbVar12) || (*pbVar15 != 0x49)) {
            bVar7 = false;
          }
          else {
            pbVar15 = pbVar8 + 2;
            bVar7 = true;
            *param_1 = (long)pbVar15;
          }
          if (pbVar12 == pbVar15) {
            return (undefined8 *)0x0;
          }
          if (4 < *pbVar15 - 0x31) {
            return (undefined8 *)0x0;
          }
          local_48 = CONCAT44(local_48._4_4_,*pbVar15 - 0x30);
          *param_1 = (long)(pbVar15 + 1);
          if (param_2 != (undefined1 *)0x0) {
            *param_2 = 1;
          }
          if ((bVar7) && (lVar11 = FUN_00c12574(param_1,param_2), lVar11 == 0)) {
            puVar4 = (undefined8 *)0x0;
            goto LAB_00c1581c;
          }
          local_64[0] = 0;
        }
        else {
          if ((ulong)((long)pbVar12 - (long)pbVar8) < 2) {
            return (undefined8 *)0x0;
          }
          if (*pbVar8 != 0x44) {
            return (undefined8 *)0x0;
          }
          bVar2 = pbVar8[1];
          if (0x35 < bVar2) {
            return (undefined8 *)0x0;
          }
          if ((1L << ((ulong)bVar2 & 0x3f) & 0x37000000000000U) == 0) {
            return (undefined8 *)0x0;
          }
          local_48 = CONCAT44(local_48._4_4_,bVar2 - 0x30);
          *param_1 = (long)(pbVar8 + 2);
          if (param_2 != (undefined1 *)0x0) {
            *param_2 = 1;
          }
          local_64[0] = 1;
        }
        puVar4 = (undefined8 *)FUN_00c2323c(param_1,&local_70,local_64,&local_48);
      }
      else {
        lVar11 = param_1[2];
        lVar9 = param_1[3];
        *param_1 = (long)(pbVar8 + 2);
        lVar6 = FUN_00c14270(param_1);
        if (lVar6 == 0) {
          return (undefined8 *)0x0;
        }
        while( true ) {
          plVar17 = (long *)param_1[3];
          if (plVar17 == (long *)param_1[4]) {
            __src = (long *)param_1[2];
            __n = (long)plVar17 - (long)__src;
            if (__src == param_1 + 5) {
              pvVar16 = malloc(__n * 2);
              if (pvVar16 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
                abort();
              }
              if (plVar17 != param_1 + 5) {
                memmove(pvVar16,__src,__n);
              }
              param_1[2] = (long)pvVar16;
            }
            else {
              pvVar16 = realloc(__src,__n * 2);
              param_1[2] = (long)pvVar16;
              if (pvVar16 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
                abort();
              }
            }
            plVar17 = (long *)((long)pvVar16 + __n);
            param_1[4] = (long)((long)pvVar16 + ((long)__n >> 2) * 8);
          }
          *plVar17 = lVar6;
          pcVar1 = (char *)*param_1;
          param_1[3] = (long)(plVar17 + 1);
          if ((pcVar1 != (char *)param_1[1]) && (*pcVar1 == 'E')) break;
          lVar6 = FUN_00c14270(param_1);
          if (lVar6 == 0) {
            return (undefined8 *)0x0;
          }
        }
        *param_1 = (long)(pcVar1 + 1);
        auVar19 = FUN_00c13140(param_1,lVar9 - lVar11 >> 3);
        pvVar16 = (void *)param_1[0x266];
        lVar11 = *(long *)((long)pvVar16 + 8);
        puVar5 = pvVar16;
        if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
          puVar5 = malloc(0x1000);
          if (puVar5 == (void *)0x0) goto LAB_00c15be0;
          lVar11 = 0;
          *puVar5 = pvVar16;
          puVar5[1] = 0;
          param_1[0x266] = (long)puVar5;
        }
        *(long *)((long)puVar5 + 8) = lVar11 + 0x20;
        puVar4 = (undefined8 *)((long)puVar5 + lVar11 + 0x10);
        *puVar4 = &PTR_LAB_00cb3200;
        *(undefined1 (*) [16])((long)puVar5 + lVar11 + 0x20) = auVar19;
        *(undefined1 *)((long)puVar5 + lVar11 + 0x18) = 0x35;
        *(ushort *)((long)puVar5 + lVar11 + 0x19) =
             *(ushort *)((long)puVar5 + lVar11 + 0x19) & 0xf000 | 0x540;
      }
    }
    else if (bVar2 < 0x3a) {
      puVar4 = (undefined8 *)FUN_00c14270(param_1);
    }
    else {
      if (bVar2 != 0x55) goto LAB_00c1576c;
      puVar4 = (undefined8 *)FUN_00c1c92c(param_1,param_2);
    }
  }
  else {
    if (pbVar8 != pbVar12) {
      if (*pbVar8 != 0x46) goto LAB_00c15704;
      bVar18 = false;
      pbVar8 = pbVar8 + 1;
      *param_1 = (long)pbVar8;
      goto joined_r0x00c1570c;
    }
    bVar18 = true;
LAB_00c1580c:
    puVar4 = (undefined8 *)FUN_00c221f4(param_1,param_2);
  }
LAB_00c1581c:
  lVar11 = local_78;
  if ((puVar4 == (undefined8 *)0x0) || (local_78 == 0)) {
    if (puVar4 == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
  }
  else {
    pvVar16 = (void *)param_1[0x266];
    lVar9 = *(long *)((long)pvVar16 + 8);
    puVar5 = pvVar16;
    if (lVar9 - 0xfd0U < 0xfffffffffffff00f || lVar9 == -0x21) {
      puVar5 = malloc(0x1000);
      if (puVar5 == (void *)0x0) goto LAB_00c15be0;
      lVar9 = 0;
      *puVar5 = pvVar16;
      puVar5[1] = 0;
      param_1[0x266] = (long)puVar5;
    }
    *(long *)((long)puVar5 + 8) = lVar9 + 0x20;
    puVar10 = (undefined8 *)((long)puVar5 + lVar9 + 0x10);
    *puVar10 = &PTR_LAB_00cb32f0;
    *(long *)((long)puVar5 + lVar9 + 0x20) = lVar11;
    *(undefined8 **)((long)puVar5 + lVar9 + 0x28) = puVar4;
    *(undefined1 *)((long)puVar5 + lVar9 + 0x18) = 0x1c;
    *(ushort *)((long)puVar5 + lVar9 + 0x19) =
         *(ushort *)((long)puVar5 + lVar9 + 0x19) & 0xf000 | 0x540;
    puVar4 = puVar10;
  }
  puVar4 = (undefined8 *)FUN_00c228c4(param_1,puVar4);
  if (puVar4 == (undefined8 *)0x0) {
    bVar18 = true;
  }
  if (bVar18) {
    if (param_3 == 0) {
      return puVar4;
    }
    if (puVar4 == (undefined8 *)0x0) {
      return (undefined8 *)0x0;
    }
    puVar5 = (undefined8 *)param_1[0x266];
    lVar11 = puVar5[1];
    if (0xfffffffffffff00e < lVar11 - 0xfd0U && lVar11 != -0x21) {
      ppuVar13 = &PTR_LAB_00cb33e0;
      uVar14 = 0x18;
      goto LAB_00c1595c;
    }
    puVar10 = malloc(0x1000);
    if (puVar10 == (void *)0x0) goto LAB_00c15be0;
    ppuVar13 = &PTR_LAB_00cb33e0;
    uVar14 = 0x18;
    *puVar10 = puVar5;
    puVar10[1] = 0;
  }
  else {
    puVar5 = (undefined8 *)param_1[0x266];
    lVar11 = puVar5[1];
    if (0xfffffffffffff00e < lVar11 - 0xfd0U && lVar11 != -0x21) {
      ppuVar13 = &PTR_LAB_00cb3368;
      uVar14 = 0x19;
      goto LAB_00c1595c;
    }
    puVar10 = malloc(0x1000);
    if (puVar10 == (undefined8 *)0x0) {
LAB_00c15be0:
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    *puVar10 = puVar5;
    puVar10[1] = 0;
    ppuVar13 = &PTR_LAB_00cb3368;
    uVar14 = 0x19;
  }
  lVar11 = 0;
  param_1[0x266] = (long)puVar10;
  puVar5 = puVar10;
LAB_00c1595c:
  puVar5[1] = lVar11 + 0x20;
  puVar10 = (undefined8 *)((long)puVar5 + lVar11 + 0x10);
  *puVar10 = ppuVar13;
  *(long *)((long)puVar5 + lVar11 + 0x20) = param_3;
  *(undefined8 **)((long)puVar5 + lVar11 + 0x28) = puVar4;
  *(undefined1 *)((long)puVar5 + lVar11 + 0x18) = uVar14;
  *(ushort *)((long)puVar5 + lVar11 + 0x19) =
       *(ushort *)((long)puVar5 + lVar11 + 0x19) & 0xf000 | 0x540;
  return puVar10;
}

