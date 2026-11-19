/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b14ec
 */

undefined8 FUN_009b14ec(void *param_1,int param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  undefined1 auStack_80 [80];
  
  if (param_2 < 0x50) {
    memcpy(auStack_80,param_1,(long)param_2);
    auStack_80[param_2] = 0;
    lVar2 = ssl3_get_cipher_by_std_name(auStack_80);
    if ((lVar2 != 0) && (iVar1 = OPENSSL_sk_push(param_3,lVar2), iVar1 == 0)) {
      ERR_new();
      ERR_set_debug("ssl/ssl_ciph.c",0x52d,"ciphersuite_cb");
      ERR_set_error(0x14,0xc0103,0);
      return 0;
    }
  }
  return 1;
}

