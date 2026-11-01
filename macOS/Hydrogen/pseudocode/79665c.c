
undefined8
FUN_0079665c(long param_1,long param_2,undefined4 param_3,long param_4,long param_5,long param_6,
            long *param_7,long param_8)

{
  long *plVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *in_stack_00000060;
  
  if ((param_1 == 0) || (param_2 == 0)) {
    (*pcRam0000000000a2b5f0)(param_1);
    return 0x2b;
  }
  *in_stack_00000060 = 0;
  plVar1 = (long *)(*pcRam0000000000a2b608)(1,0x60);
  if (plVar1 == (long *)0x0) {
    (*pcRam0000000000a2b5f0)(param_1);
LAB_007967a8:
    (*pcRam0000000000a2b5f0)(param_7);
    uVar3 = 0x1b;
  }
  else {
    *(undefined4 *)(plVar1 + 3) = param_3;
    plVar1[1] = param_2;
    plVar1[2] = param_5;
    *plVar1 = param_1;
    plVar1[5] = param_6;
    plVar1[6] = (long)param_7;
    plVar1[7] = param_8;
    if (param_4 != 0) {
      lVar2 = (*pcRam0000000000a2b600)(param_4);
      plVar1[4] = lVar2;
      if (lVar2 == 0) {
        if (*plVar1 != 0) {
          (*pcRam0000000000a2b5f0)();
          *plVar1 = 0;
        }
        plVar1[1] = 0;
        if (plVar1[6] != 0) {
          (*pcRam0000000000a2b5f0)();
          plVar1[6] = 0;
        }
        plVar1[7] = 0;
        *(undefined4 *)(plVar1 + 3) = 0;
        plVar1[2] = 0;
        (*pcRam0000000000a2b5f0)(plVar1[4]);
        plVar1[4] = 0;
        param_7 = plVar1;
        goto LAB_007967a8;
      }
    }
    uVar3 = 0;
    *in_stack_00000060 = plVar1;
  }
  return uVar3;
}

