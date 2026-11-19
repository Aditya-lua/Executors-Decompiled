/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941b6c
 */

void FUN_00941b6c(byte *param_1,undefined8 *param_2,int param_3,long *param_4)

{
  byte bVar1;
  long lVar2;
  int *piVar3;
  undefined8 uVar4;
  long lVar5;
  byte *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_50 = (byte *)0x0;
  piVar3 = (int *)__errno();
  *piVar3 = 0;
  *param_4 = 0;
  while( true ) {
    bVar1 = *param_1;
    if ((bVar1 != 9) && (bVar1 != 0x20)) break;
    param_1 = param_1 + 1;
  }
  if ((bVar1 == 0x2d) || (bVar1 - 10 < 4)) {
    if (param_2 != (undefined8 *)0x0) {
      *param_2 = param_1;
    }
  }
  else {
    lVar5 = strtol((char *)param_1,(char **)&local_50,param_3);
    if (param_2 != (undefined8 *)0x0) {
      *param_2 = local_50;
    }
    if (*piVar3 == 0x22) {
      uVar4 = 1;
      goto LAB_00941bf0;
    }
    if (local_50 != param_1) {
      uVar4 = 0;
      *param_4 = lVar5;
      goto LAB_00941bf0;
    }
  }
  uVar4 = 2;
LAB_00941bf0:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

