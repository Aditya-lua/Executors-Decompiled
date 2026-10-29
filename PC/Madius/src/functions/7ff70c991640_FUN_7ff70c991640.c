/* 7ff70c991640 FUN_7ff70c991640 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c991640(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  int *piVar2;
  undefined1 *puVar3;
  int unaff_EBP;
  int unaff_EDI;
  bool bVar4;
  bool bVar5;
  
  bVar5 = SBORROW8((longlong)&stack0xffffffffffffffd8,0x240);
  bVar4 = &stack0x00000000 == (undefined1 *)0x268;
  puVar3 = (undefined1 *)func_0x7ff70d685bab();
  if (bVar5) {
    if (bVar4) {
      *puVar3 = 0;
      piVar2 = (int *)(*_DAT_7ff70cb964a0)();
      iVar1 = *piVar2;
    }
    else {
      piVar2 = (int *)(*_DAT_7ff70cb964a0)();
      iVar1 = *piVar2;
    }
    if (iVar1 == unaff_EBP) {
      iVar1 = func_0x7ff70d9a2c4e();
    }
    else {
      piVar2 = (int *)(*_DAT_7ff70cb964a0)();
      *piVar2 = unaff_EBP;
      iVar1 = func_0x7ff70d935119();
    }
    if (unaff_EDI != iVar1) {
      func_0x7ff70d644f72(unaff_EDI);
    }
    return param_2;
  }
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}


