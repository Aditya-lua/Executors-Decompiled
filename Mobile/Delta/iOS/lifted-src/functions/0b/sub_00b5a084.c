/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5a084..0xb5a0ec (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5a084_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
} st_b5a084_0;


double sub_b5a084(st_b5a084_0 *ptr)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_afe028(&ptr->field_8);
    sub_a6c2e4(ptr->field_30, "providers/implementations/kdfs/pbkdf1.c", 114);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/pbkdf1.c", 115);
    memset(ptr, 0, 72);
    ptr->field_0 = ptr->field_0;
    return 0;
}
