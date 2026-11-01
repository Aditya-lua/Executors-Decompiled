
undefined8 FUN_007681f4(undefined8 param_1,undefined8 param_2)

{
  byte bVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long unaff_x19;
  undefined8 uVar5;
  undefined8 uVar6;
  
  lVar3 = func_0x0077e2a4(0,0,*(undefined8 *)(unaff_x19 + 0xf0));
  *(long *)(unaff_x19 + 0xf0) = lVar3;
  if (lVar3 == 0) {
    lVar3 = 0;
    uVar5 = 0;
    uVar6 = 0;
    lVar4 = *(long *)(unaff_x19 + 0x248);
  }
  else {
    uVar6 = *(undefined8 *)(lVar3 + 0x20);
    uVar5 = *(undefined8 *)(lVar3 + 0x28);
    lVar3 = func_0x00782ea8(uVar6,uVar5,param_1,param_2);
    if (lVar3 < 1) {
      lVar3 = 0;
      lVar4 = *(long *)(unaff_x19 + 0x248);
    }
    else {
      lVar3 = func_0x00782e34(*(undefined8 *)(*(long *)(unaff_x19 + 0xf0) + 0x20),
                              *(undefined8 *)(*(long *)(unaff_x19 + 0xf0) + 0x28),param_1,param_2);
      if (lVar3 < 0) {
        if (*(long *)(unaff_x19 + 0x248) < 0) {
          return 0;
        }
        lVar3 = -1;
        goto LAB_007682c8;
      }
      lVar4 = *(long *)(unaff_x19 + 0x248);
    }
  }
  if ((-1 < lVar4) &&
     (lVar4 = func_0x00782ea8(*(undefined8 *)(unaff_x19 + 0x250),*(undefined8 *)(unaff_x19 + 600),
                              uVar6,uVar5), lVar4 == 0)) {
    return 0;
  }
LAB_007682c8:
  *(undefined8 *)(unaff_x19 + 0x250) = uVar6;
  *(undefined8 *)(unaff_x19 + 600) = uVar5;
  *(long *)(unaff_x19 + 0x248) = lVar3;
  *(byte *)(unaff_x19 + 0x271) = *(byte *)(unaff_x19 + 0x271) | 4;
  iVar2 = (**(code **)(unaff_x19 + 0x238))();
  bVar1 = *(byte *)(unaff_x19 + 0x271) & 0xfb;
  *(byte *)(unaff_x19 + 0x271) = bVar1;
  if (iVar2 == -1) {
    *(byte *)(unaff_x19 + 0x271) = bVar1 | 8;
    return 0xb;
  }
  return 0;
}

