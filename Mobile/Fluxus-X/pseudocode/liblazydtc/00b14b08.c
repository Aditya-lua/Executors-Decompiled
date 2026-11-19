/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14b08
 */

int i2d_re_X509_CRL_tbs(X509_CRL_INFO *param_1,uchar **param_2)

{
  int iVar1;
  
  *(undefined4 *)&param_1[1].version = 1;
  iVar1 = i2d_X509_CRL_INFO(param_1,param_2);
  return iVar1;
}

