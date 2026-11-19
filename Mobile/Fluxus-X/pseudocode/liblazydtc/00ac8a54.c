/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac8a54
 */

int ossl_random_add_conf_module(void)

{
  int iVar1;
  
  iVar1 = CONF_module_add("random",FUN_00ac8a70,&DAT_00ac8dbc);
  return iVar1;
}

