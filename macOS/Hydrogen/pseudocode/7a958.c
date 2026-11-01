
void FUN_0007a958(void)

{
  undefined8 *unaff_x19;
  undefined4 unaff_w20;
  undefined8 *unaff_x24;
  
  func_0x0007b950();
  (**(code **)(*(long *)*unaff_x19 + 8))((long *)*unaff_x19,"\": ",3);
  func_0x0007a85c();
  (*(code *)**(undefined8 **)*unaff_x19)((undefined8 *)*unaff_x19,10);
  if (*(char *)((long)unaff_x19 + 0x277) < '\0') {
    unaff_x24 = (undefined8 *)*unaff_x24;
  }
  (**(code **)(*(long *)*unaff_x19 + 8))((long *)*unaff_x19,unaff_x24,unaff_w20);
                    /* WARNING: Could not recover jumptable at 0x0007b858. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)**(undefined8 **)*unaff_x19)((undefined8 *)*unaff_x19,0x7d);
  return;
}

