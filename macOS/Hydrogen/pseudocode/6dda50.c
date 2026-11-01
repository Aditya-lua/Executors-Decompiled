
undefined8 FUN_006dda50(ulong param_1)

{
  char cVar1;
  ulong in_x9;
  long in_x10;
  ulong in_x12;
  ulong uVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined1 unaff_w22;
  long unaff_x23;
  long *plVar4;
  undefined4 uStack0000000000000000;
  
  while( true ) {
    uVar2 = in_x12 & param_1;
    lVar3 = *(long *)(in_x10 + uVar2 * 0x20);
    if (lVar3 == *(long *)(unaff_x20 + 0x18)) {
      plVar4 = (long *)(in_x10 + uVar2 * 0x20);
      *plVar4 = unaff_x19;
      *(long *)(unaff_x20 + 0x10) = *(long *)(unaff_x20 + 0x10) + 1;
      cVar1 = *(char *)((long)plVar4 + 0x1f);
      goto joined_r0x006ddaa8;
    }
    if (lVar3 == unaff_x19) break;
    in_x9 = in_x9 + 1;
    in_x12 = in_x9 + uVar2;
    if (param_1 < in_x9) {
      plVar4 = (long *)0x0;
      cVar1 = MACH_HEADER.reserved._3_1_;
joined_r0x006ddaa8:
      if (cVar1 < '\0') {
        __ZdlPv(plVar4[1]);
      }
      plVar4[1] = unaff_x21;
      plVar4[2] = unaff_x23;
      *(undefined4 *)(plVar4 + 3) = uStack0000000000000000;
      *(int *)((long)plVar4 + 0x1b) = (int)((ulong)_uStack0000000000000000 >> 0x18);
      *(undefined1 *)((long)plVar4 + 0x1f) = unaff_w22;
      return 1;
    }
  }
  plVar4 = (long *)(in_x10 + uVar2 * 0x20);
  cVar1 = *(char *)((long)plVar4 + 0x1f);
  goto joined_r0x006ddaa8;
}

