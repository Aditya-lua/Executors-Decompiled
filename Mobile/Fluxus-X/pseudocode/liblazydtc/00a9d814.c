/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d814
 */

undefined8
OSSL_PARAM_BLD_push_octet_string
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  undefined4 uVar1;
  undefined8 uVar2;
  long lVar3;
  
  if (param_4 >> 0x1f == 0) {
    uVar1 = CRYPTO_secure_allocated(param_3);
    lVar3 = FUN_00a9d5b4(param_1,param_2,param_4 & 0xffffffff,param_4,5,uVar1);
    uVar2 = 0;
    if (lVar3 != 0) {
      *(undefined8 *)(lVar3 + 0x28) = param_3;
      uVar2 = 1;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/param_build.c",0x119,"OSSL_PARAM_BLD_push_octet_string");
    ERR_set_error(0xf,0x70,0);
    uVar2 = 0;
  }
  return uVar2;
}

