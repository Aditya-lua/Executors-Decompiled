/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54fb4
 */

/* WARNING: Removing unreachable block (ram,0x00a55070) */
/* WARNING: Removing unreachable block (ram,0x00a55074) */

void ERR_set_error_data(char *data,int flags)

{
  undefined8 *puVar1;
  long lVar2;
  size_t sVar3;
  long lVar4;
  long lVar5;
  
  sVar3 = strlen(data);
  lVar4 = ossl_err_get_state_int();
  if (lVar4 != 0) {
    lVar5 = (long)*(int *)(lVar4 + 0x380);
    lVar2 = lVar4 + lVar5 * 4;
    if ((*(byte *)(lVar2 + 0x200) & 1) == 0) {
      lVar5 = lVar4 + lVar5 * 8;
      *(undefined8 *)(lVar5 + 0x100) = 0;
      *(undefined8 *)(lVar5 + 0x180) = 0;
    }
    else {
      lVar5 = lVar4 + lVar5 * 8;
      CRYPTO_free(*(void **)(lVar5 + 0x100));
      *(undefined8 *)(lVar5 + 0x100) = 0;
      *(undefined8 *)(lVar5 + 0x180) = 0;
    }
    *(undefined4 *)(lVar2 + 0x200) = 0;
    lVar2 = lVar4 + (long)*(int *)(lVar4 + 0x380) * 4;
    lVar4 = lVar4 + (long)*(int *)(lVar4 + 0x380) * 8;
    puVar1 = (undefined8 *)(lVar4 + 0x100);
    if ((*(byte *)(lVar2 + 0x200) & 1) != 0) {
      CRYPTO_free((void *)*puVar1);
    }
    *puVar1 = data;
    *(size_t *)(lVar4 + 0x180) = sVar3 + 1;
    *(int *)(lVar2 + 0x200) = flags;
  }
  return;
}

