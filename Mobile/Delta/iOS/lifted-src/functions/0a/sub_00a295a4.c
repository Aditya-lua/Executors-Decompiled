/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa295a4..0xa29a84 (1248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a295a4_0 {
    char padding_0[248];
    struct st_a295a4_1 *field_f8;
} st_a295a4_0;

typedef struct st_a295a4_1 {
    unsigned long long field_0;
} st_a295a4_1;


long long sub_a295a4(st_a295a4_0 **a0, unsigned long a1, unsigned long a2, unsigned long a3, long long a4)
{
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    sub_9de064(a4);
    sub_9de208(a4);
    v0 = sub_9de208(a4);
    v1 = sub_9de208(a4);
    sub_9de208(a4);
    sub_9de208(a4);
    sub_9de208(a4);
    if (!sub_9de208(a4))
    {
        sub_9de17c(a4);
        return 0;
    }
    *a0->field_f8();
}
