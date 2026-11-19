/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeee7c
 */

int UI_method_get_flusher(UI *param_1)

{
  int iVar1;
  
  iVar1 = 0;
  if (param_1 != (UI *)0x0) {
    iVar1 = (int)*(undefined8 *)(param_1 + 0x18);
  }
  return iVar1;
}

