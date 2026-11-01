
void FUN_005d61b0(long param_1,undefined8 param_2,undefined1 param_3 [16],undefined8 param_4,
                 undefined8 param_5,undefined *param_6)

{
  ulong uVar1;
  ulong uVar2;
  ulong in_x9;
  long in_x10;
  long in_x11;
  ulong in_x12;
  char *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long lVar3;
  long unaff_x24;
  char in_wzr;
  byte bVar4;
  char cVar5;
  char cVar6;
  char cVar7;
  char cVar8;
  char cVar9;
  char cVar10;
  char cVar11;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000060;
  
  while( true ) {
    cVar5 = (char)((ulong)param_4 >> 8);
    cVar6 = (char)((ulong)param_4 >> 0x10);
    cVar7 = (char)((ulong)param_4 >> 0x18);
    cVar8 = (char)((ulong)param_4 >> 0x20);
    cVar9 = (char)((ulong)param_4 >> 0x28);
    cVar10 = (char)((ulong)param_4 >> 0x30);
    cVar11 = (char)((ulong)param_4 >> 0x38);
    for (uVar1 = CONCAT17(-(cVar11 == (char)((ulong)param_2 >> 0x38)),
                          CONCAT16(-(cVar10 == (char)((ulong)param_2 >> 0x30)),
                                   CONCAT15(-(cVar9 == (char)((ulong)param_2 >> 0x28)),
                                            CONCAT14(-(cVar8 == (char)((ulong)param_2 >> 0x20)),
                                                     CONCAT13(-(cVar7 == (char)((ulong)param_2 >>
                                                                               0x18)),
                                                              CONCAT12(-(cVar6 == (char)((ulong)
                                                  param_2 >> 0x10)),
                                                  CONCAT11(-(cVar5 == (char)((ulong)param_2 >> 8)),
                                                           -((char)param_4 == (char)param_2))))))))
                 & 0x8080808080808080; uVar1 != 0; uVar1 = uVar1 - 1 & uVar1) {
      uVar2 = (uVar1 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar1 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
      if (unaff_x24 ==
          *(long *)(in_x11 + (in_x12 + ((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3) & in_x9)
                             * -8)) {
        func_0x007af5a0(&uStack0000000000000030);
        param_6 = &UNK_008b60c1;
        lVar3 = 3;
        unaff_x20 = (long)in_stack_00000040;
        unaff_x22 = in_stack_00000038;
        goto code_r0x005d6200;
      }
    }
    bVar4 = NEON_umaxv(CONCAT17(-(cVar11 == param_3[7]),
                                CONCAT16(-(cVar10 == param_3[6]),
                                         CONCAT15(-(cVar9 == param_3[5]),
                                                  CONCAT14(-(cVar8 == param_3[4]),
                                                           CONCAT13(-(cVar7 == param_3[3]),
                                                                    CONCAT12(-(cVar6 == param_3[2]),
                                                                             CONCAT11(-(cVar5 == 
                                                  param_3[1]),-((char)param_4 == param_3[0])))))))),
                       1);
    if ((bVar4 & 1) != 0) break;
    param_1 = param_1 + 8;
    in_x12 = in_x12 + param_1 & in_x9;
    param_4 = *(undefined8 *)(in_x10 + in_x12);
  }
  lVar3 = 0;
code_r0x005d6200:
  _memcpy(unaff_x22 + unaff_x20,param_6,lVar3);
  in_stack_00000010 = unaff_x20 + lVar3;
  in_stack_00000008 = in_stack_00000038;
  in_stack_00000000 = (long)uStack0000000000000030;
  uStack0000000000000030 = &UNK_008b60c8;
  in_stack_00000038 = 2;
  in_stack_00000048 = 2;
  in_stack_00000050 = 0;
  in_stack_00000040 = &uStack0000000000000060;
  uStack0000000000000060 = (undefined1 *)register0x00000008;
  func_0x00459f08(&uStack0000000000000018,&uStack0000000000000030);
  lVar3 = *(long *)(unaff_x24 + 0x10);
  if ((lVar3 != -0x8000000000000000) && (lVar3 != 0)) {
    func_0x00187bd4(*(undefined8 *)(unaff_x24 + 0x18),lVar3,1);
  }
  *(undefined8 *)(unaff_x24 + 0x18) = in_stack_00000020;
  *(long *)(unaff_x24 + 0x10) = uStack0000000000000018;
  *(undefined8 *)(unaff_x24 + 0x20) = in_stack_00000028;
  *(long *)(unaff_x21 + 0x20) = *(long *)(unaff_x21 + 0x20) + 1;
  if (in_stack_00000000 != 0) {
    func_0x00187bd4(in_stack_00000008,in_stack_00000000,1);
  }
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  return;
}

