
void FUN_0004f250(long param_1)

{
  long *unaff_x19;
  
  *unaff_x19 = param_1 + 0x18;
  unaff_x19[0x34] = param_1 + 0x40;
  func_0x0001aa68(unaff_x19 + 1);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEED2Ev();
  __ZNSt3__19basic_iosIcNS_11char_traitsIcEEED2Ev(unaff_x19 + 0x34);
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

