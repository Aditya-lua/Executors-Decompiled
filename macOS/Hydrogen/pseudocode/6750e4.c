
void FUN_006750e4(void)

{
  long lVar1;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar2;
  undefined8 *unaff_x21;
  
  if (unaff_x20 != unaff_x21) {
    do {
      puVar2 = unaff_x20 + 1;
      __ZdlPv(*unaff_x20);
      unaff_x20 = puVar2;
    } while (puVar2 != unaff_x21);
    lVar1 = unaff_x19[2];
    if (lVar1 != unaff_x19[1]) {
      unaff_x19[2] = lVar1 + ((unaff_x19[1] - lVar1) + 7U & 0xfffffffffffffff8);
    }
  }
  if (*unaff_x19 != 0) {
    __ZdlPv();
  }
  return;
}

