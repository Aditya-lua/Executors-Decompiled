/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cab08..0x9cacc4 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cab08_0 {
    struct st_9cab08_0 *field_0;
    struct st_9cab08_0 *field_1;
} st_9cab08_0;

extern char g_c7c2eb;

st_9cab08_0 * sub_9cab08(long long a0, unsigned long long a1, st_9cab08_0 *a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v16;  // x26
    unsigned long long v17;  // x25
    st_9cab08_0 *v26;  // x0
    unsigned long long *v27;  // x0
    unsigned int v29;  // w0
    unsigned long long v30;  // 4135
    long long v31;  // x23
    st_9cab08_0 *v32;  // x24
    char *v33;  // x8
    st_9cab08_0 *v34;  // x19
    unsigned long long v18;  // x24
    unsigned long long v19;  // x23
    unsigned long long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long long v24;  // x30
    char *v25;  // x25
    unsigned long long v0;  // [bp-0x80]
    char *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    char *v3;  // [bp-0x68]
    unsigned long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    if (!a2)
        return 1;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = &v15;
    v14 = v24;
    if (!sub_9e5c94(a2))
        v25 = &g_c7c2eb;
    else
        v25 = "-";
    v26 = sub_9d4cf4();
    if (!(unsigned int)v26)
        return v26;
    if (sub_9e4828(a2))
    {
        v0 = a1;
    }
    else if (64 >= (int)sub_9e46a8(a2))
    {
        v27 = sub_954340(a2);
        v3 = v25;
        v4 = *(long long *)sub_954340(a2);
        v1 = v25;
        v2 = *v27;
        v0 = a1;
    }
    else
    {
        v29 = sub_9e46a8(a2);
        v30 = arm64g_calculate_condition(177, v29, 7, 0);
        v31 = ((int)((v30 & 1 ? v29 + 14 : v29 + 7)) >> 3) + 1;
        v32 = sub_a6bf4c(v31, "crypto/asn1/t_pkey.c", 75);
        if (v32)
        {
            *(char *)&v32->field_0 = 0;
            if (*v25 == 45)
                v33 = " (Negative)";
            else
                v33 = &g_c7c2eb;
            v0 = a1;
            v1 = v33;
            if ((int)sub_9d524c() < 1)
                goto LABEL_9caca0;
            sub_9e5350(a2, (char *)&v32->field_0 + 1);
            v34 = sub_9ca9ac();
        }
        else
        {
LABEL_9caca0:
            v34 = 0;
        }
        sub_a6c4e8(v32, v31, "crypto/asn1/t_pkey.c", 94);
        return v34;
    }
    return (int)sub_9d524c(a0) > 0;
}
