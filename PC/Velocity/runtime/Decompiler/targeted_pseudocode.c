/* Ghidra static pseudocode. Original symbols unavailable. */

/* address=1407041b0 name=tls_callback_0 */

void tls_callback_0(undefined8 param_1,int param_2)

{
  longlong *plVar1;
  longlong lVar2;
  undefined8 uVar3;
  code *pcVar4;
  ulonglong uVar5;
  longlong lVar6;
  longlong local_20;
  undefined8 local_18;
  
  local_18 = 0xfffffffffffffffe;
  if ((param_2 == 3) || (param_2 == 0)) {
    lVar6 = *(longlong *)
             (*(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_tls_index * 8) + 400);
    while( true ) {
      if (lVar6 != 0) {
                    /* WARNING: Subroutine does not return */
        FUN_14071c070(&PTR_s_library_std_src_sys_thread_local_1407eda88);
      }
      lVar6 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_tls_index * 8);
      *(undefined8 *)(lVar6 + 400) = 0xffffffffffffffff;
      lVar6 = *(longlong *)(lVar6 + 0x1a8);
      if (lVar6 == 0) break;
      lVar6 = lVar6 + -1;
      lVar2 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_tls_index * 8);
      *(longlong *)(lVar2 + 0x1a8) = lVar6;
      lVar6 = lVar6 * 0x10;
      uVar3 = *(undefined8 *)(*(longlong *)(lVar2 + 0x1a0) + lVar6);
      pcVar4 = *(code **)(*(longlong *)(lVar2 + 0x1a0) + 8 + lVar6);
      *(undefined8 *)(lVar2 + 400) = 0;
      (*pcVar4)(uVar3);
      lVar6 = *(longlong *)(lVar2 + 400);
    }
    lVar6 = *(longlong *)
             (*(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_tls_index * 8) + 0x198
             );
    if (lVar6 == 0) {
      lVar6 = 0;
    }
    else {
      lVar2 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_tls_index * 8);
      thunk_FUN_1406ff1b0(*(undefined8 *)(lVar2 + 0x1a0),lVar6 << 4,8);
      lVar6 = *(longlong *)(lVar2 + 400) + 1;
    }
    lVar2 = *(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_tls_index * 8);
    *(undefined8 *)(lVar2 + 0x198) = 0;
    *(undefined8 *)(lVar2 + 0x1a0) = 8;
    *(undefined8 *)(lVar2 + 0x1a8) = 0;
    *(longlong *)(lVar2 + 400) = lVar6;
    uVar5 = *(ulonglong *)(lVar2 + 0x1f8);
    if (2 < uVar5) {
      *(undefined8 *)
       (*(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_tls_index * 8) + 0x1f8) = 2;
      local_20 = uVar5 - 0x10;
      LOCK();
      plVar1 = (longlong *)(uVar5 - 0x10);
      *plVar1 = *plVar1 + -1;
      UNLOCK();
      if (*plVar1 == 0) {
        FUN_1406f3cb0(&local_20);
      }
    }
  }
  return;
}



/* address=140719ccc name=entry */

void entry(void)

{
  __security_init_cookie();
  FUN_140719b50();
  return;
}



/* functions_emitted=2 */
