
undefined8 FUN_005aa9a4(void)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  
  uVar1 = func_0x005ab01c();
  if ((uVar1 & 1) == 0) {
    uVar2 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                      (*(undefined8 *)*unaff_x19,&UNK_008aec79,1);
  }
  else {
    uVar2 = 1;
  }
  return uVar2;
}

