/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b34a28
 */

undefined8
ossl_do_blob_header(long *param_1,uint param_2,int *param_3,undefined4 *param_4,int *param_5,
                   int *param_6)

{
  undefined8 uVar1;
  int iVar2;
  char *pcVar3;
  
  if (param_2 < 0x10) {
    return 0;
  }
  pcVar3 = (char *)*param_1;
  if (*pcVar3 == '\a') {
    iVar2 = 0;
    if (*param_6 != 1) goto LAB_00b34aa0;
    ERR_new();
    uVar1 = 0xb3;
LAB_00b34a90:
    ERR_set_debug("crypto/pem/pvkfmt.c",uVar1,"ossl_do_blob_header");
    uVar1 = 0x78;
    goto LAB_00b34b64;
  }
  if (*pcVar3 != '\x06') {
    return 0;
  }
  if (*param_6 == 0) {
    ERR_new();
    uVar1 = 0xab;
LAB_00b34b58:
    ERR_set_debug("crypto/pem/pvkfmt.c",uVar1,"ossl_do_blob_header");
    uVar1 = 0x77;
    goto LAB_00b34b64;
  }
  iVar2 = 1;
LAB_00b34aa0:
  *param_6 = iVar2;
  if (pcVar3[1] != '\x02') {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0xbf,"ossl_do_blob_header");
    uVar1 = 0x75;
    goto LAB_00b34b64;
  }
  *param_3 = *(int *)(pcVar3 + 8);
  *param_4 = *(undefined4 *)(pcVar3 + 0xc);
  iVar2 = *param_3;
  if (iVar2 < 0x32415352) {
    if ((iVar2 != 0x31415352) && (iVar2 != 0x31535344)) {
LAB_00b34c28:
      ERR_new();
      uVar1 = 0xda;
      goto LAB_00b34ca8;
    }
    if (*param_6 == 0) {
      ERR_new();
      uVar1 = 0xcc;
      goto LAB_00b34b58;
    }
  }
  else {
    if ((iVar2 != 0x32415352) && (iVar2 != 0x32535344)) goto LAB_00b34c28;
    if (*param_6 == 1) {
      ERR_new();
      uVar1 = 0xd4;
      goto LAB_00b34a90;
    }
  }
  if (iVar2 < 0x32415352) {
    if (iVar2 == 0x31415352) {
LAB_00b34c44:
      iVar2 = 0;
      if (*param_5 != 1) {
LAB_00b34c7c:
        *param_5 = iVar2;
        *param_1 = (long)(pcVar3 + 0x10);
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/pem/pvkfmt.c",0xeb,"ossl_do_blob_header");
      uVar1 = 0x84;
LAB_00b34b64:
      ERR_set_error(9,uVar1,0);
      return 0;
    }
    if (iVar2 == 0x31535344) {
LAB_00b34c18:
      if (*param_5 != 0) {
        iVar2 = 1;
        goto LAB_00b34c7c;
      }
      ERR_new();
      ERR_set_debug("crypto/pem/pvkfmt.c",0xe3,"ossl_do_blob_header");
      uVar1 = 0x83;
      goto LAB_00b34b64;
    }
  }
  else {
    if (iVar2 == 0x32415352) goto LAB_00b34c44;
    if (iVar2 == 0x32535344) goto LAB_00b34c18;
  }
  ERR_new();
  uVar1 = 0xf2;
LAB_00b34ca8:
  ERR_set_debug("crypto/pem/pvkfmt.c",uVar1,"ossl_do_blob_header");
  ERR_set_error(9,0x74,0);
  return 0xffffffff;
}

