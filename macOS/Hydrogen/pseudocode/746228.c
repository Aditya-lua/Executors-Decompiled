
undefined8 FUN_00746228(void)

{
  long unaff_x19;
  long lVar1;
  undefined8 *unaff_x21;
  
  lVar1 = 0;
  do {
    (*(code *)*unaff_x21)(*(undefined8 *)(*(long *)(unaff_x19 + 0x4a8) + lVar1 * 8));
    *(undefined8 *)(*(long *)(unaff_x19 + 0x4a8) + lVar1 * 8) = 0;
    lVar1 = lVar1 + 1;
  } while (lVar1 < *(int *)(unaff_x19 + 0x4e0));
  (*(code *)*unaff_x21)(*(undefined8 *)(unaff_x19 + 0x4a8));
  *(undefined8 *)(unaff_x19 + 0x4a8) = 0;
  *(undefined4 *)(unaff_x19 + 0x4e0) = 0;
  (*(code *)*unaff_x21)(*(undefined8 *)(unaff_x19 + 0x4a0));
  *(undefined8 *)(unaff_x19 + 0x4a0) = 0;
  (*(code *)*unaff_x21)(*(undefined8 *)(unaff_x19 + 0x4b0));
  *(undefined8 *)(unaff_x19 + 0x4b0) = 0;
  (*(code *)*unaff_x21)(*(undefined8 *)(unaff_x19 + 0x488));
  *(undefined8 *)(unaff_x19 + 0x488) = 0;
  (*(code *)*unaff_x21)(*(undefined8 *)(unaff_x19 + 0x490));
  *(undefined8 *)(unaff_x19 + 0x490) = 0;
  (*(code *)*unaff_x21)(*(undefined8 *)(unaff_x19 + 0x4b8));
  *(undefined8 *)(unaff_x19 + 0x4b8) = 0;
  (*(code *)*unaff_x21)(*(undefined8 *)(unaff_x19 + 0x4d0));
  *(undefined8 *)(unaff_x19 + 0x4d0) = 0;
  func_0x0076e6b0(unaff_x19 + 1000);
  return 0;
}

