/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953c68..0x953d38 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953c68_1 {
    char padding_0[8];
    struct st_953c68_0 *field_8;
} st_953c68_1;

typedef struct st_953c68_3 {
    char padding_0[80];
    long long field_50;
    char padding_58[1176];
    struct st_953c68_2 *field_4f0;
    char padding_4f8[1936];
    unsigned long long field_c88;
} st_953c68_3;

typedef struct st_953c68_2 {
    char padding_0[288];
    long long field_120;
    char padding_128[144];
    struct st_953c68_1 *field_1b8;
    struct st_953c68_1 *field_1c0;
    unsigned int field_1c8;
} st_953c68_2;

typedef struct st_953c68_0 {
    unsigned long long field_0;
    char padding_8[32];
    struct st_953c68_1 *field_28;
    struct st_953c68_1 *field_30;
    unsigned long long field_38;
} st_953c68_0;


st_953c68_1 * sub_953c68(st_953c68_3 *a0)
{
    st_953c68_2 *v4;  // x8
    st_953c68_1 *v5;  // x0
    unsigned long v6;  // x0
    st_953c68_1 *v0;  // [bp-0x40]
    st_953c68_1 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_4f0;
    *(unsigned int *)&v4->field_1b8 = 0;
    v4->field_1c0 = 0;
    v4->field_1c8 = 1000000;
    v0 = 0;
    v1 = 0;
    sub_9d46fc(a0->field_50, 45, 0, &v0);
    v5 = sub_954348(a0->field_4f0->field_120);
    if (!v5)
        return v5;
    while (1)
    {
        v6 = v5->field_8;
        if (*(int *)(v6 + 40) && *(long long *)(v6 + 48) && a0->field_c88 != *(long long *)(v6 + 56))
            (*(long long *)(*(long long *)(v6 + 48) + 8))();
        sub_9aca2c(v6);
        sub_954264(v5);
        v5 = sub_954348(a0->field_4f0->field_120);
        if (!v5)
            return v5;
    }
}
