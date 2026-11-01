
/* WARNING: Removing unreachable block (ram,0x00054174) */

undefined8 FUN_0005403c(undefined1 param_1 [16],undefined8 *param_2)

{
  undefined8 uVar1;
  ulong uVar2;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long lVar3;
  long unaff_x29;
  undefined1 uStack0000000000000015;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined1 uStack0000000000000040;
  undefined1 uStack00000000000000e0;
  
  param_2[1] = param_1._8_8_;
  *param_2 = param_1._0_8_;
  uVar2 = *(ulong *)(unaff_x24 + 0x160);
  lVar3 = *(long *)(unaff_x24 + 0x158);
  if (-1 < (char)*(byte *)(unaff_x29 + -0x41)) {
    uVar2 = (ulong)*(byte *)(unaff_x29 + -0x41);
    lVar3 = unaff_x29 + -0x58;
  }
  (**(code **)(unaff_x22 + 0x38))(&uStack0000000000000030,lVar3,uVar2);
  (**(code **)(uStack0000000000000030 + 0x38))(&uStack0000000000000030);
  uStack0000000000000018 = 0;
  in_stack_00000020 = 0;
  in_stack_00000028 = 0;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
            (&uStack0000000000000018,0x60);
  lVar3 = 0;
  do {
    _snprintf(&uStack0000000000000015,3,"%02X");
    uVar1 = _strlen(&uStack0000000000000015);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (&uStack0000000000000018,&uStack0000000000000015,uVar1);
    lVar3 = lVar3 + 1;
  } while (lVar3 != 0x30);
  func_0x006e3964();
  if (in_stack_00000028 < 0) {
    __ZdlPv(uStack0000000000000018);
  }
  __ZdlPv();
  uVar2 = *(ulong *)(unaff_x24 + 0x140);
  if (*(ulong *)(unaff_x24 + 0x148) <= *(ulong *)(unaff_x24 + 0x140)) {
    uVar2 = *(ulong *)(unaff_x24 + 0x148);
  }
  if (*(long *)(unaff_x24 + 0x150) == unaff_x20) {
    for (; uVar2 != 0; uVar2 = uVar2 - 1) {
      *(undefined8 *)(&uStack00000000000000e0 + uVar2 * 8) = 0;
    }
  }
  uVar2 = *(ulong *)(unaff_x24 + 0xa0);
  if (*(ulong *)(unaff_x24 + 0xa8) <= *(ulong *)(unaff_x24 + 0xa0)) {
    uVar2 = *(ulong *)(unaff_x24 + 0xa8);
  }
  if (*(long *)(unaff_x24 + 0xb0) == unaff_x23 && uVar2 != 0) {
    do {
      *(undefined8 *)(&uStack0000000000000040 + uVar2 * 8) = 0;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  return 1;
}

