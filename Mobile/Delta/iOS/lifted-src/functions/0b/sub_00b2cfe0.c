/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2cfe0..0xb2d090 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2cfe0_0 {
    unsigned long long field_0;
    char padding_8[8];
    char field_10;
    char padding_11[23];
    long long field_28;
    char padding_30[8];
    long long field_38;
    long long field_40;
    long long field_48;
    char padding_50[8];
    long long field_58;
    char padding_60[8];
    long long field_68;
    long long field_70;
    long long field_78;
    long long field_80;
} st_b2cfe0_0;


double sub_b2cfe0(st_b2cfe0_0 *ptr)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_afe028(&ptr->field_10);
    sub_a6c2e4(ptr->field_28, "providers/implementations/kdfs/hkdf.c", 134);
    sub_a6c2e4(ptr->field_48, "providers/implementations/kdfs/hkdf.c", 0x88);
    sub_a6c2e4(ptr->field_58, "providers/implementations/kdfs/hkdf.c", 137);
    sub_a6c4e8(ptr->field_68, ptr->field_70, "providers/implementations/kdfs/hkdf.c", 138);
    sub_a6c4e8(ptr->field_38, ptr->field_40, "providers/implementations/kdfs/hkdf.c", 139);
    sub_a6c4e8(ptr->field_78, ptr->field_80, "providers/implementations/kdfs/hkdf.c", 140);
    memset(ptr, 0, 0x88);
    ptr->field_0 = ptr->field_0;
    return 0;
}
