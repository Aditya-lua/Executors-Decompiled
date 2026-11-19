/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090fc08
 */

void FUN_0090fc08(long param_1,long param_2,long param_3)

{
  long lVar1;
  size_t sVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *puVar5;
  char acStack_b8 [128];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (*(long *)(param_1 + 0xd0) != 0) {
    FUN_0093f628(param_1,5,2);
  }
  if (param_3 == 0) {
    uVar3 = 0;
  }
  else {
    if ((*(ulong *)(param_2 + 0x3a0) & 9) == 1) {
      lVar4 = (long)*(int *)(param_2 + 0x15c);
      puVar5 = (undefined8 *)(param_2 + 0xd8);
    }
    else {
      lVar4 = (long)*(int *)(param_2 + 0x560);
      if (((uint)*(ulong *)(param_2 + 0x3a0) >> 9 & 1) == 0) {
        puVar5 = (undefined8 *)(param_2 + 0x50);
      }
      else {
        puVar5 = (undefined8 *)(param_2 + 0x80);
      }
    }
    curl_msnprintf(acStack_b8,0x80,"%u/%ld/%s",*(undefined4 *)(param_2 + 0x568),lVar4,*puVar5);
    FUN_00941848(acStack_b8,acStack_b8,0x80);
    sVar2 = strlen(acStack_b8);
    uVar3 = FUN_009167a8(param_3,acStack_b8,sVar2);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

