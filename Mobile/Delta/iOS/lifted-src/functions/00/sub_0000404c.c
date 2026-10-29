/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x404c..0x4114 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_404c_1 {
    struct st_404c_0 *field_0;
    unsigned long long field_8;
} st_404c_1;

typedef struct st_404c_0 {
    struct st_404c_0 *field_0;
} st_404c_0;

typedef struct st_404c_2 {
    char field_0;
} st_404c_2;

extern unsigned long long g_e60600;
extern unsigned long long g_e60618;

long long sub_404c(st_404c_1 *a0, unsigned long long a1)
{
    st_404c_0 **v4;  // x9
    unsigned long v5;  // x8
    unsigned long long v6;  // x0
    unsigned long long v7;  // x8
    st_404c_0 **v8;  // x0
    st_404c_2 **v0;  // [bp-0x30], Other Possible Types: char
    st_404c_2 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_0;
    if (v4)
    {
        v5 = v4 + 1;
        v6 = v5 + a0->field_8 + 7 & 0xfffffffffffffff8;
        if (v6 + a1 > v4 + 1025)
        {
            goto *((void *)(g_e60600));
        }
        else
        {
            a0->field_8 = a1 - v5 + v6;
            goto *((void *)(g_e60618));
        }
    }
    else
    {
        v7 = 0x2000;
        if (0x2000 < a1)
            v7 = a1;
        v8 = operatornew(v7 + 8);
        *v8 = a0->field_0;
        a0->field_0 = v8;
        a0->field_8 = a1;
        return v8 + 1;
    }
}
