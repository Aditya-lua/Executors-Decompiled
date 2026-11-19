/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f060
 */

void curl_multi_assign(long param_1,int param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  int local_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_2c = param_2;
  if ((param_2 == -1) || (lVar2 = FUN_009167a8(param_1 + 0xf8,&local_2c,4), lVar2 == 0)) {
    uVar3 = 5;
  }
  else {
    uVar3 = 0;
    *(undefined8 *)(lVar2 + 0x38) = param_3;
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

