/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41e848..0x41ead8 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_41e848(unsigned long long a0, unsigned long a1)
{
    unsigned long long v2;  // x13
    unsigned long long v3;  // x14
    unsigned int v13;  // w13
    unsigned int v14;  // w14
    unsigned int v15;  // w13
    unsigned int v16;  // w13
    unsigned int v17;  // w14
    unsigned long long v18;  // x14
    unsigned long long v19;  // x15
    unsigned long long v20;  // x14
    char *v21;  // x14
    unsigned long long v4;  // x15
    unsigned long long v5;  // x16
    unsigned long long v6;  // x17
    unsigned long long v7;  // x2
    unsigned long long v8;  // x16
    unsigned long long v9;  // x14
    unsigned long long v10;  // x15
    unsigned long long v11;  // x16
    char *v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    char *v1;  // [bp-0x8], Other Possible Types: unsigned long long

    v1 = &v0;
    v0 = &v1;
    while (1)
    {
        v2 = (v1 ^ -v0) - (&(~v0)[-1 * (v1 | ~v0)] ^ (v0 | v1)) + ((v0 & ~v1 | v1 & -v0) - (&(~v0)[-1 * (v1 | ~v0)] & (v0 | v1))) * 2;
        v0 = v2 + 8;
        v1 = v2 + 55;
        v3 = v1;
        v4 = v0;
        v5 = v4 | v3;
        v6 = (v4 | ~v3) + v3;
        v7 = v5 + ~v6;
        v8 = v6 - v5;
        v9 = v7 - v3 + (v8 & v3) * 2;
        v10 = v7 - v4 + (v8 & v4) * 2;
        v11 = v9 | v10;
        if (a0 >> ((char)v1 + (char)v0 & 63) != v11 + ~((v10 | ~v9) + v9) + v11 + ~((v9 | ~v10) + v10) + (v11 + ~((v10 | ~v9) + v9) - (v11 + ~((v9 | ~v10) + v10)) - (v11 + ~((v10 | ~v9) + v9) | -(v11 + ~((v9 | ~v10) + v10))) + ((v10 | ~v9) + v9 - v11 & -(v11 + ~((v9 | ~v10) + v10)))) * 2)
            break;
        a0 *= 2;
        v13 = v1;
        v14 = v0;
        v15 = ((v14 | v13) ^ -(v14 & v13)) + ((v14 | v13) & -(v14 & v13)) * 2;
        v16 = (v14 ^ v13) + v15 + ~v15 * 2;
        v17 = v16 + 1;
        *(unsigned int *)&v0 = 1207118277 + v17 + ((unsigned int)(0x7ffffffd - v16) | 3087849018) + (v16 + 2 & 1207118277) + 2;
        *(unsigned int *)&v1 = 3087849018 + v17 + 1;
        v18 = v1;
        v19 = v0;
        v20 = (v19 ^ -v18) + ((v19 & -v18) + (v19 + ~v19 * 2 + 1 & v18)) * 2;
        v21 = v20 + (v18 | v19) + ~((v19 | ~v18) + v18) + ((v19 | ~v18) + v18 - (v18 | v19) & -v20) * 2 + ((v18 | v19) + ~((v19 | ~v18) + v18) - v20 - ((v18 | v19) + ~((v19 | ~v18) + v18) | -v20)) * 2;
        v0 = v21 + 7555865988313834578;
        v1 = v21 + 10890878081100749742;
    }
    return a0;
}
