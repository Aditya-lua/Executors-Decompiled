
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00147464(long param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined4 *puVar6;
  undefined2 *puVar7;
  ulong *unaff_x19;
  long unaff_x22;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined4 in_stack_00000038;
  
  puRam0000000000a39808 = (undefined8 *)(param_1 + 0x20);
  puVar1 = (undefined8 *)*unaff_x19;
  puVar2 = (undefined8 *)unaff_x19[1];
  uStack0000000000000020 = (char *)__Znwm(0x38);
  uVar5 = s__________________________________008d982b._24_8_;
  uVar4 = s__________________________________008d982b._16_8_;
  uVar3 = s__________________________________008d982b._0_8_;
  *(undefined8 *)(uStack0000000000000020 + 8) = s__________________________________008d982b._8_8_;
  *(undefined8 *)uStack0000000000000020 = uVar3;
  *(undefined8 *)(uStack0000000000000020 + 0x18) = uVar5;
  *(undefined8 *)(uStack0000000000000020 + 0x10) = uVar4;
  uVar3 = s__________________________________008d982b._32_8_;
  *(undefined8 *)(uStack0000000000000020 + 0x28) =
       s__________________________________008d982b._40_8_;
  *(undefined8 *)(uStack0000000000000020 + 0x20) = uVar3;
  uStack0000000000000020[0x30] = '\0';
  uVar3 = _UNK_00813420;
  in_stack_00000030 = _UNK_00813428;
  in_stack_00000028 = _UNK_00813420;
  in_stack_00000038 = 5;
  if (puVar1 < puVar2) {
    puVar1[2] = _UNK_00813428;
    puVar1[1] = uVar3;
    *puVar1 = uStack0000000000000020;
    *(undefined4 *)(puVar1 + 3) = 5;
    puRam0000000000a39808 = puVar1 + 4;
  }
  else {
    puRam0000000000a39808 = (undefined8 *)func_0x0014a284(0xa39800,&uStack0000000000000020);
    if (in_stack_00000030 < 0) {
      __ZdlPv(uStack0000000000000020);
    }
  }
  if (cRam0000000000a397bf < '\0') {
    uRam0000000000a397b0 = 4;
    puVar6 = puRam0000000000a397a8;
  }
  else {
    puVar6 = (undefined4 *)0xa397a8;
    cRam0000000000a397bf = '\x04';
  }
  *puVar6 = 0x5b5b2d2d;
  *(undefined1 *)(puVar6 + 1) = 0;
  if (cRam0000000000a397d7 < '\0') {
    uRam0000000000a397c8 = 2;
    puVar7 = (undefined2 *)
             CONCAT53(uRam0000000000a397c3,CONCAT12(uRam0000000000a397c2,uRam0000000000a397c0));
    *puVar7 = 0x5d5d;
    *(undefined1 *)(puVar7 + 1) = 0;
  }
  else {
    cRam0000000000a397d7 = '\x02';
    uRam0000000000a397c0 = 0x5d5d;
    uRam0000000000a397c2 = 0;
  }
  if (cRam0000000000a397ef < '\0') {
    uRam0000000000a397e0 = 2;
    puVar7 = puRam0000000000a397d8;
  }
  else {
    cRam0000000000a397ef = '\x02';
    puVar7 = (undefined2 *)0xa397d8;
  }
  *puVar7 = 0x2d2d;
  *(undefined1 *)(puVar7 + 1) = 0;
  uRam0000000000a39818 = 1;
  uRam0000000000a397f1 = 0;
  if (cRam0000000000a3972f < '\0') {
    uRam0000000000a39720 = 3;
    puVar6 = puRam0000000000a39718;
  }
  else {
    cRam0000000000a3972f = '\x03';
    puVar6 = (undefined4 *)0xa39718;
  }
  *puVar6 = 0x61754c;
  *(undefined1 *)(unaff_x22 + 0xae) = 1;
  return 0xa39718;
}

