/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a12a9c
 */

int FUN_00a12a9c(uchar *param_1,undefined8 *param_2)

{
  int iVar1;
  size_t sVar2;
  uchar *t;
  undefined8 uVar3;
  
  sVar2 = strlen((char *)param_1);
  if (sVar2 == 0) {
    *param_2 = 0;
    return 0;
  }
  t = CRYPTO_malloc((int)(sVar2 >> 2) * 3,"crypto/ct/ct_b64.c",0x24);
  if (t == (uchar *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_b64.c",0x26,"ct_base64_decode");
    uVar3 = 0xc0100;
  }
  else {
    iVar1 = EVP_DecodeBlock(t,param_1,(int)sVar2);
    if (-1 < iVar1) {
      if (param_1[sVar2 - 1] != '=') {
LAB_00a12bac:
        *param_2 = t;
        return iVar1;
      }
      if (param_1[sVar2 - 2] != '=') {
        iVar1 = iVar1 + -1;
        goto LAB_00a12bac;
      }
      if (param_1[sVar2 - 3] != '=') {
        iVar1 = iVar1 + -2;
        goto LAB_00a12bac;
      }
      goto LAB_00a12b8c;
    }
    ERR_new();
    ERR_set_debug("crypto/ct/ct_b64.c",0x2c,"ct_base64_decode");
    uVar3 = 0x6c;
  }
  ERR_set_error(0x32,uVar3,0);
LAB_00a12b8c:
  CRYPTO_free(t);
  return -1;
}

