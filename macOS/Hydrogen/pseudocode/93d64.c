
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_00093d64(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  
  uVar3 = __Unwind_Resume();
  ___cxa_guard_abort(0xa28b70);
  puVar4 = (undefined8 *)__Unwind_Resume(uVar3);
  uVar2 = _UNK_0080bb58;
  uVar1 = _UNK_0080bb50;
  uVar3 = _UNK_0080bb40;
  puVar4[1] = _UNK_0080bb48;
  *puVar4 = uVar3;
  puVar4[3] = uVar2;
  puVar4[2] = uVar1;
  uVar2 = _UNK_0080bb78;
  uVar1 = _UNK_0080bb70;
  uVar3 = _UNK_0080bb60;
  puVar4[5] = _UNK_0080bb68;
  puVar4[4] = uVar3;
  puVar4[7] = uVar2;
  puVar4[6] = uVar1;
  _memcpy(puVar4 + 8,&UNK_0080bb80,0x280);
  *(undefined4 *)(puVar4 + 0x58) = 0x10;
  puVar4[0x59] = 8;
  uVar2 = _UNK_0080bb28;
  uVar1 = _UNK_0080bb20;
  uVar3 = _UNK_0080bb10;
  puVar4[0x5b] = _UNK_0080bb18;
  puVar4[0x5a] = uVar3;
  puVar4[0x5d] = uVar2;
  puVar4[0x5c] = uVar1;
  uVar3 = _UNK_0080bb30;
  puVar4[0x5f] = _UNK_0080bb38;
  puVar4[0x5e] = uVar3;
  return puVar4;
}

