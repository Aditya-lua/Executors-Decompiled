/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfbb08
 */

/* std::__ndk1::collate_byname<char>::do_compare(char const*, char const*, char const*, char const*)
   const */

uint __thiscall
std::__ndk1::collate_byname<char>::do_compare
          (collate_byname<char> *this,char *param_1,char *param_2,char *param_3,char *param_4)

{
  char *__s2;
  char *pcVar1;
  ulong uVar2;
  char *pcVar3;
  int iVar4;
  uint uVar5;
  ulong uVar6;
  ulong uVar7;
  char *pcVar8;
  undefined8 local_80;
  ulong local_78;
  char *local_70;
  undefined8 local_68;
  ulong local_60;
  char *local_58;
  
  uVar7 = (long)param_2 - (long)param_1;
  if (0xfffffffffffffff7 < uVar7) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (uVar7 < 0x17) {
    pcVar8 = (char *)((ulong)&local_68 | 1);
    local_68 = CONCAT71(local_68._1_7_,(char)((int)uVar7 << 1));
  }
  else {
    uVar6 = 0x1a;
    if ((uVar7 | 7) != 0x17) {
      uVar6 = (uVar7 | 7) + 1;
    }
    pcVar8 = operator_new(uVar6);
    local_68 = uVar6 | 1;
    local_60 = uVar7;
    local_58 = pcVar8;
  }
  if (param_2 != param_1) {
    memcpy(pcVar8,param_1,uVar7);
  }
  uVar6 = (long)param_4 - (long)param_3;
  pcVar8[uVar7] = '\0';
  if (0xfffffffffffffff7 < uVar6) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bfbcb0 to 00bfbcb3 has its CatchHandler @ 00bfbcb4 */
    FUN_007fe124();
  }
  if (uVar6 < 0x17) {
    pcVar8 = (char *)((ulong)&local_80 | 1);
    local_80 = CONCAT71(local_80._1_7_,(char)((int)uVar6 << 1));
  }
  else {
    uVar7 = 0x1a;
    if ((uVar6 | 7) != 0x17) {
      uVar7 = (uVar6 | 7) + 1;
    }
                    /* try { // try from 00bfbc88 to 00bfbc8f has its CatchHandler @ 00bfbcb4 */
    pcVar8 = operator_new(uVar7);
    local_80 = uVar7 | 1;
    local_78 = uVar6;
    local_70 = pcVar8;
  }
  if (param_4 != param_3) {
    memcpy(pcVar8,param_3,uVar6);
  }
  pcVar3 = local_58;
  uVar2 = local_68;
  pcVar1 = local_70;
  uVar7 = local_80;
  pcVar8[uVar6] = '\0';
  pcVar8 = local_58;
  if ((local_68 & 1) == 0) {
    pcVar8 = (char *)((long)&local_68 + 1);
  }
  __s2 = local_70;
  if ((local_80 & 1) == 0) {
    __s2 = (char *)((long)&local_80 + 1);
  }
  iVar4 = strcoll_l(pcVar8,__s2,*(__locale_t *)(this + 0x10));
  if ((uVar7 & 1) != 0) {
    operator_delete(pcVar1,local_80 & 0xfffffffffffffffe);
  }
  if ((uVar2 & 1) != 0) {
    operator_delete(pcVar3,local_68 & 0xfffffffffffffffe);
  }
  uVar5 = (uint)(iVar4 != 0);
  if (iVar4 < 0) {
    uVar5 = 0xffffffff;
  }
  return uVar5;
}

