/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a550dc
 */

void ERR_add_error_data(int num,...)

{
  undefined8 in_x1;
  undefined8 in_x2;
  undefined8 in_x3;
  undefined8 in_x4;
  undefined8 in_x5;
  undefined8 in_x6;
  undefined8 in_x7;
  undefined1 auStack_a0 [8];
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined1 *local_60;
  undefined1 **ppuStack_58;
  undefined1 *puStack_50;
  undefined8 uStack_48;
  
  puStack_50 = auStack_a0;
  ppuStack_58 = &local_60;
  uStack_48 = 0xffffff80ffffffc8;
  local_98 = in_x1;
  uStack_90 = in_x2;
  local_88 = in_x3;
  local_80 = in_x4;
  uStack_78 = in_x5;
  local_70 = in_x6;
  uStack_68 = in_x7;
  local_60 = (undefined1 *)register0x00000008;
  ERR_add_error_vdata(num,&local_60);
  return;
}

