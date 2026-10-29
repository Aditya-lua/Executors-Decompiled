/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a5740..0x2a5850 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a5740_1 {
    char padding_0[20];
    unsigned int field_14;
} st_2a5740_1;

typedef struct st_2a5740_0 {
    char field_0;
} st_2a5740_0;

extern unsigned long long g_e7c160;
extern unsigned long long g_e7c1e0;
extern char g_10002b0;

void sub_2a5740(st_2a5740_1 *a0)
{
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long long *v25;  // x22
    unsigned int v26;  // w8
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    unsigned long long v24;  // x21
    st_2a5740_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_2a5740_0 *v1;  // [bp-0x78]
    uint128_t v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = &v14;
    v13 = v23;
    v24 = 0;
    v3 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = 0x4000000080000000c;
    v25 = &g_e7c1e0;
    do
    {
        sub_2aa6a8(a0);
        v26 = a0->field_14;
        if (v26 - 48 < 10)
            continue;
        if (v26 - 65 > 5 && 5 < v26 - 97)
        {
            v25 = &g_e7c160;
            break;
        }
    } while ((v24 += 4, v24 != 16));
    goto *((void *)(*v25));
}
