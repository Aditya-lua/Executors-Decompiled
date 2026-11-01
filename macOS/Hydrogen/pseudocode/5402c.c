
/* WARNING: Removing unreachable block (ram,0x00054174) */

undefined8 FUN_0005402c(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  ulong uVar3;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long lVar4;
  long unaff_x29;
  undefined1 uStack0000000000000015;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined1 uStack0000000000000040;
  undefined1 uStack00000000000000e0;
  
  puVar1 = (undefined8 *)__Znwm();
  puVar1[3] = 0;
  puVar1[2] = 0;
  puVar1[5] = 0;
  puVar1[4] = 0;
  puVar1[1] = 0;
  *puVar1 = 0;
  uVar3 = *(ulong *)(unaff_x24 + 0x160);
  lVar4 = *(long *)(unaff_x24 + 0x158);
  if (-1 < (char)*(byte *)(unaff_x29 + -0x41)) {
    uVar3 = (ulong)*(byte *)(unaff_x29 + -0x41);
    lVar4 = unaff_x29 + -0x58;
  }
  (**(code **)(unaff_x22 + 0x38))(&uStack0000000000000030,lVar4,uVar3);
  (**(code **)(uStack0000000000000030 + 0x38))(&uStack0000000000000030,puVar1);
  uStack0000000000000018 = 0;
  in_stack_00000020 = 0;
  in_stack_00000028 = 0;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
            (&uStack0000000000000018,0x60);
  lVar4 = 0;
  do {
    _snprintf(&uStack0000000000000015,3,"%02X");
    uVar2 = _strlen(&uStack0000000000000015);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (&uStack0000000000000018,&uStack0000000000000015,uVar2);
    lVar4 = lVar4 + 1;
  } while (lVar4 != 0x30);
  func_0x006e3964();
  if (in_stack_00000028 < 0) {
    __ZdlPv(uStack0000000000000018);
  }
  __ZdlPv(puVar1);
  uVar3 = *(ulong *)(unaff_x24 + 0x140);
  if (*(ulong *)(unaff_x24 + 0x148) <= *(ulong *)(unaff_x24 + 0x140)) {
    uVar3 = *(ulong *)(unaff_x24 + 0x148);
  }
  if (*(long *)(unaff_x24 + 0x150) == unaff_x20) {
    for (; uVar3 != 0; uVar3 = uVar3 - 1) {
      *(undefined8 *)(&uStack00000000000000e0 + uVar3 * 8) = 0;
    }
  }
  uVar3 = *(ulong *)(unaff_x24 + 0xa0);
  if (*(ulong *)(unaff_x24 + 0xa8) <= *(ulong *)(unaff_x24 + 0xa0)) {
    uVar3 = *(ulong *)(unaff_x24 + 0xa8);
  }
  if (*(long *)(unaff_x24 + 0xb0) == unaff_x23 && uVar3 != 0) {
    do {
      *(undefined8 *)(&uStack0000000000000040 + uVar3 * 8) = 0;
      uVar3 = uVar3 - 1;
    } while (uVar3 != 0);
  }
  return 1;
}

