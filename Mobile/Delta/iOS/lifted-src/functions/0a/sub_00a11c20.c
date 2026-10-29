/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa11c20..0xa11ea0 (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a11c20_0 {
    char padding_0[256];
    struct st_a11c20_1 *field_100;
} st_a11c20_0;

typedef struct st_a11c20_1 {
    unsigned long long field_0;
} st_a11c20_1;

typedef struct st_a11c20_2 {
    struct st_a11c20_0 *field_0;
    char padding_8[64];
    char field_48;
    char padding_49[31];
    long long field_68;
} st_a11c20_2;


long long sub_a11c20(st_a11c20_2 *a0, long long a1, long long a2, unsigned long a3, long long a4)
{
    long long v2;  // x20
    long long v3;  // x24
    long long v4;  // x25
    long long v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a4)
    {
        v2 = 0;
    }
    else
    {
        a4 = sub_9dde10();
        v2 = a4;
        if (!v2)
            return 0;
    }
    sub_9de064(a4);
    sub_9de208(a4);
    v3 = sub_9de208(a4);
    v4 = sub_9de208(a4);
    if (sub_9de208(a4) && sub_9e1d7c(v3, a2, &a0->field_48))
    {
        if (!sub_9e4828(v3))
            a0->field_0->field_100();
        if (!sub_9e35f4(v4, a0->field_68, &a0->field_48, a4))
            goto LABEL_a11e6c;
        v5 = sub_a1b250(a0, a1, v3, v4, a4) != 0;
    }
    else
    {
LABEL_a11e6c:
        v5 = 0;
    }
    sub_9de17c(a4);
    sub_9dded4(v2);
    return v5;
}
