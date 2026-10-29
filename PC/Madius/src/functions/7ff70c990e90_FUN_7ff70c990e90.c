/* 7ff70c990e90 FUN_7ff70c990e90 */

undefined8 FUN_7ff70c990e90(ulonglong param_1,undefined8 param_2)

{
  uint uVar1;
  undefined *puVar2;
  
  if ((longlong)param_1 < 100000) {
    puVar2 = &UNK_7ff70cb88868;
  }
  else if (param_1 < 0x9c4000) {
    param_1 = param_1 >> 10;
    puVar2 = &UNK_7ff70cb8517e;
  }
  else if (param_1 < 0x6400000) {
    param_1 = param_1 >> 0x14;
    puVar2 = &UNK_7ff70cb89f62;
  }
  else if (param_1 >> 0x18 < 0x271) {
    param_1 = param_1 >> 0x14;
    puVar2 = &UNK_7ff70cb89f5a;
  }
  else {
    uVar1 = (uint)(param_1 >> 0x20);
    if (uVar1 < 0x19) {
      param_1 = param_1 >> 0x1e;
      puVar2 = &UNK_7ff70cb8a2a3;
    }
    else if (uVar1 >> 2 < 0x271) {
      param_1 = param_1 >> 0x1e;
      puVar2 = &UNK_7ff70cb8a29b;
    }
    else if (uVar1 >> 0xc < 0x271) {
      param_1 = param_1 >> 0x28;
      puVar2 = &UNK_7ff70cb898ce;
    }
    else {
      param_1 = param_1 >> 0x32;
      puVar2 = &UNK_7ff70cb89cab;
    }
  }
  FUN_7ff70c95c190(param_2,6,puVar2,param_1);
  return param_2;
}


