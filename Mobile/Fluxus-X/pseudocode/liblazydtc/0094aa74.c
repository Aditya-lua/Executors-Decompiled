/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094aa74
 */

void FUN_0094aa74(long param_1,long param_2)

{
  byte bVar1;
  long lVar2;
  char cVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  char *pcVar7;
  undefined1 auVar8 [16];
  char local_4c [4];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  uVar4 = 0;
  if (*(long *)(param_1 + 1000) != 0) goto LAB_0094ac44;
  auVar8 = FUN_00941cb8(0);
  lVar5 = FUN_00941d54(auVar8._0_8_,auVar8._8_8_,*(undefined8 *)(param_1 + 0x210),
                       *(undefined8 *)(param_1 + 0x218));
  if (*(long *)(param_2 + 0x2f8) < lVar5 / 1000) {
    if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0) ||
       ((*(long *)(param_2 + 0x12a0) != 0 && (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1))))
    goto LAB_0094ac00;
    pcVar7 = "Too old connection (%ld seconds idle), disconnect it";
LAB_0094ab68:
    FUN_00904c98(param_2,pcVar7);
    bVar1 = *(byte *)(param_2 + 0xa85);
  }
  else {
    lVar5 = FUN_00941d54(auVar8._0_8_,auVar8._8_8_,*(undefined8 *)(param_1 + 0x200),
                         *(undefined8 *)(param_1 + 0x208));
    if ((*(long *)(param_2 + 0x300) == 0) || (lVar5 / 1000 <= *(long *)(param_2 + 0x300))) {
      if (*(long *)(*(long *)(param_1 + 0x3a8) + 0x78) == 0) {
        local_4c[0] = '\0';
        FUN_0092bb60(param_2,param_1);
        uVar6 = FUN_00908258(param_2,param_1,local_4c);
        cVar3 = local_4c[0];
        FUN_0092bab8(param_2);
        if ((cVar3 == '\0') && (uVar4 = 0, (uVar6 & 1) != 0)) goto LAB_0094ac44;
      }
      else {
        FUN_0092bb60(param_2,param_1);
        uVar6 = (**(code **)(*(long *)(param_1 + 0x3a8) + 0x78))(param_2,param_1,1);
        FUN_0092bab8(param_2);
        uVar4 = 0;
        if ((uVar6 & 1) == 0) goto LAB_0094ac44;
      }
    }
    else if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
            ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8)))))
    {
      pcVar7 = "Too old connection (%ld seconds since creation), disconnect it";
      goto LAB_0094ab68;
    }
LAB_0094ac00:
    bVar1 = *(byte *)(param_2 + 0xa85);
  }
  if (((bVar1 >> 4 & 1) != 0) &&
     ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
    FUN_00904c98(param_2,"Connection %ld seems to be dead",*(undefined8 *)(param_1 + 0x28));
  }
  FUN_0090fe90(param_2,param_1,0);
  uVar4 = 1;
LAB_0094ac44:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

