
undefined8 FUN_006fe848(void)

{
  long lVar1;
  undefined8 *puVar2;
  int in_w8;
  long lVar3;
  long in_x9;
  long lVar4;
  int in_w10;
  long unaff_x19;
  long unaff_x20;
  
  if ((in_w10 == 0x81) || (lVar1 = (in_x9 + 8) - *(long *)(in_x9 + 8), lVar1 == 0)) {
    lVar4 = (long)in_w8;
    lVar3 = *(long *)(unaff_x20 + 0x18);
    lVar1 = *(long *)(lVar3 + lVar4 * 8 + 0x328);
    if (lVar1 != 0) goto LAB_006fe8a0;
  }
  else {
    lVar3 = *(long *)(unaff_x20 + 0x18);
LAB_006fe8a0:
    puVar2 = (undefined8 *)func_0x006fb768(lVar1,*(undefined8 *)(lVar3 + 0x470));
    if (*(int *)((long)puVar2 + 0xc) == 5) goto code_r0x006fe8c4;
    lVar3 = *(long *)(unaff_x20 + 0x18);
    lVar4 = (long)*(int *)(unaff_x19 + 0xc);
  }
  puVar2 = (undefined8 *)(lVar3 + lVar4 * 8 + 0x380);
code_r0x006fe8c4:
  return *puVar2;
}

