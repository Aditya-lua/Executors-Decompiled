/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abdd1c
 */

undefined8
ASN1_item_d2i_fp_ex(undefined8 param_1,void *param_2,undefined8 param_3,undefined8 param_4,
                   undefined8 param_5)

{
  BUF_MEM *a;
  int iVar1;
  BIO_METHOD *type;
  BIO *bp;
  undefined8 uVar2;
  char *local_50;
  BUF_MEM *local_48;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_d2i_fp.c",0x5c,"ASN1_item_d2i_fp_ex");
    ERR_set_error(0xd,0x80007,0);
    uVar2 = 0;
  }
  else {
    BIO_ctrl(bp,0x6a,0,param_2);
    local_48 = (BUF_MEM *)0x0;
    iVar1 = asn1_d2i_read_bio(bp,&local_48);
    a = local_48;
    if (iVar1 < 0) {
      uVar2 = 0;
    }
    else {
      local_50 = local_48->data;
      uVar2 = ASN1_item_d2i_ex(param_3,&local_50,(long)iVar1,param_1,param_4,param_5);
    }
    BUF_MEM_free(a);
    BIO_free(bp);
  }
  return uVar2;
}

