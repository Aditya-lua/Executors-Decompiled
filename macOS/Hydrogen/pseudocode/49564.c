
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00049564(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *puVar5;
  
  __ZdlPv();
  uVar3 = __Unwind_Resume(param_1);
  __ZNSt9exceptionD2Ev();
  __ZdlPv();
  ___cxa_free_exception();
  uVar3 = __Unwind_Resume(uVar3);
  ___cxa_free_exception();
  lVar4 = __Unwind_Resume(uVar3);
  uVar2 = _UNK_008c67a8;
  uVar1 = _UNK_008c67a0;
  uVar3 = _UNK_008c6790;
  puVar5 = *(undefined8 **)(lVar4 + 200);
  puVar5[1] = _UNK_008c6798;
  *puVar5 = uVar3;
  puVar5[3] = uVar2;
  puVar5[2] = uVar1;
  return;
}

