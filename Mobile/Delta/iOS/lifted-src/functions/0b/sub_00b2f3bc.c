/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2f3bc..0xb2f420 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2f3bc_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
} st_b2f3bc_0;


double sub_b2f3bc(st_b2f3bc_0 *ptr)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_afdddc(&ptr->field_8);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/krb5kdf.c", 89);
    sub_a6c4e8(ptr->field_30, ptr->field_38, "providers/implementations/kdfs/krb5kdf.c", 90);
    memset(ptr, 0, 64);
    ptr->field_0 = ptr->field_0;
    return 0;
}
