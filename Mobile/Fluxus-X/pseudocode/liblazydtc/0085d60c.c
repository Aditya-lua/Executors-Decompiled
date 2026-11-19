/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085d60c
 */

long * FUN_0085d60c(long param_1,long param_2,undefined4 param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  long *local_68;
  undefined8 uStack_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  iVar1 = *(int *)(param_2 + 8);
  if ((((iVar1 != DAT_00d1b010) || (*(char *)(*(long *)(param_2 + 0x20) + 0x30) == '\x01')) &&
      (iVar1 != DAT_00d1b020)) && ((iVar1 != DAT_00d1b060 && (iVar1 != DAT_00d1b050)))) {
    if (DAT_00d1ec40 == '\x01') {
      param_2 = FUN_00864840(param_1,param_2);
    }
    else {
      local_68 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
      *local_68 = param_2;
      uStack_60 = 1;
      param_2 = FUN_008659e8(param_1,param_2 + 0xc,&local_68,
                             "Assigned expression must be a variable or a field");
    }
  }
  uVar7 = *(undefined8 *)(param_1 + 0x94);
  FUN_00858f2c(param_1);
  lVar3 = FUN_0086060c(param_1,0);
  local_68 = *(long **)(param_2 + 0xc);
  uStack_60 = *(undefined8 *)(lVar3 + 0x14);
  plVar4 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
  FUN_00850260(plVar4,&local_68,param_3,param_2,lVar3);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    uVar5 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
    FUN_00851fd0(uVar5,uVar7);
    local_68 = plVar4;
    puVar6 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_68);
    *puVar6 = uVar5;
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return plVar4;
}

