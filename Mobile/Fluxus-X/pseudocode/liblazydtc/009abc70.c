/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009abc70
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int SSL_get_ex_data_X509_STORE_CTX_idx(void)

{
  int iVar1;
  int iVar2;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d218b0,FUN_009abcb4);
  iVar2 = -1;
  if ((iVar1 != 0) && (DAT_00d218b4 != 0)) {
    iVar2 = DAT_00cc8490;
  }
  return iVar2;
}

