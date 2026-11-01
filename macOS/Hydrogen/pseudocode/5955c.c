
void FUN_0005955c(void)

{
  long lVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  
  lVar1 = unaff_x19[1];
  lVar2 = unaff_x20;
  if (lVar1 != unaff_x20) {
    do {
      lVar1 = __ZNSt3__16threadD1Ev(lVar1 + -8);
    } while (lVar1 != unaff_x20);
    lVar2 = *unaff_x19;
  }
  unaff_x19[1] = unaff_x20;
  __ZdlPv(lVar2);
  return;
}

