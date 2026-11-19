/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5c6e8
 */

undefined8 FUN_00b5c6e8(long param_1,long param_2)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 *local_180;
  undefined1 auStack_178 [256];
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined2 local_48;
  undefined8 *local_38;
  
  uVar3 = 0;
  if (param_1 != 0) {
    if ((param_2 != 0) && (lVar1 = OSSL_PARAM_locate_const(param_2,"digest"), lVar1 != 0)) {
      local_38 = &local_78;
      local_48 = 0;
      uStack_50 = 0;
      local_58 = 0;
      uStack_60 = 0;
      local_68 = 0;
      uStack_70 = 0;
      local_78 = 0;
      memset(auStack_178,0,0x100);
      local_180 = auStack_178;
      lVar2 = OSSL_PARAM_locate_const(param_2,"properties");
      uVar3 = OSSL_PARAM_get_utf8_string(lVar1,&local_38,0x32);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
      if ((lVar2 != 0) &&
         (uVar3 = OSSL_PARAM_get_utf8_string(lVar2,&local_180,0x100), (int)uVar3 == 0)) {
        return uVar3;
      }
      uVar3 = FUN_00b5c9e0(param_1,&local_78,auStack_178);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
    }
    uVar3 = 1;
  }
  return uVar3;
}

