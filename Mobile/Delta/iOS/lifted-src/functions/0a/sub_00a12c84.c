/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12c84..0xa13054 (976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a12c84_0 {
    char padding_0[264];
    struct st_a12c84_1 *field_108;
} st_a12c84_0;

typedef struct st_a12c84_1 {
    unsigned long long field_0;
} st_a12c84_1;


long long sub_a12c84(st_a12c84_0 **a0, long long a1, long long *a2, long long *a3, long long a4)
{
    long long v6;  // x19
    long long *v7;  // x25
    long long v16;  // x0
    long long v17;  // x21
    long long *v8;  // x24
    long long v9;  // x21
    long long v11;  // x8
    long long v12;  // x27
    long long v13;  // x23
    long long v14;  // x20
    long long v15;  // x0
    unsigned long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    long long v2;  // [bp-0x70]
    long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a4;
    v7 = a3;
    v8 = a2;
    v9 = a1;
    if (!sub_a1b4f4())
    {
        if (sub_a1b4f4(a0, v7))
        {
            v7 = v8;
        }
        else
        {
            if (v6)
            {
                v11 = 0;
            }
            else
            {
                v11 = sub_9dde10();
                v6 = v11;
                if (!v6)
                    return v11;
            }
            v3 = v11;
            sub_9de064(v6);
            v12 = sub_9de208(v6);
            v13 = sub_9de208(v6);
            v2 = sub_9de208(v6);
            v14 = sub_9de208(v6);
            v1 = sub_9de208(v6);
            v0 = sub_9de208(v6);
            v15 = sub_9de208(v6);
            v16 = sub_9de208(v6);
            if (v16)
            {
                if ((int)v8[5])
                {
                    if (sub_9e4c34(v12, v8[2]) && sub_9e4c34(v13, v8[3]))
                        goto LABEL_a12de8;
                }
                else
                {
                    if (sub_a1b3cc(a0, v8, v12, v13, v6))
                    {
LABEL_a12de8:
                        if (!(int)v7[5])
                        {
                            v2 = v2;
                            if (sub_a1b3cc(a0, v7, v2, v14, v6))
                            {
LABEL_a12e40:
                                if (sub_9e53a8(v12, v2))
                                {
                                    if (sub_9e1bdc(v16, v12, v2) && sub_9e1bdc(v15, v13, v14))
                                        *a0->field_108();
                                }
                                else
                                {
                                    if (!sub_9e53a8(v13, v14) && !sub_9e4828(v2))
                                        *a0->field_108();
                                    v17 = sub_a1b11c(a0, v9) != 0;
                                    sub_9de17c(v6);
                                    sub_9dded4(v3);
                                    return v17;
                                }
                            }
                        }
                        else if (sub_9e4c34(v2, v7[2]) && !(!sub_9e4c34(v14, v7[3])))
                        {
                            goto LABEL_a12e40;
                        }
                    }
                }
            }
            sub_9de17c(v6);
            sub_9dded4(v3);
            return 0;
        }
    }
    return sub_a1a654(v9, v7) != 0;
}
