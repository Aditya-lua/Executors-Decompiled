/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95e0cc..0x95e294 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95e0cc_2 {
    unsigned int field_0;
    char padding_4[12];
    struct st_95e0cc_0 *field_10;
    struct st_95e0cc_0 *field_18;
} st_95e0cc_2;

typedef struct st_95e0cc_0 {
    unsigned int field_0;
    char padding_4[44];
    struct st_95e0cc_1 *field_30;
    struct st_95e0cc_1 *field_38;
} st_95e0cc_0;

typedef struct st_95e0cc_1 {
    unsigned long long field_0;
} st_95e0cc_1;


st_95e0cc_2 * sub_95e0cc(st_95e0cc_2 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long v8;  // x8
    unsigned long long idx;  // x19
    unsigned int v10;  // w8
    st_95e0cc_0 *v11;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_0;
    idx = a0;
    if (!(unsigned int)v8)
    {
LABEL_95e108:
        if (sub_966d14(idx))
        {
            sub_9662a0(*(long long *)(idx + 0x900));
            *(unsigned long long *)(idx + 0x900) = 0;
        }
        sub_9662a0(*(long long *)(idx + 2312));
        *(unsigned long long *)(idx + 2312) = 0;
        sub_a6c2e4(*(long long *)(idx + 2320), "ssl/ssl_lib.c", 590);
        *(unsigned int *)(idx + 2256) = 0;
        *(unsigned long long *)(idx + 5464) = 0;
        *(unsigned int *)(idx + 2408) = 0;
        *(unsigned int *)(idx + 1288) = 0;
        *(unsigned int *)(idx + 132) = 0;
        *(uint128_t *)(idx + 2320) = 0;
        if (*(int *)(idx + 2976))
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_lib.c", 601, "ossl_ssl_connection_reset");
            sub_a36abc(20, 0xc0103, 0);
            idx = 0;
        }
        else
        {
            sub_9a575c(idx);
            v10 = a0->field_18->field_0;
            *(unsigned int *)(idx + 72) = v10;
            *(unsigned int *)(idx + 2516) = v10;
            *(unsigned int *)(idx + 104) = 1;
            sub_9ebcf4(*(long long *)(idx + 248));
            *(unsigned long long *)(idx + 248) = 0;
            *(unsigned int *)(idx + 2512) = 0;
            *(unsigned int *)(idx + 2980) = 0xffffffff;
            *(uint128_t *)(idx + 2876) = 0;
            *(unsigned int *)(idx + 2892) = 0;
            sub_a3f73c(*(long long *)(idx + 3016));
            *(unsigned long long *)(idx + 3016) = 0;
            *(unsigned long *)(idx + 1348) = 0xffffffffffffffff;
            sub_afc404(*(long long *)(idx + 1336));
            *(uint128_t *)(idx + 1328) = 0;
            sub_af8a34(*(long long *)(idx + 1296), 0);
            sub_a6c2e4(*(long long *)(idx + 5512), "ssl/ssl_lib.c", 634);
            *(uint128_t *)(idx + 5512) = 0;
            v11 = a0->field_18;
            if (v11 == a0->field_10)
                v11->field_30();
            v11->field_38();
        }
    }
    else if (!(v8 >> 7 & 1))
    {
        idx = 0;
    }
    else
    {
        idx = sub_980dc8(a0);
        if (idx)
            goto LABEL_95e108;
    }
    return idx;
}
