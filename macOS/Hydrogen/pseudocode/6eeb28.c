
char FUN_006eeb28(code *param_1)

{
  char cVar1;
  short sVar2;
  int iVar3;
  undefined8 uVar4;
  code *pcVar5;
  long unaff_x19;
  undefined8 *puVar6;
  ulong uVar7;
  long unaff_x23;
  long unaff_x24;
  
  do {
    iVar3 = (*param_1)();
    if (iVar3 == 0) {
code_r0x006eeb34:
      sVar2 = *(short *)(unaff_x19 + 0x50) + -1;
      *(short *)(unaff_x19 + 0x52) = sVar2;
      *(short *)(unaff_x19 + 0x50) = sVar2;
      *(undefined1 *)(unaff_x19 + 5) = 0;
      if (iVar3 == 0) {
LAB_006eebf4:
        cVar1 = *(char *)(unaff_x19 + 3);
        if (cVar1 == '\0') {
          if (*(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) < *(ulong *)(unaff_x19 + 8)) {
            *(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) = *(ulong *)(unaff_x19 + 8);
            return '\0';
          }
          return '\0';
        }
      }
      else {
        *(char *)(unaff_x19 + 3) = (char)iVar3;
        puVar6 = *(undefined8 **)(unaff_x19 + 8);
        if (iVar3 - 2U < 2) {
          puVar6[1] = puVar6[-1];
          *puVar6 = puVar6[-2];
        }
        else if ((iVar3 == 5) || (iVar3 == 4)) {
          uVar4 = func_0x006f6ef8();
          *puVar6 = uVar4;
          *(undefined4 *)((long)puVar6 + 0xc) = 5;
        }
        *(undefined8 **)(unaff_x19 + 8) = puVar6 + 2;
        *(undefined8 **)(*(long *)(unaff_x19 + 0x20) + 0x10) = puVar6 + 2;
        cVar1 = *(char *)(unaff_x19 + 3);
      }
      return cVar1;
    }
    uVar7 = *(ulong *)(unaff_x19 + 0x20);
    while( true ) {
      if (uVar7 <= *(ulong *)(unaff_x19 + 0x40)) goto code_r0x006eeb34;
      if ((*(byte *)(uVar7 + 0x24) >> 1 & 1) != 0) break;
      uVar7 = uVar7 - 0x28;
    }
    if ((((*(char *)(unaff_x23 + 0x6b8) != '\0') &&
         (*(ushort *)(unaff_x19 + 0x52) <= *(ushort *)(unaff_x19 + 0x50))) &&
        (pcVar5 = *(code **)(*(long *)(unaff_x19 + 0x18) + 0x518), pcVar5 != (code *)0x0)) &&
       ((*pcVar5)(), *(char *)(unaff_x19 + 3) == '\x06')) {
      sVar2 = *(short *)(unaff_x19 + 0x50) + -1;
      *(short *)(unaff_x19 + 0x52) = sVar2;
      *(short *)(unaff_x19 + 0x50) = sVar2;
      *(undefined1 *)(unaff_x19 + 5) = 0;
      goto LAB_006eebf4;
    }
    *(char *)(unaff_x19 + 3) = (char)iVar3;
    param_1 = *(code **)(unaff_x24 + 0x1d8);
  } while( true );
}

