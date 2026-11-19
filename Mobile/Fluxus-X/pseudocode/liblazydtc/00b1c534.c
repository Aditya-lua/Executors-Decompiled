/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1c534
 */

undefined4
FUN_00b1c534(BIO *param_1,undefined8 *param_2,int param_3,undefined8 param_4,long param_5)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = X509_NAME_print_ex(param_1,(X509_NAME *)*param_2,param_3,*(ulong *)(param_5 + 8));
  uVar2 = 0;
  if (0 < iVar1) {
    uVar2 = 2;
  }
  return uVar2;
}

