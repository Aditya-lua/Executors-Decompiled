/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0bf6c
 */

undefined4 COMP_CTX_get_type(undefined8 *param_1)

{
  if ((undefined4 *)*param_1 == (undefined4 *)0x0) {
    return 0;
  }
  return *(undefined4 *)*param_1;
}

