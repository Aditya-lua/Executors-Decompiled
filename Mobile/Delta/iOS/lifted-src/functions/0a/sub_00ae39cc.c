/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae39cc..0xae3b90 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae39cc_1 {
    struct st_ae39cc_0 *field_0;
    struct st_ae39cc_2 *field_8;
} st_ae39cc_1;

typedef struct st_ae39cc_2 {
    long long field_0;
    long long field_8;
} st_ae39cc_2;

typedef struct st_ae39cc_0 {
    struct st_ae39cc_0 *field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
} st_ae39cc_0;

extern unsigned long long g_c7c2eb;

st_ae39cc_0 * sub_ae39cc(long long a0, st_ae39cc_0 *a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v16;  // x28
    unsigned long long v17;  // x27
    unsigned long long v26;  // x30
    st_ae39cc_0 *v27;  // x21
    unsigned long v28;  // x24
    st_ae39cc_1 *v29;  // x26
    st_ae39cc_0 *v30;  // x0
    long long v31;  // x2
    unsigned long long v18;  // x26
    unsigned long long v19;  // x25
    unsigned long long v20;  // x24
    unsigned long long v21;  // x23
    unsigned long long v22;  // x22
    unsigned long long v23;  // x21
    unsigned long long v24;  // x20
    unsigned long long v25;  // x19
    st_ae39cc_0 *v0;  // [bp-0x80], Other Possible Types: unsigned long long, unsigned long
    unsigned long long v1;  // [bp-0x78]
    st_ae39cc_0 *v2;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x60]
    unsigned long long v4;  // [bp-0x58]
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

    if (!a1)
        return 1;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = &v15;
    v14 = v26;
    v1 = &g_c7c2eb;
    v2 = a3;
    v0 = a2;
    sub_9d524c();
    if (!(int)a1->field_0)
    {
        v0 = (unsigned int)a2 + 2;
        v1 = &g_c7c2eb;
        sub_9d524c(a0, "%*sinherit\n");
LABEL_ae3b6c:
        v30 = 1;
    }
    else if ((int)a1->field_0 == 1)
    {
        if ((int)sub_ad69e4(*(long long *)&a1->field_1) < 1)
            goto LABEL_ae3b6c;
        v27 = 0;
        v28 = (unsigned int)a2 + 2;
        while (1)
        {
            v29 = sub_ad69f8(*(long long *)&a1->field_1, v27);
            if ((int)v29->field_0 != 1)
            {
                if ((int)v29->field_0)
                    goto LABEL_ae3b4c;
                v30 = sub_aef3cc(0, v29->field_8);
                if (!v30)
                    break;
                v1 = &g_c7c2eb;
                v2 = v30;
                v0 = v28;
                sub_9d524c(a0, "%*s%s\n");
                v31 = 83;
                goto LABEL_ae3a5c;
            }
            else
            {
                v30 = sub_aef3cc(0, v29->field_8->field_0);
                if (!v30)
                    break;
                v1 = &g_c7c2eb;
                v2 = v30;
                v0 = v28;
                sub_9d524c(a0, "%*s%s-");
                sub_a6c2e4(v30, "crypto/x509/v3_asid.c", 89);
                v30 = sub_aef3cc(0, v29->field_8->field_8);
                if (!v30)
                    break;
                v0 = v30;
                sub_9d524c(a0, "%s\n");
                v31 = 93;
LABEL_ae3a5c:
                sub_a6c2e4(v30, "crypto/x509/v3_asid.c", v31);
                v27 = (unsigned int)v27 + 1;
                if ((int)sub_ad69e4(*(long long *)&a1->field_1) <= (int)(unsigned int)v27)
                    goto LABEL_ae3b6c;
            }
        }
    }
    else
    {
LABEL_ae3b4c:
        v30 = 0;
    }
    return (unsigned int)v30;
}
