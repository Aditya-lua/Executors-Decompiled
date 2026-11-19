/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8df88
 */

int FUN_00b8df88(long param_1,uint param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  long lVar6;
  int local_140 [2];
  undefined1 auStack_138 [224];
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  memset((void *)(param_1 + 0x10),0,0x228);
  if ((param_2 == 0x8000609) || (param_2 + 0xf7ffff00 < 0x500)) {
    if (param_2 == 0x8000609) {
      lVar6 = 0x20;
      goto LAB_00b8e004;
    }
    uVar1 = 0;
    if ((param_2 & 0xff) != 0) {
      uVar1 = param_2 & 0xff | 0x2000000;
    }
    uVar3 = uVar1 - 3;
    if (((uVar3 & 0xff) < 0x11) && ((0x1e7e7U >> (ulong)(uVar3 & 0x1f) & 1) != 0)) {
      memset(local_140,0,0xe8);
      if (uVar1 >> 0x19 == 0) {
        iVar5 = -0x87;
        goto LAB_00b8e008;
      }
      memset(auStack_138,0,0xe0);
      iVar5 = mbedtls_psa_hash_setup(auStack_138,uVar1);
      if (iVar5 == 0) {
        local_140[0] = 1;
        mbedtls_psa_hash_abort(auStack_138);
      }
      else {
        if (local_140[0] != 0) {
          if (local_140[0] == 1) {
            mbedtls_psa_hash_abort(auStack_138);
          }
          local_140[0] = 0;
        }
        if (iVar5 != 0) goto LAB_00b8e008;
      }
      uVar2 = param_2 + 0xf7ffff00 >> 8;
      if (uVar2 < 5) {
        lVar6 = *(long *)(&DAT_00780920 + (long)(char)uVar3 * 8);
        switch(uVar2) {
        default:
          lVar6 = lVar6 * 0xff;
          break;
        case 1:
          if (1 < uVar1 + 0xfdfffff7) goto LAB_00b8dfec;
          lVar6 = -1;
          break;
        case 2:
          if (1 < uVar1 + 0xfdfffff7) goto LAB_00b8dfec;
          lVar6 = 0x30;
          break;
        case 3:
        }
LAB_00b8e004:
        iVar5 = 0;
        *(long *)(param_1 + 8) = lVar6;
        goto LAB_00b8e008;
      }
    }
  }
LAB_00b8dfec:
  iVar5 = -0x86;
LAB_00b8e008:
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

