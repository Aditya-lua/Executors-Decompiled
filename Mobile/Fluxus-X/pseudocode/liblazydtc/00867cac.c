/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00867cac
 */

undefined8
FUN_00867cac(long param_1,long param_2,undefined8 param_3,undefined8 param_4,long param_5,
            undefined8 param_6,long param_7,undefined8 param_8,ulong param_9,long param_10,
            undefined8 param_11,undefined8 param_12,ulong param_13)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  uint uVar4;
  long lVar5;
  undefined8 uVar6;
  ulong *puVar7;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  long local_98;
  undefined8 local_90;
  long local_88;
  undefined8 local_80;
  undefined8 local_78;
  ulong local_70;
  long local_68;
  ulong local_60;
  long local_58;
  
  uVar4 = DAT_00d1eba0;
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  uVar1 = *(int *)(param_1 + 0x124) + 1;
  local_b0 = param_11;
  uStack_a8 = param_12;
  *(uint *)(param_1 + 0x124) = uVar1;
  local_a0 = param_6;
  local_98 = param_7;
  local_90 = param_4;
  local_88 = param_5;
  if (uVar4 < uVar1) {
    if (*(long *)(lVar3 + 0x28) == local_58) {
      FUN_008578f8(param_1 + 0x94,
                   "Exceeded allowed recursion depth; simplify your %s to make the code compile",
                   "type annotation");
    }
    goto LAB_00867e9c;
  }
  iVar2 = *(int *)(param_1 + 0x90);
  if (iVar2 == 0x3a) {
    FUN_00860ecc(param_1,param_1 + 0x94,
                 "Return types in function type annotations are written after \'->\' instead of \':\'"
                );
    FUN_00853424(param_1 + 0x70);
LAB_00867d44:
    lVar5 = FUN_008665f0(param_1);
    local_68 = param_10;
    local_60 = param_13;
    local_80 = *(undefined8 *)(param_2 + 4);
    local_78 = *(undefined8 *)(lVar5 + 0x14);
    local_70 = param_9;
    uVar6 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x80);
    FUN_00850d14(uVar6,&local_80,param_3,&local_90,&local_a0,&local_70,&local_b0,lVar5);
  }
  else {
    if ((((iVar2 == 0x107) || (param_5 != 0)) || (param_7 != 0)) || (param_10 != 0)) {
      if (iVar2 == 0x107) {
        FUN_00858f2c(param_1);
      }
      else {
        FUN_0086e3b4(param_1,0x107,"function type");
      }
      goto LAB_00867d44;
    }
    puVar7 = (ulong *)(param_2 + 4);
    local_70 = *puVar7;
    local_68 = *(long *)(param_1 + 0xb8);
    FUN_00860ecc(param_1,&local_70,
                 "Expected \'->\' after \'()\' when parsing function type; did you mean \'nil\'?");
    uVar6 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x78);
    local_70 = local_70 & 0xffffffffffffff00;
    local_60 = local_60 & 0xffffffffffffff00;
    local_80 = 0;
    local_78 = 0;
    FUN_00850b3c(uVar6,puVar7,0,0,*(undefined8 *)(param_1 + 0x140),&local_70,puVar7,0,&local_80,0);
  }
  if (*(long *)(lVar3 + 0x28) == local_58) {
    return uVar6;
  }
LAB_00867e9c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

