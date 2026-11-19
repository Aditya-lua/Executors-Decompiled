/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00946378
 */

void FUN_00946378(long *param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  undefined8 uVar2;
  char *pcVar3;
  code *pcVar4;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  uVar2 = (**(code **)(*param_1 + 0x20))(param_2,param_3);
  if (((int)uVar2 == 0) && ((*(byte *)(*param_1 + 0x3a) & 1) != 0)) {
    pcVar3 = (char *)FUN_009252a8(param_3);
    if ((*pcVar3 == '=') || (*pcVar3 == '\0')) {
      uStack_40 = 0;
      local_48 = 0;
      pcVar4 = (code *)0x0;
    }
    else {
      uVar2 = FUN_0091e5b8(pcVar3,&uStack_40,&local_48);
      if ((int)uVar2 != 0) goto LAB_00946408;
      pcVar4 = curl_free;
    }
    FUN_0092525c(param_3,uStack_40,local_48,pcVar4);
    uVar2 = 0;
  }
LAB_00946408:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

