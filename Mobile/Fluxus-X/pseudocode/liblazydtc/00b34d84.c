/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b34d84
 */

long FUN_00b34d84(undefined8 *param_1,undefined8 param_2,int *param_3,int *param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  uint uVar4;
  undefined1 auStack_38 [4];
  int local_34;
  undefined8 local_28;
  
  local_28 = *param_1;
  iVar1 = ossl_do_blob_header(&local_28,param_2,auStack_38,&local_34,param_3,param_4);
  if (iVar1 < 1) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x122,"do_b2i_key");
    uVar3 = 0x7a;
  }
  else {
    uVar4 = local_34 + 7U >> 3;
    if (*param_3 == 0) {
      if (*param_4 == 0) {
        uVar4 = (local_34 + 0xfU >> 4) * 5 + uVar4 * 2;
      }
      uVar4 = uVar4 + 4;
    }
    else if (*param_4 == 0) {
      uVar4 = uVar4 * 2 + 0x40;
    }
    else {
      uVar4 = uVar4 * 3 + 0x2c;
    }
    if ((int)param_2 - 0x10U < uVar4) {
      ERR_new();
      ERR_set_debug("crypto/pem/pvkfmt.c",0x127,"do_b2i_key");
      uVar3 = 0x7b;
    }
    else {
      if (*param_3 == 0) {
        lVar2 = ossl_b2i_RSA_after_header(&local_28);
      }
      else {
        lVar2 = ossl_b2i_DSA_after_header(&local_28);
      }
      if (lVar2 != 0) {
        return lVar2;
      }
      ERR_new();
      ERR_set_debug("crypto/pem/pvkfmt.c",0x132,"do_b2i_key");
      uVar3 = 0x6e;
    }
  }
  ERR_set_error(9,uVar3,0);
  return 0;
}

