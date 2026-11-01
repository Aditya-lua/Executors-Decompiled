
bool FUN_0041f0e8(undefined8 *param_1,long param_2,ulong param_3)

{
  undefined *puVar1;
  ulong uVar2;
  uint *puVar3;
  ulong uVar4;
  undefined *puVar5;
  undefined *puVar6;
  long *plVar7;
  ulong uVar8;
  undefined1 auVar9 [16];
  
  if (param_3 != 0) {
    puVar5 = &UNK_009da470;
    do {
      while( true ) {
        uVar4 = param_3;
        if (0x7ffffffd < param_3) {
          uVar4 = 0x7ffffffe;
        }
        uVar4 = _write(2,param_2,uVar4);
        if (uVar4 == 0xffffffffffffffff) break;
        if (uVar4 == 0) {
code_r0x0041f16c:
          plVar7 = param_1 + 1;
          if (*plVar7 != 0) {
            func_0x003f67e4(plVar7);
          }
          *plVar7 = (long)puVar5;
          return true;
        }
        uVar2 = param_3 - uVar4;
        if (param_3 < uVar4) {
          puVar5 = &UNK_009da7a0;
          func_0x007a28a4(uVar4,param_3);
          *param_1 = &UNK_009da470;
          auVar9 = __Unwind_Resume();
          plVar7 = (long *)*auVar9._0_8_;
          uVar2 = plVar7[1];
          uVar8 = plVar7[2];
          uVar4 = uVar2;
          if (uVar8 <= uVar2) {
            uVar4 = uVar8;
          }
          puVar6 = (undefined *)(uVar2 - uVar4);
          puVar1 = puVar6;
          if (puVar5 <= puVar6) {
            puVar1 = puVar5;
          }
          _memcpy(*plVar7 + uVar4,auVar9._8_8_,puVar1);
          plVar7[2] = (long)(puVar1 + uVar8);
          if (puVar6 < puVar5) {
            plVar7 = auVar9._0_8_ + 1;
            if (*plVar7 != 0) {
              func_0x003f67e4(plVar7);
            }
            *plVar7 = (long)&UNK_009da470;
          }
          return puVar6 < puVar5;
        }
        param_2 = param_2 + uVar4;
        param_3 = uVar2;
        if (uVar2 == 0) {
          return false;
        }
      }
      puVar3 = (uint *)___error();
      if (*puVar3 != 4) {
        puVar5 = (undefined *)((ulong)*puVar3 << 0x20 | 2);
        goto code_r0x0041f16c;
      }
    } while (param_3 != 0);
  }
  return false;
}

