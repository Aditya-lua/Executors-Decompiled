
void FUN_006f6b80(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  int unaff_w19;
  long unaff_x21;
  long *unaff_x23;
  
  _bzero();
  uVar2 = *(uint *)((long)unaff_x23 + 0xc);
  if (0 < (int)uVar2) {
    uVar4 = 0;
    do {
      lVar3 = *(long *)(*unaff_x23 + uVar4 * 8);
      while (lVar3 != 0) {
        lVar5 = *(long *)(lVar3 + 8);
        uVar1 = *(int *)(lVar3 + 0x10) + (int)(int *)(lVar3 + 0x10) & unaff_w19 - 1U;
        uVar6 = -(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3;
        *(undefined8 *)(lVar3 + 8) = *(undefined8 *)(unaff_x21 + uVar6);
        *(long *)(unaff_x21 + uVar6) = lVar3;
        lVar3 = lVar5;
      }
      uVar4 = uVar4 + 1;
    } while (uVar4 != uVar2);
  }
  func_0x006f3a2c();
  *(int *)((long)unaff_x23 + 0xc) = unaff_w19;
  *unaff_x23 = unaff_x21;
  return;
}

