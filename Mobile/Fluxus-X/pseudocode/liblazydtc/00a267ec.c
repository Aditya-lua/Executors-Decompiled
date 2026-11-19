/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a267ec
 */

int ECDSA_size(EC_KEY *eckey)

{
  uint uVar1;
  EC_GROUP *pEVar2;
  ECDSA_SIG local_20;
  
  uVar1 = 0;
  if (((eckey != (EC_KEY *)0x0) &&
      (pEVar2 = EC_KEY_get0_group(eckey), uVar1 = 0, pEVar2 != (EC_GROUP *)0x0)) &&
     (local_20.r = (BIGNUM *)EC_GROUP_get0_order(), uVar1 = 0, local_20.r != (BIGNUM *)0x0)) {
    local_20.s = local_20.r;
    uVar1 = i2d_ECDSA_SIG(&local_20,(uchar **)0x0);
    uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
  }
  return uVar1;
}

