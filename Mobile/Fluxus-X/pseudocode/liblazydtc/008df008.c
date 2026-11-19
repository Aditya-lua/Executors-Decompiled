/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008df008
 */

void FUN_008df008(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  long local_58;
  
  lVar1 = tpidr_el0;
  lVar5 = 0;
  local_58 = *(long *)(lVar1 + 0x28);
  uVar4 = 0;
  uStack_68 = param_1[1];
  local_70 = *param_1;
  local_80 = param_2;
  uStack_78 = param_3;
  do {
    uVar2 = FUN_008dd8dc(&local_80,uVar4 & 0xffffffff);
    if ((uVar2 & 1) != 0) {
      FUN_008dd950(&local_70,param_1[uVar4 * 2 + 0xb],(param_1 + uVar4 * 2 + 0xb)[1]);
      if (uVar4 != 0) {
        uVar2 = 0;
        lVar6 = lVar5;
        do {
          uVar3 = FUN_008dd8dc(&local_80,uVar2 & 0xffffffff);
          if ((uVar3 & 1) != 0) {
            FUN_008dd950(&local_70,*(undefined8 *)(param_1[0x10b] + lVar6),
                         ((undefined8 *)(param_1[0x10b] + lVar6))[1]);
          }
          uVar2 = uVar2 + 1;
          lVar6 = lVar6 + 0x10;
        } while (uVar4 != uVar2);
      }
    }
    uVar4 = uVar4 + 1;
    lVar5 = lVar5 + 0x800;
  } while (uVar4 != 0x80);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_70,uStack_68);
  }
  return;
}

