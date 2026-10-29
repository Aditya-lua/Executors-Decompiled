/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa29030..0xa29178 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a29030_2 {
    struct st_a29030_0 *field_0;
    char padding_8[56];
    long long field_40;
    char padding_48[96];
    long long field_a8;
} st_a29030_2;

typedef struct st_a29030_0 {
    char padding_0[248];
    struct st_a29030_1 *field_f8;
} st_a29030_0;

typedef struct st_a29030_1 {
    unsigned long long field_0;
} st_a29030_1;


long long sub_a29030(st_a29030_2 *a0, unsigned long a1, unsigned long a2, long long a3)
{
    long long v2;  // x20
    long long v3;  // x0
    long long v4;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3)
    {
        v2 = 0;
    }
    else
    {
        a3 = sub_9dde48(a0->field_a8);
        v2 = a3;
        if (!v2)
            return 0;
    }
    sub_9de064(a3);
    v3 = sub_9de208(a3);
    if (v3)
    {
        v4 = v3;
        while (sub_9e93c8(v4, a0->field_40, 0, a3))
        {
            if (!sub_9e4828(v4))
                a0->field_0->field_f8();
        }
    }
    sub_9de17c(a3);
    sub_9dded4(v2);
    return 0;
}
