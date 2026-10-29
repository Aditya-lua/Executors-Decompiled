/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99f240..0x99f3dc (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99f240_0 {
    long long field_0;
    unsigned long long field_8;
} st_99f240_0;

typedef struct st_99f240_1 {
    char padding_0[2176];
    unsigned long long field_880;
    char padding_888[424];
    long long field_a30;
    unsigned long long field_a38;
    char padding_a40[296];
    unsigned long long field_b68;
} st_99f240_1;


unsigned long long sub_99f240(st_99f240_1 *a0, st_99f240_0 *a1, unsigned long long a2, long long a3, long long a4)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    st_99f240_1 *v19;  // x0
    long long v20;  // x1
    long long v21;  // x2
    unsigned long long v22;  // x0
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x21
    unsigned long long v17;  // x0
    unsigned long long v18;  // x8
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if ((unsigned int)a2 == 0x4000)
        return 1;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    if (a0->field_b68)
    {
        v16 = a1->field_8;
        sub_a6c2e4(a0->field_a30, "ssl/statem/extensions_clnt.c", 1550);
        a0->field_a30 = 0;
        *(unsigned short *)&a0->field_a38 = v16;
        if (!v16)
            return 1;
        v17 = sub_a6bf4c(v16, "ssl/statem/extensions_clnt.c", 1555);
        a0->field_a30 = v17;
        if (v17)
        {
            v18 = a1->field_8;
            if (v16 <= v18)
            {
                _memcpy();
                a1->field_0 = a1->field_0 + v16;
                a1->field_8 = v18 - v16;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 1562, "tls_parse_stoc_sct");
            v19 = a0;
            v20 = 80;
            v21 = 786691;
        }
        else
        {
            *(unsigned short *)&a0->field_a38 = 0;
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 1558, "tls_parse_stoc_sct");
            v19 = a0;
            v20 = 80;
            v21 = 524303;
        }
    }
    else
    {
        if (sub_9a06cc(a0->field_880 + 128, 2 & ~((unsigned int)a2 >> 7), 18, 0))
        {
            v22 = sub_9a07a4(a0, a2, 18, a1->field_0, a1->field_8, a3, a4);
            if (!(unsigned int)v22)
                return v22;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1579, "tls_parse_stoc_sct");
        v19 = a0;
        v20 = 110;
        v21 = 110;
    }
    sub_9a58a4(v19, v20, v21, 0);
    return 0;
}
