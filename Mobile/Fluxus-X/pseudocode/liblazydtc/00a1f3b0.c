/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f3b0
 */

undefined4 FUN_00a1f3b0(EVP_PKEY *param_1,X509_PUBKEY *param_2)

{
  int iVar1;
  DSA *r;
  BIGNUM *pBVar2;
  undefined8 uVar3;
  ASN1_INTEGER *ai;
  X509_ALGOR *local_50;
  int *local_48;
  int local_40;
  int local_3c;
  uchar *local_38;
  uchar *puStack_28;
  
  iVar1 = X509_PUBKEY_get0_param((ASN1_OBJECT **)0x0,&puStack_28,&local_3c,&local_50,param_2);
  if (iVar1 == 0) {
    return 0;
  }
  X509_ALGOR_get0((ASN1_OBJECT **)0x0,&local_40,&local_48,local_50);
  if ((local_40 == -1) || (local_40 == 5)) {
    r = DSA_new();
    if (r != (DSA *)0x0) {
LAB_00a1f46c:
      ai = d2i_ASN1_INTEGER((ASN1_INTEGER **)0x0,&puStack_28,(long)local_3c);
      if (ai == (ASN1_INTEGER *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/dsa/dsa_ameth.c",0x42,"dsa_pub_decode");
        uVar3 = 0x68;
      }
      else {
        pBVar2 = ASN1_INTEGER_to_BN(ai,(BIGNUM *)0x0);
        (r->ex_data).sk = (stack_st_void *)pBVar2;
        if (pBVar2 != (BIGNUM *)0x0) {
          r[1].priv_key = (BIGNUM *)((long)&(r[1].priv_key)->d + 1);
          ASN1_INTEGER_free(ai);
          EVP_PKEY_assign(param_1,0x74,r);
          return 1;
        }
        ERR_new();
        ERR_set_debug("crypto/dsa/dsa_ameth.c",0x47,"dsa_pub_decode");
        uVar3 = 0x6c;
      }
      ERR_set_error(10,uVar3,0);
      goto LAB_00a1f588;
    }
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_ameth.c",0x39,"dsa_pub_decode");
    uVar3 = 0xc0100;
  }
  else {
    if (local_40 != 0x10) {
      ERR_new();
      ERR_set_debug("crypto/dsa/dsa_ameth.c",0x3d,"dsa_pub_decode");
      ERR_set_error(10,0x69,0);
      ai = (ASN1_STRING *)0x0;
      r = (DSA *)0x0;
      goto LAB_00a1f588;
    }
    local_38 = *(uchar **)(local_48 + 2);
    r = d2i_DSAparams((DSA **)0x0,&local_38,(long)*local_48);
    if (r != (DSA *)0x0) goto LAB_00a1f46c;
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_ameth.c",0x33,"dsa_pub_decode");
    uVar3 = 0x68;
  }
  ERR_set_error(10,uVar3,0);
  ai = (ASN1_STRING *)0x0;
LAB_00a1f588:
  ASN1_INTEGER_free(ai);
  DSA_free(r);
  return 0;
}

