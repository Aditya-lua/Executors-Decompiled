
void FUN_00049d4c(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong unaff_x22;
  undefined8 unaff_x23;
  int unaff_w24;
  
  puVar2 = (undefined1 *)__Znwm();
  *puVar2 = 0x2d;
  puVar1 = (undefined8 *)*unaff_x19;
  if (-1 < unaff_w24) {
    puVar1 = unaff_x19;
  }
  _memmove(puVar2 + 1,puVar1);
  (puVar2 + 1)[unaff_x20] = 0;
  if (unaff_w24 < 0) {
    __ZdlPv(*unaff_x19);
  }
  unaff_x19[1] = unaff_x23;
  *unaff_x19 = puVar2;
  unaff_x19[2] = unaff_x22 | 0x8000000000000000;
  return;
}

