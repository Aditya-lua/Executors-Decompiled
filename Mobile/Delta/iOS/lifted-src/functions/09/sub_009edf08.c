/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9edf08..0x9ee090 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;
extern char g_10002b0;

long long sub_9edf08(char *a0, char *a1, unsigned long long a2, long long a3, char *a4, unsigned int *a5)
{
    char *v14;  // x24
    unsigned int v15;  // w11
    unsigned long long v24;  // x9
    unsigned long long v25;  // x25
    unsigned long long i;  // x22
    char *iter;  // x23
    unsigned long long v28;  // w26
    char *v29;  // x24
    unsigned int v16;  // w12
    unsigned int v17;  // w13
    unsigned int v18;  // w14
    unsigned long long v19;  // x8
    unsigned int v20;  // w15
    unsigned int v21;  // w16
    unsigned int v22;  // w17
    unsigned long v23;  // x0
    unsigned int v0;  // [bp-0x78]
    unsigned int v1;  // [bp-0x74]
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
    v19 = v15 * &_NSHomeDirectory | v16 * 0x10000 | v17 * 0x100 | v18;
    v20 = a4[4];
    v21 = a4[5];
    v22 = a4[6];
    v23 = a4[7];
    v24 = v20 * &_NSHomeDirectory | v21 * 0x10000 | v22 * 0x100 | (unsigned int)v23;
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
                v23 = sub_9ed2c0(&v0, a3);
                v19 = v0;
                v24 = v1;
                v2 = (((((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v19 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v19 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                v7 = (((((v24 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v24 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v24 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v24 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
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
            *a4 = (unsigned int)v19 >> 24;
            a4[1] = (unsigned int)v19 >> 16;
            a4[2] = (unsigned int)v19 >> 8;
            a4[3] = v19;
            a4[4] = (unsigned int)v24 >> 24;
            a4[5] = (unsigned int)v24 >> 16;
            a4[6] = (unsigned int)v24 >> 8;
            a4[7] = v24;
        }
    }
    *a5 = v25;
    if (*(long long *)&g_10002b0 == v11)
        return v23;
    ___stack_chk_fail();
}
