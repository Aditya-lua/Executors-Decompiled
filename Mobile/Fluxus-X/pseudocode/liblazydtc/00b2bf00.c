/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2bf00
 */

bool FUN_00b2bf00(void)

{
  int iVar1;
  
  iVar1 = ossl_prov_is_running();
  return iVar1 != 0;
}

