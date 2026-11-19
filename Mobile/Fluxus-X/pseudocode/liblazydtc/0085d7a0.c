/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085d7a0
 */

undefined8 FUN_0085d7a0(long param_1,undefined8 *param_2,uint param_3,undefined8 param_4)

{
  undefined4 uVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined1 auStack_e0 [16];
  undefined1 auStack_d0 [16];
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined1 local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  if (*(int *)(param_1 + 0x90) == 299) {
    if (*(long *)(lVar2 + 0x28) == local_68) {
      uVar3 = FUN_008639d4(param_1,param_2,param_3 & 1);
      return uVar3;
    }
  }
  else {
    if (*(int *)(param_1 + 0x90) == 0x119) {
      uStack_78 = *(undefined8 *)(param_1 + 0x9c);
      local_80 = *(undefined8 *)(param_1 + 0x94);
      uVar3 = *(undefined8 *)(param_1 + 0xa8);
      FUN_00858f2c(param_1);
      local_88 = uVar3;
    }
    else {
      FUN_0086e040(param_1,"type name");
      uStack_78 = *(undefined8 *)(param_1 + 0x9c);
      local_80 = *(undefined8 *)(param_1 + 0x94);
      local_88 = *(undefined8 *)(param_1 + 0x138);
    }
    local_70 = 1;
    local_b0 = 0;
    uStack_a8 = 0xffffffffffffffff;
    local_c0 = 0xffffffffffffffff;
    uStack_b8 = 0;
    if (*(char *)(param_1 + 0x68) == '\x01') {
      puVar6 = &uStack_a8;
      puVar8 = &uStack_b8;
      puVar9 = &local_c0;
    }
    else {
      puVar6 = (undefined8 *)0x0;
      puVar8 = (undefined8 *)0x0;
      puVar9 = (undefined8 *)0x0;
    }
    FUN_00863bd4(auStack_e0,param_1,1,puVar6,puVar8,puVar9);
    if (*(int *)(param_1 + 0x90) == 0x3d) {
      FUN_00858f2c(param_1);
      uVar3 = *(undefined8 *)(param_1 + 0xb0);
    }
    else {
      FUN_0086e3b4(param_1,0x3d,"type alias");
      uVar3 = 0xffffffffffffffff;
    }
    uStack_98 = *(undefined8 *)(param_1 + 0x9c);
    local_a0 = *(undefined8 *)(param_1 + 0x94);
    uVar7 = 0;
    uVar1 = *(undefined4 *)(param_1 + 0x124);
    if ((*(int *)(param_1 + 0x90) != 0x26) && (*(int *)(param_1 + 0x90) != 0x7c)) {
      uVar7 = FUN_008695d4(param_1,0,0);
      *(undefined4 *)(param_1 + 0x124) = uVar1;
    }
    lVar4 = FUN_00867310(param_1,uVar7,&local_a0);
    *(undefined4 *)(param_1 + 0x124) = uVar1;
    local_a0 = *param_2;
    uStack_98 = *(undefined8 *)(lVar4 + 0x14);
    uVar7 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x68);
    FUN_00850438(uVar7,&local_a0,&local_88,&local_80,auStack_e0,auStack_d0,lVar4,param_3 & 1);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar5 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
      FUN_00852070(uVar5,param_4,uStack_a8,uStack_b8,local_b0,local_c0,uVar3);
      local_a0 = uVar7;
      puVar6 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
      *puVar6 = uVar5;
    }
    if (*(long *)(lVar2 + 0x28) == local_68) {
      return uVar7;
    }
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

