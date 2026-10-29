/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa28be4..0xa29030 (1100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a28be4_4 {
    struct st_a28be4_3 *field_0;
    struct st_a28be4_3 *field_8;
} st_a28be4_4;

typedef struct st_a28be4_2 {
    struct st_a28be4_0 *field_0;
    char padding_8[160];
    long long field_a8;
} st_a28be4_2;

typedef struct st_a28be4_0 {
    char padding_0[248];
    struct st_a28be4_1 *field_f8;
    char padding_100[16];
    struct st_a28be4_1 *field_110;
    char padding_118[16];
    char *field_128;
} st_a28be4_0;

typedef struct st_a28be4_3 {
    char padding_0[32];
    long long field_20;
} st_a28be4_3;

typedef struct st_a28be4_1 {
    unsigned long long field_0;
} st_a28be4_1;


char * sub_a28be4(st_a28be4_2 *a0, char *a1, st_a28be4_4 *a2, char *a3)
{
    char *v4;  // x21
    unsigned long long v5;  // x0
    char *v6;  // x26
    char *v7;  // x22
    char *v8;  // x25
    char *v9;  // x0
    unsigned long long *v10;  // x28
    st_a28be4_3 **v11;  // x27
    char *v12;  // x25
    char *v13;  // x20
    char *v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a1)
        return 1;
    if (a3)
    {
        v4 = 0;
    }
    else
    {
        a3 = sub_9dddcc(a0->field_a8);
        v4 = a3;
        if (!v4)
            return 0;
    }
    sub_9de064(a3);
    v5 = sub_9de208(a3);
    v6 = sub_9de208(a3);
    if (v6)
    {
        v7 = sub_a6bf4c(a1 * 8, "crypto/ec/ecp_smpl.c", 1229);
        if (v7)
        {
            v1 = v5;
            v8 = 0;
            while (1)
            {
                v9 = sub_9e4958();
                *(char **)(v7 + 0x8 * v8) = v9;
                if (!v9)
                    break;
                v8 += 1;
                if (a1 == v8)
                {
                    if (sub_9e4828(a2->field_0->field_20))
                    {
                        if (a0->field_0->field_128)
                            a0->field_0->field_128();
                        if (!sub_9e4d58(*(long long *)v7, 1))
                            break;
                    }
                    else if (!sub_9e4c34(*(long long *)v7, a2->field_0->field_20))
                    {
                        break;
                    }
                    v0 = a1 - 1;
                    if (a1 != 1)
                    {
                        v10 = v7 + 8;
                        v11 = &a2->field_8;
                        do
                        {
                            v12 = v0;
                            if (!sub_9e4828(*v11->field_20))
                                a0->field_0->field_f8();
                            if (!sub_9e4c34(*v10, *(long long *)((char *)v10 - 8)))
                                goto LABEL_a28eb0;
                        } while ((v10 += 1, v11 += 1, v0 = v12 - 1, v12 != 1));
                    }
                    a0->field_0->field_110();
                }
            }
        }
LABEL_a28eb0:
        v6 = 0;
    }
    else
    {
        v7 = 0;
    }
    sub_9de17c(a3);
    sub_9dded4(v4);
    if (!v7)
        return v6;
    v13 = 0;
    do
    {
    } while (*(long long *)(v7 + 0x8 * v13) && (sub_9e4838(*(long long *)(v7 + 0x8 * v13)), v13 += 1, a1 != v13));
    sub_a6c2e4(v7, "crypto/ec/ecp_smpl.c", 1357);
    return v6;
}
