/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a11354
 */

int ASN1_str2mask(char *param_1,undefined8 *param_2)

{
  int iVar1;
  
  *param_2 = 0;
  iVar1 = CONF_parse_list(param_1,0x7c,1,(list_cb *)&LAB_00a11370,param_2);
  return iVar1;
}

