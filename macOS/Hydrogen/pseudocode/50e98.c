
/* WARNING: Removing unreachable block (ram,0x0074122c) */

undefined8 FUN_00050e98(void)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  long *unaff_x19;
  
  __ZdlPv();
  uVar2 = __Unwind_Resume();
  __ZdlPv();
  uVar2 = __Unwind_Resume(uVar2);
  lVar3 = *unaff_x19;
  *unaff_x19 = 0;
  if (lVar3 == 0) {
    __ZdlPv();
    __Unwind_Resume(uVar2);
  }
  __ZNSt3__115__thread_structD1Ev();
  __ZdlPv();
  __ZdlPv();
  __Unwind_Resume(uVar2);
  LOAcquire();
  if (iRam0000000000a40880 != 0) {
    do {
      Yield();
    } while( true );
  }
  iRam0000000000a40880 = 1;
  if (iRam0000000000a40884 == 0) {
    puRam0000000000a2b5e8 = PTR__malloc_009b0448;
    puRam0000000000a2b5f0 = PTR__free_009b0220;
    puRam0000000000a2b5f8 = PTR__realloc_009b0458;
    puRam0000000000a2b600 = PTR__strdup_009b0468;
    puRam0000000000a2b608 = PTR__calloc_009b0210;
    iRam0000000000a40884 = iRam0000000000a40884 + 1;
    iVar1 = func_0x0015e2a8(3);
    if ((((iVar1 != 0) || (iVar1 = func_0x00793850(), iVar1 == 0)) ||
        (iVar1 = func_0x0075e74c(), iVar1 != 0)) || (uVar2 = func_0x0015e2a8(), (int)uVar2 != 0)) {
      iRam0000000000a40884 = iRam0000000000a40884 + -1;
      iRam0000000000a40880 = 0;
      return 2;
    }
  }
  else {
    uVar2 = 0;
    iRam0000000000a40884 = iRam0000000000a40884 + 1;
  }
  iRam0000000000a40880 = 0;
  return uVar2;
}

