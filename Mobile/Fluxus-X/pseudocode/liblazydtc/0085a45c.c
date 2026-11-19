/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085a45c
 */

long FUN_0085a45c(long param_1)

{
  long lVar1;
  long lVar2;
  undefined4 uVar3;
  long lVar4;
  byte bVar5;
  long lVar6;
  undefined8 *puVar7;
  ulong uVar8;
  long lVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  ulong uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  ulong uVar15;
  undefined4 local_78;
  undefined4 uStack_74;
  undefined4 uStack_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  uVar11 = *(undefined8 *)(param_1 + 0x94);
  uVar3 = *(undefined4 *)(param_1 + 0x90);
  FUN_00858f2c();
  lVar1 = *(long *)(param_1 + 0x1b8);
  lVar2 = *(long *)(param_1 + 0x1c0);
  uVar10 = *(undefined8 *)(param_1 + 0x94);
  lVar6 = FUN_00859498(param_1);
  lVar9 = *(long *)(param_1 + 0x1b8);
  uVar12 = (ulong)(lVar2 - lVar1) >> 3 & 0xffffffff;
  uVar8 = *(long *)(param_1 + 0x1c0) - lVar9 >> 3;
  if (uVar12 < uVar8) {
    do {
      uVar15 = uVar8 - 1;
      uVar13 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar8 * 8 + -8) + 0x18);
      puVar7 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      *puVar7 = uVar13;
      uVar8 = uVar15;
    } while (uVar12 < uVar15);
    lVar9 = *(long *)(param_1 + 0x1b8);
    uVar8 = *(long *)(param_1 + 0x1c0) - lVar9 >> 3;
  }
  if (uVar12 < uVar8 || uVar12 - uVar8 == 0) {
    if (uVar12 < uVar8) {
      *(ulong *)(param_1 + 0x1c0) = lVar9 + uVar12 * 8;
    }
  }
  else {
    FUN_00870174(param_1 + 0x1b8,uVar12 - uVar8);
  }
  *(undefined8 *)(lVar6 + 0xc) = uVar11;
  uVar13 = *(undefined8 *)(param_1 + 0x94);
  uVar14 = *(undefined8 *)(param_1 + 0x9c);
  uStack_74 = (undefined4)uVar11;
  uStack_70 = (undefined4)((ulong)uVar11 >> 0x20);
  local_78 = uVar3;
  bVar5 = FUN_00861094(param_1,0x128,&local_78);
  *(byte *)(lVar6 + 0x30) = bVar5 & 1;
  if ((bVar5 & 1) != 0) {
    *(undefined8 *)(lVar6 + 0x14) = uVar14;
  }
  if (*(char *)(param_1 + 0x68) == '\x01') {
    if ((bVar5 & 1) == 0) {
      uVar13 = 0xffffffffffffffff;
    }
    uVar11 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x14);
    FUN_00851ef4(uVar11,uVar10,uVar13);
    local_78 = (undefined4)lVar6;
    uStack_74 = (undefined4)((ulong)lVar6 >> 0x20);
    puVar7 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_78);
    *puVar7 = uVar11;
  }
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return lVar6;
}

