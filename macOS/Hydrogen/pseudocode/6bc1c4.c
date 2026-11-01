
void FUN_006bc1c4(undefined8 param_1,char *param_2,long param_3)

{
  char cVar1;
  long lVar2;
  
  lVar2 = _memchr(param_2,0x25);
  if (lVar2 == 0) {
                    /* WARNING: Could not recover jumptable at 0x007b2b60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)
      PTR___ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm_00a24850)
              (param_1,param_2,param_3);
    return;
  }
  for (; param_3 != 0; param_3 = param_3 + -1) {
    cVar1 = *param_2;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
              (param_1,(long)cVar1);
    if (cVar1 == '%') {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(param_1,0x25);
    }
    param_2 = param_2 + 1;
  }
  return;
}

