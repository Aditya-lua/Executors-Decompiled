/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab3d60
 */

undefined8
PEM_X509_INFO_read_ex
          (void *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
          ,undefined8 param_6)

{
  BIO_METHOD *type;
  BIO *bp;
  undefined8 uVar1;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_info.c",0x24,"PEM_X509_INFO_read_ex");
    ERR_set_error(9,0x80007,0);
    uVar1 = 0;
  }
  else {
    BIO_ctrl(bp,0x6a,0,param_1);
    uVar1 = PEM_X509_INFO_read_bio_ex(bp,param_2,param_3,param_4,param_5,param_6);
    BIO_free(bp);
  }
  return uVar1;
}

