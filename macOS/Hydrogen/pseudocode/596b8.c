
void FUN_000596b8(long param_1)

{
  long lVar1;
  long lVar2;
  
  __ZNSt3__15mutex4lockEv(param_1 + 0x78);
  *(undefined1 *)(param_1 + 0x38) = 1;
  __ZNSt3__15mutex6unlockEv(param_1 + 0x78);
  __ZNSt3__118condition_variable10notify_allEv(param_1 + 0x48);
  lVar2 = *(long *)(param_1 + 0x10);
  for (lVar1 = *(long *)(param_1 + 8); lVar1 != lVar2; lVar1 = lVar1 + 8) {
    __ZNSt3__16thread4joinEv(lVar1);
  }
  return;
}

