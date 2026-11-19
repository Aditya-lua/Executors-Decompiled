/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095bbec
 */

void FUN_0095bbec(long param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  byte bVar4;
  long lVar5;
  byte local_3c [4];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar5 = *(long *)(param_1 + 0x20);
  local_3c[0] = 0;
  uVar2 = FUN_00907858(lVar5,0);
  if ((((uVar2 & 1) != 0) || (uVar3 = FUN_0096a268(param_1,lVar5,0), (int)uVar3 == 0)) &&
     (uVar3 = FUN_00907508(param_1,0,0,local_3c), (int)uVar3 == 0)) {
    bVar4 = *(byte *)(lVar5 + 0x4f8) & 0xfe | local_3c[0];
    *(byte *)(lVar5 + 0x4f8) = bVar4;
    if (*(int *)(lVar5 + 0x4e8) != 5) {
      *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4e8) = 5;
      bVar4 = *(byte *)(lVar5 + 0x4f8);
    }
    uVar3 = 0;
    if ((bVar4 & 1) != 0) {
      *(undefined ***)(lVar5 + 0x3a8) = &PTR_s_smtps_00c50f18;
      *(ulong *)(lVar5 + 0x3a0) = *(ulong *)(lVar5 + 0x3a0) | 0x8000000;
      lVar5 = *(long *)(param_1 + 0x20);
      *(undefined2 *)(lVar5 + 0x4e0) = 0;
      *(undefined2 *)(lVar5 + 0x4e4) = 0;
      *(byte *)(lVar5 + 0x4f8) = *(byte *)(lVar5 + 0x4f8) & 0xed;
      uVar3 = FUN_009453ec(param_1,lVar5 + 0x428,"EHLO %s",*(undefined8 *)(lVar5 + 0x4f0));
      if ((int)uVar3 == 0) {
        *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4e8) = 2;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

