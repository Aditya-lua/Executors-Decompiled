/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad7924
 */

undefined8 FUN_00ad7924(long param_1,int param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if (param_1 == 0) {
LAB_00ad7988:
    uVar2 = 1;
  }
  else {
    iVar1 = EVP_MD_get_type();
    if (param_2 == 5) {
      iVar1 = RSA_X931_hash_id(iVar1);
      if (iVar1 != -1) goto LAB_00ad7988;
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x189,"check_padding_md");
      uVar2 = 0x8e;
    }
    else if (param_2 == 3) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x183,"check_padding_md");
      uVar2 = 0x8d;
    }
    else {
      if (iVar1 < 0x2a0) {
        if ((iVar1 - 0x40U < 0x36) &&
           ((1L << ((ulong)(iVar1 - 0x40U) & 0x3f) & 0x24000080000001U) != 0)) {
          return 1;
        }
        if (iVar1 - 3U < 2) {
          return 1;
        }
        if (iVar1 == 0x101) {
          return 1;
        }
      }
      else {
        if (iVar1 - 0x446U < 6) {
          return 1;
        }
        if (iVar1 - 0x2a0U < 4) {
          return 1;
        }
      }
      ERR_new(1);
      ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x1a3,"check_padding_md");
      uVar2 = 0x9d;
    }
    ERR_set_error(4,uVar2,0);
    uVar2 = 0;
  }
  return uVar2;
}

