/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9828cc..0x982994 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9828cc_1 {
    char field_0[21];
    unsigned long long field_d;
} st_9828cc_1;

typedef struct st_9828cc_0 {
    unsigned long long field_0;
    char field_8[21];
    unsigned long long field_15;
    char field_1d[21];
    unsigned long long field_2a;
    char padding_32[6];
    long long field_38;
    long long field_40;
    char field_48;
} st_9828cc_0;


long long sub_9828cc(long long a0, st_9828cc_1 *a1, st_9828cc_1 *a2, st_9828cc_0 *a3, char a4)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a3->padding_32[0] = a4;
    a3->field_0 = sub_a7c2c0();
    a3->field_2a = 0;
    v2 = *(long long *)&a1->field_0[13];
    *(int128_t *)&a3->field_8[0] = *(int128_t *)&a1->field_0[0];
    *(unsigned long long *)&a3->field_8[13] = v2;
    v3 = *(long long *)&a2->field_0[13];
    *(int128_t *)&(a3->field_8)[1] = *(int128_t *)&a2->field_0[0];
    *(unsigned long long *)&a3->field_1d[2] = v3;
    if (sub_9d35bc(a0, 0, &a3->field_1d[16]) && *(long long *)&a3->field_1d[16])
    {
        v4 = sub_a6bf4c(*(long long *)&a3->field_1d[16], "ssl/quic/quic_port.c", 880);
        a3->field_2a = v4;
        if (v4 && sub_9d35bc(a0, v4, &a3->field_1d[16]))
            return 1;
    }
    sub_a6c2e4(a3->field_2a, "ssl/quic/quic_port.c", 854);
    return 0;
}
