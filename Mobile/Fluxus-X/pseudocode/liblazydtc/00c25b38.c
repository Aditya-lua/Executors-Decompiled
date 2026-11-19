/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c25b38
 */

undefined8 * FUN_00c25b38(long *param_1)

{
  byte *pbVar1;
  char *pcVar2;
  short *psVar3;
  char *pcVar4;
  byte *pbVar5;
  byte bVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ushort uVar9;
  long lVar10;
  long lVar11;
  byte *pbVar12;
  long lVar13;
  byte *pbVar14;
  void *pvVar15;
  long local_40;
  undefined8 *local_38;
  
  psVar3 = (short *)*param_1;
  pbVar5 = (byte *)param_1[1];
  if (((ulong)((long)pbVar5 - (long)psVar3) < 2) || (*psVar3 != 0x7644)) {
LAB_00c25b70:
    puVar7 = (undefined8 *)0x0;
  }
  else {
    pbVar1 = (byte *)(psVar3 + 1);
    *param_1 = (long)pbVar1;
    if ((pbVar5 == pbVar1) || (bVar6 = *pbVar1, bVar6 < 0x31)) {
LAB_00c25d20:
      lVar13 = FUN_00c16098();
      if (lVar13 == 0) {
        return (undefined8 *)0x0;
      }
      pcVar4 = (char *)*param_1;
      if ((pcVar4 == (char *)param_1[1]) || (*pcVar4 != '_')) goto LAB_00c25b70;
      *param_1 = (long)(pcVar4 + 1);
      lVar10 = FUN_00c10bfc(param_1);
      if (lVar10 == 0) {
        return (undefined8 *)0x0;
      }
      pvVar15 = (void *)param_1[0x266];
      lVar11 = *(long *)((long)pvVar15 + 8);
      puVar8 = pvVar15;
      if (lVar11 - 0xfd0U < 0xfffffffffffff00f || lVar11 == -0x21) {
        puVar8 = malloc(0x1000);
        if (puVar8 == (void *)0x0) {
LAB_00c25de8:
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar11 = 0;
        *puVar8 = pvVar15;
        puVar8[1] = 0;
        param_1[0x266] = (long)puVar8;
      }
      *(long *)((long)puVar8 + 8) = lVar11 + 0x20;
      puVar7 = (undefined8 *)((long)puVar8 + lVar11 + 0x10);
      *puVar7 = &PTR_LAB_00cb3e30;
      uVar9 = *(ushort *)((long)puVar8 + lVar11 + 0x19);
      *(long *)((long)puVar8 + lVar11 + 0x20) = lVar10;
      *(long *)((long)puVar8 + lVar11 + 0x28) = lVar13;
    }
    else {
      if (bVar6 < 0x3a) {
        pbVar14 = (byte *)(psVar3 + 1);
        pbVar12 = pbVar1;
        do {
          if (*pbVar12 - 0x3a < 0xfffffff6) goto LAB_00c25be4;
          pbVar12 = pbVar12 + 1;
          pbVar14 = pbVar14 + 1;
          *param_1 = (long)pbVar12;
        } while (pbVar12 != pbVar5);
        pbVar14 = pbVar5;
LAB_00c25be4:
        pvVar15 = (void *)param_1[0x266];
        lVar13 = *(long *)((long)pvVar15 + 8);
        puVar7 = pvVar15;
        if (lVar13 - 0xfd0U < 0xfffffffffffff00f || lVar13 == -0x21) {
          puVar7 = malloc(0x1000);
          if (puVar7 == (void *)0x0) goto LAB_00c25de8;
          lVar13 = 0;
          *puVar7 = pvVar15;
          puVar7[1] = 0;
          param_1[0x266] = (long)puVar7;
        }
        *(long *)((long)puVar7 + 8) = lVar13 + 0x20;
        local_38 = (undefined8 *)((long)puVar7 + lVar13 + 0x10);
        *local_38 = &PTR_LAB_00cb14c0;
        *(byte **)((long)puVar7 + lVar13 + 0x20) = pbVar1;
        *(undefined1 *)((long)puVar7 + lVar13 + 0x18) = 8;
        *(long *)((long)puVar7 + lVar13 + 0x28) = (long)pbVar14 - (long)pbVar1;
        *(ushort *)((long)puVar7 + lVar13 + 0x19) =
             *(ushort *)((long)puVar7 + lVar13 + 0x19) & 0xf000 | 0x540;
        pcVar4 = (char *)*param_1;
        if ((pcVar4 != (char *)param_1[1]) && (*pcVar4 == '_')) {
          pcVar2 = pcVar4 + 1;
          *param_1 = (long)pcVar2;
          if ((pcVar2 != (char *)param_1[1]) && (*pcVar2 == 'p')) {
            *param_1 = (long)(pcVar4 + 2);
            puVar7 = (undefined8 *)FUN_00c2751c(param_1,&local_38);
            return puVar7;
          }
          local_40 = FUN_00c10bfc();
          if (local_40 == 0) {
            return (undefined8 *)0x0;
          }
          puVar7 = (undefined8 *)FUN_00c275bc(param_1,&local_40,&local_38);
          return puVar7;
        }
        goto LAB_00c25b70;
      }
      if (bVar6 != 0x5f) goto LAB_00c25d20;
      *param_1 = (long)psVar3 + 3;
      lVar13 = FUN_00c10bfc();
      if (lVar13 == 0) {
        return (undefined8 *)0x0;
      }
      pvVar15 = (void *)param_1[0x266];
      lVar10 = *(long *)((long)pvVar15 + 8);
      puVar8 = pvVar15;
      if (lVar10 - 0xfd0U < 0xfffffffffffff00f || lVar10 == -0x21) {
        puVar8 = malloc(0x1000);
        if (puVar8 == (void *)0x0) goto LAB_00c25de8;
        lVar10 = 0;
        *puVar8 = pvVar15;
        puVar8[1] = 0;
        param_1[0x266] = (long)puVar8;
      }
      *(long *)((long)puVar8 + 8) = lVar10 + 0x20;
      puVar7 = (undefined8 *)((long)puVar8 + lVar10 + 0x10);
      *puVar7 = &PTR_LAB_00cb3e30;
      uVar9 = *(ushort *)((long)puVar8 + lVar10 + 0x19);
      *(long *)((long)puVar8 + lVar10 + 0x20) = lVar13;
      *(undefined8 *)((long)puVar8 + lVar10 + 0x28) = 0;
    }
    *(undefined1 *)(puVar7 + 1) = 0x1d;
    *(ushort *)((long)puVar7 + 9) = uVar9 & 0xf000 | 0x540;
  }
  return puVar7;
}

