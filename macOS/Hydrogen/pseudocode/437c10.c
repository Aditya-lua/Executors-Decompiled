
void FUN_00437c10(undefined8 param_1)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  
  uStack0000000000000008 = 1;
  uStack0000000000000018 = 0;
  uStack0000000000000020 = 0;
  uStack0000000000000010 = 8;
  uStack0000000000000000 = param_1;
  func_0x007a2420();
  plVar2 = (long *)func_0x007a247c(&UNK_008871ac,0x30,&UNK_009db860);
  lVar3 = *plVar2;
  *plVar2 = 0;
  if ((lVar3 == 0) || (iVar1 = _pthread_mutex_trylock(lVar3), iVar1 != 0)) {
    return;
  }
  _pthread_mutex_unlock(lVar3);
  _pthread_mutex_destroy(lVar3);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,0x40,8);
  return;
}

