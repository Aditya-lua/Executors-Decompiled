/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54f40
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int ERR_get_next_error_library(void)

{
  int iVar1;
  int iVar2;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21a30,&LAB_00a53f8c);
  iVar2 = 0;
  if ((iVar1 != 0) && (DAT_00d21a34 != 0)) {
    iVar1 = CRYPTO_THREAD_write_lock(DAT_00d21a20);
    iVar2 = DAT_00cc8ed0;
    if (iVar1 == 0) {
      iVar2 = 0;
    }
    else {
      DAT_00cc8ed0 = DAT_00cc8ed0 + 1;
      CRYPTO_THREAD_unlock(DAT_00d21a20);
    }
  }
  return iVar2;
}

