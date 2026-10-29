/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ecbe0..0x1ecc38 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ecbe0_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
} st_1ecbe0_0;

extern long long g_e7f560;
extern char g_1000180;

st_1ecbe0_0 * sub_1ecbe0(st_1ecbe0_0 *a0, long long a1)
{
    unsigned long long ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(a1);
    a0->field_0 = ptr;
    a0->field_8 = a1;
    a0->field_10 = a1;
    if (ptr)
        return a0;
    ___cxa_throw(std::bad_alloc::bad_alloc(___cxa_allocate_exception(8)), &g_e7f560, &g_1000180);
}
