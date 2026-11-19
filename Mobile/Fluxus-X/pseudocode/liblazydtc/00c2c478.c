/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2c478
 */

undefined8 FUN_00c2c478(long *param_1,int param_2,undefined8 param_3)

{
  ulong uVar1;
  long lVar2;
  undefined1 auStack_78 [32];
  long local_58;
  
  uVar1 = (**(code **)(*param_1 + 0x10))();
  if ((uVar1 & 1) == 0) {
    return 0xffffe672;
  }
  (**(code **)(*param_1 + 0x20))(param_1,param_2,param_3);
  if (param_2 == -1) {
    (**(code **)(*param_1 + 0x48))(param_1,auStack_78);
    (**(code **)(*param_1 + 0x68))(param_1,0);
    if (local_58 != 0) {
      lVar2 = (**(code **)(*param_1 + 0x18))(param_1,0xfffffffe);
      (**(code **)(*param_1 + 0x20))(param_1,0xfffffffe,local_58 + lVar2);
    }
  }
  return 0;
}

