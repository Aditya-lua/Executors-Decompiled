
void FUN_00071370(void)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  long lVar4;
  long *unaff_x19;
  long unaff_x20;
  long lVar5;
  long unaff_x22;
  long unaff_x23;
  long unaff_x25;
  
  lVar1 = *unaff_x19;
  lVar5 = unaff_x19[1];
  *unaff_x19 = unaff_x23 + unaff_x25;
  unaff_x19[1] = unaff_x20;
  unaff_x19[2] = unaff_x22;
  if (lVar5 != lVar1) {
    do {
      plVar3 = (long *)(lVar5 + -0x20);
      plVar2 = *(long **)(lVar5 + -8);
      if (plVar3 == plVar2) {
        lVar4 = 4;
LAB_000713bc:
        (**(code **)(*plVar3 + lVar4 * 8))();
      }
      else if (plVar2 != (long *)0x0) {
        lVar4 = 5;
        plVar3 = plVar2;
        goto LAB_000713bc;
      }
      plVar3 = *(long **)(lVar5 + -0x28);
      *(undefined8 *)(lVar5 + -0x28) = 0;
      if (plVar3 != (long *)0x0) {
        (**(code **)(*plVar3 + 8))();
      }
      lVar5 = lVar5 + -0x28;
    } while (lVar5 != lVar1);
    lVar5 = lVar1;
  }
  if (lVar5 != 0) {
    __ZdlPv(lVar5);
  }
  return;
}

