/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9958
 */

int FUN_009b9958(long *param_1,undefined8 param_2,undefined4 param_3)

{
  int iVar1;
  long lVar2;
  int iVar3;
  
  if (*param_1 == 0) {
    lVar2 = OPENSSL_sk_new_null();
    *param_1 = lVar2;
    if (lVar2 == 0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x138f,"ct_move_scts");
      ERR_set_error(0x14,0xc0100,0);
      lVar2 = 0;
LAB_009b9a18:
      SCT_free(lVar2);
      return -1;
    }
  }
  lVar2 = OPENSSL_sk_pop(param_2);
  if (lVar2 == 0) {
    iVar3 = 0;
  }
  else {
    iVar3 = 0;
    do {
      iVar1 = SCT_set_source(lVar2,param_3);
      if ((iVar1 != 1) || (iVar1 = OPENSSL_sk_push(*param_1,lVar2), iVar1 == 0)) goto LAB_009b9a18;
      iVar3 = iVar3 + 1;
      lVar2 = OPENSSL_sk_pop(param_2);
    } while (lVar2 != 0);
  }
  return iVar3;
}

