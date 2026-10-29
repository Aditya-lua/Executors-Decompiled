/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96ee98..0x96ef34 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96ee98_0 {
    char padding_0[8];
    struct st_96ee98_1 *field_8;
} st_96ee98_0;

typedef struct st_96ee98_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_96ee98_1;


unsigned long long sub_96ee98(st_96ee98_0 *a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long long v3;  // x0
    long long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    *(unsigned int *)&v0 = 0;
    v3 = sub_96eae0(a0->field_8->field_0, a0->field_8->field_470, a1, a2, "finished", 8, 0, 0, a3, a4, v0);
    if ((unsigned int)v3)
        return v3;
    sub_a368c8();
    sub_a369bc("ssl/tls13_enc.c", 113, "tls13_hkdf_expand");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return v3;
}
