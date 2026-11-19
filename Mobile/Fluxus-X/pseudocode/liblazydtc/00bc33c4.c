/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc33c4
 */

/* std::logic_error::logic_error(char const*) */

void __thiscall std::logic_error::logic_error(logic_error *this,char *param_1)

{
  size_t sVar1;
  size_t *psVar2;
  
  *(undefined ***)this = &PTR__domain_error_00cb0548;
  sVar1 = strlen(param_1);
                    /* try { // try from 00bc33fc to 00bc3403 has its CatchHandler @ 00bc3438 */
  psVar2 = operator_new(sVar1 + 0x19);
  *psVar2 = sVar1;
  psVar2[1] = sVar1;
  *(undefined4 *)(psVar2 + 2) = 0;
  memcpy(psVar2 + 3,param_1,sVar1 + 1);
  *(size_t **)(this + 8) = psVar2 + 3;
  return;
}

