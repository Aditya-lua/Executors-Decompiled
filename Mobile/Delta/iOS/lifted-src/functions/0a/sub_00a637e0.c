/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa637e0..0xa63af4 (788 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a637e0_3 {
    struct st_a637e0_2 *field_0;
    unsigned long long field_8;
} st_a637e0_3;

typedef struct st_a637e0_0 {
    char padding_0[16];
    struct st_a637e0_1 *field_10;
    char padding_18[8];
    struct st_a637e0_2 *field_20;
} st_a637e0_0;

typedef struct st_a637e0_2 {
    struct st_a637e0_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    struct st_a637e0_2 *field_18;
    struct st_a637e0_0 *field_20;
} st_a637e0_2;

typedef struct st_a637e0_1 {
    unsigned long long field_0;
} st_a637e0_1;


st_a637e0_2 * sub_a637e0(st_a637e0_0 *a0, long long *a1, st_a637e0_3 *a2, unsigned long long a3)
{
    unsigned long v3;  // x0
    unsigned long v4;  // x23
    st_a637e0_2 *v5;  // x0
    st_a637e0_2 *v6;  // x20
    st_a637e0_2 *v7;  // x0
    long long n;  // x23
    long long v9;  // x24
    unsigned long long v0;  // [bp-0x80]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a2->field_0)
        return 0;
    if ((int)a0->field_20 == 1)
        v3 = *a1 + 40;
    else
        v3 = 40;
    v4 = a2->field_8;
    v5 = sub_a6bf4c(v3, "crypto/hashtable/hashtable.c", 632);
    if (!v5)
        return v5;
    v6 = v5;
    v5->field_0 = a2->field_0;
    v5->field_8 = v4;
    v5->field_18 = 0;
    v5->field_20 = a0;
    v0 = a3;
    if ((int)a0->field_20)
    {
        v7 = v6 + 1;
        n = *a1;
        v9 = a1[1];
        v6->field_10 = n;
        v6->field_18 = v7;
        _memcpy(v7, v9, n);
    }
    a0->field_10();
}
