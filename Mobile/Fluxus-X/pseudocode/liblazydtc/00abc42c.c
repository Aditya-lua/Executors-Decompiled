/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc42c
 */

long PKCS8_encrypt_ex(int param_1,long param_2,undefined8 param_3,undefined4 param_4,
                     undefined8 param_5,undefined4 param_6,undefined4 param_7,undefined8 param_8,
                     undefined8 param_9,undefined8 param_10)

{
  undefined4 uVar1;
  int iVar2;
  X509_ALGOR *a;
  long lVar3;
  undefined8 uVar4;
  
  if (param_1 == -1) {
    if (param_2 == 0) {
      ERR_new();
      uVar4 = 0x1b;
LAB_00abc594:
      ERR_set_debug("crypto/pkcs12/p12_p8e.c",uVar4,"PKCS8_encrypt_ex");
      uVar1 = 0xc0102;
      goto LAB_00abc5a4;
    }
    param_1 = -1;
LAB_00abc4d4:
    a = (X509_ALGOR *)PKCS5_pbe2_set_iv_ex(param_2,param_7,param_5,param_6,0,param_1,param_9);
  }
  else {
    ERR_set_mark();
    iVar2 = EVP_PBE_find(1,param_1,(int *)0x0,(int *)0x0,(undefined1 **)0x0);
    if (iVar2 != 0) {
      ERR_clear_last_mark();
      if (param_2 == 0) {
        ERR_new();
        uVar4 = 0x25;
        goto LAB_00abc594;
      }
      goto LAB_00abc4d4;
    }
    ERR_pop_to_mark();
    a = (X509_ALGOR *)PKCS5_pbe_set_ex(param_1,param_7,param_5,param_6,param_9);
  }
  if (a != (X509_ALGOR *)0x0) {
    lVar3 = PKCS8_set0_pbe_ex(param_3,param_4,param_8,a,param_9,param_10);
    if (lVar3 == 0) {
      X509_ALGOR_free(a);
      return 0;
    }
    return lVar3;
  }
  ERR_new();
  ERR_set_debug("crypto/pkcs12/p12_p8e.c",0x30,"PKCS8_encrypt_ex");
  uVar1 = 0x8000d;
LAB_00abc5a4:
  ERR_set_error(0x23,uVar1,0);
  return 0;
}

