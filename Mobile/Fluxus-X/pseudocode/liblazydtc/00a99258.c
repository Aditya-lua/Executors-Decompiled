/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99258
 */

bool ossl_init_thread(void)

{
  int iVar1;
  
  iVar1 = CRYPTO_THREAD_init_local(&DAT_00cc9130,&LAB_00a99284);
  return iVar1 != 0;
}

