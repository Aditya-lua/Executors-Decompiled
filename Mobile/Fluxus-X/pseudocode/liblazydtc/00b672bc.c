/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b672bc
 */

void ossl_gcm_initctx(undefined8 param_1,undefined4 *param_2,ulong param_3,undefined8 param_4)

{
  undefined8 uVar1;
  
  *param_2 = 6;
  *(undefined8 *)(param_2 + 10) = 0xffffffffffffffff;
  *(ulong *)(param_2 + 2) = param_3 >> 3;
  *(byte *)(param_2 + 0x15) = *(byte *)(param_2 + 0x15) | 2;
  *(undefined8 *)(param_2 + 6) = 0xffffffffffffffff;
  *(undefined8 *)(param_2 + 4) = 0xc;
  *(undefined8 *)(param_2 + 0x3c) = param_4;
  uVar1 = ossl_prov_ctx_get0_libctx();
  *(undefined8 *)(param_2 + 0x3a) = uVar1;
  return;
}

