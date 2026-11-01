
void FUN_0049cc64(ulong *param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  ulong *puVar2;
  code *pcVar3;
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
  ulong uVar5;
  ulong uVar6;
  undefined1 uStack0000000000000000;
  
  while( true ) {
    param_1 = param_1 + !(bool)in_CY;
    in_x10 = in_x10 + (in_x16 & 0xffffffff);
    uVar5 = *in_x12;
    uVar6 = *in_x14;
    uVar1 = uVar5;
    if (uVar5 <= uVar6) {
      uVar1 = uVar6;
    }
    *(ulong *)(in_x15 + in_x13) = uVar1;
    in_x12 = in_x12 + -(ulong)(uVar6 <= uVar5);
    in_x14 = in_x14 + -(ulong)(uVar6 > uVar5);
    in_x13 = in_x13 + -8;
    if (in_x9 == in_x11) break;
    in_CY = *in_x10 <= *param_1;
    uVar1 = *param_1;
    if ((bool)in_CY) {
      uVar1 = *in_x10;
    }
    *(ulong *)(in_x15 + in_x11 * 8) = uVar1;
    in_x11 = in_x11 + 1;
    in_x16 = (ulong)(byte)in_CY;
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

