/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa29f5c..0xa2a0d4 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a29f5c_1 {
    struct st_a29f5c_2 *field_0;
    char padding_8[56];
    long long field_40;
    char padding_48[96];
    long long field_a8;
} st_a29f5c_1;

typedef struct st_a29f5c_2 {
    char padding_0[280];
    struct st_a29f5c_0 *field_118;
    char padding_120[8];
    struct st_a29f5c_0 *field_128;
} st_a29f5c_2;

typedef struct st_a29f5c_3 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    long long field_20;
    struct st_a29f5c_0 *field_28;
} st_a29f5c_3;

typedef struct st_a29f5c_0 {
    struct st_a29f5c_0 *field_0;
} st_a29f5c_0;


st_a29f5c_0 ** sub_a29f5c(st_a29f5c_1 *a0, st_a29f5c_3 *a1, st_a29f5c_0 **a2, st_a29f5c_0 **a3, st_a29f5c_0 **a4, st_a29f5c_0 **a5)
{
    st_a29f5c_0 **v2;  // x19
    st_a29f5c_0 **v3;  // w23
    st_a29f5c_0 **v4;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a5)
    {
        v2 = 0;
    }
    else
    {
        v2 = sub_9dddcc(a0->field_a8);
        a5 = v2;
        if (!a5)
            return 0;
    }
    if (!a2)
    {
LABEL_a29fec:
        if (a3)
        {
            if (sub_9e5dac(a1->field_18, a3, a0->field_40, a5))
            {
                if (a0->field_0->field_118)
                    a0->field_0->field_118();
                goto LABEL_a2a02c;
            }
        }
        else
        {
LABEL_a2a02c:
            if (!a4)
            {
                sub_9dded4(v2);
                return 1;
            }
            if (sub_9e5dac(a1->field_20, a4, a0->field_40, a5))
            {
                v3 = (st_a29f5c_0 **)(unsigned int)sub_9e5b90(a1->field_20);
                v4 = a0->field_0;
                if (!v4[35])
                {
                    *(unsigned int *)&a1->field_28 = (unsigned int)v3;
                    sub_9dded4(v2);
                    return 1;
                }
                if (v3 && v4[37])
                    v4[37]();
                v4[35]();
            }
        }
    }
    else if (sub_9e5dac(a1->field_10, a2, a0->field_40, a5))
    {
        if (a0->field_0->field_118)
            a0->field_0->field_118();
        goto LABEL_a29fec;
    }
    sub_9dded4(v2);
    return 0;
}
