/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7690
 */

void ossl_property_value(undefined8 param_1,undefined8 param_2,int param_3)

{
  long lVar1;
  undefined8 *puVar2;
  
  puVar2 = (undefined8 *)ossl_lib_ctx_get_data(param_1,3,&DAT_00c7c760);
  if (puVar2 == (undefined8 *)0x0) {
    return;
  }
  lVar1 = 0;
  if (param_3 != 0) {
    lVar1 = (long)puVar2 + 0x1c;
  }
  FUN_00ac7404(*puVar2,puVar2[2],lVar1,param_2);
  return;
}

