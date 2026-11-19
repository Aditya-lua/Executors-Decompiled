/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085a024
 */

undefined8 FUN_0085a024(long param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined1 auStack_d0 [8];
  undefined8 local_c8;
  int local_c0;
  undefined4 uStack_bc;
  undefined4 uStack_b8;
  undefined4 uStack_b4;
  undefined4 uStack_b0;
  undefined4 uStack_ac;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined1 local_84 [16];
  undefined1 local_74;
  ulong local_70;
  undefined8 uStack_68;
  undefined1 local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  uStack_98 = *(undefined8 *)(param_1 + 0x9c);
  local_a0 = *(undefined8 *)(param_1 + 0x94);
  FUN_00858f2c();
  if (DAT_00d1ece0 == '\x01') {
    if (*(int *)(param_1 + 0x90) == 0x12e) {
LAB_0085a078:
      uVar5 = FUN_00860258(param_1,&local_a0);
      goto LAB_0085a204;
    }
    if (((*(int *)(param_1 + 0x90) == 0x119) && (*(char **)(param_1 + 0xa8) != (char *)0x0)) &&
       (iVar4 = strcmp(*(char **)(param_1 + 0xa8),"const"), iVar4 == 0)) {
      FUN_00853d20(&local_c0,param_1 + 0x70);
      if (local_c0 == 0x119) goto LAB_0085a078;
    }
  }
  uVar6 = FUN_0086060c(param_1,0);
  uStack_a8 = *(undefined8 *)(param_1 + 0xa8);
  local_70 = local_70 & 0xffffffffffffff00;
  local_60 = 0;
  uStack_b8 = (undefined4)*(undefined8 *)(param_1 + 0x98);
  uStack_b4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
  local_c0 = (int)*(undefined8 *)(param_1 + 0x90);
  uStack_bc = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x90) >> 0x20);
  uStack_b0 = (undefined4)*(undefined8 *)(param_1 + 0xa0);
  uStack_ac = (undefined4)((ulong)*(undefined8 *)(param_1 + 0xa0) >> 0x20);
  if (*(int *)(param_1 + 0x90) == 0x134) {
    FUN_00858f2c(param_1);
    uStack_68 = CONCAT44(uStack_b0,uStack_b4);
    local_70 = CONCAT44(uStack_b8,uStack_bc);
    local_60 = 1;
  }
  else {
    FUN_0086e3b4(param_1,0x134,"if statement");
  }
  lVar1 = *(long *)(param_1 + 0x1b8);
  lVar2 = *(long *)(param_1 + 0x1c0);
  uVar7 = FUN_00859498(param_1);
  lVar11 = *(long *)(param_1 + 0x1b8);
  uVar12 = (ulong)(lVar2 - lVar1) >> 3 & 0xffffffff;
  uVar10 = *(long *)(param_1 + 0x1c0) - lVar11 >> 3;
  if (uVar12 < uVar10) {
    do {
      uVar13 = uVar10 - 1;
      uVar5 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar10 * 8 + -8) + 0x18);
      puVar8 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      *puVar8 = uVar5;
      uVar10 = uVar13;
    } while (uVar12 < uVar13);
    lVar11 = *(long *)(param_1 + 0x1b8);
    uVar10 = *(long *)(param_1 + 0x1c0) - lVar11 >> 3;
  }
  if (uVar12 < uVar10 || uVar12 - uVar10 == 0) {
    if (uVar12 < uVar10) {
      *(ulong *)(param_1 + 0x1c0) = lVar11 + uVar12 * 8;
    }
  }
  else {
    FUN_00870174(param_1 + 0x1b8,uVar12 - uVar10);
  }
  local_84[0] = 0;
  local_74 = 0;
  uVar9 = FUN_00860b6c(param_1,&local_a0,&local_c0,uVar7,auStack_d0,local_84);
  local_e0 = local_a0;
  uStack_d8 = local_c8;
  uVar5 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x98);
  FUN_0084f8b0(uVar5,&local_e0,uVar6,uVar7,uVar9,&local_70,local_84);
LAB_0085a204:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar5;
}

