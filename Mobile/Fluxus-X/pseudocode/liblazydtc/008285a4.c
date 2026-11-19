/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008285a4
 */

void FUN_008285a4(long *param_1,long param_2,long param_3)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  long *plVar4;
  undefined1 auStack_70 [8];
  undefined8 local_68;
  undefined8 *apuStack_60 [3];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  plVar4 = param_1 + 1;
  *plVar4 = 0;
  param_1[2] = 0;
  *param_1 = (long)plVar4;
  if (param_3 != 0) {
    param_3 = param_3 * 0x30;
    do {
                    /* try { // try from 00828610 to 00828643 has its CatchHandler @ 00828690 */
      plVar2 = (long *)FUN_00828798(param_1,plVar4,&local_68,auStack_70,param_2);
      if (*plVar2 == 0) {
        FUN_008289b8(apuStack_60,param_1,param_2);
        *apuStack_60[0] = 0;
        apuStack_60[0][1] = 0;
        apuStack_60[0][2] = local_68;
        plVar3 = (long *)*param_1;
        *plVar2 = (long)apuStack_60[0];
        if (*plVar3 != 0) {
          *param_1 = *plVar3;
        }
        FUN_00825dfc(param_1[1]);
        param_1[2] = param_1[2] + 1;
      }
      param_3 = param_3 + -0x30;
      param_2 = param_2 + 0x30;
    } while (param_3 != 0);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

