/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b98a78
 */

void FUN_00b98a78(uint *param_1,ushort *param_2,ulong *param_3,uint param_4,undefined4 param_5)

{
  uint *puVar1;
  ushort uVar2;
  long lVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  ushort uVar7;
  undefined1 uVar8;
  ulong uVar9;
  undefined4 local_78;
  undefined4 uStack_74;
  ulong local_70;
  ulong uStack_68;
  ulong local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  puVar1 = param_1 + 2;
  uVar2 = *param_2;
  mbedtls_cipher_init(puVar1);
  *param_1 = param_4;
  uVar7 = param_2[1];
  uVar9 = (ulong)uVar7;
  local_78 = 0;
  local_70 = uVar9;
  iVar4 = mbedtls_cipher_values_from_psa(param_4,uVar2,&local_70,&uStack_74,&local_78);
  if ((iVar4 != 0) ||
     (lVar6 = mbedtls_cipher_info_from_values(local_78,local_70 & 0xffffffff,uStack_74), lVar6 == 0)
     ) {
    uVar5 = 0xffffff7a;
    goto LAB_00b98cb4;
  }
  uVar5 = mbedtls_cipher_setup(puVar1);
  if ((int)uVar5 == 0) {
    if ((uVar2 == 0x2301) && (uVar7 == 0x80)) {
      uStack_68 = param_3[1];
      local_70 = *param_3;
      uVar9 = 0xc0;
      local_60 = *param_3;
      param_3 = &local_70;
    }
    uVar5 = mbedtls_cipher_setkey(puVar1,param_3,uVar9,param_5);
    if ((int)uVar5 == 0) {
      if (param_4 == 0x4404000) {
        uVar5 = 4;
LAB_00b98b98:
        uVar5 = mbedtls_cipher_set_padding_mode(puVar1,uVar5);
        if ((int)uVar5 != 0) goto LAB_00b98cb0;
      }
      else if (param_4 == 0x4404100) {
        uVar5 = 0;
        goto LAB_00b98b98;
      }
      uVar7 = uVar2 & 0x7000;
      if ((param_4 & 0x7f800000) == 0x4800000) {
        uVar8 = 1;
      }
      else {
        uVar8 = 0;
        if (uVar7 == 0x2000) {
          uVar8 = (undefined1)(1 << (ulong)(uVar2 >> 8 & 7));
          uVar7 = 0x2000;
        }
      }
      *(undefined1 *)((long)param_1 + 5) = uVar8;
      if ((uVar7 == 0x2000) && ((uVar2 & 0x700) != 0)) {
        if ((int)param_4 < 0x4c01000) {
          if (((param_4 == 0x4404000) || (param_4 == 0x4404100)) || (param_4 == 0x440ff00))
          goto LAB_00b98c64;
          goto LAB_00b98c74;
        }
        if (((param_4 != 0x4c01000) && (param_4 != 0x4c01200)) && (param_4 != 0x4c01100))
        goto LAB_00b98c74;
LAB_00b98c64:
        uVar8 = (undefined1)(1 << (ulong)(uVar2 >> 8 & 7));
      }
      else {
LAB_00b98c74:
        if ((param_4 == 0x4800100) && (uVar2 == 0x2004)) {
          uVar8 = 0xc;
        }
        else {
          uVar8 = 0xd;
          if (param_4 != 0x4c01300) {
            uVar8 = 0;
          }
        }
      }
      uVar5 = 0;
      *(undefined1 *)(param_1 + 1) = uVar8;
    }
  }
LAB_00b98cb0:
  uVar5 = mbedtls_to_psa_error(uVar5);
LAB_00b98cb4:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

