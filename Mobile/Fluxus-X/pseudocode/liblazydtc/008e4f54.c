/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4f54
 */

bool FUN_008e4f54(void)

{
  bool bVar1;
  
  if (DAT_00d1fef0 == (FILE *)0x0) {
    bVar1 = false;
    if (DAT_00d1fee8 != (char *)0x0) {
      DAT_00d1fef0 = fopen(DAT_00d1fee8,"a+");
      bVar1 = DAT_00d1fef0 != (FILE *)0x0;
    }
  }
  else {
    bVar1 = true;
  }
  return bVar1;
}

