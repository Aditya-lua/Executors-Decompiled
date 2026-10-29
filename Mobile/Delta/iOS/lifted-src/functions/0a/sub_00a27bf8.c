/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa27bf8..0xa28134 (1340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a27bf8_2 {
    struct st_a27bf8_0 *field_0;
    char padding_8[56];
    unsigned long long field_40;
    char padding_48[96];
    long long field_a8;
} st_a27bf8_2;

typedef struct st_a27bf8_0 {
    char padding_0[248];
    struct st_a27bf8_1 *field_f8;
    struct st_a27bf8_1 *field_100;
} st_a27bf8_0;

typedef struct st_a27bf8_1 {
    unsigned long long field_0;
} st_a27bf8_1;


long long sub_a27bf8(st_a27bf8_2 *a0, long long *a1, long long *a2, long long *a3, long long a4)
{
    long long v9;  // x19
    unsigned long long *v10;  // x23
    long long v11;  // x20
    long long v12;  // x24
    long long v13;  // x0
    long long v14;  // x27
    unsigned long v15;  // x25
    long long v16;  // x21
    unsigned long v17;  // x25
    long long v18;  // x1
    unsigned long long *v0;  // [bp-0x98]
    unsigned long v1;  // [bp-0x90]
    long long v2;  // [bp-0x88]
    long long v3;  // [bp-0x80]
    long long v4;  // [bp-0x78]
    long long v5;  // [bp-0x70]
    long long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a4;
    if (a2 == a3)
    {
        return sub_a1b690();
    }
    else if (!sub_a1b4f4(a0, a2) && !sub_a1b4f4(a0, a3))
    {
        v10 = a0->field_0->field_100;
        if (v9)
        {
            v11 = 0;
        }
        else
        {
            v9 = sub_9dddcc(a0->field_a8);
            v11 = v9;
            if (!v11)
                return 0;
        }
        v1 = a0->field_40;
        sub_9de064(v9);
        v12 = sub_9de208(v9);
        v6 = sub_9de208(v9);
        v5 = sub_9de208(v9);
        v4 = sub_9de208(v9);
        v3 = sub_9de208(v9);
        v2 = sub_9de208(v9);
        v13 = sub_9de208(v9);
        if (v13)
        {
            v14 = v13;
            if (!(int)a3[5])
                v10();
            if (sub_9e4c34(v6, a2[2]) && sub_9e4c34(v5, a2[3]))
            {
                if (!(int)a2[5])
                    v10();
                if (sub_9e4c34(v4, a3[2]) && sub_9e4c34(v3, a3[3]) && (v0 = a0->field_0->field_f8, v15 = v1, sub_9e6378(v2, v6, v4, v15) && sub_9e6378(v14, v5, v3, v15)))
                {
                    if (sub_9e4828(v2))
                    {
                        if (sub_9e4828(v14))
                        {
                            sub_9de17c(v9);
                            v16 = sub_a1b690(a0, a1, a2, v9);
                            sub_9de17c(0);
                            sub_9dded4(v11);
                            return v16;
                        }
                        sub_9e5b4c(a1[4]);
                        *(unsigned int *)&a1[5] = 0;
                        sub_9de17c(v9);
                        sub_9dded4(v11);
                        return 1;
                    }
                    v17 = v1;
                    if (sub_9e6104(v6, v6, v4, v17) && sub_9e6104(v5, v5, v3, v17))
                    {
                        if ((int)a2[5])
                        {
                            if (!(int)a3[5])
                            {
                                v18 = a3[4];
LABEL_a27f7c:
                                if (sub_9e4c34(v12, v18))
                                    v0();
                            }
                            else if (sub_9e4c34(a1[4], v2))
                            {
                                *(unsigned int *)&a1[5] = 0;
                                v10();
                            }
                        }
                        else
                        {
                            if ((int)a3[5])
                            {
                                v18 = a2[4];
                                goto LABEL_a27f7c;
                            }
                            else
                            {
                                v0();
                            }
                        }
                    }
                }
            }
        }
        sub_9de17c(v9);
        sub_9dded4(v11);
        return 0;
    }
}
