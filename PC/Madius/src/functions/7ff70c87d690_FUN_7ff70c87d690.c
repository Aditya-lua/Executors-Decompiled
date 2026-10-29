/* 7ff70c87d690 FUN_7ff70c87d690 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c87d690(void)

{
  undefined8 uVar1;
  longlong lVar2;
  undefined8 uVar3;
  code *pcVar4;
  bool bVar5;
  longlong lVar6;
  char cVar7;
  undefined4 uVar8;
  longlong lVar9;
  undefined1 auVar10 [16];
  float fVar11;
  float fVar12;
  undefined1 auStack_b8 [32];
  undefined4 uStack_98;
  undefined4 uStack_90;
  ulonglong uStack_80;
  float fStack_78;
  float fStack_74;
  float fStack_70;
  float fStack_6c;
  ulonglong uStack_60;
  
  lVar6 = _DAT_7ff70cc1a3c0;
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_b8;
  lVar9 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(char *)(lVar9 + 0xd1) == '\0') {
    *(undefined1 *)(lVar9 + 0xce) = 1;
    lVar2 = *(longlong *)(lVar6 + 0x1440);
    if (*(char *)(lVar2 + 0xd1) == '\0') {
      if (*(int *)(lVar9 + 0x1d4) == 0) {
        auVar10 = insertps(_DAT_7ff70cb1e940,*(undefined4 *)(lVar2 + 0x144),0x30);
        uVar3 = *(undefined8 *)(lVar2 + 0x118);
        uVar1 = *(undefined8 *)(lVar2 + 0x118);
        fStack_78 = (float)uVar3 + auVar10._0_4_;
        fStack_74 = (float)((ulonglong)uVar3 >> 0x20) + auVar10._4_4_;
        fStack_70 = (float)uVar1 + auVar10._8_4_;
        fStack_6c = (float)((ulonglong)uVar1 >> 0x20) + auVar10._12_4_;
        uStack_80 = (ulonglong)(uint)_DAT_7ff70cb1ba2c;
        FUN_7ff70c8375f0(&uStack_80,_DAT_7ff70cb1bae8);
        cVar7 = FUN_7ff70c837800(&fStack_78,0,0,0);
        if (cVar7 != '\0') {
          uVar3 = *(undefined8 *)(lVar2 + 0x2c8);
          uVar8 = FUN_7ff70c80a070(0x1b,_DAT_7ff70cb1ba2c);
          uStack_90 = 0;
          uStack_98 = 0;
          FUN_7ff70c7bd960(uVar3,&fStack_78,&fStack_70,uVar8);
          if (*(char *)(lVar6 + 0x2720) == '\x01') {
            FUN_7ff70c856f00(&UNK_7ff70cb7fb7e);
          }
        }
      }
      else {
        fVar12 = *(float *)(lVar2 + 0x118);
        fVar11 = *(float *)(lVar2 + 0x248);
        bVar5 = true;
        if ((*(longlong *)(lVar9 + 0x1c8) == 0) ||
           (lVar9 = *(longlong *)(lVar2 + 0x1c8), lVar9 == 0)) {
          lVar9 = 0;
        }
        else {
          fVar12 = *(float *)(lVar2 + 0x15c) + *(float *)(lVar2 + 0x28);
          fVar11 = *(float *)(lVar2 + 0x28) + *(float *)(lVar2 + 0x30);
          FUN_7ff70c911b30();
          bVar5 = false;
        }
        fStack_74 = *(float *)(lVar2 + 0x11c);
        fStack_6c = _DAT_7ff70cb1ba2c + fStack_74;
        uStack_80 = 0;
        fStack_78 = fVar12;
        fStack_70 = fVar11;
        FUN_7ff70c8375f0(&uStack_80,_DAT_7ff70cb1bae8);
        cVar7 = FUN_7ff70c837800(&fStack_78,0,0,0);
        if (cVar7 != '\0') {
          uVar3 = *(undefined8 *)(lVar2 + 0x2c8);
          uVar8 = FUN_7ff70c80a070(0x1b,_DAT_7ff70cb1ba2c);
          uStack_90 = 0;
          uStack_98 = 0;
          FUN_7ff70c7bd960(uVar3,&fStack_78,&fStack_70,uVar8);
          if (*(char *)(lVar6 + 0x2720) == '\x01') {
            FUN_7ff70c80c840(&fStack_78,&UNK_7ff70cb9183c,0);
          }
        }
        if (!bVar5) {
          FUN_7ff70c911c00();
          *(undefined4 *)(lVar9 + 0x1c) = *(undefined4 *)(lVar2 + 0x11c);
        }
      }
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_b8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_b8);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


