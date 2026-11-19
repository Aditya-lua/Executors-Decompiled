/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16b48
 */

undefined8
d2i_PrivateKey_ex_fp(void *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *bp;
  undefined8 uVar2;
  char *local_48;
  BUF_MEM *local_38;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_all.c",0x2b6,"d2i_PrivateKey_ex_fp");
    ERR_set_error(0xb,0x80007,0);
    uVar2 = 0;
  }
  else {
    BIO_ctrl(bp,0x6a,0,param_1);
    local_38 = (BUF_MEM *)0x0;
    iVar1 = asn1_d2i_read_bio(bp,&local_38);
    if (iVar1 < 0) {
      uVar2 = 0;
    }
    else {
      local_48 = local_38->data;
      uVar2 = d2i_AutoPrivateKey_ex(param_2,&local_48,(long)iVar1,param_3,param_4);
    }
    BUF_MEM_free(local_38);
    BIO_free(bp);
  }
  return uVar2;
}

