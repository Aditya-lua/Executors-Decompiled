/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4b034
 */

ulong FUN_00b4b034(undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4,
                  undefined8 param_5,long param_6,undefined8 param_7,long param_8,undefined8 param_9
                  ,long param_10,undefined8 param_11,long param_12,undefined8 param_13,long param_14
                  ,undefined8 param_15,int param_16,long *param_17)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  
  if (param_2 == 0) {
    uVar2 = WPACKET_init_null_der();
    iVar1 = (int)uVar2;
  }
  else {
    uVar2 = WPACKET_init_der();
    iVar1 = (int)uVar2;
  }
  if ((((((iVar1 != 0) && (uVar2 = ossl_DER_w_begin_sequence(param_1,0xffffffff), (int)uVar2 != 0))
        && ((param_14 == 0 ||
            (uVar2 = ossl_DER_w_octet_string(param_1,3,param_14,param_15), (int)uVar2 != 0)))) &&
       (((param_12 == 0 ||
         (uVar2 = ossl_DER_w_octet_string(param_1,2,param_12,param_13), (int)uVar2 != 0)) &&
        ((param_16 == 0 || (uVar2 = ossl_DER_w_octet_string_uint32(param_1,2), (int)uVar2 != 0))))))
      && (((param_10 == 0 ||
           (uVar2 = ossl_DER_w_octet_string(param_1,1,param_10,param_11), (int)uVar2 != 0)) &&
          ((param_8 == 0 ||
           (uVar2 = ossl_DER_w_octet_string(param_1,0,param_8,param_9), (int)uVar2 != 0)))))) &&
     ((((param_6 == 0 ||
        (uVar2 = ossl_DER_w_precompiled(param_1,0xffffffff,param_6,param_7), (int)uVar2 != 0)) &&
       (uVar2 = ossl_DER_w_begin_sequence(param_1,0xffffffff), (int)uVar2 != 0)) &&
      (uVar2 = ossl_DER_w_octet_string_uint32(param_1,0xffffffff,1), (int)uVar2 != 0)))) {
    if (param_17 != (long *)0x0) {
      lVar3 = WPACKET_get_curr(param_1);
      *param_17 = lVar3;
      if (lVar3 == 0) {
        return 0;
      }
    }
    uVar2 = ossl_DER_w_precompiled(param_1,0xffffffff,param_4,param_5);
    if ((((int)uVar2 != 0) && (uVar2 = ossl_DER_w_end_sequence(param_1,0xffffffff), (int)uVar2 != 0)
        ) && (uVar2 = ossl_DER_w_end_sequence(param_1,0xffffffff), (int)uVar2 != 0)) {
      iVar1 = WPACKET_finish(param_1);
      uVar2 = (ulong)(iVar1 != 0);
    }
  }
  return uVar2;
}

