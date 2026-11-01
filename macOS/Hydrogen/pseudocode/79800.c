
void FUN_00079800(void)

{
  long *plVar1;
  bool bVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  long *unaff_x22;
  long *unaff_x23;
  long *plVar3;
  
  do {
    func_0x00079964();
    plVar1 = (long *)unaff_x23[1];
    plVar3 = unaff_x23;
    if ((long *)unaff_x23[1] == (long *)0x0) {
      do {
        unaff_x23 = (long *)plVar3[2];
        bVar2 = (long *)*unaff_x23 != plVar3;
        plVar3 = unaff_x23;
      } while (bVar2);
    }
    else {
      do {
        unaff_x23 = plVar1;
        plVar1 = (long *)*unaff_x23;
      } while ((long *)*unaff_x23 != (long *)0x0);
    }
  } while (unaff_x23 != unaff_x22);
  *(undefined8 *)(unaff_x19 + 8) = unaff_x20;
  return;
}

