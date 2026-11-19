/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00931f58
 */

long FUN_00931f58(long param_1,long param_2,long param_3,undefined8 param_4,undefined8 param_5,
                 undefined8 param_6,undefined8 param_7)

{
  long lVar1;
  long lVar2;
  long lVar3;
  
  if ((param_3 == 0) || (param_1 = param_1 - param_2, param_1 == 0)) {
    return 0;
  }
  if (param_1 < 0x20c49ba5e353f7) {
    lVar3 = 0;
    if (param_3 != 0) {
      lVar3 = (param_1 * 1000) / param_3;
    }
  }
  else {
    lVar1 = 0;
    if (param_3 != 0) {
      lVar1 = param_1 / param_3;
    }
    lVar3 = lVar1 * 1000;
    if (0x20c49ba5e353f6 < lVar1) {
      lVar3 = 0x7fffffffffffffff;
    }
  }
  lVar2 = FUN_00941dc4(param_6,param_7,param_4,param_5);
  lVar1 = lVar3 - lVar2;
  if (lVar1 == 0 || lVar3 < lVar2) {
    lVar1 = 0;
  }
  return lVar1;
}

