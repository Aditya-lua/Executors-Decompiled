/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b978..0x97ba4c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b978_2 {
    char padding_0[136];
    struct st_97b978_0 *field_88;
    char padding_90[16];
    char field_a0;
} st_97b978_2;

typedef struct st_97b978_0 {
    char padding_0[8];
    char field_8;
} st_97b978_0;

typedef struct st_97b978_1 {
    unsigned long long field_0;
    char field_8;
    char field_9;
} st_97b978_1;


st_97b978_1 * sub_97b978(st_97b978_1 *a0, st_97b978_2 *a1, long long a2)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    st_97b978_0 *iter;  // x21
    st_97b978_1 *v15;  // x0
    unsigned long long v16;  // x8
    char v0;  // [bp-0x40]
    char v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    *(unsigned short *)&a0->field_8 = 0;
    *(char *)&a0[1].field_0 = 0;
    a0->field_0 = 0xffffffffffffffff;
    if (a1->field_a0 & 1)
        return a0;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    iter = a1->field_88;
    v15 = a0;
    if (iter)
    {
        do
        {
            v0 = 0;
            v1 = 0;
            v15 = sub_9817c0(iter, &v0, a2);
            a0->field_8 = a0->field_8 || *&v1;
            a0->field_9 = a0->field_9 || *&(&v1)[1];
            *(char *)&a0[1].field_0 = (char)a0[1].field_0 || *&(&v1)[2];
            v16 = a0->field_0;
            if (a0->field_0 >= v0)
                v16 = v0;
        } while ((a0->field_0 = v16, iter = *(long long *)&iter->field_8, iter));
    }
    return v15;
}
