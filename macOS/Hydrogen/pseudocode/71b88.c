
/* WARNING: Removing unreachable block (ram,0x00071be4) */
/* WARNING: Removing unreachable block (ram,0x00071b9c) */

void FUN_00071b88(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  long lVar2;
  long unaff_x21;
  long lVar3;
  
  do {
    unaff_x21 = unaff_x21 + -0x18;
  } while (unaff_x21 != unaff_x20);
  *(long *)(unaff_x19 + 0x28) = unaff_x20;
  __ZdlPv(*(undefined8 *)(unaff_x19 + 0x20));
  lVar2 = *(long *)(unaff_x19 + 8);
  if (lVar2 != 0) {
    lVar3 = *(long *)(unaff_x19 + 0x10);
    lVar1 = lVar2;
    if (lVar3 != lVar2) {
      do {
        lVar3 = lVar3 + -0x18;
      } while (lVar3 != lVar2);
      lVar1 = *(long *)(unaff_x19 + 8);
    }
    *(long *)(unaff_x19 + 0x10) = lVar2;
    __ZdlPv(lVar1);
  }
  return;
}

