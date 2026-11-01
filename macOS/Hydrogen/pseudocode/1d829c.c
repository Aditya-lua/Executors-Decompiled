
void FUN_001d829c(uint *param_1,ulong *param_2)

{
  uint *puVar1;
  undefined8 *puVar2;
  undefined1 in_CY;
  bool bVar3;
  long in_x9;
  uint *in_x10;
  uint uVar4;
  ulong in_x11;
  uint in_w12;
  uint in_w13;
  ulong *puVar5;
  long lVar6;
  
  do {
    uVar4 = (uint)in_x11;
    bVar3 = !(bool)in_CY;
    if (uVar4 != in_w13) {
      bVar3 = uVar4 < in_w13;
    }
    if (bVar3) {
      lVar6 = in_x9;
      do {
        puVar2 = (undefined8 *)((long)param_2 + lVar6);
        *puVar2 = puVar2[-1];
        lVar6 = lVar6 + -8;
        if (lVar6 == 0) {
          puVar5 = param_2;
          goto LAB_001d8278;
        }
        bVar3 = in_w12 < *(uint *)((long)puVar2 + -0xc);
        if (uVar4 != *(uint *)(puVar2 + -2)) {
          bVar3 = uVar4 < *(uint *)(puVar2 + -2);
        }
      } while (bVar3);
      puVar5 = (ulong *)((long)param_2 + lVar6);
LAB_001d8278:
      *puVar5 = in_x11 | (ulong)in_w12 << 0x20;
    }
    puVar1 = in_x10 + 2;
    in_x9 = in_x9 + 8;
    if (puVar1 == param_1) {
      return;
    }
    in_x11 = (ulong)*puVar1;
    in_w12 = in_x10[3];
    in_w13 = *in_x10;
    in_CY = in_x10[1] <= in_w12;
    in_x10 = puVar1;
  } while( true );
}

