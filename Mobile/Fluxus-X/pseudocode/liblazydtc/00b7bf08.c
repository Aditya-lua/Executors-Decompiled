/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7bf08
 */

void mbedtls_ecdsa_der_to_raw
               (long param_1,char *param_2,long param_3,void *param_4,ulong param_5,size_t *param_6)

{
  char *pcVar1;
  char *pcVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  ulong uVar6;
  size_t __n;
  ulong uVar7;
  long local_118;
  char *local_110;
  ulong local_108;
  char *local_100;
  undefined1 auStack_f4 [132];
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  uVar6 = 0xffffff94;
  local_110 = param_2;
  if (0x217 < param_1 + 7U) goto LAB_00b7c0d8;
  uVar7 = param_1 + 7U >> 3;
  __n = uVar7 * 2;
  if ((param_5 < __n) ||
     (uVar6 = mbedtls_asn1_get_tag(&local_110,param_2 + param_3,&local_118,0x30), (int)uVar6 != 0))
  goto LAB_00b7c0d8;
  memset(auStack_f4,0,__n);
  pcVar1 = local_110;
  local_100 = local_110;
  uVar6 = mbedtls_asn1_get_tag(&local_100,local_110 + local_118,&local_108,2);
  uVar5 = (uint)uVar6;
  lVar4 = local_118;
  if (uVar5 == 0) {
    if ((local_108 != 0) && (-1 < *local_100)) {
      if (*local_100 == '\0') {
        local_100 = local_100 + 1;
        local_108 = local_108 - 1;
        if (local_108 != 0) {
          if (*local_100 == '\0') goto LAB_00b7c0d4;
          goto LAB_00b7c03c;
        }
      }
      else {
LAB_00b7c03c:
        if (uVar7 < local_108) goto LAB_00b7c0d4;
      }
      pcVar2 = local_100;
      uVar6 = local_108;
      memcpy(auStack_f4 + (uVar7 - local_108),local_100,local_108);
      local_100 = pcVar2 + uVar6;
      uVar5 = (int)local_100 - (int)pcVar1;
      uVar6 = (ulong)uVar5;
      lVar4 = local_118;
      goto joined_r0x00b7c0b4;
    }
LAB_00b7c0d4:
    uVar6 = 0xffffff98;
  }
  else {
joined_r0x00b7c0b4:
    local_118 = lVar4;
    if ((int)uVar5 < 0) goto LAB_00b7c0d8;
    pcVar1 = local_110 + (int)uVar6;
    local_118 = lVar4 - (int)uVar6;
    pcVar2 = local_110 + lVar4;
    local_110 = pcVar1;
    local_100 = pcVar1;
    uVar6 = mbedtls_asn1_get_tag(&local_100,pcVar2,&local_108,2);
    uVar5 = (uint)uVar6;
    if (uVar5 == 0) {
      if ((local_108 == 0) || (*local_100 < '\0')) goto LAB_00b7c0d4;
      if (*local_100 == '\0') {
        local_100 = local_100 + 1;
        local_108 = local_108 - 1;
        if (local_108 != 0) {
          if (*local_100 == '\0') goto LAB_00b7c0d4;
          goto LAB_00b7c060;
        }
      }
      else {
LAB_00b7c060:
        if (uVar7 < local_108) goto LAB_00b7c0d4;
      }
      pcVar2 = local_100;
      uVar6 = local_108;
      memcpy(auStack_f4 + (uVar7 * 2 - local_108),local_100,local_108);
      local_100 = pcVar2 + uVar6;
      uVar5 = (int)local_100 - (int)pcVar1;
      uVar6 = (ulong)uVar5;
    }
    if (-1 < (int)uVar5) {
      local_110 = local_110 + (int)uVar6;
      local_118 = local_118 - (int)uVar6;
      if ((long)local_110 - (long)param_2 == param_3) {
        memcpy(param_4,auStack_f4,__n);
        uVar6 = 0;
        *param_6 = __n;
      }
      else {
        uVar6 = 0xffffff9a;
      }
    }
  }
LAB_00b7c0d8:
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

