
ulong __ZN15core_foundation7runloop14CFRunLoopTimer3new17hfcf9e46a78fbbaa6E
                (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  ulong uVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  uVar1 = _CFRunLoopTimerCreate
                    (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,param_1,param_2,param_3,
                     param_4);
  if (uVar1 == 0) {
    auVar3 = func_0x007a11c0(&UNK_0081ce61,0x22,&UNK_009c2298);
    lVar2 = _CFFileDescriptorCreateRunLoopSource
                      (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,*auVar3._0_8_,auVar3._8_8_);
    return (ulong)(lVar2 != 0);
  }
  return uVar1;
}

