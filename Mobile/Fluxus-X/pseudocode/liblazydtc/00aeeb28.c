/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeeb28
 */

undefined8 FUN_00aeeb28(undefined8 param_1,undefined8 param_2,long *param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined4 local_68 [2];
  undefined8 local_60;
  
  memset(local_68,0,0x48);
  local_68[0] = 5;
  if ((*(code **)(*param_3 + 0x10) == (code *)0x0) ||
     (local_60 = param_1, iVar1 = (**(code **)(*param_3 + 0x10))(param_3,local_68), 0 < iVar1)) {
    uVar2 = 0;
  }
  else {
    uVar2 = 0xffffffff;
  }
  return uVar2;
}

