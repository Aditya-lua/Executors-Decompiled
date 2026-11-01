
undefined8 FUN_006f8004(undefined1 *param_1,char *param_2,long param_3)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  char *pcVar4;
  long lVar5;
  char cVar6;
  ulong unaff_x19;
  char *unaff_x20;
  int unaff_w22;
  ulong unaff_x23;
  int *piVar7;
  int unaff_w24;
  ulong unaff_x25;
  ulong uVar8;
  char *unaff_x26;
  long unaff_x27;
  long lVar9;
  ulong uVar10;
  long unaff_x28;
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
  
  do {
    func_0x006e7378(param_1,param_2,param_3);
    param_2 = unaff_x20;
    param_3 = unaff_x28;
LAB_006f7f6c:
    unaff_x23 = unaff_x23 + 1;
    if (in_stack_00000268 <= unaff_x23) {
code_r0x006f819c:
      do {
        unaff_w24 = unaff_w24 + 1;
        if (param_2 < unaff_x26) goto code_r0x006f7e48;
        do {
          if (in_stack_00000038 <= param_2) {
code_r0x006f81dc:
            func_0x006e7378(auStack_7ffffffe + 0x8000026e,param_2,
                            (long)in_stack_00000038 - (long)param_2);
            func_0x006e79b0(auStack_7ffffffe + 0x8000026e);
            func_0x006e3870(in_stack_00000018,unaff_w24);
            if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
              return 2;
            }
            goto code_r0x006f8298;
          }
          if (in_stack_00000278 <= in_stack_00000270) {
            func_0x006e7288(auStack_7ffffffe + 0x8000026e,1);
          }
          *in_stack_00000270 = *param_2;
          unaff_x26 = param_2 + 1;
          in_stack_00000270 = in_stack_00000270 + 1;
code_r0x006f7e48:
          param_2 = unaff_x26;
          if (((int)unaff_x19 == 0x5e) || ((int)unaff_x25 <= unaff_w24)) goto code_r0x006f81dc;
          in_stack_00000050 = 0;
          unaff_x26 = (char *)func_0x006f9748(&uStack0000000000000028,param_2);
          lVar9 = in_stack_00000048;
        } while (unaff_x26 == (char *)0x0);
        if (unaff_w22 == 6) {
          if ((int)in_stack_00000050 < 1) {
            lVar5 = (long)unaff_x26 - (long)param_2;
            pcVar4 = param_2;
code_r0x006f805c:
            func_0x006e38d8(in_stack_00000048,pcVar4,lVar5);
          }
          else {
            if (in_stack_00000060 != -2) {
              unaff_x27 = in_stack_00000048;
              if (in_stack_00000060 != -1) {
                pcVar4 = (char *)CONCAT44(uStack000000000000005c,iStack0000000000000058);
                lVar5 = in_stack_00000060;
                goto code_r0x006f805c;
              }
              goto code_r0x006f829c;
            }
            func_0x006e3870(in_stack_00000048,(iStack0000000000000058 - in_stack_00000030) + 1);
          }
          func_0x006e3c6c(lVar9,3);
          iVar2 = func_0x006e2c48(lVar9,0xffffffff);
          if (iVar2 == 0) goto code_r0x006f8178;
code_r0x006f8098:
          iVar2 = func_0x006e24a4(lVar9,0xffffffff);
          if (iVar2 == 0) goto code_r0x006f8278;
code_r0x006f8194:
          func_0x006e7490(auStack_7ffffffe + 0x8000026e);
          unaff_x27 = lVar9;
          goto code_r0x006f819c;
        }
        if (unaff_w22 == 7) {
          func_0x006e2154(in_stack_00000048,3);
          uVar1 = in_stack_00000050;
          if (in_stack_00000050 == 0 && param_2 != (char *)0x0) {
            uVar1 = 1;
          }
          uVar10 = (ulong)uVar1;
          func_0x006e6978(in_stack_00000048,uVar10,"too many captures");
          if (0 < (int)uVar1) {
            if ((int)in_stack_00000050 < 1) {
              func_0x006e38d8(in_stack_00000048,param_2,(long)unaff_x26 - (long)param_2);
            }
            else if (in_stack_00000060 == -2) {
              func_0x006e3870(in_stack_00000048,(iStack0000000000000058 - in_stack_00000030) + 1);
            }
            else {
              if (in_stack_00000060 == -1) {
code_r0x006f8250:
                func_0x006e644c(in_stack_00000048,"unfinished capture");
                unaff_x19 = unaff_x25;
                goto code_r0x006f8260;
              }
              func_0x006e38d8(in_stack_00000048,
                              CONCAT44(uStack000000000000005c,iStack0000000000000058));
            }
            if (uVar1 != 1) {
              uVar8 = 1;
              piVar7 = in_stack_00000010;
              do {
                while( true ) {
                  if ((long)(int)in_stack_00000050 <= (long)uVar8) {
                    func_0x006e644c(in_stack_00000048,"invalid capture index");
                    goto code_r0x006f8250;
                  }
                  if (*(long *)(piVar7 + 2) == -2) break;
                  if (*(long *)(piVar7 + 2) == -1) goto code_r0x006f8250;
                  func_0x006e38d8(in_stack_00000048,*(undefined8 *)piVar7);
                  uVar8 = uVar8 + 1;
                  piVar7 = piVar7 + 4;
                  if (uVar10 == uVar8) goto code_r0x006f8150;
                }
                func_0x006e3870(in_stack_00000048,(*piVar7 - in_stack_00000030) + 1);
                uVar8 = uVar8 + 1;
                piVar7 = piVar7 + 4;
              } while (uVar10 != uVar8);
            }
          }
code_r0x006f8150:
          func_0x006e4c80(lVar9,uVar10,1);
          iVar2 = func_0x006e2c48(lVar9,0xffffffff);
          unaff_x19 = in_stack_00000020 >> 0x20;
          if (iVar2 != 0) goto code_r0x006f8098;
code_r0x006f8178:
          func_0x006e1d54(lVar9,0xfffffffe);
          func_0x006e38d8(lVar9,param_2,(long)unaff_x26 - (long)param_2);
          goto code_r0x006f8194;
        }
        unaff_x27 = func_0x006e2ce4(in_stack_00000048,3,auStack_7ffffffe + 0x80000266);
        func_0x006e7288(auStack_7ffffffe + 0x8000026e,in_stack_00000268);
      } while (in_stack_00000268 == 0);
      unaff_x23 = 0;
      param_3 = (long)unaff_x26 - (long)param_2;
    }
    cVar6 = *(char *)(unaff_x27 + unaff_x23);
    if (cVar6 != '%') {
      if (in_stack_00000278 <= in_stack_00000270) {
        func_0x006e7288(auStack_7ffffffe + 0x8000026e,1);
        cVar6 = *(char *)(unaff_x27 + unaff_x23);
      }
      *in_stack_00000270 = cVar6;
      in_stack_00000270 = in_stack_00000270 + 1;
      goto LAB_006f7f6c;
    }
    unaff_x23 = unaff_x23 + 1;
    iVar2 = (int)(char)*(byte *)(unaff_x27 + unaff_x23);
    if ((*(uint *)(PTR___DefaultRuneLocale_009b0028 +
                  (ulong)*(byte *)(unaff_x27 + unaff_x23) * 4 + 0x3c) >> 10 & 1) == 0) {
      lVar9 = unaff_x27;
      if (iVar2 != 0x25) {
code_r0x006f8260:
        func_0x006e644c(in_stack_00000048,"invalid use of \'%c\' in replacement string");
code_r0x006f8278:
        func_0x006e719c(lVar9,0xffffffff);
        func_0x006e644c(lVar9,"invalid replacement value (a %s)");
        unaff_x27 = lVar9;
code_r0x006f8298:
        ___stack_chk_fail();
code_r0x006f829c:
        func_0x006e644c(unaff_x27,"unfinished capture");
        uVar3 = func_0x006e6498(unaff_x19,3,"string/function/table");
        pcStack_20 = param_2;
        uStack_18 = unaff_x19;
        func_0x006e67c8(uVar3,1,auStack_28);
        func_0x006e3870(uVar3,auStack_28[0]);
        return 1;
      }
      if (in_stack_00000270 < in_stack_00000278) {
        cVar6 = '%';
      }
      else {
        func_0x006e7288(auStack_7ffffffe + 0x8000026e,1);
        cVar6 = *(char *)(unaff_x27 + unaff_x23);
      }
      *in_stack_00000270 = cVar6;
      in_stack_00000270 = in_stack_00000270 + 1;
      goto LAB_006f7f6c;
    }
    if (iVar2 != 0x30) {
      func_0x006fa2fc(&uStack0000000000000028,iVar2 + -0x31,param_2,unaff_x26);
      func_0x006e7490(auStack_7ffffffe + 0x8000026e);
      goto LAB_006f7f6c;
    }
    param_1 = auStack_7ffffffe + 0x8000026e;
    unaff_x20 = param_2;
    unaff_x28 = param_3;
  } while( true );
}

