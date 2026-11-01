
ulong FUN_0042fee4(void)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined1 uStack0000000000000008;
  undefined1 uStack000000000000001c;
  undefined8 uStack0000000000000020;
  
  uVar2 = _pthread_mutexattr_destroy(&uStack0000000000000008);
  _uStack000000000000001c = (int)uVar2;
  if (_uStack000000000000001c == 0) {
    return uVar2;
  }
  uStack0000000000000020 = 0;
  uVar3 = func_0x0079ffdc(0,&uStack000000000000001c,&UNK_0081a9a8,&uStack0000000000000020,
                          &UNK_009db8e8);
  func_0x003f67e4(&uStack0000000000000020);
  func_0x003f6f90(&uStack0000000000000008);
  __Unwind_Resume(uVar3);
  func_0x007a2668();
  uVar2 = _pthread_mutex_lock();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  func_0x007a1368();
  iVar1 = _pthread_mutex_trylock();
  return (ulong)(iVar1 == 0);
}

