
ulong FUN_00432b60(long *param_1)

{
  uint uVar1;
  long *plVar2;
  long lVar3;
  char cVar4;
  int iVar5;
  ulong uVar6;
  uint *puVar7;
  long *plStack0000000000000000;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  long *in_stack_00000018;
  ulong in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  char in_stack_00000454;
  undefined1 auStack_7ffffffe [2147483646];
  
  param_1[1] = (long)in_stack_00000018;
  *param_1 = uStack0000000000000010;
  param_1[3] = uStack0000000000000028;
  param_1[2] = in_stack_00000020;
  param_1[5] = in_stack_00000038;
  param_1[4] = in_stack_00000030;
  uStack0000000000000008 = 0;
  plStack0000000000000000 = param_1;
  do {
    func_0x0043148c(&uStack0000000000000010);
    plVar2 = in_stack_00000018;
    if ((int)uStack0000000000000010 != 1) {
      lVar3 = *plStack0000000000000000;
      *plStack0000000000000000 = lVar3 + -1;
      LORelease();
      if (lVar3 == 1) {
        DataMemoryBarrier(2,1);
        func_0x004037b4();
      }
      iVar5 = _unlinkat();
      if (iVar5 == -1) {
        puVar7 = (uint *)___error();
        uVar1 = *puVar7;
        cVar4 = func_0x004307b8();
        uVar6 = 0;
        if (cVar4 != '\0') {
          uVar6 = (ulong)uVar1 << 0x20 | 2;
        }
      }
      else {
        uVar6 = 0;
      }
      return uVar6;
    }
    uVar6 = in_stack_00000020;
    if (in_stack_00000018 == (long *)0x0) goto LAB_00432c80;
    _memcpy(auStack_7ffffffe + 0x80000446,&uStack0000000000000028,0x410);
    if (in_stack_00000454 == '\x04') {
      uVar6 = func_0x00432a78(1);
LAB_00432bf8:
      if ((uVar6 != 0) && ((uVar6 & 0xffffffff00000003) != 0x200000002)) {
LAB_00432c60:
        lVar3 = *plVar2;
        *plVar2 = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          DataMemoryBarrier(2,1);
          func_0x004037b4(auStack_7ffffffe + 0x80000436);
        }
LAB_00432c80:
        lVar3 = *plStack0000000000000000;
        *plStack0000000000000000 = lVar3 + -1;
        LORelease();
        if (lVar3 == 1) {
          DataMemoryBarrier(2,1);
          func_0x004037b4();
          return uVar6;
        }
        return uVar6;
      }
    }
    else {
      if (in_stack_00000454 == '\0') {
        uVar6 = func_0x00432a78(1);
        goto LAB_00432bf8;
      }
      iVar5 = _unlinkat();
      if (iVar5 == -1) {
        puVar7 = (uint *)___error();
        uVar6 = (ulong)*puVar7 << 0x20 | 2;
        if (uVar6 == 0x200000002) goto LAB_00432c28;
        goto LAB_00432c60;
      }
    }
LAB_00432c28:
    lVar3 = *plVar2;
    *plVar2 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      DataMemoryBarrier(2,1);
      func_0x004037b4(auStack_7ffffffe + 0x80000436);
    }
  } while( true );
}

