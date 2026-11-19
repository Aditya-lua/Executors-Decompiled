/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab8b8c
 */

undefined4
PEM_write_PrivateKey_ex
          (FILE *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined4 param_5
          ,undefined8 param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9)

{
  undefined4 uVar1;
  BIO *a;
  
  a = BIO_new_fp(param_1,0);
  if (a == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_pkey.c",0x1b4,"PEM_write_PrivateKey_ex");
    ERR_set_error(9,0x80007,0);
    uVar1 = 0;
  }
  else {
    uVar1 = PEM_write_bio_PrivateKey_ex
                      (a,param_2,param_3,param_4,param_5,param_6,param_7,param_8,param_9);
    BIO_free(a);
  }
  return uVar1;
}

