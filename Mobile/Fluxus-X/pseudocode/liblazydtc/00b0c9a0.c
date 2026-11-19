/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c9a0
 */

undefined8 ossl_x509_init_sig_info(long param_1)

{
  int iVar1;
  EVP_PKEY_ASN1_METHOD *pEVar2;
  char *name;
  EVP_MD *pEVar3;
  undefined8 uVar4;
  int local_28;
  int local_24;
  
  *(undefined8 *)(param_1 + 0xb8) = 0xffffffff;
  *(undefined8 *)(param_1 + 0xb0) = 0;
  iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_1 + 0x88));
  iVar1 = OBJ_find_sigid_algs(iVar1,&local_28,&local_24);
  if ((iVar1 == 0) || (local_24 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_set.c",0xd1,"x509_sig_info_init");
    uVar4 = 0x90;
    goto LAB_00b0ca34;
  }
  *(int *)(param_1 + 0xb0) = local_28;
  *(int *)(param_1 + 0xb4) = local_24;
  if (local_28 < 0x40) {
    if (local_28 == 0) {
      pEVar2 = EVP_PKEY_asn1_find((ENGINE **)0x0,local_24);
      if (((pEVar2 == (EVP_PKEY_ASN1_METHOD *)0x0) || (*(code **)(pEVar2 + 0xd8) == (code *)0x0)) ||
         (iVar1 = (**(code **)(pEVar2 + 0xd8))
                            ((undefined8 *)(param_1 + 0xb0),(undefined8 *)(param_1 + 0x88),
                             param_1 + 0x98), iVar1 == 0)) {
        ERR_new();
        ERR_set_debug("crypto/x509/x509_set.c",0xdd,"x509_sig_info_init");
        uVar4 = 0x8e;
        goto LAB_00b0ca34;
      }
    }
    else {
      if (local_28 == 4) {
        *(undefined4 *)(param_1 + 0xb8) = 0x27;
        goto LAB_00b0caf8;
      }
LAB_00b0cabc:
      name = OBJ_nid2sn(local_28);
      pEVar3 = EVP_get_digestbyname(name);
      if (pEVar3 == (EVP_MD *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/x509_set.c",0xff,"x509_sig_info_init");
        uVar4 = 0x8d;
LAB_00b0ca34:
        ERR_set_error(0xb,uVar4,0);
        return 0;
      }
      iVar1 = EVP_MD_get_size();
      *(int *)(param_1 + 0xb8) = iVar1 << 2;
    }
    if ((2 < local_28 - 0x2a0U) && (local_28 != 0x40)) goto LAB_00b0caf8;
  }
  else {
    if (local_28 != 0x40) {
      if (local_28 == 0x329) {
        *(undefined4 *)(param_1 + 0xb8) = 0x69;
        goto LAB_00b0caf8;
      }
      goto LAB_00b0cabc;
    }
    *(undefined4 *)(param_1 + 0xb8) = 0x3f;
  }
  *(uint *)(param_1 + 0xbc) = *(uint *)(param_1 + 0xbc) | 2;
LAB_00b0caf8:
  *(uint *)(param_1 + 0xbc) = *(uint *)(param_1 + 0xbc) | 1;
  return 1;
}

