/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086b888
 */

undefined8 FUN_0086b888(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined4 local_64;
  undefined8 local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  local_64 = *(undefined4 *)(param_1 + 0x90);
  uVar5 = *(undefined8 *)(param_1 + 0x94);
  local_60 = uVar5;
  FUN_00858f2c();
  uVar2 = FUN_0086060c(param_1,0);
  uVar6 = *(undefined8 *)(param_1 + 0x94);
  uVar7 = *(undefined8 *)(param_1 + 0x9c);
  if (*(int *)(param_1 + 0x90) == 0x5d) {
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086b5f8(param_1,0x5d,&local_64,0);
    uVar3 = FUN_0086e434(param_1,0x5d);
    if ((uVar3 & 1) == 0) {
      uVar6 = 0xffffffffffffffff;
    }
  }
  local_78 = param_2;
  uStack_70 = uVar7;
  uVar7 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
  FUN_0084ef48(uVar7,&local_78,param_3,uVar2);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    uVar2 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x14);
    FUN_00851e10(uVar2,uVar5,uVar6);
    local_78 = uVar7;
    puVar4 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_78);
    *puVar4 = uVar2;
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar7;
}

