
/* WARNING: Removing unreachable block (ram,0x0014a384) */

void FUN_0014a34c(long param_1)

{
  long lVar1;
  long in_x9;
  long in_x10;
  long in_x11;
  long *unaff_x19;
  long unaff_x20;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  for (; in_x11 != in_x10; in_x11 = in_x11 + -0x20) {
    uVar4 = *(undefined8 *)(in_x11 + -0x18);
    uVar3 = *(undefined8 *)(in_x11 + -0x20);
    *(undefined8 *)(in_x9 + -0x10) = *(undefined8 *)(in_x11 + -0x10);
    *(undefined8 *)(in_x9 + -0x18) = uVar4;
    *(undefined8 *)(in_x9 + -0x20) = uVar3;
    *(undefined8 *)(in_x11 + -0x18) = 0;
    *(undefined8 *)(in_x11 + -0x10) = 0;
    *(undefined8 *)(in_x11 + -0x20) = 0;
    *(undefined4 *)(in_x9 + -8) = *(undefined4 *)(in_x11 + -8);
    in_x9 = in_x9 + -0x20;
  }
  lVar1 = *unaff_x19;
  lVar2 = unaff_x19[1];
  *unaff_x19 = in_x9;
  unaff_x19[1] = unaff_x20;
  unaff_x19[2] = param_1;
  if (lVar2 != lVar1) {
    do {
      lVar2 = lVar2 + -0x20;
    } while (lVar2 != lVar1);
    lVar2 = lVar1;
  }
  if (lVar2 != 0) {
    __ZdlPv(lVar2);
  }
  return;
}

