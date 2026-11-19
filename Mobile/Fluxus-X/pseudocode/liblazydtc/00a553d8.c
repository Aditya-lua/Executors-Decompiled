/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a553d8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int ERR_pop_to_mark(void)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  undefined4 *puVar4;
  long lVar5;
  int *piVar6;
  long lVar7;
  undefined4 uVar8;
  undefined1 *puVar9;
  int iVar10;
  
  lVar5 = ossl_err_get_state_int();
  if ((lVar5 != 0) && (iVar10 = *(int *)(lVar5 + 0x380), *(int *)(lVar5 + 900) != iVar10)) {
    do {
      piVar6 = (int *)(lVar5 + (long)iVar10 * 4 + 0x40);
      if (*piVar6 != 0) {
        *piVar6 = *piVar6 + -1;
        return 1;
      }
      lVar7 = (long)iVar10;
      lVar2 = lVar5 + lVar7 * 4;
      lVar3 = lVar5 + lVar7 * 8;
      puVar1 = (undefined8 *)(lVar3 + 0x100);
      if ((*(byte *)(lVar2 + 0x200) & 1) == 0) {
        uVar8 = 0;
        *puVar1 = 0;
        *(undefined8 *)(lVar3 + 0x180) = 0;
LAB_00a55460:
        *(undefined4 *)(lVar2 + 0x200) = uVar8;
      }
      else {
        puVar9 = (undefined1 *)*puVar1;
        if (puVar9 != (undefined1 *)0x0) {
          *puVar9 = 0;
          uVar8 = 1;
          goto LAB_00a55460;
        }
      }
      *piVar6 = 0;
      puVar4 = (undefined4 *)(lVar5 + lVar7 * 4);
      lVar2 = lVar5 + lVar7 * 8;
      *puVar4 = 0;
      *(undefined8 *)(lVar2 + 0x80) = 0;
      puVar4[0xb0] = 0xffffffff;
      CRYPTO_free(*(void **)(lVar2 + 0x240));
      *(undefined8 *)(lVar2 + 0x240) = 0;
      CRYPTO_free(*(void **)(lVar2 + 0x300));
      *(undefined8 *)(lVar2 + 0x300) = 0;
      iVar10 = *(int *)(lVar5 + 0x380) + -1;
      if (*(int *)(lVar5 + 0x380) < 1) {
        iVar10 = 0xf;
      }
      *(int *)(lVar5 + 0x380) = iVar10;
    } while (*(int *)(lVar5 + 900) != iVar10);
  }
  return 0;
}

