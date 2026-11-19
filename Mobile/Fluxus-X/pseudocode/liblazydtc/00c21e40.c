/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c21e40
 */

undefined8 * FUN_00c21e40(long *param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 *puVar7;
  void *pvVar8;
  
  pbVar1 = (byte *)*param_1;
  pbVar2 = (byte *)param_1[1];
  if (pbVar2 == pbVar1) {
LAB_00c21ea4:
    puVar3 = (undefined8 *)FUN_00c221f4(param_1,0);
  }
  else {
    if (*pbVar1 - 0x3a < 0xfffffff6) {
      if (1 < (ulong)((long)pbVar2 - (long)pbVar1)) {
        if (*(short *)pbVar1 == 0x6e64) {
          pbVar1 = pbVar1 + 2;
          *param_1 = (long)pbVar1;
          if ((pbVar2 == pbVar1) || (*pbVar1 - 0x3a < 0xfffffff6)) {
            puVar3 = (undefined8 *)FUN_00c21ccc(param_1);
            if (puVar3 == (undefined8 *)0x0) {
              return (undefined8 *)0x0;
            }
          }
          else {
            puVar7 = (undefined8 *)FUN_00c14270(param_1);
            if (puVar7 == (undefined8 *)0x0) {
              return (undefined8 *)0x0;
            }
            puVar3 = puVar7;
            if (((char *)param_1[1] != (char *)*param_1) && (*(char *)*param_1 == 'I')) {
              lVar4 = FUN_00c14948(param_1,0);
              if (lVar4 == 0) {
                return (undefined8 *)0x0;
              }
              pvVar8 = (void *)param_1[0x266];
              lVar6 = *(long *)((long)pvVar8 + 8);
              puVar5 = pvVar8;
              if (lVar6 - 0xfd0U < 0xfffffffffffff00f || lVar6 == -0x21) {
                puVar5 = malloc(0x1000);
                if (puVar5 == (void *)0x0) goto LAB_00c220cc;
                lVar6 = 0;
                *puVar5 = pvVar8;
                puVar5[1] = 0;
                param_1[0x266] = (long)puVar5;
              }
              *(long *)((long)puVar5 + 8) = lVar6 + 0x20;
              puVar3 = (undefined8 *)((long)puVar5 + lVar6 + 0x10);
              *puVar3 = &PTR_LAB_00cb35c0;
              *(undefined8 **)((long)puVar5 + lVar6 + 0x20) = puVar7;
              *(long *)((long)puVar5 + lVar6 + 0x28) = lVar4;
              *(undefined1 *)((long)puVar5 + lVar6 + 0x18) = 0x2d;
              *(ushort *)((long)puVar5 + lVar6 + 0x19) =
                   *(ushort *)((long)puVar5 + lVar6 + 0x19) & 0xf000 | 0x540;
            }
          }
          pvVar8 = (void *)param_1[0x266];
          lVar4 = *(long *)((long)pvVar8 + 8);
          puVar7 = pvVar8;
          if (0xfffffffffffff00e < lVar4 - 0xfd0U && lVar4 != -0x21) {
LAB_00c21fd0:
            *(long *)((long)puVar7 + 8) = lVar4 + 0x20;
            puVar5 = (undefined8 *)((long)puVar7 + lVar4 + 0x10);
            *puVar5 = &PTR_LAB_00cb2eb8;
            *(undefined8 **)((long)puVar7 + lVar4 + 0x20) = puVar3;
            *(undefined1 *)((long)puVar7 + lVar4 + 0x18) = 0x32;
            *(ushort *)((long)puVar7 + lVar4 + 0x19) =
                 *(ushort *)((long)puVar7 + lVar4 + 0x19) & 0xf000 | 0x540;
            return puVar5;
          }
          puVar7 = malloc(0x1000);
          if (puVar7 != (void *)0x0) {
            lVar4 = 0;
            *puVar7 = pvVar8;
            puVar7[1] = 0;
            param_1[0x266] = (long)puVar7;
            goto LAB_00c21fd0;
          }
          goto LAB_00c220cc;
        }
        if (*(short *)pbVar1 == 0x6e6f) {
          *param_1 = (long)(pbVar1 + 2);
        }
      }
      goto LAB_00c21ea4;
    }
    puVar3 = (undefined8 *)FUN_00c14270(param_1);
  }
  puVar7 = puVar3;
  if (((puVar3 != (undefined8 *)0x0) && ((char *)param_1[1] != (char *)*param_1)) &&
     (*(char *)*param_1 == 'I')) {
    lVar4 = FUN_00c14948(param_1,0);
    puVar7 = (undefined8 *)0x0;
    if (lVar4 != 0) {
      pvVar8 = (void *)param_1[0x266];
      lVar6 = *(long *)((long)pvVar8 + 8);
      puVar5 = pvVar8;
      if (lVar6 - 0xfd0U < 0xfffffffffffff00f || lVar6 == -0x21) {
        puVar5 = malloc(0x1000);
        if (puVar5 == (void *)0x0) {
LAB_00c220cc:
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar6 = 0;
        *puVar5 = pvVar8;
        puVar5[1] = 0;
        param_1[0x266] = (long)puVar5;
      }
      *(long *)((long)puVar5 + 8) = lVar6 + 0x20;
      puVar7 = (undefined8 *)((long)puVar5 + lVar6 + 0x10);
      *puVar7 = &PTR_LAB_00cb35c0;
      *(undefined8 **)((long)puVar5 + lVar6 + 0x20) = puVar3;
      *(long *)((long)puVar5 + lVar6 + 0x28) = lVar4;
      *(undefined1 *)((long)puVar5 + lVar6 + 0x18) = 0x2d;
      *(ushort *)((long)puVar5 + lVar6 + 0x19) =
           *(ushort *)((long)puVar5 + lVar6 + 0x19) & 0xf000 | 0x540;
    }
  }
  return puVar7;
}

