/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96f2fc..0x96f4f4 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96f2fc_1 {
    char padding_0[216];
    struct st_96f2fc_0 *field_d8;
} st_96f2fc_1;

typedef struct st_96f2fc_4 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_96f2fc_4;

typedef struct st_96f2fc_0 {
    char padding_0[48];
    unsigned long long field_30;
} st_96f2fc_0;

typedef struct st_96f2fc_2 {
    char padding_0[8];
    struct st_96f2fc_3 *field_8;
    char padding_10[8];
    struct st_96f2fc_1 *field_18;
    char padding_20[576];
    long long field_260;
    char padding_268[128];
    long long field_2e8;
} st_96f2fc_2;

typedef struct st_96f2fc_3 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_96f2fc_3;

extern char g_10002b0;

long long sub_96f2fc(st_96f2fc_2 *a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    long long v15;  // x22
    long long v16;  // x0
    long long *v17;  // x24
    st_96f2fc_4 *v18;  // x25
    long long v19;  // x2
    long long v20;  // x1
    long long v0;  // [bp-0x160]
    unsigned long long v1;  // [bp-0x158]
    long long v2;  // [bp-0x150], Other Possible Types: unsigned long long
    char *v3;  // [bp-0x148]
    long long v4;  // [bp-0x138]
    long long v5;  // [bp-0x130]
    char v6;  // [bp-0x128]
    char v7;  // [bp-0x100]
    char v8;  // [bp-0xd8]
    uint128_t v9;  // [bp-0x98]
    uint128_t v10;  // [bp-0x88]
    unsigned long v11;  // [bp-0x78]
    unsigned long v12;  // [bp-0x58]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v15 = sub_95a6a8();
    v16 = sub_a50a58(v15);
    v5 = 0;
    if (v15)
    {
        v17 = &a0->field_8->field_0;
        v18 = &v6;
        if (v17[142])
        {
            v18 = &v7;
            sub_a71618("properties");
        }
        sub_a71bbc();
        v18->field_0 = v9;
        v18->field_10 = v10;
        v18->field_20 = v11;
        if (sub_962d78(a0, &v9, 64, &v4))
        {
            if (a0->field_18->field_d8->field_30 != a1 && a0->field_260 && a0->field_2e8)
            {
                *(unsigned int *)&v2 = 0;
                if (!sub_96eae0(a0->field_8->field_0, a0->field_8->field_470, v15, &a0[2].padding_20[380], "finished", 8, 0, 0, &v8, v4, v2))
                {
                    sub_a368c8();
                    v19 = "tls13_hkdf_expand";
                    v20 = 113;
                    goto LABEL_96f490;
                }
            }
            v2 = 128;
            v3 = &v5;
            v0 = v4;
            v1 = a3;
            if (sub_a58460(*v17, "HMAC", v17[142], v16, &v6))
                goto LABEL_96f4ac;
            sub_a368c8();
            v19 = "tls13_final_finish_mac";
            v20 = 310;
LABEL_96f490:
            sub_a369bc("ssl/tls13_enc.c", v20, v19);
            sub_9a58a4(a0, 80, 0xc0103, 0);
        }
LABEL_96f4ac:
        sub_a66ec0(&v8, 64);
    }
    else
    {
        v5 = 0;
    }
    if (*(long long *)&g_10002b0 == v12)
        return v5;
    ___stack_chk_fail();
}
