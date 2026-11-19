/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b31b7c
 */

bool FUN_00b31b7c(void)

{
  int iVar1;
  
  iVar1 = ossl_prov_is_running();
  return iVar1 != 0;
}

