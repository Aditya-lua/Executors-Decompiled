/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae8248..0xae82d0 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae8248_0 {
    struct st_ae8248_0 *field_0;
    struct st_ae8248_0 *field_8;
    char padding_10[16];
    struct st_ae8248_1 *field_20;
} st_ae8248_0;

typedef struct st_ae8248_1 {
    unsigned long long field_0;
} st_ae8248_1;


void sub_ae8248(long long a0)
{
    st_ae8248_0 *v3;  // x0
    st_ae8248_0 *v4;  // x19
    long long v5;  // x0
    unsigned long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_ae81b0();
    if (!v3)
        return;
    v4 = v3;
    v5 = sub_af4144(a0);
    v0 = sub_c4c40(v5);
    sub_9c7b68(v5);
    if (!v4->field_8)
        v4->field_20();
    v4->field_8();
}
