
void FUN_004f2030(void)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *unaff_x23;
  
  lVar1 = func_0x004f1368();
  uVar2 = 0x8000000000000009;
  if (lVar1 == 0) {
    uVar2 = 0x8000000000000002;
  }
  else {
    unaff_x23[1] = lVar1;
  }
  *unaff_x23 = uVar2;
  return;
}

