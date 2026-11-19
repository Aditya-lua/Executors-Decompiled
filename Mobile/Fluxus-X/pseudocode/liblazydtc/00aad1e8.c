/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aad1e8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int OBJ_NAME_init(void)

{
  int iVar1;
  int iVar2;
  
  iVar2 = CRYPTO_THREAD_run_once(&DAT_00d22160,FUN_00aad21c);
  iVar1 = 0;
  if (iVar2 != 0) {
    iVar1 = DAT_00d22164;
  }
  return iVar1;
}

