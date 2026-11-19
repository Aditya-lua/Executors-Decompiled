/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39a30
 */

void DES_ecb3_encrypt(const_DES_cblock *input,DES_cblock *output,DES_key_schedule *ks1,
                     DES_key_schedule *ks2,DES_key_schedule *ks3,int enc)

{
  DES_ecb3_encrypt(input,output,ks1,ks2,ks3,enc);
  return;
}

