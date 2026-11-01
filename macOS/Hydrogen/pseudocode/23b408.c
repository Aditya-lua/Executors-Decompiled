
void FUN_0023b408(long param_1)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  undefined *puVar4;
  ulong in_x9;
  long *unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  ulong unaff_x26;
  ulong unaff_x27;
  int unaff_w28;
  long *in_stack_00000048;
  undefined8 uStack00000000000000a0;
  undefined8 uStack00000000000001c8;
  undefined8 in_stack_000001d0;
  undefined8 in_stack_000001d8;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  long in_stack_00000280;
  undefined8 in_stack_00000288;
  long in_stack_00000408;
  long in_stack_00000410;
  long in_stack_00000418;
  long in_stack_00000420;
  long in_stack_00000428;
  long in_stack_00000430;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (param_1 == (in_x9 & 0xffffffffffff | 0x8000000000000000) + 0xd) {
    func_0x0023d2c4(auStack_7ffffffe + 0x8000029e,auStack_7ffffffe + 0x800003de,unaff_x19 + 0xc,
                    *unaff_x22,auStack_7ffffffe + 0x800003fe,
                    *(undefined8 *)(*in_stack_00000048 + 0xb0),
                    *(undefined8 *)(*in_stack_00000048 + 0xb8));
    if ((unaff_x27 & 1) == 0) {
      if (*(char *)(*in_stack_00000048 + 0xf6) == '\x01') {
        func_0x00248970(*unaff_x22,unaff_x22 + 2);
      }
      if ((unaff_w28 == 2) && (*(char *)(*unaff_x22 + 0x339) != '\x01')) {
        _memcpy(auStack_7ffffffe + 0x80000446,auStack_7ffffffe + 0x8000029e,0x138);
        lVar1 = func_0x0020a620(0x188);
        _memcpy(lVar1,auStack_7ffffffe + 0x800003fe,0x188);
        puVar4 = &UNK_009c94d0;
      }
      else {
        _memcpy(auStack_7ffffffe + 0x80000446,auStack_7ffffffe + 0x8000029e,0x138);
        lVar1 = func_0x0020a620(0x188);
        _memcpy(lVar1,auStack_7ffffffe + 0x800003fe,0x188);
        puVar4 = &UNK_009c9518;
      }
    }
    else if (*(long *)(*in_stack_00000048 + 0x60) == 0) {
      _memcpy(auStack_7ffffffe + 0x80000446,auStack_7ffffffe + 0x8000029e,0x138);
      lVar1 = func_0x0020a620(400);
      _memcpy(lVar1,auStack_7ffffffe + 0x800003fe,400);
      puVar4 = &UNK_009c9560;
    }
    else {
      _memcpy(auStack_7ffffffe + 0x80000446,auStack_7ffffffe + 0x8000029e,0x138);
      lVar1 = func_0x0020a620(0x188);
      _memcpy(lVar1,auStack_7ffffffe + 0x800003fe,0x188);
      puVar4 = &UNK_009c95a8;
    }
    unaff_x21[1] = lVar1;
    unaff_x21[2] = (long)puVar4;
    *unaff_x21 = -0x7fffffffffffffd9;
    if (uStack00000000000000a0 != -0x8000000000000000) {
      func_0x001bf1c4(&uStack00000000000000a0);
    }
    if (*unaff_x20 == 0) {
      return;
    }
    lVar1 = unaff_x20[1];
    lVar2 = *unaff_x20 << 2;
    uVar3 = 2;
  }
  else {
    unaff_x21[2] = in_stack_00000410;
    unaff_x21[1] = in_stack_00000408;
    unaff_x21[4] = in_stack_00000420;
    unaff_x21[3] = in_stack_00000418;
    unaff_x21[6] = in_stack_00000430;
    unaff_x21[5] = in_stack_00000428;
    *unaff_x21 = param_1;
    if (in_stack_00000280 != 0) {
      func_0x00187bd4(in_stack_00000288,in_stack_00000280,1);
    }
    func_0x0023125c(&uStack00000000000001c8);
    if (uStack00000000000000a0 == -0x8000000000000000) {
      lVar1 = *unaff_x20;
    }
    else {
      func_0x001bf1c4(&uStack00000000000000a0);
      lVar1 = *unaff_x20;
    }
    if (lVar1 != 0) {
      func_0x00187bd4(unaff_x20[1],lVar1 << 2,2);
    }
    lVar1 = *(long *)unaff_x19[10];
    *(long *)unaff_x19[10] = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa1d4();
    }
    func_0x00230538(unaff_x19 + 3);
    if ((unaff_x26 & 1) == 0) {
      return;
    }
    lVar1 = unaff_x19[2] + 1;
    lVar2 = unaff_x19[1];
    while (lVar1 = lVar1 + -1, lVar1 != 0) {
      func_0x0016abd8(lVar2);
      lVar2 = lVar2 + 0x28;
    }
    if (*unaff_x19 == 0) {
      return;
    }
    lVar1 = unaff_x19[1];
    lVar2 = *unaff_x19 * 0x28;
    uVar3 = 8;
  }
  func_0x00187bd4(lVar1,lVar2,uVar3);
  return;
}

