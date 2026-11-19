/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fe528
 */

int BIO_snprintf(char *buf,size_t n,char *format,...)

{
  int iVar1;
  undefined8 in_x3;
  undefined8 in_x4;
  undefined8 in_x5;
  undefined8 in_x6;
  undefined8 in_x7;
  int iVar2;
  undefined8 in_d0;
  undefined1 auStack_b0 [8];
  undefined8 local_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined1 *local_60;
  undefined1 *puStack_58;
  undefined1 *puStack_50;
  undefined8 uStack_48;
  int local_34;
  ulong local_30;
  size_t local_28;
  char *local_18;
  
  puStack_50 = auStack_b0;
  puStack_58 = auStack_b0 + 0x30;
  uStack_48 = 0xffffff80ffffffd8;
  local_a8 = in_x3;
  local_a0 = in_x4;
  uStack_98 = in_x5;
  local_90 = in_x6;
  uStack_88 = in_x7;
  local_60 = (undefined1 *)register0x00000008;
  local_28 = n;
  local_18 = buf;
  iVar1 = FUN_009fda6c(&local_18,0,&local_28,&local_30,&local_34,format,&local_60,in_x7,in_d0);
  iVar2 = -1;
  if (((iVar1 != 0) && (local_34 == 0)) && (iVar2 = (int)local_30, local_30 >> 0x1f != 0)) {
    iVar2 = -1;
  }
  return iVar2;
}

