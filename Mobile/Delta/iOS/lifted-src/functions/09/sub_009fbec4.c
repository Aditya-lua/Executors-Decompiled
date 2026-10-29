/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fbec4..0x9fc084 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;
extern char g_10002b0;

long long sub_9fbec4(char *a0, char *a1, unsigned long long a2, long long a3, long long a4, long long a5, char *a6)
{
    char *v14;  // x26
    unsigned int v15;  // w11
    unsigned int v24;  // w9
    unsigned int *v25;  // x7
    unsigned long long v26;  // x27
    unsigned long long i;  // x24
    char *iter;  // x25
    unsigned long long v29;  // w28
    char *v30;  // x26
    unsigned int v16;  // w12
    unsigned int v17;  // w13
    unsigned int v18;  // w14
    unsigned int v19;  // w8
    unsigned int v20;  // w15
    unsigned int v21;  // w16
    unsigned int v22;  // w17
    unsigned long v23;  // x0
    unsigned int *v0;  // [bp-0x80]
    unsigned int v1;  // [bp-0x78]
    unsigned int v2;  // [bp-0x74]
    char v3;  // [bp-0x70]
    char v4;  // [bp-0x6f]
    char v5;  // [bp-0x6e]
    char v6;  // [bp-0x6d]
    char v7;  // [bp-0x6c]
    char v8;  // [bp-0x6b]
    char v9;  // [bp-0x6a]
    char v10;  // [bp-0x69]
    unsigned long v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a0;
    v11 = *(long long *)&g_10002b0;
    v15 = *a6;
    v16 = a6[1];
    v17 = a6[2];
    v18 = a6[3];
    v19 = v15 | v16 * 0x100 | v17 * 0x10000 | v18 * &_NSHomeDirectory;
    v20 = a6[4];
    v21 = a6[5];
    v22 = a6[6];
    v23 = a6[7];
    v24 = v20 | v21 * 0x100 | v22 * 0x10000 | (unsigned int)v23 * &_NSHomeDirectory;
    v1 = v19;
    v2 = v24;
    v3 = v15;
    v4 = v16;
    v5 = v17;
    v6 = v18;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v26 = *v25 & 7;
    if (a2)
    {
        i = a2;
        iter = a1;
        v29 = 0;
        do
        {
            if (!v26)
            {
                v23 = sub_9fb3ec(&v1, a3, a4, a5);
                v19 = v1;
                v24 = v2;
                v3 = v19;
                v4 = v19 >> 8;
                v5 = v19 >> 16;
                v6 = v19 >> 24;
                v7 = v24;
                v8 = v24 >> 8;
                v9 = v24 >> 16;
                v10 = v24 >> 24;
                v29 += 1;
            }
            v30 = v14 + 1;
            *iter = (&v3)[v26] ^ *v14;
            iter += 1;
            v26 = (unsigned int)v26 + 1 & 7;
            i -= 1;
            v14 = v30;
        } while (i);
        if (v29)
        {
            *a6 = v19;
            a6[1] = v19 >> 8;
            a6[2] = v19 >> 16;
            a6[3] = v19 >> 24;
            a6[4] = v24;
            a6[5] = v24 >> 8;
            a6[6] = v24 >> 16;
            a6[7] = v24 >> 24;
        }
    }
    *v0 = v26;
    if (*(long long *)&g_10002b0 == v11)
        return v23;
    ___stack_chk_fail();
}
