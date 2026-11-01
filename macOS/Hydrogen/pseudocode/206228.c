
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00206228(void)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  undefined8 *unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long lVar4;
  undefined8 uVar5;
  ulong unaff_x24;
  long unaff_x25;
  undefined8 uVar6;
  ulong unaff_x26;
  ulong unaff_x27;
  ulong uVar7;
  byte bVar8;
  undefined8 unaff_d8;
  undefined8 unaff_d9;
  long in_stack_00000008;
  long in_stack_00000010;
  
  do {
    unaff_x26 = unaff_x26 - 1 & unaff_x26;
    if (unaff_x26 == 0) {
      do {
        bVar8 = NEON_umaxv(CONCAT17(-((char)((ulong)unaff_d9 >> 0x38) == -1),
                                    CONCAT16(-((char)((ulong)unaff_d9 >> 0x30) == -1),
                                             CONCAT15(-((char)((ulong)unaff_d9 >> 0x28) == -1),
                                                      CONCAT14(-((char)((ulong)unaff_d9 >> 0x20) ==
                                                                -1),CONCAT13(-((char)((ulong)
                                                  unaff_d9 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)unaff_d9 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)unaff_d9 >> 8)
                                                                     == -1),-((char)unaff_d9 == -1))
                                                          )))))),1);
        if ((bVar8 & 1) != 0) {
          *unaff_x20 = -0x8000000000000000;
          if ((unaff_x21 & 1) == 0) goto LAB_002062f8;
          goto LAB_00206304;
        }
        in_stack_00000010 = in_stack_00000010 + 8;
        unaff_x24 = unaff_x24 + in_stack_00000010 & unaff_x27;
        unaff_d9 = *(undefined8 *)(unaff_x25 + unaff_x24);
        unaff_x26 = CONCAT17(-((char)((ulong)unaff_d9 >> 0x38) == (char)((ulong)unaff_d8 >> 0x38)),
                             CONCAT16(-((char)((ulong)unaff_d9 >> 0x30) ==
                                       (char)((ulong)unaff_d8 >> 0x30)),
                                      CONCAT15(-((char)((ulong)unaff_d9 >> 0x28) ==
                                                (char)((ulong)unaff_d8 >> 0x28)),
                                               CONCAT14(-((char)((ulong)unaff_d9 >> 0x20) ==
                                                         (char)((ulong)unaff_d8 >> 0x20)),
                                                        CONCAT13(-((char)((ulong)unaff_d9 >> 0x18)
                                                                  == (char)((ulong)unaff_d8 >> 0x18)
                                                                  ),CONCAT12(-((char)((ulong)
                                                  unaff_d9 >> 0x10) ==
                                                  (char)((ulong)unaff_d8 >> 0x10)),
                                                  CONCAT11(-((char)((ulong)unaff_d9 >> 8) ==
                                                            (char)((ulong)unaff_d8 >> 8)),
                                                           -((char)unaff_d9 == (char)unaff_d8)))))))
                            ) & 0x8080808080808080;
      } while (unaff_x26 == 0);
    }
    uVar7 = (unaff_x26 & 0xaaaaaaaaaaaaaaaa) >> 1 | (unaff_x26 & 0x5555555555555555) << 1;
    uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
    uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
    uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
    uVar7 = unaff_x24 + ((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3) & unaff_x27;
  } while ((unaff_x22 != *(long *)(in_stack_00000008 + uVar7 * -0x30 + 0x10)) ||
          (iVar2 = _memcmp(), iVar2 != 0));
  lVar3 = unaff_x25 + uVar7 * -0x30;
  lVar4 = *(long *)(lVar3 + -8);
  if (lVar4 < 0) {
    uVar6 = 0;
code_r0x00206398:
    func_0x007a1f00(uVar6,lVar4,&UNK_009c24c0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x2063b0);
    (*pcVar1)();
  }
  uVar5 = *(undefined8 *)(lVar3 + -0x10);
  if (lVar4 == 0) {
    lVar3 = 1;
  }
  else {
    uVar6 = 1;
    lVar3 = func_0x00187bd0(lVar4,1);
    if (lVar3 == 0) goto code_r0x00206398;
  }
  _memcpy(lVar3,uVar5,lVar4);
  *unaff_x20 = lVar4;
  unaff_x20[1] = lVar3;
  unaff_x20[2] = lVar4;
  if ((unaff_x21 & 1) == 0) {
LAB_002062f8:
    if (((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
         0x7fffffffffffffff) != 0) && (uVar7 = func_0x007a1140(), (uVar7 & 1) == 0)) {
      *(undefined1 *)(unaff_x19 + 1) = 1;
    }
  }
LAB_00206304:
                    /* WARNING: Could not recover jumptable at 0x007b3b50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__pthread_mutex_unlock_00a252d0)(*unaff_x19);
  return;
}

