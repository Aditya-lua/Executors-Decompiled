/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa96d4..0xaa97ac (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa96d4_0 {
    struct st_aa96d4_0 *field_0;
    char padding_8[12];
    struct st_aa96d4_0 *field_14;
    long long field_18;
    long long field_20;
    long long field_28;
    char padding_30[8];
    unsigned long long field_38;
} st_aa96d4_0;


st_aa96d4_0 * sub_aa96d4(int a0, st_aa96d4_0 *a1, long long a2, long long a3)
{
    long long v2;  // x22
    st_aa96d4_0 *v3;  // x0
    long long v4;  // x8
    long long v5;  // x9
    st_aa96d4_0 *v6;  // x21
    long long v7;  // x0
    st_aa96d4_0 *v8;  // x0
    st_aa96d4_0 *v9;  // x8
    st_aa96d4_0 *v10;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    v3 = sub_a6bffc(64, "crypto/rand/rand_pool.c", 25);
    if (!v3)
        return v3;
    v4 = 16;
    if (!a1)
        v4 = 48;
    v5 = 0x3000;
    if ((unsigned long long)v2 >= 0x3000)
        v2 = v5;
    v3->field_14 = a2;
    v3->field_18 = v2;
    if ((unsigned long long)a2 >= (unsigned long long)v4)
        v4 = a2;
    if ((unsigned long long)v4 >= (unsigned long long)v2)
        v4 = v2;
    v6 = v3;
    v3->field_20 = v4;
    v7 = v4;
    if (a1)
        v8 = sub_a6ce80(v7, "crypto/rand/rand_pool.c", 38);
    else
        v8 = sub_a6bffc(v7, "crypto/rand/rand_pool.c", 40);
    v9 = v8;
    v10 = v6;
    v6->field_0 = v9;
    if (!v9)
    {
        sub_a6c2e4(v10, "crypto/rand/rand_pool.c", 50);
        return 0;
    }
    *(long long *)v10->padding_30 = a0;
    *(unsigned int *)&(v10->padding_8)[1] = (unsigned int)a1;
    return v10;
}
