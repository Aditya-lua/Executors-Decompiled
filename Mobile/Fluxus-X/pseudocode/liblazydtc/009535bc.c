/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009535bc
 */

int FUN_009535bc(long param_1,char *param_2)

{
  ulong uVar1;
  byte bVar2;
  long lVar3;
  int iVar4;
  long lVar5;
  undefined1 local_48 [16];
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  *param_2 = '\0';
  if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
     ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
    FUN_00904c98(param_1,"Preparing for accepting server on data port");
  }
  FUN_00931d94(param_1,10);
  uVar1 = 60000;
  if (*(uint *)(param_1 + 0x714) != 0) {
    uVar1 = (ulong)*(uint *)(param_1 + 0x714);
  }
  local_48 = FUN_00941cb8();
  lVar5 = FUN_009086d4(param_1,local_48,0);
  if ((lVar5 == 0) || ((long)uVar1 <= lVar5)) {
    lVar5 = FUN_00941d54(local_48._0_8_,local_48._8_8_,*(undefined8 *)(param_1 + 0xb60),
                         *(undefined8 *)(param_1 + 0xb68));
    lVar5 = uVar1 - lVar5;
    if (lVar5 != 0) goto LAB_00953670;
LAB_009536b8:
    FUN_00904b80(param_1,"Accept timeout occurred while waiting server connect");
    iVar4 = 0xc;
  }
  else {
LAB_00953670:
    if (lVar5 < 0) goto LAB_009536b8;
    iVar4 = FUN_00953954(param_1,param_2);
    if (iVar4 == 0) {
      if (*param_2 == '\0') {
        iVar4 = 60000;
        if (*(int *)(param_1 + 0x714) != 0) {
          iVar4 = *(int *)(param_1 + 0x714);
        }
        FUN_0092aff8(param_1,iVar4,0xd);
        iVar4 = 0;
        bVar2 = *(byte *)(param_1 + 0xa85);
        goto joined_r0x009536d0;
      }
      iVar4 = FUN_00953c88(param_1);
      if (iVar4 == 0) {
        iVar4 = FUN_00953780(param_1);
        bVar2 = *(byte *)(param_1 + 0xa85);
        goto joined_r0x009536d0;
      }
    }
  }
  bVar2 = *(byte *)(param_1 + 0xa85);
joined_r0x009536d0:
  if (((bVar2 >> 4 & 1) != 0) &&
     (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
      (0 < DAT_00cc46c0)))) {
    FUN_00905258(param_1,"AllowServerConnect() -> %d",iVar4);
  }
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

