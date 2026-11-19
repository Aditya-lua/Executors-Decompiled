/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e558
 */

int ossl_core_bio_gets(long param_1,char *param_2,int param_3)

{
  int iVar1;
  
  iVar1 = BIO_gets(*(BIO **)(param_1 + 0x10),param_2,param_3);
  return iVar1;
}

