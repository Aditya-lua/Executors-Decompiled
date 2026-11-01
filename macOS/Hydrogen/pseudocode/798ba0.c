
void FUN_00798ba0(ulong param_1)

{
  ulong uVar1;
  long *plVar2;
  long *unaff_x20;
  uint unaff_w21;
  
  if ((int)param_1 < 0) {
    param_1 = unaff_x20[1];
    uVar1 = param_1 + unaff_w21;
    if (uVar1 <= param_1) {
      unaff_x20[1] = uVar1;
      *(undefined1 *)(*unaff_x20 + uVar1) = 0;
      goto LAB_00798be0;
    }
  }
  else {
    param_1 = param_1 & 0xff;
  }
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc();
LAB_00798be0:
  plVar2 = (long *)*unaff_x20;
  if (-1 < *(char *)((long)unaff_x20 + 0x17)) {
    plVar2 = unaff_x20;
  }
  _vsnprintf((long)plVar2 + param_1,unaff_w21 + 1);
  return;
}

