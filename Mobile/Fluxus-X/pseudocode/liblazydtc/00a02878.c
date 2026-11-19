/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02878
 */

undefined8 ossl_bn_mask_bits_fixed_top(long *param_1,uint param_2)

{
  uint uVar1;
  undefined8 uVar2;
  
  if ((int)param_2 < 0) {
    return 0;
  }
  uVar1 = param_2 >> 6;
  uVar2 = 0;
  if ((int)uVar1 < (int)param_1[1]) {
    if ((param_2 & 0x3f) == 0) {
      *(uint *)(param_1 + 1) = uVar1;
    }
    else {
      *(uint *)(param_1 + 1) = uVar1 + 1;
      *(ulong *)(*param_1 + (ulong)uVar1 * 8) =
           *(ulong *)(*param_1 + (ulong)uVar1 * 8) & (-1L << (param_2 & 0x3f) ^ 0xffffffffffffffffU)
      ;
    }
    uVar2 = 1;
  }
  return uVar2;
}

