/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bda50
 */

undefined8 * FUN_008bda50(undefined8 param_1,undefined8 *param_2,undefined8 *param_3)

{
  uint uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  uint uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 local_58;
  undefined4 local_50;
  uint uStack_4c;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_50 = *(undefined4 *)(param_2 + 3);
  uVar1 = *(uint *)((long)param_2 + 0x1c);
  local_58 = param_2[2];
  uVar5 = uVar1 & 0xf;
  uStack_4c = uVar5;
  puVar3 = (undefined8 *)FUN_008bd784(param_1,&local_58);
  if (puVar3 == param_2) {
    if (0xf < uVar1) {
      *(uint *)((long)param_3 + 0x1c) =
           (uint)((long)param_2 + ((ulong)(uint)((int)uVar1 >> 4) * 0x20 - (long)param_3) >> 1) &
           0xfffffff0 | *(uint *)((long)param_3 + 0x1c) & 0xf;
      uVar5 = *(uint *)((long)param_2 + 0x1c) & 0xf;
    }
    *(uint *)((long)param_2 + 0x1c) =
         uVar5 | (uint)((ulong)((long)param_3 - (long)param_2) >> 1) & 0xfffffff0;
  }
  else {
    do {
      puVar4 = puVar3;
      puVar3 = puVar4 + ((long)((ulong)*(uint *)((long)puVar4 + 0x1c) << 0x20) >> 0x24) * 4;
    } while (puVar4 + ((long)((ulong)*(uint *)((long)puVar4 + 0x1c) << 0x20) >> 0x24) * 4 != param_2
            );
    *(uint *)((long)puVar4 + 0x1c) =
         (uint)((ulong)((long)param_3 - (long)puVar4) >> 1) & 0xfffffff0 |
         *(uint *)((long)puVar4 + 0x1c) & 0xf;
    uVar8 = *param_2;
    uVar7 = param_2[3];
    uVar6 = param_2[2];
    param_3[1] = param_2[1];
    *param_3 = uVar8;
    param_3[3] = uVar7;
    param_3[2] = uVar6;
    if (0xf < *(uint *)((long)param_2 + 0x1c)) {
      *(uint *)((long)param_3 + 0x1c) =
           *(int *)((long)param_3 + 0x1c) +
           ((uint)((ulong)((long)param_2 - (long)param_3) >> 1) & 0xfffffff0);
      *(uint *)((long)param_2 + 0x1c) = *(uint *)((long)param_2 + 0x1c) & 0xf;
    }
    *(undefined4 *)((long)param_2 + 0xc) = 0;
    param_3 = param_2;
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return param_3;
}

