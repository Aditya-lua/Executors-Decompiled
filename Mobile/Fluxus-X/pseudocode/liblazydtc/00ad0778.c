/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad0778
 */

int RSA_private_encrypt(int flen,uchar *from,uchar *to,RSA *rsa,int padding)

{
  int iVar1;
  
                    /* WARNING: Could not recover jumptable at 0x00ad0780. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(rsa->engine + 0x18))(flen);
  return iVar1;
}

