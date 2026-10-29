/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x970188..0x9703a8 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_970188_0 {
    char padding_0[72];
    unsigned int field_48;
    char padding_4c[44];
    unsigned int field_78;
    char padding_7c[756];
    unsigned long long field_370;
} st_970188_0;

extern char g_10002b0;

long long sub_970188(st_970188_0 *a0, unsigned int a1)
{
    long long v19;  // x0
    unsigned int v20;  // w0
    unsigned long long v21;  // x25
    unsigned long n;  // x24
    unsigned long v23;  // x19
    unsigned long long v0;  // [bp-0x160]
    char *v1;  // [bp-0x158]
    char *v2;  // [bp-0x150]
    char *v3;  // [bp-0x148]
    char *v4;  // [bp-0x140], Other Possible Types: unsigned long
    char *v5;  // [bp-0x138], Other Possible Types: unsigned long long
    char *v6;  // [bp-0x130], Other Possible Types: unsigned int
    uint128_t v7;  // [bp-0x128]
    long long v8;  // [bp-0x118]
    char *v9;  // [bp-0x108]
    char v10;  // [bp-0x100], Other Possible Types: unsigned long long
    long long v11;  // [bp-0xf8]
    char v12;  // [bp-0xf0], Other Possible Types: long long
    char v13;  // [bp-0xe8]
    char v14;  // [bp-0xd8]
    char v15;  // [bp-0x98]
    unsigned long v16;  // [bp-0x58]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v16 = *(long long *)&g_10002b0;
    v19 = sub_95a6a8();
    v9 = &v13;
    v20 = sub_a50ac8(v19);
    if ((int)v20 > 0)
    {
        if (a0->field_78 == a1)
            v21 = 1980;
        else
            v21 = 1916;
        v6 = &v10;
        v4 = &v9;
        v5 = &v11;
        v2 = &v15;
        v3 = &v12;
        v0 = 11;
        v1 = &v14;
        if (sub_96fe80())
        {
            n = v20;
            _memcpy(&a0->padding_0[v21], &v14, n);
            v8 = v19;
            v7 = 0;
            v6 = 0;
            v4 = a0->field_370;
            v5 = v10;
            if (sub_992148(a0, a0->field_48, a1 != 0, 3, &a0->padding_0[v21], n, &v15, v12, v9, v11, 0))
                v23 = sub_963768() != 0;
            else
                v23 = 0;
        }
        else
        {
            v23 = 0;
        }
        sub_a66ec0(&v15, 64);
        sub_a66ec0(&v14, 64);
        if (v9 != &v13)
            sub_a6c2e4(v9, "ssl/tls13_enc.c", 833);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/tls13_enc.c", 789, "tls13_update_key");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        v23 = 0;
    }
    if (*(long long *)&g_10002b0 == v16)
        return v23;
    ___stack_chk_fail();
}
