
void FUN_0001788c(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x25;
  
  uVar1 = (param_1 & 0xfffffffffffffff8) + 8;
  if ((param_1 | 7) != 0x17) {
    uVar1 = param_1 | 7;
  }
  uVar2 = 0x17;
  if (0x16 < param_1) {
    uVar2 = uVar1 + 1;
  }
  lVar3 = __Znwm(uVar2);
  if (unaff_x20 != 0) {
    _memcpy(lVar3);
  }
  if (unaff_x25 != 0x16) {
    __ZdlPv();
  }
  unaff_x19[1] = unaff_x20;
  unaff_x19[2] = uVar2 | 0x8000000000000000;
  *unaff_x19 = lVar3;
  *(undefined1 *)(lVar3 + unaff_x20) = 0;
  return;
}

