
void FUN_004aa464(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,long param_5
                 )

{
  code *pcVar1;
  long lVar2;
  long in_x9;
  ulong in_x10;
  long in_x11;
  ulong in_x12;
  byte in_w13;
  ulong uVar3;
  char *unaff_x19;
  long unaff_x22;
  ulong uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long in_xzr;
  char cVar8;
  char cVar9;
  char cVar10;
  char cVar11;
  char cVar12;
  char cVar13;
  undefined8 uVar7;
  char cVar14;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  while ((in_w13 & 1) == 0) {
    param_1 = param_1 + 8;
    in_x12 = in_x12 + param_1 & in_x10;
    uVar7 = *(undefined8 *)(in_x9 + in_x12);
    cVar8 = (char)((ulong)uVar7 >> 8);
    cVar9 = (char)((ulong)uVar7 >> 0x10);
    cVar10 = (char)((ulong)uVar7 >> 0x18);
    cVar11 = (char)((ulong)uVar7 >> 0x20);
    cVar12 = (char)((ulong)uVar7 >> 0x28);
    cVar13 = (char)((ulong)uVar7 >> 0x30);
    cVar14 = (char)((ulong)uVar7 >> 0x38);
    for (uVar4 = CONCAT17(-(cVar14 == (char)((ulong)param_2 >> 0x38)),
                          CONCAT16(-(cVar13 == (char)((ulong)param_2 >> 0x30)),
                                   CONCAT15(-(cVar12 == (char)((ulong)param_2 >> 0x28)),
                                            CONCAT14(-(cVar11 == (char)((ulong)param_2 >> 0x20)),
                                                     CONCAT13(-(cVar10 ==
                                                               (char)((ulong)param_2 >> 0x18)),
                                                              CONCAT12(-(cVar9 == (char)((ulong)
                                                  param_2 >> 0x10)),
                                                  CONCAT11(-(cVar8 == (char)((ulong)param_2 >> 8)),
                                                           -((char)uVar7 == (char)param_2)))))))) &
                 0x8080808080808080; uVar4 != 0; uVar4 = uVar4 - 1 & uVar4) {
      uVar3 = (uVar4 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar4 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      uVar3 = in_x12 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) & in_x10;
      if (unaff_x22 == *(long *)(in_x11 + uVar3 * -0x20)) {
        lVar2 = in_x9 + uVar3 * -0x20;
        if (*unaff_x19 == '\0') {
          *unaff_x19 = '\x01';
        }
        else {
          func_0x007aff64();
        }
        func_0x00491fd4(&uStack0000000000000030,*(undefined8 *)(lVar2 + -8));
        cVar8 = (char)in_xzr;
        uVar4 = *(ulong *)(param_5 + 0x18);
        if (*(ulong *)(lVar2 + -8) <= *(ulong *)(param_5 + 0x18)) {
          uVar4 = *(ulong *)(lVar2 + -8);
        }
        if (uVar4 == 0) goto code_r0x004aa558;
        puVar5 = *(undefined8 **)(lVar2 + -0x10);
        puVar6 = (undefined8 *)(*(long *)(param_5 + 0x10) + 8);
        goto code_r0x004aa500;
      }
    }
    in_w13 = NEON_umaxv(CONCAT17(-(cVar14 == (char)((ulong)param_3 >> 0x38)),
                                 CONCAT16(-(cVar13 == (char)((ulong)param_3 >> 0x30)),
                                          CONCAT15(-(cVar12 == (char)((ulong)param_3 >> 0x28)),
                                                   CONCAT14(-(cVar11 ==
                                                             (char)((ulong)param_3 >> 0x20)),
                                                            CONCAT13(-(cVar10 ==
                                                                      (char)((ulong)param_3 >> 0x18)
                                                                      ),CONCAT12(-(cVar9 == (char)((
                                                  ulong)param_3 >> 0x10)),
                                                  CONCAT11(-(cVar8 == (char)((ulong)param_3 >> 8)),
                                                           -((char)uVar7 == (char)param_3)))))))),1)
    ;
  }
  func_0x007a23d8(&UNK_008a073d,0x16,&UNK_009e3c88);
code_r0x004aa5c0:
  func_0x007a05dc();
code_r0x004aa5cc:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4aa5d0);
  (*pcVar1)();
code_r0x004aa500:
  lVar2 = *(long *)*puVar5;
  *(long *)*puVar5 = lVar2 + 1;
  if (lVar2 < 0) goto code_r0x004aa5c0;
  uStack0000000000000030 = *puVar5;
  lVar2 = *(long *)*puVar6;
  *(long *)*puVar6 = lVar2 + 1;
  if (lVar2 < 0) {
    func_0x007a05dc();
    goto code_r0x004aa5cc;
  }
  uStack0000000000000028 = (long *)func_0x0049e294();
  if (uStack0000000000000028 != (long *)0x0) {
    lVar2 = *uStack0000000000000028;
    *uStack0000000000000028 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      in_xzr = *uStack0000000000000028;
      func_0x005d2ac4(&uStack0000000000000028);
    }
  }
  cVar8 = (char)in_xzr;
  puVar6 = puVar6 + 2;
  puVar5 = puVar5 + 1;
  uVar4 = uVar4 - 1;
  if (uVar4 == 0) {
code_r0x004aa558:
    func_0x00499fc8(unaff_x22 + 0x28);
    func_0x004b023c(unaff_x22 + 0x28);
    func_0x00491304();
    if (*unaff_x19 == '\x01') {
      *unaff_x19 = cVar8;
    }
    else {
      func_0x007b05dc();
    }
    return;
  }
  goto code_r0x004aa500;
}

