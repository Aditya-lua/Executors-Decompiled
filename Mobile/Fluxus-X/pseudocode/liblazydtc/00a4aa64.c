/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4aa64
 */

long gf_lobit(ulong *param_1)

{
  ulong local_50;
  ulong uStack_48;
  ulong local_40;
  ulong uStack_38;
  ulong local_30;
  ulong uStack_28;
  ulong local_20;
  ulong uStack_18;
  
  uStack_18 = param_1[7];
  local_20 = param_1[6];
  uStack_28 = param_1[5];
  local_30 = param_1[4];
  uStack_38 = param_1[3];
  local_40 = param_1[2];
  uStack_48 = param_1[1];
  local_50 = *param_1;
  gf_strong_reduce(&local_50);
  return -(local_50 & 1);
}

