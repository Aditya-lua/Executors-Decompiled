/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086b358
 */

undefined8 FUN_0086b358(long param_1)

{
  undefined4 uVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 local_70;
  undefined8 uStack_68;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  uVar8 = *(undefined8 *)(param_1 + 0x94);
  uVar3 = FUN_0086c66c();
  if (*(int *)(param_1 + 0x90) == 0x108) {
    uVar7 = *(undefined8 *)(param_1 + 0x94);
    FUN_00858f2c(param_1);
    uStack_68 = *(undefined8 *)(param_1 + 0x9c);
    local_70 = *(undefined8 *)(param_1 + 0x94);
    uVar6 = 0;
    uVar1 = *(undefined4 *)(param_1 + 0x124);
    if ((*(int *)(param_1 + 0x90) != 0x26) && (*(int *)(param_1 + 0x90) != 0x7c)) {
      uVar6 = FUN_008695d4(param_1,0,0);
      *(undefined4 *)(param_1 + 0x124) = uVar1;
    }
    lVar4 = FUN_00867310(param_1,uVar6,&local_70);
    *(undefined4 *)(param_1 + 0x124) = uVar1;
    uStack_68 = *(undefined8 *)(lVar4 + 0x14);
    local_70 = uVar8;
    uVar8 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
    FUN_0084f3c4(uVar8,&local_70,uVar3,lVar4);
    uVar3 = uVar8;
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar6 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
      FUN_00851e84(uVar6,uVar7);
      local_70 = uVar8;
      puVar5 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_70);
      *puVar5 = uVar6;
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar3;
}

