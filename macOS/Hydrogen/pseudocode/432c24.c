
ulong FUN_00432c24(void)

{
  uint uVar1;
  undefined1 in_ZR;
  long lVar2;
  char cVar3;
  int iVar4;
  ulong uVar5;
  uint *puVar6;
  ulong uVar7;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  long *in_stack_00000000;
  undefined4 uStack0000000000000010;
  long *in_stack_00000018;
  ulong in_stack_00000020;
  long *in_stack_00000438;
  char in_stack_00000454;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x00432c24:
  if ((bool)in_ZR) {
    puVar6 = (uint *)___error();
    uVar5 = unaff_x27 | (ulong)*puVar6 << 0x20;
    uVar7 = unaff_x27 & 0xffffffff00000003 | (ulong)*puVar6 << 0x20;
    goto joined_r0x00432c5c;
  }
LAB_00432c28:
  lVar2 = *in_stack_00000438;
  *in_stack_00000438 = lVar2 + unaff_x25;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x004037b4(auStack_7ffffffe + 0x80000436);
  }
  func_0x0043148c(&uStack0000000000000010);
  in_stack_00000438 = in_stack_00000018;
  if (uStack0000000000000010 != 1) {
    lVar2 = *in_stack_00000000;
    *in_stack_00000000 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      func_0x004037b4();
    }
    iVar4 = _unlinkat();
    if (iVar4 != -1) {
      return 0;
    }
    puVar6 = (uint *)___error();
    uVar1 = *puVar6;
    cVar3 = func_0x004307b8();
    uVar5 = 0;
    if (cVar3 != '\0') {
      uVar5 = (ulong)uVar1 << 0x20 | 2;
    }
    return uVar5;
  }
  uVar5 = in_stack_00000020;
  if (in_stack_00000018 == (long *)0x0) goto LAB_00432c80;
  _memcpy(unaff_x24 + 0x10,unaff_x23 + 0x18,0x410);
  if (in_stack_00000454 == '\x04') {
    uVar5 = func_0x00432a78(1);
  }
  else {
    if (in_stack_00000454 != '\0') goto code_r0x00432c10;
    uVar5 = func_0x00432a78(1);
  }
  if (uVar5 != 0) {
    uVar7 = uVar5 & 0xffffffff00000003;
joined_r0x00432c5c:
    if (uVar7 != unaff_x26) {
      lVar2 = *in_stack_00000438;
      *in_stack_00000438 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4(auStack_7ffffffe + 0x80000436);
      }
LAB_00432c80:
      lVar2 = *in_stack_00000000;
      *in_stack_00000000 = lVar2 + -1;
      LORelease();
      if (lVar2 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4();
      }
      return uVar5;
    }
  }
  goto LAB_00432c28;
code_r0x00432c10:
  iVar4 = _unlinkat();
  in_ZR = iVar4 == -1;
  goto code_r0x00432c24;
}

