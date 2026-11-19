/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6d87c
 */

char * evp_pkey_get_legacy(long param_1)

{
  int iVar1;
  char *pcVar2;
  char *pcVar3;
  EVP_PKEY *local_28;
  
  local_28 = (EVP_PKEY *)0x0;
  if ((param_1 != 0) &&
     ((*(char **)(param_1 + 0x20) != (char *)0x0 || (*(long *)(param_1 + 0x68) != 0)))) {
    if (*(long *)(param_1 + 0x60) == 0) {
      return *(char **)(param_1 + 0x20);
    }
    iVar1 = CRYPTO_THREAD_read_lock(*(undefined8 *)(param_1 + 0x38));
    if (iVar1 != 0) {
      pcVar2 = *(char **)(param_1 + 0x28);
      iVar1 = CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x38));
      if (iVar1 != 0) {
        if (pcVar2 != (char *)0x0) {
          return pcVar2;
        }
        iVar1 = evp_pkey_copy_downgraded(&local_28,param_1);
        if ((iVar1 == 0) ||
           (iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x38)), iVar1 == 0)) {
          pcVar2 = (char *)0x0;
        }
        else {
          pcVar3 = *(char **)(param_1 + 0x28);
          if (pcVar3 == (char *)0x0) {
            pcVar3 = (local_28->pkey).ptr;
            *(char **)(param_1 + 0x28) = pcVar3;
            (local_28->pkey).ptr = (char *)0x0;
          }
          iVar1 = CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x38));
          pcVar2 = (char *)0x0;
          if (iVar1 != 0) {
            pcVar2 = pcVar3;
          }
        }
        EVP_PKEY_free(local_28);
        return pcVar2;
      }
    }
  }
  return (char *)0x0;
}

