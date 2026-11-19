/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad0790
 */

int RSA_public_decrypt(int flen,uchar *from,uchar *to,RSA *rsa,int padding)

{
  int iVar1;
  
                    /* WARNING: Could not recover jumptable at 0x00ad0798. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(rsa->engine + 0x10))(flen);
  return iVar1;
}

