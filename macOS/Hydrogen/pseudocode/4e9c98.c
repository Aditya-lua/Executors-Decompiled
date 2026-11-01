
undefined8 FUN_004e9c98(void)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined8 uVar3;
  long *plVar4;
  long unaff_x22;
  long lVar5;
  undefined8 *unaff_x23;
  long unaff_x24;
  
  do {
    if (unaff_x23[1] == unaff_x19) {
      uVar3 = *unaff_x23;
      iVar1 = _memcmp(uVar3);
      if (iVar1 == 0) {
        if ((*(byte *)(unaff_x23 + 7) >> 2 & 1) != 0) {
          return 0;
        }
        if (*(long *)(unaff_x22 + 0x10) == 0) {
          return 1;
        }
        plVar4 = (long *)(*(long *)(unaff_x22 + 8) + 0x20);
        lVar5 = *(long *)(unaff_x22 + 0x10) * 0x28;
        while ((*plVar4 != unaff_x19 || (uVar2 = _memcmp(plVar4[-1],uVar3), (int)uVar2 != 0))) {
          plVar4 = plVar4 + 5;
          lVar5 = lVar5 + -0x28;
          if (lVar5 == 0) {
            return 1;
          }
        }
        return uVar2;
      }
    }
    unaff_x23 = unaff_x23 + 0x4b;
    unaff_x24 = unaff_x24 + -600;
    if (unaff_x24 == 0) {
      return 1;
    }
  } while( true );
}

