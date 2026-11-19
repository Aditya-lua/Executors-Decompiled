/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e47d8
 */

void FUN_008e47d8(undefined8 *param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined **local_88;
  undefined4 local_80;
  undefined8 local_7c;
  undefined **local_70;
  undefined4 local_68;
  undefined8 local_64;
  undefined1 auStack_58 [40];
  
  uVar1 = *param_1;
  FUN_008e3f88(auStack_58);
  local_68 = 0x11;
  local_70 = &PTR_LAB_00c4e320;
  local_64 = 0x4000000001;
  FUN_008e3bb4(uVar1,&local_70,auStack_58);
  local_80 = 0x11;
  local_88 = &PTR_LAB_00c4e320;
  local_7c = 0x4000000001;
  FUN_008e3c94(uVar1,&local_88);
  FUN_008e4084(uVar1,auStack_58);
  FUN_008e487c(uVar1,param_2);
  FUN_008e4204(auStack_58);
  return;
}

