/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb86e9c..0xb86fc0 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b86e9c_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_b86e9c_1;

typedef struct st_b86e9c_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_b86e9c_0;

typedef struct st_b86e9c_3 {
    unsigned long long field_0;
} st_b86e9c_3;

extern unsigned long long g_b8bcfc;
extern unsigned long long g_bef1c8;
extern long long g_cb8bc5;
extern long long g_cba67f;

unsigned long long sub_b86e9c(st_b86e9c_0 **a0, long long *a1)
{
    st_b86e9c_0 *v5;  // x20
    st_b86e9c_1 *v6;  // x19
    unsigned long long *v7;  // x20
    unsigned long long v8;  // x0
    st_b86e9c_1 *v0;  // [bp-0x38], Other Possible Types: unsigned long long *
    st_b86e9c_1 **v1;  // [bp-0x30], Other Possible Types: st_b86e9c_3 **
    unsigned long long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = *a0;
    v6 = &v5->padding_0[8];
    /* unsupported instruction */;
    /* unsupported instruction */;
    if (!/* unsupported instruction */)
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ ^ 1)
            goto LABEL_b86f08;
        v7 = &v5->field_10;
        if (v5->field_10 != 0x8000000000000000)
            goto LABEL_b86f28;
LABEL_b86ed8:
        v0 = v6;
        v1 = &v0;
        v2 = &g_bef1c8;
        v8 = sub_be769c(*a1, a1[1], &g_cb8bc5, &v1);
    }
    else
    {
        /* unsupported instruction */;
LABEL_b86f08:
        sub_c7573c(&v5->padding_0[8]);
        v7 = &v5->field_10;
        if (v5->field_10 == 0x8000000000000000)
            goto LABEL_b86ed8;
LABEL_b86f28:
        v0 = v7;
        v1 = &v0;
        v2 = &g_b8bcfc;
        v8 = sub_be769c(*a1, a1[1], &g_cba67f, &v1);
    }
    while (1)
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ != 1)
        {
            /* unsupported instruction */;
            sub_c75418(v6);
            return v8;
        }
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (!(/* unsupported instruction */ ^ 1))
            return v8;
    }
}
