/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc60fd8..0xc613b0 (984 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c60fd8_0 {
    unsigned int field_0[4];
    char field_c;
    char padding_d[3];
    unsigned int field_10[4];
    char field_1c;
    char padding_1d[3];
    uint128_t field_20;
    unsigned int field_30;
    unsigned int field_34;
    char padding_38[192];
    unsigned long long field_f8;
    char padding_100[104];
    unsigned long long field_168;
    char padding_170[16];
    unsigned long long field_180;
    char padding_188[24];
    unsigned long long field_1a0;
    char padding_1a8[32];
    unsigned long long field_1c8;
    unsigned long long field_1d0;
    char padding_1d8[80];
    unsigned int field_228;
    unsigned int field_22c;
    unsigned int field_230;
    unsigned int field_234;
} st_c60fd8_0;

extern unsigned int g_d27b9c;
extern unsigned int g_d27c5c;

unsigned int sub_c60fd8(void* a0)
{
    unsigned int *v3;  // x20
    unsigned long long idx;  // x21
    long long v13;  // x0
    st_c60fd8_0 *v14;  // x8
    unsigned long v15;  // x8
    unsigned int v5;  // x0
    unsigned int v6;  // x20
    unsigned int *v7;  // x22
    unsigned int *v8;  // x21
    unsigned int *v9;  // x21
    unsigned int v10;  // x0
    void* v11;  // x23
    unsigned int v12;  // w0
    unsigned int v0;  // [bp-0x4c]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    *(unsigned int *)&a0[1696] = 0;
    v3 = &g_d27b9c;
    idx = 150;
    do
    {
        if (*v3)
        {
            v5 = sub_963d3c(sub_95c580());
            *(unsigned long long *)((char *)a0 + 8 * idx) = v5;
            if (!v5)
                *(int *)&a0[1696] = (int)a0[1696] | *(int *)((char *)v3 - 4);
        }
    } while ((idx += 1, v3 += 2, idx != 174));
    v6 = 0;
    *(unsigned int *)&a0[1700] = 0;
    v7 = &g_d27c5c;
    v8 = &g_d27c5c;
    do
    {
        v9 = v8 + 2;
        v10 = sub_961b9c(*(long long *)a0, *v8, (long long)a0[1136]);
        v11 = a0 + v6 * 8;
        *(unsigned long long *)&v11[1392] = v10;
        if (v10)
        {
            v12 = sub_a50ac8();
            if ((int)v12 < 1)
                return 0;
            *(unsigned long long *)&v11[1504] = v12;
        }
        else
        {
            *(int *)&a0[1700] = (int)a0[1700] | *(int *)((char *)v7 - 4);
        }
    } while ((v6 += 1, v7 = v9, v8 = v9, v6 != 14));
    *(unsigned long long *)&a0[1704] = 0;
    if (sub_a5ee08(sub_95c580(sub_a36c8c()), "DSA"))
        sub_a5ed84();
    else
        *(unsigned int *)&a0[1708] = (int)a0[1708] | 2;
    if (sub_a527e4(sub_95c580(), "DH"))
        sub_a52760();
    else
        *(unsigned int *)&a0[1704] = (int)a0[1704] | 258;
    if (sub_a527e4(sub_95c580(), "ECDH"))
        sub_a52760();
    else
        *(unsigned int *)&a0[1704] = (int)a0[1704] | 132;
    if (sub_a5ee08(sub_95c580(), "ECDSA"))
        sub_a5ed84();
    else
        *(unsigned int *)&a0[1708] = (int)a0[1708] | 8;
    v13 = sub_a36cd4();
    v14 = a0 + 1144;
    *(unsigned long long *)&a0[1192] = 0;
    *(uint128_t *)v14->field_0 = 0x3570000035700000357;
    *(uint128_t *)&v14->field_c = 0x3570000035700000357;
    *(uint128_t *)&v14->field_10[3] = 855;
    if (sub_95c560(sub_95c574(v13), "gost-mac") && 0 >= (int)sub_95c544())
        v0 = 0;
    sub_95c56c();
    *(unsigned int *)&a0[1156] = v0;
    if (v0)
        *(unsigned long long *)&a0[1528] = 32;
    else
        *(unsigned int *)&a0[1700] = (int)a0[1700] | 8;
    if (sub_95c560(sub_95c574(), "gost-mac-12") && 0 >= (int)sub_95c544())
        v0 = 0;
    sub_95c56c();
    *(unsigned int *)&a0[1172] = v0;
    if (v0)
        *(unsigned long long *)&a0[1560] = 32;
    else
        *(unsigned int *)&a0[1700] = (int)a0[1700] | 0x100;
    if (sub_95c560(sub_95c574(), "magma-mac") && 0 >= (int)sub_95c544())
        v0 = 0;
    sub_95c56c();
    *(unsigned int *)&a0[1192] = v0;
    if (v0)
        *(unsigned long long *)&a0[1600] = 32;
    else
        *(unsigned int *)&a0[1700] = (int)a0[1700] | 0x400;
    if (sub_95c560(sub_95c574(), "kuznyechik-mac") && 0 >= (int)sub_95c544())
        v0 = 0;
    sub_95c56c();
    *(unsigned int *)&a0[1196] = v0;
    if (v0)
        *(unsigned long long *)&a0[1608] = 32;
    else
        *(unsigned int *)&a0[1700] = (int)a0[1700] | 0x800;
    if (sub_95c560(sub_95c574(), "gost2001") && 0 >= (int)sub_95c544())
        v0 = 0;
    sub_95c56c();
    if (!v0)
        *(unsigned int *)&a0[1708] = (int)a0[1708] | 160;
    if (sub_95c560(sub_95c574(), "gost2012_256") && 0 >= (int)sub_95c544())
        v0 = 0;
    sub_95c56c();
    if (!v0)
        *(unsigned int *)&a0[1708] = (int)a0[1708] | 128;
    if (sub_95c560(sub_95c574(), "gost2012_512") && 0 >= (int)sub_95c544())
        v0 = 0;
    sub_95c56c();
    v15 = (int)a0[1708];
    if (!v0)
    {
        v15 = (unsigned int)v15 | 128;
        *(unsigned int *)&a0[1708] = v15;
    }
    if (!(~(unsigned int)v15 & 160))
        *(unsigned int *)&a0[1704] = (int)a0[1704] | 16;
    if (v15 >> 7 & 1)
        *(unsigned int *)&a0[1704] = (int)a0[1704] | 0x200;
    return 1;
}
