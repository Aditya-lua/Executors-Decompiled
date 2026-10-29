/* 7ff70c9ea120 FUN_7ff70c9ea120 */

undefined8 * FUN_7ff70c9ea120(undefined8 *param_1,longlong *param_2)

{
  ulonglong *puVar1;
  code *pcVar2;
  longlong lVar3;
  ulonglong uVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  longlong lVar7;
  ulonglong uStack_c0;
  ulonglong uStack_b8;
  ulonglong uStack_b0;
  undefined1 uStack_a8;
  undefined7 uStack_a7;
  ulonglong uStack_a0;
  ulonglong uStack_98;
  ulonglong uStack_90;
  uint uStack_88;
  undefined4 uStack_84;
  undefined4 uStack_80;
  undefined4 uStack_7c;
  ulonglong uStack_78;
  ulonglong uStack_70;
  undefined1 uStack_68;
  undefined1 auStack_60 [16];
  undefined8 *puStack_50;
  undefined8 *puStack_48;
  undefined8 uStack_40;
  char cStack_38;
  undefined8 uStack_30;
  undefined8 *puStack_28;
  undefined8 uStack_20;
  
  uStack_20 = 0xfffffffffffffffe;
  FUN_7ff70c9e7890(&uStack_40);
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  uStack_c0 = param_2[1] - *param_2 >> 3;
  puStack_28 = param_1;
  if (param_2[1] != *param_2) {
    if (0x2aaaaaaaaaaaaaa < uStack_c0) {
                    /* WARNING: Subroutine does not return */
      FUN_7ff70c7ac850();
    }
    func_0x7ff70c9ed6c0(param_1,&uStack_c0);
  }
  func_0x7ff70d8f121d(0x800);
  FUN_7ff70c9e7180(auStack_60);
  puVar5 = (undefined8 *)*param_2;
  puStack_48 = (undefined8 *)param_2[1];
  do {
    if (puVar5 == puStack_48) {
      func_0x7ff70c9e6e50(auStack_60);
      if (cStack_38 == '\x01') {
        func_0x7ff70cb12580(uStack_40);
      }
      return puStack_28;
    }
    uStack_30 = *puVar5;
    puStack_50 = puVar5;
    uVar6 = func_0x7ff70c9e6fb0(auStack_60);
    func_0x7ff70c9e9020(&uStack_c0,uVar6,uStack_30);
    puVar1 = (ulonglong *)puStack_28[1];
    if (puVar1 == (ulonglong *)puStack_28[2]) {
      func_0x7ff70c9ed9a0(puStack_28,puVar1,&uStack_c0);
      if (0xf < uStack_70) {
        lVar3 = CONCAT44(uStack_84,uStack_88);
        uVar4 = uStack_70 + 1;
        lVar7 = lVar3;
        if (0xfff < uVar4) {
          lVar7 = *(longlong *)(lVar3 + -8);
          if (0x1f < (ulonglong)((lVar3 + -8) - lVar7)) goto LAB_7ff70c9ea36e;
          uVar4 = uStack_70 + 0x28;
        }
        thunk_FUN_7ff70ca90250(lVar7,uVar4);
      }
    }
    else {
      puVar1[2] = uStack_b0;
      *puVar1 = uStack_c0;
      puVar1[1] = uStack_b8;
      puVar1[5] = 0;
      puVar1[6] = 0;
      puVar1[3] = 0;
      puVar1[4] = 0;
      puVar1[3] = CONCAT71(uStack_a7,uStack_a8);
      puVar1[4] = uStack_a0;
      puVar1[5] = uStack_98;
      puVar1[6] = uStack_90;
      uStack_98 = 0;
      uStack_90 = 0xf;
      uStack_a8 = 0;
      puVar1[9] = 0;
      puVar1[10] = 0;
      puVar1[7] = 0;
      puVar1[8] = 0;
      *(uint *)(puVar1 + 7) = uStack_88;
      *(undefined4 *)((longlong)puVar1 + 0x3c) = uStack_84;
      *(undefined4 *)(puVar1 + 8) = uStack_80;
      *(undefined4 *)((longlong)puVar1 + 0x44) = uStack_7c;
      puVar1[9] = uStack_78;
      puVar1[10] = uStack_70;
      *(undefined1 *)(puVar1 + 0xb) = uStack_68;
      puStack_28[1] = puStack_28[1] + 0x60;
    }
    uStack_78 = 0;
    uStack_70 = 0xf;
    uStack_88 = uStack_88 & 0xffffff00;
    if (0xf < uStack_90) {
      lVar3 = CONCAT71(uStack_a7,uStack_a8);
      uVar4 = uStack_90 + 1;
      lVar7 = lVar3;
      if (0xfff < uVar4) {
        lVar7 = *(longlong *)(lVar3 + -8);
        if (0x1f < (ulonglong)((lVar3 + -8) - lVar7)) {
LAB_7ff70c9ea36e:
                    /* WARNING: Does not return */
          pcVar2 = (code *)invalidInstructionException();
          (*pcVar2)();
        }
        uVar4 = uStack_90 + 0x28;
      }
      thunk_FUN_7ff70ca90250(lVar7,uVar4);
    }
    puVar5 = puStack_50 + 1;
  } while( true );
}


