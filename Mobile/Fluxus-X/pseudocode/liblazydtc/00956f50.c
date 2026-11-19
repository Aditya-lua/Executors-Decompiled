/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00956f50
 */

void FUN_00956f50(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  
  lVar1 = FUN_009252a8(param_3);
  if (lVar1 == 0) {
    FUN_00956a58(param_1,"AUTHENTICATE %s",param_2,0);
    return;
  }
  FUN_00956a58(param_1,"AUTHENTICATE %s %s",param_2,lVar1);
  return;
}

