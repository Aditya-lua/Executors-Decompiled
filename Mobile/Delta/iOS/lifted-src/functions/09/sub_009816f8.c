/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9816f8..0x9817c0 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9816f8_4 {
    struct st_9816f8_1 *field_0;
    struct st_9816f8_2 *field_8;
} st_9816f8_4;

typedef struct st_9816f8_2 {
    char padding_0[24];
    unsigned long long field_18;
} st_9816f8_2;

typedef struct st_9816f8_1 {
    char padding_0[32];
    unsigned long long field_20;
} st_9816f8_1;

typedef struct st_9816f8_0 {
    char padding_0[24];
    struct st_9816f8_1 *field_18;
    struct st_9816f8_2 *field_20;
} st_9816f8_0;

typedef struct st_9816f8_3 {
    char padding_0[96];
    struct st_9816f8_0 *field_60;
    unsigned long long field_68;
    unsigned long long field_70;
} st_9816f8_3;


st_9816f8_3 * sub_9816f8(st_9816f8_3 *a0)
{
    st_9816f8_0 *v2;  // x20
    st_9816f8_0 *v3;  // x8
    st_9816f8_1 *v4;  // x9
    st_9816f8_4 *v5;  // x8
    st_9816f8_2 *v6;  // x10
    unsigned long long v7;  // x0
    unsigned long v8;  // x21
    unsigned long v9;  // x8
    unsigned long v10;  // x0
    st_9816f8_3 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_60;
    if (!v2)
        return a0;
    while (1)
    {
        v3 = v2;
        v4 = v3->field_18;
        v5 = &v3->field_18;
        a0->field_60 = v4;
        v6 = v2->field_20;
        if (a0->field_68 == v2)
        {
            a0->field_68 = v6;
            if (!v6)
                goto LABEL_981748;
        }
        else if (!v6)
        {
            goto LABEL_981748;
        }
        v6->field_18 = v4;
LABEL_981748:
        if (v4)
            v4->field_20 = v6;
        a0->field_70 = a0->field_70 - 1;
        v5->field_0 = 0;
        v5->field_8 = 0;
        v7 = sub_97725c(v2);
        if (!v7)
            return v7;
        v8 = v7;
        v9 = *(int *)v7;
        if ((unsigned int)v9)
        {
            if (v9 >> 7 & 1)
            {
                v7 = sub_980dc8(v8);
                if (!v7)
                    return v7;
            }
            else
            {
                return v7;
            }
        }
        v10 = *(long long *)(v7 + 64);
        if (*(long long *)(v7 + 64) == v8)
        {
            sub_976fa4(v2);
            v10 = v8;
        }
        v11 = sub_95eea4(v10);
        v2 = a0->field_60;
        if (!a0->field_60)
            return v11;
    }
}
