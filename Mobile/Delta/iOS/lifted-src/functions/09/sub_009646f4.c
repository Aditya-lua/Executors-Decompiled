/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9646f4..0x9647c8 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9646f4_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_9646f4_0;

typedef struct st_9646f4_1 {
    struct st_9646f4_0 *field_0;
    char padding_8[24];
    struct st_9646f4_2 *field_20;
} st_9646f4_1;

typedef struct st_9646f4_2 {
    unsigned long long field_0;
} st_9646f4_2;


unsigned long long sub_9646f4(st_9646f4_1 *a0, long long a1)
{
    unsigned long long v3;  // x9
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    st_9646f4_0 *v6;  // x8
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_959f90(a1, &v0))
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_rsa.c", 138, "ssl_set_pkey");
        sub_a36abc(20, 247, 0);
        return 0;
    }
    v3 = 40 * v0;
    if (*(long long *)((char *)a0->field_20 + v3))
    {
        v4 = sub_af1ea4(*(long long *)((char *)a0->field_20 + v3), a1);
        if (!(unsigned int)v4)
            return v4;
    }
    v5 = sub_a5bba8(a1);
    if (!(unsigned int)v5)
        return v5;
    sub_a5a4c8(*(long long *)&a0->field_20[1 + 5 * v0]);
    v6 = &a0->field_20[5 * v0];
    v6->field_8 = a1;
    a0->field_0 = v6;
    return 1;
}
