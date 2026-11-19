/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa1f34
 */

int ossl_provider_add_conf_module(void)

{
  int iVar1;
  
  iVar1 = CONF_module_add("providers",&LAB_00aa1f4c,(undefined1 *)0x0);
  return iVar1;
}

