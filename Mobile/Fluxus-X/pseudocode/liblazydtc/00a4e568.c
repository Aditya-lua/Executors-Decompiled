/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e568
 */

void ossl_core_bio_ctrl(long param_1,int param_2,long param_3,void *param_4)

{
  BIO_ctrl(*(BIO **)(param_1 + 0x10),param_2,param_3,param_4);
  return;
}

