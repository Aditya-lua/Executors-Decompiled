/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8a7d4
 */

int FUN_00b8a7d4(int *param_1,undefined4 param_2,uint param_3,int param_4)

{
  ushort uVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  undefined1 uVar6;
  undefined4 uVar7;
  ushort *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_50 = (ushort *)0x0;
  uVar7 = 0x100;
  if (param_4 != 1) {
    uVar7 = 0x200;
  }
  if (*param_1 == 0) {
    if ((param_3 & 0x7f000000) != 0x4000000) {
LAB_00b8a9bc:
      iVar4 = -0x87;
      goto LAB_00b8a9c0;
    }
    iVar4 = FUN_00b86e5c(param_2,&local_50,uVar7,param_3);
    if (iVar4 != 0) goto LAB_00b8a9c0;
    *(byte *)(param_1 + 1) = *(byte *)(param_1 + 1) & 0xfc | param_3 != 0x4404400;
    uVar1 = *local_50;
    if (((uVar1 & 0x7000) == 0x2000) && ((uVar1 & 0x700) != 0)) {
      if ((int)param_3 < 0x4c01000) {
        if (((param_3 == 0x4404000) || (param_3 == 0x4404100)) || (param_3 == 0x440ff00))
        goto LAB_00b8a904;
        goto LAB_00b8a914;
      }
      if (((param_3 != 0x4c01000) && (param_3 != 0x4c01200)) && (param_3 != 0x4c01100))
      goto LAB_00b8a914;
LAB_00b8a904:
      uVar6 = (undefined1)(1 << (ulong)(uVar1 >> 8 & 7));
    }
    else {
LAB_00b8a914:
      if ((param_3 == 0x4800100) && (uVar1 == 0x2004)) {
        uVar6 = 0xc;
      }
      else {
        uVar6 = 0xd;
        if (param_3 != 0x4c01300) {
          uVar6 = 0;
        }
      }
    }
    *(undefined1 *)((long)param_1 + 5) = uVar6;
    if (param_4 == 1) {
      if (0xff < *(uint *)(local_50 + 2)) goto LAB_00b8a9bc;
      iVar4 = mbedtls_psa_cipher_encrypt_setup(param_1 + 2);
      if (iVar4 == -0x86) goto LAB_00b8a9c0;
      bVar3 = false;
      if (iVar4 == 0) goto LAB_00b8a9a8;
      goto LAB_00b8a9c8;
    }
    if (0xff < *(uint *)(local_50 + 2)) goto LAB_00b8a9bc;
    iVar4 = mbedtls_psa_cipher_decrypt_setup
                      (param_1 + 2,local_50,*(undefined8 *)(local_50 + 0x14),
                       *(undefined8 *)(local_50 + 0x18),param_3);
    if (iVar4 != 0) goto LAB_00b8a9c0;
LAB_00b8a9a8:
    *param_1 = 1;
    iVar5 = psa_unregister_read_under_mutex(local_50);
  }
  else {
    iVar4 = -0x89;
LAB_00b8a9c0:
    bVar3 = iVar4 == 0;
LAB_00b8a9c8:
    if (*param_1 == 0) {
      iVar5 = psa_unregister_read_under_mutex(local_50);
    }
    else {
      if (*param_1 == 1) {
        mbedtls_psa_cipher_abort(param_1 + 2);
      }
      *param_1 = 0;
      *(byte *)(param_1 + 1) = *(byte *)(param_1 + 1) & 0xfc;
      iVar5 = psa_unregister_read_under_mutex(local_50);
    }
    if (!bVar3) goto LAB_00b8aa00;
  }
  iVar4 = iVar5;
LAB_00b8aa00:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

