/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81348
 */

void FUN_00a81348(void)

{
  int iVar1;
  
  iVar1 = CRYPTO_THREAD_init_local(&DAT_00d21d58,0);
  if (iVar1 == 0) {
    DAT_00d21d60 = 0;
  }
  else {
    iVar1 = FUN_00a80e90(&DAT_00d21b90);
    DAT_00d21d60 = (uint)(iVar1 != 0);
  }
  return;
}

