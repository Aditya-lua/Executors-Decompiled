/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13c9c
 */

undefined8 SCT_set_version(undefined4 *param_1,int param_2)

{
  if (param_2 == 0) {
    *param_1 = 0;
    param_1[0x18] = 0;
    return 1;
  }
  ERR_new();
  ERR_set_debug("crypto/ct/ct_sct.c",0x38,"SCT_set_version");
  ERR_set_error(0x32,0x67,0);
  return 0;
}

