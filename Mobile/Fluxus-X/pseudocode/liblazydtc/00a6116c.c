/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6116c
 */

undefined4 OSSL_ENCODER_CTX_set_params(long param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  ulong uVar8;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_meth.c",0x29d,"OSSL_ENCODER_CTX_set_params");
    ERR_set_error(0x3b,0xc0102,0);
    uVar7 = 0;
  }
  else if ((*(long *)(param_1 + 0x18) == 0) ||
          (iVar1 = OSSL_ENCODER_CTX_get_num_encoders(param_1), iVar1 == 0)) {
    uVar7 = 1;
  }
  else {
    uVar8 = 0;
    uVar6 = 1;
    do {
      uVar3 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x18),uVar8 & 0xffffffff);
      lVar4 = OSSL_ENCODER_INSTANCE_get_encoder();
      lVar5 = OSSL_ENCODER_INSTANCE_get_encoder_ctx(uVar3);
      uVar7 = uVar6;
      if ((lVar5 != 0) && (*(code **)(lVar4 + 0x58) != (code *)0x0)) {
        iVar2 = (**(code **)(lVar4 + 0x58))(lVar5,param_2);
        uVar7 = 0;
        if (iVar2 != 0) {
          uVar7 = uVar6;
        }
      }
      uVar8 = uVar8 + 1;
      uVar6 = uVar7;
    } while (uVar8 < (ulong)(long)iVar1);
  }
  return uVar7;
}

