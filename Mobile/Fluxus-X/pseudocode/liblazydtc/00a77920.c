/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77920
 */

undefined8 evp_pkey_ctx_use_cached_data(undefined4 *param_1)

{
  undefined8 uVar1;
  
  if ((*(byte *)(param_1 + 0x14) & 1) == 0) {
    return 1;
  }
  if (*(long *)(param_1 + 0xe) == 0) {
    uVar1 = FUN_00a77554(param_1,0xffffffff,*param_1,0xf,param_1[0x12]);
    return uVar1;
  }
  uVar1 = FUN_00a777c0(param_1,*(long *)(param_1 + 0xe),*(undefined8 *)(param_1 + 0x10));
  return uVar1;
}

