/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a4670..0x9a471c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a4670_1 {
    int field_0;
    char padding_4[212];
    struct st_9a4670_0 *field_d8;
} st_9a4670_1;

typedef struct st_9a4670_2 {
    char padding_0[24];
    struct st_9a4670_1 *field_18;
    char padding_20[40];
    int field_48;
} st_9a4670_2;

typedef struct st_9a4670_0 {
    char padding_0[80];
    char field_50;
} st_9a4670_0;


char sub_9a4670(st_9a4670_2 *a0, long long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
    {
        v2 = 1918;
        if (a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
        {
            if (sub_c68d5c(a1, 43, 2) && sub_c6876c(a1, 2) && sub_c68d5c(a1, a0->field_48, 2) && sub_a6e970(a1))
                return 1;
            v2 = 1926;
        }
    }
    else
    {
        v2 = 1918;
    }
    sub_c652f4(v2, a0);
    return 0;
}
