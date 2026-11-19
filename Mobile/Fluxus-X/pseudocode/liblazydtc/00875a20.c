/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00875a20
 */

uint FUN_00875a20(long param_1,undefined4 *param_2)

{
  undefined4 uVar1;
  undefined2 uVar2;
  long lVar3;
  undefined4 *puVar4;
  uint uVar5;
  undefined8 uVar6;
  undefined8 local_60;
  ulong uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 local_40;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  uVar5 = (int)((ulong)(*(long *)(param_1 + 0x68) - *(long *)(param_1 + 0x60)) >> 3) * -0x33333333;
  if (uVar5 >> 0x17 == 0) {
    puVar4 = *(undefined4 **)(param_1 + 200);
    local_40 = 0;
    uStack_48 = 0;
    uStack_50 = 0;
    local_60 = 9;
    uStack_58 = (ulong)(uint)((int)((ulong)((long)puVar4 - *(long *)(param_1 + 0xc0)) >> 3) *
                             -0x49249249);
    if (puVar4 < *(undefined4 **)(param_1 + 0xd0)) {
      uVar2 = *(undefined2 *)(param_2 + 1);
      uVar1 = *param_2;
      *(undefined8 *)(puVar4 + 4) = 0;
      *(undefined8 *)(puVar4 + 6) = 0;
      *(undefined8 *)(puVar4 + 2) = 0;
      *(undefined2 *)(puVar4 + 1) = uVar2;
      *puVar4 = uVar1;
      uVar6 = *(undefined8 *)(param_2 + 2);
      *(undefined8 *)(puVar4 + 4) = *(undefined8 *)(param_2 + 4);
      *(undefined8 *)(puVar4 + 2) = uVar6;
      *(undefined8 *)(puVar4 + 6) = *(undefined8 *)(param_2 + 6);
      *(undefined8 *)(param_2 + 2) = 0;
      *(undefined8 *)(param_2 + 4) = 0;
      *(undefined8 *)(param_2 + 6) = 0;
      *(undefined8 *)(puVar4 + 8) = 0;
      *(undefined8 *)(puVar4 + 10) = 0;
      *(undefined8 *)(puVar4 + 0xc) = 0;
      uVar6 = *(undefined8 *)(param_2 + 8);
      *(undefined8 *)(puVar4 + 10) = *(undefined8 *)(param_2 + 10);
      *(undefined8 *)(puVar4 + 8) = uVar6;
      *(undefined8 *)(puVar4 + 0xc) = *(undefined8 *)(param_2 + 0xc);
      puVar4 = puVar4 + 0xe;
      *(undefined8 *)(param_2 + 8) = 0;
      *(undefined8 *)(param_2 + 10) = 0;
      *(undefined8 *)(param_2 + 0xc) = 0;
    }
    else {
      puVar4 = (undefined4 *)FUN_00879e34((long *)(param_1 + 0xc0));
    }
    *(undefined4 **)(param_1 + 200) = puVar4;
    FUN_00874c40((long *)(param_1 + 0x60),&local_60);
  }
  else {
    uVar5 = 0xffffffff;
  }
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar5;
}

