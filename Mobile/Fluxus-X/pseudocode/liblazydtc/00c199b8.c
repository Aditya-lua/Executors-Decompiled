/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c199b8
 */

undefined8 * FUN_00c199b8(long *param_1,ulong param_2)

{
  byte *pbVar1;
  short *psVar2;
  char *pcVar3;
  ushort uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  long lVar8;
  undefined8 *puVar9;
  long lVar10;
  ulong uVar11;
  void *pvVar12;
  long local_70;
  undefined8 *local_68;
  
  psVar2 = (short *)*param_1;
  uVar11 = param_1[1] - (long)psVar2;
  if (uVar11 < 3) {
    if (uVar11 == 2) goto LAB_00c19a1c;
  }
  else {
    if (*psVar2 == 0x7273 && (char)psVar2[1] == 'N') {
      *param_1 = (long)psVar2 + 3;
      puVar9 = (undefined8 *)FUN_00c21ccc(param_1);
      if (puVar9 == (undefined8 *)0x0) {
        return (undefined8 *)0x0;
      }
      puVar5 = puVar9;
      if (((char *)param_1[1] != (char *)*param_1) && (*(char *)*param_1 == 'I')) {
        lVar8 = FUN_00c14948(param_1,0);
        if (lVar8 == 0) {
          return (undefined8 *)0x0;
        }
        pvVar12 = (void *)param_1[0x266];
        lVar10 = *(long *)((long)pvVar12 + 8);
        puVar6 = pvVar12;
        if (lVar10 - 0xfd0U < 0xfffffffffffff00f || lVar10 == -0x21) {
          puVar6 = malloc(0x1000);
          if (puVar6 == (void *)0x0) goto LAB_00c19fdc;
          lVar10 = 0;
          *puVar6 = pvVar12;
          puVar6[1] = 0;
          param_1[0x266] = (long)puVar6;
        }
        *(long *)((long)puVar6 + 8) = lVar10 + 0x20;
        puVar5 = (undefined8 *)((long)puVar6 + lVar10 + 0x10);
        *puVar5 = &PTR_LAB_00cb35c0;
        *(undefined8 **)((long)puVar6 + lVar10 + 0x20) = puVar9;
        *(long *)((long)puVar6 + lVar10 + 0x28) = lVar8;
        *(undefined1 *)((long)puVar6 + lVar10 + 0x18) = 0x2d;
        *(ushort *)((long)puVar6 + lVar10 + 0x19) =
             *(ushort *)((long)puVar6 + lVar10 + 0x19) & 0xf000 | 0x540;
      }
      while ((pcVar3 = (char *)*param_1, pcVar3 == (char *)param_1[1] || (*pcVar3 != 'E'))) {
        puVar9 = (undefined8 *)FUN_00c14270(param_1);
        if (puVar9 == (undefined8 *)0x0) {
          return (undefined8 *)0x0;
        }
        puVar6 = puVar9;
        if (((char *)param_1[1] != (char *)*param_1) && (*(char *)*param_1 == 'I')) {
          lVar8 = FUN_00c14948(param_1,0);
          if (lVar8 == 0) {
            return (undefined8 *)0x0;
          }
          pvVar12 = (void *)param_1[0x266];
          lVar10 = *(long *)((long)pvVar12 + 8);
          puVar7 = pvVar12;
          if (lVar10 - 0xfd0U < 0xfffffffffffff00f || lVar10 == -0x21) {
            puVar7 = malloc(0x1000);
            if (puVar7 == (void *)0x0) goto LAB_00c19fdc;
            lVar10 = 0;
            *puVar7 = pvVar12;
            puVar7[1] = 0;
            param_1[0x266] = (long)puVar7;
          }
          *(long *)((long)puVar7 + 8) = lVar10 + 0x20;
          puVar6 = (undefined8 *)((long)puVar7 + lVar10 + 0x10);
          *puVar6 = &PTR_LAB_00cb35c0;
          *(undefined8 **)((long)puVar7 + lVar10 + 0x20) = puVar9;
          *(long *)((long)puVar7 + lVar10 + 0x28) = lVar8;
          *(undefined1 *)((long)puVar7 + lVar10 + 0x18) = 0x2d;
          *(ushort *)((long)puVar7 + lVar10 + 0x19) =
               *(ushort *)((long)puVar7 + lVar10 + 0x19) & 0xf000 | 0x540;
        }
        pvVar12 = (void *)param_1[0x266];
        lVar8 = *(long *)((long)pvVar12 + 8);
        puVar9 = pvVar12;
        if (lVar8 - 0xfd0U < 0xfffffffffffff00f || lVar8 == -0x21) {
          puVar9 = malloc(0x1000);
          if (puVar9 == (void *)0x0) goto LAB_00c19fdc;
          lVar8 = 0;
          *puVar9 = pvVar12;
          puVar9[1] = 0;
          param_1[0x266] = (long)puVar9;
        }
        *(long *)((long)puVar9 + 8) = lVar8 + 0x20;
        puVar7 = (undefined8 *)((long)puVar9 + lVar8 + 0x10);
        *puVar7 = &PTR_LAB_00cb2e40;
        *(undefined1 *)((long)puVar9 + lVar8 + 0x18) = 0x17;
        *(undefined8 **)((long)puVar9 + lVar8 + 0x20) = puVar5;
        *(undefined8 **)((long)puVar9 + lVar8 + 0x28) = puVar6;
        *(ushort *)((long)puVar9 + lVar8 + 0x19) =
             *(ushort *)((long)puVar9 + lVar8 + 0x19) & 0xf000 | 0x540;
        puVar5 = puVar7;
      }
      *param_1 = (long)(pcVar3 + 1);
      lVar8 = FUN_00c21e40(param_1);
      if (lVar8 == 0) {
        return (undefined8 *)0x0;
      }
      pvVar12 = (void *)param_1[0x266];
      lVar10 = *(long *)((long)pvVar12 + 8);
      puVar9 = pvVar12;
      if (0xfffffffffffff00e < lVar10 - 0xfd0U && lVar10 != -0x21) {
LAB_00c19f88:
        *(long *)((long)puVar9 + 8) = lVar10 + 0x20;
        puVar6 = (undefined8 *)((long)puVar9 + lVar10 + 0x10);
        *puVar6 = &PTR_LAB_00cb2e40;
        uVar4 = *(ushort *)((long)puVar9 + lVar10 + 0x19);
        *(undefined1 *)((long)puVar9 + lVar10 + 0x18) = 0x17;
        *(undefined8 **)((long)puVar9 + lVar10 + 0x20) = puVar5;
        *(long *)((long)puVar9 + lVar10 + 0x28) = lVar8;
        goto LAB_00c19fb0;
      }
      puVar9 = malloc(0x1000);
      if (puVar9 != (void *)0x0) {
        lVar10 = 0;
        *puVar9 = pvVar12;
        puVar9[1] = 0;
        param_1[0x266] = (long)puVar9;
        goto LAB_00c19f88;
      }
      goto LAB_00c19fdc;
    }
LAB_00c19a1c:
    if (*psVar2 == 0x7273) {
      pbVar1 = (byte *)(psVar2 + 1);
      *param_1 = (long)pbVar1;
      if (((byte *)param_1[1] == pbVar1) || (*pbVar1 - 0x3a < 0xfffffff6)) {
        puVar9 = (undefined8 *)FUN_00c21ccc(param_1);
        if (puVar9 == (undefined8 *)0x0) {
          return (undefined8 *)0x0;
        }
        local_68 = puVar9;
        if (((char *)param_1[1] != (char *)*param_1) && (*(char *)*param_1 == 'I')) {
          local_70 = FUN_00c14948(param_1,0);
          if (local_70 == 0) {
            return (undefined8 *)0x0;
          }
          puVar9 = (undefined8 *)FUN_00c14e14(param_1,&local_68,&local_70);
        }
      }
      else {
        puVar5 = (undefined8 *)FUN_00c14270(param_1);
        if (puVar5 == (undefined8 *)0x0) {
          return (undefined8 *)0x0;
        }
        puVar6 = (undefined8 *)0x0;
        while( true ) {
          puVar9 = puVar5;
          if (((char *)param_1[1] != (char *)*param_1) && (*(char *)*param_1 == 'I')) {
            lVar8 = FUN_00c14948(param_1,0);
            if (lVar8 == 0) {
              return (undefined8 *)0x0;
            }
            pvVar12 = (void *)param_1[0x266];
            lVar10 = *(long *)((long)pvVar12 + 8);
            puVar7 = pvVar12;
            if (lVar10 - 0xfd0U < 0xfffffffffffff00f || lVar10 == -0x21) {
              puVar7 = malloc(0x1000);
              if (puVar7 == (void *)0x0) goto LAB_00c19fdc;
              lVar10 = 0;
              *puVar7 = pvVar12;
              puVar7[1] = 0;
              param_1[0x266] = (long)puVar7;
            }
            *(long *)((long)puVar7 + 8) = lVar10 + 0x20;
            puVar9 = (undefined8 *)((long)puVar7 + lVar10 + 0x10);
            *puVar9 = &PTR_LAB_00cb35c0;
            *(undefined8 **)((long)puVar7 + lVar10 + 0x20) = puVar5;
            *(long *)((long)puVar7 + lVar10 + 0x28) = lVar8;
            *(undefined1 *)((long)puVar7 + lVar10 + 0x18) = 0x2d;
            *(ushort *)((long)puVar7 + lVar10 + 0x19) =
                 *(ushort *)((long)puVar7 + lVar10 + 0x19) & 0xf000 | 0x540;
          }
          if (puVar6 == (undefined8 *)0x0) {
            if ((param_2 & 1) != 0) {
              pvVar12 = (void *)param_1[0x266];
              lVar8 = *(long *)((long)pvVar12 + 8);
              puVar5 = pvVar12;
              if (lVar8 - 0xfd0U < 0xfffffffffffff00f || lVar8 == -0x21) {
                puVar5 = malloc(0x1000);
                if (puVar5 == (void *)0x0) goto LAB_00c19fdc;
                lVar8 = 0;
                *puVar5 = pvVar12;
                puVar5[1] = 0;
                param_1[0x266] = (long)puVar5;
              }
              *(long *)((long)puVar5 + 8) = lVar8 + 0x20;
              puVar6 = (undefined8 *)((long)puVar5 + lVar8 + 0x10);
              *puVar6 = &PTR_LAB_00cb3020;
              *(undefined1 *)((long)puVar5 + lVar8 + 0x18) = 0x2e;
              *(undefined8 **)((long)puVar5 + lVar8 + 0x20) = puVar9;
              *(ushort *)((long)puVar5 + lVar8 + 0x19) =
                   *(ushort *)((long)puVar5 + lVar8 + 0x19) & 0xf000 | 0x540;
              puVar9 = puVar6;
            }
          }
          else {
            pvVar12 = (void *)param_1[0x266];
            lVar8 = *(long *)((long)pvVar12 + 8);
            puVar5 = pvVar12;
            if (lVar8 - 0xfd0U < 0xfffffffffffff00f || lVar8 == -0x21) {
              puVar5 = malloc(0x1000);
              if (puVar5 == (void *)0x0) goto LAB_00c19fdc;
              lVar8 = 0;
              *puVar5 = pvVar12;
              puVar5[1] = 0;
              param_1[0x266] = (long)puVar5;
            }
            *(long *)((long)puVar5 + 8) = lVar8 + 0x20;
            puVar7 = (undefined8 *)((long)puVar5 + lVar8 + 0x10);
            *puVar7 = &PTR_LAB_00cb2e40;
            *(undefined1 *)((long)puVar5 + lVar8 + 0x18) = 0x17;
            *(undefined8 **)((long)puVar5 + lVar8 + 0x20) = puVar6;
            *(undefined8 **)((long)puVar5 + lVar8 + 0x28) = puVar9;
            *(ushort *)((long)puVar5 + lVar8 + 0x19) =
                 *(ushort *)((long)puVar5 + lVar8 + 0x19) & 0xf000 | 0x540;
            puVar9 = puVar7;
          }
          pcVar3 = (char *)*param_1;
          if ((pcVar3 != (char *)param_1[1]) && (*pcVar3 == 'E')) break;
          puVar5 = (undefined8 *)FUN_00c14270(param_1);
          puVar6 = puVar9;
          if (puVar5 == (undefined8 *)0x0) {
            return (undefined8 *)0x0;
          }
        }
        *param_1 = (long)(pcVar3 + 1);
      }
      lVar8 = FUN_00c21e40(param_1);
      if (lVar8 == 0) {
        return (undefined8 *)0x0;
      }
      pvVar12 = (void *)param_1[0x266];
      lVar10 = *(long *)((long)pvVar12 + 8);
      puVar5 = pvVar12;
      if (0xfffffffffffff00e < lVar10 - 0xfd0U && lVar10 != -0x21) {
LAB_00c19f0c:
        *(long *)((long)puVar5 + 8) = lVar10 + 0x20;
        puVar6 = (undefined8 *)((long)puVar5 + lVar10 + 0x10);
        *puVar6 = &PTR_LAB_00cb2e40;
        uVar4 = *(ushort *)((long)puVar5 + lVar10 + 0x19);
        *(undefined8 **)((long)puVar5 + lVar10 + 0x20) = puVar9;
        *(long *)((long)puVar5 + lVar10 + 0x28) = lVar8;
        *(undefined1 *)((long)puVar5 + lVar10 + 0x18) = 0x17;
LAB_00c19fb0:
        *(ushort *)((long)puVar6 + 9) = uVar4 & 0xf000 | 0x540;
        return puVar6;
      }
      puVar5 = malloc(0x1000);
      if (puVar5 != (void *)0x0) {
        lVar10 = 0;
        *puVar5 = pvVar12;
        puVar5[1] = 0;
        param_1[0x266] = (long)puVar5;
        goto LAB_00c19f0c;
      }
      goto LAB_00c19fdc;
    }
  }
  puVar5 = (undefined8 *)FUN_00c21e40(param_1);
  puVar9 = puVar5;
  if (((param_2 & 1) != 0) && (puVar5 != (undefined8 *)0x0)) {
    pvVar12 = (void *)param_1[0x266];
    lVar8 = *(long *)((long)pvVar12 + 8);
    puVar6 = pvVar12;
    if (lVar8 - 0xfd0U < 0xfffffffffffff00f || lVar8 == -0x21) {
      puVar6 = malloc(0x1000);
      if (puVar6 == (void *)0x0) {
LAB_00c19fdc:
                    /* WARNING: Subroutine does not return */
        std::terminate();
      }
      lVar8 = 0;
      *puVar6 = pvVar12;
      puVar6[1] = 0;
      param_1[0x266] = (long)puVar6;
    }
    *(long *)((long)puVar6 + 8) = lVar8 + 0x20;
    puVar9 = (undefined8 *)((long)puVar6 + lVar8 + 0x10);
    *puVar9 = &PTR_LAB_00cb3020;
    *(undefined8 **)((long)puVar6 + lVar8 + 0x20) = puVar5;
    *(undefined1 *)((long)puVar6 + lVar8 + 0x18) = 0x2e;
    *(ushort *)((long)puVar6 + lVar8 + 0x19) =
         *(ushort *)((long)puVar6 + lVar8 + 0x19) & 0xf000 | 0x540;
  }
  return puVar9;
}

