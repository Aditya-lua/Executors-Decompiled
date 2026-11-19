/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e560
 */

int ossl_core_bio_puts(long param_1,char *param_2)

{
  int iVar1;
  
  iVar1 = BIO_puts(*(BIO **)(param_1 + 0x10),param_2);
  return iVar1;
}

