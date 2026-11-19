/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7224
 */

undefined8 ossl_property_find_property(undefined4 *param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  int local_14;
  
  uVar1 = 0;
  if ((param_1 != (undefined4 *)0x0) && (param_3 != 0)) {
    local_14 = ossl_property_name(param_2,param_3,0);
    if (local_14 == 0) {
      uVar1 = 0;
    }
    else {
      uVar1 = ossl_bsearch(&local_14,param_1 + 2,*param_1,0x18,&LAB_00ac728c,0);
    }
  }
  return uVar1;
}

