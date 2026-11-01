
void FUN_00077754(long param_1,long *param_2)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  long lVar4;
  long unaff_x21;
  long lVar5;
  
code_r0x00077754:
  do {
    (**(code **)(*param_2 + param_1 * 8))();
    lVar4 = unaff_x21;
    do {
      plVar1 = *(long **)(lVar4 + -0x28);
      *(undefined8 *)(lVar4 + -0x28) = 0;
      if (plVar1 != (long *)0x0) {
        (**(code **)(*plVar1 + 8))();
      }
      unaff_x21 = lVar4 + -0x28;
      if (unaff_x21 == unaff_x20) {
        *(long *)(unaff_x19 + 0x198) = unaff_x20;
        __ZdlPv(*(undefined8 *)(unaff_x19 + 400));
        lVar4 = *(long *)(unaff_x19 + 0x178);
        if (lVar4 == 0) goto code_r0x00077808;
        lVar5 = *(long *)(unaff_x19 + 0x180);
        lVar3 = lVar4;
        if (lVar5 != lVar4) goto code_r0x000777b0;
        goto code_r0x00077800;
      }
      param_2 = (long *)(lVar4 + -0x48);
      plVar1 = *(long **)(lVar4 + -0x30);
      if (param_2 == plVar1) {
        param_1 = 4;
        goto code_r0x00077754;
      }
      lVar4 = unaff_x21;
    } while (plVar1 == (long *)0x0);
    param_1 = 5;
    param_2 = plVar1;
  } while( true );
  while( true ) {
    plVar1 = *(long **)(lVar5 + -0x28);
    *(undefined8 *)(lVar5 + -0x28) = 0;
    if (plVar1 != (long *)0x0) {
      (**(code **)(*plVar1 + 8))();
    }
    lVar5 = lVar5 + -0x28;
    if (lVar5 == lVar4) break;
code_r0x000777b0:
    plVar1 = (long *)(lVar5 + -0x20);
    plVar2 = *(long **)(lVar5 + -8);
    if (plVar1 == plVar2) {
      lVar3 = 4;
code_r0x000777d4:
      (**(code **)(*plVar1 + lVar3 * 8))();
    }
    else if (plVar2 != (long *)0x0) {
      lVar3 = 5;
      plVar1 = plVar2;
      goto code_r0x000777d4;
    }
  }
  lVar3 = *(long *)(unaff_x19 + 0x178);
code_r0x00077800:
  *(long *)(unaff_x19 + 0x180) = lVar4;
  __ZdlPv(lVar3);
code_r0x00077808:
  lVar4 = *(long *)(unaff_x19 + 0x160);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x168);
    lVar3 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar1 = (long *)(lVar5 + -0x20);
        plVar2 = *(long **)(lVar5 + -8);
        if (plVar1 == plVar2) {
          lVar3 = 4;
code_r0x00077854:
          (**(code **)(*plVar1 + lVar3 * 8))();
        }
        else if (plVar2 != (long *)0x0) {
          lVar3 = 5;
          plVar1 = plVar2;
          goto code_r0x00077854;
        }
        plVar1 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar1 != (long *)0x0) {
          (**(code **)(*plVar1 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar3 = *(long *)(unaff_x19 + 0x160);
    }
    *(long *)(unaff_x19 + 0x168) = lVar4;
    __ZdlPv(lVar3);
  }
  lVar4 = *(long *)(unaff_x19 + 0x148);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x150);
    lVar3 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar1 = (long *)(lVar5 + -0x20);
        plVar2 = *(long **)(lVar5 + -8);
        if (plVar1 == plVar2) {
          lVar3 = 4;
code_r0x000778d4:
          (**(code **)(*plVar1 + lVar3 * 8))();
        }
        else if (plVar2 != (long *)0x0) {
          lVar3 = 5;
          plVar1 = plVar2;
          goto code_r0x000778d4;
        }
        plVar1 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar1 != (long *)0x0) {
          (**(code **)(*plVar1 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar3 = *(long *)(unaff_x19 + 0x148);
    }
    *(long *)(unaff_x19 + 0x150) = lVar4;
    __ZdlPv(lVar3);
  }
  lVar4 = *(long *)(unaff_x19 + 0x130);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x138);
    lVar3 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar1 = (long *)(lVar5 + -0x20);
        plVar2 = *(long **)(lVar5 + -8);
        if (plVar1 == plVar2) {
          lVar3 = 4;
code_r0x00077954:
          (**(code **)(*plVar1 + lVar3 * 8))();
        }
        else if (plVar2 != (long *)0x0) {
          lVar3 = 5;
          plVar1 = plVar2;
          goto code_r0x00077954;
        }
        plVar1 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar1 != (long *)0x0) {
          (**(code **)(*plVar1 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar3 = *(long *)(unaff_x19 + 0x130);
    }
    *(long *)(unaff_x19 + 0x138) = lVar4;
    __ZdlPv(lVar3);
  }
  lVar4 = *(long *)(unaff_x19 + 0x118);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x120);
    lVar3 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar1 = (long *)(lVar5 + -0x20);
        plVar2 = *(long **)(lVar5 + -8);
        if (plVar1 == plVar2) {
          lVar3 = 4;
code_r0x000779d4:
          (**(code **)(*plVar1 + lVar3 * 8))();
        }
        else if (plVar2 != (long *)0x0) {
          lVar3 = 5;
          plVar1 = plVar2;
          goto code_r0x000779d4;
        }
        plVar1 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar1 != (long *)0x0) {
          (**(code **)(*plVar1 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar3 = *(long *)(unaff_x19 + 0x118);
    }
    *(long *)(unaff_x19 + 0x120) = lVar4;
    __ZdlPv(lVar3);
  }
  lVar4 = *(long *)(unaff_x19 + 0x100);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0x108);
    lVar3 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar1 = (long *)(lVar5 + -0x20);
        plVar2 = *(long **)(lVar5 + -8);
        if (plVar1 == plVar2) {
          lVar3 = 4;
FUN_00077a54:
          (**(code **)(*plVar1 + lVar3 * 8))();
        }
        else if (plVar2 != (long *)0x0) {
          lVar3 = 5;
          plVar1 = plVar2;
          goto FUN_00077a54;
        }
        plVar1 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar1 != (long *)0x0) {
          (**(code **)(*plVar1 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar3 = *(long *)(unaff_x19 + 0x100);
    }
    *(long *)(unaff_x19 + 0x108) = lVar4;
    __ZdlPv(lVar3);
  }
  lVar4 = *(long *)(unaff_x19 + 0xe8);
  if (lVar4 != 0) {
    lVar5 = *(long *)(unaff_x19 + 0xf0);
    lVar3 = lVar4;
    if (lVar5 != lVar4) {
      do {
        plVar1 = (long *)(lVar5 + -0x20);
        plVar2 = *(long **)(lVar5 + -8);
        if (plVar1 == plVar2) {
          lVar3 = 4;
code_r0x00077ad4:
          (**(code **)(*plVar1 + lVar3 * 8))();
        }
        else if (plVar2 != (long *)0x0) {
          lVar3 = 5;
          plVar1 = plVar2;
          goto code_r0x00077ad4;
        }
        plVar1 = *(long **)(lVar5 + -0x28);
        *(undefined8 *)(lVar5 + -0x28) = 0;
        if (plVar1 != (long *)0x0) {
          (**(code **)(*plVar1 + 8))();
        }
        lVar5 = lVar5 + -0x28;
      } while (lVar5 != lVar4);
      lVar3 = *(long *)(unaff_x19 + 0xe8);
    }
    *(long *)(unaff_x19 + 0xf0) = lVar4;
    __ZdlPv(lVar3);
  }
  plVar1 = (long *)(unaff_x19 + 200);
  plVar2 = *(long **)(unaff_x19 + 0xe0);
  if (plVar2 == plVar1) {
    lVar4 = 4;
code_r0x00077b2c:
    (**(code **)(*plVar1 + lVar4 * 8))();
  }
  else if (plVar2 != (long *)0x0) {
    lVar4 = 5;
    plVar1 = plVar2;
    goto code_r0x00077b2c;
  }
  if (*(char *)(unaff_x19 + 199) < '\0') {
    __ZdlPv(*(undefined8 *)(unaff_x19 + 0xb0));
    func_0x00056a34(unaff_x19 + 0x98,*(undefined8 *)(unaff_x19 + 0xa0));
    lVar4 = *(long *)(unaff_x19 + 0x80);
    if (lVar4 != 0) goto code_r0x00077b8c;
code_r0x00077b54:
    plVar1 = *(long **)(unaff_x19 + 0x20);
    if (plVar1 == (long *)(unaff_x19 + 8)) {
code_r0x00077bcc:
      plVar1 = (long *)(unaff_x19 + 8);
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
    lVar3 = lVar4;
    if (lVar5 != lVar4) {
      do {
        lVar5 = lVar5 + -0x58;
        func_0x0005a1d4(lVar5);
      } while (lVar5 != lVar4);
      lVar3 = *(long *)(unaff_x19 + 0x80);
    }
    *(long *)(unaff_x19 + 0x88) = lVar4;
    __ZdlPv(lVar3);
    plVar1 = *(long **)(unaff_x19 + 0x20);
    if (plVar1 == (long *)(unaff_x19 + 8)) goto code_r0x00077bcc;
  }
  if (plVar1 == (long *)0x0) {
    return;
  }
  lVar4 = 5;
code_r0x00077bd4:
  (**(code **)(*plVar1 + lVar4 * 8))();
  return;
}

