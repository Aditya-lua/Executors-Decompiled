
int FUN_006e2ae0(double *param_1)

{
  bool in_CY;
  int iVar1;
  long lVar2;
  undefined4 uVar3;
  undefined4 *unaff_x19;
  
  if (in_CY) {
    lVar2 = __dyld_get_image_header(0);
    param_1 = (double *)(lVar2 + 0x4e8dd08);
    iVar1 = *(int *)(lVar2 + 0x4e8dd14);
  }
  else {
    iVar1 = *(int *)((long)param_1 + 0xc);
  }
  if ((iVar1 == 3) || (param_1 = (double *)func_0x00702288(), param_1 != (double *)0x0)) {
    iVar1 = (int)*param_1;
    if (unaff_x19 == (undefined4 *)0x0) {
      return iVar1;
    }
    uVar3 = 1;
  }
  else {
    uVar3 = 0;
    iVar1 = 0;
    if (unaff_x19 == (undefined4 *)0x0) {
      return 0;
    }
  }
  *unaff_x19 = uVar3;
  return iVar1;
}

