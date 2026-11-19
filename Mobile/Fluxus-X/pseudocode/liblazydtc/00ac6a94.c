/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac6a94
 */

undefined8 ossl_property_parse_init(undefined8 param_1)

{
  int iVar1;
  
  iVar1 = ossl_property_name(param_1,"provider",1);
  if (((((iVar1 == 0) || (iVar1 = ossl_property_name(param_1,"version",1), iVar1 == 0)) ||
       (iVar1 = ossl_property_name(param_1,&DAT_002dc037,1), iVar1 == 0)) ||
      ((iVar1 = ossl_property_name(param_1,"output",1), iVar1 == 0 ||
       (iVar1 = ossl_property_name(param_1,"input",1), iVar1 == 0)))) ||
     ((iVar1 = ossl_property_name(param_1,"structure",1), iVar1 == 0 ||
      ((iVar1 = ossl_property_value(param_1,&DAT_002b48d1,1), iVar1 != 1 ||
       (iVar1 = ossl_property_value(param_1,&DAT_002ca2bf,1), iVar1 != 2)))))) {
    return 0;
  }
  return 1;
}

