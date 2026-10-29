/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41e2c8..0x41e3cc (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41e2c8_0 {
    char field_0;
} st_41e2c8_0;

extern long long g_e7f640;

void sub_41e2c8(char *a0)
{
    long long v6;  // x0
    st_41e2c8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_41e2c8_0 *v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (*a0 == 2)
    {
        sub_3f9bdc();
        return;
    }
    v6 = ___cxa_allocate_exception(32);
    v2 = sub_2aeb88(a0);
    sub_415130("type must be array, but is ", &v2);
    sub_2ac7c4(302, &v3, a0);
    ___cxa_throw(v6, &g_e7f640, 0x2aedb8);
    __debugbreak();
}
