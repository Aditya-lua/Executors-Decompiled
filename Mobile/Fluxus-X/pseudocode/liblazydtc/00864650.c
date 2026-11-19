/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00864650
 */

void FUN_00864650(long param_1)

{
  long lVar1;
  bool bVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  char *pcVar7;
  char *pcVar8;
  char *local_80;
  undefined8 uStack_78;
  char *local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  puVar6 = (undefined8 *)(param_1 + 0x94);
  pcVar7 = (char *)*puVar6;
  uVar3 = FUN_00861de4(param_1,"class reference expression");
  if (*(int *)(param_1 + 0x90) == 0x5b) {
    FUN_00858f2c(param_1);
    uVar5 = FUN_0086060c(param_1,0);
    if (*(int *)(param_1 + 0x90) == 0x5d) {
      FUN_00858f2c(param_1);
    }
    else {
      FUN_0086e3b4(param_1,0x5d,"class reference expression");
    }
    local_68 = *(undefined8 *)(param_1 + 0xb8);
    local_70 = pcVar7;
    uVar4 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x30);
    FUN_0084ef48(uVar4,&local_70,uVar3,uVar5);
    uVar3 = uVar4;
  }
  else if (*(int *)(param_1 + 0x90) == 0x2e) {
    FUN_00858f2c(param_1);
    if (*(int *)(param_1 + 0x90) == 0x119) {
      uStack_60 = *(undefined8 *)(param_1 + 0x9c);
      local_68 = *puVar6;
      pcVar8 = *(char **)(param_1 + 0xa8);
      FUN_00858f2c(param_1);
      local_70 = pcVar8;
    }
    else {
      FUN_0086e040(param_1,"class reference expression");
      if (*(int *)(param_1 + 0x90) - 0x123U < 0x15) {
        pcVar8 = *(char **)(param_1 + 0xa8);
        uStack_60 = *(undefined8 *)(param_1 + 0x9c);
        local_68 = *puVar6;
        local_70 = pcVar8;
        FUN_00858f2c(param_1);
      }
      else {
        pcVar8 = *(char **)(param_1 + 0x138);
        local_68 = *(undefined8 *)(param_1 + 0x94);
        local_70 = pcVar8;
        uStack_60 = local_68;
      }
    }
    bVar2 = false;
    uStack_78 = uStack_60;
    if ((*(char *)(param_1 + 0x178) == '\x01') && (pcVar8 != (char *)0x0)) {
      if (*pcVar8 == '_') {
        bVar2 = pcVar8[1] != '_';
      }
      else {
        bVar2 = false;
      }
    }
    local_80 = pcVar7;
    uVar5 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x50);
    FUN_0084eea4(uVar5,&local_80,uVar3,&local_70,&local_68,puVar6,0x2e,bVar2);
    uVar3 = uVar5;
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

