/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b19384
 */

BIO * OSSL_HTTP_transfer(long *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                        undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
                        undefined8 param_9,undefined8 param_10,undefined8 param_11,
                        undefined4 param_12,undefined8 param_13,undefined8 param_14,
                        undefined8 param_15,undefined8 param_16,undefined4 param_17,
                        undefined8 param_18,undefined4 param_19,undefined4 param_20)

{
  int iVar1;
  BIO *a;
  long lVar2;
  code *pcVar3;
  long lVar4;
  
  if ((param_1 == (long *)0x0) || (lVar4 = *param_1, lVar4 == 0)) {
    lVar4 = OSSL_HTTP_open(param_2,param_3,param_6,param_7,param_5,param_8,param_9,param_10,param_11
                           ,param_12,param_19);
    if (lVar4 != 0) {
      param_19 = 0xffffffff;
      goto LAB_00b193f4;
    }
LAB_00b194b4:
    a = (BIO *)0x0;
  }
  else {
LAB_00b193f4:
    iVar1 = OSSL_HTTP_set1_request
                      (lVar4,param_4,param_13,param_14,param_15,param_16,param_17,param_18,param_19,
                       param_20);
    if (iVar1 == 0) {
      a = (BIO *)0x0;
      pcVar3 = *(code **)(lVar4 + 0x28);
    }
    else {
      a = (BIO *)OSSL_HTTP_exchange(lVar4,0);
      if ((a != (BIO *)0x0) && (*(int *)(lVar4 + 0xa0) != 0)) goto joined_r0x00b194b8;
      pcVar3 = *(code **)(lVar4 + 0x28);
    }
    if (pcVar3 != (code *)0x0) {
      lVar2 = (*pcVar3)(*(undefined8 *)(lVar4 + 0x18),*(undefined8 *)(lVar4 + 0x30),0,
                        a != (BIO *)0x0);
      if (lVar2 == 0) {
        OSSL_HTTP_REQ_CTX_free(lVar4);
        BIO_free(a);
        lVar4 = 0;
        goto LAB_00b194b4;
      }
      *(long *)(lVar4 + 0x18) = lVar2;
    }
    OSSL_HTTP_REQ_CTX_free(lVar4);
    lVar4 = 0;
  }
joined_r0x00b194b8:
  if (param_1 != (long *)0x0) {
    *param_1 = lVar4;
  }
  return a;
}

