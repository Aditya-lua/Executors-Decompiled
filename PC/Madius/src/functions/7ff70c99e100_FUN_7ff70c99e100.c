/* 7ff70c99e100 FUN_7ff70c99e100 */

void FUN_7ff70c99e100(longlong param_1,ulonglong param_2)

{
  longlong *plVar1;
  longlong *plVar2;
  longlong *plVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  code *pcVar6;
  longlong *plVar7;
  byte bVar8;
  ulonglong uVar9;
  longlong lVar10;
  longlong lVar11;
  longlong *plVar12;
  
  if (0x800000000000000 < param_2) {
    FUN_7ff70cb12520(&UNK_7ff70cb80e99);
    pcVar6 = (code *)swi(3);
    (*pcVar6)();
    return;
  }
  uVar9 = param_2 - 1 | 1;
  lVar10 = 0x3f;
  if (uVar9 != 0) {
    for (; uVar9 >> lVar10 == 0; lVar10 = lVar10 + -1) {
    }
  }
  bVar8 = -((byte)lVar10 ^ 0x3f);
  lVar10 = 1L << (bVar8 & 0x3f);
  plVar1 = *(longlong **)(param_1 + 8);
  FUN_7ff70c7ac0b0(param_1 + 0x18,2L << (bVar8 & 0x3f),plVar1);
  *(longlong *)(param_1 + 0x30) = lVar10 + -1;
  *(longlong *)(param_1 + 0x38) = lVar10;
  plVar7 = (longlong *)**(undefined8 **)(param_1 + 8);
joined_r0x7ff70c99e16a:
  do {
    if (plVar7 == plVar1) {
      return;
    }
    plVar2 = (longlong *)*plVar7;
    lVar10 = *(longlong *)(param_1 + 0x18);
    lVar11 = (((ulonglong)*(byte *)((longlong)plVar7 + 0x17) ^
              ((ulonglong)*(byte *)((longlong)plVar7 + 0x16) ^
              ((ulonglong)*(byte *)((longlong)plVar7 + 0x15) ^
              ((ulonglong)*(byte *)((longlong)plVar7 + 0x14) ^
              ((ulonglong)*(byte *)((longlong)plVar7 + 0x13) ^
              ((ulonglong)*(byte *)((longlong)plVar7 + 0x12) ^
              ((ulonglong)*(byte *)((longlong)plVar7 + 0x11) ^
              ((ulonglong)*(byte *)(plVar7 + 2) ^ 0xcbf29ce484222325) * 0x100000001b3) *
              0x100000001b3) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3) * 0x100000001b3) *
              0x100000001b3) * 0x100000001b3 & *(ulonglong *)(param_1 + 0x30)) * 0x10;
    if (*(longlong **)(lVar10 + lVar11) == plVar1) {
      *(longlong **)(lVar10 + lVar11) = plVar7;
    }
    else {
      plVar12 = *(longlong **)(lVar10 + 8 + lVar11);
      if (plVar7[2] != plVar12[2]) {
        do {
          if (*(longlong **)(lVar10 + lVar11) == plVar12) {
            plVar3 = (longlong *)plVar7[1];
            *plVar3 = (longlong)plVar2;
            puVar4 = (undefined8 *)plVar2[1];
            *puVar4 = plVar12;
            puVar5 = (undefined8 *)plVar12[1];
            *puVar5 = plVar7;
            plVar12[1] = (longlong)puVar4;
            plVar2[1] = (longlong)plVar3;
            plVar7[1] = (longlong)puVar5;
            *(longlong **)(lVar10 + lVar11) = plVar7;
            plVar7 = plVar2;
            goto joined_r0x7ff70c99e16a;
          }
          plVar12 = (longlong *)plVar12[1];
        } while (plVar7[2] != plVar12[2]);
        lVar10 = *plVar12;
        plVar12 = (longlong *)plVar7[1];
        *plVar12 = (longlong)plVar2;
        plVar3 = (longlong *)plVar2[1];
        *plVar3 = lVar10;
        puVar4 = *(undefined8 **)(lVar10 + 8);
        *puVar4 = plVar7;
        *(longlong **)(lVar10 + 8) = plVar3;
        plVar2[1] = (longlong)plVar12;
        plVar7[1] = (longlong)puVar4;
        plVar7 = plVar2;
        goto joined_r0x7ff70c99e16a;
      }
      plVar12 = (longlong *)*plVar12;
      if (plVar12 != plVar7) {
        plVar3 = (longlong *)plVar7[1];
        *plVar3 = (longlong)plVar2;
        puVar4 = (undefined8 *)plVar2[1];
        *puVar4 = plVar12;
        puVar5 = (undefined8 *)plVar12[1];
        *puVar5 = plVar7;
        plVar12[1] = (longlong)puVar4;
        plVar2[1] = (longlong)plVar3;
        plVar7[1] = (longlong)puVar5;
      }
    }
    *(longlong **)(lVar10 + 8 + lVar11) = plVar7;
    plVar7 = plVar2;
  } while( true );
}


