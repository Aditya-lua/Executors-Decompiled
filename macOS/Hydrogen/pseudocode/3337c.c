
undefined8 * FUN_0003337c(long param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long *unaff_x23;
  long *unaff_x28;
  
  *unaff_x23 = param_1 + 0x50;
  if (unaff_x28 != (long *)0x0) {
    (**(code **)(*unaff_x28 + 8))();
  }
  __ZdlPv();
  __Unwind_Resume();
  uVar1 = ___cxa_allocate_exception(0x18);
  __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar1,8);
  uVar2 = ___cxa_throw(uVar1,PTR___ZTINSt3__111regex_errorE_009b00f0,
                       PTR___ZNSt3__111regex_errorD1Ev_009b0070);
  ___cxa_free_exception(uVar1);
  __Unwind_Resume(uVar2);
  uVar1 = ___cxa_allocate_exception(0x18);
  __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar1,7);
  uVar2 = ___cxa_throw(uVar1,PTR___ZTINSt3__111regex_errorE_009b00f0,
                       PTR___ZNSt3__111regex_errorD1Ev_009b0070);
  ___cxa_free_exception(uVar1);
  puVar3 = (undefined8 *)__Unwind_Resume(uVar2);
  *puVar3 = &UNK_009b34d0;
  if ((long *)puVar3[2] != (long *)0x0) {
    (**(code **)(*(long *)puVar3[2] + 8))();
  }
  *puVar3 = &UNK_009b3050;
  if ((long *)puVar3[1] != (long *)0x0) {
    (**(code **)(*(long *)puVar3[1] + 8))();
  }
  return puVar3;
}

