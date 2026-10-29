/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95dd44..0x95de6c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95dd44_0 {
    unsigned int field_0;
    char padding_4[2172];
    struct st_95dd44_1 *field_880;
} st_95dd44_0;

typedef struct st_95dd44_2 {
    char padding_0[344];
    struct st_95dd44_1 *field_158;
} st_95dd44_2;

typedef struct st_95dd44_3 {
    char padding_0[24];
    struct st_95dd44_2 *field_18;
    struct st_95dd44_0 *field_20;
} st_95dd44_3;

typedef struct st_95dd44_1 {
    unsigned long long field_0;
} st_95dd44_1;


unsigned long long sub_95dd44(st_95dd44_3 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4)
{
    st_95dd44_2 *v2;  // x9
    unsigned long long *v3;  // x23
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    st_95dd44_0 *v4;  // x0
    unsigned long v5;  // x9
    st_95dd44_0 *v6;  // x0
    unsigned long long v7;  // x21
    unsigned long long v8;  // x22
    unsigned long long v9;  // x24
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    if (v2)
    {
        v3 = v2->field_158;
LABEL_95dd70:
        v7 = *(long long *)&v2->padding_0[0];
        v8 = *(long long *)&v2[3].padding_0[80];
    }
    else
    {
        v4 = a0->field_20;
        if (!v4)
            return 1;
        v5 = v4->field_0;
        if ((unsigned int)v5)
        {
            if (!(v5 >> 7 & 1))
                return 0;
            v4 = sub_980dc8();
            if (!v4)
                return v4;
            v6 = a0->field_20;
        }
        else
        {
            v6 = v4;
        }
        v2 = *(long long *)&v6->padding_4[4];
        v3 = v4->field_880;
        if (*(long long *)&v6->padding_4[4])
            goto LABEL_95dd70;
        v7 = 0;
        v8 = 0;
    }
    if (!a4)
        v9 = 112;
    else
        v9 = 120;
    if (!*(long long *)((char *)v3 + v9))
    {
        v10 = sub_af27d8(0);
        *(unsigned long long *)((char *)v3 + v9) = v10;
        if (!v10)
            return v10;
    }
    if (a1)
    {
        v11 = sub_af252c();
        if (!(unsigned int)v11)
            return v11;
    }
    if (a2)
    {
        v12 = sub_af25a0(*(long long *)((char *)v3 + v9), a2);
        if (!(unsigned int)v12)
            return v12;
    }
    if (!a3)
        return 1;
    v13 = sub_af25fc(*(long long *)((char *)v3 + v9), a3, v7, v8);
    if (!(unsigned int)v13)
        return v13;
    return 1;
}
