/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a32458
 */

undefined8
EC_GROUP_get_pentanomial_basis(long *param_1,int *param_2,undefined4 *param_3,undefined4 *param_4)

{
  if (param_1 == (long *)0x0) {
    return 0;
  }
  if ((((*(int *)(*param_1 + 4) != 0x197) || ((int)param_1[9] == 0)) ||
      (*(int *)((long)param_1 + 0x4c) == 0)) ||
     ((((int)param_1[10] == 0 || (*(int *)((long)param_1 + 0x54) == 0)) || ((int)param_1[0xb] != 0))
     )) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x55e,"EC_GROUP_get_pentanomial_basis");
    ERR_set_error(0x10,0xc0101,0);
    return 0;
  }
  if (param_2 != (int *)0x0) {
    *param_2 = *(int *)((long)param_1 + 0x54);
  }
  if (param_3 != (undefined4 *)0x0) {
    *param_3 = (int)param_1[10];
  }
  if (param_4 != (undefined4 *)0x0) {
    *param_4 = *(undefined4 *)((long)param_1 + 0x4c);
  }
  return 1;
}

