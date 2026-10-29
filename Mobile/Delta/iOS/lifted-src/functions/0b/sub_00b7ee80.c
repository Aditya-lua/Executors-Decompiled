/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7ee80..0xb7ef8c (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7ee80_1 {
    unsigned long long field_0;
    char padding_8[24];
    struct st_b7ee80_0 *field_20;
} st_b7ee80_1;

typedef struct st_b7ee80_0 {
    char padding_0[8];
    char field_8;
    char padding_9[15];
    long long field_18;
    unsigned long long field_20;
} st_b7ee80_0;


unsigned long long sub_b7ee80(st_b7ee80_1 **a0, long long *a1)
{
    st_b7ee80_1 *v2;  // x19
    unsigned long long v3;  // x0
    st_b7ee80_0 *v4;  // x22
    unsigned long v5;  // x8
    long long v6;  // x21
    unsigned long long i;  // x23
    unsigned long long v8;  // x23
    unsigned long long v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    v3 = sub_b7ee20(v2);
    if (v2->field_0 != 10)
        return v3;
    v4 = v2->field_20;
    /* unsupported instruction */;
    /* unsupported instruction */;
    if (!/* unsupported instruction */)
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ ^ 1)
            goto LABEL_b7ef30;
        v5 = v4->field_20;
        if (v4->field_20)
            goto LABEL_b7eed4;
    }
    else
    {
        /* unsupported instruction */;
LABEL_b7ef30:
        sub_c7573c(&v4->field_8);
        v5 = v4->field_20;
        if (v4->field_20)
        {
LABEL_b7eed4:
            v6 = v4->field_18;
            i = v5 * 8;
            do
            {
                v8 = i;
                sub_b86fc8(*a1, 112, v6);
                v6 += 8;
                i = v8 - 8;
            } while (i);
        }
    }
    v9 = sub_b872e4(*a1, v4 + 1);
    while (1)
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ != 1)
        {
            /* unsupported instruction */;
            return sub_c75418(&v4->field_8);
        }
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (!(/* unsupported instruction */ ^ 1))
            return v9;
    }
}
