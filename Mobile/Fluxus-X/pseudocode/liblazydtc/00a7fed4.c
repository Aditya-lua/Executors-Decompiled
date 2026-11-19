/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7fed4
 */

undefined8 OPENSSL_LH_insert(long *param_1,undefined8 param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  void *pvVar5;
  ulong uVar6;
  undefined8 uVar7;
  uint uVar8;
  long lVar9;
  uint uVar10;
  long *plVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  code *pcVar18;
  
  uVar10 = *(uint *)(param_1 + 3);
  uVar15 = 0;
  if ((ulong)uVar10 != 0) {
    uVar15 = (ulong)(param_1[7] << 8) / (ulong)uVar10;
  }
  *(undefined4 *)(param_1 + 8) = 0;
  if ((ulong)param_1[5] <= uVar15) {
    uVar1 = *(uint *)(param_1 + 4);
    uVar2 = *(uint *)((long)param_1 + 0x24);
    uVar3 = *(uint *)((long)param_1 + 0x1c);
    uVar15 = (ulong)uVar3;
    uVar8 = uVar1 + 1;
    if (uVar2 <= uVar8) {
      pvVar5 = CRYPTO_realloc((void *)*param_1,uVar3 << 4,"crypto/lhash/lhash.c",0xe0);
      if (pvVar5 == (void *)0x0) goto LAB_00a80080;
      *param_1 = (long)pvVar5;
      memset((void *)((long)pvVar5 + uVar15 * 8),0,uVar15 * 8);
      uVar10 = *(uint *)(param_1 + 3);
      uVar8 = 0;
      *(uint *)((long)param_1 + 0x24) = uVar3;
      *(uint *)((long)param_1 + 0x1c) = uVar3 << 1;
    }
    *(uint *)(param_1 + 4) = uVar8;
    lVar9 = *param_1;
    uVar13 = (ulong)(uVar2 + uVar1);
    *(uint *)(param_1 + 3) = uVar10 + 1;
    plVar11 = (long *)(lVar9 + (ulong)uVar1 * 8);
    *(undefined8 *)(lVar9 + uVar13 * 8) = 0;
    lVar12 = *plVar11;
    if (lVar12 != 0) {
      lVar14 = uVar13 * 8;
      do {
        while( true ) {
          uVar13 = 0;
          if (uVar15 != 0) {
            uVar13 = *(ulong *)(lVar12 + 0x10) / uVar15;
          }
          if (*(ulong *)(lVar12 + 0x10) - uVar13 * uVar15 != (ulong)uVar1) break;
          plVar11 = (long *)(lVar12 + 8);
          lVar12 = *plVar11;
          if (lVar12 == 0) goto LAB_00a7ffd0;
        }
        *plVar11 = *(long *)(lVar12 + 8);
        *(undefined8 *)(lVar12 + 8) = *(undefined8 *)(lVar9 + lVar14);
        *(long *)(lVar9 + lVar14) = lVar12;
        lVar12 = *plVar11;
      } while (lVar12 != 0);
    }
  }
LAB_00a7ffd0:
  uVar6 = (*(code *)param_1[2])(param_2);
  uVar15 = (ulong)*(uint *)((long)param_1 + 0x24);
  uVar13 = 0;
  if (uVar15 != 0) {
    uVar13 = uVar6 / uVar15;
  }
  uVar15 = uVar6 - uVar13 * uVar15;
  if (uVar15 < *(uint *)(param_1 + 4)) {
    uVar13 = (ulong)*(uint *)((long)param_1 + 0x1c);
    uVar15 = 0;
    if (uVar13 != 0) {
      uVar15 = uVar6 / uVar13;
    }
    uVar15 = uVar6 - uVar15 * uVar13;
  }
  puVar16 = (undefined8 *)(*param_1 + ((long)(uVar15 << 0x20) >> 0x1d));
  puVar17 = (undefined8 *)*puVar16;
  if (puVar17 != (undefined8 *)0x0) {
    pcVar18 = (code *)param_1[1];
    do {
      if ((puVar17[2] == uVar6) && (iVar4 = (*pcVar18)(*puVar17,param_2), iVar4 == 0)) {
        puVar17 = (undefined8 *)*puVar16;
        if (puVar17 != (undefined8 *)0x0) {
          uVar7 = *puVar17;
          *puVar17 = param_2;
          return uVar7;
        }
        break;
      }
      puVar16 = puVar17 + 1;
      puVar17 = (undefined8 *)*puVar16;
    } while (puVar17 != (undefined8 *)0x0);
  }
  puVar17 = CRYPTO_malloc(0x18,"crypto/lhash/lhash.c",0x78);
  if (puVar17 != (undefined8 *)0x0) {
    *puVar17 = param_2;
    puVar17[1] = 0;
    puVar17[2] = uVar6;
    *puVar16 = puVar17;
    param_1[7] = param_1[7] + 1;
    return 0;
  }
LAB_00a80080:
  *(int *)(param_1 + 8) = (int)param_1[8] + 1;
  return 0;
}

