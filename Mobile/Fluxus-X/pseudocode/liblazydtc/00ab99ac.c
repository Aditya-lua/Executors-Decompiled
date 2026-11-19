/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab99ac
 */

int i2d_KeyParams_bio(BIO *param_1,uchar *param_2)

{
  int iVar1;
  
  iVar1 = ASN1_i2d_bio(i2d_KeyParams,param_1,param_2);
  return iVar1;
}

