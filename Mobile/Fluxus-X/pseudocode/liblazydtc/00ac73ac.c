/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac73ac
 */

void ossl_property_name(undefined8 param_1,undefined8 param_2,int param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  
  puVar2 = (undefined8 *)ossl_lib_ctx_get_data(param_1,3,&DAT_00c7c760);
  if (puVar2 == (undefined8 *)0x0) {
    return;
  }
  puVar1 = (undefined8 *)0x0;
  if (param_3 != 0) {
    puVar1 = puVar2 + 3;
  }
  FUN_00ac7404(*puVar2,puVar2[1],puVar1,param_2);
  return;
}

