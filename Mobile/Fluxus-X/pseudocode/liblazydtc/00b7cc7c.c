/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7cc7c
 */

void mbedtls_asn1_get_sequence_of
               (undefined8 param_1,undefined8 param_2,undefined8 *param_3,undefined4 param_4)

{
  long lVar1;
  undefined4 local_38 [2];
  undefined8 *local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  param_3[1] = 0;
  *param_3 = 0;
  param_3[3] = 0;
  param_3[2] = 0;
  local_38[0] = param_4;
  local_30 = param_3;
  mbedtls_asn1_traverse_sequence_of(param_1,param_2,0xff,param_4,0,0,&LAB_00b7cce8,local_38);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

