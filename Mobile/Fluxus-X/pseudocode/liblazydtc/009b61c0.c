/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b61c0
 */

int SSL_export_keying_material
              (SSL *s,uchar *out,size_t olen,char *label,size_t llen,uchar *p,size_t plen,
              int use_context)

{
  int iVar1;
  long lVar2;
  
  lVar2._0_4_ = s[3].sid_ctx_length;
  lVar2._4_1_ = s[3].sid_ctx[0];
  lVar2._5_1_ = s[3].sid_ctx[1];
  lVar2._6_1_ = s[3].sid_ctx[2];
  lVar2._7_1_ = s[3].sid_ctx[3];
  if ((lVar2 == 0) || ((s->version < 0x301 && (s->version != 0x100)))) {
    return -1;
  }
                    /* WARNING: Could not recover jumptable at 0x009b61f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(s->method->get_timeout + 0x58))();
  return iVar1;
}

