/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4884
 */

undefined8 FUN_008e4884(long param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined1 *local_88;
  undefined **local_80;
  undefined4 local_78;
  undefined8 local_74;
  undefined **local_68;
  undefined4 local_60;
  undefined8 local_5c;
  undefined1 auStack_50 [32];
  
  FUN_008e3a68(auStack_50,param_1);
  uVar2 = param_1 - param_2;
  uVar1 = -uVar2;
  if (-1 < (long)uVar2) {
    uVar1 = uVar2;
  }
  if (uVar1 >> 0x20 == 0) {
    local_60 = 0x11;
    local_68 = &PTR_LAB_00c4e320;
    local_5c = 0x4000000001;
    FUN_008e494c(auStack_50,&local_68,param_1,param_2);
    local_78 = 0x11;
    local_80 = &PTR_LAB_00c4e320;
    local_74 = 0x4000000001;
    FUN_008e3c94(auStack_50,&local_80);
  }
  else {
    local_88 = auStack_50;
    FUN_008e47d8(&local_88,param_2);
  }
  FUN_008e47b0(auStack_50);
  uVar3 = FUN_008e4ab8();
  FUN_008e3d18(auStack_50);
  return uVar3;
}

