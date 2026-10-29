/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9708f8..0x9709b4 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9708f8_0 {
    char padding_0[3024];
    char field_bd0;
    char padding_bd1[31];
    long long field_bf0;
    long long field_bf8;
    long long field_c00;
    long long field_c08;
    long long field_c10;
    long long field_c18;
    long long field_c20;
    long long field_c28;
    long long field_c30;
    long long field_c38;
    unsigned int field_c40;
} st_9708f8_0;


int sub_9708f8(st_9708f8_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9708f8_0 *v8;  // x0
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
        sub_a6c2e4(a0->field_bf0, "ssl/tls_srp.c", 65);
        sub_a6c2e4(a0->field_c38, "ssl/tls_srp.c", 66);
        sub_9e48d4(a0->field_bf8);
        sub_9e48d4(a0->field_c00);
        sub_9e48d4(a0->field_c08);
        sub_9e48d4(a0->field_c10);
        sub_9e48d4(a0->field_c18);
        sub_9e48d4(a0->field_c20);
        sub_9e48d4(a0->field_c28);
        sub_9e48d4(a0->field_c30);
        memset(&a0->field_bd0, 0, 128);
        v8 = 1;
        a0->field_c40 = 0x400;
        a0 = 1;
    }
    return (unsigned int)a0;
}
