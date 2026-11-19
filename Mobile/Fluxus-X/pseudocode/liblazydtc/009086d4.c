/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009086d4
 */

void FUN_009086d4(long param_1,undefined8 *param_2,ulong param_3)

{
  ulong uVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined1 local_58 [16];
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  uVar2 = *(uint *)(param_1 + 0x2e0);
  lVar4 = param_1;
  if ((uVar2 == 0) && (lVar4 = 0, (param_3 & 1) == 0)) goto LAB_009087b0;
  if (param_2 == (undefined8 *)0x0) {
    local_58 = FUN_00941cb8(lVar4);
    uVar2 = *(uint *)(param_1 + 0x2e0);
    param_2 = (undefined8 *)local_58;
    if (uVar2 == 0) goto LAB_0090875c;
LAB_0090871c:
    puVar5 = param_2 + 1;
    lVar4 = FUN_00941d54(*param_2,*puVar5,*(undefined8 *)(param_1 + 0xb50),
                         *(undefined8 *)(param_1 + 0xb58));
    lVar4 = (ulong)uVar2 - lVar4;
    if (lVar4 == 0) {
      lVar4 = -1;
    }
    lVar6 = lVar4;
    if ((param_3 & 1) == 0) goto LAB_009087b0;
LAB_00908770:
    uVar1 = 300000;
    if (*(uint *)(param_1 + 0x2e4) != 0) {
      uVar1 = (ulong)*(uint *)(param_1 + 0x2e4);
    }
    lVar4 = FUN_00941d54(*param_2,*puVar5,*(undefined8 *)(param_1 + 0xb40),
                         *(undefined8 *)(param_1 + 0xb48));
    lVar4 = uVar1 - lVar4;
    if (lVar4 == 0) {
      lVar4 = -1;
    }
    if (lVar6 == 0) goto LAB_009087b0;
  }
  else {
    if (uVar2 != 0) goto LAB_0090871c;
LAB_0090875c:
    lVar6 = 0;
    lVar4 = 0;
    if ((param_3 & 1) != 0) {
      lVar6 = 0;
      puVar5 = param_2 + 1;
      goto LAB_00908770;
    }
  }
  if (lVar6 <= lVar4) {
    lVar4 = lVar6;
  }
LAB_009087b0:
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar4);
  }
  return;
}

