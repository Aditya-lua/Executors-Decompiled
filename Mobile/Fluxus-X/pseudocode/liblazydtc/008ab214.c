/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ab214
 */

char * FUN_008ab214(undefined8 param_1,int param_2)

{
  if (param_2 == -1) {
    return "no value";
  }
  return (&PTR_DAT_00c4d168)[param_2];
}

