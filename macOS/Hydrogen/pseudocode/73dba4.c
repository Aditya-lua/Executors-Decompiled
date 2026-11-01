
undefined8 FUN_0073dba4(void)

{
  byte bVar1;
  long *plVar2;
  long lVar3;
  undefined8 uVar4;
  byte bVar5;
  uint in_w8;
  long unaff_x19;
  long lVar6;
  
  if ((in_w8 >> 7 & 1) != 0) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (iRam0000000000a2b560 < 1) goto LAB_0073dbdc;
    }
    else if (*(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8) < 1 || iRam0000000000a2b560 < 1)
    goto LAB_0073dbdc;
    func_0x0073ce84();
  }
LAB_0073dbdc:
  lVar3 = func_0x00774174();
  if (lVar3 != 0) {
    bVar5 = *(byte *)(lVar3 + 0x28);
    if ((bVar5 >> 1 & 1) != 0) {
      return 0x17;
    }
    if ((bVar5 & 1) != 0) {
      bVar1 = bVar5 & 0xfe;
      bVar5 = 0;
      *(byte *)(lVar3 + 0x28) = bVar1;
    }
    if ((bVar5 & 1) == 0) {
      uVar4 = func_0x0073e0b8(lVar3);
      if ((int)uVar4 != 0) {
        *(byte *)(lVar3 + 0x28) = *(byte *)(lVar3 + 0x28) | 2;
        plVar2 = (long *)*(long *)(lVar3 + 0x20);
        while (plVar2 != (long *)0x0) {
          lVar6 = *plVar2;
          func_0x00740678(plVar2 + 1);
          (*pcRam0000000000a2b5f0)(plVar2);
          *(long *)(lVar3 + 0x20) = lVar6;
          plVar2 = (long *)lVar6;
        }
      }
      return uVar4;
    }
  }
  return 0;
}

