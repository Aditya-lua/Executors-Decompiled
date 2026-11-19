/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c068e0
 */

/* std::__ndk1::__time_get_storage<char>::init(std::__ndk1::ctype<char> const&) */

void std::__ndk1::__time_get_storage<char>::init(ctype *param_1)

{
  char cVar1;
  ctype *pcVar2;
  long lVar3;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 local_f0;
  char acStack_e4 [100];
  tm local_80;
  
  lVar3 = 0;
  pcVar2 = param_1 + 0xb0;
  local_80.tm_zone = (char *)0x0;
  local_80.tm_wday = 0;
  local_80.tm_yday = 0;
  local_80.tm_mon = 0;
  local_80.tm_year = 0;
  local_80.tm_gmtoff = 0;
  local_80.tm_isdst = 0;
  local_80._36_4_ = 0;
  local_80.tm_hour = 0;
  local_80.tm_mday = 0;
  local_80.tm_sec = 0;
  local_80.tm_min = 0;
  do {
    local_80.tm_wday = (int)lVar3;
    strftime_l(acStack_e4,100,"%A",&local_80,*(__locale_t *)param_1);
    FUN_0080269c(pcVar2 + -0xa8,acStack_e4);
    strftime_l(acStack_e4,100,"%a",&local_80,*(__locale_t *)param_1);
    FUN_0080269c(pcVar2,acStack_e4);
    lVar3 = lVar3 + 1;
    pcVar2 = pcVar2 + 0x18;
  } while (lVar3 != 7);
  lVar3 = 0;
  pcVar2 = param_1 + 0x278;
  do {
    local_80.tm_mon = (int)lVar3;
    strftime_l(acStack_e4,100,"%B",&local_80,*(__locale_t *)param_1);
    FUN_0080269c(pcVar2 + -0x120,acStack_e4);
    strftime_l(acStack_e4,100,"%b",&local_80,*(__locale_t *)param_1);
    FUN_0080269c(pcVar2,acStack_e4);
    lVar3 = lVar3 + 1;
    pcVar2 = pcVar2 + 0x18;
  } while (lVar3 != 0xc);
  local_80.tm_hour = 1;
  strftime_l(acStack_e4,100,"%p",&local_80,*(__locale_t *)param_1);
  FUN_0080269c(param_1 + 0x398,acStack_e4);
  local_80.tm_hour = 0xd;
  strftime_l(acStack_e4,100,"%p",&local_80,*(__locale_t *)param_1);
  FUN_0080269c(param_1 + 0x3b0,acStack_e4);
  cVar1 = (char)param_1;
  __analyze(cVar1,(ctype *)0x63);
  if (((byte)param_1[0x3c8] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x3d8),*(ulong *)(param_1 + 0x3c8) & 0xfffffffffffffffe);
  }
  *(undefined8 *)(param_1 + 0x3d8) = local_f0;
  *(undefined8 *)(param_1 + 0x3d0) = uStack_f8;
  *(undefined8 *)(param_1 + 0x3c8) = local_100;
  __analyze(cVar1,(ctype *)0x72);
  if (((byte)param_1[0x3e0] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x3f0),*(ulong *)(param_1 + 0x3e0) & 0xfffffffffffffffe);
  }
  *(undefined8 *)(param_1 + 0x3f0) = local_f0;
  *(undefined8 *)(param_1 + 1000) = uStack_f8;
  *(undefined8 *)(param_1 + 0x3e0) = local_100;
  __analyze(cVar1,(ctype *)0x78);
  if (((byte)param_1[0x3f8] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x408),*(ulong *)(param_1 + 0x3f8) & 0xfffffffffffffffe);
  }
  *(undefined8 *)(param_1 + 0x408) = local_f0;
  *(undefined8 *)(param_1 + 0x400) = uStack_f8;
  *(undefined8 *)(param_1 + 0x3f8) = local_100;
  __analyze(cVar1,(ctype *)0x58);
  if (((byte)param_1[0x410] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x420),*(ulong *)(param_1 + 0x410) & 0xfffffffffffffffe);
  }
  *(undefined8 *)(param_1 + 0x418) = uStack_f8;
  *(undefined8 *)(param_1 + 0x410) = local_100;
  *(undefined8 *)(param_1 + 0x420) = local_f0;
  return;
}

