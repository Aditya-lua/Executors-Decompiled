/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c12c94
 */

undefined8 * FUN_00c12c94(long *param_1)

{
  undefined8 *puVar1;
  long lVar2;
  void *pvVar3;
  char *pcVar4;
  long lVar5;
  byte *pbVar6;
  long lVar7;
  undefined **ppuVar8;
  undefined1 uVar9;
  byte *pbVar10;
  uint uVar11;
  size_t __n;
  long *__ptr;
  long *plVar12;
  undefined1 auVar13 [16];
  
  pbVar6 = (byte *)*param_1;
  pbVar10 = (byte *)param_1[1];
  if (pbVar10 == pbVar6) {
    uVar11 = 0xffffffb6;
  }
  else {
    uVar11 = *pbVar6 - 0x4a;
  }
  uVar11 = uVar11 >> 1 | uVar11 << 0x1f;
  if ((int)uVar11 < 5) {
    if (uVar11 == 0) {
      lVar7 = param_1[2];
      lVar5 = param_1[3];
      pbVar6 = pbVar6 + 1;
      *param_1 = (long)pbVar6;
      while ((pbVar6 == pbVar10 || (*pbVar6 != 0x45))) {
        lVar2 = FUN_00c12c94(param_1);
        if (lVar2 == 0) {
          return (undefined8 *)0x0;
        }
        plVar12 = (long *)param_1[3];
        if (plVar12 == (long *)param_1[4]) {
          __ptr = (long *)param_1[2];
          __n = (long)plVar12 - (long)__ptr;
          if (__ptr == param_1 + 5) {
            pvVar3 = malloc(__n * 2);
            if (pvVar3 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
              abort();
            }
            if (plVar12 != param_1 + 5) {
              memmove(pvVar3,__ptr,__n);
            }
            param_1[2] = (long)pvVar3;
          }
          else {
            pvVar3 = realloc(__ptr,__n * 2);
            param_1[2] = (long)pvVar3;
            if (pvVar3 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
              abort();
            }
          }
          plVar12 = (long *)((long)pvVar3 + __n);
          param_1[4] = (long)((long)pvVar3 + ((long)__n >> 2) * 8);
        }
        pbVar6 = (byte *)*param_1;
        pbVar10 = (byte *)param_1[1];
        *plVar12 = lVar2;
        param_1[3] = (long)(plVar12 + 1);
      }
      *param_1 = (long)(pbVar6 + 1);
      auVar13 = FUN_00c13140(param_1,lVar5 - lVar7 >> 3);
      pvVar3 = (void *)param_1[0x266];
      lVar7 = *(long *)((long)pvVar3 + 8);
      puVar1 = pvVar3;
      if (lVar7 - 0xfd0U < 0xfffffffffffff00f || lVar7 == -0x21) {
        puVar1 = malloc(0x1000);
        if (puVar1 == (void *)0x0) {
LAB_00c12fc8:
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar7 = 0;
        *puVar1 = pvVar3;
        puVar1[1] = 0;
        param_1[0x266] = (long)puVar1;
      }
      lVar5 = (long)puVar1 + lVar7;
      ppuVar8 = &PTR_LAB_00cb3638;
      *(long *)((long)puVar1 + 8) = lVar7 + 0x20;
      uVar9 = 0x29;
LAB_00c12ecc:
      *(undefined8 *)(lVar5 + 0x10) = ppuVar8;
      *(undefined1 *)(lVar5 + 0x18) = uVar9;
      *(undefined1 (*) [16])(lVar5 + 0x20) = auVar13;
      *(ushort *)(lVar5 + 0x19) = *(ushort *)(lVar5 + 0x19) & 0xf000 | 0x540;
      return (undefined8 *)(lVar5 + 0x10);
    }
    if (uVar11 == 1) {
      if (((ulong)((long)pbVar10 - (long)pbVar6) < 2) || (pbVar6[1] != 0x5a)) {
        puVar1 = (undefined8 *)FUN_00c17a90(param_1);
        return puVar1;
      }
      *param_1 = (long)(pbVar6 + 2);
      puVar1 = (undefined8 *)FUN_00c10038(param_1);
joined_r0x00c12d34:
      if (puVar1 != (undefined8 *)0x0) {
        pcVar4 = (char *)*param_1;
        if ((pcVar4 == (char *)param_1[1]) || (*pcVar4 != 'E')) {
          puVar1 = (undefined8 *)0x0;
        }
        else {
          *param_1 = (long)(pcVar4 + 1);
        }
      }
      return puVar1;
    }
  }
  else if (uVar11 == 5) {
    if ((pbVar10 != pbVar6) && (*pbVar6 == 0x54)) {
      if ((ulong)((long)pbVar10 - (long)pbVar6) < 2) {
        uVar11 = 0;
      }
      else {
        uVar11 = (uint)pbVar6[1];
      }
      pcVar4 = memchr("yptnk",uVar11,5);
      if ((pcVar4 != (char *)0x0) && (pcVar4 != "")) {
        lVar7 = FUN_00c1ddc8(param_1,0);
        if (lVar7 == 0) {
          return (undefined8 *)0x0;
        }
        lVar5 = FUN_00c12c94(param_1);
        auVar13._8_8_ = lVar5;
        auVar13._0_8_ = lVar7;
        if (lVar5 == 0) {
          return (undefined8 *)0x0;
        }
        pvVar3 = (void *)param_1[0x266];
        lVar7 = *(long *)((long)pvVar3 + 8);
        puVar1 = pvVar3;
        if (lVar7 - 0xfd0U < 0xfffffffffffff00f || lVar7 == -0x21) {
          puVar1 = malloc(0x1000);
          if (puVar1 == (void *)0x0) goto LAB_00c12fc8;
          lVar7 = 0;
          *puVar1 = pvVar3;
          puVar1[1] = 0;
          param_1[0x266] = (long)puVar1;
        }
        lVar5 = (long)puVar1 + lVar7;
        ppuVar8 = &PTR_LAB_00cb36b0;
        *(long *)((long)puVar1 + 8) = lVar7 + 0x20;
        uVar9 = 0x22;
        goto LAB_00c12ecc;
      }
    }
  }
  else if (uVar11 == 7) {
    *param_1 = (long)(pbVar6 + 1);
    puVar1 = (undefined8 *)FUN_00c16098(param_1);
    goto joined_r0x00c12d34;
  }
  puVar1 = (undefined8 *)FUN_00c10bfc(param_1);
  return puVar1;
}

