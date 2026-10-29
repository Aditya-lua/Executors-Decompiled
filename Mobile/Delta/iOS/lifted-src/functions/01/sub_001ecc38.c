/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ecc38..0x1eccac (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ecc38_0 {
    char field_0;
} st_1ecc38_0;

extern long long g_e7f560;
extern char g_1000180;

unsigned long long * sub_1ecc38(unsigned long long *a0, unsigned long a1)
{
    unsigned long long ptr;  // x0
    st_1ecc38_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1ecc38_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    ptr = _malloc(a1 * 40);
    *a0 = ptr;
    a0[1] = a1;
    a0[2] = a1;
    if (ptr)
        return a0;
    ___cxa_throw(std::bad_alloc::bad_alloc(___cxa_allocate_exception(8)), &g_e7f560, &g_1000180);
}
