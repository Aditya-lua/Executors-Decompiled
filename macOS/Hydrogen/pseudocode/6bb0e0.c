
int * FUN_006bb0e0(int *param_1)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  long lVar6;
  int *in_x9;
  int *in_x10;
  ulong in_x11;
  int in_w12;
  long unaff_x19;
  int *unaff_x20;
  int *piVar7;
  int *unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  int *unaff_x25;
  undefined8 uVar8;
  undefined8 uVar9;
  
code_r0x006bb0e0:
  uVar2 = *(ulong *)(param_1 + 4);
  piVar7 = *(int **)(param_1 + 2);
  if (-1 < in_w12) {
    uVar2 = in_x11;
    piVar7 = param_1 + 2;
  }
  uVar3 = *(ulong *)(in_x9 + 2);
  if (-1 < (char)*(byte *)((long)in_x9 + 0x17)) {
    uVar3 = (ulong)*(byte *)((long)in_x9 + 0x17);
    in_x10 = in_x9;
  }
  uVar4 = uVar3;
  if (uVar2 <= uVar3) {
    uVar4 = uVar2;
  }
  iVar5 = _memcmp(piVar7,in_x10,uVar4);
  piVar7 = unaff_x21;
  if (iVar5 == 0) {
    if (uVar3 <= uVar2) goto LAB_006bb05c;
  }
  else if (-1 < iVar5) goto LAB_006bb05c;
  do {
    unaff_x23 = unaff_x24;
    unaff_x20 = unaff_x25;
    piVar7 = unaff_x21;
LAB_006bb05c:
    do {
      do {
        unaff_x21 = unaff_x20;
        *piVar7 = *unaff_x21;
        if (*(char *)((long)piVar7 + 0x1f) < '\0') {
          __ZdlPv(*(undefined8 *)(piVar7 + 2));
        }
        uVar9 = *(undefined8 *)(unaff_x21 + 4);
        uVar8 = *(undefined8 *)(unaff_x21 + 2);
        *(undefined8 *)(piVar7 + 6) = *(undefined8 *)(unaff_x21 + 6);
        *(undefined8 *)(piVar7 + 4) = uVar9;
        *(undefined8 *)(piVar7 + 2) = uVar8;
        *(undefined1 *)((long)unaff_x21 + 0x1f) = 0;
        *(undefined1 *)(unaff_x21 + 2) = 0;
        if (unaff_x22 < (long)unaff_x23) {
          return unaff_x21;
        }
        lVar1 = unaff_x23 + 1;
        unaff_x20 = unaff_x21 + lVar1 * 8;
        lVar6 = unaff_x23 * 2;
        unaff_x23 = unaff_x23 << 1 | 1;
        unaff_x24 = lVar6 + 2;
        piVar7 = unaff_x21;
      } while (unaff_x19 <= (long)unaff_x24);
      unaff_x25 = unaff_x20 + 8;
      if (*unaff_x20 == *unaff_x25) {
        param_1 = unaff_x21 + lVar1 * 8;
        in_x9 = unaff_x20 + 10;
        in_x10 = *(int **)in_x9;
        in_x11 = (ulong)*(byte *)((long)unaff_x20 + 0x1f);
        in_w12 = (int)(char)*(byte *)((long)unaff_x20 + 0x1f);
        goto code_r0x006bb0e0;
      }
    } while (*unaff_x25 <= *unaff_x20);
  } while( true );
}

