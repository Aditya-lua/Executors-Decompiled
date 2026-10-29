/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9a884..0xb9a8fc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9a884_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
} st_b9a884_0;

typedef struct st_b9a884_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_b9a884_0 *field_10;
    long long field_18;
    unsigned long long field_20;
} st_b9a884_1;

extern long long g_efa6a0;

void sub_b9a884(st_b9a884_1 *a0, st_b9a884_0 *a1, long long a2, long long a3)
{
    long long v2;  // x8
    long long v3;  // x2
    long long v4;  // x3
    unsigned long long v5;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = a1->field_10;
    if ((unsigned long long)a1->field_10 >= (unsigned long long)a3)
    {
        v4 = a3;
        if ((unsigned long long)v4 >= (unsigned long long)v2)
        {
            a1->field_10 = v2;
            v5 = a1->field_8;
            a0->field_18 = a3;
            a0->field_20 = v3 - a3;
            a0->field_0 = v5 + 264 * v2;
            a0->field_8 = v5 + 264 * a3;
            a0->field_10 = a1;
            return;
        }
    }
    else
    {
        v2 = &g_efa6a0;
        v4 = &g_efa6a0;
        sub_c73bb0(0, a3);
    }
    sub_c73bb0(v2, v4);
}
