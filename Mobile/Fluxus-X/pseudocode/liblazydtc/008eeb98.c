/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eeb98
 */

/* cpr::Session::SetSslOptions(cpr::SslOptions const&) */

void __thiscall cpr::Session::SetSslOptions(Session *this,SslOptions *param_1)

{
  undefined8 uVar1;
  SslOptions SVar2;
  long lVar3;
  SslOptions *pSVar4;
  ulong uVar5;
  void *__src;
  void *__dest;
  ulong uVar6;
  void *local_88;
  ulong local_80;
  undefined8 local_78;
  ulong local_70;
  ulong uStack_68;
  void *local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  SVar2 = *param_1;
  if (((byte)SVar2 & 1) == 0) {
    if ((byte)SVar2 >> 1 != 0) {
LAB_008eebe4:
      if (((byte)SVar2 & 1) == 0) {
        pSVar4 = param_1 + 1;
      }
      else {
        pSVar4 = *(SslOptions **)(param_1 + 0x10);
      }
      curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2729,pSVar4);
      SVar2 = param_1[0x18];
      if (((byte)SVar2 & 1) == 0) {
        if ((byte)SVar2 >> 1 != 0) {
LAB_008eec24:
          if (((byte)SVar2 & 1) == 0) {
            pSVar4 = param_1 + 0x19;
          }
          else {
            pSVar4 = *(SslOptions **)(param_1 + 0x28);
          }
          curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2766,pSVar4);
        }
      }
      else if (*(long *)(param_1 + 0x20) != 0) goto LAB_008eec24;
    }
  }
  else if (*(long *)(param_1 + 8) != 0) goto LAB_008eebe4;
  SVar2 = param_1[0x30];
  if (((byte)SVar2 & 1) == 0) {
    if ((byte)SVar2 >> 1 == 0) goto LAB_008eec74;
LAB_008eec58:
    if (((byte)SVar2 & 1) == 0) {
      pSVar4 = param_1 + 0x31;
    }
    else {
      pSVar4 = *(SslOptions **)(param_1 + 0x40);
    }
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2767,pSVar4);
    SVar2 = param_1[0x60];
    if (((byte)SVar2 & 1) == 0) {
      if ((byte)SVar2 >> 1 != 0) {
LAB_008eecb8:
        if (((byte)SVar2 & 1) == 0) {
          pSVar4 = param_1 + 0x61;
        }
        else {
          pSVar4 = *(SslOptions **)(param_1 + 0x70);
        }
        curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2768,pSVar4);
      }
    }
    else if (*(long *)(param_1 + 0x68) != 0) goto LAB_008eecb8;
    SVar2 = param_1[0x78];
    if (((byte)SVar2 & 1) == 0) {
      if ((byte)SVar2 >> 1 != 0) {
LAB_008eecf8:
        if (((byte)SVar2 & 1) == 0) {
          pSVar4 = param_1 + 0x79;
        }
        else {
          pSVar4 = *(SslOptions **)(param_1 + 0x88);
        }
        curl_easy_setopt(**(undefined8 **)(this + 0x18),0x272a,pSVar4);
      }
    }
    else if (*(long *)(param_1 + 0x80) != 0) goto LAB_008eecf8;
  }
  else {
    if (*(long *)(param_1 + 0x38) != 0) goto LAB_008eec58;
LAB_008eec74:
    SVar2 = param_1[0x48];
    if (((byte)SVar2 & 1) == 0) {
      if ((byte)SVar2 >> 1 != 0) {
LAB_008eed24:
        local_70 = 0;
        uStack_68 = 0;
        local_60 = (void *)0x0;
        if (((byte)SVar2 & 1) == 0) {
          local_60 = *(void **)(param_1 + 0x58);
          uStack_68 = *(ulong *)(param_1 + 0x50);
          local_70 = *(ulong *)(param_1 + 0x48);
        }
        else {
          uVar5 = *(ulong *)(param_1 + 0x50);
          if (0xffffffffffffffef < uVar5) {
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          __src = *(void **)(param_1 + 0x58);
          if (uVar5 < 0x17) {
            __dest = (void *)((ulong)&local_70 | 1);
            local_70 = (ulong)(byte)((int)uVar5 << 1);
            if (uVar5 != 0) goto LAB_008eed94;
          }
          else {
            uVar6 = uVar5 + 0x10 & 0xfffffffffffffff0;
            __dest = operator_new(uVar6);
            local_70 = uVar6 | 1;
            uStack_68 = uVar5;
            local_60 = __dest;
LAB_008eed94:
            memcpy(__dest,__src,uVar5);
          }
          *(undefined1 *)((long)__dest + uVar5) = 0;
        }
        local_78 = 0;
        if ((local_70 & 1) == 0) {
          local_80 = local_70 >> 1 & 0x7f;
          local_88 = (void *)((ulong)&local_70 | 1);
        }
        else {
          local_80 = uStack_68;
          local_88 = local_60;
        }
                    /* try { // try from 008eeddc to 008eee67 has its CatchHandler @ 008ef144 */
        curl_easy_setopt(**(undefined8 **)(this + 0x18),0x9d64,&local_88);
        SVar2 = param_1[0x60];
        if (((byte)SVar2 & 1) == 0) {
          if ((byte)SVar2 >> 1 != 0) {
LAB_008eee08:
            if (((byte)SVar2 & 1) == 0) {
              pSVar4 = param_1 + 0x61;
            }
            else {
              pSVar4 = *(SslOptions **)(param_1 + 0x70);
            }
            curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2768,pSVar4);
          }
        }
        else if (*(long *)(param_1 + 0x68) != 0) goto LAB_008eee08;
        SVar2 = param_1[0x78];
        if (((byte)SVar2 & 1) == 0) {
          if ((byte)SVar2 >> 1 != 0) {
LAB_008eee48:
            if (((byte)SVar2 & 1) == 0) {
              pSVar4 = param_1 + 0x79;
            }
            else {
              pSVar4 = *(SslOptions **)(param_1 + 0x88);
            }
            curl_easy_setopt(**(undefined8 **)(this + 0x18),0x272a,pSVar4);
          }
        }
        else if (*(long *)(param_1 + 0x80) != 0) goto LAB_008eee48;
        if ((local_70 & 1) != 0) {
          operator_delete(local_60);
        }
      }
    }
    else if (*(long *)(param_1 + 0x50) != 0) goto LAB_008eed24;
  }
  SVar2 = param_1[0x90];
  if (((byte)SVar2 & 1) == 0) {
    if ((byte)SVar2 >> 1 != 0) {
LAB_008eee98:
      if (((byte)SVar2 & 1) == 0) {
        pSVar4 = param_1 + 0x91;
      }
      else {
        pSVar4 = *(SslOptions **)(param_1 + 0xa0);
      }
      curl_easy_setopt(**(undefined8 **)(this + 0x18),0x27f6,pSVar4);
    }
  }
  else if (*(long *)(param_1 + 0x98) != 0) goto LAB_008eee98;
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0xe2,param_1[0xa8]);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x40,param_1[0xaa]);
  uVar1 = 0;
  if (param_1[0xa9] != (SslOptions)0x0) {
    uVar1 = 2;
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x51,uVar1);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0xe8,param_1[0xab]);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x20,
                   *(uint *)(param_1 + 0xb4) | *(uint *)(param_1 + 0xac));
  if (param_1[0xb0] != (SslOptions)0x0) {
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0xd8,2);
  }
  SVar2 = param_1[0xb8];
  if (((byte)SVar2 & 1) == 0) {
    if ((byte)SVar2 >> 1 != 0) {
LAB_008eef6c:
      if (((byte)SVar2 & 1) == 0) {
        pSVar4 = param_1 + 0xb9;
      }
      else {
        pSVar4 = *(SslOptions **)(param_1 + 200);
      }
      curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2751,pSVar4);
    }
  }
  else if (*(long *)(param_1 + 0xc0) != 0) goto LAB_008eef6c;
  SVar2 = param_1[0xd0];
  if (((byte)SVar2 & 1) == 0) {
    if ((byte)SVar2 >> 1 != 0) {
LAB_008eefac:
      if (((byte)SVar2 & 1) == 0) {
        pSVar4 = param_1 + 0xd1;
      }
      else {
        pSVar4 = *(SslOptions **)(param_1 + 0xe0);
      }
      curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2771,pSVar4);
    }
  }
  else if (*(long *)(param_1 + 0xd8) != 0) goto LAB_008eefac;
  SVar2 = param_1[0xe8];
  if (((byte)SVar2 & 1) == 0) {
    if ((byte)SVar2 >> 1 == 0) goto LAB_008ef018;
LAB_008eefe0:
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0x4e8c,sslctx_function_load_ca_cert_from_buffer)
    ;
    if (((byte)param_1[0xe8] & 1) == 0) {
      pSVar4 = param_1 + 0xe9;
    }
    else {
      pSVar4 = *(SslOptions **)(param_1 + 0xf8);
    }
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0x277d,pSVar4);
    uVar5 = (ulong)(byte)param_1[0x100];
    if (((byte)param_1[0x100] & 1) == 0) goto LAB_008ef020;
LAB_008ef054:
    if (*(long *)(param_1 + 0x108) != 0) goto LAB_008ef028;
LAB_008ef05c:
    uVar5 = (ulong)(byte)param_1[0x118];
    if (((byte)param_1[0x118] & 1) != 0) goto LAB_008ef098;
LAB_008ef064:
    if (uVar5 >> 1 == 0) goto LAB_008ef0a4;
LAB_008ef070:
    if ((uVar5 & 1) == 0) {
      pSVar4 = param_1 + 0x119;
    }
    else {
      pSVar4 = *(SslOptions **)(param_1 + 0x128);
    }
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2763,pSVar4);
    SVar2 = param_1[0x130];
    if (((byte)SVar2 & 1) == 0) goto LAB_008ef0ac;
LAB_008ef0cc:
    if (*(long *)(param_1 + 0x138) == 0) goto LAB_008ef0f8;
  }
  else {
    if (*(long *)(param_1 + 0xf0) != 0) goto LAB_008eefe0;
LAB_008ef018:
    uVar5 = (ulong)(byte)param_1[0x100];
    if (((byte)param_1[0x100] & 1) != 0) goto LAB_008ef054;
LAB_008ef020:
    if (uVar5 >> 1 == 0) goto LAB_008ef05c;
LAB_008ef028:
    if ((uVar5 & 1) == 0) {
      pSVar4 = param_1 + 0x101;
    }
    else {
      pSVar4 = *(SslOptions **)(param_1 + 0x110);
    }
    curl_easy_setopt(**(undefined8 **)(this + 0x18),0x27b9,pSVar4);
    uVar5 = (ulong)(byte)param_1[0x118];
    if (((byte)param_1[0x118] & 1) == 0) goto LAB_008ef064;
LAB_008ef098:
    if (*(long *)(param_1 + 0x120) != 0) goto LAB_008ef070;
LAB_008ef0a4:
    SVar2 = param_1[0x130];
    if (((byte)SVar2 & 1) != 0) goto LAB_008ef0cc;
LAB_008ef0ac:
    if ((byte)SVar2 >> 1 == 0) goto LAB_008ef0f8;
  }
  if (((byte)param_1[0x118] & 1) == 0) {
    pSVar4 = param_1 + 0x119;
  }
  else {
    pSVar4 = *(SslOptions **)(param_1 + 0x128);
  }
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2824,pSVar4);
LAB_008ef0f8:
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x96,param_1[0x148]);
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

