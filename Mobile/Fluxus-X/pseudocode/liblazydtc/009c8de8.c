/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8de8
 */

bool ssl_srp_calc_a_param_intern(long param_1)

{
  bool bVar1;
  int iVar2;
  BIGNUM *pBVar3;
  long lVar4;
  uchar auStack_50 [48];
  
  iVar2 = RAND_priv_bytes_ex(**(undefined8 **)(param_1 + 0x9a8),auStack_50,0x30,0);
  if (iVar2 < 1) {
    bVar1 = false;
  }
  else {
    pBVar3 = BN_bin2bn(auStack_50,0x30,*(BIGNUM **)(param_1 + 0xc20));
    *(BIGNUM **)(param_1 + 0xc20) = pBVar3;
    OPENSSL_cleanse(auStack_50,0x30);
    lVar4 = SRP_Calc_A(*(undefined8 *)(param_1 + 0xc20),*(undefined8 *)(param_1 + 0xbf8),
                       *(undefined8 *)(param_1 + 0xc00));
    bVar1 = lVar4 != 0;
    *(long *)(param_1 + 0xc18) = lVar4;
  }
  return bVar1;
}

