/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0cb40
 */

int X509_TRUST_set_default(int param_1,X509 *param_2,int param_3)

{
  undefined *puVar1;
  
  puVar1 = PTR_FUN_00cc9bf0;
  PTR_FUN_00cc9bf0 = (undefined *)(ulong)(uint)param_1;
  return (int)puVar1;
}

