/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2b7f4
 */

void FUN_00c2b7f4(void)

{
  int iVar1;
  
  iVar1 = pthread_key_create(&DAT_00d280a4,FUN_00c2b830);
  if (iVar1 != 0) {
                    /* WARNING: Subroutine does not return */
    abort();
  }
  DAT_00d280a0 = 1;
  return;
}

