/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0fb7c
 */

bool FUN_00b0fb7c(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = ossl_x509_likely_issued(param_3);
  return iVar1 == 0;
}

