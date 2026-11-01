
undefined8 FUN_006eb410(void)

{
  undefined8 uVar1;
  
  uVar1 = __Unwind_Resume();
  ___cxa_guard_abort(0xa28b70);
  uVar1 = __Unwind_Resume(uVar1);
  func_0x006e6f34(uVar1,"coroutine",&UNK_00a1c348);
  func_0x006e3af8(uVar1,&DAT_006eb49c,"resume",0,&DAT_006eb574);
  func_0x006e45a4(uVar1,0xfffffffe,"resume");
  return 1;
}

