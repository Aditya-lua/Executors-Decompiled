/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1a1b0
 */

int DH_check_pub_key(DH *dh,BIGNUM *pub_key,int *codes)

{
  int iVar1;
  uint uVar2;
  BIGNUM **ppBVar3;
  
  ppBVar3 = &dh->p;
  iVar1 = BN_num_bits(*ppBVar3);
  if (iVar1 < 0x8001) {
    if ((dh->g == (BIGNUM *)0x0) || (iVar1 = BN_ucmp(*ppBVar3,dh->g), -1 < iVar1)) {
      iVar1 = ossl_ffc_validate_public_key(ppBVar3,pub_key,codes);
      return iVar1;
    }
    iVar1 = 1;
    uVar2 = *codes | 0x24;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/dh/dh_check.c",0xfe,"DH_check_pub_key");
    ERR_set_error(5,0x67,0);
    uVar2 = 0x104;
    iVar1 = 0;
  }
  *codes = uVar2;
  return iVar1;
}

