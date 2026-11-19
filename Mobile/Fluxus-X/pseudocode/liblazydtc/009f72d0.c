/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f72d0
 */

undefined8 ASN1_item_new_ex(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 local_18;
  
  local_18 = 0;
  iVar1 = FUN_009f7310(&local_18,param_1,0,param_2,param_3);
  if (iVar1 < 1) {
    local_18 = 0;
  }
  return local_18;
}

