/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeec68
 */

UI_METHOD * UI_set_method(UI *ui,UI_METHOD *meth)

{
  *(UI_METHOD **)ui = meth;
  return meth;
}

