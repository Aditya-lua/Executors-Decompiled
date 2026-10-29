/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x963630..0x963768 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_963630_2 {
    char padding_0[8];
    struct st_963630_0 *field_8;
} st_963630_2;

typedef struct st_963630_3 {
    struct st_963630_1 *field_0;
    struct st_963630_1 *field_1;
    struct st_963630_1 *field_2;
    struct st_963630_1 *field_3;
} st_963630_3;

typedef struct st_963630_1 {
    unsigned long long field_0;
} st_963630_1;

typedef struct st_963630_0 {
    char padding_0[1016];
    struct st_963630_1 *field_3f8;
} st_963630_0;


unsigned long long * sub_963630(unsigned long a0, st_963630_2 *a1, char *a2, unsigned long long *a3, char *a4, unsigned long long *a5)
{
    st_963630_0 *v2;  // x28
    unsigned long long *j;  // x20
    st_963630_1 **iter;  // x8
    unsigned long long *v13;  // x23
    unsigned long v14;  // x11
    st_963630_1 **node;  // x8
    unsigned long long *v17;  // x20
    unsigned long v18;  // x10
    char *v4;  // x22
    unsigned long long *i;  // x23
    char *v6;  // x24
    unsigned long long len;  // x0
    long long v8;  // x27
    unsigned long long *v9;  // x0
    unsigned long long *v10;  // x21
    st_963630_3 *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (!v2->field_3f8)
        return 1;
    j = a5;
    v4 = a4;
    i = a3;
    v6 = a2;
    len = _strlen();
    v8 = len + (j + i) * 2;
    v9 = sub_a6bf4c(v8 + 3, "ssl/ssl_lib.c", 0x1b60);
    if (!v9)
        return v9;
    v10 = v9;
    _memcpy();
    v11 = (char *)v10 + len;
    *(char *)&v11->field_0 = 32;
    iter = (char *)&v11->field_0 + 1;
    if (i)
    {
        do
        {
            v13 = i;
            v14 = *v6;
            v6 += 1;
            *(char *)iter = *(char *)((v14 >> 4) + 13132017);
            *((char *)iter + 1) = *(char *)((v14 & 15) + 13132017);
            iter = (char *)iter + 2;
            i = (char *)v13 - 1;
        } while (i);
    }
    *(char *)iter = 32;
    node = (char *)iter + 1;
    if (j)
    {
        do
        {
            v17 = j;
            v18 = *v4;
            v4 += 1;
            *(char *)node = *(char *)((v18 >> 4) + 13132017);
            *((char *)node + 1) = *(char *)((v18 & 15) + 13132017);
            node = (char *)node + 2;
            j = (char *)v17 - 1;
        } while (j);
    }
    *(char *)node = 0;
    if (v2->field_3f8)
        v2->field_3f8();
    sub_a6c4e8(v10, v8 + 3, "ssl/ssl_lib.c", 0x1b75);
    return 1;
}
