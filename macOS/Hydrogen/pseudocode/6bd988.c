
/* WARNING: Removing unreachable block (ram,0x006bdbb8) */

void FUN_006bd988(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,undefined2 *param_4,
                 undefined8 param_5)

{
  ulong uVar1;
  char cVar2;
  undefined8 *puVar3;
  long *plVar4;
  long *plVar5;
  undefined8 auStack_458 [2];
  char cStack_441;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined7 uStack_190;
  char cStack_189;
  undefined2 auStack_128 [4];
  ulong auStack_120 [5];
  long lStack_f8;
  long lStack_f0;
  char cStack_d8;
  undefined2 uStack_d0;
  undefined1 auStack_c8 [16];
  long lStack_b8;
  long lStack_b0;
  long *plStack_a0;
  long *plStack_98;
  long lStack_88;
  long lStack_80;
  long lStack_70;
  undefined8 uStack_68;
  long alStack_48 [7];
  undefined1 auStack_10 [16];
  
  func_0x00704bac(auStack_10);
  func_0x0070b5dc(alStack_48,auStack_10);
  uVar1 = param_2[1];
  puVar3 = (undefined8 *)*param_2;
  if (-1 < (char)*(byte *)((long)param_2 + 0x17)) {
    uVar1 = (ulong)*(byte *)((long)param_2 + 0x17);
    puVar3 = param_2;
  }
  auStack_128[0] = *param_4;
  auStack_120[0] = auStack_120[0] & 0xffffffffffffff00;
  cStack_d8 = 0;
  cVar2 = *(char *)(param_4 + 0x28);
  if (cVar2 != '\0') {
    func_0x006d0634(auStack_120,param_4 + 4);
  }
  uStack_d0 = param_4[0x2c];
  cStack_d8 = cVar2 != '\0';
  func_0x0070f698(auStack_c8,puVar3,uVar1,alStack_48,auStack_10,auStack_128);
  if (cStack_d8 != '\0') {
    if (lStack_f8 != 0) {
      lStack_f0 = lStack_f8;
      __ZdlPv();
    }
    if (auStack_120[0] != 0) {
      __ZdlPv();
      auStack_120[0] = 0;
      auStack_120[1] = 0;
    }
  }
  plVar4 = plStack_a0;
  if (plStack_a0 == plStack_98) {
    func_0x006af3d0(auStack_458,param_5);
    func_0x006bc488(auStack_458,auStack_c8,alStack_48,param_3);
    if (cStack_189 < '\0') {
      func_0x00017634(param_1,uStack_1a0,uStack_198);
    }
    else {
      param_1[1] = uStack_198;
      *param_1 = uStack_1a0;
      param_1[2] = CONCAT17(cStack_189,uStack_190);
    }
    func_0x006d0894(auStack_458);
  }
  else {
    func_0x0062a078(plStack_a0);
    (**(code **)(*plVar4 + 0x10))(plVar4);
    func_0x00798aa4(auStack_458,":%d: %s");
    func_0x006b4f9c(param_1,auStack_458);
    if (cStack_441 < '\0') {
      __ZdlPv(auStack_458[0]);
    }
  }
  if (lStack_70 != 0) {
    __ZdlPv();
    lStack_70 = 0;
    uStack_68 = 0;
  }
  if (lStack_88 != 0) {
    lStack_80 = lStack_88;
    __ZdlPv();
  }
  plVar4 = plStack_a0;
  if (plStack_a0 != (long *)0x0) {
    if (plStack_98 != plStack_a0) {
      do {
        plVar5 = plStack_98 + -6;
        (**(code **)*plVar5)(plVar5);
        plStack_98 = plVar5;
      } while (plVar5 != plVar4);
    }
    plStack_98 = plVar4;
    __ZdlPv(plStack_a0);
  }
  if (lStack_b8 != 0) {
    for (; lStack_b0 != lStack_b8; lStack_b0 = lStack_b0 + -0x30) {
    }
    lStack_b0 = lStack_b8;
    __ZdlPv(lStack_b8);
  }
  if (alStack_48[0] != 0) {
    __ZdlPv();
  }
  func_0x00704bec(auStack_10);
  return;
}

