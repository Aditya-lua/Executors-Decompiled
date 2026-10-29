/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b27ac..0x1b287c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_1b27ac(unsigned int a0, char *a1)
{
    unsigned int v0;  // w8

    if (127 >= (int)a0)
    {
        *a1 = (char)a0 & 127;
        return 1;
    }
    else if (0x7ff >= a0)
    {
        *a1 = (char)(a0 >> 6) | 192;
        a1[1] = 128 | (128 | (char)a0 & 63) & 63;
        return 2;
    }
    else
    {
        if (26 < a0 >> 11)
        {
            if (0xe000 > a0)
                return 0;
            v0 = a0 >> 16;
            if (v0)
            {
                if (16 < v0)
                    return 0;
                *a1 = (char)(a0 >> 18) | 240;
                a1[1] = 128 | (128 | (char)(__ROL__(a0, 20)) & 63) & 63;
                a1[2] = 128 | (128 | (char)(__ROL__(a0, 26)) & 63) & 63;
                a1[3] = 128 | (128 | (char)a0 & 63) & 63;
                return 4;
            }
        }
        *a1 = (char)(a0 >> 12) | 224;
        a1[1] = 128 | (128 | (char)(__ROL__(a0, 26)) & 63) & 63;
        a1[2] = 128 | (128 | (char)a0 & 63) & 63;
        return 3;
    }
}
