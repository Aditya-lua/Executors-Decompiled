/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97084c..0x9708f8 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97084c_0 {
    char padding_0[832];
    char field_340;
    char padding_341[31];
    long long field_360;
    long long field_368;
    long long field_370;
    long long field_378;
    long long field_380;
    long long field_388;
    long long field_390;
    long long field_398;
    long long field_3a0;
    long long field_3a8;
    unsigned int field_3b0;
} st_97084c_0;


int sub_97084c(st_97084c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_97084c_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        sub_a6c2e4(a0->field_360, "ssl/tls_srp.c", 37);
        sub_a6c2e4(a0->field_3a8, "ssl/tls_srp.c", 38);
        sub_9e48d4(a0->field_368);
        sub_9e48d4(a0->field_370);
        sub_9e48d4(a0->field_378);
        sub_9e48d4(a0->field_380);
        sub_9e48d4(a0->field_388);
        sub_9e48d4(a0->field_390);
        sub_9e48d4(a0->field_398);
        sub_9e48d4(a0->field_3a0);
        memset(&a0->field_340, 0, 128);
        v8 = 1;
        a0->field_3b0 = 0x400;
        a0 = 1;
    }
    return (unsigned int)a0;
}
