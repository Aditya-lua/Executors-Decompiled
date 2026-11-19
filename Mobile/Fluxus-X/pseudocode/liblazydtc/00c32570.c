/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32570
 */

int OCSP_check_validity(ASN1_GENERALIZEDTIME *thisupd,ASN1_GENERALIZEDTIME *nextupd,long sec,
                       long maxsec)

{
  int iVar1;
  
  iVar1 = OCSP_check_validity(thisupd,nextupd,sec,maxsec);
  return iVar1;
}

