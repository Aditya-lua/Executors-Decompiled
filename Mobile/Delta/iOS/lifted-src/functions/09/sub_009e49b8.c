/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e49b8..0x9e4b00 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e49b8_0 {
    char padding_0[8];
    unsigned int field_8;
    unsigned int field_c;
    char padding_10[4];
    unsigned int field_14;
} st_9e49b8_0;

extern char g_800000;

st_9e49b8_0 * sub_9e49b8(st_9e49b8_0 *a0, unsigned long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long v17;  // x8
    unsigned long long v18;  // x21
    unsigned long long v19;  // x0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long v12;  // x1
    unsigned long v13;  // x8
    st_9e49b8_0 *v14;  // x22
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if ((int)a1 <= (int)a0->field_c)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if ((int)a1 >= &g_800000)
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_lib.c", 269, "bn_expand_internal");
        v12 = 114;
        goto LABEL_9e4a5c;
    }
    v13 = a0->field_14;
    if (!(v13 >> 1 & 1))
    {
        v14 = a0;
        v15 = (long long)(a1 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(a1, 3) & 0x7fffffff8 & 0x7ffffffff;
        if (!(v13 >> 3 & 1))
        {
            v16 = sub_a6bffc(v15, "crypto/bn/bn_lib.c", 279);
            if (v16)
                goto LABEL_9e4a88;
            goto LABEL_9e4a64;
        }
        else
        {
            v16 = sub_a6ce80(v15, "crypto/bn/bn_lib.c", 277);
            if (!v16)
                goto LABEL_9e4a64;
LABEL_9e4a88:
            v17 = v14->field_8;
            v18 = (unsigned long long)v14->padding_0;
            v19 = v14;
            if ((int)v17 >= 1)
            {
                _memcpy(v16, v18, v17 * 8);
                v19 = v14;
            }
            if (v18)
            {
                if (!((char)(*(char *)(v19 + 20)) >> 3 & 1))
                    sub_a6c4e8(v18);
                else
                    sub_a6d4c0(v18);
                v19 = v14;
            }
            *(unsigned long long *)v19 = v16;
            *(unsigned int *)(v19 + 12) = a1;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_lib.c", 273, "bn_expand_internal");
        v12 = 105;
LABEL_9e4a5c:
        sub_a36abc(3, v12, 0);
LABEL_9e4a64:
        v19 = 0;
    }
    return v19;
}
