/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3fb38..0xc3fc14 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c3fb38(void* a0, unsigned int a1)
{
    unsigned long long v6;  // x2
    char v7;  // x8
    char v8;  // x10
    unsigned long long v9;  // x9
    unsigned long long v10;  // x8
    unsigned long long v0;  // [bp-0x14], Other Possible Types: char
    char v1;  // [bp-0x13]
    char v2;  // [bp-0x12]
    char v3;  // [bp-0x11]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = 0;
    if (128 > a1)
    {
        v0 = a1;
        v6 = 1;
    }
    else
    {
        v7 = 128 | (128 | (char)a1 & 63) & 63;
        if (0x800 > a1)
        {
            v0 = (char)(a1 >> 6) | 192;
            v1 = v7;
            v6 = 2;
        }
        else
        {
            v8 = 128 | (128 | (char)(__ROL__(a1, 26)) & 63) & 63;
            if (a1 <= 0xffff)
            {
                v0 = (char)(a1 >> 12) | 224;
                v1 = v8;
                v2 = v7;
                v6 = 3;
            }
            else
            {
                v0 = (char)(a1 >> 18) | 240;
                v1 = 128 | (128 | (char)(__ROL__(a1, 20)) & 63) & 63;
                v2 = v8;
                v3 = v7;
                v6 = 4;
            }
        }
    }
    v9 = (long long)a0[8];
    if (v6 <= (unsigned long long)(long long)a0[8])
        v10 = *(int *)a0;
    else
        v10 = 1;
    *(unsigned long long *)a0 = v10;
    *(unsigned long long *)&a0[8] = v9 - v6;
    if (v10 & 1)
        return 1;
    (*(long long *)(*(long long *)((long long)a0[16] + 8) + 24))();
}
