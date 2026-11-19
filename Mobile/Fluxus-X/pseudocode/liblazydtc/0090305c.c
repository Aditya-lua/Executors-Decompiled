/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090305c
 */

void curl_easy_send(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_50 = 0;
  uVar2 = FUN_0092f1bc();
  if ((uVar2 & 1) == 0) {
    uVar3 = FUN_00902f04(param_1,param_2,param_3,&local_50);
    *param_4 = local_50;
  }
  else {
    uVar3 = 0x5d;
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

