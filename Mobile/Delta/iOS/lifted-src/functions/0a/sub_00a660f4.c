/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa660f4..0xa66288 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;
extern char g_10002b0;

char * sub_a660f4(char *a0, char *a1, unsigned long long a2, long long a3, char *a4, unsigned int *a5)
{
    unsigned long v14;  // x10
    unsigned long long i;  // x22
    unsigned long v24;  // x17
    unsigned long long v25;  // x9
    unsigned long long v26;  // x25
    char *iter;  // x23
    unsigned long long v28;  // w26
    char *v29;  // x24
    char *v16;  // x24
    unsigned long v17;  // x11
    unsigned long v18;  // x12
    unsigned long v19;  // x13
    unsigned long v20;  // x14
    unsigned long long v21;  // x8
    unsigned long v22;  // x15
    unsigned long v23;  // x16
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
    v11 = *(long long *)&g_10002b0;
    v14 = *a5;
    if (!(v14 >> 31 & 1))
    {
        i = a2;
        v16 = a0;
        v17 = *a4;
        v18 = a4[1];
        v19 = a4[2];
        v20 = a4[3];
        v21 = v17 * &_NSHomeDirectory | v18 * 0x10000 | v19 * 0x100 | v20;
        v22 = a4[4];
        v23 = a4[5];
        v24 = a4[6];
        a0 = a4[7];
        v25 = v22 * &_NSHomeDirectory | v23 * 0x10000 | v24 * 0x100 | a0;
        v0 = v21;
        v1 = v25;
        v3 = v17;
        v4 = v18;
        v5 = v19;
        v6 = v20;
        v7 = v22;
        v8 = v23;
        v9 = v24;
        v10 = (char)a0;
        v26 = v14 & 7;
        if (a2)
        {
            iter = a1;
            v28 = 0;
            do
            {
                if (!v26)
                {
                    a0 = sub_a6587c(&v0, a3);
                    v21 = v0;
                    v25 = v1;
                    v2 = (((((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v21 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v21 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    v7 = (((((v25 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v25 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v25 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v25 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    v28 += 1;
                }
                v29 = v16 + 1;
                *iter = (&v3)[v26] ^ *v16;
                iter += 1;
                v26 = (unsigned int)v26 + 1 & 7;
                i -= 1;
                v16 = v29;
            } while (i);
            if (v28)
            {
                *a4 = v21 >> 24;
                a4[1] = v21 >> 16;
                a4[2] = v21 >> 8;
                a4[3] = v21;
                a4[4] = v25 >> 24;
                a4[5] = v25 >> 16;
                a4[6] = v25 >> 8;
                a4[7] = v25;
            }
        }
    }
    else
    {
        v26 = 0xffffffff;
    }
    *a5 = v26;
    if (*(long long *)&g_10002b0 == v11)
        return a0;
    ___stack_chk_fail();
}
