/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9837fc..0x9838e0 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9837fc_0 {
    struct st_9837fc_0 *field_0;
    struct st_9837fc_0 *field_8;
} st_9837fc_0;

typedef struct st_9837fc_1 {
    long long field_0;
    long long field_8;
    char padding_10[32];
    struct st_9837fc_0 *field_30;
    struct st_9837fc_0 *field_38;
    unsigned long long field_40;
    struct st_9837fc_0 *field_48;
    struct st_9837fc_0 *field_50;
    unsigned long long field_58;
    char padding_60[72];
    char field_a8;
    char padding_a9[887];
    char field_420;
} st_9837fc_1;


st_9837fc_0 * sub_9837fc(st_9837fc_1 *a0, unsigned long long a1, long long a2, long long a3, long long a4, long long a5)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_9837fc_0 *v9;  // x0
    st_9837fc_0 *i;  // x8
    st_9837fc_0 *v11;  // x9
    st_9837fc_0 *v12;  // x10
    st_9837fc_0 *v13;  // x9
    long long v0;  // [bp-0x30], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if ((unsigned int)a1 > 3)
        return 0;
    v1 = v6;
    v2 = v7;
    v3 = &v5;
    v4 = v8;
    *(unsigned int *)((char *)&v0 + 4) = 0;
    *(char *)&v0 = a0->field_420;
    v9 = sub_984670(&a0->field_a8, a0->field_0, a0->field_8, a1, a2, a3, a4, a5, v0);
    if (!(unsigned int)v9)
        return v9;
    i = a0->field_48;
    if (!i)
        return 1;
    do
    {
        v11 = i->field_0;
        v12 = i->field_8;
        a0->field_48 = v11;
        if (a0->field_50 == i)
        {
            a0->field_50 = v12;
            if (!v12)
                continue;
        }
        else if (!v12)
        {
            continue;
        }
        v12->field_0 = v11;
        if (v11)
            v11->field_8 = v12;
        a0->field_58 = a0->field_58 - 1;
        i->field_0 = 0;
        i->field_8 = 0;
        v13 = a0->field_38;
        if (v13)
            v13->field_0 = i;
        i->field_0 = 0;
        i->field_8 = v13;
        a0->field_38 = i;
        if (!a0->field_30)
            a0->field_30 = i;
        i = a0->field_48;
        a0->field_40 = a0->field_40 + 1;
    } while (i);
    return 1;
}
