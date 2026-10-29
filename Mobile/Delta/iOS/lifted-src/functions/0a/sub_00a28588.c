/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa28588..0xa28820 (664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a28588_2 {
    struct st_a28588_0 *field_0;
    char padding_8[160];
    long long field_a8;
} st_a28588_2;

typedef struct st_a28588_0 {
    char padding_0[256];
    struct st_a28588_1 *field_100;
} st_a28588_0;

typedef struct st_a28588_1 {
    unsigned long long field_0;
} st_a28588_1;


unsigned long long sub_a28588(st_a28588_2 *a0, unsigned long a1, long long a2)
{
    long long v3;  // x19
    long long v4;  // x20
    long long v5;  // x0
    long long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a2;
    if (sub_a1b4f4())
        return 1;
    if (v3)
    {
        v4 = 0;
    }
    else
    {
        v3 = sub_9dddcc(a0->field_a8);
        v4 = v3;
        if (!v4)
            return 0xffffffff;
    }
    sub_9de064(v3);
    sub_9de208(v3);
    sub_9de208(v3);
    sub_9de208(v3);
    v5 = sub_9de208(v3);
    if (!v5)
    {
        sub_9de17c(v3);
        sub_9dded4(v4);
        return 0xffffffff;
    }
    v0 = v5;
    a0->field_0->field_100();
}
