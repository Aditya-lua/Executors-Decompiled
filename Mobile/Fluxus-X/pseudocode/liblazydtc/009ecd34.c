/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ecd34
 */

ASN1_OBJECT * ASN1_OBJECT_create(int nid,uchar *data,int len,char *sn,char *ln)

{
  ASN1_OBJECT *pAVar1;
  ASN1_OBJECT local_38;
  
  local_38.flags = 0xd;
  local_38.sn = sn;
  local_38.ln = (char **)ln;
  local_38.nid = nid;
  local_38.length = len;
  local_38.data = data;
  pAVar1 = OBJ_dup(&local_38);
  return pAVar1;
}

