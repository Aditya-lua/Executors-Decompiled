/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aadbf0
 */

int OBJ_new_nid(int num)

{
  int iVar1;
  
  iVar1 = DAT_00cc915c;
  DAT_00cc915c = DAT_00cc915c + num;
  return iVar1;
}

