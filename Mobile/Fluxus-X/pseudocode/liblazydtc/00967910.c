/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00967910
 */

undefined8 FUN_00967910(undefined8 param_1,long param_2,long param_3)

{
  undefined8 uVar1;
  
  if ((param_2 != 0) && (param_3 != 0)) {
    uVar1 = curl_maprintf("%s/%s@%s",param_1);
    return uVar1;
  }
  if (param_2 != 0) {
    uVar1 = curl_maprintf("%s/%s",param_1);
    return uVar1;
  }
  if (param_3 == 0) {
    return 0;
  }
  uVar1 = curl_maprintf("%s@%s",param_1,param_3);
  return uVar1;
}

