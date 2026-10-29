/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa29a84..0xa29f5c (1240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a29a84_2 {
    char padding_0[248];
    struct st_a29a84_3 *field_f8;
} st_a29a84_2;

typedef struct st_a29a84_1 {
    char padding_0[24];
    long long field_18;
} st_a29a84_1;

typedef struct st_a29a84_0 {
    char padding_0[32];
    long long field_20;
} st_a29a84_0;

typedef struct st_a29a84_4 {
    struct st_a29a84_2 *field_0;
    char padding_8[56];
    long long field_40;
} st_a29a84_4;

typedef struct st_a29a84_3 {
    unsigned long long field_0;
} st_a29a84_3;


unsigned long long sub_a29a84(st_a29a84_4 *a0, st_a29a84_0 *a1, st_a29a84_0 *a2, st_a29a84_1 *a3, long long a4)
{
    unsigned long long v4;  // x0
    long long v6;  // x0
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!sub_9e4828(a1->field_20))
    {
        if (sub_9e4828(a2->field_20))
        {
            v4 = sub_a1a654(a1, a3);
            if (!(unsigned int)v4)
                return v4;
            return sub_a1b760(a0, a1, a4) != 0;
        }
        else
        {
            sub_9de064(a4);
            v0 = sub_9de208(a4);
            sub_9de208(a4);
            sub_9de208(a4);
            sub_9de208(a4);
            v6 = sub_9de208(a4);
            v1 = sub_9de208(a4);
            if (sub_9de208(a4) && sub_9e6584(v6, a3->field_18, a0->field_40))
                a0->field_0->field_f8();
            sub_9de17c(a4);
            return 0;
        }
    }
}
