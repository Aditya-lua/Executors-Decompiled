/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b501c..0x1b5164 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e71780;

void sub_1b501c(unsigned long a0, char *a1, char *a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // w1
    unsigned long v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a1 == a2)
        sub_1a8ad4();
    v8 = *a1;
    v9 = 88;
    if (!v8)
        v9 = 56;
    if (v8 == 98)
        v9 = 24;
    if (v8 == 100)
        v9 = 48;
    if (v8 == 0x44)
        v9 = 80;
    if (v8 == 115)
        v9 = 8;
    if (v8 == 83)
        v9 = 0;
    if (v8 == 0x77)
        v9 = 64;
    if (v8 == 87)
        v9 = 16;
    goto *((void *)(*(long long *)((char *)&g_e71780 + v9)));
}
