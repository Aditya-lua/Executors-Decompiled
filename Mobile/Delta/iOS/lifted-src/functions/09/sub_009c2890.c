/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c2890..0x9c29d4 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

unsigned int sub_9c2890(char *a0, unsigned long long a1, unsigned int a2, unsigned long long a3, unsigned long a4)
{
    unsigned long long v12;  // x26
    unsigned long long v13;  // x25
    unsigned long long v22;  // x0
    unsigned long v23;  // x8
    unsigned long long v14;  // x24
    unsigned long long v15;  // x23
    unsigned long long v16;  // x22
    unsigned long long v17;  // x21
    unsigned long long v18;  // x20
    unsigned long long v19;  // x19
    unsigned long long v20;  // x30
    char *v21;  // x23
    unsigned long long v0;  // [bp-0x58]
    unsigned long long v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    if (!(unsigned int)a1)
        return 1;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = &v11;
    v10 = v20;
    while (1)
    {
        if (a2 == 4100)
        {
            v0 = *a0 * &g_1000000;
            v0 |= a0[1] * 0x10000;
            v0 |= a0[2] * 0x100;
            v21 = a0 + 4;
            v0 |= a0[3];
            a1 = (unsigned int)a1 - 4;
            if (a3)
                break;
        }
        else if (a2 == 4098)
        {
            v23 = *a0;
            v0 = v23 * 0x100;
            v21 = a0 + 2;
            v0 = (a0[1] | (v23 * 0x100 | v23 >> 56) & 0xff00) & 0xffff;
            a1 = (unsigned int)a1 - 2;
            if (a3)
                break;
        }
        else if (a2 == 4097)
        {
            v21 = a0 + 1;
            v0 = *a0;
            a1 = (unsigned int)a1 - 1;
            if (a3)
                break;
        }
        else
        {
            v22 = sub_9c5604(a0, a1, &v0);
            if (v22 >> 31 & 1)
                return 0xffffffff;
            a1 -= v22;
            v21 = &a0[v22 & 0xffffffff];
            if (a3)
                break;
        }
        a0 = v21;
        if (!(unsigned int)a1)
            return 1;
    }
    a3();
}
