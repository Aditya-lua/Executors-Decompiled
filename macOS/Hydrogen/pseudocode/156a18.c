
undefined8 *
FUN_00156a18(long param_1,long param_2,undefined8 param_3,int *param_4,undefined8 param_5,
            int param_6)

{
  int *piVar1;
  ulong uVar2;
  int *piVar3;
  undefined8 *unaff_x19;
  int unaff_w20;
  ulong unaff_x21;
  
  piVar1 = (int *)(param_2 + param_1);
  piVar3 = param_4;
  if (param_6 == 0) {
    piVar3 = piVar1 + 9;
    _memcpy(piVar3,param_4);
  }
  *unaff_x19 = 0;
  unaff_x19[1] = piVar3;
  uVar2 = 0;
  if (piVar3 != (int *)0x0) {
    uVar2 = unaff_x21;
  }
  unaff_x19[2] = uVar2;
  *(undefined4 *)(unaff_x19 + 0x506) = 0xc00000c;
  piVar1[0] = 0;
  piVar1[1] = 0;
  if (unaff_w20 == 1) {
    return unaff_x19;
  }
  if ((uVar2 < 8) || (*piVar3 != -0x13cf5bc9)) {
    if (unaff_w20 != 2) {
      return unaff_x19;
    }
  }
  else {
    *piVar1 = piVar3[1];
    uVar2 = func_0x0014ed6c(unaff_x19 + 3,piVar3,uVar2);
    if (uVar2 < 0xffffffffffffff89) {
      piVar1[1] = 1;
      return unaff_x19;
    }
  }
  return (undefined8 *)0x0;
}

