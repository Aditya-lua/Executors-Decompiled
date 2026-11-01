
undefined8
FUN_0072f6cc(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,uint *param_5)

{
  long lVar1;
  uint *puVar2;
  undefined8 uVar3;
  long lVar4;
  long *plVar5;
  long in_x9;
  undefined1 auVar6 [16];
  long *plStack_48;
  
  if (**(long **)(in_x9 + 0x1e8) == param_1) {
    return param_2;
  }
  auVar6 = ___stack_chk_fail();
  lVar4 = auVar6._8_8_;
  lVar1 = auVar6._0_8_;
  plStack_48 = (long *)0x0;
  func_0x00730b8c();
  puVar2 = (uint *)(*pcRam0000000000a2b608)(1,0x138);
  if (puVar2 == (uint *)0x0) {
    plVar5 = (long *)0x0;
    uVar3 = 0x1b;
  }
  else {
    *puVar2 = (uint)*(byte *)(lVar4 + 0x52a);
    puVar2[0x26] = *param_5;
    *(byte *)(puVar2 + 0x4d) = (byte)puVar2[0x4d] & 0xfb | 2;
    uVar3 = func_0x00730fe0(&plStack_48,0xa2b3e0,puVar2);
    if ((int)uVar3 == 0) {
      func_0x00731058(lVar1,lVar4,param_4);
      auVar6 = func_0x00782d28();
      *(undefined1 (*) [16])(puVar2 + 0x40) = auVar6;
      *(uint *)(lVar4 + (long)(int)param_4 * 4 + 0x238) = puVar2[0x26];
      func_0x0072fadc(plStack_48[2],lVar1);
      if ((lVar1 != 0) && (*(char *)(lVar1 + 0xa1d) < '\0')) {
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     lVar1 + 0x18) == 0) {
          if (plStack_48 == (long *)0x0) {
            return 0;
          }
        }
        else {
          if (*(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + lVar1 + 0x18) + 8) < 1) {
            return 0;
          }
          if (plStack_48 == (long *)0x0) {
            return 0;
          }
        }
        if (0 < *(int *)(*plStack_48 + 0xc)) {
          func_0x0073cbdc(lVar1,plStack_48,"set filter for listen socket fd=%d ip=%s:%d");
        }
      }
      return 0;
    }
    plVar5 = plStack_48;
  }
  (*pcRam0000000000a2b5f0)(plVar5);
  plStack_48 = (long *)0x0;
  (*pcRam0000000000a2b5f0)(puVar2);
  return uVar3;
}

