/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb32040..0xb320bc (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b32040_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    char padding_40[8];
    long long field_48;
    long long field_50;
} st_b32040_0;


double sub_b32040(st_b32040_0 *ptr)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_afe028(&ptr->field_8);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/sshkdf.c", 86);
    sub_a6c4e8(ptr->field_30, ptr->field_38, "providers/implementations/kdfs/sshkdf.c", 87);
    sub_a6c4e8(ptr->field_48, ptr->field_50, "providers/implementations/kdfs/sshkdf.c", 88);
    memset(ptr, 0, 88);
    ptr->field_0 = ptr->field_0;
    return 0;
}
