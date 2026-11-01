
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0008c1e0(char *param_1,long param_2)

{
  undefined8 uVar1;
  
  *(undefined8 *)(param_2 + 0xa68) = param_1;
  uVar1 = _UNK_007fc140;
  *(undefined8 *)(param_2 + 0xa78) = _UNK_007fc148;
  *(undefined8 *)(param_2 + 0xa70) = uVar1;
  uVar1 = s_NGCEBBNXvvDcHTlORGKDDsRCcR_008cf03f._0_8_;
  *(ulong *)(param_1 + 8) =
       CONCAT62(s_NGCEBBNXvvDcHTlORGKDDsRCcR_008cf03f._10_6_,
                s_NGCEBBNXvvDcHTlORGKDDsRCcR_008cf03f._8_2_);
  *(undefined8 *)param_1 = uVar1;
  uVar1 = CONCAT26(s_NGCEBBNXvvDcHTlORGKDDsRCcR_008cf03f._16_2_,
                   s_NGCEBBNXvvDcHTlORGKDDsRCcR_008cf03f._10_6_);
  *(undefined8 *)(param_1 + 0x12) = s_NGCEBBNXvvDcHTlORGKDDsRCcR_008cf03f._18_8_;
  *(undefined8 *)(param_1 + 10) = uVar1;
  param_1[0x1a] = '\0';
  ___cxa_atexit(PTR___ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev_009b0078,
                (undefined8 *)(param_2 + 0xa68),0);
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_guard_release_00a24b40)(0xa28a80);
  return;
}

