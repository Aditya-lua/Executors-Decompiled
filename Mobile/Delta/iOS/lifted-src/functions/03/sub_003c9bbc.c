/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c9bbc..0x3c9c6c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c9bbc_0 {
    char padding_0[192];
    uint128_t field_c0;
    uint128_t field_d0;
} st_3c9bbc_0;

typedef struct st_3c9bbc_1 {
    unsigned long long field_0;
} st_3c9bbc_1;

extern st_3c9bbc_1 *g_f0b120;

unsigned long long sub_3c9bbc(uint128_t *a0)
{
    st_3c9bbc_0 **ptr;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _calloc(1, 0x4888);
    if (ptr)
    {
        *ptr = a0;
        ptr[2318] = 4016416;
        ptr[2319] = 4012412;
        ptr[2320] = ")";
        v3 = sub_3ce6d0();
        a0[12] = a0[13];
        _free(ptr);
        return v3;
    }
    g_f0b120();
}
