/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeef5c
 */

int UI_set_result(UI *ui,UI_STRING *uis,char *result)

{
  int iVar1;
  size_t sVar2;
  
  sVar2 = strlen(result);
  iVar1 = UI_set_result_ex(ui,uis,result,sVar2);
  return iVar1;
}

