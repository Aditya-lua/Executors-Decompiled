/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7562c
 */

void EVP_PKEY_meth_get0_info(int *ppkey_id,int *pflags,EVP_PKEY_METHOD *meth)

{
  if (ppkey_id != (int *)0x0) {
    *ppkey_id = *(int *)meth;
  }
  if (pflags != (int *)0x0) {
    *pflags = *(int *)(meth + 4);
  }
  return;
}

