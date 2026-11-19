/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d410
 */

void OSSL_PARAM_BLD_push_BN(undefined8 param_1,undefined8 param_2,BIGNUM *param_3)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  
  if (param_3 == (BIGNUM *)0x0) {
    lVar3 = 0;
  }
  else {
    iVar2 = BN_num_bits(param_3);
    uVar1 = iVar2 + 0xe;
    if (-1 < (int)(iVar2 + 7U)) {
      uVar1 = iVar2 + 7U;
    }
    lVar3 = (long)((ulong)uVar1 << 0x20) >> 0x23;
  }
  OSSL_PARAM_BLD_push_BN_pad(param_1,param_2,param_3,lVar3);
  return;
}

