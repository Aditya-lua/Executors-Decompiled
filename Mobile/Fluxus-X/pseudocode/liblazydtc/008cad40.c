/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cad40
 */

void FUN_008cad40(undefined8 param_1,undefined8 *param_2)

{
  long lVar1;
  bool bVar2;
  long lVar3;
  undefined8 uVar4;
  undefined1 auStack_68 [48];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  bVar2 = *(int *)((long)param_2 + 0xc) == 3;
  if (bVar2) {
    lVar3 = FUN_008b8cac(*param_2,auStack_68);
    uVar4 = FUN_008b9ff8(param_1,auStack_68,lVar3 - (long)auStack_68);
    *param_2 = uVar4;
    *(undefined4 *)((long)param_2 + 0xc) = 5;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(bVar2);
  }
  return;
}

