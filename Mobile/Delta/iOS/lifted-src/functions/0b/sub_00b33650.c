/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb33650..0xb336c0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b33650_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    long long field_20;
    long long field_28;
    long long field_30;
} st_b33650_0;


double sub_b33650(st_b33650_0 *ptr)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a57f0c(ptr->field_8);
    sub_a57f0c(ptr->field_10);
    sub_a6c4e8(ptr->field_18, ptr->field_20, "providers/implementations/kdfs/tls1_prf.c", 144);
    sub_a6c4e8(ptr->field_28, ptr->field_30, "providers/implementations/kdfs/tls1_prf.c", 145);
    memset(ptr, 0, 56);
    ptr->field_0 = ptr->field_0;
    return 0;
}
