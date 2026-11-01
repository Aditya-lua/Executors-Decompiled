
long FUN_00750024(long param_1)

{
  long lVar1;
  long lVar2;
  undefined8 *unaff_x19;
  
  lVar1 = param_1;
  if (param_1 == 0) {
    lVar2 = unaff_x19[2];
    unaff_x19[2] = lVar2 + -1;
    if (lVar2 + -1 == 0) {
      func_0x0073a4d8(*unaff_x19);
                    /* WARNING: Could not recover jumptable at 0x00750090. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      lVar1 = (*pcRam0000000000a2b5f0)();
      return lVar1;
    }
  }
  else {
    if (*(long *)(param_1 + 0xe0) != 0) {
      lVar1 = func_0x00779cfc(param_1,3,2);
    }
    lVar2 = unaff_x19[2];
    unaff_x19[2] = lVar2 + -1;
    if (lVar2 + -1 == 0) {
      func_0x0073a4d8(*unaff_x19);
      lVar1 = (*pcRam0000000000a2b5f0)();
      lVar2 = *(long *)(param_1 + 0xe0);
    }
    else {
      lVar2 = *(long *)(param_1 + 0xe0);
    }
    if (lVar2 != 0) {
      lVar1 = *(long *)(param_1 + 0xe0);
      if (lVar1 == 0) {
        return 3;
      }
      if (((*(uint *)(lVar1 + 4) >> 3 & 1) != 0) && (*(code **)(lVar1 + 0x18) != (code *)0x0)) {
        (**(code **)(lVar1 + 0x18))(param_1,3,*(undefined8 *)(lVar1 + 0x20));
      }
      return 0;
    }
  }
  return lVar1;
}

