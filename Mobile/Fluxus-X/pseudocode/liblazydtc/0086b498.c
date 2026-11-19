/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086b498
 */

undefined8 FUN_0086b498(long param_1)

{
  char *pcVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 local_68;
  undefined8 uStack_60;
  int local_54;
  undefined8 local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  if (*(int *)(param_1 + 0x90) == 0x28) {
    uVar7 = *(undefined8 *)(param_1 + 0x94);
    local_54 = *(int *)(param_1 + 0x90);
    local_50 = uVar7;
    FUN_00858f2c(param_1);
    uVar4 = FUN_0086060c(param_1,0);
    iVar2 = *(int *)(param_1 + 0x90);
    if (iVar2 == 0x29) {
      uStack_60 = *(undefined8 *)(param_1 + 0x9c);
      FUN_00858f2c(param_1);
    }
    else {
      pcVar1 = "; did you mean to use \'{\' when defining a table?";
      if (iVar2 != 0x3d) {
        pcVar1 = (char *)0x0;
      }
      FUN_0086b5f8(param_1,0x29,&local_54,pcVar1);
      uStack_60 = *(undefined8 *)(param_1 + 0xb8);
    }
    local_68 = uVar7;
    uVar7 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
    FUN_0084eb28(uVar7,&local_68,uVar4);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar4 = *(undefined8 *)(param_1 + 0xb0);
      if (iVar2 != 0x29) {
        uVar4 = 0xffffffffffffffff;
      }
      uVar5 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
      FUN_00851dac(uVar5,uVar4);
      local_68 = uVar7;
      puVar6 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_68);
      *puVar6 = uVar5;
    }
    if (*(long *)(lVar3 + 0x28) == local_48) {
      return uVar7;
    }
  }
  else if (*(long *)(lVar3 + 0x28) == local_48) {
    uVar4 = FUN_00861de4(param_1,"expression");
    return uVar4;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

