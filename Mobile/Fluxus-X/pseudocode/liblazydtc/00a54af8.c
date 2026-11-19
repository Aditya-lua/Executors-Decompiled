/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54af8
 */

char * ERR_lib_error_string(ulong e)

{
  int iVar1;
  long lVar2;
  ulong local_30 [2];
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21a30,&LAB_00a53f8c);
  if ((iVar1 != 0) && (DAT_00d21a34 != 0)) {
    local_30[0] = 0x1000000;
    if (-1 < (int)e) {
      local_30[0] = e & 0x7f800000;
    }
    iVar1 = CRYPTO_THREAD_read_lock(DAT_00d21a20);
    if (iVar1 != 0) {
      lVar2 = OPENSSL_LH_retrieve(DAT_00d21a28,local_30);
      CRYPTO_THREAD_unlock(DAT_00d21a20);
      if (lVar2 != 0) {
        return *(char **)(lVar2 + 8);
      }
    }
  }
  return (char *)0x0;
}

