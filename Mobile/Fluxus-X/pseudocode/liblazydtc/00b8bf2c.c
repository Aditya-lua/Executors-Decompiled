/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8bf2c
 */

int FUN_00b8bf2c(int *param_1,uint param_2,undefined4 param_3,uint param_4)

{
  uint uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  int iVar5;
  undefined4 uVar6;
  uint uVar7;
  int iVar8;
  undefined2 *local_60;
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  local_60 = (undefined2 *)0x0;
  if ((param_4 & 0x7f000000) != 0x5000000) goto LAB_00b8c054;
  uVar1 = param_4 & 0xffffff00;
  if ((int)uVar1 < 0x6000900) {
    if (uVar1 != 0x6000200) {
      uVar7 = 0x300;
      goto LAB_00b8bfb4;
    }
LAB_00b8bfd4:
    if ((param_4 & 0xff) == 0) goto LAB_00b8c004;
    if ((int)uVar1 < 0x6000900) {
      if (uVar1 != 0x6000200) {
        uVar7 = 0x300;
        goto LAB_00b8c020;
      }
LAB_00b8c040:
      if ((param_4 & 0xff | 0x2000000) == 0x20000ff) goto LAB_00b8c054;
    }
    else {
      if (uVar1 == 0x6000900) goto LAB_00b8c040;
      uVar7 = 0x1300;
LAB_00b8c020:
      if ((uVar1 == (uVar7 | 0x6000000)) || ((param_4 >> 9 | 1) == 0x30003)) goto LAB_00b8c040;
    }
  }
  else {
    if (uVar1 == 0x6000900) goto LAB_00b8bfd4;
    uVar7 = 0x1300;
LAB_00b8bfb4:
    if ((uVar1 == (uVar7 | 0x6000000)) || ((param_4 >> 9 | 1) == 0x30003)) goto LAB_00b8bfd4;
LAB_00b8c004:
    if ((param_4 >> 0xf & 1) != 0) goto LAB_00b8c054;
  }
  if ((*param_1 == 0) && ((*(byte *)(param_1 + 8) & 0xf) == 0)) {
    uVar6 = 0x100;
    if (param_2 == 0) {
      uVar6 = 0x200;
    }
    iVar5 = FUN_00b86e5c(param_3,&local_60,uVar6,param_4);
    if (iVar5 == 0) {
      uVar1 = param_4 & 0xffc07fff;
      uVar7 = param_4 >> 0x10 & 0x3f;
      if (uVar1 == 0x5000500) {
        if (uVar7 != 0x10) goto LAB_00b8c054;
LAB_00b8c17c:
        uVar2 = *(undefined8 *)(local_60 + 0x14);
        uVar3 = *(undefined8 *)(local_60 + 0x18);
        if (param_2 == 0) {
          if (0xff < *(uint *)(local_60 + 2)) goto LAB_00b8c054;
          *param_1 = 1;
          iVar5 = mbedtls_psa_aead_decrypt_setup(param_1 + 10,local_60,uVar2,uVar3,param_4);
        }
        else {
          if (0xff < *(uint *)(local_60 + 2)) goto LAB_00b8c054;
          *param_1 = 1;
          iVar5 = mbedtls_psa_aead_encrypt_setup(param_1 + 10);
        }
        if (iVar5 == 0) {
          iVar8 = 0x5500100;
          *(undefined2 *)(param_1 + 2) = *local_60;
          iVar5 = psa_unregister_read_under_mutex();
          if (uVar1 != 0x5400100) {
            if (uVar1 == 0x5400200) {
              iVar8 = 0x5500200;
            }
            else {
              iVar8 = 0x5100500;
              if (uVar1 != 0x5000500) {
                iVar8 = 0;
              }
            }
          }
          param_1[1] = iVar8;
          *(byte *)(param_1 + 8) = *(byte *)(param_1 + 8) & 0xef | (byte)((param_2 & 1) << 4);
          goto LAB_00b8c0a4;
        }
      }
      else if (uVar1 == 0x5400200) {
        if (((uVar7 == 4) || (uVar7 == 8)) || (uVar7 - 0xc < 5)) goto LAB_00b8c17c;
LAB_00b8c054:
        iVar5 = -0x87;
      }
      else if (uVar1 == 0x5400100) {
        iVar5 = -0x87;
        if (((param_4 >> 0x10 & 1) == 0) && ((uVar7 - 4 & 0xff) < 0xd)) goto LAB_00b8c17c;
      }
      else {
        iVar5 = -0x86;
      }
    }
  }
  else {
    iVar5 = -0x89;
  }
  psa_unregister_read_under_mutex(local_60);
  if (*param_1 != 0) {
    if (*param_1 == 1) {
      mbedtls_psa_aead_abort(param_1 + 10);
    }
    memset(param_1,0,0x1d8);
  }
LAB_00b8c0a4:
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

