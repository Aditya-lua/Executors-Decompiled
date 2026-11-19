/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4feb0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void ENGINE_add_conf_module(void)

{
  CONF_module_add("engines",&LAB_00a4fecc,&LAB_00a50334);
  return;
}

