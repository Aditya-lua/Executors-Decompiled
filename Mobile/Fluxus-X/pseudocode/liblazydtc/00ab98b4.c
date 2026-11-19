/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab98b4
 */

int FUN_00ab98b4(undefined8 param_1,undefined4 param_2,long *param_3,long *param_4)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  undefined8 local_48;
  
  while( true ) {
    if (*param_3 == 0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/i2d_evp.c",0x46,"i2d_provided");
      ERR_set_error(0xd,0xc4,0);
      return -1;
    }
    local_48 = 0x7fffffff;
    if (param_4 == (long *)0x0) {
      bVar1 = true;
    }
    else {
      bVar1 = *param_4 == 0;
    }
    lVar3 = OSSL_ENCODER_CTX_new_for_pkey(param_1,param_2,*param_3,param_3[1],0);
    if (lVar3 == 0) break;
    iVar2 = OSSL_ENCODER_to_data(lVar3,param_4,&local_48);
    if (iVar2 == 0) {
      iVar2 = -1;
    }
    else {
      iVar2 = (int)local_48;
      if (!bVar1) {
        iVar2 = 0x7fffffff - (int)local_48;
      }
    }
    OSSL_ENCODER_CTX_free(lVar3);
    param_3 = param_3 + 2;
    if (iVar2 != -1) {
      return iVar2;
    }
  }
  return -1;
}

