/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5e9e4..0xc5ea94 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c5e9e4(unsigned long a0, unsigned int a1)
{
    char v6;  // x8
    char v7;  // x10
    unsigned int v0;  // [bp-0x14], Other Possible Types: char
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
    }
    else
    {
        v6 = 128 | (128 | (char)a1 & 63) & 63;
        if (0x800 > a1)
        {
            v0 = (char)(a1 >> 6) | 192;
            v1 = v6;
        }
        else
        {
            v7 = 128 | (128 | (char)(__ROL__(a1, 26)) & 63) & 63;
            if (a1 <= 0xffff)
            {
                v0 = (char)(a1 >> 12) | 224;
                v1 = v7;
                v2 = v6;
            }
            else
            {
                v0 = (char)(a1 >> 18) | 240;
                v1 = 128 | (128 | (char)(__ROL__(a1, 20)) & 63) & 63;
                v2 = v7;
                v3 = v6;
            }
        }
    }
    sub_c5e8e4();
    return;
}
