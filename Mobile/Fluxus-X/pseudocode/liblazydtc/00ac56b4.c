/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac56b4
 */

undefined8 ossl_sa_set(uint *param_1,ulong param_2,long param_3)

{
  uint uVar1;
  undefined8 *puVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  uint uVar7;
  ulong uVar8;
  
  if (param_1 == (uint *)0x0) {
    return 0;
  }
  if (param_2 < 0x10) {
    iVar3 = 1;
  }
  else if (param_2 < 0x100) {
    iVar3 = 2;
  }
  else if (param_2 < 0x1000) {
    iVar3 = 3;
  }
  else if (param_2 < 0x10000) {
    iVar3 = 4;
  }
  else if (param_2 < 0x100000) {
    iVar3 = 5;
  }
  else if (param_2 >> 0x18 == 0) {
    iVar3 = 6;
  }
  else if (param_2 >> 0x1c == 0) {
    iVar3 = 7;
  }
  else if (param_2 >> 0x20 == 0) {
    iVar3 = 8;
  }
  else if (param_2 >> 0x24 == 0) {
    iVar3 = 9;
  }
  else if (param_2 >> 0x28 == 0) {
    iVar3 = 10;
  }
  else if (param_2 >> 0x2c == 0) {
    iVar3 = 0xb;
  }
  else if (param_2 >> 0x30 == 0) {
    iVar3 = 0xc;
  }
  else if (param_2 >> 0x34 == 0) {
    iVar3 = 0xd;
  }
  else if (param_2 >> 0x38 == 0) {
    iVar3 = 0xe;
  }
  else {
    iVar3 = 0xf;
    if (param_2 >> 0x3c != 0) {
      iVar3 = 0x10;
    }
  }
  uVar1 = *param_1;
  while ((int)uVar1 < iVar3) {
    puVar2 = (undefined8 *)CRYPTO_zalloc(0x80,"crypto/sparse_array.c",0xb0);
    if (puVar2 == (undefined8 *)0x0) {
      return 0;
    }
    *puVar2 = *(undefined8 *)(param_1 + 6);
    *(undefined8 **)(param_1 + 6) = puVar2;
    uVar1 = *param_1 + 1;
    *param_1 = uVar1;
  }
  if (*(ulong *)(param_1 + 2) < param_2) {
    *(ulong *)(param_1 + 2) = param_2;
  }
  lVar4 = *(long *)(param_1 + 6);
  if (1 < (int)uVar1) {
    uVar7 = uVar1 * 4;
    lVar6 = (ulong)uVar1 + 1;
    lVar5 = lVar4;
    do {
      uVar7 = uVar7 - 4;
      uVar8 = param_2 >> ((ulong)uVar7 & 0x3f) & 0xf;
      lVar4 = *(long *)(lVar5 + uVar8 * 8);
      if (lVar4 == 0) {
        lVar4 = CRYPTO_zalloc(0x80,"crypto/sparse_array.c",0xb0);
        *(long *)(lVar5 + uVar8 * 8) = lVar4;
        if (lVar4 == 0) {
          return 0;
        }
      }
      lVar6 = lVar6 + -1;
      lVar5 = lVar4;
    } while (2 < lVar6);
  }
  lVar6 = *(long *)(lVar4 + (param_2 & 0xf) * 8);
  if (param_3 == 0) {
    if (lVar6 == 0) goto LAB_00ac58b8;
    lVar6 = *(long *)(param_1 + 4) + -1;
  }
  else {
    if (lVar6 != 0) goto LAB_00ac58b8;
    lVar6 = *(long *)(param_1 + 4) + 1;
  }
  *(long *)(param_1 + 4) = lVar6;
LAB_00ac58b8:
  *(long *)(lVar4 + (param_2 & 0xf) * 8) = param_3;
  return 1;
}

