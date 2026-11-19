/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092be20
 */

void curl_multi_waitfds(int *param_1,long param_2,undefined8 param_3,undefined4 *param_4)

{
  long lVar1;
  int iVar2;
  undefined4 uVar3;
  long lVar4;
  undefined1 auStack_68 [8];
  undefined4 local_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (param_2 == 0) {
    uVar3 = 10;
  }
  else if ((param_1 == (int *)0x0) || (*param_1 != 0xbab1e)) {
    uVar3 = 1;
  }
  else if ((*(byte *)((long)param_1 + 0x231) >> 2 & 1) == 0) {
    FUN_00934d0c(auStack_68);
    uStack_40 = 0;
    local_48 = 0;
    uStack_50 = 0;
    local_58 = 0;
    for (lVar4 = *(long *)(param_1 + 2); lVar4 != 0; lVar4 = *(long *)(lVar4 + 0x10)) {
      FUN_0092bcf8(lVar4,&local_58);
      iVar2 = FUN_00934d18(auStack_68,&local_58);
      if (iVar2 != 0) {
        uVar3 = 3;
        goto joined_r0x0092bee8;
      }
    }
    iVar2 = FUN_00910e78(param_1 + 0x56,auStack_68);
    uVar3 = 0;
    if (iVar2 != 0) {
      uVar3 = 3;
    }
joined_r0x0092bee8:
    if (param_4 != (undefined4 *)0x0) {
      *param_4 = local_60;
    }
  }
  else {
    uVar3 = 8;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

