/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1940..0xaf19c4 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af1940_0 {
    char padding_0[134];
    char field_86;
    char padding_87[49];
    unsigned long long field_b8;
    unsigned long long field_c0;
    unsigned int field_c8;
} st_af1940_0;


unsigned long long sub_af1940(st_af1940_0 *a0, st_af1940_0 *a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long v2;  // x8
    unsigned long v3;  // x9
    char v4;  // w8

    if (a0->field_86 >> 4 & 1)
    {
        return 0xfffffffe;
    }
    else if (!(a1->field_86 >> 4 & 1))
    {
        v0 = __builtin_bswap64(a0->field_b8);
        v1 = __builtin_bswap64(a1->field_b8);
        if (v0 == v1)
        {
            v0 = __builtin_bswap64(a0->field_c0);
            v1 = __builtin_bswap64(a1->field_c0);
            if (v0 != v1 || (v2 = a0->field_c8, v3 = a1->field_c8, v0 = (((((v2 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v2 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v2 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v2 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32, v1 = (((((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32, v0 != v1))
                goto LABEL_af19a8;
            v4 = 0;
        }
        else
        {
LABEL_af19a8:
            if (v0 < v1)
                v4 = 0xffffffff;
            else
                v4 = 0;
        }
        if (0 > v4)
            return 0xffffffff;
        return v4 > 0;
    }
    else
    {
        return 0xfffffffe;
    }
}
