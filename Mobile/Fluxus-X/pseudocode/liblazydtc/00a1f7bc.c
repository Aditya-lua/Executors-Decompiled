/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f7bc
 */

undefined8 FUN_00a1f7bc(PKCS8_PRIV_KEY_INFO *param_1,long param_2)

{
  int iVar1;
  int iVar2;
  ASN1_STRING *a;
  ASN1_INTEGER *a_00;
  ASN1_OBJECT *aobj;
  undefined8 uVar3;
  uchar *local_38;
  
  local_38 = (uchar *)0x0;
  if ((*(long *)(param_2 + 0x20) == 0) || (*(long *)(*(long *)(param_2 + 0x20) + 0x70) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_ameth.c",0xab,"dsa_priv_encode");
    ERR_set_error(10,0x65,0);
    a = (ASN1_STRING *)0x0;
    goto LAB_00a1f944;
  }
  a = ASN1_STRING_new();
  if (a == (ASN1_STRING *)0x0) {
    ERR_new();
    uVar3 = 0xb2;
LAB_00a1f8e8:
    ERR_set_debug("crypto/dsa/dsa_ameth.c",uVar3,"dsa_priv_encode");
    uVar3 = 0xc0100;
  }
  else {
    iVar1 = i2d_DSAparams(*(DSA **)(param_2 + 0x20),&a->data);
    a->length = iVar1;
    if (iVar1 < 1) {
      ERR_new();
      uVar3 = 0xb8;
      goto LAB_00a1f8e8;
    }
    a->type = 0x10;
    a_00 = BN_to_ASN1_INTEGER(*(BIGNUM **)(*(long *)(param_2 + 0x20) + 0x70),(ASN1_INTEGER *)0x0);
    if (a_00 == (ASN1_INTEGER *)0x0) {
      ERR_new();
      uVar3 = 0xc1;
    }
    else {
      iVar1 = i2d_ASN1_INTEGER(a_00,&local_38);
      ASN1_STRING_clear_free(a_00);
      if (0 < iVar1) {
        aobj = OBJ_nid2obj(0x74);
        iVar2 = PKCS8_pkey_set0(param_1,aobj,0,0x10,a,local_38,iVar1);
        if (iVar2 != 0) {
          return 1;
        }
        CRYPTO_clear_free(local_38,(long)iVar1,"crypto/dsa/dsa_ameth.c",0xd0);
        goto LAB_00a1f944;
      }
      ERR_new();
      uVar3 = 0xca;
    }
    ERR_set_debug("crypto/dsa/dsa_ameth.c",uVar3,"dsa_priv_encode");
    uVar3 = 0x6d;
  }
  ERR_set_error(10,uVar3,0);
LAB_00a1f944:
  ASN1_STRING_free(a);
  return 0;
}

