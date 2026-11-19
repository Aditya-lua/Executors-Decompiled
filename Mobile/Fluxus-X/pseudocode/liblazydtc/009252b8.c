/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009252b8
 */

undefined8 FUN_009252b8(undefined8 *param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  
  if (param_2 == 0) {
    lVar1 = 0;
  }
  else {
    lVar1 = FUN_00941948(param_2,param_3);
    if (lVar1 == 0) {
      return 0x1b;
    }
  }
  if ((param_1[1] != 0) && ((code *)*param_1 != (code *)0x0)) {
    (*(code *)*param_1)();
  }
  param_1[2] = param_3;
  *param_1 = curl_free;
  param_1[1] = lVar1;
  return 0;
}

