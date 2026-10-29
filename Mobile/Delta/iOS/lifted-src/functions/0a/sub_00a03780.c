/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03780..0xa03898 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a03780_3 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_a03780_3;

typedef struct st_a03780_0 {
    char padding_0[8];
    struct st_a03780_1 *field_8;
} st_a03780_0;

typedef struct st_a03780_2 {
    char padding_0[16];
    struct st_a03780_3 *field_10;
    char padding_18[136];
    struct st_a03780_0 *field_a0;
    char padding_a8[16];
    struct st_a03780_3 *field_b8;
} st_a03780_2;

typedef struct st_a03780_1 {
    unsigned long long field_0;
} st_a03780_1;


long long * sub_a03780(unsigned long a0, long long a1, long long a2, long long *a3, st_a03780_3 **a4, st_a03780_2 *a5, long long a6, long long a7, unsigned long a8, long long a9)
{
    st_a03780_0 *v4;  // x0
    long long *v5;  // x0
    long long *v6;  // x20
    unsigned int v7;  // w0
    long long *v8;  // w8
    long long *v0;  // [bp-0x68]
    unsigned long long *v1;  // [bp-0x60]
    unsigned long long *v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]

    v3 = &a8;
    v0 = a3;
    if (!a3)
    {
        if (a5->field_10)
        {
            v1 = &a5->field_10->field_0;
            v2 = v1;
            v7 = sub_a03638(&v1, 0);
            v8 = (long long *)(v7 & ~((int)(v7) >> 31));
        }
        else
        {
            v8 = 0xffffffff;
        }
        *(unsigned int *)a4 = (unsigned int)v8;
    }
    else if (!a5->field_b8 || !(v4 = sub_a02234(), a5->field_a0 == sub_a02234()))
    {
        a5->field_a0->field_8();
    }
    else
    {
        v5 = sub_a0224c(a1, a2, a5, a6, a7, a8, a9);
        if (!v5)
        {
            *(unsigned int *)a4 = 0;
            return v5;
        }
        v6 = v5;
        *(unsigned int *)a4 = sub_a03638();
        sub_9e4838(*v6);
        sub_9e4838(v6[1]);
        sub_a6c2e4(v6, "crypto/dsa/dsa_sign.c", 47);
    }
    return 1;
}
