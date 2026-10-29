/* 7ff70c983220 FUN_7ff70c983220 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

bool FUN_7ff70c983220(uint param_1,undefined4 param_2,uint param_3,int param_4,uint param_5)

{
  code *pcVar1;
  char cVar2;
  int iVar3;
  undefined8 uVar4;
  char *pcVar5;
  byte bVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  code *unaff_R13;
  ulonglong uVar10;
  ulonglong uVar11;
  bool bVar12;
  undefined8 uStack_198;
  ulonglong uStack_190;
  undefined1 auStack_188 [328];
  
  puVar7 = (undefined8 *)auStack_188;
  puVar8 = (undefined8 *)(ulonglong)param_3;
  if (DAT_7ff70cc1ae60 == '\0') {
    uStack_198 = 0x7ff70c98325b;
    uStack_190 = (ulonglong)param_1;
    uStack_198 = func_0x7ff70d817c3d(&UNK_7ff70cb84dce);
    puVar7 = &uStack_198;
    _DAT_7ff70cc1ae58 = (code *)func_0x7ff70d84910e(uStack_198,&UNK_7ff70cb840f5);
    DAT_7ff70cc1ae60 = '\x01';
  }
  if (param_5 < 5) {
    bVar6 = (char)param_5 * '\b';
    uVar10 = 0x203010504 >> (bVar6 & 0x3f);
    uVar11 = 0x303030505 >> (bVar6 & 0x3f);
    *(undefined8 *)((longlong)puVar7 + -8) = 0x7ff70c9832b7;
    FUN_7ff70cb12b80((undefined1 *)((longlong)puVar7 + 0x3c),0,0x10c);
    *(undefined4 *)((longlong)puVar7 + 0x2c) = 0x11c;
    *(uint *)((longlong)puVar7 + 0x30) = param_1;
    *(undefined4 *)((longlong)puVar7 + 0x34) = param_2;
    *(uint *)((longlong)puVar7 + 0x38) = param_3;
    if (param_4 - 1U < 2) {
      *(int *)((longlong)puVar7 + 0x3c) = param_4;
    }
    *(undefined8 *)((longlong)puVar7 + -8) = 0x7ff70c9832dc;
    func_0x7ff70d5908b4();
    uVar9 = *puVar8;
    do {
      *puVar8 = 0x7ff70c9832eb;
      uVar4 = (*unaff_R13)();
      *puVar8 = 0x7ff70c9832f9;
      uVar4 = (*unaff_R13)(uVar4,1,uVar10 & 0xffffffff);
      *puVar8 = 0x7ff70c983307;
      uVar4 = (*unaff_R13)(uVar4,0x20,uVar11 & 0xffffffff);
      *puVar8 = 0x7ff70c983315;
      uVar4 = (*unaff_R13)(uVar4,0x10,uVar11 & 0xffffffff);
      bVar12 = false;
      if (param_4 == 0) goto LAB_7ff70c98334c;
      *puVar8 = 0x7ff70c983329;
      pcVar5 = (char *)func_0x7ff70da777b5(uVar4,8,1);
    } while (!bVar12);
    *pcVar5 = *pcVar5 + (char)pcVar5;
LAB_7ff70c98334c:
    pcVar1 = _DAT_7ff70cc1ae58;
    if (_DAT_7ff70cc1ae58 == (code *)0x0) {
      *puVar8 = &UNK_7ff70c983373;
      func_0x7ff70d627416((longlong)puVar8 + 0x34);
                    /* WARNING: Bad instruction - Truncating control flow here */
      halt_baddata();
    }
    *puVar8 = 0x7ff70c983363;
    iVar3 = (*pcVar1)();
    bVar12 = iVar3 == 0;
    if (((int)uVar9 != 0) && (bVar12)) {
      if (param_5 != 2) {
        if ((param_5 & 5) != 1) {
          return true;
        }
        *(undefined4 *)(puVar8 + 5) = 2;
        *puVar8 = 0x7ff70c9833e4;
        cVar2 = FUN_7ff70c983220(param_1,param_2,0,param_4);
        if (cVar2 == '\0') {
          return true;
        }
      }
      *puVar8 = 0x7ff70c983396;
      uVar9 = func_0x7ff70d6b370b(0,4,uVar10 & 0xffffffff);
      pcVar1 = _DAT_7ff70cc1ae58;
      if (_DAT_7ff70cc1ae58 == (code *)0x0) {
        *puVar8 = 0x7ff70c9833f7;
        iVar3 = func_0x7ff70d757fb8((longlong)puVar8 + 0x34,4,uVar9);
        bVar12 = iVar3 != 0;
      }
      else {
        *puVar8 = 0x7ff70c9833b3;
        iVar3 = (*pcVar1)();
        bVar12 = iVar3 == 0;
      }
    }
  }
  else {
    bVar12 = false;
  }
  return bVar12;
}


