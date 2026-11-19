/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7aec
 */

int RAND_set_rand_method(RAND_METHOD *meth)

{
  int iVar1;
  int iVar2;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d22210,FUN_00ac7bc0);
  iVar2 = 0;
  if (((iVar1 != 0) && (DAT_00d22214 != 0)) &&
     (iVar1 = CRYPTO_THREAD_write_lock(DAT_00d22208), iVar2 = 0, iVar1 != 0)) {
    ENGINE_finish(DAT_00d22218);
    DAT_00d22218 = (ENGINE *)0x0;
    DAT_00d221f0 = meth;
    CRYPTO_THREAD_unlock(DAT_00d22208);
    iVar2 = 1;
  }
  return iVar2;
}

