/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962408..0x9625a4 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962408_1 {
    int field_0;
    char padding_4[212];
    struct st_962408_0 *field_d8;
} st_962408_1;

typedef struct st_962408_4 {
    char padding_0[24];
    struct st_962408_1 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[2180];
    long long field_900;
    char padding_908[72];
    char field_950;
    char padding_951[96];
    char field_9b1;
    char padding_9b2[1];
    char field_9b3;
    char padding_9b4[468];
    struct st_962408_2 *field_b88;
} st_962408_4;

typedef struct st_962408_0 {
    char padding_0[80];
    char field_50;
} st_962408_0;

typedef struct st_962408_3 {
    unsigned long long field_0;
} st_962408_3;

typedef struct st_962408_2 {
    unsigned int field_0;
    char padding_4[76];
    unsigned int field_50;
    char padding_54[12];
    struct st_962408_3 *field_60;
} st_962408_2;


st_962408_4 * sub_962408(st_962408_4 *a0, unsigned long long a1)
{
    unsigned long v2;  // x8
    st_962408_2 *v3;  // x9
    unsigned long v4;  // x20
    st_962408_4 *v5;  // x0
    unsigned long long v6;  // x1
    unsigned long long v7;  // x21
    st_962408_4 *v8;  // x22
    unsigned long long v9;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_900;
    if (!*(long long *)(v2 + 592))
        return a0;
    if (*(int *)(v2 + 688))
        return a0;
    if (a0->field_78 && !*(long long *)(v2 + 632) && a0->field_950 & 1)
        return a0;
    v3 = a0->field_b88;
    v4 = v3->field_50;
    v5 = a0;
    v6 = a1;
    if ((unsigned int)v4 & (unsigned int)v6 && (!*(int *)&a0->padding_7c[1164] || (v5 = a0, v6 = a1, !(v5->field_18->field_d8->field_50 >> 3 & 1) && !(v5 = a0, v6 = a1, v5->field_18->field_0 < 772 || (v5 = a0, v6 = a1, v5->field_18->field_0 == 0x10000)))))
    {
        v7 = a1;
        v8 = a0;
        v6 = a1;
        if (!(v4 >> 9 & 1) && (a0->field_18->field_d8->field_50 >> 3 & 1 || !a0->field_78 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000 || *(int *)&a0[1].padding_951[95] && !(a0->field_9b3 & 1) || *(long long *)&v3[1].field_0 || (v6 = a1, a0->field_9b1 >> 6 & 1)))
        {
            sub_96657c(v3, v2);
            v3 = v8->field_b88;
            a0 = v8;
            v6 = v7;
        }
        v5 = a0;
        if (v3->field_60)
        {
            v5 = v8;
            v6 = v7;
            if (sub_965b2c(a0->field_900))
                v5->field_b88->field_60();
        }
    }
    if (v4 >> 7 & 1)
        return v5;
    if (((unsigned int)v4 & (unsigned int)a1) != (unsigned int)v6)
        return v5;
    v9 = 128;
    if (!(v6 & 1))
        v9 = 140;
    if (~(char)*(int *)((char *)v5->field_b88 + v9))
        return v5;
    _time(0);
}
