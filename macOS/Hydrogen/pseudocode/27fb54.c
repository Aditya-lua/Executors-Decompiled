
undefined8 FUN_0027fb54(void)

{
  ulong uVar1;
  bool bVar2;
  undefined1 in_ZR;
  undefined1 in_CY;
  int iVar3;
  long lVar4;
  long *unaff_x19;
  ulong *unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x26;
  
  do {
    if (!(bool)in_CY || (bool)in_ZR) {
      uVar1 = unaff_x23 + 0x1000;
      bVar2 = unaff_x23 <= unaff_x26;
      unaff_x23 = unaff_x22;
      if (uVar1 <= unaff_x22 && bVar2) {
        unaff_x23 = uVar1;
      }
      lVar4 = func_0x0036e48c(*unaff_x19,unaff_x23);
      if (lVar4 == 0) {
LAB_0027f908:
        func_0x0036e3d8(*unaff_x19);
        func_0x0028f83c(0xc,0,0xa2,"/aws-lc/crypto/bio/bio.c",0x2d7);
        return 0;
      }
      *unaff_x19 = lVar4;
    }
    do {
      if ((unaff_x24 == unaff_x23) || (iVar3 = func_0x0027e418(), iVar3 == -1)) goto LAB_0027f908;
      if (iVar3 == 0) {
        *unaff_x21 = unaff_x24;
        return 1;
      }
      unaff_x24 = unaff_x24 + (long)iVar3;
    } while (unaff_x22 <= unaff_x23);
    in_CY = 0x7fe < unaff_x23 - unaff_x24;
    in_ZR = unaff_x23 - unaff_x24 == 0x7ff;
  } while( true );
}

