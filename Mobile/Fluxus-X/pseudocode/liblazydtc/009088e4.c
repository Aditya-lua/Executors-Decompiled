/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009088e4
 */

long FUN_009088e4(long param_1,undefined8 *param_2)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long *plVar6;
  ulong uVar7;
  undefined1 auVar8 [16];
  undefined1 local_68 [16];
  long local_58;
  
  lVar2 = tpidr_el0;
  lVar4 = 0;
  local_58 = *(long *)(lVar2 + 0x28);
  if (*(int *)(param_1 + 0x278) != 0) {
    plVar6 = (long *)(param_1 + 600);
    uVar7 = 1;
    lVar5 = lVar4;
    auVar8 = local_68;
    do {
      lVar3 = *plVar6;
      lVar4 = lVar5;
      local_68 = auVar8;
      if (lVar3 != 0) {
        if (param_2 == (undefined8 *)0x0) {
          auVar8 = FUN_00941cb8();
          local_68 = auVar8;
          lVar3 = *plVar6;
          param_2 = (undefined8 *)local_68;
          if (lVar3 == 0) goto LAB_00908970;
        }
        uVar1 = *(uint *)(param_1 + 0x278);
        local_68 = auVar8;
        if (uVar1 != 0) {
          lVar4 = FUN_00941d54(*param_2,param_2[1],lVar3,plVar6[1]);
          lVar4 = (ulong)uVar1 - lVar4;
          if (lVar4 == 0) {
            lVar4 = -1;
          }
          if (lVar5 <= lVar4 && lVar5 != 0) {
            lVar4 = lVar5;
          }
        }
      }
LAB_00908970:
      if (1 < uVar7) break;
      plVar6 = plVar6 + 2;
      uVar7 = uVar7 + 1;
      lVar5 = lVar4;
      auVar8 = local_68;
    } while (*(int *)(param_1 + 0x278) != 0);
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return lVar4;
}

