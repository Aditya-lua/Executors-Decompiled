/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7f1a4..0xb7f288 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7f1a4_0 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_b7f1a4_0;


unsigned long long sub_b7f1a4(st_b7f1a4_0 **a0, long long *a1)
{
    st_b7f1a4_0 *v2;  // x19
    unsigned long long v3;  // x0
    unsigned long v4;  // x8
    unsigned long v5;  // x8
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    v3 = sub_b7f144(v2);
    if (v2->field_0 != 10)
        return v3;
    sub_b942a8(*a1, v2->field_10, v2->field_10 + v2->field_18 * 16);
    v4 = v2->field_20;
    /* unsupported instruction */;
    /* unsupported instruction */;
    if (!/* unsupported instruction */)
    {
        /* unsupported instruction */;
        v5 = v4;
        if (!(/* unsupported instruction */ ^ 1))
            goto LABEL_b7f1fc;
    }
    else
    {
        /* unsupported instruction */;
    }
    v5 = v4;
    sub_c7573c(v4 + 8);
LABEL_b7f1fc:
    v6 = sub_b88bd4(*a1, v5 + 40);
    while (1)
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ != 1)
        {
            /* unsupported instruction */;
            return sub_c75418(v4 + 8);
        }
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (!(/* unsupported instruction */ ^ 1))
            return v6;
    }
}
