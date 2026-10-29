/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa28134..0xa28530 (1020 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a28134_2 {
    struct st_a28134_0 *field_0;
    char padding_8[104];
    long long field_70;
    char padding_78[48];
    long long field_a8;
} st_a28134_2;

typedef struct st_a28134_0 {
    char padding_0[248];
    unsigned long long field_f8;
    struct st_a28134_1 *field_100;
} st_a28134_0;

typedef struct st_a28134_3 {
    char padding_0[40];
    long long field_28;
} st_a28134_3;

typedef struct st_a28134_1 {
    unsigned long long field_0;
} st_a28134_1;


long long sub_a28134(st_a28134_2 *a0, long long *a1, st_a28134_3 *a2, long long a3)
{
    long long v4;  // x19
    unsigned long long *v5;  // x26
    long long v6;  // x20
    long long v7;  // x0
    long long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a3;
    if (sub_a1b4f4())
    {
        sub_9e5b4c(a1[4]);
        *(unsigned int *)&a1[5] = 0;
        return 1;
    }
    v5 = a0->field_0->field_100;
    if (v4)
    {
        v6 = 0;
    }
    else
    {
        v4 = sub_9dddcc(a0->field_a8);
        v6 = v4;
        if (!v6)
            return v4;
    }
    v1 = a0->field_0->field_f8;
    sub_9de064(v4);
    sub_9de208(v4);
    sub_9de208(v4);
    sub_9de208(v4);
    v7 = sub_9de208(v4);
    if (!v7)
    {
        sub_9de17c(v4);
        sub_9dded4(v6);
        return 0;
    }
    v0 = v7;
    if ((int)a2->field_28)
    {
        v5();
    }
    else if ((int)a0->field_70)
    {
        v5();
    }
    else
    {
        v5();
    }
}
