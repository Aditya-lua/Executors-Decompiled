void FUN_180c5a500(undefined8 param_1,longlong param_2,longlong param_3)

{
  longlong lVar1;
  longlong lVar2;
  undefined8 unaff_RBX;
  undefined8 unaff_RSI;
  undefined8 unaff_RDI;
  undefined *puVar3;
  ulonglong uVar4;
  undefined8 auStackX_18 [2];
  
  lVar2 = FUN_180e15b20();
  lVar2 = -lVar2;
  puVar3 = &UNK_180f8aeb8;
  uVar4 = 0x7d;
  if (param_2 != 0) {
    *(undefined8 *)((longlong)auStackX_18 + lVar2 + 0x18) = unaff_RBX;
    *(undefined8 *)((longlong)auStackX_18 + lVar2 + 0x20) = unaff_RSI;
    *(undefined8 *)((longlong)auStackX_18 + lVar2 + 8) = unaff_RDI;
    *(undefined8 *)((longlong)auStackX_18 + lVar2) = 0x180c144fa;
    lVar1 = FUN_180e15b20(param_2,param_3,&UNK_180f8aeb8,0x7d);
    if (param_3 != 0) {
      *(undefined8 *)((longlong)auStackX_18 + -lVar1 + lVar2) = 0x180c14510;
      func_0x000180001240();
    }
    if (pcRam00000001810bd260 != FUN_180c14420) {
                    /* WARNING: Could not recover jumptable at 0x000180c1453b. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*pcRam00000001810bd260)(param_2,puVar3,uVar4 & 0xffffffff);
      return;
    }
    *(undefined8 *)((longlong)auStackX_18 + -lVar1 + lVar2) = 0x180c14543;
    func_0x000180e1d9d0(param_2);
  }
  return;
}

