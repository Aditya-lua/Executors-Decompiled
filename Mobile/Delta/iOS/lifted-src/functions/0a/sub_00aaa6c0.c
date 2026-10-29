/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaa6c0..0xaaa838 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;
extern char g_10002b0;

long long sub_aaa6c0(char *a0, char *a1, unsigned long long a2, long long a3, char *a4, unsigned int *a5)
{
    char *v14;  // x24
    unsigned long v15;  // x11
    unsigned long long v24;  // x9
    unsigned long long v25;  // x25
    unsigned long long i;  // x22
    char *iter;  // x23
    unsigned long long v28;  // w26
    char *v29;  // x24
    unsigned long v16;  // x12
    unsigned long v17;  // x13
    unsigned long v18;  // x14
    unsigned long long v19;  // x8
    unsigned long v20;  // x15
    unsigned long v21;  // x16
    unsigned long v22;  // x17
    unsigned long v23;  // x0
    unsigned long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    unsigned int v2;  // [bp-0x70]
    char v3;  // [bp-0x70]
    char v4;  // [bp-0x6f]
    char v5;  // [bp-0x6e]
    char v6;  // [bp-0x6d]
    char v7;  // [bp-0x6c], Other Possible Types: unsigned int
    char v8;  // [bp-0x6b]
    char v9;  // [bp-0x6a]
    char v10;  // [bp-0x69]
    unsigned long v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a0;
    v11 = *(long long *)&g_10002b0;
    v15 = *a4;
    v16 = a4[1];
    v17 = a4[2];
    v18 = a4[3];
    v19 = v15 | v16 * 0x100 | v17 * 0x10000 | v18 * &g_1000000;
    v20 = a4[4];
    v21 = a4[5];
    v22 = a4[6];
    v23 = a4[7];
    v24 = v20 | v21 * 0x100 | v22 * 0x10000 | v23 * &g_1000000;
    v0 = v19;
    v1 = v24;
    v3 = v15;
    v4 = v16;
    v5 = v17;
    v6 = v18;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v25 = *a5 & 7;
    if (a2)
    {
        i = a2;
        iter = a1;
        v28 = 0;
        do
        {
            if (!v25)
            {
                v23 = sub_aaa148(&v0, a3);
                v19 = v0;
                v24 = v1;
                v2 = v19;
                v7 = v24;
                v28 += 1;
            }
            v29 = v14 + 1;
            *iter = (&v3)[v25] ^ *v14;
            iter += 1;
            v25 = (unsigned int)v25 + 1 & 7;
            i -= 1;
            v14 = v29;
        } while (i);
        if (v28)
        {
            *a4 = v19;
            a4[1] = v19 >> 8;
            a4[2] = v19 >> 16;
            a4[3] = v19 >> 24;
            a4[4] = v24;
            a4[5] = v24 >> 8;
            a4[6] = v24 >> 16;
            a4[7] = v24 >> 24;
        }
    }
    *a5 = v25;
    if (*(long long *)&g_10002b0 == v11)
        return v23;
    ___stack_chk_fail();
}
