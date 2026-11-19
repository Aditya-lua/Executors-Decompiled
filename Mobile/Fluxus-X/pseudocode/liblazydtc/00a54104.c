/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54104
 */

void ERR_unload_strings(int lib,ERR_STRING_DATA *str)

{
  int iVar1;
  ulong uVar2;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21a30,&LAB_00a53f8c);
  if (((iVar1 != 0) && (DAT_00d21a34 != 0)) &&
     (iVar1 = CRYPTO_THREAD_write_lock(DAT_00d21a20), iVar1 != 0)) {
    uVar2 = str->error;
    while (uVar2 != 0) {
      OPENSSL_LH_delete(DAT_00d21a28,str);
      str = str + 1;
      uVar2 = str->error;
    }
    CRYPTO_THREAD_unlock(DAT_00d21a20);
  }
  return;
}

