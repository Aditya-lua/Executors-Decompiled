/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa32e7c..0xa32f08 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f0d560;

unsigned long long sub_a32e7c(unsigned long long a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v9;  // x19
    unsigned long long v10;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a7c198(g_f0d560);
    if (!(unsigned int)v8)
        return v8;
    v9 = sub_a32c78(a0, 1);
    sub_a7c1b4(g_f0d560);
    v10 = v9;
    if ((unsigned int)v10)
        return v10;
    sub_a368c8(v10);
    sub_a369bc("crypto/engine/eng_init.c", 117, "ENGINE_finish");
    sub_a36abc(38, 106, 0);
    return 0;
}
