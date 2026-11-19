/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941c68
 */

ulong * FUN_00941c68(ulong *param_1,ulong param_2)

{
  ulong *puVar1;
  
  puVar1 = (ulong *)0x0;
  if ((param_1 != (ulong *)0x0) && (-1 < (long)param_2)) {
    if (param_2 == 0) {
      *param_1 = 0;
      param_1[1] = 0;
    }
    else {
      *param_1 = param_2 / 1000;
      param_1[1] = (param_2 % 1000) * 1000;
    }
    puVar1 = param_1;
  }
  return puVar1;
}

