
void FUN_006ef9d0(void)

{
  long lVar1;
  long *plVar2;
  ulong unaff_x19;
  long unaff_x20;
  long lVar3;
  
  while( true ) {
    func_0x006f0ef4();
    lVar1 = *(long *)(unaff_x20 + 0x60);
    if ((lVar1 == 0) || (*(ulong *)(lVar1 + 8) < unaff_x19)) break;
    *(undefined8 *)(unaff_x20 + 0x60) = *(undefined8 *)(lVar1 + 0x20);
    plVar2 = (long *)(lVar1 + 0x10);
    *(long *)(*(long *)(lVar1 + 0x18) + 0x10) = *plVar2;
    *(undefined8 *)(*plVar2 + 0x18) = *(undefined8 *)(lVar1 + 0x18);
    lVar3 = **(long **)(lVar1 + 8);
    *(long *)(lVar1 + 0x18) = (*(long **)(lVar1 + 8))[1];
    *plVar2 = lVar3;
    *(long **)(lVar1 + 8) = plVar2;
  }
  return;
}

