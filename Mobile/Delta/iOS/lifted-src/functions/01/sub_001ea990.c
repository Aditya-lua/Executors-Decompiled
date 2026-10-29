/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ea990..0x1eaa7c (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ea990_0 {
    char field_0;
} st_1ea990_0;

extern unsigned long long g_e77090;
extern unsigned long long g_e770c8;
extern long long g_e7f560;
extern char g_1000180;

void sub_1ea990(long long *a0, unsigned long long a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    long long v14;  // x20
    unsigned long long v15;  // x8
    unsigned long long v16;  // x9
    unsigned long ptr;  // x0
    st_1ea990_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1ea990_0 *v1;  // [bp-0x38]
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
    if (384307168202282325 < a1)
    {
        ___cxa_throw(std::bad_alloc::bad_alloc(___cxa_allocate_exception(8)), &g_e7f560, &g_1000180);
        __debugbreak();
    }
    v14 = *a0;
    if (a1 >= 16)
        v15 = a0[2] * 2;
    else
        v15 = 16;
    v16 = 384307168202282325;
    if (v15 < 384307168202282325)
        v16 = v15;
    if (a1 < v15)
        a1 = v16;
    ptr = _realloc();
    *a0 = ptr;
    a0[2] = a1;
    if (ptr)
    {
        goto *((void *)(g_e77090));
    }
    else
    {
        _free(v14);
        a0[1] = 0;
        a0[2] = 0;
        goto *((void *)(g_e770c8));
    }
}
