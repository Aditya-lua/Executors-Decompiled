
void FUN_006f4194(void)

{
  undefined1 in_ZR;
  int iVar1;
  code *unaff_x19;
  long lVar2;
  long unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  int unaff_w25;
  long unaff_x26;
  long unaff_x27;
  
  do {
    if ((bool)in_ZR) goto LAB_006f4140;
    while (((*(char *)(unaff_x27 + unaff_x26) != '\0' && (iVar1 = (*unaff_x19)(), iVar1 != 0)) &&
           (unaff_w25 = unaff_w25 + -1, unaff_w25 == 0))) {
LAB_006f4140:
      do {
        lVar2 = unaff_x22;
        if (lVar2 == 0) {
          return;
        }
        unaff_x22 = *(long *)(lVar2 + 0x18);
        unaff_x23 = (ulong)*(int *)(lVar2 + 0x24);
        iVar1 = 0;
        if (unaff_x23 != 0) {
          iVar1 = (int)(((long)*(int *)(lVar2 + 0x20) - 0x40U) / unaff_x23);
        }
        unaff_x24 = lVar2 + 0x40 + (long)*(int *)(lVar2 + 0x24) * (long)iVar1;
      } while (lVar2 + 0x40 + (long)*(int *)(lVar2 + 0x30) + unaff_x23 == unaff_x24);
      unaff_x26 = (long)*(int *)(lVar2 + 0x30) + 0x40;
      unaff_x27 = lVar2 + unaff_x23;
      unaff_w25 = *(int *)(lVar2 + 0x34);
    }
    unaff_x27 = unaff_x27 + unaff_x23;
    in_ZR = unaff_x27 + unaff_x26 == unaff_x24;
  } while( true );
}

