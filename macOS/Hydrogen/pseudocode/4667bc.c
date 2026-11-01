
void FUN_004667bc(long param_1)

{
  undefined8 unaff_x20;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  long unaff_x29;
  
  *(long *)(unaff_x29 + -0xd8) = param_1 + 0x4bd;
  *(undefined8 *)(unaff_x29 + -0xd0) = 2;
  *(undefined2 *)(unaff_x29 + -200) = 0;
  *(undefined8 *)(unaff_x29 + -0xc0) = unaff_x20;
  *(undefined8 *)(unaff_x29 + -0x80) = unaff_x23;
  *(undefined8 *)(unaff_x29 + -0x78) = unaff_x22;
  *(long *)(unaff_x29 + -0x70) = unaff_x29 + -0xe0;
  *(undefined8 *)(unaff_x29 + -0x68) = 2;
  func_0x00468db8();
  return;
}

