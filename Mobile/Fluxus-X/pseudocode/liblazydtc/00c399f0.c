/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c399f0
 */

void DES_ede3_cbc_encrypt
               (uchar *input,uchar *output,long length,DES_key_schedule *ks1,DES_key_schedule *ks2,
               DES_key_schedule *ks3,DES_cblock *ivec,int enc)

{
  DES_ede3_cbc_encrypt(input,output,length,ks1,ks2,ks3,ivec,enc);
  return;
}

