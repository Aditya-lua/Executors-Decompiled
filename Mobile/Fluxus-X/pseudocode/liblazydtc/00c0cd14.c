/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0cd14
 */

int FUN_00c0cd14(char *param_1,size_t param_2,__locale_t param_3,char *param_4,undefined8 param_5,
                undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  int iVar1;
  __locale_t __dataset;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined1 *local_80;
  undefined1 **ppuStack_78;
  undefined8 *puStack_70;
  undefined8 uStack_68;
  
  local_a0 = param_5;
  uStack_98 = param_6;
  local_90 = param_7;
  uStack_88 = param_8;
  __dataset = uselocale(param_3);
  uStack_68 = 0xffffff80ffffffe0;
  local_80 = (undefined1 *)register0x00000008;
  ppuStack_78 = &local_80;
  puStack_70 = &local_a0;
  iVar1 = vsnprintf(param_1,param_2,param_4,&local_80);
  if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00c0cda8 to 00c0cdaf has its CatchHandler @ 00c0cdd0 */
    uselocale(__dataset);
  }
  return iVar1;
}

