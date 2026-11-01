
void FUN_0049cc7c(ulong *param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  ulong *puVar2;
  code *pcVar3;
  undefined1 in_ZR;
  undefined1 in_CY;
  bool bVar4;
  long in_x9;
  ulong *in_x10;
  long in_x11;
  ulong *in_x12;
  long in_x13;
  ulong *in_x14;
  long in_x15;
  ulong in_x16;
  ulong in_x17;
  undefined1 uStack0000000000000000;
  
  while( true ) {
    if (!(bool)in_CY || (bool)in_ZR) {
      in_x16 = in_x17;
    }
    *(ulong *)(in_x15 + in_x13) = in_x16;
    in_x12 = in_x12 + -(ulong)(byte)in_CY;
    in_x14 = in_x14 + -(ulong)!(bool)in_CY;
    in_x13 = in_x13 + -8;
    if (in_x9 == in_x11) break;
    bVar4 = *in_x10 <= *param_1;
    uVar1 = *param_1;
    if (bVar4) {
      uVar1 = *in_x10;
    }
    *(ulong *)(in_x15 + in_x11 * 8) = uVar1;
    in_x11 = in_x11 + 1;
    param_1 = param_1 + !bVar4;
    in_x10 = in_x10 + bVar4;
    in_x16 = *in_x12;
    in_x17 = *in_x14;
    in_CY = in_x17 <= in_x16;
    in_ZR = in_x16 == in_x17;
  }
  if ((param_3 & 1) != 0) {
    bVar4 = in_x14 + 1 <= in_x10;
    puVar2 = in_x10;
    if (bVar4) {
      puVar2 = param_1;
    }
    *(ulong *)(&uStack0000000000000000 + in_x11 * 8) = *puVar2;
    in_x10 = in_x10 + !bVar4;
    param_1 = param_1 + bVar4;
  }
  if (in_x10 != in_x14 + 1 || param_1 != in_x12 + 1) {
    func_0x007a286c();
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x49cd00);
    (*pcVar3)();
  }
  _memcpy();
  return;
}

