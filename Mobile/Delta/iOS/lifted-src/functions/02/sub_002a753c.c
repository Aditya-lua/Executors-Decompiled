/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a753c..0x2a767c (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a753c_1 {
    char padding_0[16];
    long long *field_10;
} st_2a753c_1;

typedef struct st_2a753c_0 {
    char field_0;
} st_2a753c_0;

extern long long g_e7f5d0;

int sub_2a753c(st_2a753c_1 *a0, long long a1)
{
    unsigned long long v6;  // 4106
    long long v7;  // x0
    st_2a753c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_2a753c_0 *v1;  // [bp-0x68]
    char v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v2 = 1;
    v3 = sub_2a5a24();
    sub_103a8(&a0->padding_0[8], &v3);
    v6 = arm64g_calculate_condition(2, a1, 1, 0);
    if (v6 & 1)
        return 1;
    if (sub_2a91bc(*(long long *)((char *)a0->field_10 - 8)) >= (unsigned long long)a1)
        return 1;
    v7 = ___cxa_allocate_exception(32);
    std::__1::to_string(a1);
    sub_2ae49c("excessive object size: ", &v2);
    sub_2a9a58(408, &v3, *(long long *)((char *)a0->field_10 - 8));
    ___cxa_throw(v7, &g_e7f5d0, 0x2ab438);
    __debugbreak();
}
