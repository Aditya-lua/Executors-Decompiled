/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbee42c..0xbee500 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bee42c_1 {
    char padding_0[8];
    struct st_bee42c_0 *field_8;
    char padding_10[3];
    char field_13;
} st_bee42c_1;

typedef struct st_bee42c_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_bee42c_0;


long long sub_bee42c(unsigned int *a0, st_bee42c_1 *a1)
{
    unsigned int v7;  // w1
    unsigned long long v8;  // x30
    char v9;  // x9
    char v10;  // x11
    char v0;  // [bp-0x14]
    char v1;  // [bp-0x13]
    char v2;  // [bp-0x12]
    char v3;  // [bp-0x11]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = *a0;
    if (a1->field_13 & 24)
    {
        v4 = &v6;
        v5 = v8;
        v0 = 0;
        if (128 > v7)
        {
            v0 = v7;
        }
        else
        {
            v9 = 128 | (128 | (char)v7 & 63) & 63;
            if (0x800 > v7)
            {
                v0 = (char)(v7 >> 6) | 192;
                v1 = v9;
            }
            else
            {
                v10 = 128 | (128 | (char)(__ROL__(v7, 26)) & 63) & 63;
                if (v7 <= 0xffff)
                {
                    v0 = (char)(v7 >> 12) | 224;
                    v1 = v10;
                    v2 = v9;
                }
                else
                {
                    v0 = (char)(v7 >> 18) | 240;
                    v1 = 128 | (128 | (char)(__ROL__(v7, 20)) & 63) & 63;
                    v2 = v10;
                    v3 = v9;
                }
            }
        }
        return sub_be7850(a1, &v0);
    }
    goto *((void *)(a1->field_8->field_20));
}
