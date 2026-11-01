
undefined4
__ZN15core_foundation7runloop9CFRunLoop11run_in_mode17h504e50e243168116E
          (undefined8 param_1,ulong param_2,uint param_3,undefined8 param_4)

{
  ulong uVar1;
  undefined4 uVar2;
  
  uVar1 = _CFRunLoopRunInMode((double)param_3 / 1000000000.0 + (double)param_2,param_1,param_4);
  uVar2 = (undefined4)(0x403020101 >> ((uVar1 & 7) << 3));
  if (4 < (uint)uVar1) {
    uVar2 = 1;
  }
  return uVar2;
}

