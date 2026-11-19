/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b95dec
 */

int mbedtls_ecp_group_load(undefined4 *param_1,undefined4 param_2)

{
  undefined4 *puVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  undefined **ppuVar5;
  undefined1 auStack_48 [16];
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  mbedtls_ecp_group_free();
  mbedtls_ecp_group_init(param_1);
  *param_1 = param_2;
  switch(param_2) {
  case 1:
    *(undefined **)(param_1 + 2) = &DAT_00780ae8;
    *(code **)(param_1 + 0x24) = FUN_00b9682c;
    param_1[4] = 0x30001;
    param_1[0xc] = 0x30001;
    *(undefined **)(param_1 + 10) = &DAT_00780b00;
    param_1[0x1c] = 0x30001;
    *(undefined **)(param_1 + 0x1a) = &DAT_00780b48;
    *(undefined **)(param_1 + 0xe) = &DAT_00780b18;
    *(undefined **)(param_1 + 0x12) = &DAT_00780b30;
    param_1[0x10] = 0x30001;
    param_1[0x14] = 0x30001;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    ppuVar5 = &PTR_DAT_00ca86c8;
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    break;
  case 2:
    *(undefined **)(param_1 + 2) = &DAT_00780b60;
    *(undefined1 **)(param_1 + 0x24) = &LAB_00b96914;
    param_1[4] = 0x40001;
    param_1[0xc] = 0x40001;
    *(undefined **)(param_1 + 10) = &DAT_00780b80;
    param_1[0x1c] = 0x40001;
    *(undefined **)(param_1 + 0x1a) = &DAT_00780be0;
    *(undefined **)(param_1 + 0xe) = &DAT_00780ba0;
    *(undefined **)(param_1 + 0x12) = &DAT_00780bc0;
    param_1[0x10] = 0x40001;
    param_1[0x14] = 0x40001;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    ppuVar5 = &PTR_DAT_00ca89c8;
    break;
  case 3:
    *(undefined **)(param_1 + 2) = &DAT_00780c00;
    *(undefined1 **)(param_1 + 0x24) = &LAB_00b96bd4;
    param_1[4] = 0x40001;
    param_1[0xc] = 0x40001;
    *(undefined **)(param_1 + 10) = &DAT_00780c20;
    param_1[0x1c] = 0x40001;
    *(undefined **)(param_1 + 0x1a) = &DAT_00780c80;
    *(undefined **)(param_1 + 0xe) = &DAT_00780c40;
    *(undefined **)(param_1 + 0x12) = &DAT_00780c60;
    param_1[0x10] = 0x40001;
    param_1[0x14] = 0x40001;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    ppuVar5 = &PTR_DAT_00ca8cc8;
    break;
  case 4:
    *(undefined **)(param_1 + 2) = &DAT_00780ca0;
    *(undefined1 **)(param_1 + 0x24) = &LAB_00b9704c;
    param_1[4] = 0x60001;
    param_1[0xc] = 0x60001;
    *(undefined **)(param_1 + 10) = &DAT_00780cd0;
    param_1[0x1c] = 0x60001;
    *(undefined **)(param_1 + 0x1a) = &DAT_00780d60;
    *(undefined **)(param_1 + 0xe) = &DAT_00780d00;
    *(undefined **)(param_1 + 0x12) = &DAT_00780d30;
    param_1[0x10] = 0x60001;
    param_1[0x14] = 0x60001;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    ppuVar5 = &PTR_DAT_00ca8fc8;
    break;
  case 5:
    *(undefined **)(param_1 + 2) = &DAT_00780d90;
    *(undefined1 **)(param_1 + 0x24) = &LAB_00b975ec;
    param_1[4] = 0x90001;
    param_1[0xc] = 0x90001;
    *(undefined **)(param_1 + 10) = &DAT_00780dd8;
    param_1[0x1c] = 0x90001;
    *(undefined **)(param_1 + 0x1a) = &DAT_00780eb0;
    *(undefined **)(param_1 + 0xe) = &DAT_00780e20;
    *(undefined **)(param_1 + 0x12) = &DAT_00780e68;
    param_1[0x10] = 0x90001;
    param_1[0x14] = 0x90001;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    ppuVar5 = &PTR_DAT_00ca95c8;
    break;
  case 6:
    *(undefined **)(param_1 + 2) = &DAT_00781088;
    *(undefined **)(param_1 + 6) = &DAT_007810a8;
    *(undefined **)(param_1 + 10) = &DAT_007810c8;
    param_1[4] = 0x40001;
    param_1[8] = 0x40001;
    param_1[0xc] = 0x40001;
    param_1[0x1c] = 0x40001;
    *(undefined **)(param_1 + 0x1a) = &DAT_00781128;
    *(undefined **)(param_1 + 0xe) = &DAT_007810e8;
    *(undefined **)(param_1 + 0x12) = &DAT_00781108;
    param_1[0x10] = 0x40001;
    param_1[0x14] = 0x40001;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    ppuVar5 = &PTR_DAT_00caa4c8;
    break;
  case 7:
    *(undefined **)(param_1 + 2) = &DAT_00781148;
    *(undefined **)(param_1 + 6) = &DAT_00781178;
    *(undefined **)(param_1 + 10) = &DAT_007811a8;
    param_1[4] = 0x60001;
    param_1[8] = 0x60001;
    param_1[0xc] = 0x60001;
    param_1[0x1c] = 0x60001;
    *(undefined **)(param_1 + 0x1a) = &DAT_00781238;
    *(undefined **)(param_1 + 0xe) = &DAT_007811d8;
    *(undefined **)(param_1 + 0x12) = &DAT_00781208;
    param_1[0x10] = 0x60001;
    param_1[0x14] = 0x60001;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    ppuVar5 = &PTR_DAT_00caa7c8;
    break;
  case 8:
    *(undefined **)(param_1 + 2) = &DAT_00781268;
    *(undefined **)(param_1 + 6) = &DAT_007812a8;
    *(undefined **)(param_1 + 10) = &DAT_007812e8;
    param_1[4] = 0x80001;
    param_1[8] = 0x80001;
    param_1[0xc] = 0x80001;
    param_1[0x1c] = 0x80001;
    *(undefined **)(param_1 + 0x1a) = &DAT_007813a8;
    *(undefined **)(param_1 + 0xe) = &DAT_00781328;
    *(undefined **)(param_1 + 0x12) = &DAT_00781368;
    param_1[0x10] = 0x80001;
    param_1[0x14] = 0x80001;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    ppuVar5 = &PTR_DAT_00caadc8;
    break;
  case 9:
    *(undefined1 **)(param_1 + 0x24) = &LAB_00b97728;
    iVar3 = mbedtls_mpi_lset(param_1 + 6,0x1db42);
    if (iVar3 == 0) {
      puVar1 = param_1 + 2;
      iVar3 = mbedtls_mpi_lset(puVar1,1);
      if (iVar3 == 0) {
        iVar3 = mbedtls_mpi_shift_l(puVar1,0xff);
        if (iVar3 == 0) {
          iVar3 = mbedtls_mpi_sub_int(puVar1,puVar1,0x13);
          if (iVar3 == 0) {
            uVar4 = mbedtls_mpi_bitlen(puVar1);
            *(undefined8 *)(param_1 + 0x1e) = uVar4;
            iVar3 = mbedtls_mpi_read_binary(param_1 + 0x1a,&DAT_007867f0,0x10);
            if (iVar3 == 0) {
              iVar3 = mbedtls_mpi_set_bit(param_1 + 0x1a,0xfc,1);
              if (iVar3 == 0) {
                iVar3 = mbedtls_mpi_lset(param_1 + 0xe,9);
                if (iVar3 == 0) {
                  iVar3 = mbedtls_mpi_lset(param_1 + 0x16,1);
                  if (iVar3 == 0) {
                    mbedtls_mpi_free(param_1 + 0x12);
                    *(undefined8 *)(param_1 + 0x20) = 0xfe;
                    goto LAB_00b967d8;
                  }
                }
              }
            }
          }
        }
      }
    }
    goto LAB_00b96710;
  case 10:
    *(undefined **)(param_1 + 2) = &DAT_00780ef8;
    *(undefined1 **)(param_1 + 0x24) = &LAB_00b976d4;
    *(undefined **)(param_1 + 6) = &DAT_00780f10;
    *(undefined **)(param_1 + 10) = &DAT_00780f18;
    param_1[4] = 0x30001;
    param_1[8] = 0x10001;
    param_1[0xc] = 0x10001;
    param_1[0x1c] = 0x30001;
    *(undefined **)(param_1 + 0x1a) = &DAT_00780f50;
    *(undefined **)(param_1 + 0xe) = &DAT_00780f20;
    param_1[0x10] = 0x30001;
    param_1[0x14] = 0x30001;
    *(undefined **)(param_1 + 0x12) = &DAT_00780f38;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    ppuVar5 = &PTR_DAT_00ca9bc8;
    break;
  case 0xb:
    *(undefined **)(param_1 + 2) = &DAT_00780f68;
    *(undefined1 **)(param_1 + 0x24) = &LAB_00b976f0;
    *(undefined **)(param_1 + 6) = &DAT_00780f88;
    *(undefined **)(param_1 + 10) = &DAT_00780f90;
    param_1[4] = 0x40001;
    param_1[8] = 0x10001;
    param_1[0xc] = 0x10001;
    param_1[0x1c] = 0x40001;
    *(undefined **)(param_1 + 0x1a) = &DAT_00780fd8;
    *(undefined **)(param_1 + 0xe) = &DAT_00780f98;
    param_1[0x10] = 0x40001;
    param_1[0x14] = 0x40001;
    *(undefined **)(param_1 + 0x12) = &DAT_00780fb8;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    ppuVar5 = &PTR_DAT_00ca9ec8;
    break;
  case 0xc:
    *(undefined **)(param_1 + 2) = &DAT_00780ff8;
    *(undefined1 **)(param_1 + 0x24) = &LAB_00b9770c;
    *(undefined **)(param_1 + 6) = &DAT_00781018;
    *(undefined **)(param_1 + 10) = &DAT_00781020;
    param_1[4] = 0x40001;
    param_1[8] = 0x10001;
    param_1[0xc] = 0x10001;
    param_1[0x1c] = 0x40001;
    *(undefined **)(param_1 + 0x1a) = &DAT_00781068;
    *(undefined **)(param_1 + 0xe) = &DAT_00781028;
    param_1[0x10] = 0x40001;
    param_1[0x14] = 0x40001;
    *(undefined **)(param_1 + 0x12) = &DAT_00781048;
    param_1[0x18] = 0x10001;
    *(undefined **)(param_1 + 0x16) = &DAT_007813e8;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 2);
    *(undefined8 *)(param_1 + 0x1e) = uVar4;
    uVar4 = mbedtls_mpi_bitlen(param_1 + 0x1a);
    *(undefined8 *)(param_1 + 0x20) = uVar4;
    ppuVar5 = &PTR_DAT_00caa1c8;
    break;
  case 0xd:
    *(undefined1 **)(param_1 + 0x24) = &LAB_00b977e8;
    mbedtls_mpi_init(auStack_48);
    iVar3 = mbedtls_mpi_lset(param_1 + 6,0x98aa);
    if (iVar3 == 0) {
      puVar1 = param_1 + 2;
      iVar3 = mbedtls_mpi_lset(puVar1,1);
      if (iVar3 == 0) {
        iVar3 = mbedtls_mpi_shift_l(puVar1,0xe0);
        if (iVar3 == 0) {
          iVar3 = mbedtls_mpi_sub_int(puVar1,puVar1,1);
          if (iVar3 == 0) {
            iVar3 = mbedtls_mpi_shift_l(puVar1,0xe0);
            if (iVar3 == 0) {
              iVar3 = mbedtls_mpi_sub_int(puVar1,puVar1,1);
              if (iVar3 == 0) {
                uVar4 = mbedtls_mpi_bitlen(puVar1);
                *(undefined8 *)(param_1 + 0x1e) = uVar4;
                iVar3 = mbedtls_mpi_lset(param_1 + 0xe,5);
                if (iVar3 == 0) {
                  iVar3 = mbedtls_mpi_lset(param_1 + 0x16,1);
                  if (iVar3 == 0) {
                    mbedtls_mpi_free(param_1 + 0x12);
                    puVar1 = param_1 + 0x1a;
                    iVar3 = mbedtls_mpi_set_bit(puVar1,0x1be,1);
                    if (iVar3 == 0) {
                      iVar3 = mbedtls_mpi_read_binary(auStack_48,&DAT_00786800,0x1c);
                      if (iVar3 == 0) {
                        iVar3 = mbedtls_mpi_sub_mpi(puVar1,puVar1,auStack_48);
                        if (iVar3 == 0) {
                          *(undefined8 *)(param_1 + 0x20) = 0x1bf;
                          mbedtls_mpi_free(auStack_48);
                          goto LAB_00b967d8;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    mbedtls_mpi_free(auStack_48);
LAB_00b96710:
    mbedtls_ecp_group_free(param_1);
    goto LAB_00b967d8;
  default:
    iVar3 = -0x4e80;
    *param_1 = 0;
    goto LAB_00b967d8;
  }
  iVar3 = 0;
  param_1[0x22] = 1;
  *(undefined ***)(param_1 + 0x2c) = ppuVar5;
  *(undefined8 *)(param_1 + 0x2e) = 0;
LAB_00b967d8:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

