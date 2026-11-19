/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00901f5c
 */

/* cpr::TEMPNAMEPLACEHOLDERVALUE(cpr::PostRedirectFlags&, cpr::PostRedirectFlags) */

void cpr::operator&=(byte *param_1,byte param_2)

{
  *param_1 = *param_1 & param_2;
  return;
}

