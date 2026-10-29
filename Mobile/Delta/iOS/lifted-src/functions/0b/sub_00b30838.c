/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb30838..0xb308a0 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b30838_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
} st_b30838_0;


double sub_b30838(st_b30838_0 *ptr)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_afe028(&ptr->field_8);
    sub_a6c2e4(ptr->field_30, "providers/implementations/kdfs/pkcs12kdf.c", 154);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/pkcs12kdf.c", 155);
    memset(ptr, 0, 80);
    ptr->field_0 = ptr->field_0;
    return 0;
}
