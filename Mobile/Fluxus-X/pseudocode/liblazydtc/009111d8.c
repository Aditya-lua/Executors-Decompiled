/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009111d8
 */

void FUN_009111d8(undefined8 param_1,long param_2,byte *param_3)

{
  long lVar1;
  byte bVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  code *pcVar7;
  byte local_50 [4];
  char local_4c [4];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  uVar6 = *(ulong *)(param_2 + 0x3a0);
  if (-1 < (int)uVar6) {
    if (*(long *)(param_2 + 0x30) != 0) {
      FUN_00917b54(param_1);
      *(undefined8 *)(param_2 + 0x30) = 0;
    }
    FUN_00924ee4(param_2);
    if ((*(long *)(param_2 + 0x3a8) != 0) &&
       (pcVar7 = *(code **)(*(long *)(param_2 + 0x3a8) + 0x60), pcVar7 != (code *)0x0)) {
      (*pcVar7)(param_1,param_2,*(ulong *)(param_2 + 0x3a0) >> 0x1e & 1);
    }
    FUN_0090ea54(param_1);
    uVar6 = *(ulong *)(param_2 + 0x3a0) | 0x80000000;
    *(ulong *)(param_2 + 0x3a0) = uVar6;
  }
  if ((uVar6 >> 0x20 & 1) != 0) {
    *param_3 = 1;
    goto LAB_00911334;
  }
  if ((*(char *)(param_2 + 0x575) == '\0') && (uVar6 = FUN_009077cc(param_2,0), (uVar6 & 1) != 0)) {
    iVar4 = FUN_00907008(param_1,0,local_4c);
    iVar5 = iVar4;
    if (*(char *)(param_2 + 0x575) != '\0') goto LAB_00911310;
LAB_009112c0:
    iVar4 = iVar5;
    uVar6 = FUN_009077cc(param_2,1);
    if ((uVar6 & 1) == 0) goto LAB_00911310;
    iVar5 = FUN_00907008(param_1,1,local_50);
    bVar3 = iVar5 != 0;
    if (iVar4 == 0) goto LAB_009112ec;
LAB_00911320:
    *param_3 = 1;
  }
  else {
    iVar4 = 0;
    local_4c[0] = '\x01';
    iVar5 = 0;
    if (*(char *)(param_2 + 0x575) == '\0') goto LAB_009112c0;
LAB_00911310:
    bVar3 = false;
    local_50[0] = 1;
    if (iVar4 != 0) goto LAB_00911320;
LAB_009112ec:
    if (bVar3) goto LAB_00911320;
    bVar2 = local_4c[0] != '\0' & local_50[0];
    *param_3 = bVar2;
    if (bVar2 == 0) goto LAB_00911334;
  }
  *(ulong *)(param_2 + 0x3a0) = *(ulong *)(param_2 + 0x3a0) | 0x100000000;
LAB_00911334:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

