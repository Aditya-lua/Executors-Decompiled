
void FUN_006c1594(long param_1)

{
  ulong *puVar1;
  byte bVar2;
  ulong uVar3;
  ulong *puVar4;
  char cVar5;
  byte in_w9;
  long in_x10;
  long in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong uVar6;
  ulong uVar7;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined1 unaff_w21;
  undefined4 unaff_w22;
  ulong unaff_x23;
  
LAB_006c1598:
  do {
    uVar6 = *(ulong *)(param_1 + in_x10 * 8);
    if (uVar6 != in_x12) {
      uVar7 = 0;
      uVar3 = uVar6 >> 4 ^ uVar6 >> 9;
      do {
        uVar3 = uVar3 & unaff_x19[0x12] - 1;
        puVar4 = (ulong *)(unaff_x19[0x11] + uVar3 * 0x18);
        if (*puVar4 == uVar6) goto LAB_006c15e8;
        if (*puVar4 == in_x12) break;
        uVar7 = uVar7 + 1;
        uVar3 = uVar7 + uVar3;
      } while (uVar7 <= unaff_x19[0x12] - 1);
    }
    puVar4 = (ulong *)0x0;
LAB_006c15e8:
    puVar1 = (ulong *)0x0;
    if (puVar4 != (ulong *)0x0) {
      puVar1 = puVar4 + 1;
    }
    if (*(byte *)((long)puVar1 + 2) != 0) {
      bVar2 = (byte)*puVar1;
      if (in_w9 <= (byte)*puVar1) {
        bVar2 = in_w9;
      }
      in_w9 = bVar2;
      in_x10 = in_x10 + 1;
      in_x13 = 1;
      if (in_x10 == in_x11) goto LAB_006c1634;
      goto LAB_006c1598;
    }
    in_x10 = in_x10 + 1;
    if (in_x10 == in_x11) {
      if ((in_x13 & 1) != 0) {
LAB_006c1634:
        func_0x006b1ccc(*unaff_x19,0xb,in_w9,0,0);
      }
      if ((unaff_x23 & 1) == 0) {
        cVar5 = *(char *)(unaff_x20 + 0x28) + '\x01';
      }
      else {
        cVar5 = '\0';
      }
      func_0x006b1ccc(*unaff_x19,0x16,unaff_w21,cVar5,0);
      *(undefined4 *)((long)unaff_x19 + 0x484) = unaff_w22;
      return;
    }
  } while( true );
}

