
long FUN_006d03e4(long param_1)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  long lVar6;
  char *pcVar7;
  
  plVar2 = *(long **)(param_1 + 0x530);
  if (plVar2 != (long *)0x0) {
    plVar4 = *(long **)(param_1 + 0x538);
    plVar1 = plVar2;
    if (plVar4 != plVar2) {
      do {
        plVar4 = plVar4 + -1;
        lVar3 = *plVar4;
        *plVar4 = 0;
        if (lVar3 != 0) {
          __ZdaPv();
        }
      } while (plVar4 != plVar2);
      plVar1 = *(long **)(param_1 + 0x530);
    }
    *(long **)(param_1 + 0x538) = plVar2;
    __ZdlPv(plVar1);
  }
  if (*(long *)(param_1 + 0x518) != 0) {
    *(long *)(param_1 + 0x520) = *(long *)(param_1 + 0x518);
    __ZdlPv();
  }
  lVar3 = *(long *)(param_1 + 0x500);
  if (lVar3 != 0) {
    lVar5 = *(long *)(param_1 + 0x508);
    lVar6 = lVar3;
    if (lVar5 != lVar3) {
      do {
        if (*(long *)(lVar5 + -0x18) != 0) {
          *(long *)(lVar5 + -0x10) = *(long *)(lVar5 + -0x18);
          __ZdlPv();
        }
        lVar5 = lVar5 + -0x30;
      } while (lVar5 != lVar3);
      lVar6 = *(long *)(param_1 + 0x500);
    }
    *(long *)(param_1 + 0x508) = lVar3;
    __ZdlPv(lVar6);
  }
  if (*(long *)(param_1 + 0x4e8) != 0) {
    *(long *)(param_1 + 0x4f0) = *(long *)(param_1 + 0x4e8);
    __ZdlPv();
  }
  if (*(long *)(param_1 + 0x4d0) != 0) {
    *(long *)(param_1 + 0x4d8) = *(long *)(param_1 + 0x4d0);
    __ZdlPv();
  }
  if (*(long *)(param_1 + 0x4b8) != 0) {
    *(long *)(param_1 + 0x4c0) = *(long *)(param_1 + 0x4b8);
    __ZdlPv();
  }
  if (*(long *)(param_1 + 0x4a0) != 0) {
    *(long *)(param_1 + 0x4a8) = *(long *)(param_1 + 0x4a0);
    __ZdlPv();
  }
  if (*(long *)(param_1 + 0x218) != 0) {
    __ZdlPv();
    *(undefined8 *)(param_1 + 0x218) = 0;
    *(undefined8 *)(param_1 + 0x220) = 0;
  }
  if (*(long *)(param_1 + 0x1f0) != 0) {
    __ZdlPv();
    *(undefined8 *)(param_1 + 0x1f0) = 0;
    *(undefined8 *)(param_1 + 0x1f8) = 0;
  }
  lVar3 = *(long *)(param_1 + 0x1c8);
  if (lVar3 != 0) {
    lVar6 = *(long *)(param_1 + 0x1d0);
    if (lVar6 != 0) {
      pcVar7 = (char *)(lVar3 + 0x1f);
      do {
        if (*pcVar7 < '\0') {
          __ZdlPv(*(undefined8 *)(pcVar7 + -0x17));
        }
        pcVar7 = pcVar7 + 0x20;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
      lVar3 = *(long *)(param_1 + 0x1c8);
    }
    __ZdlPv(lVar3);
    *(long *)(param_1 + 0x1c8) = 0;
    *(undefined8 *)(param_1 + 0x1d0) = 0;
  }
  if (*(long *)(param_1 + 0x1a0) != 0) {
    __ZdlPv();
    *(undefined8 *)(param_1 + 0x1a0) = 0;
    *(undefined8 *)(param_1 + 0x1a8) = 0;
  }
  if (*(long *)(param_1 + 0x178) != 0) {
    __ZdlPv();
    *(undefined8 *)(param_1 + 0x178) = 0;
    *(undefined8 *)(param_1 + 0x180) = 0;
  }
  if (*(long *)(param_1 + 0x150) != 0) {
    __ZdlPv();
    *(undefined8 *)(param_1 + 0x150) = 0;
    *(undefined8 *)(param_1 + 0x158) = 0;
  }
  if (*(long *)(param_1 + 0x128) != 0) {
    __ZdlPv();
    *(undefined8 *)(param_1 + 0x128) = 0;
    *(undefined8 *)(param_1 + 0x130) = 0;
  }
  if (*(long *)(param_1 + 0x100) != 0) {
    __ZdlPv();
    *(undefined8 *)(param_1 + 0x100) = 0;
    *(undefined8 *)(param_1 + 0x108) = 0;
  }
  if (*(long *)(param_1 + 0xd8) != 0) {
    __ZdlPv();
    *(long *)(param_1 + 0xd8) = 0;
    *(undefined8 *)(param_1 + 0xe0) = 0;
  }
  if (*(long *)(param_1 + 0xb0) != 0) {
    __ZdlPv();
    *(long *)(param_1 + 0xb0) = 0;
    *(undefined8 *)(param_1 + 0xb8) = 0;
  }
  if (*(long *)(param_1 + 0x88) != 0) {
    __ZdlPv();
    *(long *)(param_1 + 0x88) = 0;
    *(undefined8 *)(param_1 + 0x90) = 0;
  }
  plVar2 = (long *)(param_1 + 0x60);
  lVar3 = *plVar2;
  if (lVar3 != 0) {
    lVar6 = *(long *)(param_1 + 0x68);
    if (lVar6 != 0) {
      plVar1 = (long *)(lVar3 + 0x18);
      do {
        if (plVar1[-1] != 0) {
          *plVar1 = plVar1[-1];
          __ZdlPv();
        }
        plVar1 = plVar1 + 7;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
      lVar3 = *plVar2;
    }
    __ZdlPv(lVar3);
    *plVar2 = 0;
    *(undefined8 *)(param_1 + 0x68) = 0;
  }
  return param_1;
}

