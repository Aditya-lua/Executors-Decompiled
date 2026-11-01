
undefined8 FUN_006dda1c(long param_1)

{
  char cVar1;
  undefined1 in_ZR;
  ulong in_x9;
  ulong uVar2;
  ulong in_x10;
  long lVar3;
  ulong in_x11;
  long in_x12;
  ulong uVar4;
  ulong in_x13;
  ulong uVar5;
  ulong in_x14;
  ulong unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  undefined1 unaff_w22;
  ulong unaff_x23;
  ulong *puVar6;
  ulong unaff_x25;
  undefined4 uStack0000000000000000;
  
  while (!(bool)in_ZR) {
    in_x10 = in_x10 + 1;
    if (in_x14 == in_x9 || in_x11 < in_x10) {
      func_0x006df034();
      param_1 = unaff_x20[1];
      break;
    }
    in_x13 = in_x10 + in_x13 & in_x11;
    in_x14 = *(ulong *)(in_x12 + in_x13 * 0x20);
    in_ZR = in_x14 == unaff_x19;
  }
  uVar2 = 0;
  uVar4 = unaff_x25 ^ unaff_x19 >> 9;
  lVar3 = *unaff_x20;
  while( true ) {
    uVar4 = uVar4 & param_1 - 1U;
    uVar5 = *(ulong *)(lVar3 + uVar4 * 0x20);
    if (uVar5 == unaff_x20[3]) {
      puVar6 = (ulong *)(lVar3 + uVar4 * 0x20);
      *puVar6 = unaff_x19;
      unaff_x20[2] = unaff_x20[2] + 1;
      cVar1 = *(char *)((long)puVar6 + 0x1f);
      goto joined_r0x006ddaf8;
    }
    if (uVar5 == unaff_x19) break;
    uVar2 = uVar2 + 1;
    uVar4 = uVar2 + uVar4;
    if (param_1 - 1U < uVar2) {
      puVar6 = (ulong *)0x0;
      cVar1 = MACH_HEADER.reserved._3_1_;
joined_r0x006ddaf8:
      if (cVar1 < '\0') {
        __ZdlPv(puVar6[1]);
      }
      puVar6[1] = unaff_x21;
      puVar6[2] = unaff_x23;
      *(undefined4 *)(puVar6 + 3) = uStack0000000000000000;
      *(int *)((long)puVar6 + 0x1b) = (int)((ulong)_uStack0000000000000000 >> 0x18);
      *(undefined1 *)((long)puVar6 + 0x1f) = unaff_w22;
      return 1;
    }
  }
  puVar6 = (ulong *)(lVar3 + uVar4 * 0x20);
  cVar1 = *(char *)((long)puVar6 + 0x1f);
  goto joined_r0x006ddaf8;
}

