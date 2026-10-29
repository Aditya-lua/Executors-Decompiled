/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eea50..0x1eeb2c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eea50_0 {
    char field_0;
} st_1eea50_0;

extern unsigned long long g_e76fe0;
extern unsigned long long g_e77018;
extern long long g_e7f560;
extern char g_1000180;

void sub_1eea50(long long *a0, unsigned long long a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    long long v14;  // x20
    unsigned long long v15;  // x8
    unsigned long long v16;  // x9
    unsigned long long ptr;  // x0
    st_1eea50_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1eea50_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    if (a1 > 0xfffffffffffffff)
    {
        ___cxa_throw(std::bad_alloc::bad_alloc(___cxa_allocate_exception(8)), &g_e7f560, &g_1000180);
        __debugbreak();
    }
    v14 = *a0;
    if (a1 >= 16)
        v15 = a0[2] * 2;
    else
        v15 = 16;
    v16 = 0xfffffffffffffff;
    if (v15 < 0xfffffffffffffff)
        v16 = v15;
    if (a1 < v15)
        a1 = v16;
    ptr = _realloc();
    *a0 = ptr;
    a0[2] = a1;
    if (ptr)
    {
        goto *((void *)(g_e76fe0));
    }
    else
    {
        _free(v14);
        a0[1] = 0;
        a0[2] = 0;
        goto *((void *)(g_e77018));
    }
}
