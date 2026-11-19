/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00960438
 */

ulong FUN_00960438(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  long lVar1;
  __uid_t __uid;
  int iVar2;
  ulong uVar3;
  char *pcVar4;
  long lVar5;
  char *pcVar6;
  passwd *local_490;
  passwd pStack_488;
  char acStack_458 [1024];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (param_4 != 0) {
    uVar3 = FUN_00960580(param_1,param_2,param_3);
    if (*(long *)(lVar1 + 0x28) == local_58) {
      return uVar3;
    }
    goto LAB_0096057c;
  }
  pcVar4 = (char *)curl_getenv(&DAT_002cb1bc);
  pcVar6 = pcVar4;
  if (pcVar4 == (char *)0x0) {
    __uid = geteuid();
    iVar2 = getpwuid_r(__uid,&pStack_488,acStack_458,0x400,&local_490);
    uVar3 = 1;
    if (((iVar2 == 0) && (local_490 != (passwd *)0x0)) &&
       (pcVar6 = pStack_488.pw_dir, pStack_488.pw_dir != (char *)0x0)) goto LAB_009604dc;
  }
  else {
LAB_009604dc:
    lVar5 = curl_maprintf("%s%s.netrc",pcVar6,&DAT_002a91de);
    if (lVar5 == 0) {
      (*(code *)PTR_free_00cc4678)(pcVar4);
      uVar3 = 0xffffffff;
    }
    else {
      uVar3 = FUN_00960580(param_1,param_2,param_3,lVar5);
      uVar3 = uVar3 & 0xffffffff;
      (*(code *)PTR_free_00cc4678)(lVar5);
      (*(code *)PTR_free_00cc4678)(pcVar4);
    }
  }
  if (*(long *)(lVar1 + 0x28) == local_58) {
    return uVar3;
  }
LAB_0096057c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

