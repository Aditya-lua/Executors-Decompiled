/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2205c
 */

int DSA_size(DSA *param_1)

{
  uint uVar1;
  DSA_SIG local_20;
  
  local_20.r = *(BIGNUM **)&param_1->write_params;
  if (local_20.r == (BIGNUM *)0x0) {
    return -1;
  }
  local_20.s = local_20.r;
  uVar1 = i2d_DSA_SIG(&local_20,(uchar **)0x0);
  return uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
}

