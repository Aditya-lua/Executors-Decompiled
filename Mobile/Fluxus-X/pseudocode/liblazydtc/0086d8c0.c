/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086d8c0
 */

undefined8 FUN_0086d8c0(long param_1)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  uint uVar5;
  bool bVar6;
  int iVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  long lVar11;
  undefined8 *puVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_80;
  undefined8 uStack_78;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  uStack_78 = *(undefined8 *)(param_1 + 0x9c);
  local_80 = *(undefined8 *)(param_1 + 0x94);
  FUN_00858f2c();
  if (DAT_00d1ece0 == '\x01') {
    if (*(int *)(param_1 + 0x90) != 0x12e) {
      if (((*(int *)(param_1 + 0x90) == 0x119) && (*(char **)(param_1 + 0xa8) != (char *)0x0)) &&
         (iVar7 = strcmp(*(char **)(param_1 + 0xa8),"const"), iVar7 == 0)) {
        FUN_00853d20(&local_a0,param_1 + 0x70);
        if ((int)local_a0 == 0x119) goto LAB_0086d918;
      }
      goto LAB_0086d964;
    }
LAB_0086d918:
    uVar8 = FUN_0086dc74(param_1,&local_80);
  }
  else {
LAB_0086d964:
    uVar9 = FUN_0086060c(param_1,0);
    iVar7 = *(int *)(param_1 + 0x90);
    if (iVar7 == 0x134) {
      FUN_00858f2c(param_1);
      uVar13 = *(undefined8 *)(param_1 + 0xb0);
    }
    else {
      FUN_0086e3b4(param_1,0x134,"if then else expression");
      uVar13 = 0xffffffffffffffff;
    }
    uVar10 = FUN_0086060c(param_1,0);
    uVar5 = DAT_00d1eba0;
    iVar2 = *(int *)(param_1 + 0x90);
    uVar14 = *(undefined8 *)(param_1 + 0x94);
    if (iVar2 == 0x127) {
      iVar3 = *(int *)(param_1 + 0x124);
      uVar1 = iVar3 + 1;
      *(uint *)(param_1 + 0x124) = uVar1;
      if (uVar5 < uVar1) {
        if (*(long *)(lVar4 + 0x28) == local_68) {
          FUN_008578f8(param_1 + 0x94,
                       "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                       ,"expression");
        }
        goto LAB_0086db24;
      }
      lVar11 = FUN_0086d8c0(param_1);
      *(int *)(param_1 + 0x124) = iVar3;
      bVar6 = true;
    }
    else {
      bVar6 = iVar2 == 0x126;
      if (bVar6) {
        FUN_00858f2c(param_1);
      }
      else {
        FUN_0086e3b4(param_1,0x126,"if then else expression");
      }
      lVar11 = FUN_0086060c(param_1,0);
    }
    uStack_98 = *(undefined8 *)(lVar11 + 0x14);
    local_a0 = local_80;
    uVar8 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x80);
    FUN_0084f460(uVar8,&local_a0,uVar9,iVar7 == 0x134,uVar10,bVar6,lVar11);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
      FUN_00851e98(uVar9,uVar13,uVar14,iVar2 == 0x127,0xffffffffffffffff);
      local_a0 = uVar8;
      puVar12 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
      *puVar12 = uVar9;
    }
  }
  if (*(long *)(lVar4 + 0x28) == local_68) {
    return uVar8;
  }
LAB_0086db24:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

