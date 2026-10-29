/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x978b1c..0x978c28 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_978b1c_0 {
    char padding_0[72];
    long long field_48;
    char padding_50[1064];
    char field_478[21];
    char field_485;
    char padding_486[410];
    unsigned long long field_620;
    char padding_628[24];
    unsigned long long field_640;
} st_978b1c_0;

typedef struct st_978b1c_1 {
    char field_0[21];
    char field_d;
    char padding_e[410];
    unsigned long long field_1a8;
    char padding_1b0[24];
    unsigned long long field_1c8;
} st_978b1c_1;

extern unsigned long long g_978464;
extern char g_10002b0;

unsigned long long sub_978b1c(st_978b1c_0 *a0, unsigned long long a1)
{
    unsigned long v13;  // x20
    unsigned long long v14;  // x9
    unsigned long v15;  // x8
    st_978b1c_1 *v16;  // x8
    unsigned long long v17;  // x0
    uint128_t v0;  // [bp-0x90]
    unsigned long v1;  // [bp-0x83]
    unsigned long long v2;  // [bp-0x80]
    unsigned long v3;  // [bp-0x78]
    unsigned long long v4;  // [bp-0x70]
    unsigned long long v5;  // [bp-0x68]
    unsigned int v6;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0x58]
    st_978b1c_0 *v8;  // [bp-0x50], Other Possible Types: unsigned long long
    unsigned long long v9;  // [bp-0x40]
    unsigned long v10;  // [bp-0x38]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    v13 = *(long long *)&a0->padding_486[402];
    v14 = v13 & 0xfffffffffffffff8 | (unsigned int)a1 & 7;
    *(unsigned long long *)&a0->padding_486[402] = v14;
    v9 = 0;
    v6 = 0;
    v8 = 0;
    v2 = 0;
    v4 = 0;
    v15 = a0->field_48;
    if (!v15)
    {
        if (!(v13 >> 41 & 1) || v13 >> 25 & 1 && !a0->field_478[0])
        {
            v15 = 0;
        }
        else
        {
            v16 = a0->field_478;
            v0 = *(int128_t *)&v16->field_0[0];
            v1 = *(long long *)&v16->field_0[13];
            v4 = 0;
            v5 = 0;
            v3 = *(long long *)&a0->padding_628[16];
            v6 = __ROL__((unsigned int)v13, 7) & 0xffffff81 & 1;
            v7 = &g_978464;
            v8 = a0;
            v15 = sub_972f44(&v0);
            a0->field_48 = v15;
            v14 = *(long long *)&a0->padding_486[402];
            if (!v15)
            {
                v14 &= 0xfffffdffffffffff;
                *(unsigned long long *)&a0->padding_486[402] = v14;
            }
        }
    }
    v17 = sub_973c70(v15, (unsigned int)v13 & 7, a1, __ROL__((unsigned int)v14, 23) & 0xff800001 & 1, __ROL__((unsigned int)v14, 22) & 0xffc00001 & 1);
    if (*(long long *)&g_10002b0 == v10)
        return v17;
    ___stack_chk_fail();
}
