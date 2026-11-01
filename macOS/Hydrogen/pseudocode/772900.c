
undefined8 FUN_00772900(void)

{
  undefined8 uVar1;
  long unaff_x19;
  long unaff_x21;
  long in_stack_00000018;
  
  uVar1 = _strtol();
  if (unaff_x21 == in_stack_00000018) {
    func_0x0073c9e4();
    return 0x55;
  }
  *(undefined8 *)(*(long *)(unaff_x19 + 0x1b0) + 8) = uVar1;
  *(undefined8 *)
   ("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" + unaff_x19 + 8) =
       uVar1;
  return 0;
}

