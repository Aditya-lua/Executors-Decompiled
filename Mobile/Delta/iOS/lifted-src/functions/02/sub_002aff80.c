/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aff80..0x2b0244 (708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e7cb38;

long long sub_2aff80(void* a0, char *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int v12;  // w8
    unsigned long v13;  // x9
    unsigned long long v14;  // x8
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
    *(unsigned long long *)a0 = 0;
    *(unsigned long long *)&a0[8] = 0;
    v12 = *a1;
    *(char *)a0 = v12;
    v13 = 56;
    if (v12 == 1)
        v13 = 0;
    if (v12 == 2)
        v13 = 8;
    if (v12 == 3)
        v13 = 16;
    if (v12 == 4)
        v13 = 32;
    if (v12 == 5)
        v13 = 24;
    if (v12 == 6)
        v13 = 64;
    if (v12 == 7)
        v13 = 48;
    v14 = 72;
    if (v12 != 8)
        v14 = v13;
    goto *((void *)(*(long long *)((char *)&g_e7cb38 + v14)));
}
