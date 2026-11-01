
undefined8 FUN_007601dc(code *param_1)

{
  long lVar1;
  long unaff_x19;
  
  lVar1 = (*param_1)();
  *(long *)(unaff_x19 + 0x68) = lVar1;
  if (lVar1 == 0) {
    return 0x1b;
  }
  return 0;
}

