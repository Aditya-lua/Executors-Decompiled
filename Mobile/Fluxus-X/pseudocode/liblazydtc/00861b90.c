/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00861b90
 */

long FUN_00861b90(long param_1,undefined1 *param_2,undefined8 *param_3)

{
  uint uVar1;
  undefined4 uVar2;
  long lVar3;
  uint uVar4;
  long lVar5;
  long lVar6;
  int iVar7;
  undefined8 uVar8;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if (*(int *)(param_1 + 0x90) == 0x119) {
    *param_3 = *(undefined8 *)(param_1 + 0xa8);
  }
  lVar5 = FUN_00861de4(param_1,"function name");
  iVar7 = *(int *)(param_1 + 0x90);
  uVar2 = *(undefined4 *)(param_1 + 0x124);
  lVar6 = lVar5;
  if (iVar7 == 0x2e) {
    do {
      local_70 = *(undefined8 *)(param_1 + 0x94);
      FUN_00858f2c(param_1);
      if (*(int *)(param_1 + 0x90) == 0x119) {
        uStack_78 = *(undefined8 *)(param_1 + 0x9c);
        local_80 = *(undefined8 *)(param_1 + 0x94);
        uVar8 = *(undefined8 *)(param_1 + 0xa8);
        FUN_00858f2c(param_1);
      }
      else {
        FUN_0086e040(param_1,"field name");
        local_80 = *(undefined8 *)(param_1 + 0x94);
        uVar8 = *(undefined8 *)(param_1 + 0x138);
        uStack_78 = local_80;
      }
      *param_3 = uVar8;
      local_98 = *(undefined8 *)(lVar6 + 0xc);
      local_90 = uStack_78;
      uStack_88 = uVar8;
      lVar5 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x50);
      FUN_0084eea4(lVar5,&local_98,lVar6,&uStack_88,&local_80,&local_70,0x2e,0);
      uVar4 = DAT_00d1eba0;
      uVar1 = *(int *)(param_1 + 0x124) + 1;
      *(uint *)(param_1 + 0x124) = uVar1;
      if (uVar4 < uVar1) {
        if (*(long *)(lVar3 + 0x28) == local_68) {
          FUN_008578f8(param_1 + 0x94,
                       "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                       ,"function name");
        }
        goto LAB_00861de0;
      }
      iVar7 = *(int *)(param_1 + 0x90);
      lVar6 = lVar5;
    } while (iVar7 == 0x2e);
  }
  *(undefined4 *)(param_1 + 0x124) = uVar2;
  lVar6 = lVar5;
  if (iVar7 == 0x3a) {
    local_70 = *(undefined8 *)(param_1 + 0x94);
    FUN_00858f2c(param_1);
    if (*(int *)(param_1 + 0x90) == 0x119) {
      uStack_78 = *(undefined8 *)(param_1 + 0x9c);
      local_80 = *(undefined8 *)(param_1 + 0x94);
      uVar8 = *(undefined8 *)(param_1 + 0xa8);
      FUN_00858f2c(param_1);
    }
    else {
      FUN_0086e040(param_1,"method name");
      local_80 = *(undefined8 *)(param_1 + 0x94);
      uVar8 = *(undefined8 *)(param_1 + 0x138);
      uStack_78 = local_80;
    }
    *param_3 = uVar8;
    local_98 = *(undefined8 *)(lVar5 + 0xc);
    local_90 = uStack_78;
    uStack_88 = uVar8;
    lVar6 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x50);
    FUN_0084eea4(lVar6,&local_98,lVar5,&uStack_88,&local_80,&local_70,0x3a,0);
    *param_2 = 1;
  }
  if (*(long *)(lVar3 + 0x28) == local_68) {
    return lVar6;
  }
LAB_00861de0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

