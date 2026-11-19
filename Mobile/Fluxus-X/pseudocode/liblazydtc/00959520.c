/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00959520
 */

void FUN_00959520(uchar *param_1,const_DES_cblock *param_2,DES_cblock *param_3)

{
  long lVar1;
  DES_key_schedule DStack_c0;
  uchar local_40;
  byte local_3f;
  byte local_3e;
  byte local_3d;
  byte local_3c;
  byte local_3b;
  byte local_3a;
  uchar local_39;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_40 = *param_1;
  local_3f = param_1[1] >> 1 | local_40 << 7;
  local_3e = param_1[2] >> 2 | param_1[1] << 6;
  local_3d = param_1[3] >> 3 | param_1[2] << 5;
  local_3c = param_1[4] >> 4 | param_1[3] << 4;
  local_3b = param_1[5] >> 5 | param_1[4] << 3;
  local_39 = param_1[6] << 1;
  local_3a = param_1[6] >> 6 | param_1[5] << 2;
  DES_set_odd_parity((DES_cblock *)&local_40);
  DES_set_key_unchecked((const_DES_cblock *)&local_40,&DStack_c0);
  DES_ecb_encrypt(param_2,param_3,&DStack_c0,1);
  local_40 = param_1[7];
  local_3f = param_1[8] >> 1 | local_40 << 7;
  local_3e = param_1[9] >> 2 | param_1[8] << 6;
  local_3d = param_1[10] >> 3 | param_1[9] << 5;
  local_3c = param_1[0xb] >> 4 | param_1[10] << 4;
  local_3b = param_1[0xc] >> 5 | param_1[0xb] << 3;
  local_39 = param_1[0xd] << 1;
  local_3a = param_1[0xd] >> 6 | param_1[0xc] << 2;
  DES_set_odd_parity((DES_cblock *)&local_40);
  DES_set_key_unchecked((const_DES_cblock *)&local_40,&DStack_c0);
  DES_ecb_encrypt(param_2,param_3 + 1,&DStack_c0,1);
  local_40 = param_1[0xe];
  local_3f = param_1[0xf] >> 1 | local_40 << 7;
  local_3e = param_1[0x10] >> 2 | param_1[0xf] << 6;
  local_3d = param_1[0x11] >> 3 | param_1[0x10] << 5;
  local_3c = param_1[0x12] >> 4 | param_1[0x11] << 4;
  local_3b = param_1[0x13] >> 5 | param_1[0x12] << 3;
  local_39 = param_1[0x14] << 1;
  local_3a = param_1[0x14] >> 6 | param_1[0x13] << 2;
  DES_set_odd_parity((DES_cblock *)&local_40);
  DES_set_key_unchecked((const_DES_cblock *)&local_40,&DStack_c0);
  DES_ecb_encrypt(param_2,param_3 + 2,&DStack_c0,1);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

