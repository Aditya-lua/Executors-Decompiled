/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa130ec..0xa13254 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a130ec_1 {
    char padding_0[248];
    struct st_a130ec_2 *field_f8;
} st_a130ec_1;

typedef struct st_a130ec_0 {
    char padding_0[40];
    long long field_28;
} st_a130ec_0;

typedef struct st_a130ec_2 {
    unsigned long long field_0;
} st_a130ec_2;


unsigned long long sub_a130ec(st_a130ec_1 **a0, st_a130ec_0 *a1, long long a2)
{
    long long v2;  // x19
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    if (sub_a1b4f4())
    {
        return 1;
    }
    else if ((int)a1->field_28)
    {
        if (v2)
        {
            v3 = 0;
        }
        else
        {
            v2 = sub_9dde10();
            v3 = v2;
            if (!v3)
                return 0xffffffff;
        }
        sub_9de064(v2);
        sub_9de208(v2);
        if (sub_9de208(v2) && sub_9e1bdc())
            *a0->field_f8();
        sub_9de17c(v2);
        sub_9dded4(v3);
        return 0xffffffff;
    }
    else
    {
        return 0xffffffff;
    }
}
