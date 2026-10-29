/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5e1f8..0xc5e330 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5e1f8_0 {
    struct st_c5e1f8_1 *field_0;
    unsigned long long field_8;
} st_c5e1f8_0;

typedef struct st_c5e1f8_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
} st_c5e1f8_1;

extern char g_efd4e0;

long long sub_c5e1f8(st_c5e1f8_0 *a0, unsigned int a1)
{
    unsigned long long v6;  // x21
    char v7;  // x8
    char v8;  // x10
    unsigned long long *v9;  // x23
    unsigned long long v10;  // x9
    unsigned long v11;  // x24
    unsigned long long v12;  // x10
    unsigned long long v13;  // x22
    unsigned long long v14;  // x20
    unsigned long long *v15;  // x19
    unsigned int v0;  // [bp-0x44], Other Possible Types: char
    char v1;  // [bp-0x43]
    char v2;  // [bp-0x42]
    char v3;  // [bp-0x41]
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
    v9 = a0->field_0;
    v10 = v9[1];
    v11 = v9[2];
    if (v10 < v11)
        v12 = v10;
    else
        v12 = v11;
    v13 = v10 - v12;
    if (v13 < v6)
        v14 = v13;
    else
        v14 = v6;
    _memcpy();
    v9[2] = v14 + v11;
    if (v6 > v13)
    {
        v15 = &a0->field_8;
        if (a0->field_8)
            sub_c40ff0(v15);
        *v15 = &g_efd4e0;
    }
    return v6 > v13;
}
