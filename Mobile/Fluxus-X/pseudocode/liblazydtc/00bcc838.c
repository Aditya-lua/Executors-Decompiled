/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc838
 */

/* std::__ndk1::promise<void>::~promise() */

void __thiscall std::__ndk1::promise<void>::~promise(promise<void> *this)

{
  int iVar1;
  logic_error *this_00;
  void *extraout_x1;
  __assoc_sub_state *p_Var2;
  long lVar3;
  future_error afStack_58 [16];
  undefined8 local_48;
  undefined8 uStack_40;
  exception_ptr aeStack_38 [8];
  undefined8 local_18;
  
  p_Var2 = *(__assoc_sub_state **)this;
  if (p_Var2 != (__assoc_sub_state *)0x0) {
    if (((byte)p_Var2[0x70] & 1) == 0) {
      lVar3 = *(long *)(p_Var2 + 0x10);
      local_18 = 0;
      exception_ptr::~exception_ptr((exception_ptr *)&local_18);
      p_Var2 = *(__assoc_sub_state **)this;
      if ((lVar3 == 0) && (0 < *(long *)(p_Var2 + 8))) {
        if (((DAT_00d26700 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d26700), iVar1 != 0)) {
          __cxa_guard_release(&DAT_00d26700);
        }
        future_error::future_error(afStack_58,4,&PTR_PTR_00cca5f0);
        this_00 = (logic_error *)__cxa_allocate_exception(0x20);
        __cxa_init_primary_exception(this_00,&future_error::typeinfo,FUN_00bccc04);
        logic_error::logic_error(this_00,(logic_error *)afStack_58);
        *(undefined ***)this_00 = &PTR__future_error_00cacb08;
        *(undefined8 *)(this_00 + 0x18) = uStack_40;
        *(undefined8 *)(this_00 + 0x10) = local_48;
        exception_ptr::__from_native_exception_pointer((exception_ptr *)this_00,extraout_x1);
                    /* try { // try from 00bcc8fc to 00bcc907 has its CatchHandler @ 00bcc974 */
        __assoc_sub_state::set_exception(p_Var2,aeStack_38);
        exception_ptr::~exception_ptr(aeStack_38);
        future_error::~future_error(afStack_58);
        p_Var2 = *(__assoc_sub_state **)this;
      }
    }
    lVar3 = FUN_00c2bd10(0xffffffffffffffff,p_Var2 + 8);
    if (lVar3 == 0) {
      (**(code **)(*(long *)p_Var2 + 0x10))(p_Var2);
    }
  }
  return;
}

