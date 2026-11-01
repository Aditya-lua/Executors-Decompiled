
uint FUN_00792f78(undefined8 param_1,undefined8 param_2)

{
  long *plVar1;
  uint uVar2;
  int in_w9;
  undefined8 unaff_x20;
  long *unaff_x21;
  int unaff_w23;
  undefined8 uStack0000000000000008;
  
  if (((0 < in_w9) && (plVar1 = (long *)*unaff_x21, plVar1 != (long *)0x0)) &&
     (0 < *(int *)(*plVar1 + 0xc))) {
    uStack0000000000000008 = param_1;
    func_0x0073cbdc(param_2,plVar1,"cf->next send(len=%zu) -> %zd, %d");
  }
  uVar2 = 0x23;
  if (unaff_w23 != 0x51) {
    uVar2 = 0x16;
  }
  return (uint)((long)unaff_x20 >> 0x3f) & uVar2;
}

