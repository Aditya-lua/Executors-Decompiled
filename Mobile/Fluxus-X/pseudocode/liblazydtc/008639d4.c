/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008639d4
 */

undefined8 FUN_008639d4(long param_1,undefined8 *param_2,uint param_3,undefined8 param_4)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  char cVar6;
  bool bVar7;
  long lVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  byte bVar11;
  undefined8 uVar12;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined4 local_b0;
  undefined4 uStack_ac;
  undefined4 uStack_a8;
  undefined4 uStack_a4;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined1 local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  uStack_98 = *(undefined8 *)(param_1 + 0xa8);
  uStack_a0 = *(undefined8 *)(param_1 + 0xa0);
  uStack_a8 = (undefined4)*(undefined8 *)(param_1 + 0x98);
  uStack_a4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
  local_b0 = (undefined4)*(undefined8 *)(param_1 + 0x90);
  uStack_ac = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x90) >> 0x20);
  FUN_00858f2c();
  lVar1 = *(long *)(param_1 + 0x1d0);
  lVar3 = *(long *)(param_1 + 0x1d8);
  if (*(int *)(param_1 + 0x90) == 0x119) {
    uStack_78 = *(undefined8 *)(param_1 + 0x9c);
    local_80 = *(undefined8 *)(param_1 + 0x94);
    uVar12 = *(undefined8 *)(param_1 + 0xa8);
    FUN_00858f2c(param_1);
    local_88 = uVar12;
  }
  else {
    FUN_0086e040(param_1,"type function name");
    uStack_78 = *(undefined8 *)(param_1 + 0x9c);
    local_80 = *(undefined8 *)(param_1 + 0x94);
    local_88 = *(undefined8 *)(param_1 + 0x138);
  }
  local_70 = 1;
  *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) = *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) + 1;
  uVar12 = *(undefined8 *)(param_1 + 0x170);
  bVar7 = DAT_00d1ec80 == '\x01';
  *(long *)(param_1 + 0x170) = *(long *)(param_1 + 0x160) - *(long *)(param_1 + 0x158) >> 3;
  if (bVar7) {
    bVar11 = *(byte *)(param_1 + 0x178);
    *(undefined1 *)(param_1 + 0x178) = 0;
  }
  else {
    bVar11 = 0;
  }
  local_c0 = 0;
  uStack_b8 = 0;
  lVar8 = FUN_00863248(param_1,0,&local_b0,&local_88,0,&local_c0,0,0);
  cVar6 = DAT_00d1ec80;
  *(undefined8 *)(param_1 + 0x170) = uVar12;
  if (cVar6 == '\x01') {
    *(byte *)(param_1 + 0x178) = bVar11 & 1;
  }
  *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) = *(int *)(*(long *)(param_1 + 0x1e8) + 0x4a0) + -1;
  lVar2 = *(long *)(param_1 + 0x1d0);
  lVar4 = *(long *)(param_1 + 0x1d8);
  local_c0 = *param_2;
  uStack_b8 = *(undefined8 *)(lVar8 + 0x14);
  uVar12 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x48);
  FUN_0085054c(uVar12,&local_c0,&local_88,&local_80,lVar8,param_3 & 1,
               (ulong)(lVar3 - lVar1) < (ulong)(lVar4 - lVar2));
  if (*(char *)(param_1 + 0x68) == '\x01') {
    uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x14);
    FUN_00852090(uVar9,param_4,CONCAT44(uStack_a8,uStack_ac));
    local_c0 = uVar12;
    puVar10 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_c0);
    *puVar10 = uVar9;
  }
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar12;
}

