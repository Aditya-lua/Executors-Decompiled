/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085b258
 */

undefined8 FUN_0085b258(long param_1)

{
  long lVar1;
  long lVar2;
  undefined4 uVar3;
  long lVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  byte bVar7;
  long lVar8;
  long lVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  ulong uVar12;
  long lVar13;
  undefined8 uVar14;
  ulong uVar15;
  undefined8 uVar16;
  ulong uVar17;
  undefined4 local_78;
  undefined4 uStack_74;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  uVar14 = *(undefined8 *)(param_1 + 0x94);
  uVar3 = *(undefined4 *)(param_1 + 0x90);
  FUN_00858f2c();
  lVar1 = *(long *)(param_1 + 0x1b8);
  lVar2 = *(long *)(param_1 + 0x1c0);
  *(int *)(*(long *)(param_1 + 0x160) + -4) = *(int *)(*(long *)(param_1 + 0x160) + -4) + 1;
  lVar8 = FUN_00859498(param_1);
  *(int *)(*(long *)(param_1 + 0x160) + -4) = *(int *)(*(long *)(param_1 + 0x160) + -4) + -1;
  uStack_74 = (undefined4)uVar14;
  uVar5 = uStack_74;
  uStack_70 = (undefined4)((ulong)uVar14 >> 0x20);
  uVar6 = uStack_70;
  local_78 = uVar3;
  bVar7 = FUN_00861094(param_1,0x136,&local_78);
  *(byte *)(lVar8 + 0x30) = bVar7 & 1;
  uVar14 = *(undefined8 *)(param_1 + 0xb0);
  if ((bVar7 & 1) == 0) {
    uVar14 = 0xffffffffffffffff;
  }
  lVar9 = FUN_0086060c(param_1,0);
  lVar13 = *(long *)(param_1 + 0x1b8);
  uVar15 = (ulong)(lVar2 - lVar1) >> 3 & 0xffffffff;
  uVar12 = *(long *)(param_1 + 0x1c0) - lVar13 >> 3;
  if (uVar15 < uVar12) {
    do {
      uVar17 = uVar12 - 1;
      uVar16 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar12 * 8 + -8) + 0x18);
      puVar10 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      *puVar10 = uVar16;
      uVar12 = uVar17;
    } while (uVar15 < uVar17);
    lVar13 = *(long *)(param_1 + 0x1b8);
    uVar12 = *(long *)(param_1 + 0x1c0) - lVar13 >> 3;
  }
  if (uVar15 < uVar12 || uVar15 - uVar12 == 0) {
    if (uVar15 < uVar12) {
      *(ulong *)(param_1 + 0x1c0) = lVar13 + uVar15 * 8;
    }
  }
  else {
    FUN_00870174(param_1 + 0x1b8,uVar15 - uVar12);
  }
  uStack_70 = (undefined4)*(undefined8 *)(lVar9 + 0x14);
  uStack_6c = (undefined4)((ulong)*(undefined8 *)(lVar9 + 0x14) >> 0x20);
  local_78 = uVar5;
  uStack_74 = uVar6;
  uVar16 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
  FUN_0084fbd4(uVar16,&local_78,lVar9,lVar8,bVar7 & 1);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    uVar11 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc);
    FUN_00851f0c(uVar11,uVar14);
    local_78 = (undefined4)uVar16;
    uStack_74 = (undefined4)((ulong)uVar16 >> 0x20);
    puVar10 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_78);
    *puVar10 = uVar11;
  }
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar16;
}

