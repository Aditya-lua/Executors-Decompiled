/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a300ac
 */

void EC_KEY_METHOD_get_init
               (long param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
               undefined8 *param_5,undefined8 *param_6,undefined8 *param_7)

{
  if (param_2 != (undefined8 *)0x0) {
    *param_2 = *(undefined8 *)(param_1 + 0x10);
  }
  if (param_3 != (undefined8 *)0x0) {
    *param_3 = *(undefined8 *)(param_1 + 0x18);
  }
  if (param_4 != (undefined8 *)0x0) {
    *param_4 = *(undefined8 *)(param_1 + 0x20);
  }
  if (param_5 != (undefined8 *)0x0) {
    *param_5 = *(undefined8 *)(param_1 + 0x28);
  }
  if (param_6 != (undefined8 *)0x0) {
    *param_6 = *(undefined8 *)(param_1 + 0x30);
  }
  if (param_7 != (undefined8 *)0x0) {
    *param_7 = *(undefined8 *)(param_1 + 0x38);
  }
  return;
}

