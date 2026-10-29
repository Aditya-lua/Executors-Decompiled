/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2b26c..0xa2b338 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2b26c_1 {
    char padding_0[32];
    struct st_a2b26c_0 *field_20;
} st_a2b26c_1;

typedef struct st_a2b26c_0 {
    char padding_0[80];
    long long field_50;
} st_a2b26c_0;


long long sub_a2b26c(st_a2b26c_1 *a0, unsigned long a1, unsigned long long *a2)
{
    long long v2;  // x0
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6ee78();
    if (!v2)
        return 0;
    v3 = v2;
    if (!sub_a6f460())
    {
        sub_a6eed4(v3);
        sub_a71e38(0);
        return 0;
    }
    if (a0->field_20->field_50 && !sub_a6f460(v3, "priv"))
    {
        sub_a6eed4(v3);
        sub_a71e38(0);
        return 0;
    }
    sub_a6f570(v3);
    a2();
}
