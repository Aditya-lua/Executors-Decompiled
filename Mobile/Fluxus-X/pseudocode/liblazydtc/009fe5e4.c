/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fe5e4
 */

int BIO_vsnprintf(char *buf,size_t n,char *format,va_list args)

{
  int iVar1;
  int iVar2;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  int local_2c;
  ulong local_28;
  size_t local_20;
  char *pcStack_18;
  
  uStack_38 = *(undefined8 *)((long)args + 0x18);
  local_40 = *(undefined8 *)((long)args + 0x10);
  uStack_48 = *(undefined8 *)((long)args + 8);
  local_50 = *(undefined8 *)args;
  local_20 = n;
  pcStack_18 = buf;
  iVar1 = FUN_009fda6c(&pcStack_18,0,&local_20,&local_28,&local_2c,format,&local_50);
  iVar2 = -1;
  if (((iVar1 != 0) && (local_2c == 0)) && (iVar2 = (int)local_28, local_28 >> 0x1f != 0)) {
    iVar2 = -1;
  }
  return iVar2;
}

