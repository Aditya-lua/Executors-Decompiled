/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3501c
 */

undefined8 ossl_b2i_bio(BIO *param_1,int *param_2)

{
  undefined4 uVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  undefined1 *data;
  long lVar6;
  undefined8 uVar7;
  undefined4 uVar8;
  int local_64;
  undefined1 auStack_60 [4];
  int local_5c;
  undefined1 auStack_58 [16];
  undefined1 *local_48;
  
  local_64 = -1;
  iVar3 = BIO_read(param_1,auStack_58,0x10);
  if (iVar3 != 0x10) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x14b,"ossl_b2i_bio");
    uVar7 = 0x7b;
LAB_00b350fc:
    ERR_set_error(9,uVar7,0);
    return 0;
  }
  local_48 = auStack_58;
  iVar4 = ossl_do_blob_header(&local_48,0x10,auStack_60,&local_5c,&local_64,param_2);
  iVar3 = local_64;
  if (iVar4 < 1) {
    return 0;
  }
  uVar2 = local_5c + 7U >> 3;
  if (local_64 == 0) {
    if (*param_2 == 0) {
      uVar2 = (local_5c + 0xfU >> 4) * 5 + uVar2 * 2;
    }
    uVar2 = uVar2 + 4;
  }
  else if (*param_2 == 0) {
    uVar2 = uVar2 * 2 + 0x40;
  }
  else {
    uVar2 = uVar2 * 3 + 0x2c;
  }
  if (0x19000 < uVar2) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x154,"ossl_b2i_bio");
    uVar7 = 0x80;
    goto LAB_00b350fc;
  }
  data = CRYPTO_malloc(uVar2,"crypto/pem/pvkfmt.c",0x157);
  if (data == (undefined1 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x159,"ossl_b2i_bio");
    uVar7 = 0xc0100;
  }
  else {
    local_48 = data;
    uVar5 = BIO_read(param_1,data,uVar2);
    if (uVar5 == uVar2) {
      if (iVar3 == 0) {
        lVar6 = ossl_b2i_RSA_after_header(&local_48,local_5c,*param_2);
      }
      else {
        lVar6 = ossl_b2i_DSA_after_header();
      }
      if (lVar6 != 0) {
        uVar8 = 0x74;
        if (iVar3 != 1) {
          uVar8 = 0;
        }
        uVar1 = 6;
        if (iVar3 != 0) {
          uVar1 = uVar8;
        }
        uVar7 = FUN_00b34ee4(lVar6,uVar1);
        goto LAB_00b35258;
      }
      ERR_new();
      ERR_set_debug("crypto/pem/pvkfmt.c",0x16a,"ossl_b2i_bio");
      uVar7 = 0x6e;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/pem/pvkfmt.c",0x15e,"ossl_b2i_bio");
      uVar7 = 0x7b;
    }
  }
  ERR_set_error(9,uVar7,0);
  uVar7 = 0;
LAB_00b35258:
  CRYPTO_free(data);
  return uVar7;
}

