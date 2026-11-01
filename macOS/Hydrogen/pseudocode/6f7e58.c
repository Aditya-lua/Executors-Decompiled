
undefined8 FUN_006f7e58(void)

{
  uint uVar1;
  char in_NG;
  char in_OV;
  int iVar2;
  char *pcVar3;
  long lVar4;
  undefined8 uVar5;
  char *pcVar6;
  long lVar7;
  char cVar8;
  ulong unaff_x19;
  char *unaff_x20;
  int unaff_w22;
  int *piVar9;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong uVar10;
  long unaff_x27;
  ulong uVar11;
  long unaff_x29;
  int *in_stack_00000010;
  undefined8 in_stack_00000018;
  ulong in_stack_00000020;
  undefined1 uStack0000000000000028;
  int in_stack_00000030;
  char *in_stack_00000038;
  long in_stack_00000048;
  uint in_stack_00000050;
  int iStack0000000000000058;
  undefined4 uStack000000000000005c;
  long in_stack_00000060;
  ulong in_stack_00000268;
  char *in_stack_00000270;
  char *in_stack_00000278;
  undefined1 auStack_7ffffffe [2147483606];
  undefined4 auStack_28 [2];
  char *pcStack_20;
  ulong uStack_18;
  
  while (lVar4 = unaff_x27, in_NG != in_OV) {
    in_stack_00000050 = 0;
    pcVar3 = (char *)func_0x006f9748(&uStack0000000000000028,unaff_x20);
    lVar4 = in_stack_00000048;
    pcVar6 = in_stack_00000270;
    if (pcVar3 == (char *)0x0) {
LAB_006f81a8:
      lVar4 = unaff_x27;
      if (in_stack_00000038 <= unaff_x20) break;
      if (in_stack_00000278 <= pcVar6) {
        func_0x006e7288(auStack_7ffffffe + 0x8000026e,1);
      }
      in_stack_00000270 = pcVar6 + 1;
      *pcVar6 = *unaff_x20;
      pcVar3 = unaff_x20 + 1;
    }
    else {
      if (unaff_w22 == 6) {
        if ((int)in_stack_00000050 < 1) {
          lVar7 = (long)pcVar3 - (long)unaff_x20;
          pcVar6 = unaff_x20;
code_r0x006f805c:
          func_0x006e38d8(in_stack_00000048,pcVar6,lVar7);
        }
        else {
          if (in_stack_00000060 != -2) {
            if (in_stack_00000060 != -1) {
              pcVar6 = (char *)CONCAT44(uStack000000000000005c,iStack0000000000000058);
              lVar7 = in_stack_00000060;
              goto code_r0x006f805c;
            }
            goto code_r0x006f829c;
          }
          func_0x006e3870(in_stack_00000048,(iStack0000000000000058 - in_stack_00000030) + 1);
        }
        func_0x006e3c6c(lVar4,3);
        iVar2 = func_0x006e2c48(lVar4,0xffffffff);
        if (iVar2 == 0) goto code_r0x006f8178;
code_r0x006f8098:
        iVar2 = func_0x006e24a4(lVar4,0xffffffff);
        if (iVar2 == 0) {
code_r0x006f8278:
          func_0x006e719c(lVar4,0xffffffff);
          func_0x006e644c(lVar4,"invalid replacement value (a %s)");
          goto code_r0x006f8298;
        }
code_r0x006f8194:
        func_0x006e7490(auStack_7ffffffe + 0x8000026e);
      }
      else {
        if (unaff_w22 == 7) {
          func_0x006e2154(in_stack_00000048,3);
          uVar1 = in_stack_00000050;
          if (in_stack_00000050 == 0 && unaff_x20 != (char *)0x0) {
            uVar1 = 1;
          }
          uVar11 = (ulong)uVar1;
          func_0x006e6978(in_stack_00000048,uVar11,"too many captures");
          if (0 < (int)uVar1) {
            if ((int)in_stack_00000050 < 1) {
              func_0x006e38d8(in_stack_00000048,unaff_x20,(long)pcVar3 - (long)unaff_x20);
joined_r0x006f80c0:
              if (uVar1 != 1) {
code_r0x006f80e8:
                uVar10 = 1;
                piVar9 = in_stack_00000010;
                do {
                  while( true ) {
                    if ((long)(int)in_stack_00000050 <= (long)uVar10) {
                      func_0x006e644c(in_stack_00000048,"invalid capture index");
                      goto code_r0x006f8250;
                    }
                    if (*(long *)(piVar9 + 2) == -2) break;
                    if (*(long *)(piVar9 + 2) == -1) goto code_r0x006f8250;
                    func_0x006e38d8(in_stack_00000048,*(undefined8 *)piVar9);
                    uVar10 = uVar10 + 1;
                    piVar9 = piVar9 + 4;
                    if (uVar11 == uVar10) goto LAB_006f8150;
                  }
                  func_0x006e3870(in_stack_00000048,(*piVar9 - in_stack_00000030) + 1);
                  uVar10 = uVar10 + 1;
                  piVar9 = piVar9 + 4;
                } while (uVar11 != uVar10);
              }
              goto LAB_006f8150;
            }
            if (in_stack_00000060 == -2) {
              func_0x006e3870(in_stack_00000048,(iStack0000000000000058 - in_stack_00000030) + 1);
              if (uVar1 == 1) goto LAB_006f8150;
              goto code_r0x006f80e8;
            }
            if (in_stack_00000060 != -1) {
              func_0x006e38d8(in_stack_00000048,
                              CONCAT44(uStack000000000000005c,iStack0000000000000058));
              goto joined_r0x006f80c0;
            }
code_r0x006f8250:
            func_0x006e644c(in_stack_00000048,"unfinished capture");
            unaff_x19 = unaff_x25;
code_r0x006f8260:
            func_0x006e644c(in_stack_00000048,"invalid use of \'%c\' in replacement string");
            goto code_r0x006f8278;
          }
LAB_006f8150:
          func_0x006e4c80(lVar4,uVar11,1);
          iVar2 = func_0x006e2c48(lVar4,0xffffffff);
          unaff_x19 = in_stack_00000020 >> 0x20;
          if (iVar2 != 0) goto code_r0x006f8098;
code_r0x006f8178:
          func_0x006e1d54(lVar4,0xfffffffe);
          func_0x006e38d8(lVar4,unaff_x20,(long)pcVar3 - (long)unaff_x20);
          goto code_r0x006f8194;
        }
        lVar4 = func_0x006e2ce4(in_stack_00000048,3,auStack_7ffffffe + 0x80000266);
        func_0x006e7288(auStack_7ffffffe + 0x8000026e,in_stack_00000268);
        if (in_stack_00000268 != 0) {
          uVar11 = 0;
          do {
            cVar8 = *(char *)(lVar4 + uVar11);
            if (cVar8 == '%') {
              uVar11 = uVar11 + 1;
              iVar2 = (int)(char)*(byte *)(lVar4 + uVar11);
              if ((*(uint *)(PTR___DefaultRuneLocale_009b0028 +
                            (ulong)*(byte *)(lVar4 + uVar11) * 4 + 0x3c) >> 10 & 1) == 0) {
                if (iVar2 != 0x25) goto code_r0x006f8260;
                if (pcVar6 < in_stack_00000278) {
                  cVar8 = '%';
                }
                else {
                  func_0x006e7288(auStack_7ffffffe + 0x8000026e,1);
                  cVar8 = *(char *)(lVar4 + uVar11);
                }
                *pcVar6 = cVar8;
                in_stack_00000270 = pcVar6 + 1;
              }
              else {
                in_stack_00000270 = pcVar6;
                if (iVar2 == 0x30) {
                  func_0x006e7378(auStack_7ffffffe + 0x8000026e,unaff_x20,
                                  (long)pcVar3 - (long)unaff_x20);
                }
                else {
                  func_0x006fa2fc(&uStack0000000000000028,iVar2 + -0x31,unaff_x20,pcVar3);
                  func_0x006e7490(auStack_7ffffffe + 0x8000026e);
                }
              }
            }
            else {
              if (in_stack_00000278 <= pcVar6) {
                func_0x006e7288(auStack_7ffffffe + 0x8000026e,1);
                cVar8 = *(char *)(lVar4 + uVar11);
              }
              in_stack_00000270 = pcVar6 + 1;
              *pcVar6 = cVar8;
            }
            uVar11 = uVar11 + 1;
            pcVar6 = in_stack_00000270;
          } while (uVar11 < in_stack_00000268);
        }
      }
      unaff_x24 = (ulong)((int)unaff_x24 + 1);
      unaff_x27 = lVar4;
      pcVar6 = in_stack_00000270;
      if (pcVar3 <= unaff_x20) goto LAB_006f81a8;
    }
    unaff_x20 = pcVar3;
    lVar4 = unaff_x27;
    if ((int)unaff_x19 == 0x5e) break;
    in_OV = SBORROW4((int)unaff_x24,(int)unaff_x25);
    in_NG = (int)unaff_x24 - (int)unaff_x25 < 0;
  }
  func_0x006e7378(auStack_7ffffffe + 0x8000026e,unaff_x20,(long)in_stack_00000038 - (long)unaff_x20)
  ;
  func_0x006e79b0(auStack_7ffffffe + 0x8000026e);
  func_0x006e3870(in_stack_00000018,unaff_x24);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return 2;
  }
code_r0x006f8298:
  ___stack_chk_fail();
code_r0x006f829c:
  func_0x006e644c(lVar4,"unfinished capture");
  uVar5 = func_0x006e6498(unaff_x19,3,"string/function/table");
  pcStack_20 = unaff_x20;
  uStack_18 = unaff_x19;
  func_0x006e67c8(uVar5,1,auStack_28);
  func_0x006e3870(uVar5,auStack_28[0]);
  return 1;
}

