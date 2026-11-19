/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5d2a0
 */

undefined8 FUN_00b5d2a0(long param_1,long param_2)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 *local_188;
  undefined1 auStack_180 [256];
  undefined8 *local_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined2 local_48;
  long local_38;
  
  local_38 = 0;
  uVar3 = 0;
  if (param_1 != 0) {
    if (param_2 != 0) {
      lVar1 = OSSL_PARAM_locate_const(param_2,"digest");
      if (lVar1 != 0) {
        local_80 = &local_78;
        local_48 = 0;
        uStack_50 = 0;
        local_58 = 0;
        uStack_60 = 0;
        local_68 = 0;
        uStack_70 = 0;
        local_78 = 0;
        memset(auStack_180,0,0x100);
        local_188 = auStack_180;
        lVar2 = OSSL_PARAM_locate_const(param_2,"properties");
        uVar3 = OSSL_PARAM_get_utf8_string(lVar1,&local_80,0x32);
        if ((int)uVar3 == 0) {
          return uVar3;
        }
        if ((lVar2 != 0) &&
           (uVar3 = OSSL_PARAM_get_utf8_string(lVar2,&local_188,0x100), (int)uVar3 == 0)) {
          return uVar3;
        }
        uVar3 = FUN_00b5d5b4(param_1,&local_78,auStack_180);
        if ((int)uVar3 == 0) {
          return uVar3;
        }
      }
      lVar1 = OSSL_PARAM_locate_const(param_2,"digest-size");
      if (lVar1 != 0) {
        uVar3 = OSSL_PARAM_get_size_t(lVar1,&local_38);
        if ((int)uVar3 == 0) {
          return uVar3;
        }
        if (((*(byte *)(param_1 + 0x4a) & 1) == 0) && (local_38 != *(long *)(param_1 + 0x160))) {
          return 0;
        }
        *(long *)(param_1 + 0x160) = local_38;
      }
    }
    uVar3 = 1;
  }
  return uVar3;
}

