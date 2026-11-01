
undefined8 FUN_006de2b0(void)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 uVar4;
  
  while( true ) {
    lVar1 = *(long *)(unaff_x19 + 0x88);
    lVar3 = lVar1 + -0x10;
    *(long *)(unaff_x19 + 0x88) = lVar3;
    if ((ulong)(lVar3 - *(long *)(unaff_x19 + 0x80) >> 4) <= unaff_x20) break;
    uVar4 = *(undefined8 *)(lVar1 + -0x18);
    puVar2 = (undefined8 *)func_0x006db828();
    *puVar2 = uVar4;
  }
  return 0;
}

