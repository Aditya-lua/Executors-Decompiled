/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c191d8
 */

undefined8 * FUN_00c191d8(long *param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  byte *pbVar5;
  long lVar6;
  long lVar7;
  byte *pbVar8;
  undefined8 *puVar9;
  void *pvVar10;
  byte *pbVar11;
  size_t __n;
  long lVar12;
  long *__src;
  undefined1 uVar13;
  long *plVar14;
  byte *pbVar15;
  long lVar16;
  undefined1 auVar17 [16];
  
  lVar2 = FUN_00c10bfc();
  if ((lVar2 != 0) && (lVar3 = FUN_00c16098(param_1), lVar3 != 0)) {
    pbVar15 = (byte *)*param_1;
    pbVar5 = (byte *)param_1[1];
    pbVar11 = pbVar15;
    if ((pbVar15 != pbVar5) && (*pbVar15 == 0x6e)) {
      pbVar11 = pbVar15 + 1;
      *param_1 = (long)pbVar11;
    }
    if ((pbVar5 == pbVar11) || (*pbVar11 - 0x3a < 0xfffffff6)) {
      pbVar15 = (byte *)0x0;
      lVar16 = 0;
    }
    else {
      do {
        if (*pbVar11 - 0x3a < 0xfffffff6) {
          pbVar8 = pbVar11;
          goto LAB_00c19290;
        }
        pbVar11 = pbVar11 + 1;
        *param_1 = (long)pbVar11;
      } while (pbVar11 != pbVar5);
      pbVar8 = pbVar5;
LAB_00c19290:
      lVar16 = (long)pbVar8 - (long)pbVar15;
    }
    lVar7 = param_1[2];
    lVar1 = param_1[3];
    if (pbVar11 == pbVar5) {
LAB_00c19418:
      if ((pbVar11 == pbVar5) || (*pbVar11 != 0x70)) {
        uVar13 = 0;
      }
      else {
        pbVar11 = pbVar11 + 1;
        uVar13 = 1;
        *param_1 = (long)pbVar11;
      }
      if ((pbVar11 != pbVar5) && (*pbVar11 == 0x45)) {
        *param_1 = (long)(pbVar11 + 1);
        auVar17 = FUN_00c13140(param_1,lVar1 - lVar7 >> 3);
        pvVar10 = (void *)param_1[0x266];
        lVar7 = *(long *)((long)pvVar10 + 8);
        puVar4 = pvVar10;
        if (lVar7 - 4000U < 0xfffffffffffff00f || lVar7 == -0x51) {
          puVar4 = malloc(0x1000);
          if (puVar4 == (void *)0x0) {
LAB_00c19524:
                    /* WARNING: Subroutine does not return */
            std::terminate();
          }
          lVar7 = 0;
          *puVar4 = pvVar10;
          puVar4[1] = 0;
          param_1[0x266] = (long)puVar4;
        }
        *(long *)((long)puVar4 + 8) = lVar7 + 0x50;
        puVar9 = (undefined8 *)((long)puVar4 + lVar7 + 0x10);
        *puVar9 = &PTR_LAB_00cb2c60;
        *(undefined1 *)((long)puVar4 + lVar7 + 0x18) = 0x3b;
        *(byte **)((long)puVar4 + lVar7 + 0x30) = pbVar15;
        *(long *)((long)puVar4 + lVar7 + 0x38) = lVar16;
        *(long *)((long)puVar4 + lVar7 + 0x20) = lVar2;
        *(long *)((long)puVar4 + lVar7 + 0x28) = lVar3;
        *(ushort *)((long)puVar4 + lVar7 + 0x19) =
             *(ushort *)((long)puVar4 + lVar7 + 0x19) & 0xf000 | 0x540;
        *(undefined1 (*) [16])((long)puVar4 + lVar7 + 0x40) = auVar17;
        *(undefined1 *)((long)puVar4 + lVar7 + 0x50) = uVar13;
        return puVar9;
      }
    }
    else {
      do {
        if (*pbVar11 != 0x5f) goto LAB_00c19418;
        pbVar11 = pbVar11 + 1;
        *param_1 = (long)pbVar11;
        if ((pbVar5 == pbVar11) || (*pbVar11 - 0x3a < 0xfffffff6)) {
          pbVar11 = (byte *)0x0;
          lVar12 = 0;
        }
        else {
          pbVar8 = pbVar11;
          do {
            if (*pbVar8 - 0x3a < 0xfffffff6) goto LAB_00c193a4;
            pbVar8 = pbVar8 + 1;
            *param_1 = (long)pbVar8;
          } while (pbVar8 != pbVar5);
          pbVar8 = pbVar5;
LAB_00c193a4:
          lVar12 = (long)pbVar8 - (long)pbVar11;
        }
        pvVar10 = (void *)param_1[0x266];
        lVar6 = *(long *)((long)pvVar10 + 8);
        puVar4 = pvVar10;
        if (lVar6 - 0xfd0U < 0xfffffffffffff00f || lVar6 == -0x21) {
          puVar4 = malloc(0x1000);
          if (puVar4 == (void *)0x0) goto LAB_00c19524;
          lVar6 = 0;
          *puVar4 = pvVar10;
          puVar4[1] = 0;
          param_1[0x266] = (long)puVar4;
        }
        *(long *)((long)puVar4 + 8) = lVar6 + 0x20;
        puVar9 = (undefined8 *)((long)puVar4 + lVar6 + 0x10);
        *puVar9 = &PTR_LAB_00cb14c0;
        *(undefined1 *)((long)puVar4 + lVar6 + 0x18) = 8;
        *(byte **)((long)puVar4 + lVar6 + 0x20) = pbVar11;
        *(long *)((long)puVar4 + lVar6 + 0x28) = lVar12;
        *(ushort *)((long)puVar4 + lVar6 + 0x19) =
             *(ushort *)((long)puVar4 + lVar6 + 0x19) & 0xf000 | 0x540;
        plVar14 = (long *)param_1[3];
        if (plVar14 == (long *)param_1[4]) {
          __src = (long *)param_1[2];
          __n = (long)plVar14 - (long)__src;
          if (__src == param_1 + 5) {
            pvVar10 = malloc(__n * 2);
            if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
              abort();
            }
            if (plVar14 != param_1 + 5) {
              memmove(pvVar10,__src,__n);
            }
            param_1[2] = (long)pvVar10;
          }
          else {
            pvVar10 = realloc(__src,__n * 2);
            param_1[2] = (long)pvVar10;
            if (pvVar10 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
              abort();
            }
          }
          plVar14 = (long *)((long)pvVar10 + __n);
          param_1[4] = (long)((long)pvVar10 + ((long)__n >> 2) * 8);
        }
        pbVar11 = (byte *)*param_1;
        pbVar5 = (byte *)param_1[1];
        *plVar14 = (long)puVar9;
        param_1[3] = (long)(plVar14 + 1);
      } while (pbVar11 != pbVar5);
    }
  }
  return (undefined8 *)0x0;
}

