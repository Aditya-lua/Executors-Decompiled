/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba8674
 */

void mbedtls_rsa_rsassa_pss_verify_ext
               (long param_1,int param_2,uint param_3,long param_4,undefined4 param_5,int param_6,
               undefined8 param_7)

{
  char *pcVar1;
  char cVar2;
  long lVar3;
  ulong uVar4;
  char *pcVar5;
  byte bVar6;
  int iVar7;
  ulong uVar8;
  long lVar9;
  uint uVar10;
  ulong __n;
  char *__s1;
  char *pcVar11;
  ulong uVar12;
  char acStack_4b1 [16];
  char acStack_4a1 [1009];
  undefined1 auStack_b0 [64];
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  memset(acStack_4b1 + 1,0,0x400);
  if (((param_3 == 0 && param_2 == 0) || (param_4 != 0)) &&
     (uVar12 = *(ulong *)(param_1 + 8), uVar12 - 0x10 < 0x3f1)) {
    uVar8 = mbedtls_rsa_public(param_1,param_7,acStack_4b1 + 1);
    if ((int)uVar8 != 0) goto LAB_00ba86ec;
    if (acStack_4b1[uVar12] != -0x44) {
LAB_00ba8850:
      uVar8 = 0xffffbf00;
      goto LAB_00ba86ec;
    }
    if (param_2 != 0) {
      mbedtls_md_info_from_type(param_2);
      bVar6 = mbedtls_md_get_size();
      if ((bVar6 == 0) || (param_3 != bVar6)) goto LAB_00ba86e8;
    }
    mbedtls_md_info_from_type(param_5);
    bVar6 = mbedtls_md_get_size();
    if (bVar6 != 0) {
      iVar7 = mbedtls_mpi_bitlen(param_1 + 0x10);
      uVar10 = iVar7 - 1;
      if ((byte)acStack_4b1[1] >> (ulong)((int)uVar12 * -8 + 8 + uVar10 & 0x1f) == 0) {
        __n = (ulong)bVar6;
        pcVar1 = (char *)((ulong)(acStack_4b1 + 1) | 1);
        uVar4 = uVar12 - 1;
        if ((uVar10 & 7) != 0) {
          pcVar1 = acStack_4b1 + 1;
          uVar4 = uVar12;
        }
        if (__n + 2 <= uVar4) {
          __s1 = pcVar1 + (uVar4 - __n) + -1;
          uVar8 = FUN_00ba76c0(pcVar1,uVar4 + ~__n,__s1,__n,param_5);
          if ((int)uVar8 != 0) goto LAB_00ba86ec;
          acStack_4b1[1] = acStack_4b1[1] & (byte)(0xff >> (ulong)((int)uVar4 * 8 - uVar10 & 0x1f));
          pcVar5 = pcVar1;
          do {
            pcVar11 = pcVar5;
            if (pcVar1 + (uVar4 - __n) + -2 <= pcVar11) {
              cVar2 = *pcVar11;
              break;
            }
            cVar2 = *pcVar11;
            pcVar5 = pcVar11 + 1;
          } while (cVar2 == '\0');
          if ((cVar2 == '\x01') &&
             ((lVar9 = (long)__s1 - (long)(pcVar11 + 1), param_6 == -1 || (lVar9 == param_6)))) {
            uVar8 = FUN_00ba8898(param_4,param_3,pcVar11 + 1,lVar9,auStack_b0,param_5);
            if ((int)uVar8 == 0) {
              iVar7 = memcmp(__s1,auStack_b0,__n);
              uVar10 = 0;
              if (iVar7 != 0) {
                uVar10 = 0xffffbc80;
              }
              uVar8 = (ulong)uVar10;
            }
            goto LAB_00ba86ec;
          }
          goto LAB_00ba8850;
        }
      }
    }
  }
LAB_00ba86e8:
  uVar8 = 0xffffbf80;
LAB_00ba86ec:
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar8);
  }
  return;
}

