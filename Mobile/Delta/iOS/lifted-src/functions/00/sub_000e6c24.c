/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe6c24..0xe6d04 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e6dd98;

void sub_e6c24(unsigned long a0, unsigned long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_d5ee0();
    v12 = 24;
    if (a1)
        v12 = 0;
    if (a1 == 2)
        v12 = 8;
    if (a1 == 3)
        v12 = 16;
    goto *((void *)(*(long long *)((char *)&g_e6dd98 + v12)));
}
