/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009448d8
 */

void FUN_009448d8(long param_1,long param_2)

{
  undefined1 *puVar1;
  long lVar2;
  byte bVar3;
  ulong uVar4;
  undefined8 uVar5;
  int iVar6;
  int local_3c;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  local_3c = 0;
  uVar4 = FUN_00945a8c(param_2 + 0x4e0,param_1);
  if ((uVar4 & 1) != 0) {
    if (((*(byte *)(param_2 + 0x508) & *(byte *)(param_2 + 0x509)) >> 2 & 1) != 0) {
      uVar5 = FUN_00945ab0(param_2 + 0x4e0,param_1,0,&local_3c);
      iVar6 = local_3c;
      if (((int)uVar5 == 0) && (local_3c == 1)) {
        uVar5 = 0;
        *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4c8) = 5;
        iVar6 = 1;
      }
      if (iVar6 != 0 || (int)uVar5 != 0) goto LAB_00944a28;
    }
    bVar3 = *(byte *)(param_2 + 0x509) & *(byte *)(param_2 + 0x508);
    if ((bVar3 >> 1 & 1) != 0) {
      uVar5 = FUN_00944a50(param_1,param_2);
      goto LAB_00944a28;
    }
    if ((bVar3 & 1) == 0) {
      if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"No known authentication mechanisms supported");
      }
      uVar5 = 0x43;
      goto LAB_00944a28;
    }
    if (*(long *)(param_1 + 0x12f0) != 0) {
      puVar1 = &DAT_002ab32c;
      if (*(undefined1 **)(param_2 + 0x1c8) != (undefined1 *)0x0) {
        puVar1 = *(undefined1 **)(param_2 + 0x1c8);
      }
      uVar5 = FUN_009453ec(param_1,param_2 + 0x428,"USER %s",puVar1);
      if ((int)uVar5 == 0) {
        *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4c8) = 7;
      }
      goto LAB_00944a28;
    }
  }
  uVar5 = 0;
  *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4c8) = 0;
LAB_00944a28:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

