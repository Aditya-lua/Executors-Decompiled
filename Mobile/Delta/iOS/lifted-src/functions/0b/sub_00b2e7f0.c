/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2e7f0..0xb2e89c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2e7f0_0 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    char padding_60[8];
    unsigned int field_68;
} st_b2e7f0_0;


double sub_b2e7f0(st_b2e7f0_0 *ptr)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a57f0c(ptr->field_10);
    sub_a6c4e8(ptr->field_40, ptr->field_48, "providers/implementations/kdfs/kbkdf.c", 147);
    sub_a6c4e8(ptr->field_30, ptr->field_38, "providers/implementations/kdfs/kbkdf.c", 148);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/kbkdf.c", 149);
    sub_a6c4e8(ptr->field_50, ptr->field_58, "providers/implementations/kdfs/kbkdf.c", 150);
    memset(ptr, 0, 112);
    ptr->field_0 = ptr->field_0;
    ptr->field_18 = 32;
    ptr->field_68 = 1;
    *(double *)ptr->padding_60 = 5e-324;
    return 5e-324;
}
