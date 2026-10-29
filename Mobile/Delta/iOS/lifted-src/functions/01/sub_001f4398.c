/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f4398..0x1f4470 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f4398_1 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_1f4398_1;

typedef struct st_1f4398_0 {
    char field_0;
} st_1f4398_0;

extern unsigned long long g_e77738;
extern unsigned long long g_e77770;
extern long long g_e7f560;
extern char g_1000180;

void sub_1f4398(st_1f4398_1 *a0, unsigned long long a1)
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
    st_1f4398_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f4398_0 *v1;  // [bp-0x38]
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
    if ((long long)a1 < 0)
    {
        ___cxa_throw(std::bad_alloc::bad_alloc(___cxa_allocate_exception(8)), &g_e7f560, &g_1000180);
        __debugbreak();
    }
    v14 = a0->field_0;
    if (a1 >= 16)
        v15 = a0->field_10 * 2;
    else
        v15 = 16;
    v16 = 0x7fffffffffffffff;
    if (v15 < 0x7fffffffffffffff)
        v16 = v15;
    if (a1 < v15)
        a1 = v16;
    ptr = _realloc();
    a0->field_0 = ptr;
    a0->field_10 = a1;
    if (ptr)
    {
        goto *((void *)(g_e77738));
    }
    else
    {
        _free(v14);
        *(unsigned long long *)a0->padding_8 = 0;
        a0->field_10 = 0;
        goto *((void *)(g_e77770));
    }
}
