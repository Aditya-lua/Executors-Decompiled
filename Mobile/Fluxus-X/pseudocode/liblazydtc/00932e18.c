/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932e18
 */

void FUN_00932e18(long param_1,undefined8 param_2,undefined8 param_3,int *param_4)

{
  long lVar1;
  int iVar2;
  long lVar3;
  char local_44;
  undefined8 local_40;
  
  lVar1 = tpidr_el0;
  lVar3 = *(long *)(lVar1 + 0x28);
  iVar2 = FUN_00935b84();
  *param_4 = iVar2;
  if (iVar2 == 0) {
    if (local_44 != '\0') {
      *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) | 0x20;
    }
  }
  else {
    local_40 = 0xffffffffffffffff;
  }
  if (*(long *)(lVar1 + 0x28) != lVar3) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_40);
  }
  return;
}

