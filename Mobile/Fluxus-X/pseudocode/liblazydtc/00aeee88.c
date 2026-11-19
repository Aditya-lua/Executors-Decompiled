/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeee88
 */

int UI_method_get_reader(UI *param_1,UI_STRING *param_2)

{
  int iVar1;
  
  iVar1 = 0;
  if (param_1 != (UI *)0x0) {
    iVar1 = (int)*(undefined8 *)(param_1 + 0x20);
  }
  return iVar1;
}

