/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa792b8..0xa79500 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a792b8_2 {
    char padding_0[8];
    struct st_a792b8_3 *field_8;
} st_a792b8_2;

typedef struct st_a792b8_1 {
    char padding_0[208];
    char field_d0;
} st_a792b8_1;

typedef struct st_a792b8_0 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    char padding_18[8];
    long long field_20;
    char padding_28[32];
    char field_48;
} st_a792b8_0;

typedef struct st_a792b8_3 {
    unsigned long long field_0;
} st_a792b8_3;


unsigned long long sub_a792b8(char idx, char a1, char a2)
{
    char v18;  // x0
    st_a792b8_0 *v19;  // x23
    unsigned long long v20;  // x0
    unsigned long long v21;  // x21
    unsigned long long v22;  // 4120
    st_a792b8_1 *v23;  // x24
    st_a792b8_2 *v24;  // x0
    unsigned long long v25;  // 4112
    char v0;  // [bp-0x150]
    char v1;  // [bp-0x140]
    char v2;  // [bp-0x130]
    unsigned long v3;  // [bp-0x128]
    char v4;  // [bp-0x120]
    char v5;  // [bp-0x110]
    char v6;  // [bp-0x100]
    char v7;  // [bp-0xf0]
    char v8;  // [bp-0xe0]
    char v9;  // [bp-0xd0]
    char v10;  // [bp-0xc0]
    char v11;  // [bp-0xb0]
    char v12;  // [bp-0xa0]
    char v13;  // [bp-0x90]
    char v14;  // [bp-0x80]
    char v15;  // [bp-0x70]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v15 = 0;
    v13 = 0;
    v14 = 0;
    v11 = 0;
    v12 = 0;
    v9 = 0;
    v10 = 0;
    v7 = 0;
    v8 = 0;
    v5 = 0;
    v6 = 0;
    v2 = 0;
    v4 = 0;
    v0 = 0;
    v1 = 0;
    if (a1)
        *(unsigned long long *)a1 = 0;
    v18 = sub_a6820c(*(long long *)(idx + 80), 1);
    if (!v18)
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
        sub_a36abc(15, 0xc0103, 0);
        return 0;
    }
    v19 = (st_a792b8_0 *)v18;
    v20 = sub_a7c198(*(long long *)(v18 + 32));
    if (!(unsigned int)v20)
        return v20;
    v3 = *(long long *)(idx + 40);
    v21 = sub_ad66d4(v19->field_8, &v0);
    v22 = arm64g_calculate_condition(1, v21 & 0xffffffff, 1, 0);
    if (!(v22 & 1))
    {
        v23 = sub_ad69f8(v19->field_8, v21);
    }
    else if (sub_ad68a0(v19->field_8, idx))
    {
        *(st_a792b8_0 **)(idx + 88) = v19;
        if ((int)sub_ad69e4(v19->field_10) >= 1)
        {
            v24 = sub_ad69f8(v19->field_10, 0);
            v24->field_8();
        }
        v23 = (st_a792b8_1 *)idx;
        if (!a2)
        {
            v19->field_48 = v19->field_48 & 254;
            v23 = (st_a792b8_1 *)idx;
        }
    }
    else
    {
        sub_a7c1b4(v19->field_20);
        return 0;
    }
    sub_a7c1b4(v19->field_20);
    if (a1)
    {
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if (v23->field_d0 & 1 && !sub_a779ec(v23, 0))
        {
            sub_a78ccc(v23);
LABEL_a79474:
            sub_a368c8();
            sub_a369bc("crypto/provider_core.c", 694, "ossl_provider_add_to_store");
            sub_a36abc(15, 0x8000f, 0);
            return 0;
        }
        v25 = arm64g_calculate_condition(1, /* unsupported instruction */, 1, 0);
        if (v25 & 1)
            goto LABEL_a79474;
        *(st_a792b8_1 **)a1 = v23;
    }
    if (!(v21 >> 31 & 1))
    {
        if (idx && !sub_c692a4(idx, 1, 0))
            sub_a79e58(idx);
        sub_a78ccc(idx);
    }
    else
    {
        sub_a2e1e4(*(long long *)(idx + 80));
    }
    return 1;
}
