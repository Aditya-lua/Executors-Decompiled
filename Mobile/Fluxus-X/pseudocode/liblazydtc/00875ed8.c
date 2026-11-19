/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00875ed8
 */

void FUN_00875ed8(long param_1,long param_2,int param_3)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  undefined8 uVar4;
  uint local_30;
  int iStack_2c;
  long local_28;
  
  lVar3 = tpidr_el0;
  local_28 = *(long *)(lVar3 + 0x28);
  uVar1 = param_3 + ~(uint)param_2;
  if (uVar1 == (int)(short)uVar1) {
    *(uint *)(*(long *)(param_1 + 0x30) + param_2 * 4) =
         *(uint *)(*(long *)(param_1 + 0x30) + param_2 * 4) | uVar1 * 0x10000;
  }
  else {
    uVar2 = -uVar1;
    if (-1 < (int)uVar1) {
      uVar2 = uVar1;
    }
    if (uVar2 >> 0x17 != 0) {
      uVar4 = 0;
      goto LAB_00875f4c;
    }
    *(undefined1 *)(param_1 + 0xf0) = 1;
  }
  local_30 = (uint)param_2;
  iStack_2c = param_3;
  FUN_00875f70(param_1 + 0x90,&local_30);
  uVar4 = 1;
LAB_00875f4c:
  if (*(long *)(lVar3 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

