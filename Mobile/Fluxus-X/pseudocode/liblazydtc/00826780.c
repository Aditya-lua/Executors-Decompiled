/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00826780
 */

void FUN_00826780(undefined8 param_1,undefined8 *param_2)

{
  if (param_2 == (undefined8 *)0x0) {
    return;
  }
  FUN_00826780(param_1,*param_2);
  FUN_00826780(param_1,param_2[1]);
  cpr::EncodedAuthentication::~EncodedAuthentication((EncodedAuthentication *)(param_2 + 7));
  if ((*(byte *)(param_2 + 4) & 1) != 0) {
    operator_delete((void *)param_2[6],param_2[4] & 0xfffffffffffffffe);
  }
  operator_delete(param_2,0x58);
  return;
}

