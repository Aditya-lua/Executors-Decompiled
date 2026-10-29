/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x687f0..0x688d4 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_687f0_1 {
    char padding_0[248];
    unsigned long long field_f8;
} st_687f0_1;

typedef struct st_687f0_0 {
    char field_0;
} st_687f0_0;

extern char g_e6a3c8;
extern long long g_f0d0e0;

st_687f0_1 * sub_687f0(st_687f0_1 *a0, long long a1, unsigned long a2)
{
    void* v7;  // x0
    st_687f0_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_687f0_0 *v1;  // [bp-0x50]
    st_687f0_1 *v2;  // [bp-0x48]
    unsigned long v3;  // [bp-0x40]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = sub_66a6c();
    *(char **)v7 = &g_e6a3c8;
    *(unsigned long long *)&v7[88] = 0;
    *(unsigned long long *)&v7[96] = 0;
    sub_685a4(v7 + 112, a1);
    a0->field_f8 = 850045863;
    memset(a0 + 1, 0, 56);
    v3 = 427024;
    v4 = 0;
    v2 = a0;
    sub_67ee8(&g_f0d0e0, &v3, &v2);
    return a0;
}
