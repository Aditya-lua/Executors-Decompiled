/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a10050
 */

int ASN1_add_stable_module(void)

{
  int iVar1;
  
  iVar1 = CONF_module_add("stbl_section",&LAB_00a1006c,&LAB_00a10424);
  return iVar1;
}

