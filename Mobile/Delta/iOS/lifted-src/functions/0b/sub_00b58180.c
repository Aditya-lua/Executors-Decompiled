/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb58180..0xb5832c (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b58180_0 {
    struct st_b58180_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    long long field_18;
} st_b58180_0;

extern char g_10002b0;

st_b58180_0 * sub_b58180(void* a0, st_b58180_0 *a1)
{
    st_b58180_0 *v6;  // w0
    st_b58180_0 *v7;  // x0
    st_b58180_0 *v8;  // x20
    unsigned int v9;  // w0
    st_b58180_0 *v10;  // w0
    unsigned long v0;  // [bp-0x48]
    st_b58180_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    unsigned long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (a1 && a1->field_0)
    {
        v6 = (st_b58180_0 *)(unsigned int)sub_b5b598();
        if (v6)
        {
            if (!sub_a6fbc4(a1, "keybits") || sub_a70ef8())
            {
                v7 = sub_a6fbc4(a1, "algorithm-id-params");
                if (!v7)
                    goto LABEL_b582fc;
                v0 = v7->field_10;
                v1 = 0;
                if (v7->field_8 != 5 || (unsigned long long)(long long)a0[80] > 16)
                {
                    v8 = 0;
LABEL_b58218:
                    sub_a368c8();
                    sub_a369bc("providers/implementations/ciphers/cipher_rc2.c", 207, "rc2_set_ctx_params");
                    sub_a36abc(57, 104, 0);
                    sub_9cf1fc(v8);
                    v6 = (st_b58180_0 *)0;
                }
                else
                {
                    v8 = sub_9cf1d8(0, &v0, v7->field_18);
                    if (!v8 || (v9 = sub_9c96fc(v8, &v1, &v2, (int)a0[80]), (long long)a0[80] != sub_9c96fc(v8, &v1, &v2, (int)a0[80]) || !sub_b5c520(a0, &v2) || (v10 = (st_b58180_0 *)(unsigned int)sub_b5861c((unsigned int)v1), *(unsigned long long *)&a0[448] = v10, !v10)))
                        goto LABEL_b58218;
                    sub_9cf1fc(v8);
                    *(long long *)&a0[72] = (unsigned long long)((long long)a0[448]) >> 3;
                    goto LABEL_b582fc;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/cipher_rc2.c", 0xbb, "rc2_set_ctx_params");
                sub_a36abc(57, 103, 0);
                v6 = (st_b58180_0 *)0;
            }
        }
    }
    else
    {
LABEL_b582fc:
        v6 = (st_b58180_0 *)1;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
