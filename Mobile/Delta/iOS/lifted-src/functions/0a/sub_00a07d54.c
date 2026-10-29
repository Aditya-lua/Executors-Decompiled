/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa07d54..0xa07e44 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f086b8;
extern char g_10002b0;

int sub_a07d54(unsigned long a0, long long a1, unsigned long a2, unsigned long a3)
{
    unsigned int v8;  // w0
    char v0;  // [bp-0x1a0]
    char v1;  // [bp-0xa0]
    char v2;  // [bp-0x61]
    char v3;  // [bp-0x2a]
    char v4;  // [bp-0x29]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = sub_a07c8c();
    if (v8)
    {
        v2 &= 252;
        v4 = 0;
        v3 |= 128;
        sub_a0a0cc(&v1, &v2, 57);
        sub_a0a654(&v1, &v1);
        sub_a0a654(&v1, &v1);
        sub_a05544(&v0, g_f086b8, &v1);
        sub_a05e24(a1, &v0);
        sub_a0a0c4(&v1);
        sub_a06058(&v0);
        sub_a66ec0(&v2, 57);
        v8 = 0xffffffff;
    }
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}
