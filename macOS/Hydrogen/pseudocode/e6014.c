
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000e6014(void)

{
  char *pcVar1;
  bool bVar2;
  uint in_w8;
  char *pcVar3;
  char *unaff_x19;
  long lVar4;
  long unaff_x23;
  long unaff_x25;
  float in_s4;
  int iVar5;
  float fVar6;
  int iVar8;
  undefined8 uVar7;
  ulong uVar9;
  undefined1 in_q6 [16];
  float in_s17;
  float in_stack_00000000;
  undefined1 uStack0000000000000010;
  
  iVar5 = -(uint)(in_stack_00000000 < 0.0);
  iVar8 = -(uint)(in_s17 < 0.0);
  uVar9 = NEON_fmov(0x3f800000,4);
  uVar9 = uVar9 ^ (uVar9 ^ CONCAT44(in_s17,in_stack_00000000)) &
                  ~CONCAT44(-(uint)((float)(uVar9 >> 0x20) < in_s17),
                            -(uint)((float)uVar9 < in_stack_00000000));
  fVar6 = (float)CONCAT13((byte)(uVar9 >> 0x18) & ~(byte)((uint)iVar5 >> 0x18),
                          CONCAT12((byte)(uVar9 >> 0x10) & ~(byte)((uint)iVar5 >> 0x10),
                                   CONCAT11((byte)(uVar9 >> 8) & ~(byte)((uint)iVar5 >> 8),
                                            (byte)uVar9 & ~(byte)iVar5)));
  uVar7 = NEON_ushl(CONCAT44((int)(in_q6._4_4_ *
                                   (float)(CONCAT17((byte)(uVar9 >> 0x38) &
                                                    ~(byte)((uint)iVar8 >> 0x18),
                                                    CONCAT16((byte)(uVar9 >> 0x30) &
                                                             ~(byte)((uint)iVar8 >> 0x10),
                                                             CONCAT15((byte)(uVar9 >> 0x28) &
                                                                      ~(byte)((uint)iVar8 >> 8),
                                                                      CONCAT14((byte)(uVar9 >> 0x20)
                                                                               & ~(byte)iVar8,fVar6)
                                                                     ))) >> 0x20) + 0.5),
                             (int)(in_q6._0_4_ * fVar6 + 0.5)),_UNK_0080c190,4);
  func_0x000bcf14(in_w8 | (int)in_s4 << 8 | (uint)uVar7 | (uint)((ulong)uVar7 >> 0x20),1);
  if (unaff_x19 != (char *)0xffffffffffffffff) {
    pcVar3 = unaff_x19;
    do {
      if (*pcVar3 == '#') {
        if (pcVar3[1] == '#') break;
      }
      else if (*pcVar3 == '\0') break;
      pcVar1 = pcVar3 + 1;
      bVar2 = pcVar3 != (char *)0xfffffffffffffffe;
      pcVar3 = pcVar1;
    } while (bVar2);
    if (((int)pcVar3 != (int)unaff_x19) &&
       (lVar4 = *(long *)(unaff_x23 + 0x4c0),
       func_0x000bc610(*(undefined8 *)(*(long *)(lVar4 + 0x4000) + 0x2a8),&uStack0000000000000010,
                       unaff_x25 + 8), (&UNK_00005ff8)[lVar4] != '\0')) {
      func_0x000bc2c4(&uStack0000000000000010);
    }
  }
  return;
}

