/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c39a60
 */

void DES_xcbc_encrypt(uchar *input,uchar *output,long length,DES_key_schedule *schedule,
                     DES_cblock *ivec,const_DES_cblock *inw,const_DES_cblock *outw,int enc)

{
  DES_xcbc_encrypt(input,output,length,schedule,ivec,inw,outw,enc);
  return;
}

