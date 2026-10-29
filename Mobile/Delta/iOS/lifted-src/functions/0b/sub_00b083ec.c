/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb083ec..0xb08460 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b083ec_2 {
    char padding_0[168];
    struct st_b083ec_0 *field_a8;
} st_b083ec_2;

typedef struct st_b083ec_0 {
    char padding_0[32];
    struct st_b083ec_1 *field_20;
} st_b083ec_0;

typedef struct st_b083ec_1 {
    unsigned long long field_0;
} st_b083ec_1;


long long sub_b083ec(st_b083ec_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, long long a5)
{
    unsigned int v2;  // w21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b5ba3c();
    if (a3 && v2)
        a0->field_a8->field_20();
    if (!v2)
    {
        return 0;
    }
    else if (!sub_b0884c(a0, a5))
    {
        return 0;
    }
    else
    {
        return v2;
    }
}
