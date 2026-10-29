/* 7ff70c8e8070 FUN_7ff70c8e8070 */

/* WARNING: Instruction at (ram,0x7ff70c8e8094) overlaps instruction at (ram,0x7ff70c8e8091)
    */
/* WARNING: Control flow encountered bad instruction data */

undefined8 * FUN_7ff70c8e8070(undefined8 *param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  bool bVar2;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 *puStack_28;
  undefined8 uStack_20;
  
  uStack_20 = 0xfffffffffffffffe;
  *(undefined4 *)(param_1 + 1) = 0;
  *param_1 = &UNK_7ff70cb255d8;
  param_1[2] = param_2;
  param_1[3] = 0x7ff70cbeb9e0;
  puStack_28 = (undefined8 *)FUN_7ff70ca8ff40(0xd8);
  uStack_40 = 0;
  uStack_38 = 2;
  uStack_30 = 0xf;
  uStack_48 = 0xa0d;
  FUN_7ff70c8c35a0(puStack_28,0,&uStack_48);
  param_1[5] = puStack_28;
  bVar2 = param_3 + -1 < 0;
  puStack_28 = param_1;
  if (param_3 == 1) {
    iVar1 = func_0x7ff70d6b051a(param_1[2],&uStack_48);
    if (!bVar2) {
                    /* WARNING: Bad instruction - Truncating control flow here */
      halt_baddata();
    }
    bVar2 = iVar1 != 0;
  }
  else {
    bVar2 = param_3 == 0;
  }
  *(bool *)(puStack_28 + 4) = bVar2;
  puStack_28[6] = 0xe000200030007;
  *(undefined4 *)(puStack_28 + 7) = 0x4f000c;
  *(undefined2 *)((longlong)puStack_28 + 0x3c) = 0;
  return puStack_28;
}


