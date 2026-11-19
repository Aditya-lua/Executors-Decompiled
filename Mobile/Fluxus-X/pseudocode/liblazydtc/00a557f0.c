/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a557f0
 */

void ERR_set_error(void)

{
  undefined8 in_x3;
  undefined8 in_x4;
  undefined8 in_x5;
  undefined8 in_x6;
  undefined8 in_x7;
  undefined1 auStack_90 [8];
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined1 *local_60;
  undefined1 **ppuStack_58;
  undefined1 *puStack_50;
  undefined8 uStack_48;
  
  puStack_50 = auStack_90;
  ppuStack_58 = &local_60;
  uStack_48 = 0xffffff80ffffffd8;
  local_88 = in_x3;
  local_80 = in_x4;
  uStack_78 = in_x5;
  local_70 = in_x6;
  uStack_68 = in_x7;
  local_60 = (undefined1 *)register0x00000008;
  ERR_vset_error();
  return;
}

