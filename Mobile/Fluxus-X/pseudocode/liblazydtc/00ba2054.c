/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2054
 */

void FUN_00ba2054(undefined4 param_1,long param_2,undefined4 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,char *param_7,undefined8 param_8)

{
  long lVar1;
  uint *puVar2;
  uint uVar3;
  long lVar4;
  undefined1 uVar5;
  size_t __n;
  undefined8 uVar6;
  uint *puVar7;
  long local_258 [8];
  uint local_218;
  uint uStack_214;
  uint uStack_210;
  uint uStack_20c;
  uint auStack_208 [101];
  undefined1 auStack_73 [19];
  
  lVar4 = tpidr_el0;
  auStack_73._3_8_ = *(long *)(lVar4 + 0x28);
  __n = strlen(param_7);
  uVar6 = mbedtls_ecp_point_write_binary(param_2,param_4,param_3,local_258,&uStack_214,0x1a1);
  if ((int)uVar6 == 0) {
    uVar6 = 0xffffb100;
    uVar3 = ((uint)local_258[0] & 0xff00ff00) >> 8 | ((uint)local_258[0] & 0xff00ff) << 8;
    local_218 = uVar3 >> 0x10 | uVar3 << 0x10;
    if ((local_258[0] + 4 < 0x1a6) && (4 < 0x1a1 - local_258[0])) {
      puVar2 = (uint *)((long)local_258 + local_258[0] + 0x44);
      lVar1 = (long)auStack_208 + local_258[0] + -8;
      uVar6 = mbedtls_ecp_point_write_binary
                        (param_2,param_5,param_3,local_258,lVar1,(long)auStack_73 - lVar1);
      if ((int)uVar6 == 0) {
        puVar7 = (uint *)((long)puVar2 + local_258[0] + 4);
        uVar3 = ((uint)local_258[0] & 0xff00ff00) >> 8 | ((uint)local_258[0] & 0xff00ff) << 8;
        *puVar2 = uVar3 >> 0x10 | uVar3 << 0x10;
        if ((puVar7 <= auStack_73) && (4 < (long)auStack_73 - (long)puVar7)) {
          lVar1 = (long)puVar2 + local_258[0] + 8;
          uVar6 = mbedtls_ecp_point_write_binary
                            (param_2,param_6,param_3,local_258,lVar1,(long)auStack_73 - lVar1);
          if ((int)uVar6 != 0) goto LAB_00ba20d8;
          puVar2 = (uint *)((long)puVar7 + local_258[0] + 4);
          uVar3 = ((uint)local_258[0] & 0xff00ff00) >> 8 | ((uint)local_258[0] & 0xff00ff) << 8;
          *puVar7 = uVar3 >> 0x10 | uVar3 << 0x10;
          if (3 < (long)auStack_73 - (long)puVar2) {
            uVar3 = ((uint)__n & 0xff00ff00) >> 8 | ((uint)__n & 0xff00ff) << 8;
            puVar7 = (uint *)((long)puVar7 + local_258[0] + 8);
            *puVar2 = uVar3 >> 0x10 | uVar3 << 0x10;
            if (puVar7 <= auStack_73) {
              if ((ulong)((long)auStack_73 - (long)puVar7) < __n) {
                uVar6 = 0xffffb100;
              }
              else {
                memcpy(puVar7,param_7,__n);
                uVar6 = mbedtls_md_info_from_type(param_1);
                uVar6 = mbedtls_md(uVar6,&local_218,(long)puVar7 + (__n - (long)&local_218),
                                   local_258);
                if ((int)uVar6 == 0) {
                  mbedtls_md_info_from_type(param_1);
                  uVar5 = mbedtls_md_get_size();
                  uVar6 = mbedtls_mpi_read_binary(param_8,local_258,uVar5);
                  if ((int)uVar6 == 0) {
                    uVar6 = mbedtls_mpi_mod_mpi(param_8,param_8,param_2 + 0x68);
                  }
                }
              }
              goto LAB_00ba20d8;
            }
          }
        }
        uVar6 = 0xffffb100;
      }
    }
  }
LAB_00ba20d8:
  if (*(long *)(lVar4 + 0x28) != auStack_73._3_8_) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

