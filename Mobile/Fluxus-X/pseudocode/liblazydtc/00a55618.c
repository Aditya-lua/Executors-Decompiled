/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a55618
 */

void ERR_new(void)

{
  long lVar1;
  uint uVar2;
  undefined8 *puVar3;
  undefined4 *puVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  undefined4 uVar8;
  undefined1 *puVar9;
  
  lVar6 = ossl_err_get_state_int();
  if (lVar6 == 0) {
    return;
  }
  iVar5 = *(int *)(lVar6 + 0x380);
  uVar2 = iVar5 + 0x10;
  if (-1 < iVar5 + 1) {
    uVar2 = iVar5 + 1;
  }
  iVar5 = (iVar5 + 1) - (uVar2 & 0xfffffff0);
  *(int *)(lVar6 + 0x380) = iVar5;
  if (iVar5 == *(int *)(lVar6 + 900)) {
    uVar2 = iVar5 + 0x10;
    if (-1 < iVar5 + 1) {
      uVar2 = iVar5 + 1;
    }
    *(uint *)(lVar6 + 900) = (iVar5 + 1) - (uVar2 & 0xfffffff0);
  }
  lVar1 = lVar6 + (long)iVar5 * 4;
  lVar7 = (long)iVar5;
  puVar3 = (undefined8 *)(lVar6 + (long)iVar5 * 8 + 0x100);
  if ((*(byte *)(lVar1 + 0x200) & 1) == 0) {
    uVar8 = 0;
    *puVar3 = 0;
    *(undefined8 *)(lVar6 + lVar7 * 8 + 0x180) = 0;
  }
  else {
    puVar9 = (undefined1 *)*puVar3;
    if (puVar9 == (undefined1 *)0x0) goto LAB_00a556b8;
    *puVar9 = 0;
    uVar8 = 1;
  }
  *(undefined4 *)(lVar1 + 0x200) = uVar8;
LAB_00a556b8:
  puVar4 = (undefined4 *)(lVar6 + lVar7 * 4);
  lVar6 = lVar6 + lVar7 * 8;
  puVar4[0x10] = 0;
  *puVar4 = 0;
  *(undefined8 *)(lVar6 + 0x80) = 0;
  puVar4[0xb0] = 0xffffffff;
  CRYPTO_free(*(void **)(lVar6 + 0x240));
  *(undefined8 *)(lVar6 + 0x240) = 0;
  CRYPTO_free(*(void **)(lVar6 + 0x300));
  *(undefined8 *)(lVar6 + 0x300) = 0;
  return;
}

