/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae9ad0
 */

undefined8 OSSL_STORE_expect(long *param_1,uint param_2)

{
  undefined8 uVar1;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  uint local_14;
  
  local_14 = param_2;
  if ((param_1 == (long *)0x0) || (6 < param_2)) {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x119,"OSSL_STORE_expect");
    uVar1 = 0x80106;
  }
  else {
    if ((int)param_1[7] == 0) {
      *(uint *)(param_1 + 5) = param_2;
      if (param_1[1] == 0) {
        uVar1 = 1;
      }
      else {
        if (*(long *)(param_1[1] + 0xa8) == 0) {
          return 1;
        }
        memset(&local_70,0,0x50);
        OSSL_PARAM_construct_int(&local_98,"expect",&local_14);
        local_50 = local_78;
        uStack_68 = uStack_90;
        local_70 = local_98;
        uStack_58 = uStack_80;
        uStack_60 = local_88;
        uVar1 = (**(code **)(param_1[1] + 0xa8))(param_1[2],&local_70);
        if (param_1[1] != 0) {
          return uVar1;
        }
      }
      if (*(code **)(*param_1 + 0x28) == (code *)0x0) {
        return uVar1;
      }
      uVar1 = (**(code **)(*param_1 + 0x28))(param_1[2],local_14);
      return uVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x11d,"OSSL_STORE_expect");
    uVar1 = 0x75;
  }
  ERR_set_error(0x2c,uVar1,0);
  return 0;
}

