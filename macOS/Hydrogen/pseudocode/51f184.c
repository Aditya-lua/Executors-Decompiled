
ulong FUN_0051f184(long param_1,long param_2,undefined8 param_3,ulong param_4)

{
  int iVar1;
  int *piVar2;
  undefined1 in_ZR;
  undefined1 in_CY;
  ulong uVar3;
  ulong uVar4;
  long in_x9;
  ulong *puVar5;
  int *in_x10;
  long in_x11;
  ulong in_x12;
  
code_r0x0051f184:
  uVar4 = in_x12;
  if (!(bool)in_CY || (bool)in_ZR) {
    uVar4 = param_4;
  }
  if (in_x10[8] != 2) goto LAB_0051f100;
code_r0x0051f194:
  uVar3 = *(ulong *)(in_x10 + 10);
  if (*(ulong *)(in_x10 + 10) <= uVar4) {
    uVar3 = uVar4;
  }
  uVar4 = uVar3;
  if (in_x10[0x10] != 2) goto LAB_0051f10c;
code_r0x0051f1ac:
  uVar3 = *(ulong *)(in_x10 + 0x12);
  if (*(ulong *)(in_x10 + 0x12) <= uVar4) {
    uVar3 = uVar4;
  }
  iVar1 = in_x10[0x18];
  uVar4 = uVar3;
  piVar2 = in_x10;
  do {
    uVar3 = uVar4;
    if ((iVar1 == 2) && (uVar3 = *(ulong *)(piVar2 + 0x1a), *(ulong *)(piVar2 + 0x1a) <= uVar4)) {
      uVar3 = uVar4;
    }
    in_x10 = piVar2 + 0x40;
    in_x9 = in_x9 + -8;
    if (in_x11 == in_x9) {
      if (param_1 != 0) {
        puVar5 = (ulong *)(param_2 + in_x9 * -0x20 + 8);
        uVar4 = uVar3;
        do {
          uVar3 = uVar4;
          if (((int)puVar5[-1] == 2) && (uVar3 = *puVar5, *puVar5 <= uVar4)) {
            uVar3 = uVar4;
          }
          puVar5 = puVar5 + 4;
          param_1 = param_1 + -1;
          uVar4 = uVar3;
        } while (param_1 != 0);
      }
      return uVar3;
    }
    if (piVar2[0x20] == 2) {
      uVar4 = *(ulong *)(piVar2 + 0x22);
      if (*(ulong *)(piVar2 + 0x22) <= uVar3) {
        uVar4 = uVar3;
      }
      uVar3 = uVar4;
      if (piVar2[0x28] == 2) goto code_r0x0051f134;
code_r0x0051f0d0:
      uVar4 = uVar3;
      if (piVar2[0x30] != 2) goto code_r0x0051f0dc;
code_r0x0051f14c:
      uVar4 = *(ulong *)(piVar2 + 0x32);
      if (*(ulong *)(piVar2 + 0x32) <= uVar3) {
        uVar4 = uVar3;
      }
      if (piVar2[0x38] == 2) goto code_r0x0051f164;
code_r0x0051f0e8:
      iVar1 = *in_x10;
    }
    else {
      uVar4 = uVar3;
      if (piVar2[0x28] != 2) goto code_r0x0051f0d0;
code_r0x0051f134:
      uVar3 = *(ulong *)(piVar2 + 0x2a);
      if (*(ulong *)(piVar2 + 0x2a) <= uVar4) {
        uVar3 = uVar4;
      }
      uVar4 = uVar3;
      if (piVar2[0x30] == 2) goto code_r0x0051f14c;
code_r0x0051f0dc:
      if (piVar2[0x38] != 2) goto code_r0x0051f0e8;
code_r0x0051f164:
      uVar3 = *(ulong *)(piVar2 + 0x3a);
      if (*(ulong *)(piVar2 + 0x3a) <= uVar4) {
        uVar3 = uVar4;
      }
      iVar1 = *in_x10;
      uVar4 = uVar3;
    }
    if (iVar1 == 2) {
      in_x12 = *(ulong *)(piVar2 + 0x42);
      in_CY = uVar4 <= in_x12;
      in_ZR = in_x12 == uVar4;
      param_4 = uVar4;
      goto code_r0x0051f184;
    }
    if (piVar2[0x48] == 2) goto code_r0x0051f194;
LAB_0051f100:
    if (in_x10[0x10] == 2) goto code_r0x0051f1ac;
LAB_0051f10c:
    iVar1 = in_x10[0x18];
    piVar2 = in_x10;
  } while( true );
}

