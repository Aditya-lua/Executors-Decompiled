/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c399b0
 */

void DES_ede3_cfb_encrypt
               (uchar *in,uchar *out,int numbits,long length,DES_key_schedule *ks1,
               DES_key_schedule *ks2,DES_key_schedule *ks3,DES_cblock *ivec,int enc)

{
  DES_ede3_cfb_encrypt(in,out,numbits,length,ks1,ks2,ks3,ivec,enc);
  return;
}

