/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a96dbc
 */

void IDEA_ecb_encrypt(byte *param_1,undefined1 *param_2,undefined8 param_3)

{
  ulong local_30;
  ulong local_28;
  
  local_30 = (ulong)*param_1 << 0x18 | (ulong)param_1[1] << 0x10 | (ulong)param_1[2] << 8 |
             (ulong)param_1[3];
  local_28 = (ulong)param_1[4] << 0x18 | (ulong)param_1[5] << 0x10 | (ulong)param_1[6] << 8 |
             (ulong)param_1[7];
  IDEA_encrypt(&local_30,param_3);
  *param_2 = (char)(local_30 >> 0x18);
  param_2[3] = (char)local_30;
  param_2[1] = (char)(local_30 >> 0x10);
  param_2[2] = (char)(local_30 >> 8);
  param_2[4] = (char)(local_28 >> 0x18);
  param_2[5] = (char)(local_28 >> 0x10);
  param_2[6] = (char)(local_28 >> 8);
  param_2[7] = (char)local_28;
  return;
}

