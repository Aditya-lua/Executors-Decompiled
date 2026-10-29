/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb33ff0..0xb340b8 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b33ff0_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    long long field_60;
    long long field_68;
    long long field_70;
    long long field_78;
    char padding_80[24];
    unsigned int field_98;
} st_b33ff0_0;


double sub_b33ff0(st_b33ff0_0 *ptr)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_afe028(&ptr->field_8);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/x942kdf.c", 356);
    sub_a6c4e8(ptr->field_30, ptr->field_38, "providers/implementations/kdfs/x942kdf.c", 357);
    sub_a6c4e8(ptr->field_40, ptr->field_60, "providers/implementations/kdfs/x942kdf.c", 358);
    sub_a6c4e8(ptr->field_48, ptr->field_68, "providers/implementations/kdfs/x942kdf.c", 359);
    sub_a6c4e8(ptr->field_50, ptr->field_70, "providers/implementations/kdfs/x942kdf.c", 360);
    sub_a6c4e8(ptr->field_58, ptr->field_78, "providers/implementations/kdfs/x942kdf.c", 361);
    memset(ptr, 0, 160);
    ptr->field_0 = ptr->field_0;
    ptr->field_98 = 1;
    return 0;
}
