
void FUN_000f30dc(void)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  int in_w8;
  int *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  int unaff_w23;
  int unaff_w25;
  uint unaff_w26;
  float fVar4;
  float fVar5;
  float fVar6;
  float unaff_s8;
  float unaff_s9;
  undefined8 unaff_d10;
  undefined8 unaff_d11;
  undefined8 in_stack_00000000;
  
  do {
    iVar1 = in_w8;
    if (in_w8 < 0) {
      iVar1 = in_w8 + 1;
    }
    uVar2 = unaff_w26;
    if (in_w8 != 0) {
      uVar2 = in_w8 + (iVar1 >> 1);
    }
    if ((int)uVar2 <= (int)(in_w8 + 1U)) {
      uVar2 = in_w8 + 1U;
    }
    lVar3 = func_0x000b810c(-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3);
    if (*(long *)(unaff_x21 + 0x80) != 0) {
      _memcpy(lVar3,*(long *)(unaff_x21 + 0x80),(long)*(int *)(unaff_x21 + 0x78) << 3);
      func_0x000b83d4(*(undefined8 *)(unaff_x21 + 0x80));
    }
    *(long *)(unaff_x21 + 0x80) = lVar3;
    *(uint *)(unaff_x21 + 0x7c) = uVar2;
    in_w8 = *(int *)(unaff_x21 + 0x78);
    while( true ) {
      fVar6 = unaff_s9 * (float)(unaff_w25 + 1);
      fVar4 = unaff_s8 - fVar6;
      fVar5 = fVar6 * (fVar4 + fVar4);
      *(ulong *)(lVar3 + (long)in_w8 * 8) =
           CONCAT44((float)((ulong)unaff_d11 >> 0x20) * fVar5 +
                    (float)((ulong)in_stack_00000000 >> 0x20) * fVar4 * fVar4 +
                    (float)((ulong)unaff_d10 >> 0x20) * fVar6 * fVar6,
                    (float)unaff_d11 * fVar5 + (float)in_stack_00000000 * fVar4 * fVar4 +
                    (float)unaff_d10 * fVar6 * fVar6);
      in_w8 = *unaff_x19 + 1;
      *unaff_x19 = in_w8;
      unaff_w25 = unaff_w25 + 1;
      if (unaff_w23 == unaff_w25) {
        return;
      }
      unaff_d11 = *unaff_x22;
      unaff_d10 = *unaff_x20;
      if (in_w8 == *(int *)(unaff_x21 + 0x7c)) break;
      lVar3 = *(long *)(unaff_x21 + 0x80);
    }
  } while( true );
}

