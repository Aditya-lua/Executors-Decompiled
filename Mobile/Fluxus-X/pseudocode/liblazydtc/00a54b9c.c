/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54b9c
 */

char * ERR_reason_error_string(ulong e)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  ulong local_40 [2];
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21a30,&LAB_00a53f8c);
  if ((int)e < 0) {
    return (char *)0x0;
  }
  if (iVar1 == 0) {
    return (char *)0x0;
  }
  if (DAT_00d21a34 == 0) {
    return (char *)0x0;
  }
  local_40[0] = e & 0x7fffffff;
  iVar1 = CRYPTO_THREAD_read_lock(DAT_00d21a20);
  if (iVar1 == 0) {
LAB_00a54c20:
    local_40[0] = e & 0x7fffff;
    iVar1 = CRYPTO_THREAD_read_lock(DAT_00d21a20);
    if (iVar1 != 0) {
      lVar2 = OPENSSL_LH_retrieve(DAT_00d21a28,local_40);
      CRYPTO_THREAD_unlock(DAT_00d21a20);
      if (lVar2 != 0) goto LAB_00a54c58;
    }
    pcVar3 = (char *)0x0;
  }
  else {
    lVar2 = OPENSSL_LH_retrieve(DAT_00d21a28,local_40);
    CRYPTO_THREAD_unlock(DAT_00d21a20);
    if (lVar2 == 0) goto LAB_00a54c20;
LAB_00a54c58:
    pcVar3 = *(char **)(lVar2 + 8);
  }
  return pcVar3;
}

