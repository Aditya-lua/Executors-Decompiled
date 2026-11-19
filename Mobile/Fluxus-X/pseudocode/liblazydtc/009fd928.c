/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd928
 */

int BIO_printf(BIO *bio,char *format,...)

{
  int iVar1;
  undefined8 in_x2;
  undefined8 in_x3;
  undefined8 in_x4;
  undefined8 in_x5;
  undefined8 in_x6;
  undefined8 in_x7;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined1 *local_60;
  undefined1 **ppuStack_58;
  undefined8 *puStack_50;
  undefined8 uStack_48;
  
  puStack_50 = &local_90;
  ppuStack_58 = &local_60;
  uStack_48 = 0xffffff80ffffffd0;
  local_90 = in_x2;
  uStack_88 = in_x3;
  local_80 = in_x4;
  uStack_78 = in_x5;
  local_70 = in_x6;
  uStack_68 = in_x7;
  local_60 = (undefined1 *)register0x00000008;
  iVar1 = BIO_vprintf(bio,format,&local_60);
  return iVar1;
}

