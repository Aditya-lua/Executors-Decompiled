/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d8b0
 */

undefined8
OSSL_PARAM_BLD_push_octet_ptr
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  undefined8 uVar1;
  long lVar2;
  
  if (param_4 >> 0x1f == 0) {
    lVar2 = FUN_00a9d5b4(param_1,param_2,param_4 & 0xffffffff,8,7,0);
    uVar1 = 0;
    if (lVar2 != 0) {
      *(undefined8 *)(lVar2 + 0x28) = param_3;
      uVar1 = 1;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/param_build.c",0x12a,"OSSL_PARAM_BLD_push_octet_ptr");
    ERR_set_error(0xf,0x70,0);
    uVar1 = 0;
  }
  return uVar1;
}

