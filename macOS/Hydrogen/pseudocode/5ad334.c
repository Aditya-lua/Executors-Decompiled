
undefined8 FUN_005ad334(code *param_1)

{
  char *pcVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 *puVar4;
  char in_wzr;
  undefined1 auVar5 [16];
  
  uVar2 = (*param_1)();
  if (((uVar2 & 1) == 0) && (uVar2 = func_0x005ab01c(), (uVar2 & 1) == 0)) {
    auVar5 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                       (*(undefined8 *)*unaff_x19,&UNK_008aed88,4);
    if ((auVar5._0_8_ & 1) != 0) {
      return 1;
    }
    pcVar1 = (char *)(*(long *)(unaff_x20 + 0x40) + 8);
    if (*pcVar1 == '\0') {
      *pcVar1 = '\x01';
    }
    else {
      func_0x007aff64(pcVar1,auVar5._8_8_,1000000000);
    }
    unaff_x19[1] = unaff_x19[1] + 1;
    uVar2 = func_0x005a9a80();
    if ((uVar2 & 1) != 0) {
      if (*pcVar1 == '\x01') {
        *pcVar1 = in_wzr;
        return 1;
      }
      func_0x007b05dc(pcVar1,0);
      return 1;
    }
    unaff_x19[1] = unaff_x19[1] + -1;
    if (*pcVar1 == '\x01') {
      *pcVar1 = in_wzr;
    }
    else {
      func_0x007b05dc(pcVar1,0);
    }
    puVar4 = (undefined8 *)*unaff_x19;
    uVar2 = (**(code **)(puVar4[1] + 0x18))(*puVar4,&UNK_008aec7a,1);
    if ((uVar2 & 1) != 0) {
      return 1;
    }
    uVar2 = func_0x005a9610(*(undefined1 *)(unaff_x19 + 2),*(undefined1 *)((long)unaff_x19 + 0x11));
    if ((uVar2 & 1) == 0) {
      uVar3 = func_0x001ee828(*puVar4,puVar4[1]);
      return uVar3;
    }
  }
  return 1;
}

