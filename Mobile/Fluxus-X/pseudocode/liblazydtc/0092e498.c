/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092e498
 */

void FUN_0092e498(long param_1,int param_2)

{
  long lVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  int local_4c;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (((param_1 != 0) && (lVar5 = *(long *)(param_1 + 0xc0), lVar5 != 0)) &&
     (local_4c = param_2, param_2 != -1)) {
    lVar1 = lVar5 + 0xf8;
    lVar4 = FUN_009167a8(lVar1,&local_4c,4);
    if (lVar4 != 0) {
      if (*(code **)(lVar5 + 0x80) == (code *)0x0) {
        local_4c = param_2;
        FUN_00916838(lVar4);
        FUN_009166fc(lVar1,&local_4c,4);
      }
      else {
        *(byte *)(lVar5 + 0x231) = *(byte *)(lVar5 + 0x231) | 4;
        iVar3 = (**(code **)(lVar5 + 0x80))
                          (param_1,param_2,4,*(undefined8 *)(lVar5 + 0x88),
                           *(undefined8 *)(lVar4 + 0x38));
        *(byte *)(lVar5 + 0x231) = *(byte *)(lVar5 + 0x231) & 0xfb;
        local_4c = param_2;
        FUN_00916838(lVar4);
        FUN_009166fc(lVar1,&local_4c,4);
        if (iVar3 == -1) {
          *(byte *)(lVar5 + 0x231) = *(byte *)(lVar5 + 0x231) | 0x10;
        }
      }
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

