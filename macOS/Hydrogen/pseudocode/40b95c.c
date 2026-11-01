
void thunk_FUN_0040b9e8(long param_1,int7 *param_2,ulong param_3)

{
  long lVar1;
  long lVar2;
  undefined8 *in_x9;
  undefined8 unaff_x23;
  ulong unaff_x24;
  ulong unaff_x26;
  long *unaff_x27;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  
  if ((unaff_x26 & 1) != 0) {
    if (param_1 == 7) {
      if (*param_2 != 0x2f34364d59532f) goto LAB_0040baa0;
    }
    else if (param_1 == 2) {
      if ((short)*param_2 != 0x2f2f) goto LAB_0040baa0;
    }
    else if ((param_1 != 1) || ((char)*param_2 != '/')) {
LAB_0040baa0:
      *in_x9 = 0;
      in_x9[1] = unaff_x23;
      in_x9[2] = param_2;
      in_x9[3] = param_1;
      in_x9[4] = 0;
      in_x9[5] = in_stack_00000008;
      return;
    }
  }
  if (CARRY8(unaff_x24,param_3)) {
    in_x9[1] = &UNK_00885849;
    in_x9[2] = 0x20;
    *in_x9 = 2;
  }
  else {
    lVar2 = unaff_x24 + param_3;
    lVar1 = lVar2 + 1;
    if (lVar2 == -1) {
      lVar1 = -1;
    }
    if ((param_3 & 1) != 0) {
      lVar2 = lVar1;
    }
    *unaff_x27 = lVar2;
    *in_x9 = 0;
    in_x9[1] = unaff_x23;
    in_x9[2] = param_2;
    in_x9[3] = param_1;
    in_x9[4] = in_stack_00000000;
    in_x9[5] = in_stack_00000008;
  }
  return;
}

