/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a800b4
 */

undefined8 OPENSSL_LH_delete(long *param_1,undefined8 param_2)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  void *pvVar4;
  uint uVar5;
  ulong uVar6;
  ulong uVar7;
  int iVar8;
  long lVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  code *pcVar15;
  
  *(undefined4 *)(param_1 + 8) = 0;
  uVar3 = (*(code *)param_1[2])(param_2);
  uVar6 = (ulong)*(uint *)((long)param_1 + 0x24);
  uVar7 = 0;
  if (uVar6 != 0) {
    uVar7 = uVar3 / uVar6;
  }
  uVar6 = uVar3 - uVar7 * uVar6;
  if (uVar6 < *(uint *)(param_1 + 4)) {
    uVar7 = (ulong)*(uint *)((long)param_1 + 0x1c);
    uVar6 = 0;
    if (uVar7 != 0) {
      uVar6 = uVar3 / uVar7;
    }
    uVar6 = uVar3 - uVar6 * uVar7;
  }
  puVar13 = (undefined8 *)(*param_1 + ((long)(uVar6 << 0x20) >> 0x1d));
  puVar14 = (undefined8 *)*puVar13;
  if (puVar14 != (undefined8 *)0x0) {
    pcVar15 = (code *)param_1[1];
    do {
      if ((puVar14[2] == uVar3) && (iVar2 = (*pcVar15)(*puVar14,param_2), iVar2 == 0)) {
        puVar14 = (undefined8 *)*puVar13;
        if (puVar14 == (undefined8 *)0x0) {
          return 0;
        }
        *puVar13 = puVar14[1];
        uVar11 = *puVar14;
        CRYPTO_free(puVar14);
        lVar9 = param_1[7];
        uVar5 = *(uint *)(param_1 + 3);
        param_1[7] = lVar9 + -1;
        if (uVar5 < 0x11) {
          return uVar11;
        }
        uVar6 = 0;
        if ((ulong)uVar5 != 0) {
          uVar6 = (ulong)((lVar9 + -1) * 0x100) / (ulong)uVar5;
        }
        if ((ulong)param_1[6] < uVar6) {
          return uVar11;
        }
        lVar9 = param_1[4];
        iVar2 = *(int *)((long)param_1 + 0x24);
        iVar8 = (int)lVar9 + -1;
        lVar10 = (ulong)(uint)(iVar8 + iVar2) * 8;
        uVar12 = *(undefined8 *)(*param_1 + lVar10);
        *(undefined8 *)(*param_1 + lVar10) = 0;
        if ((int)lVar9 == 0) {
          pvVar4 = CRYPTO_realloc((void *)*param_1,iVar2 << 3,"crypto/lhash/lhash.c",0x109);
          if (pvVar4 == (void *)0x0) {
            *(int *)(param_1 + 8) = (int)param_1[8] + 1;
          }
          else {
            *param_1 = (long)pvVar4;
          }
          uVar5 = *(uint *)(param_1 + 3);
          uVar1 = *(uint *)((long)param_1 + 0x24) >> 1;
          *(uint *)((long)param_1 + 0x1c) = *(uint *)((long)param_1 + 0x1c) >> 1;
          iVar8 = uVar1 - 1;
          *(uint *)((long)param_1 + 0x24) = uVar1;
        }
        *(int *)(param_1 + 4) = iVar8;
        *(uint *)(param_1 + 3) = uVar5 - 1;
        lVar9 = *(long *)(*param_1 + (long)iVar8 * 8);
        if (lVar9 == 0) {
          *(undefined8 *)(*param_1 + (long)iVar8 * 8) = uVar12;
          return uVar11;
        }
        do {
          lVar10 = lVar9;
          lVar9 = *(long *)(lVar10 + 8);
        } while (lVar9 != 0);
        *(undefined8 *)(lVar10 + 8) = uVar12;
        return uVar11;
      }
      puVar13 = puVar14 + 1;
      puVar14 = (undefined8 *)*puVar13;
    } while (puVar14 != (undefined8 *)0x0);
  }
  return 0;
}

