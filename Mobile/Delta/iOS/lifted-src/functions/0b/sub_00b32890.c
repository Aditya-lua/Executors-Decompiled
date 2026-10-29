/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb32890..0xb32914 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b32890_0 {
    unsigned long long field_0;
    long long field_8;
    char field_10;
    char padding_11[23];
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
} st_b32890_0;


double sub_b32890(st_b32890_0 *ptr)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a57f0c(ptr->field_8);
    sub_afe028(&ptr->field_10);
    sub_a6c4e8(ptr->field_28, ptr->field_30, "providers/implementations/kdfs/sskdf.c", 330);
    sub_a6c4e8(ptr->field_38, ptr->field_40, "providers/implementations/kdfs/sskdf.c", 331);
    sub_a6c4e8(ptr->field_48, ptr->field_50, "providers/implementations/kdfs/sskdf.c", 332);
    memset(ptr, 0, 104);
    ptr->field_0 = ptr->field_0;
    return 0;
}
