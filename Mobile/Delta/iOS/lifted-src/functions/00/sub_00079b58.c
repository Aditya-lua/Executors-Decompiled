/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79b58..0x79cf0 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_79b58_0 {
    char field_0;
} st_79b58_0;

extern unsigned long long g_e6b350;
extern unsigned long long g_e6b378;
extern unsigned long long g_e6b3a0;

unsigned long long sub_79b58(unsigned long long a0, unsigned long a1, long long a2, long long a3, long long a4, long long a5, long long a6, unsigned long long a7)
{
    unsigned int v6;  // w0
    unsigned int v7;  // w8
    unsigned long v8;  // x0
    unsigned long long v9;  // 4106
    unsigned long long *v10;  // x8
    long long v0;  // [bp-0x80]
    unsigned int v1;  // [bp-0x74]
    st_79b58_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_79b58_0 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = &v2;
    v2 = &v3;
    if (!(a7 >> 1 & 1))
        return sub_783f0(a0);
    v0 = a4 - 748;
    v6 = sub_79960(a6, a2);
    if (!(v6 * 0x100000000))
        v7 = 32;
    else
        v7 = Clz(v6 * 0x100000000);
    v1 = 32 - v7;
    if (v1 > (unsigned int)a0)
        return a0;
    v8 = sub_7a7d4(a5, a6, a2, v1, a3, a4);
    v9 = arm64g_calculate_condition(130, v8, 120, 0);
    if (!(v9 & 1))
    {
        if (v1 <= v8 || (v10 = &g_e6b3a0, 1))
        {
            sub_7a930(a3 + 748, v0, a5, a2);
            v10 = &g_e6b350;
        }
        goto *((void *)(*v10));
    }
    else
    {
        goto *((void *)(g_e6b378));
    }
}
