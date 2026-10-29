/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb57ed4..0xb58174 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b57ed4_0 {
    char padding_0[448];
    unsigned int field_1c0;
} st_b57ed4_0;


unsigned long long sub_b57ed4(st_b57ed4_0 *a0, long long a1)
{
    unsigned long long v4;  // w0
    long long v5;  // x1
    unsigned long long v14;  // x21
    unsigned int v15;  // w8
    unsigned long long v16;  // x0
    unsigned long long idx;  // x20
    unsigned long long v7;  // x0
    unsigned long long v8;  // x8
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x25
    unsigned long long v13;  // x0
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = (unsigned int)sub_b5c36c();
    if (!v4)
        return v4;
    if (!sub_a6fbc4(a1, "keybits") || sub_a70efc())
    {
        idx = sub_a6fbc4(a1, "algorithm-id-params");
        v7 = sub_a6fbc4(a1, "alg_id_param");
        if (!idx && !v7)
            return 1;
        if (idx)
        {
            v8 = *(long long *)(idx + 16);
            v1 = v8;
            if (!v7)
                goto LABEL_b57f8c;
LABEL_b57f5c:
            v9 = *(long long *)(v7 + 16);
        }
        else
        {
            v8 = 0;
            v1 = 0;
            if (v7)
                goto LABEL_b57f5c;
LABEL_b57f8c:
            v9 = 0;
        }
        v0 = v9;
        if (!v8)
            v10 = 0;
        else
            v10 = &v1;
        if (!v9)
            v11 = 0;
        else
            v11 = &v0;
        if ((!idx || *(int *)(idx + 8) == 5) && (!v7 || *(int *)(v7 + 8) == 5))
        {
            v12 = v7;
            v13 = sub_9cf1f0();
            if (!v13)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/cipher_rc2.c", 135, "rc2_get_ctx_params");
                sub_a36abc(57, 0x8000d, 0);
                return 0;
            }
            v14 = v13;
            switch (v15)
            {
            case 40:
                break;
            case 128:
                break;
            case 64:
                break;
            default:
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/cipher_rc2.c", 70, "rc2_keybits_to_magic");
                sub_a36abc(57, 0x99, 0);
                break;
            }
            if (!sub_9c96ac(v14))
            {
                sub_a368c8(sub_9cf1fc(v14));
                sub_a369bc("providers/implementations/ciphers/cipher_rc2.c", 144, "rc2_get_ctx_params");
                sub_a36abc(57, 0x8000d, 0);
                return 0;
            }
            v16 = sub_9cf1e4(v14, v10);
            if (idx && !(v16 >> 31 & 1))
                *(unsigned long long *)(idx + 32) = v16 & 0xffffffff;
            if (v1 != v9)
                v16 = sub_9cf1e4(v14, v11);
            if (v12 && !(v16 >> 31 & 1))
            {
                *(unsigned long long *)(v12 + 32) = v16 & 0xffffffff;
                sub_9cf1fc(v14);
                return 1;
            }
            sub_9cf1fc(v14);
            if (!(v16 >> 31 & 1))
                return 1;
            sub_a368c8();
            v5 = 167;
        }
        else
        {
            sub_a368c8();
            v5 = 131;
        }
    }
    else
    {
        sub_a368c8();
        v5 = 115;
    }
    sub_a369bc("providers/implementations/ciphers/cipher_rc2.c", v5, "rc2_get_ctx_params");
    sub_a36abc(57, 104, 0);
    return 0;
}
