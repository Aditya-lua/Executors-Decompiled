/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeec60
 */

UI_METHOD * UI_get_method(UI *ui)

{
  return *(UI_METHOD **)ui;
}

