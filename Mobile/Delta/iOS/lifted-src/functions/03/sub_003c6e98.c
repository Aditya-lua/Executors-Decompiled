/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6e98..0x3c6edc (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f03840;
extern long long g_f11d30;

void sub_3c6e98(void)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    std::__1::mutex::lock(&g_f03840);
    sub_61070(v8, &g_f11d30);
}
