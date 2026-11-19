/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f0dc
 */

uint OSSL_PARAM_set_BN(long param_1,BIGNUM *param_2)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  
  uVar2 = 0;
  if (param_1 != 0) {
    *(undefined8 *)(param_1 + 0x20) = 0;
    if (param_2 == (BIGNUM *)0x0) {
      uVar2 = 0;
    }
    else {
      uVar2 = 0;
      if (*(int *)(param_1 + 8) == 2) {
        iVar1 = BN_is_negative(param_2);
        uVar2 = 0;
        if (iVar1 == 0) {
          iVar1 = BN_num_bits(param_2);
          uVar2 = iVar1 + 0xeU;
          if (-1 < (int)(iVar1 + 7U)) {
            uVar2 = iVar1 + 7U;
          }
          uVar3 = (long)((ulong)uVar2 << 0x20) >> 0x23;
          if (iVar1 + 0xeU < 0xf) {
            uVar3 = uVar3 + 1;
          }
          *(ulong *)(param_1 + 0x20) = uVar3;
          if (*(long *)(param_1 + 0x10) == 0) {
            uVar2 = 1;
          }
          else {
            uVar2 = 0;
            if (uVar3 <= *(ulong *)(param_1 + 0x18)) {
              *(ulong *)(param_1 + 0x20) = *(ulong *)(param_1 + 0x18);
              uVar3 = BN_bn2nativepad(param_2);
              uVar2 = (uint)(uVar3 >> 0x1f) & 1 ^ 1;
            }
          }
        }
      }
    }
  }
  return uVar2;
}

