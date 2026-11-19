/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7cf68
 */

void ossl_ffc_params_init(void *param_1)

{
  memset(param_1,0,0x60);
  *(undefined4 *)((long)param_1 + 0x30) = 0xffffffff;
  *(undefined4 *)((long)param_1 + 0x38) = 0xffffffff;
  *(undefined4 *)((long)param_1 + 0x40) = 3;
  return;
}

