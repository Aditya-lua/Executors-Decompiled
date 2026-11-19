/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c18414
 */

undefined8 * FUN_00c18414(long *param_1)

{
  short *psVar1;
  byte *pbVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  byte *pbVar5;
  long lVar6;
  byte *pbVar7;
  byte *pbVar8;
  long lVar9;
  void *pvVar10;
  byte *local_40;
  long lStack_38;
  
  psVar1 = (short *)*param_1;
  pbVar2 = (byte *)param_1[1];
  if ((ulong)((long)pbVar2 - (long)psVar1) < 3) {
    if ((long)pbVar2 - (long)psVar1 != 2) {
      return (undefined8 *)0x0;
    }
  }
  else if (*psVar1 == 0x7066 && (char)psVar1[1] == 'T') {
    pvVar10 = (void *)param_1[0x266];
    *param_1 = (long)psVar1 + 3;
    lVar9 = *(long *)((long)pvVar10 + 8);
    puVar3 = pvVar10;
    if (0xfffffffffffff00e < lVar9 - 0xfd0U && lVar9 != -0x21) {
LAB_00c18594:
      *(long *)((long)puVar3 + 8) = lVar9 + 0x20;
      puVar4 = (undefined8 *)((long)puVar3 + lVar9 + 0x10);
      *puVar4 = &PTR_LAB_00cb14c0;
      *(undefined1 *)((long)puVar3 + lVar9 + 0x18) = 8;
      *(ushort *)((long)puVar3 + lVar9 + 0x19) =
           *(ushort *)((long)puVar3 + lVar9 + 0x19) & 0xf000 | 0x540;
      *(undefined **)((long)puVar3 + lVar9 + 0x20) = &DAT_002dae33;
      *(undefined8 *)((long)puVar3 + lVar9 + 0x28) = 4;
      return puVar4;
    }
    puVar3 = malloc(0x1000);
    if (puVar3 != (void *)0x0) {
      lVar9 = 0;
      *puVar3 = pvVar10;
      puVar3[1] = 0;
      param_1[0x266] = (long)puVar3;
      goto LAB_00c18594;
    }
    goto LAB_00c187d4;
  }
  if (*psVar1 == 0x7066) {
    pbVar5 = (byte *)(psVar1 + 1);
    *param_1 = (long)pbVar5;
    if ((pbVar5 != pbVar2) && (*pbVar5 == 0x72)) {
      pbVar5 = (byte *)((long)psVar1 + 3);
      *param_1 = (long)pbVar5;
    }
    if ((pbVar5 != pbVar2) && (*pbVar5 == 0x56)) {
      pbVar5 = pbVar5 + 1;
      *param_1 = (long)pbVar5;
    }
    if ((pbVar5 != pbVar2) && (*pbVar5 == 0x4b)) {
      pbVar5 = pbVar5 + 1;
      *param_1 = (long)pbVar5;
    }
    pbVar7 = pbVar5;
    if ((pbVar2 == pbVar5) || (*pbVar5 - 0x3a < 0xfffffff6)) {
      lVar9 = 0;
      pbVar5 = (byte *)0x0;
    }
    else {
      pbVar8 = pbVar5;
      do {
        if (*pbVar7 - 0x3a < 0xfffffff6) goto LAB_00c1860c;
        pbVar7 = pbVar7 + 1;
        pbVar8 = pbVar8 + 1;
        *param_1 = (long)pbVar7;
      } while (pbVar7 != pbVar2);
      pbVar8 = pbVar2;
LAB_00c1860c:
      lVar9 = (long)pbVar8 - (long)pbVar5;
    }
    if ((pbVar7 != pbVar2) && (*pbVar7 == 0x5f)) {
      pvVar10 = (void *)param_1[0x266];
      *param_1 = (long)(pbVar7 + 1);
      lVar6 = *(long *)((long)pvVar10 + 8);
      puVar3 = pvVar10;
      if (lVar6 - 0xfd0U < 0xfffffffffffff00f || lVar6 == -0x21) {
        puVar3 = malloc(0x1000);
        if (puVar3 == (void *)0x0) {
LAB_00c187d4:
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar6 = 0;
        *puVar3 = pvVar10;
        puVar3[1] = 0;
        param_1[0x266] = (long)puVar3;
      }
      *(long *)((long)puVar3 + 8) = lVar6 + 0x20;
      puVar4 = (undefined8 *)((long)puVar3 + lVar6 + 0x10);
      *puVar4 = &PTR_LAB_00cb2738;
      *(byte **)((long)puVar3 + lVar6 + 0x20) = pbVar5;
      *(long *)((long)puVar3 + lVar6 + 0x28) = lVar9;
      *(undefined1 *)((long)puVar3 + lVar6 + 0x18) = 0x43;
      *(ushort *)((long)puVar3 + lVar6 + 0x19) =
           *(ushort *)((long)puVar3 + lVar6 + 0x19) & 0xf000 | 0x540;
      return puVar4;
    }
  }
  else if (*psVar1 == 0x4c66) {
    pbVar5 = (byte *)(psVar1 + 1);
    *param_1 = (long)pbVar5;
    if ((pbVar2 != pbVar5) && (0xfffffff5 < *pbVar5 - 0x3a)) {
      pbVar7 = pbVar5;
      do {
        if (*pbVar7 - 0x3a < 0xfffffff6) {
          pbVar8 = pbVar7;
          goto LAB_00c186a8;
        }
        pbVar7 = pbVar7 + 1;
        *param_1 = (long)pbVar7;
      } while (pbVar7 != pbVar2);
      pbVar8 = pbVar2;
LAB_00c186a8:
      if (pbVar8 == pbVar5) {
        return (undefined8 *)0x0;
      }
      if (pbVar7 == pbVar2) {
        return (undefined8 *)0x0;
      }
      if (*pbVar7 == 0x70) {
        local_40 = pbVar7 + 1;
        *param_1 = (long)local_40;
        if ((local_40 != pbVar2) && (*local_40 == 0x72)) {
          local_40 = pbVar7 + 2;
          *param_1 = (long)local_40;
        }
        if ((local_40 != pbVar2) && (*local_40 == 0x56)) {
          local_40 = local_40 + 1;
          *param_1 = (long)local_40;
        }
        if ((local_40 != pbVar2) && (*local_40 == 0x4b)) {
          local_40 = local_40 + 1;
          *param_1 = (long)local_40;
        }
        pbVar5 = local_40;
        if ((pbVar2 == local_40) || (*local_40 - 0x3a < 0xfffffff6)) {
          lStack_38 = 0;
          local_40 = (byte *)0x0;
        }
        else {
          pbVar7 = local_40;
          do {
            if (*pbVar5 - 0x3a < 0xfffffff6) goto LAB_00c18778;
            pbVar5 = pbVar5 + 1;
            pbVar7 = pbVar7 + 1;
            *param_1 = (long)pbVar5;
          } while (pbVar5 != pbVar2);
          pbVar7 = pbVar2;
LAB_00c18778:
          lStack_38 = (long)pbVar7 - (long)local_40;
        }
        if ((pbVar5 != pbVar2) && (*pbVar5 == 0x5f)) {
          *param_1 = (long)(pbVar5 + 1);
          puVar3 = (undefined8 *)FUN_00c1fb88(param_1,&local_40);
          return puVar3;
        }
      }
    }
  }
  return (undefined8 *)0x0;
}

