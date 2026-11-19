/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085a238
 */

undefined8 FUN_0085a238(long param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  byte bVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long lVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  int local_a0;
  undefined4 uStack_9c;
  undefined4 uStack_98;
  undefined4 uStack_94;
  int local_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  uStack_68 = *(undefined8 *)(param_1 + 0x9c);
  local_70 = *(undefined8 *)(param_1 + 0x94);
  FUN_00858f2c();
  if ((char)DAT_00d1ed00 == '\x01') {
    if (*(int *)(param_1 + 0x90) == 0x12e) {
LAB_0085a28c:
      uVar6 = FUN_008610f8(param_1,&local_70);
      goto LAB_0085a428;
    }
    if (((*(int *)(param_1 + 0x90) == 0x119) && (*(char **)(param_1 + 0xa8) != (char *)0x0)) &&
       (iVar5 = strcmp(*(char **)(param_1 + 0xa8),"const"), iVar5 == 0)) {
      FUN_00853d20(&local_90,param_1 + 0x70);
      if (local_90 == 0x119) goto LAB_0085a28c;
    }
  }
  uVar7 = FUN_0086060c(param_1,0);
  uStack_78 = *(undefined8 *)(param_1 + 0xa8);
  uStack_80 = *(undefined8 *)(param_1 + 0xa0);
  iVar5 = *(int *)(param_1 + 0x90);
  uStack_88 = (undefined4)*(undefined8 *)(param_1 + 0x98);
  uStack_84 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x98) >> 0x20);
  local_90 = (int)*(undefined8 *)(param_1 + 0x90);
  uStack_8c = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x90) >> 0x20);
  if (iVar5 == 0x125) {
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e3b4(param_1,0x125,"while loop");
  }
  *(int *)(*(long *)(param_1 + 0x160) + -4) = *(int *)(*(long *)(param_1 + 0x160) + -4) + 1;
  lVar1 = *(long *)(param_1 + 0x1b8);
  lVar2 = *(long *)(param_1 + 0x1c0);
  lVar8 = FUN_00859498(param_1);
  lVar11 = *(long *)(param_1 + 0x1b8);
  uVar12 = (ulong)(lVar2 - lVar1) >> 3 & 0xffffffff;
  uVar10 = *(long *)(param_1 + 0x1c0) - lVar11 >> 3;
  if (uVar12 < uVar10) {
    do {
      uVar13 = uVar10 - 1;
      uVar6 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar10 * 8 + -8) + 0x18);
      puVar9 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
      *puVar9 = uVar6;
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
  *(int *)(*(long *)(param_1 + 0x160) + -4) = *(int *)(*(long *)(param_1 + 0x160) + -4) + -1;
  uVar6 = *(undefined8 *)(param_1 + 0x9c);
  local_a0 = local_90;
  uStack_9c = uStack_8c;
  uStack_98 = uStack_88;
  bVar4 = FUN_00861094(param_1,0x128,&local_a0);
  *(byte *)(lVar8 + 0x30) = bVar4 & 1;
  local_a0 = (int)local_70;
  uStack_9c = (undefined4)((ulong)local_70 >> 0x20);
  uStack_98 = (undefined4)uVar6;
  uStack_94 = (undefined4)((ulong)uVar6 >> 0x20);
  uVar6 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x80);
  FUN_0084fa68(uVar6,&local_a0,uVar7,lVar8,iVar5 == 0x125,(ulong)&local_90 | 4);
LAB_0085a428:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar6;
}

