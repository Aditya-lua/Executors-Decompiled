
void FUN_000777e8(long *param_1)

{
  long *plVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar5;
  
  while( true ) {
    if (param_1 != (long *)0x0) {
      (**(code **)(*param_1 + 8))();
    }
    if (unaff_x21 + -0x28 == unaff_x20) break;
    plVar3 = (long *)(unaff_x21 + -0x48);
    plVar1 = *(long **)(unaff_x21 + -0x30);
    if (plVar3 == plVar1) {
      lVar4 = 4;
code_r0x000777d4:
      (**(code **)(*plVar3 + lVar4 * 8))();
    }
    else if (plVar1 != (long *)0x0) {
      lVar4 = 5;
      plVar3 = plVar1;
      goto code_r0x000777d4;
    }
    param_1 = *(long **)(unaff_x21 + -0x50);
    *(undefined8 *)(unaff_x21 + -0x50) = 0;
    unaff_x21 = unaff_x21 + -0x28;
  }
  *(long *)(unaff_x19 + 0x180) = unaff_x20;
  __ZdlPv(*(undefined8 *)(unaff_x19 + 0x178));
  lVar4 = *(long *)(unaff_x19 + 0x160);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x168);
    lVar2 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar3 = (long *)(lVar5 + -0x20);
        plVar1 = *(long **)(lVar5 + -8);
        if (plVar3 == plVar1) {
          lVar2 = 4;
code_r0x00077854:
          (**(code **)(*plVar3 + lVar2 * 8))();
        }
        else if (plVar1 != (long *)0x0) {
          lVar2 = 5;
          plVar3 = plVar1;
          goto code_r0x00077854;
        }
        plVar3 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar3 != (long *)0x0) {
          (**(code **)(*plVar3 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar2 = *(long *)(unaff_x19 + 0x160);
    }
    *(long *)(unaff_x19 + 0x168) = lVar4;
    __ZdlPv(lVar2);
  }
  lVar4 = *(long *)(unaff_x19 + 0x148);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x150);
    lVar2 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar3 = (long *)(lVar5 + -0x20);
        plVar1 = *(long **)(lVar5 + -8);
        if (plVar3 == plVar1) {
          lVar2 = 4;
code_r0x000778d4:
          (**(code **)(*plVar3 + lVar2 * 8))();
        }
        else if (plVar1 != (long *)0x0) {
          lVar2 = 5;
          plVar3 = plVar1;
          goto code_r0x000778d4;
        }
        plVar3 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar3 != (long *)0x0) {
          (**(code **)(*plVar3 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar2 = *(long *)(unaff_x19 + 0x148);
    }
    *(long *)(unaff_x19 + 0x150) = lVar4;
    __ZdlPv(lVar2);
  }
  lVar4 = *(long *)(unaff_x19 + 0x130);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x138);
    lVar2 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar3 = (long *)(lVar5 + -0x20);
        plVar1 = *(long **)(lVar5 + -8);
        if (plVar3 == plVar1) {
          lVar2 = 4;
code_r0x00077954:
          (**(code **)(*plVar3 + lVar2 * 8))();
        }
        else if (plVar1 != (long *)0x0) {
          lVar2 = 5;
          plVar3 = plVar1;
          goto code_r0x00077954;
        }
        plVar3 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar3 != (long *)0x0) {
          (**(code **)(*plVar3 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar2 = *(long *)(unaff_x19 + 0x130);
    }
    *(long *)(unaff_x19 + 0x138) = lVar4;
    __ZdlPv(lVar2);
  }
  lVar4 = *(long *)(unaff_x19 + 0x118);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x120);
    lVar2 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar3 = (long *)(lVar5 + -0x20);
        plVar1 = *(long **)(lVar5 + -8);
        if (plVar3 == plVar1) {
          lVar2 = 4;
code_r0x000779d4:
          (**(code **)(*plVar3 + lVar2 * 8))();
        }
        else if (plVar1 != (long *)0x0) {
          lVar2 = 5;
          plVar3 = plVar1;
          goto code_r0x000779d4;
        }
        plVar3 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar3 != (long *)0x0) {
          (**(code **)(*plVar3 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar2 = *(long *)(unaff_x19 + 0x118);
    }
    *(long *)(unaff_x19 + 0x120) = lVar4;
    __ZdlPv(lVar2);
  }
  lVar4 = *(long *)(unaff_x19 + 0x100);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x108);
    lVar2 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar3 = (long *)(lVar5 + -0x20);
        plVar1 = *(long **)(lVar5 + -8);
        if (plVar3 == plVar1) {
          lVar2 = 4;
FUN_00077a54:
          (**(code **)(*plVar3 + lVar2 * 8))();
        }
        else if (plVar1 != (long *)0x0) {
          lVar2 = 5;
          plVar3 = plVar1;
          goto FUN_00077a54;
        }
        plVar3 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar3 != (long *)0x0) {
          (**(code **)(*plVar3 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar2 = *(long *)(unaff_x19 + 0x100);
    }
    *(long *)(unaff_x19 + 0x108) = lVar4;
    __ZdlPv(lVar2);
  }
  lVar4 = *(long *)(unaff_x19 + 0xe8);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0xf0);
    lVar2 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar3 = (long *)(lVar5 + -0x20);
        plVar1 = *(long **)(lVar5 + -8);
        if (plVar3 == plVar1) {
          lVar2 = 4;
code_r0x00077ad4:
          (**(code **)(*plVar3 + lVar2 * 8))();
        }
        else if (plVar1 != (long *)0x0) {
          lVar2 = 5;
          plVar3 = plVar1;
          goto code_r0x00077ad4;
        }
        plVar3 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar3 != (long *)0x0) {
          (**(code **)(*plVar3 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar2 = *(long *)(unaff_x19 + 0xe8);
    }
    *(long *)(unaff_x19 + 0xf0) = lVar4;
    __ZdlPv(lVar2);
  }
  plVar3 = (long *)(unaff_x19 + 200);
  plVar1 = *(long **)(unaff_x19 + 0xe0);
  if (plVar1 == plVar3) {
    lVar4 = 4;
code_r0x00077b2c:
    (**(code **)(*plVar3 + lVar4 * 8))();
  }
  else if (plVar1 != (long *)0x0) {
    lVar4 = 5;
    plVar3 = plVar1;
    goto code_r0x00077b2c;
  }
  if (*(char *)(unaff_x19 + 199) < '\0') {
    __ZdlPv(*(undefined8 *)(unaff_x19 + 0xb0));
    func_0x00056a34(unaff_x19 + 0x98,*(undefined8 *)(unaff_x19 + 0xa0));
    lVar4 = *(long *)(unaff_x19 + 0x80);
    if (lVar4 != 0) goto code_r0x00077b8c;
code_r0x00077b54:
    plVar3 = *(long **)(unaff_x19 + 0x20);
    if (plVar3 == (long *)(unaff_x19 + 8)) {
code_r0x00077bcc:
      plVar3 = (long *)(unaff_x19 + 8);
      lVar4 = 4;
      goto code_r0x00077bd4;
    }
  }
  else {
    func_0x00056a34(unaff_x19 + 0x98,*(undefined8 *)(unaff_x19 + 0xa0));
    lVar4 = *(long *)(unaff_x19 + 0x80);
    if (lVar4 == 0) goto code_r0x00077b54;
code_r0x00077b8c:
    lVar5 = *(long *)(unaff_x19 + 0x88);
    lVar2 = lVar4;
    if (lVar5 != lVar4) {
      do {
        lVar5 = lVar5 + -0x58;
        func_0x0005a1d4(lVar5);
      } while (lVar5 != lVar4);
      lVar2 = *(long *)(unaff_x19 + 0x80);
    }
    *(long *)(unaff_x19 + 0x88) = lVar4;
    __ZdlPv(lVar2);
    plVar3 = *(long **)(unaff_x19 + 0x20);
    if (plVar3 == (long *)(unaff_x19 + 8)) goto code_r0x00077bcc;
  }
  if (plVar3 == (long *)0x0) {
    return;
  }
  lVar4 = 5;
code_r0x00077bd4:
  (**(code **)(*plVar3 + lVar4 * 8))();
  return;
}

