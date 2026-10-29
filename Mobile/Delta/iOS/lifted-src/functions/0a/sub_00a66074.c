/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66074..0xa660f4 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a66074(unsigned int *a0, unsigned int *a1, long long a2)
{
    unsigned long v5;  // x8
    unsigned long v6;  // x9
    unsigned long long v7;  // x0
    unsigned long v8;  // x8
    unsigned long v9;  // x9
    unsigned long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = *a0;
    v6 = a0[1];
    v0 = (((((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v1 = (((((v6 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v6 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v6 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v6 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v7 = sub_a6587c(&v0, a2);
    v8 = (unsigned int)v0;
    v9 = (unsigned int)v1;
    *a1 = (((((v8 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v8 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    a1[1] = (((((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v9 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | (unsigned int)v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    if (*(long long *)&g_10002b0 == v2)
        return v7;
    ___stack_chk_fail();
}
