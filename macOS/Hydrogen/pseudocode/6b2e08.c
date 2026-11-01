
void FUN_006b2e08(long param_1)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x23;
  long lStack0000000000000008;
  ulong uStack0000000000000018;
  
  uStack0000000000000018 = unaff_x23 | 0x8000000000000000;
  lStack0000000000000008 = param_1;
  _memmove(param_1);
  *(undefined1 *)(param_1 + unaff_x20) = 0;
  lVar1 = *unaff_x19 + (ulong)*(uint *)(unaff_x19 + 3) * 0x88;
  if (*(char *)(lVar1 + 0x57) < '\0') {
    __ZdlPv(*(long *)(lVar1 + 0x40));
  }
  *(ulong *)(lVar1 + 0x50) = uStack0000000000000018;
  *(long *)(lVar1 + 0x48) = unaff_x20;
  *(long *)(lVar1 + 0x40) = lStack0000000000000008;
  return;
}

