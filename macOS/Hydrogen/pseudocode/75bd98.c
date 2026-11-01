
void FUN_0075bd98(code *param_1)

{
  undefined8 *unaff_x20;
  undefined4 *unaff_x22;
  
  (*param_1)();
  *(undefined8 *)(unaff_x22 + 0xe) = 0;
  (*(code *)*unaff_x20)(*(undefined8 *)(unaff_x22 + 0x10));
  *(undefined8 *)(unaff_x22 + 0x10) = 0;
  (*(code *)*unaff_x20)(*(undefined8 *)(unaff_x22 + 0x12));
  *(undefined8 *)(unaff_x22 + 0x12) = 0;
  *unaff_x22 = 0;
  return;
}

