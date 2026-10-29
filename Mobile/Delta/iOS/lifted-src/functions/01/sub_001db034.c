/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1db034..0x1db0d4 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1db034_0 {
    char field_0;
} st_1db034_0;

extern long long g_f02738;

unsigned long long sub_1db034(unsigned long a0)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x19
    st_1db034_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_1db034_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (sub_1e30b8() & 1)
        return 1;
    v2 = a0;
    v5 = sub_1e3220(std::__1::mutex::lock(&g_f02738), &v2);
    if (v5 && *(long long *)(v5 + 24))
        v6 = *(char *)(*(long long *)(v5 + 24) + 112) == 2;
    else
        v6 = 0;
    std::__1::mutex::unlock(&g_f02738);
    return v6;
}
