
void FUN_006b2de8(void)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long *unaff_x19;
  ulong unaff_x20;
  
  uVar1 = (unaff_x20 & 0xfffffffffffffff8) + 8;
  if ((unaff_x20 | 7) != 0x17) {
    uVar1 = unaff_x20 | 7;
  }
  lVar2 = __Znwm(uVar1 + 1);
  _memmove(lVar2);
  *(undefined1 *)(lVar2 + unaff_x20) = 0;
  lVar3 = *unaff_x19 + (ulong)*(uint *)(unaff_x19 + 3) * 0x88;
  if (*(char *)(lVar3 + 0x57) < '\0') {
    __ZdlPv(*(long *)(lVar3 + 0x40));
  }
  *(ulong *)(lVar3 + 0x50) = uVar1 + 1 | 0x8000000000000000;
  *(ulong *)(lVar3 + 0x48) = unaff_x20;
  *(long *)(lVar3 + 0x40) = lVar2;
  return;
}

