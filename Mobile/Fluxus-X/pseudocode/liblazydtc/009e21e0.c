/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e21e0
 */

void dtls1_get_message_header(undefined1 *param_1,undefined1 *param_2)

{
  memset(param_2,0,0x58);
  *param_2 = *param_1;
  *(ulong *)(param_2 + 8) =
       (ulong)(byte)param_1[1] << 0x10 | (ulong)(byte)param_1[2] << 8 | (ulong)(byte)param_1[3];
  *(ushort *)(param_2 + 0x10) = *(ushort *)(param_1 + 4) >> 8 | *(ushort *)(param_1 + 4) << 8;
  *(ulong *)(param_2 + 0x18) =
       (ulong)(byte)param_1[6] << 0x10 | (ulong)(byte)param_1[7] << 8 | (ulong)(byte)param_1[8];
  *(ulong *)(param_2 + 0x20) =
       (ulong)(byte)param_1[9] << 0x10 | (ulong)(byte)param_1[10] << 8 | (ulong)(byte)param_1[0xb];
  return;
}

