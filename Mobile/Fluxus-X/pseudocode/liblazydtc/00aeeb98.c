/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeeb98
 */

int UI_ctrl(UI *ui,int cmd,long i,void *p,f *f)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  
  if (ui == (UI *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x22b,"UI_ctrl");
    uVar3 = 0xc0102;
  }
  else {
    if (cmd == 2) {
      return *(uint *)(ui + 0x28) & 1;
    }
    if (cmd == 1) {
      uVar2 = *(uint *)(ui + 0x28);
      uVar1 = uVar2 & 0xfffffeff;
      if (i != 0) {
        uVar1 = uVar2 | 0x100;
      }
      *(uint *)(ui + 0x28) = uVar1;
      return uVar2 >> 8 & 1;
    }
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x23d,"UI_ctrl");
    uVar3 = 0x6a;
  }
  ERR_set_error(0x28,uVar3,0);
  return -1;
}

