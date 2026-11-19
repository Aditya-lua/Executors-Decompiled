/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7cae0
 */

undefined ** ossl_ffc_numbers_to_dh_named_group(BIGNUM *param_1,BIGNUM *param_2,BIGNUM *param_3)

{
  int iVar1;
  undefined **ppuVar2;
  ulong uVar3;
  
  uVar3 = 0;
  ppuVar2 = &PTR_s_ffdhe2048_00c61108;
  do {
    iVar1 = BN_cmp(param_1,(BIGNUM *)ppuVar2[3]);
    if ((iVar1 == 0) && (iVar1 = BN_cmp(param_3,(BIGNUM *)ppuVar2[5]), iVar1 == 0)) {
      if (param_2 == (BIGNUM *)0x0) {
        return ppuVar2;
      }
      iVar1 = BN_cmp(param_2,(BIGNUM *)ppuVar2[4]);
      if (iVar1 == 0) {
        return ppuVar2;
      }
    }
    uVar3 = uVar3 + 1;
    ppuVar2 = ppuVar2 + 6;
    if (0xd < uVar3) {
      return (undefined **)0x0;
    }
  } while( true );
}

