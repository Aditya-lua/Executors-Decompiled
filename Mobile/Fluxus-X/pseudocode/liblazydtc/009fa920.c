/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fa920
 */

int FUN_009fa920(BIO *param_1,char *param_2)

{
  int iVar1;
  size_t sVar2;
  
  sVar2 = strlen(param_2);
  iVar1 = BIO_write(param_1,param_2,(int)sVar2);
  return iVar1;
}

