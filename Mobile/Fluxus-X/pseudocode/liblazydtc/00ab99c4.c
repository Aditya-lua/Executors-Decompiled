/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab99c4
 */

int i2d_PrivateKey(EVP_PKEY *a,uchar **pp)

{
  int iVar1;
  PKCS8_PRIV_KEY_INFO *a_00;
  long lVar2;
  
  if (*(long *)&a[1].save_parameters != 0) {
    iVar1 = FUN_00ab98b4(a,0x87,&PTR_DAT_00c7b028,pp);
    return iVar1;
  }
  lVar2 = *(long *)&a->references;
  if (lVar2 != 0) {
    if (*(code **)(lVar2 + 0xc0) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00ab9a14. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      iVar1 = (**(code **)(lVar2 + 0xc0))(a,pp);
      return iVar1;
    }
    if (*(long *)(lVar2 + 0x48) != 0) {
      a_00 = EVP_PKEY2PKCS8(a);
      if (a_00 == (PKCS8_PRIV_KEY_INFO *)0x0) {
        return 0;
      }
      iVar1 = i2d_PKCS8_PRIV_KEY_INFO(a_00,pp);
      PKCS8_PRIV_KEY_INFO_free(a_00);
      return iVar1;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/i2d_evp.c",0x77,"i2d_PrivateKey");
  ERR_set_error(0xd,0xa7,0);
  return -1;
}

