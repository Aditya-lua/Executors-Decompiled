
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00136df4(undefined8 *param_1,undefined1 param_2 [16])

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined2 *puVar6;
  undefined4 *puVar7;
  ulong *unaff_x19;
  long unaff_x22;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long lStack0000000000000030;
  undefined4 in_stack_00000038;
  
  param_1[1] = param_2._8_8_;
  *param_1 = param_2._0_8_;
  uStack0000000000000028 = 0;
  lStack0000000000000030 = 0;
  _uStack0000000000000020 = (char *)0x0;
  *(undefined4 *)(param_1 + 3) = in_stack_00000038;
  puRam0000000000a392e0 = param_1 + 4;
  puVar1 = (undefined8 *)*unaff_x19;
  puVar2 = (undefined8 *)unaff_x19[1];
  _uStack0000000000000020 = (char *)__Znwm(0x38);
  uVar5 = s__________________________________008d982b._24_8_;
  uVar4 = s__________________________________008d982b._16_8_;
  uVar3 = s__________________________________008d982b._0_8_;
  *(undefined8 *)(_uStack0000000000000020 + 8) = s__________________________________008d982b._8_8_;
  *(undefined8 *)_uStack0000000000000020 = uVar3;
  *(undefined8 *)(_uStack0000000000000020 + 0x18) = uVar5;
  *(undefined8 *)(_uStack0000000000000020 + 0x10) = uVar4;
  uVar3 = s__________________________________008d982b._32_8_;
  *(undefined8 *)(_uStack0000000000000020 + 0x28) =
       s__________________________________008d982b._40_8_;
  *(undefined8 *)(_uStack0000000000000020 + 0x20) = uVar3;
  _uStack0000000000000020[0x30] = '\0';
  uVar3 = _UNK_00813420;
  lStack0000000000000030 = _UNK_00813428;
  uStack0000000000000028 = _UNK_00813420;
  in_stack_00000038 = 5;
  if (puVar1 < puVar2) {
    puVar1[2] = _UNK_00813428;
    puVar1[1] = uVar3;
    *puVar1 = _uStack0000000000000020;
    *(undefined4 *)(puVar1 + 3) = 5;
    puRam0000000000a392e0 = puVar1 + 4;
  }
  else {
    puRam0000000000a392e0 = (undefined8 *)func_0x0014a284(0xa392d8,&uStack0000000000000020);
    if (lStack0000000000000030 < 0) {
      __ZdlPv(_uStack0000000000000020);
    }
  }
  if (cRam0000000000a39297 < '\0') {
    uRam0000000000a39288 = 2;
    puVar6 = (undefined2 *)
             CONCAT53(uRam0000000000a39283,CONCAT12(uRam0000000000a39282,uRam0000000000a39280));
    *puVar6 = 0x2a2f;
    *(undefined1 *)(puVar6 + 1) = 0;
  }
  else {
    cRam0000000000a39297 = '\x02';
    uRam0000000000a39280 = 0x2a2f;
    uRam0000000000a39282 = 0;
  }
  if (cRam0000000000a392af < '\0') {
    uRam0000000000a392a0 = 2;
    puVar6 = (undefined2 *)
             CONCAT53(uRam0000000000a3929b,CONCAT12(uRam0000000000a3929a,uRam0000000000a39298));
    *puVar6 = 0x2f2a;
    *(undefined1 *)(puVar6 + 1) = 0;
  }
  else {
    cRam0000000000a392af = '\x02';
    uRam0000000000a39298 = 0x2f2a;
    uRam0000000000a3929a = 0;
  }
  if (cRam0000000000a392c7 < '\0') {
    uRam0000000000a392b8 = 2;
    puVar6 = puRam0000000000a392b0;
  }
  else {
    puVar6 = (undefined2 *)0xa392b0;
    cRam0000000000a392c7 = '\x02';
  }
  *puVar6 = 0x2f2f;
  *(undefined1 *)(puVar6 + 1) = 0;
  uRam0000000000a392f0 = 1;
  uRam0000000000a392c9 = 1;
  if (cRam0000000000a39207 < '\0') {
    uRam0000000000a391f8 = 4;
    puVar7 = puRam0000000000a391f0;
  }
  else {
    cRam0000000000a39207 = '\x04';
    puVar7 = (undefined4 *)0xa391f0;
  }
  *puVar7 = 0x4c534c48;
  *(undefined1 *)(puVar7 + 1) = 0;
  *(undefined1 *)(unaff_x22 + 0xa9) = 1;
  return 0xa391f0;
}

