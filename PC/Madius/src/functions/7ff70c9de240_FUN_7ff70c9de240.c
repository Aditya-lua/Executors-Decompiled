/* 7ff70c9de240 FUN_7ff70c9de240 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Removing unreachable block (ram,0x7ff70c9de777) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined4 FUN_7ff70c9de240(longlong param_1,longlong param_2)

{
  uint uVar1;
  char cVar2;
  int iVar3;
  undefined4 uVar4;
  longlong lVar5;
  longlong lVar6;
  ulonglong uVar7;
  undefined8 uVar8;
  longlong lVar9;
  undefined *puVar10;
  undefined8 *puVar11;
  undefined1 *puVar12;
  uint uVar13;
  ulonglong uVar14;
  float10 in_ST0;
  undefined8 auStack_230 [3];
  undefined1 auStack_218 [32];
  undefined8 *puStack_1f8;
  int iStack_1f0;
  undefined8 uStack_1e8;
  longlong *plStack_1e0;
  longlong alStack_1d0 [4];
  longlong lStack_1b0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined1 auStack_148 [264];
  
  puVar11 = (undefined8 *)auStack_218;
  lVar9 = *(longlong *)(param_1 + 0x10);
  auStack_230[2] = 0x7ff70c9de262;
  lVar5 = FUN_7ff70c9422e0();
  auStack_230[2] = 0x7ff70c9de270;
  lVar6 = FUN_7ff70c942300(param_1,param_2);
  alStack_1d0[2] = 0;
  alStack_1d0[1] = 0;
  lStack_1b0 = 0;
  auStack_230[2] = 0x7ff70c9de2aa;
  iVar3 = (**(code **)(_DAT_7ff70cc1ae50 + 0x58))
                    (*(undefined8 *)(*(longlong *)(lVar9 + 0x20) + 8),0x53,alStack_1d0 + 2);
  if (iVar3 != 0 || alStack_1d0[2] == 0) {
    auStack_230[2] = 0x7ff70c9de329;
    uVar8 = FUN_7ff70c991760(iVar3,auStack_148,0x100);
    auStack_230[2] = 0x7ff70c9de33b;
    FUN_7ff70c9412d0(param_2,&UNK_7ff70cb828c3,uVar8);
    uVar4 = 0x3c;
    goto LAB_7ff70c9de762;
  }
  if (((*(longlong *)(lVar5 + 8) != 0) || (*(longlong *)(lVar5 + 0x48) != 0)) &&
     (*(char *)(*(longlong *)(lVar9 + 0x20) + 0x6c) == '\x01')) {
    puStack_1f8 = (undefined8 *)((ulonglong)puStack_1f8 & 0xffffffff00000000);
    auStack_230[2] = 0x7ff70c9de2f8;
    cVar2 = FUN_7ff70c983220(6,1,0,2);
    if (cVar2 == '\0') {
      puStack_1f8 = (undefined8 *)0x0;
      auStack_230[2] = 0x7ff70c9de475;
      lVar9 = func_0x7ff70d904582(2,0,0,0x2000);
      *(longlong *)(lVar9 + -0x7b) = (longlong)in_ST0;
      *(undefined1 *)(lVar9 + 0x48) = 0;
                    /* WARNING: Bad instruction - Truncating control flow here */
      halt_baddata();
    }
    auStack_230[2] = 0x7ff70c9de30f;
    FUN_7ff70c9412d0(param_2,&UNK_7ff70cb8d3ad);
    uVar4 = 0x4d;
    goto LAB_7ff70c9de762;
  }
  uStack_190 = 0;
  uStack_188 = 0;
  uStack_180 = 0;
  uStack_198 = 0x20;
  iStack_1f0 = (*(byte *)(lVar6 + 0xb3) ^ 1) << 0x1d;
  plStack_1e0 = alStack_1d0 + 1;
  puStack_1f8 = &uStack_198;
  uStack_1e8 = 0;
  uVar14 = 0;
  auStack_230[2] = 0x7ff70c9de3a8;
  uVar7 = func_0x7ff70d5fb30d(0,alStack_1d0[2],0,*(undefined8 *)(alStack_1d0[2] + 0x20));
  if ((uVar7 & uVar14) == 0) {
    auStack_230[2] = 0x7ff70c9de421;
    uVar4 = func_0x7ff70d96cde6();
    auStack_230[2] = 0x7ff70c9de437;
    uVar8 = FUN_7ff70c991640(uVar4,auStack_148,0x100);
    auStack_230[2] = 0x7ff70c9de449;
    FUN_7ff70c9412d0(param_2,&UNK_7ff70cb82e95,uVar8);
    alStack_1d0[1] = 0;
  }
  else {
    uVar1 = *(uint *)(**(longlong **)(alStack_1d0[1] + 0x10) + 4);
    uVar13 = 0xfffffffd;
    if (*(char *)(param_2 + 0x5dd) != '\0') {
      uVar13 = 0xfeffffbd;
    }
    if ((uVar13 & uVar1) == 0) {
      uVar4 = 0;
      if (*(char *)(lVar5 + 0x6a) == '\x01') {
        auStack_230[2] = 0x7ff70c9de4c7;
        uVar4 = FUN_7ff70c9ddba0(param_1,param_2);
      }
      goto LAB_7ff70c9de762;
    }
    if ((uVar1 & 4) == 0) {
      if ((uVar1 & 0x10000) == 0) {
        if ((uVar1 & 0x20) == 0) {
          if ((uVar1 & 1) == 0) {
            if ((uVar13 & uVar1 & 0x40) == 0) {
              auStack_230[2] = 0x7ff70c9de417;
              FUN_7ff70c9412d0(param_2,&UNK_7ff70cb803a9);
              goto LAB_7ff70c9de75c;
            }
            puVar10 = &UNK_7ff70cb89d0e;
          }
          else {
            puVar10 = &UNK_7ff70cb8a726;
          }
        }
        else {
          puVar10 = &UNK_7ff70cb8998f;
        }
      }
      else {
        puVar10 = &UNK_7ff70cb89ed0;
      }
    }
    else {
      puVar10 = &UNK_7ff70cb8a98f;
    }
    auStack_230[2] = 0x7ff70c9de75c;
    FUN_7ff70c9412d0(param_2,puVar10);
  }
LAB_7ff70c9de75c:
  uVar4 = 0x3c;
LAB_7ff70c9de762:
  if (lStack_1b0 != 0) {
    puVar11 = auStack_230 + 2;
    auStack_230[2] = 0;
    func_0x7ff70d976f2f();
  }
  puVar12 = (undefined1 *)puVar11;
  if (*(longlong *)((longlong)puVar11 + 0x50) != 0) {
    puVar12 = (undefined1 *)((longlong)puVar11 + -8);
    *(longlong *)((longlong)puVar11 + -8) = param_1;
    *(undefined8 *)((longlong)puVar11 + -0x10) = 0x7ff70c9de792;
    func_0x7ff70d8c7ae3();
  }
  if (*(longlong *)(puVar12 + 0x58) != 0) {
    *(undefined8 *)(puVar12 + -8) = 0x7ff70c9de7a2;
    (*_DAT_7ff70cb95640)();
  }
  return uVar4;
}


