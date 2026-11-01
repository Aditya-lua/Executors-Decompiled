
void FUN_0007b134(void)

{
  long *plVar1;
  bool bVar2;
  undefined8 *unaff_x19;
  undefined4 unaff_w20;
  long unaff_x21;
  undefined8 *unaff_x24;
  long *plVar3;
  long *plVar4;
  ulong uVar5;
  
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6resizeEmc();
  plVar3 = (long *)**(undefined8 **)(unaff_x21 + 8);
  if ((*(undefined8 **)(unaff_x21 + 8))[2] != 1) {
    uVar5 = 0;
    do {
      (**(code **)(*(long *)*unaff_x19 + 8))();
      (*(code *)**(undefined8 **)*unaff_x19)((undefined8 *)*unaff_x19,0x22);
      func_0x0007b950();
      (**(code **)(*(long *)*unaff_x19 + 8))((long *)*unaff_x19,"\": ",3);
      func_0x0007a85c();
      (**(code **)(*(long *)*unaff_x19 + 8))((long *)*unaff_x19,",\n",2);
      plVar1 = (long *)plVar3[1];
      plVar4 = plVar3;
      if ((long *)plVar3[1] == (long *)0x0) {
        do {
          plVar3 = (long *)plVar4[2];
          bVar2 = (long *)*plVar3 != plVar4;
          plVar4 = plVar3;
        } while (bVar2);
      }
      else {
        do {
          plVar3 = plVar1;
          plVar1 = (long *)*plVar3;
        } while ((long *)*plVar3 != (long *)0x0);
      }
      uVar5 = uVar5 + 1;
    } while (uVar5 < *(long *)(*(long *)(unaff_x21 + 8) + 0x10) - 1U);
  }
  (**(code **)(*(long *)*unaff_x19 + 8))();
  (*(code *)**(undefined8 **)*unaff_x19)((undefined8 *)*unaff_x19,0x22);
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

