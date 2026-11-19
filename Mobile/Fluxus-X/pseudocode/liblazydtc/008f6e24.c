/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f6e24
 */

/* void std::__ndk1::__assoc_state<cpr::Response>::set_value<cpr::Response>(cpr::Response&&) */

void __thiscall
std::__ndk1::__assoc_state<cpr::Response>::set_value<cpr::Response>
          (__assoc_state<cpr::Response> *this,Response *param_1)

{
  __assoc_state<cpr::Response> _Var1;
  long lVar2;
  future_error *pfVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  mutex::lock((mutex *)(this + 0x18));
  if (((byte)this[0x70] & 1) == 0) {
    local_50 = 0;
    lVar6 = *(long *)(this + 0x10);
    exception_ptr::~exception_ptr((exception_ptr *)&local_50);
    if (lVar6 == 0) {
      *(undefined8 *)(this + 0x78) = *(undefined8 *)param_1;
      *(undefined8 *)(this + 0x80) = *(undefined8 *)(param_1 + 8);
      *(undefined8 *)param_1 = 0;
      *(undefined8 *)(param_1 + 8) = 0;
      *(undefined8 *)(this + 0x88) = *(undefined8 *)(param_1 + 0x10);
      *(undefined8 *)(this + 0xa0) = *(undefined8 *)(param_1 + 0x28);
      uVar4 = *(undefined8 *)(param_1 + 0x18);
      *(undefined8 *)(this + 0x98) = *(undefined8 *)(param_1 + 0x20);
      *(undefined8 *)(this + 0x90) = uVar4;
      *(undefined8 *)(param_1 + 0x18) = 0;
      *(undefined8 *)(param_1 + 0x20) = 0;
      *(undefined8 *)(param_1 + 0x28) = 0;
      *(undefined8 *)(this + 0xa8) = *(undefined8 *)(param_1 + 0x30);
      lVar6 = *(long *)(param_1 + 0x38);
      *(long *)(this + 0xb0) = lVar6;
      lVar5 = *(long *)(param_1 + 0x40);
      *(long *)(this + 0xb8) = lVar5;
      if (lVar5 == 0) {
        *(__assoc_state<cpr::Response> **)(this + 0xa8) = this + 0xb0;
      }
      else {
        *(__assoc_state<cpr::Response> **)(lVar6 + 0x10) = this + 0xb0;
        *(undefined8 *)(param_1 + 0x38) = 0;
        *(Response **)(param_1 + 0x30) = param_1 + 0x38;
        *(undefined8 *)(param_1 + 0x40) = 0;
      }
      *(undefined ***)(this + 0xc0) = &PTR_LAB_00c489d0;
      *(undefined8 *)(this + 0xd8) = *(undefined8 *)(param_1 + 0x60);
      uVar4 = *(undefined8 *)(param_1 + 0x50);
      *(undefined8 *)(this + 0xd0) = *(undefined8 *)(param_1 + 0x58);
      *(undefined8 *)(this + 200) = uVar4;
      *(undefined8 *)(param_1 + 0x50) = 0;
      *(undefined8 *)(param_1 + 0x58) = 0;
      *(undefined8 *)(param_1 + 0x60) = 0;
      *(undefined ***)(this + 0xc0) = &PTR_LAB_00c48988;
      *(undefined8 *)(this + 0xe0) = *(undefined8 *)(param_1 + 0x68);
      _Var1 = *(__assoc_state<cpr::Response> *)(param_1 + 0x70);
      *(undefined8 *)(this + 0xf8) = 0;
      *(undefined8 *)(this + 0x100) = 0;
      *(undefined8 *)(this + 0xf0) = 0;
      this[0xe8] = _Var1;
      *(undefined8 *)(this + 0xf0) = *(undefined8 *)(param_1 + 0x78);
      *(undefined8 *)(this + 0xf8) = *(undefined8 *)(param_1 + 0x80);
      *(undefined8 *)(this + 0x100) = *(undefined8 *)(param_1 + 0x88);
      *(undefined8 *)(param_1 + 0x80) = 0;
      *(undefined8 *)(param_1 + 0x88) = 0;
      *(undefined8 *)(param_1 + 0x78) = 0;
      *(undefined4 *)(this + 0x108) = *(undefined4 *)(param_1 + 0x90);
      *(undefined8 *)(this + 0x120) = *(undefined8 *)(param_1 + 0xa8);
      uVar4 = *(undefined8 *)(param_1 + 0x98);
      *(undefined8 *)(this + 0x118) = *(undefined8 *)(param_1 + 0xa0);
      *(undefined8 *)(this + 0x110) = uVar4;
      uVar4 = *(undefined8 *)(param_1 + 0xb0);
      *(undefined8 *)(param_1 + 0xa0) = 0;
      *(undefined8 *)(param_1 + 0xa8) = 0;
      *(undefined8 *)(param_1 + 0x98) = 0;
      *(undefined8 *)(this + 0x130) = *(undefined8 *)(param_1 + 0xb8);
      *(undefined8 *)(this + 0x128) = uVar4;
      *(undefined8 *)(this + 0x138) = *(undefined8 *)(param_1 + 0xc0);
      *(undefined8 *)(param_1 + 0xb8) = 0;
      *(undefined8 *)(param_1 + 0xc0) = 0;
      *(undefined8 *)(param_1 + 0xb0) = 0;
      *(undefined8 *)(this + 0x150) = *(undefined8 *)(param_1 + 0xd8);
      uVar4 = *(undefined8 *)(param_1 + 200);
      *(undefined8 *)(this + 0x148) = *(undefined8 *)(param_1 + 0xd0);
      *(undefined8 *)(this + 0x140) = uVar4;
      *(undefined8 *)(param_1 + 200) = 0;
      *(undefined8 *)(param_1 + 0xd0) = 0;
      *(undefined8 *)(param_1 + 0xd8) = 0;
      *(undefined8 *)(this + 0x168) = *(undefined8 *)(param_1 + 0xf0);
      uVar4 = *(undefined8 *)(param_1 + 0xe0);
      *(undefined8 *)(this + 0x160) = *(undefined8 *)(param_1 + 0xe8);
      *(undefined8 *)(this + 0x158) = uVar4;
      *(undefined8 *)(param_1 + 0xe8) = 0;
      *(undefined8 *)(param_1 + 0xf0) = 0;
      *(undefined8 *)(param_1 + 0xe0) = 0;
      *(undefined8 *)(this + 0x180) = *(undefined8 *)(param_1 + 0x108);
      uVar7 = *(undefined8 *)(param_1 + 0x100);
      uVar4 = *(undefined8 *)(param_1 + 0xf8);
      *(uint *)(this + 0x70) = *(uint *)(this + 0x70) | 5;
      *(undefined8 *)(this + 0x178) = uVar7;
      *(undefined8 *)(this + 0x170) = uVar4;
      condition_variable::notify_all((condition_variable *)(this + 0x40));
      mutex::unlock((mutex *)(this + 0x18));
      if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  }
  pfVar3 = (future_error *)__cxa_allocate_exception(0x20);
  uVar4 = future_category();
                    /* try { // try from 008f7034 to 008f703f has its CatchHandler @ 008f7064 */
  future_error::future_error(pfVar3,2,uVar4);
                    /* try { // try from 008f7040 to 008f7057 has its CatchHandler @ 008f705c */
                    /* WARNING: Subroutine does not return */
  __cxa_throw(pfVar3,&future_error::typeinfo,future_error::~future_error);
}

