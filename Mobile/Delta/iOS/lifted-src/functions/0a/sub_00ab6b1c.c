/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab6b1c..0xab6b84 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab6b1c_0 {
    char padding_0[152];
    struct st_ab6b1c_1 *field_98;
} st_ab6b1c_0;

typedef struct st_ab6b1c_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[40];
    long long field_38;
    long long field_40;
} st_ab6b1c_1;


void sub_ab6b1c(st_ab6b1c_0 *a0)
{
    long long *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_98;
    if (!v2)
        return;
    sub_9e48d4(v2[1]);
    sub_a6c2e4(v2[7], "crypto/rsa/rsa_pmeth.c", 128);
    sub_a6c2e4(v2[8], "crypto/rsa/rsa_pmeth.c", 129);
    sub_a6c2e4();
    return;
}
